package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action;

import android.net.Uri;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.json.expressions.Expression;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.avu0;
import defpackage.bvu0;
import defpackage.f9l;
import defpackage.fpl;
import defpackage.ibb1;
import defpackage.jl40;
import defpackage.rvo;
import defpackage.u131;
import defpackage.v3k;
import defpackage.w3k;
import defpackage.w6k;
import defpackage.x131;
import defpackage.y131;
import defpackage.y6k;
import defpackage.z131;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B%\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0014JI\u0010\u0019\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J'\u0010\"\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010$J1\u0010(\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+¨\u0006-"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/DivActionHandlerImpl;", "Ly6k;", "", "", "Lw6k;", "divActionHandlers", "Lcom/yandex/div/core/expression/variables/a;", "variableController", "<init>", "(Ljava/util/Map;Lcom/yandex/div/core/expression/variables/a;)V", "Lv3k;", "action", "Lrvo;", "expressionResolver", "Lfpl;", "view", "", "handleCustomAction", "(Lv3k;Lrvo;Lfpl;)Z", "Lf9l;", "(Lf9l;Lrvo;Lfpl;)Z", "actionType", "", "payload", "scopeId", "handleCustomActionInternal", "(Ljava/lang/String;Lrvo;Ljava/util/Map;Ljava/lang/String;Lfpl;)Z", DivActionHandlerImpl.PARAM_NAME, "value", "Lzy11;", "syncVariableToController", "(Ljava/lang/String;Ljava/lang/String;)V", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "handleAction", "(Lv3k;Lfpl;Lrvo;)Z", "(Lf9l;Lfpl;Lrvo;)Z", "resolver", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "handleActionUrlWithSync", "(Lrvo;Ljava/lang/String;Landroid/net/Uri;Lfpl;)Z", "Ljava/util/Map;", "Lcom/yandex/div/core/expression/variables/a;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivActionHandlerImpl extends y6k {
    private static final String ACTION_SET_VARIABLE = "set_variable";
    private static final Companion Companion = new Companion(null);
    private static final String PARAM_NAME = "name";
    private static final String PARAM_VALUE = "value";
    private final Map<String, w6k> divActionHandlers;
    private final a variableController;

    public DivActionHandlerImpl(Map<String, w6k> map, a aVar) {
        this.divActionHandlers = map;
        this.variableController = aVar;
    }

    private final boolean handleCustomAction(f9l action, rvo expressionResolver, fpl view) {
        Expression url = action.getUrl();
        Uri uri = url != null ? (Uri) url.a(expressionResolver) : null;
        String host = uri != null ? uri.getHost() : null;
        JSONObject payload = action.getPayload();
        Map<String, ? extends Object> e = payload != null ? ibb1.e(payload) : null;
        if (e == null) {
            e = b.f();
        }
        return handleCustomActionInternal(host, expressionResolver, e, action.e(), view);
    }

    private final boolean handleCustomActionInternal(String actionType, rvo expressionResolver, Map<String, ? extends Object> payload, String scopeId, fpl view) {
        if (actionType == null || !this.divActionHandlers.keySet().contains(actionType)) {
            return false;
        }
        w3k w3kVar = new w3k(payload, actionType);
        DivExpressionResolverImpl divExpressionResolverImpl = new DivExpressionResolverImpl(expressionResolver);
        DivActionExecutorImpl divActionExecutorImpl = new DivActionExecutorImpl(this.divActionHandlers, divExpressionResolverImpl, view, expressionResolver, this, scopeId);
        w6k w6kVar = this.divActionHandlers.get(actionType);
        if (w6kVar == null) {
            return true;
        }
        w6kVar.a(divActionExecutorImpl, w3kVar, divExpressionResolverImpl);
        return true;
    }

    private final Object parseValue(String value) {
        return jl40.l(value, "true") ? Boolean.TRUE : jl40.l(value, "false") ? Boolean.FALSE : bvu0.m(10, value) != null ? Long.valueOf(Long.parseLong(value)) : avu0.i(value) != null ? Double.valueOf(Double.parseDouble(value)) : value;
    }

    private final void syncVariableToController(String name, String value) {
        Object parseValue = parseValue(value);
        this.variableController.i(parseValue instanceof Boolean ? new u131(name, ((Boolean) parseValue).booleanValue()) : parseValue instanceof Long ? new y131(name, ((Number) parseValue).longValue()) : parseValue instanceof Double ? new x131(name, ((Number) parseValue).doubleValue()) : parseValue instanceof String ? new z131(name, (String) parseValue) : new z131(name, value));
    }

    @Override // defpackage.y6k
    public boolean handleAction(v3k action, fpl view, rvo expressionResolver) {
        return super.handleAction(action, view, expressionResolver) || handleCustomAction(action, expressionResolver, view);
    }

    public final boolean handleActionUrlWithSync(rvo resolver, String scopeId, Uri uri, fpl view) {
        if (uri != null && jl40.l(uri.getHost(), ACTION_SET_VARIABLE)) {
            String queryParameter = uri.getQueryParameter(PARAM_NAME);
            String queryParameter2 = uri.getQueryParameter("value");
            if (queryParameter != null && queryParameter2 != null) {
                syncVariableToController(queryParameter, queryParameter2);
            }
        }
        return handleActionUrl(scopeId, uri, view, resolver);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/DivActionHandlerImpl$Companion;", "", "<init>", "()V", "ACTION_SET_VARIABLE", "", "PARAM_NAME", "PARAM_VALUE", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // defpackage.y6k
    public boolean handleAction(f9l action, fpl view, rvo expressionResolver) {
        return super.handleAction(action, view, expressionResolver) || handleCustomAction(action, expressionResolver, view);
    }

    private final boolean handleCustomAction(v3k action, rvo expressionResolver, fpl view) {
        Expression expression = action.k;
        Uri uri = expression != null ? (Uri) expression.a(expressionResolver) : null;
        String host = uri != null ? uri.getHost() : null;
        JSONObject jSONObject = action.f;
        Map<String, ? extends Object> e = jSONObject != null ? ibb1.e(jSONObject) : null;
        if (e == null) {
            e = b.f();
        }
        return handleCustomActionInternal(host, expressionResolver, e, action.h, view);
    }
}
