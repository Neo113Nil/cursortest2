package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.SearchRoute;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Animation;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.a;
import com.yandex.div2.k5;
import com.yandex.div2.p3;
import com.yandex.div2.q4;
import com.yandex.div2.q9;
import com.yandex.div2.va;
import com.yandex.div2.y8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ikn;
import xsna.izs;
import xsna.j5g;
import xsna.mq;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DivIndicatorBinder.kt */
/* loaded from: classes7.dex */
public final class DivIndicatorBinder extends DivViewBinder<a.g, DivIndicator, DivPagerIndicatorView> {
    public static final Companion Companion = new Companion(null);
    private final PagerIndicatorConnector pagerIndicatorConnector;

    /* compiled from: DivIndicatorBinder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final IndicatorParams$Shape createCircle$div_release(int i, float f, float f2) {
            return new IndicatorParams$Shape.Circle(i, new IndicatorParams$ItemSize.Circle(f * f2));
        }

        public final IndicatorParams$Shape createRoundedRectangle$div_release(int i, float f, float f2, float f3, float f4, Float f5, Integer num) {
            return new IndicatorParams$Shape.RoundedRect(i, new IndicatorParams$ItemSize.RoundedRect(f * f4, f2 * f4, f3 * f4), f5 != null ? f5.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, num != null ? num.intValue() : 0);
        }

        private Companion() {
        }
    }

    public DivIndicatorBinder(DivBaseBinder divBaseBinder, PagerIndicatorConnector pagerIndicatorConnector) {
        super(divBaseBinder);
        this.pagerIndicatorConnector = pagerIndicatorConnector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0088, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyStyle(DivPagerIndicatorView divPagerIndicatorView, ExpressionResolver expressionResolver, DivIndicator divIndicator) {
        IndicatorParams$Shape indicatorParamsShape;
        IndicatorParams$Shape indicatorParamsShape2;
        DivIndicatorBinder divIndicatorBinder;
        ExpressionResolver expressionResolver2;
        IndicatorParams$Shape multiply;
        DisplayMetrics displayMetrics;
        ExpressionResolver expressionResolver3;
        DivIndicatorBinder divIndicatorBinder2;
        IndicatorParams$Shape indicatorParams$Shape;
        IndicatorParams$Shape multiply$default;
        k5 itemsPlacementCompat;
        IndicatorParams$ItemPlacement stretch;
        int i;
        DisplayMetrics displayMetrics2 = divPagerIndicatorView.getResources().getDisplayMetrics();
        y8 y8Var = divIndicator.d;
        y8 y8Var2 = divIndicator.u;
        y8 y8Var3 = divIndicator.t;
        float doubleValue = (float) divIndicator.c.evaluate(expressionResolver).doubleValue();
        float doubleValue2 = (float) divIndicator.y.evaluate(expressionResolver).doubleValue();
        if (y8Var2 == null || (indicatorParamsShape = toIndicatorParamsShape$default(this, y8Var2, displayMetrics2, expressionResolver, divIndicator.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, (Object) null)) == null) {
            if (y8Var != null) {
                indicatorParamsShape2 = toIndicatorParamsShape(y8Var, displayMetrics2, expressionResolver, divIndicator.s, 1 / doubleValue);
                if (y8Var == null) {
                    divIndicatorBinder = this;
                    expressionResolver2 = expressionResolver;
                    multiply = toIndicatorParamsShape$default(divIndicatorBinder, y8Var, displayMetrics2, expressionResolver2, divIndicator.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, (Object) null);
                } else {
                    divIndicatorBinder = this;
                    expressionResolver2 = expressionResolver;
                }
                multiply = divIndicatorBinder.multiply(indicatorParamsShape2, doubleValue, divIndicator.b.evaluate(expressionResolver2));
                IndicatorParams$Shape indicatorParams$Shape2 = multiply;
                if (y8Var3 == null) {
                    IndicatorParams$Shape indicatorParamsShape$default = toIndicatorParamsShape$default(divIndicatorBinder, y8Var3, displayMetrics2, expressionResolver2, divIndicator.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, (Object) null);
                    displayMetrics = displayMetrics2;
                    expressionResolver3 = expressionResolver2;
                    if (indicatorParamsShape$default != null) {
                        divIndicatorBinder2 = this;
                        multiply$default = indicatorParamsShape$default;
                        indicatorParams$Shape = indicatorParamsShape2;
                        IndicatorParams$Animation convert = divIndicatorBinder2.convert(divIndicator.h.evaluate(expressionResolver3));
                        itemsPlacementCompat = divIndicatorBinder2.getItemsPlacementCompat(divIndicator);
                        if (itemsPlacementCompat instanceof k5.a) {
                            stretch = new IndicatorParams$ItemPlacement.Default(BaseDivViewExtensionsKt.toPx(((k5.a) itemsPlacementCompat).b.a, displayMetrics, expressionResolver3));
                        } else {
                            if (!(itemsPlacementCompat instanceof k5.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            k5.b bVar = (k5.b) itemsPlacementCompat;
                            float px = BaseDivViewExtensionsKt.toPx(bVar.b.a, displayMetrics, expressionResolver3);
                            long longValue = bVar.b.b.evaluate(expressionResolver3).longValue();
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
                            stretch = new IndicatorParams$ItemPlacement.Stretch(px, i);
                        }
                        divPagerIndicatorView.setStyle(new IndicatorParams$Style(convert, indicatorParams$Shape2, indicatorParams$Shape, multiply$default, stretch));
                    }
                } else {
                    displayMetrics = displayMetrics2;
                    expressionResolver3 = expressionResolver2;
                }
                divIndicatorBinder2 = this;
                indicatorParams$Shape = indicatorParamsShape2;
                multiply$default = multiply$default(divIndicatorBinder2, indicatorParams$Shape, doubleValue2, null, 2, null);
                IndicatorParams$Animation convert2 = divIndicatorBinder2.convert(divIndicator.h.evaluate(expressionResolver3));
                itemsPlacementCompat = divIndicatorBinder2.getItemsPlacementCompat(divIndicator);
                if (itemsPlacementCompat instanceof k5.a) {
                }
                divPagerIndicatorView.setStyle(new IndicatorParams$Style(convert2, indicatorParams$Shape2, indicatorParams$Shape, multiply$default, stretch));
            }
            indicatorParamsShape = y8Var3 != null ? toIndicatorParamsShape(y8Var3, displayMetrics2, expressionResolver, divIndicator.s, doubleValue2) : null;
            if (indicatorParamsShape == null) {
                indicatorParamsShape = toIndicatorParamsShape$default(this, divIndicator.E, displayMetrics2, expressionResolver, divIndicator.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, (Object) null);
            }
        }
        indicatorParamsShape2 = indicatorParamsShape;
        if (y8Var == null) {
        }
        multiply = divIndicatorBinder.multiply(indicatorParamsShape2, doubleValue, divIndicator.b.evaluate(expressionResolver2));
        IndicatorParams$Shape indicatorParams$Shape22 = multiply;
        if (y8Var3 == null) {
        }
        divIndicatorBinder2 = this;
        indicatorParams$Shape = indicatorParamsShape2;
        multiply$default = multiply$default(divIndicatorBinder2, indicatorParams$Shape, doubleValue2, null, 2, null);
        IndicatorParams$Animation convert22 = divIndicatorBinder2.convert(divIndicator.h.evaluate(expressionResolver3));
        itemsPlacementCompat = divIndicatorBinder2.getItemsPlacementCompat(divIndicator);
        if (itemsPlacementCompat instanceof k5.a) {
        }
        divPagerIndicatorView.setStyle(new IndicatorParams$Style(convert22, indicatorParams$Shape22, indicatorParams$Shape, multiply$default, stretch));
    }

    private final k5 getItemsPlacementCompat(DivIndicator divIndicator) {
        k5 k5Var = divIndicator.v;
        return k5Var == null ? new k5.a(new p3(divIndicator.F)) : k5Var;
    }

    private final IndicatorParams$Shape multiply(IndicatorParams$Shape indicatorParams$Shape, float f, Integer num) {
        if (!(indicatorParams$Shape instanceof IndicatorParams$Shape.RoundedRect)) {
            if (indicatorParams$Shape instanceof IndicatorParams$Shape.Circle) {
                return Companion.createCircle$div_release(num != null ? num.intValue() : indicatorParams$Shape.getColor(), ((IndicatorParams$Shape.Circle) indicatorParams$Shape).getItemSize().getRadius(), f);
            }
            throw new NoWhenBranchMatchedException();
        }
        Companion companion = Companion;
        int intValue = num != null ? num.intValue() : indicatorParams$Shape.getColor();
        IndicatorParams$Shape.RoundedRect roundedRect = (IndicatorParams$Shape.RoundedRect) indicatorParams$Shape;
        return companion.createRoundedRectangle$div_release(intValue, roundedRect.getItemSize().getItemWidth(), roundedRect.getItemSize().getItemHeight(), roundedRect.getItemSize().getCornerRadius(), f, Float.valueOf(roundedRect.getStrokeWidth()), Integer.valueOf(roundedRect.getStrokeColor()));
    }

    public static /* synthetic */ IndicatorParams$Shape multiply$default(DivIndicatorBinder divIndicatorBinder, IndicatorParams$Shape indicatorParams$Shape, float f, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return divIndicatorBinder.multiply(indicatorParams$Shape, f, num);
    }

    private final void observeWidthAndHeightSubscription(DivPagerIndicatorView divPagerIndicatorView, ikn iknVar, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        Object b = iknVar.getWidth().b();
        if (b instanceof q4) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (q4) b, expressionResolver, izsVar);
        }
        Object b2 = iknVar.getHeight().b();
        if (b2 instanceof q4) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (q4) b2, expressionResolver, izsVar);
        }
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(y8 y8Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f) {
        DivSizeUnit divSizeUnit;
        Expression<Integer> expression2;
        Expression<Double> expression3;
        Expression<DivSizeUnit> expression4;
        va vaVar = y8Var.e;
        va vaVar2 = y8Var.e;
        if (vaVar == null || (expression4 = vaVar.c) == null || (divSizeUnit = expression4.evaluate(expressionResolver)) == null) {
            divSizeUnit = DivSizeUnit.DP;
        }
        Integer num = null;
        Integer valueOf = (vaVar2 == null || (expression3 = vaVar2.d) == null) ? null : Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Double.valueOf(expression3.evaluate(expressionResolver).doubleValue()), displayMetrics, divSizeUnit));
        Companion companion = Companion;
        Expression<Integer> expression5 = y8Var.a;
        if (expression5 == null) {
            expression5 = expression;
        }
        int intValue = expression5.evaluate(expressionResolver).intValue();
        float pxF = BaseDivViewExtensionsKt.toPxF(y8Var.d, displayMetrics, expressionResolver);
        float pxF2 = BaseDivViewExtensionsKt.toPxF(y8Var.c, displayMetrics, expressionResolver);
        float pxF3 = BaseDivViewExtensionsKt.toPxF(y8Var.b, displayMetrics, expressionResolver);
        Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
        if (vaVar2 != null && (expression2 = vaVar2.a) != null) {
            num = expression2.evaluate(expressionResolver);
        }
        return companion.createRoundedRectangle$div_release(intValue, pxF, pxF2, pxF3, f, valueOf2, num);
    }

    public static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, y8 y8Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f, int i, Object obj) {
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(y8Var, displayMetrics, expressionResolver, (Expression<Integer>) expression, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, com.yandex.div.core.util.SearchRoute] */
    public void bindView(BindingContext bindingContext, DivPagerIndicatorView divPagerIndicatorView, a.g gVar) {
        com.yandex.div2.a rootDiv$div_release = bindingContext.getDivView().rootDiv$div_release();
        if (rootDiv$div_release != null) {
            ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
            ikn b = gVar.b();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<DivItemBuilderResult> it = DivTreeWalkKt.walk(rootDiv$div_release, expressionResolver).onEnter(new izs<com.yandex.div2.a, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.izs
                public final Boolean invoke(com.yandex.div2.a aVar) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((SearchRoute) it2.next()).onEnter();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                    if (searchRoute != null) {
                        searchRoute.onEnter();
                    }
                    return Boolean.TRUE;
                }
            }).onLeave(new izs<com.yandex.div2.a, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(com.yandex.div2.a aVar) {
                    invoke2(aVar);
                    return s3q0.a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.yandex.div2.a aVar) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((SearchRoute) it2.next()).onLeave();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                    if (searchRoute != null) {
                        searchRoute.onLeave();
                    }
                }
            }).iterator();
            int i = 0;
            while (true) {
                ikn iknVar = null;
                if (it.hasNext()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    ikn b2 = it.next().getDiv().b();
                    if (b2 == b) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            SearchRoute searchRoute = (SearchRoute) it2.next();
                            if (((ikn) searchRoute.getItem()) != null) {
                                linkedHashMap.put(searchRoute.getItem(), Integer.valueOf(searchRoute.distance()));
                            }
                        }
                        arrayList.clear();
                        ref$ObjectRef.element = new SearchRoute(null);
                    }
                    if (b2 instanceof DivPager) {
                        DivPager divPager = (DivPager) b2;
                        String str = gVar.c.A;
                        if (str == null || epx.f(divPager.p, str)) {
                            T t = ref$ObjectRef.element;
                            if (t != 0) {
                                linkedHashMap.put(b2, Integer.valueOf(((SearchRoute) t).distance()));
                            } else {
                                arrayList.add(new SearchRoute(b2));
                            }
                        }
                    }
                    i = i2;
                } else {
                    Integer num = (Integer) j5g.o0(linkedHashMap.values());
                    if (num != null) {
                        int intValue = num.intValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (((Number) entry.getValue()).intValue() == intValue) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set keySet = linkedHashMap2.keySet();
                        if (!keySet.isEmpty()) {
                            if (keySet.size() > 1) {
                                fpf0.a(DivPager.class).l();
                            }
                            iknVar = (ikn) j5g.X(keySet);
                        }
                    }
                    DivPager divPager2 = (DivPager) iknVar;
                    if (divPager2 != null) {
                        this.pagerIndicatorConnector.submitIndicator$div_release(divPagerIndicatorView, divPager2);
                    }
                }
            }
        }
        super.bindView(bindingContext, (BindingContext) divPagerIndicatorView, (DivPagerIndicatorView) gVar);
    }

    public final IndicatorParams$Animation convert(DivIndicator.Animation animation) {
        return animation == DivIndicator.Animation.WORM ? IndicatorParams$Animation.WORM : animation == DivIndicator.Animation.SLIDER ? IndicatorParams$Animation.SLIDER : IndicatorParams$Animation.SCALE;
    }

    public static /* synthetic */ IndicatorParams$Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, q9 q9Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f, int i, Object obj) {
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(q9Var, displayMetrics, expressionResolver, (Expression<Integer>) expression, f);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(final DivPagerIndicatorView divPagerIndicatorView, BindingContext bindingContext, final DivIndicator divIndicator, DivIndicator divIndicator2) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyStyle(divPagerIndicatorView, expressionResolver, divIndicator);
        izs<? super DivIndicator.Animation, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bind$callback$1
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
                DivIndicatorBinder.this.applyStyle(divPagerIndicatorView, expressionResolver, divIndicator);
            }
        };
        divPagerIndicatorView.addSubscription(divIndicator.h.observe(expressionResolver, izsVar));
        divPagerIndicatorView.addSubscription(divIndicator.b.observe(expressionResolver, izsVar));
        divPagerIndicatorView.addSubscription(divIndicator.c.observe(expressionResolver, izsVar));
        divPagerIndicatorView.addSubscription(divIndicator.s.observe(expressionResolver, izsVar));
        divPagerIndicatorView.addSubscription(divIndicator.y.observe(expressionResolver, izsVar));
        ExpressionSubscribersKt.observeShape(divPagerIndicatorView, divIndicator.E, expressionResolver, izsVar);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.d, expressionResolver, izsVar);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.u, expressionResolver, izsVar);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.t, expressionResolver, izsVar);
        k5 itemsPlacementCompat = getItemsPlacementCompat(divIndicator);
        if (itemsPlacementCompat instanceof k5.a) {
            k5.a aVar = (k5.a) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(aVar.b.a.b.observe(expressionResolver, izsVar));
            divPagerIndicatorView.addSubscription(aVar.b.a.a.observe(expressionResolver, izsVar));
        } else if (itemsPlacementCompat instanceof k5.b) {
            k5.b bVar = (k5.b) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(bVar.b.a.b.observe(expressionResolver, izsVar));
            divPagerIndicatorView.addSubscription(bVar.b.a.a.observe(expressionResolver, izsVar));
            divPagerIndicatorView.addSubscription(bVar.b.b.observe(expressionResolver, izsVar));
        }
        observeWidthAndHeightSubscription(divPagerIndicatorView, divIndicator, expressionResolver, izsVar);
    }

    private final IndicatorParams$Shape toIndicatorParamsShape(q9 q9Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f) {
        if (q9Var instanceof q9.b) {
            return toIndicatorParamsShape(((q9.b) q9Var).b, displayMetrics, expressionResolver, expression, f);
        }
        if (!(q9Var instanceof q9.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Companion.createCircle$div_release(expression.evaluate(expressionResolver).intValue(), BaseDivViewExtensionsKt.toPxF(((q9.a) q9Var).b.b, displayMetrics, expressionResolver), f);
    }
}
