package com.yandex.div.core;

import android.net.Uri;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.actions.DivActionTypedHandlerProxy;
import com.yandex.div.core.downloader.DivDownloadActionHandler;
import com.yandex.div.core.expression.storedvalues.StoredValuesActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewLocator;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.items.DivItemChangeActionHandler;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import xsna.apn;
import xsna.t33;

/* loaded from: classes7.dex */
public class DivActionHandler {
    @Nullable
    private static ExpressionResolver findExpressionResolverById(Div2View div2View, @Nullable String str) {
        BindingContext bindingContext;
        if (str == null) {
            return null;
        }
        KeyEvent.Callback findSingleViewWithTag = ViewLocator.findSingleViewWithTag(div2View, str);
        if (!(findSingleViewWithTag instanceof DivHolderView) || (bindingContext = ((DivHolderView) findSingleViewWithTag).getBindingContext()) == null) {
            return null;
        }
        return bindingContext.getExpressionResolver();
    }

    private boolean handleActionInternal(@Nullable String str, @Nullable Uri uri, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        Div2View div2View;
        String authority = uri.getAuthority();
        if ("set_state".equals(authority)) {
            String queryParameter = uri.getQueryParameter("state_id");
            if (queryParameter == null) {
                Assert.fail("state_id param is required");
                return false;
            }
            try {
                divViewFacade.switchToState(DivStatePath.parse(queryParameter), uri.getBooleanQueryParameter("temporary", true));
                return true;
            } catch (PathFormatException e) {
                Assert.fail("Invalid format of ".concat(queryParameter), e);
                return false;
            }
        }
        if ("show_tooltip".equals(authority)) {
            String queryParameter2 = uri.getQueryParameter("id");
            if (queryParameter2 == null) {
                Assert.fail("id param is required");
                return false;
            }
            divViewFacade.showTooltip(queryParameter2, uri.getBooleanQueryParameter("multiple", false));
            return true;
        }
        if ("hide_tooltip".equals(authority)) {
            String queryParameter3 = uri.getQueryParameter("id");
            if (queryParameter3 == null) {
                Assert.fail("id param is required");
                return false;
            }
            divViewFacade.hideTooltip(queryParameter3);
            return true;
        }
        if ("set_variable".equals(authority)) {
            String queryParameter4 = uri.getQueryParameter("name");
            if (queryParameter4 == null) {
                Assert.fail("name param is required");
                return false;
            }
            String queryParameter5 = uri.getQueryParameter("value");
            if (queryParameter5 == null) {
                Assert.fail("value param unspecified for ".concat(queryParameter4));
                return false;
            }
            div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            if (div2View == null) {
                StringBuilder a = t33.a("Variable '", queryParameter4, "' mutation failed! View(");
                a.append(divViewFacade.getClass().getSimpleName());
                a.append(") not supports variables!");
                Assert.fail(a.toString());
                return false;
            }
            try {
                VariableMutationHandler.setVariable(div2View, queryParameter4, queryParameter5, expressionResolver);
                return true;
            } catch (VariableMutationException e2) {
                StringBuilder a2 = t33.a("Variable '", queryParameter4, "' mutation failed: ");
                a2.append(e2.getMessage());
                Assert.fail(a2.toString(), e2);
                return false;
            }
        }
        if ("timer".equals(authority)) {
            String queryParameter6 = uri.getQueryParameter("id");
            if (queryParameter6 == null) {
                Assert.fail("id param is required");
                return false;
            }
            String queryParameter7 = uri.getQueryParameter("action");
            if (queryParameter7 == null) {
                Assert.fail("action param is required");
                return false;
            }
            div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            if (div2View != null) {
                div2View.applyTimerCommand(queryParameter6, queryParameter7);
                return true;
            }
            StringBuilder a3 = t33.a("Timer '", queryParameter6, "' state changing failed! View(");
            a3.append(divViewFacade.getClass().getSimpleName());
            a3.append(") not supports timers!");
            Assert.fail(a3.toString());
            return false;
        }
        if (!"video".equals(authority)) {
            if (DivItemChangeActionHandler.canHandle(authority)) {
                return DivItemChangeActionHandler.handleAction(uri, divViewFacade, expressionResolver);
            }
            if (StoredValuesActionHandler.canHandle(authority)) {
                return StoredValuesActionHandler.handleAction(uri, divViewFacade);
            }
            return false;
        }
        div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
        if (div2View == null) {
            Assert.fail("Handler view is not instance of Div2View");
            return false;
        }
        String queryParameter8 = uri.getQueryParameter("id");
        if (queryParameter8 == null) {
            Assert.fail("Video action has no id param");
            return false;
        }
        String queryParameter9 = uri.getQueryParameter("action");
        if (queryParameter9 != null) {
            return div2View.applyVideoCommand(queryParameter8, queryParameter9, expressionResolver);
        }
        Assert.fail("Video action has no action param");
        return false;
    }

    public boolean getUseActionUid() {
        return false;
    }

    public boolean handleAction(@NonNull DivAction divAction, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        Div2View div2View = (Div2View) divViewFacade;
        ExpressionResolver findExpressionResolverById = findExpressionResolverById(div2View, divAction.h);
        if (findExpressionResolverById == null) {
            findExpressionResolverById = expressionResolver;
        }
        if (DivActionTypedHandlerProxy.handleAction(divAction, divViewFacade, findExpressionResolverById)) {
            return true;
        }
        Expression<Uri> expression = divAction.k;
        Uri evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        return DivDownloadActionHandler.canHandle(evaluate, divViewFacade) ? DivDownloadActionHandler.handleAction(divAction, div2View, findExpressionResolverById) : handleAction(divAction.h, evaluate, divViewFacade, findExpressionResolverById);
    }

    public boolean handleActionWithReason(@NonNull DivAction divAction, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(divAction, divViewFacade, expressionResolver);
    }

    public boolean handleActionWithReason(@NonNull DivAction divAction, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str, @NonNull String str2) {
        return handleAction(divAction, divViewFacade, expressionResolver, str);
    }

    public boolean handleAction(@NonNull DivAction divAction, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(divAction, divViewFacade, expressionResolver);
    }

    public boolean handleAction(@NonNull apn apnVar, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        Div2View div2View = (Div2View) divViewFacade;
        ExpressionResolver findExpressionResolverById = findExpressionResolverById(div2View, apnVar.d());
        if (findExpressionResolverById == null) {
            findExpressionResolverById = expressionResolver;
        }
        if (DivActionTypedHandlerProxy.handleVisibilityAction(apnVar, divViewFacade, findExpressionResolverById)) {
            return true;
        }
        Uri evaluate = apnVar.getUrl() != null ? apnVar.getUrl().evaluate(expressionResolver) : null;
        if (DivDownloadActionHandler.canHandle(evaluate, divViewFacade)) {
            return DivDownloadActionHandler.handleVisibilityAction(apnVar, div2View, findExpressionResolverById);
        }
        return handleAction(apnVar.d(), evaluate, divViewFacade, expressionResolver);
    }

    public boolean handleAction(@NonNull apn apnVar, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(apnVar, divViewFacade, expressionResolver);
    }

    private boolean handleAction(@Nullable String str, @Nullable Uri uri, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        if (uri != null && "div-action".equals(uri.getScheme())) {
            return handleActionInternal(str, uri, divViewFacade, expressionResolver);
        }
        return false;
    }
}
