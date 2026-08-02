package com.yandex.div.core.view2.divs;

import android.widget.TextView;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import xsna.e43;
import xsna.ikn;
import xsna.izs;
import xsna.j5g;
import xsna.mq;
import xsna.s3q0;

/* compiled from: TextViewExtensions.kt */
/* loaded from: classes7.dex */
public final class TextViewExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFontSize(TextView textView, Expression<Long> expression, Expression<DivSizeUnit> expression2, ExpressionResolver expressionResolver) {
        textView.setTextSize(BaseDivViewExtensionsKt.toAndroidUnit(expression2.evaluate(expressionResolver)), expression.evaluate(expressionResolver).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyFontVariationSettings(TextView textView, Expression<DivFontWeight> expression, Expression<Long> expression2, Expression<JSONObject> expression3, ExpressionResolver expressionResolver) {
        textView.setFontVariationSettings(getFontVariations(expression, expression2, expression3, expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyLetterSpacing(TextView textView, Expression<Double> expression, Expression<Long> expression2, ExpressionResolver expressionResolver) {
        textView.setLetterSpacing(((float) expression.evaluate(expressionResolver).doubleValue()) / expression2.evaluate(expressionResolver).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends TextView & FixedLineHeightView> void applyLineHeight(T t, Expression<Long> expression, Expression<DivSizeUnit> expression2, ExpressionResolver expressionResolver) {
        t.setFixedLineHeight(expression != null ? BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression.evaluate(expressionResolver).longValue()), t.getResources().getDisplayMetrics(), expression2.evaluate(expressionResolver)) : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyTypeface(TextView textView, Expression<String> expression, Expression<DivFontWeight> expression2, Expression<Long> expression3, Expression<JSONObject> expression4, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        Integer num;
        int i;
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(expression != null ? expression.evaluate(expressionResolver) : null);
        DivFontWeight evaluate = expression2 != null ? expression2.evaluate(expressionResolver) : null;
        if (expression3 != null) {
            long longValue = expression3.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        textView.setTypeface(DivTypefaceResolverKt.getTypeface(evaluate, num, typefaceProvider));
        if (getSupportFontVariations() && typefaceProvider.isVariable()) {
            textView.setFontVariationSettings(null);
            applyFontVariationSettings(textView, expression2, expression3, expression4, expressionResolver);
        }
    }

    public static final String getFontVariations(Expression<DivFontWeight> expression, Expression<Long> expression2, Expression<JSONObject> expression3, ExpressionResolver expressionResolver) {
        Integer num;
        int i;
        DivFontWeight evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        if (expression2 != null) {
            long longValue = expression2.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return getFontVariations(evaluate, num, expression3 != null ? expression3.evaluate(expressionResolver) : null);
    }

    public static final boolean getSupportFontVariations() {
        return true;
    }

    private static final String getVariation(String str, Number number) {
        return "'" + str + "' " + number;
    }

    public static final <T extends TextView & FixedLineHeightView & ExpressionSubscriber> void observeBaseTextProperties(T t, Expression<Long> expression, Expression<DivSizeUnit> expression2, Expression<Double> expression3, Expression<Integer> expression4, Expression<Long> expression5, Expression<String> expression6, Expression<DivFontWeight> expression7, Expression<Long> expression8, Expression<JSONObject> expression9, Expression<Long> expression10, Expression<DivSizeUnit> expression11, Expression<Double> expression12, Expression<Integer> expression13, Expression<Long> expression14, Expression<String> expression15, Expression<DivFontWeight> expression16, Expression<Long> expression17, Expression<JSONObject> expression18, ikn iknVar, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        T t2 = t;
        observeFontSize(t, expression, expression2, expression10, expression11, expressionResolver, t2);
        observeLetterSpacing(t, expression3, expression, expression12, expression10, expressionResolver, t2);
        observeTextColor(t, expression4, expression13, expressionResolver);
        observeLineHeight(t, expression5, expression2, expression14, expression11, expressionResolver, t2);
        observeTypeface(t, expression6, expression7, expression8, expression9, expression15, expression16, expression17, expression18, iknVar, divTypefaceResolver, expressionResolver);
    }

    public static final void observeFontSize(final TextView textView, final Expression<Long> expression, final Expression<DivSizeUnit> expression2, Expression<Long> expression3, Expression<DivSizeUnit> expression4, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyFontSize(textView, expression, expression2, expressionResolver);
        if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
            return;
        }
        izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeFontSize$callback$1
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
                TextViewExtensionsKt.applyFontSize(textView, expression, expression2, expressionResolver);
            }
        };
        expressionSubscriber.addSubscription(expression.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(expression2.observe(expressionResolver, izsVar));
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeFontVariationSettings(final T t, final Expression<DivFontWeight> expression, final Expression<Long> expression2, final Expression<JSONObject> expression3, final ExpressionResolver expressionResolver) {
        if (!getSupportFontVariations() || ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        t.addSubscription(expression3 != null ? expression3.observe(expressionResolver, new izs<JSONObject, s3q0>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeFontVariationSettings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Lcom/yandex/div2/DivFontWeight;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(JSONObject jSONObject) {
                invoke2(jSONObject);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JSONObject jSONObject) {
                TextViewExtensionsKt.applyFontVariationSettings(t, expression, expression2, expression3, expressionResolver);
            }
        }) : null);
    }

    public static final void observeLetterSpacing(final TextView textView, final Expression<Double> expression, final Expression<Long> expression2, Expression<Double> expression3, Expression<Long> expression4, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyLetterSpacing(textView, expression, expression2, expressionResolver);
        if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
            return;
        }
        izs<? super Double, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLetterSpacing$callback$1
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
                TextViewExtensionsKt.applyLetterSpacing(textView, expression, expression2, expressionResolver);
            }
        };
        expressionSubscriber.addSubscription(expression2.observe(expressionResolver, izsVar));
        expressionSubscriber.addSubscription(expression.observe(expressionResolver, izsVar));
    }

    public static final <T extends TextView & FixedLineHeightView> void observeLineHeight(final T t, final Expression<Long> expression, final Expression<DivSizeUnit> expression2, Expression<Long> expression3, Expression<DivSizeUnit> expression4, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(expression, expression3) && ExpressionsKt.equalsToConstant(expression2, expression4)) {
            return;
        }
        applyLineHeight(t, expression, expression2, expressionResolver);
        if (expression != null) {
            if (ExpressionsKt.isConstant(expression) && ExpressionsKt.isConstant(expression2)) {
                return;
            }
            izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeLineHeight$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lcom/yandex/div2/DivSizeUnit;>;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
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
                    TextViewExtensionsKt.applyLineHeight(t, expression, expression2, expressionResolver);
                }
            };
            expressionSubscriber.addSubscription(expression.observe(expressionResolver, izsVar));
            expressionSubscriber.addSubscription(expression2.observe(expressionResolver, izsVar));
        }
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTextColor(final T t, Expression<Integer> expression, Expression<Integer> expression2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        t.setTextColor(expression.evaluate(expressionResolver).intValue());
        if (ExpressionsKt.isConstant(expression)) {
            return;
        }
        t.addSubscription(expression.observe(expressionResolver, new izs<Integer, s3q0>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeTextColor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
                invoke(num.intValue());
                return s3q0.a;
            }

            public final void invoke(int i) {
                t.setTextColor(i);
            }
        }));
    }

    public static final <T extends TextView & ExpressionSubscriber> void observeTypeface(T t, Expression<String> expression, Expression<DivFontWeight> expression2, Expression<Long> expression3, Expression<JSONObject> expression4, Expression<String> expression5, Expression<DivFontWeight> expression6, Expression<Long> expression7, Expression<JSONObject> expression8, ikn iknVar, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
        if (iknVar != null && ExpressionsKt.equalsToConstant(expression, expression5) && ExpressionsKt.equalsToConstant(expression2, expression6) && ExpressionsKt.equalsToConstant(expression3, expression7) && (!getSupportFontVariations() || ExpressionsKt.equalsToConstant(expression4, expression8))) {
            return;
        }
        applyTypeface(t, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
        observeTypeface(t, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
        observeFontVariationSettings(t, expression2, expression3, expression4, expressionResolver);
    }

    private static final <T extends TextView & ExpressionSubscriber> void observeTypeface(final T t, final Expression<String> expression, final Expression<DivFontWeight> expression2, final Expression<Long> expression3, final Expression<JSONObject> expression4, final DivTypefaceResolver divTypefaceResolver, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.isConstantOrNull(expression) && ExpressionsKt.isConstantOrNull(expression2) && ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        izs<? super String, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.TextViewExtensionsKt$observeTypeface$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/String;>;Lcom/yandex/div/json/expressions/Expression<Lcom/yandex/div2/DivFontWeight;>;Lcom/yandex/div/json/expressions/Expression<Ljava/lang/Long;>;Lcom/yandex/div/json/expressions/Expression<Lorg/json/JSONObject;>;Lcom/yandex/div/core/view2/DivTypefaceResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V */
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
                TextViewExtensionsKt.applyTypeface(t, expression, expression2, expression3, expression4, divTypefaceResolver, expressionResolver);
            }
        };
        if (expression != null) {
            t.addSubscription(expression.observe(expressionResolver, izsVar));
        }
        if (expression2 != null) {
            t.addSubscription(expression2.observe(expressionResolver, izsVar));
        }
        if (expression3 != null) {
            t.addSubscription(expression3.observe(expressionResolver, izsVar));
        }
    }

    public static final String getFontVariations(DivFontWeight divFontWeight, Integer num, JSONObject jSONObject) {
        boolean z = (divFontWeight == null && num == null) ? false : true;
        int typefaceValue = DivTypefaceResolverKt.getTypefaceValue(divFontWeight, num);
        if (jSONObject == null || JsonUtilsKt.isEmpty(jSONObject)) {
            if (z) {
                return getVariation("wght", Integer.valueOf(typefaceValue));
            }
            return null;
        }
        if (z && !jSONObject.has("wght")) {
            jSONObject.put("wght", typefaceValue);
        }
        ListBuilder e = e43.e();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Number) {
                e.add(getVariation(next, (Number) obj));
            }
        }
        return j5g.g0(e.g(), ", ", null, null, 0, null, 62);
    }
}
