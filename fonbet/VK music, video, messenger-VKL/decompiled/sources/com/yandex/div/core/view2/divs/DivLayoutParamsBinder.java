package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.aa;
import com.yandex.div2.v9;
import com.yandex.div2.w6;
import java.util.Arrays;
import xsna.ikn;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivLayoutParamsBinder.kt */
/* loaded from: classes7.dex */
public final class DivLayoutParamsBinder {
    private final ErrorCollectors errorCollectors;

    public DivLayoutParamsBinder(ErrorCollectors errorCollectors) {
        this.errorCollectors = errorCollectors;
    }

    private final boolean applyHeight(View view, ikn iknVar, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(iknVar.getHeight(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().height == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().height = layoutParamsSize;
        return true;
    }

    private final boolean applyHeightConstraints(View view, ikn iknVar, ExpressionResolver expressionResolver) {
        aa minSize = getMinSize(iknVar.getHeight());
        boolean z = false;
        int px = minSize != null ? BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver) : 0;
        aa maxSize = getMaxSize(iknVar.getHeight());
        int i = Integer.MAX_VALUE;
        int px2 = maxSize != null ? BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver) : Integer.MAX_VALUE;
        if (px > px2) {
            px = 0;
        } else {
            i = px2;
        }
        if (view.getMinimumHeight() != px) {
            view.setMinimumHeight(px);
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.getMaxHeight() == i) {
            return z;
        }
        divLayoutParams.setMaxHeight(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHeightProperties(View view, ikn iknVar, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        checkConstraints(iknVar.getHeight(), "height", iknVar.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        boolean z = applyVerticalWeightValue(view, iknVar, expressionResolver) || applyHeight(view, iknVar, expressionResolver);
        if (applyHeightConstraints(view, iknVar, expressionResolver) || z) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, iknVar, expressionResolver);
        }
    }

    private final boolean applyHorizontalWeightValue(View view, ikn iknVar, ExpressionResolver expressionResolver) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(iknVar.getWidth(), expressionResolver);
        if (divLayoutParams.getHorizontalWeight() == weight) {
            return false;
        }
        divLayoutParams.setHorizontalWeight(weight);
        return true;
    }

    private final boolean applyVerticalWeightValue(View view, ikn iknVar, ExpressionResolver expressionResolver) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(iknVar.getHeight(), expressionResolver);
        if (divLayoutParams.getVerticalWeight() == weight) {
            return false;
        }
        divLayoutParams.setVerticalWeight(weight);
        return true;
    }

    private final boolean applyWidth(View view, ikn iknVar, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(iknVar.getWidth(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().width == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().width = layoutParamsSize;
        return true;
    }

    private final boolean applyWidthConstraints(View view, ikn iknVar, ExpressionResolver expressionResolver) {
        aa minSize = getMinSize(iknVar.getWidth());
        boolean z = false;
        int px = minSize != null ? BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver) : 0;
        aa maxSize = getMaxSize(iknVar.getWidth());
        int i = Integer.MAX_VALUE;
        int px2 = maxSize != null ? BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver) : Integer.MAX_VALUE;
        if (px > px2) {
            px = 0;
        } else {
            i = px2;
        }
        if (view.getMinimumWidth() != px) {
            view.setMinimumWidth(px);
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.getMaxWidth() == i) {
            return z;
        }
        divLayoutParams.setMaxWidth(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyWidthProperties(View view, ikn iknVar, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        checkConstraints(iknVar.getWidth(), "width", iknVar.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        boolean z = applyHorizontalWeightValue(view, iknVar, expressionResolver) || applyWidth(view, iknVar, expressionResolver);
        if (applyWidthConstraints(view, iknVar, expressionResolver) || z) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, iknVar, expressionResolver);
        }
    }

    private final void bindHeight(final View view, final ikn iknVar, ikn iknVar2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        if (DivDataExtensionsKt.equalsToConstant(iknVar.getHeight(), iknVar2 != null ? iknVar2.getHeight() : null)) {
            checkConstraints(iknVar.getHeight(), "height", iknVar.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyHeightProperties(view, iknVar, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(iknVar.getHeight())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, iknVar.getHeight(), expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder$bindHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivLayoutParamsBinder.this.applyHeightProperties(view, iknVar, expressionResolver, errorCollector);
            }
        });
    }

    private final void bindWidth(final View view, final ikn iknVar, ikn iknVar2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        if (DivDataExtensionsKt.equalsToConstant(iknVar.getWidth(), iknVar2 != null ? iknVar2.getWidth() : null)) {
            checkConstraints(iknVar.getWidth(), "width", iknVar.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyWidthProperties(view, iknVar, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(iknVar.getWidth())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, iknVar.getWidth(), expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder$bindWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivLayoutParamsBinder.this.applyWidthProperties(view, iknVar, expressionResolver, errorCollector);
            }
        });
    }

    private final void checkConstraints(v9 v9Var, String str, String str2, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        aa maxSize;
        aa minSize = getMinSize(v9Var);
        if (minSize == null || (maxSize = getMaxSize(v9Var)) == null || BaseDivViewExtensionsKt.toPx(minSize, displayMetrics, expressionResolver) <= BaseDivViewExtensionsKt.toPx(maxSize, displayMetrics, expressionResolver)) {
            return;
        }
        errorCollector.logError(new Throwable(String.format("Element has incorrect %s constraints (min size is bigger than max size). %sminSize: %s, maxSize: %s.", Arrays.copyOf(new Object[]{str, str2 != null ? String.format("Id: '%s', ", Arrays.copyOf(new Object[]{str2}, 1)) : "", toString(minSize, expressionResolver), toString(maxSize, expressionResolver)}, 4))));
    }

    private final aa getMaxSize(v9 v9Var) {
        if (v9Var instanceof v9.c) {
            return ((v9.c) v9Var).b.b;
        }
        if (v9Var instanceof v9.b) {
            return ((v9.b) v9Var).b.a;
        }
        return null;
    }

    private final aa getMinSize(v9 v9Var) {
        if (v9Var instanceof v9.c) {
            return ((v9.c) v9Var).b.c;
        }
        if (v9Var instanceof v9.b) {
            return ((v9.b) v9Var).b.b;
        }
        return null;
    }

    private final float getWeight(v9 v9Var, ExpressionResolver expressionResolver) {
        w6 w6Var;
        Expression<Double> expression;
        v9.b bVar = v9Var instanceof v9.b ? (v9.b) v9Var : null;
        return (bVar == null || (w6Var = bVar.b) == null || (expression = w6Var.c) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) expression.evaluate(expressionResolver).doubleValue();
    }

    private final String toString(aa aaVar, ExpressionResolver expressionResolver) {
        StringBuilder sb = new StringBuilder();
        sb.append(aaVar.b.evaluate(expressionResolver).longValue());
        DivSizeUnit.c cVar = DivSizeUnit.Converter;
        DivSizeUnit evaluate = aaVar.a.evaluate(expressionResolver);
        cVar.getClass();
        sb.append(evaluate.value);
        return sb.toString();
    }

    public final void bindLayoutParams(BindingContext bindingContext, View view, ikn iknVar, ikn iknVar2, ExpressionSubscriber expressionSubscriber) {
        bindLayoutParams(view, iknVar, iknVar2, bindingContext.getExpressionResolver(), expressionSubscriber, this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData()));
    }

    private final void bindLayoutParams(View view, ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, ErrorCollector errorCollector) {
        if (view.getLayoutParams() == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("LayoutParams should be initialized before view binding");
            }
            view.setLayoutParams(new DivLayoutParams(-1, -2));
        }
        bindWidth(view, iknVar, iknVar2, expressionResolver, expressionSubscriber, errorCollector);
        bindHeight(view, iknVar, iknVar2, expressionResolver, expressionSubscriber, errorCollector);
    }
}
