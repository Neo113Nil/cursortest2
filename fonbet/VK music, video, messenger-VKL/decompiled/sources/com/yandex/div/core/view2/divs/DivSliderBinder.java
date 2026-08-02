package com.yandex.div.core.view2.divs;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.a;
import com.yandex.div2.fa;
import com.yandex.div2.s3;
import com.yandex.div2.y3;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.epx;
import xsna.izs;
import xsna.jon;
import xsna.mq;
import xsna.qj80;
import xsna.s3q0;
import xsna.ukn;
import xsna.zcl;

/* compiled from: DivSliderBinder.kt */
/* loaded from: classes7.dex */
public final class DivSliderBinder extends DivViewBinder<a.l, fa, DivSliderView> {
    private static final Companion Companion = new Companion(null);
    private ErrorCollector errorCollector;
    private final ErrorCollectors errorCollectors;
    private final float horizontalInterceptionAngle;
    private final Div2Logger logger;
    private final DivTypefaceResolver typefaceResolver;
    private final TwoWayIntegerVariableBinder variableBinder;
    private final boolean visualErrorsEnabled;

    /* compiled from: DivSliderBinder.kt */
    public static final class Companion {

        /* compiled from: DivSliderBinder.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DivSizeUnit.values().length];
                try {
                    iArr[DivSizeUnit.DP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivSizeUnit.SP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DivSizeUnit.PX.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final int applyUnit(y3 y3Var, long j, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
            return castToUnit(j, y3Var.g.evaluate(expressionResolver), displayMetrics);
        }

        public final int castToUnit(long j, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
            int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
            if (i == 1) {
                return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), displayMetrics);
            }
            if (i == 2) {
                return BaseDivViewExtensionsKt.spToPx(Long.valueOf(j), displayMetrics);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            long j2 = j >> 31;
            if (j2 == 0 || j2 == -1) {
                return (int) j;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(j, "Unable convert '", "' to Int");
            }
            return j > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        public final SliderTextStyle toSliderTextStyle(fa.b bVar, DisplayMetrics displayMetrics, DivTypefaceResolver divTypefaceResolver, ExpressionResolver expressionResolver) {
            s3 s3Var;
            s3 s3Var2;
            int i;
            Expression<Long> expression = bVar.b;
            jon jonVar = bVar.h;
            Expression<Long> expression2 = bVar.f;
            Expression<DivFontWeight> expression3 = bVar.e;
            long longValue = expression.evaluate(expressionResolver).longValue();
            Expression<String> expression4 = bVar.a;
            Integer num = null;
            DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(expression4 != null ? expression4.evaluate(expressionResolver) : null);
            String fontVariations = typefaceProvider.isVariable() ? TextViewExtensionsKt.getFontVariations(expression3, expression2, bVar.d, expressionResolver) : null;
            float fontSizeToPx = BaseDivViewExtensionsKt.fontSizeToPx(longValue, bVar.c.evaluate(expressionResolver), displayMetrics);
            float doubleValue = ((float) bVar.g.evaluate(expressionResolver).doubleValue()) / longValue;
            DivFontWeight evaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            if (expression2 != null) {
                long longValue2 = expression2.evaluate(expressionResolver).longValue();
                long j = longValue2 >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        mq.a(longValue2, "Unable convert '", "' to Int");
                    }
                    i = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                num = Integer.valueOf(i);
            }
            Typeface typeface = DivTypefaceResolverKt.getTypeface(evaluate, num, typefaceProvider);
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float px = (jonVar == null || (s3Var2 = jonVar.a) == null) ? 0.0f : BaseDivViewExtensionsKt.toPx(s3Var2, displayMetrics, expressionResolver);
            if (jonVar != null && (s3Var = jonVar.b) != null) {
                f = BaseDivViewExtensionsKt.toPx(s3Var, displayMetrics, expressionResolver);
            }
            return new SliderTextStyle(fontSizeToPx, doubleValue, typeface, px, f, bVar.i.evaluate(expressionResolver).intValue(), fontVariations);
        }

        private Companion() {
        }
    }

    public DivSliderBinder(DivBaseBinder divBaseBinder, Div2Logger div2Logger, DivTypefaceResolver divTypefaceResolver, TwoWayIntegerVariableBinder twoWayIntegerVariableBinder, ErrorCollectors errorCollectors, float f, boolean z) {
        super(divBaseBinder);
        this.logger = div2Logger;
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayIntegerVariableBinder;
        this.errorCollectors = errorCollectors;
        this.horizontalInterceptionAngle = f;
        this.visualErrorsEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryStyle(SliderView sliderView, ExpressionResolver expressionResolver, ukn uknVar) {
        sliderView.setThumbSecondaryDrawable(DivUtilKt.toDrawable(uknVar, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, fa.b bVar) {
        sliderView.setThumbSecondTextDrawable(bVar != null ? new TextDrawable(Companion.toSliderTextStyle(bVar, sliderView.getResources().getDisplayMetrics(), this.typefaceResolver, expressionResolver)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbStyle(SliderView sliderView, ExpressionResolver expressionResolver, ukn uknVar) {
        sliderView.setThumbDrawable(DivUtilKt.toDrawable(uknVar, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, fa.b bVar) {
        sliderView.setThumbTextDrawable(bVar != null ? new TextDrawable(Companion.toSliderTextStyle(bVar, sliderView.getResources().getDisplayMetrics(), this.typefaceResolver, expressionResolver)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkActiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, ukn uknVar) {
        divSliderView.setActiveTickMarkDrawable(uknVar != null ? DivUtilKt.toDrawable(uknVar, divSliderView.getResources().getDisplayMetrics(), expressionResolver) : null);
        checkSliderTicks(divSliderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkInactiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, ukn uknVar) {
        divSliderView.setInactiveTickMarkDrawable(uknVar != null ? DivUtilKt.toDrawable(uknVar, divSliderView.getResources().getDisplayMetrics(), expressionResolver) : null);
        checkSliderTicks(divSliderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackActiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, ukn uknVar) {
        sliderView.setActiveTrackDrawable(DivUtilKt.toDrawable(uknVar, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackInactiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, ukn uknVar) {
        sliderView.setInactiveTrackDrawable(DivUtilKt.toDrawable(uknVar, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkSliderTicks(final DivSliderView divSliderView) {
        if (!this.visualErrorsEnabled || this.errorCollector == null) {
            return;
        }
        qj80.a(divSliderView, new Runnable() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$checkSliderTicks$$inlined$doOnPreDraw$1
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
            
                r0 = r3.errorCollector;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                ErrorCollector errorCollector;
                ErrorCollector errorCollector2;
                ErrorCollector errorCollector3;
                if (divSliderView.getActiveTickMarkDrawable() == null && divSliderView.getInactiveTickMarkDrawable() == null) {
                    return;
                }
                float maxValue = divSliderView.getMaxValue() - divSliderView.getMinValue();
                Drawable activeTickMarkDrawable = divSliderView.getActiveTickMarkDrawable();
                boolean z = false;
                int intrinsicWidth = activeTickMarkDrawable != null ? activeTickMarkDrawable.getIntrinsicWidth() : 0;
                if (Math.max(intrinsicWidth, divSliderView.getInactiveTickMarkDrawable() != null ? r3.getIntrinsicWidth() : 0) * maxValue > divSliderView.getWidth()) {
                    errorCollector = this.errorCollector;
                    if (errorCollector != null) {
                        errorCollector2 = this.errorCollector;
                        Iterator<Throwable> warnings = errorCollector2.getWarnings();
                        while (warnings.hasNext()) {
                            if (epx.f(warnings.next().getMessage(), "Slider ticks overlap each other.")) {
                                z = true;
                            }
                        }
                        if (z || errorCollector3 == null) {
                            return;
                        }
                        errorCollector3.logWarning(new Throwable("Slider ticks overlap each other."));
                    }
                }
            }
        });
    }

    private final void observeThumbSecondaryStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final ukn uknVar) {
        if (uknVar == null) {
            return;
        }
        applyThumbSecondaryStyle(divSliderView, expressionResolver, uknVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, uknVar, expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryStyle$1
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
                DivSliderBinder.this.applyThumbSecondaryStyle(divSliderView, expressionResolver, uknVar);
            }
        });
    }

    private final void observeThumbSecondaryTextStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final fa.b bVar) {
        applyThumbSecondaryTextStyle(divSliderView, expressionResolver, bVar);
        if (bVar == null) {
            return;
        }
        divSliderView.addSubscription(bVar.i.observe(expressionResolver, new izs<Integer, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
                invoke(num.intValue());
                return s3q0.a;
            }

            public final void invoke(int i) {
                DivSliderBinder.this.applyThumbSecondaryTextStyle(divSliderView, expressionResolver, bVar);
            }
        }));
    }

    private final void observeThumbSecondaryValue(final DivSliderView divSliderView, String str, final BindingContext bindingContext, DivStatePath divStatePath) {
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(final izs<? super Long, s3q0> izsVar) {
                final DivSliderView divSliderView2 = DivSliderView.this;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbSecondaryValueChanged(Float f) {
                        Div2Logger div2Logger;
                        div2Logger = DivSliderBinder.this.logger;
                        div2Logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, f);
                        izsVar.invoke(Long.valueOf(f != null ? an10.c(f.floatValue()) : 0L));
                    }
                });
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(Long l) {
                DivSliderView.this.setThumbSecondaryValue(l != null ? Float.valueOf(l.longValue()) : null, false);
            }
        }, divStatePath));
    }

    private final void observeThumbStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final ukn uknVar) {
        applyThumbStyle(divSliderView, expressionResolver, uknVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, uknVar, expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbStyle$1
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
                DivSliderBinder.this.applyThumbStyle(divSliderView, expressionResolver, uknVar);
            }
        });
    }

    private final void observeThumbTextStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final fa.b bVar) {
        applyThumbTextStyle(divSliderView, expressionResolver, bVar);
        if (bVar == null) {
            return;
        }
        divSliderView.addSubscription(bVar.i.observe(expressionResolver, new izs<Integer, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
                invoke(num.intValue());
                return s3q0.a;
            }

            public final void invoke(int i) {
                DivSliderBinder.this.applyThumbTextStyle(divSliderView, expressionResolver, bVar);
            }
        }));
    }

    private final void observeThumbValue(final DivSliderView divSliderView, fa faVar, final BindingContext bindingContext, DivStatePath divStatePath) {
        String str = faVar.E;
        if (str == null) {
            return;
        }
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(final izs<? super Long, s3q0> izsVar) {
                final DivSliderView divSliderView2 = DivSliderView.this;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbValueChanged(float f) {
                        Div2Logger div2Logger;
                        div2Logger = DivSliderBinder.this.logger;
                        div2Logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, Float.valueOf(f));
                        izsVar.invoke(Long.valueOf(an10.c(f)));
                    }
                });
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(Long l) {
                DivSliderView.this.setThumbValue(l != null ? l.longValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
            }
        }, divStatePath));
    }

    private final void observeTickMarkActiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final ukn uknVar) {
        applyTickMarkActiveStyle(divSliderView, expressionResolver, uknVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, uknVar, expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTickMarkActiveStyle$1
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
                DivSliderBinder.this.applyTickMarkActiveStyle(divSliderView, expressionResolver, uknVar);
            }
        });
    }

    private final void observeTickMarkInactiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final ukn uknVar) {
        applyTickMarkInactiveStyle(divSliderView, expressionResolver, uknVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, uknVar, expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTickMarkInactiveStyle$1
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
                DivSliderBinder.this.applyTickMarkInactiveStyle(divSliderView, expressionResolver, uknVar);
            }
        });
    }

    private final void observeTrackActiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final ukn uknVar) {
        applyTrackActiveStyle(divSliderView, expressionResolver, uknVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, uknVar, expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTrackActiveStyle$1
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
                DivSliderBinder.this.applyTrackActiveStyle(divSliderView, expressionResolver, uknVar);
            }
        });
    }

    private final void observeTrackInactiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final ukn uknVar) {
        applyTrackInactiveStyle(divSliderView, expressionResolver, uknVar);
        ExpressionSubscribersKt.observeDrawable(divSliderView, uknVar, expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTrackInactiveStyle$1
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
                DivSliderBinder.this.applyTrackInactiveStyle(divSliderView, expressionResolver, uknVar);
            }
        });
    }

    private final void setupRanges(final DivSliderView divSliderView, fa faVar, ExpressionResolver expressionResolver) {
        final DivSliderView divSliderView2;
        final ExpressionResolver expressionResolver2;
        divSliderView.getRanges().clear();
        List<fa.a> list = faVar.u;
        if (list == null) {
            return;
        }
        final DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
        for (fa.a aVar : list) {
            final SliderView.Range range = new SliderView.Range();
            divSliderView.getRanges().add(range);
            Expression<Long> expression = aVar.c;
            if (expression == null) {
                expression = faVar.s;
            }
            divSliderView.addSubscription(expression.observeAndGet(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                    invoke(l.longValue());
                    return s3q0.a;
                }

                public final void invoke(long j) {
                    DivSliderBinder.Companion unused;
                    unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView3 = DivSliderView.this;
                    range.setStartValue(j);
                    divSliderView3.requestLayout();
                    divSliderView3.invalidate();
                }
            }));
            Expression<Long> expression2 = aVar.a;
            if (expression2 == null) {
                expression2 = faVar.r;
            }
            divSliderView.addSubscription(expression2.observeAndGet(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                    invoke(l.longValue());
                    return s3q0.a;
                }

                public final void invoke(long j) {
                    DivSliderBinder.Companion unused;
                    unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView3 = DivSliderView.this;
                    range.setEndValue(j);
                    divSliderView3.requestLayout();
                    divSliderView3.invalidate();
                }
            }));
            final y3 y3Var = aVar.b;
            if (y3Var == null) {
                range.setMarginStart(0);
                range.setMarginEnd(0);
                divSliderView2 = divSliderView;
                expressionResolver2 = expressionResolver;
            } else {
                Expression<Long> expression3 = y3Var.b;
                Expression<Long> expression4 = y3Var.e;
                boolean z = (expression4 == null && expression3 == null) ? false : true;
                if (!z) {
                    expression4 = y3Var.c;
                }
                final Expression<Long> expression5 = expression4;
                if (!z) {
                    expression3 = y3Var.d;
                }
                final Expression<Long> expression6 = expression3;
                if (expression5 != null) {
                    divSliderView2 = divSliderView;
                    final DisplayMetrics displayMetrics2 = displayMetrics;
                    final ExpressionResolver expressionResolver3 = expressionResolver;
                    izs<Long, s3q0> izsVar = new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                            invoke(l.longValue());
                            return s3q0.a;
                        }

                        public final void invoke(long j) {
                            DivSliderBinder.Companion companion;
                            DivSliderBinder.Companion unused;
                            unused = DivSliderBinder.Companion;
                            DivSliderView divSliderView3 = DivSliderView.this;
                            SliderView.Range range2 = range;
                            y3 y3Var2 = y3Var;
                            ExpressionResolver expressionResolver4 = expressionResolver3;
                            DisplayMetrics displayMetrics3 = displayMetrics2;
                            companion = DivSliderBinder.Companion;
                            range2.setMarginStart(companion.applyUnit(y3Var2, j, expressionResolver4, displayMetrics3));
                            divSliderView3.requestLayout();
                            divSliderView3.invalidate();
                        }
                    };
                    expressionResolver2 = expressionResolver3;
                    displayMetrics = displayMetrics2;
                    divSliderView2.addSubscription(expression5.observe(expressionResolver2, izsVar));
                } else {
                    divSliderView2 = divSliderView;
                    expressionResolver2 = expressionResolver;
                }
                if (expression6 != null) {
                    final ExpressionResolver expressionResolver4 = expressionResolver2;
                    final DisplayMetrics displayMetrics3 = displayMetrics;
                    izs<Long, s3q0> izsVar2 = new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                            invoke(l.longValue());
                            return s3q0.a;
                        }

                        public final void invoke(long j) {
                            DivSliderBinder.Companion companion;
                            DivSliderBinder.Companion unused;
                            unused = DivSliderBinder.Companion;
                            DivSliderView divSliderView3 = DivSliderView.this;
                            SliderView.Range range2 = range;
                            y3 y3Var2 = y3Var;
                            ExpressionResolver expressionResolver5 = expressionResolver4;
                            DisplayMetrics displayMetrics4 = displayMetrics3;
                            companion = DivSliderBinder.Companion;
                            range2.setMarginEnd(companion.applyUnit(y3Var2, j, expressionResolver5, displayMetrics4));
                            divSliderView3.requestLayout();
                            divSliderView3.invalidate();
                        }
                    };
                    expressionResolver2 = expressionResolver4;
                    displayMetrics = displayMetrics3;
                    divSliderView2.addSubscription(expression6.observe(expressionResolver2, izsVar2));
                }
                Expression<DivSizeUnit> expression7 = y3Var.g;
                final DisplayMetrics displayMetrics4 = displayMetrics;
                izs<DivSizeUnit, s3q0> izsVar3 = new izs<DivSizeUnit, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(DivSizeUnit divSizeUnit) {
                        invoke2(divSizeUnit);
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DivSizeUnit divSizeUnit) {
                        DivSliderBinder.Companion companion;
                        DivSliderBinder.Companion companion2;
                        DivSliderBinder.Companion unused;
                        unused = DivSliderBinder.Companion;
                        DivSliderView divSliderView3 = DivSliderView.this;
                        Expression<Long> expression8 = expression5;
                        Expression<Long> expression9 = expression6;
                        SliderView.Range range2 = range;
                        ExpressionResolver expressionResolver5 = expressionResolver2;
                        DisplayMetrics displayMetrics5 = displayMetrics4;
                        if (expression8 != null) {
                            companion2 = DivSliderBinder.Companion;
                            range2.setMarginStart(companion2.castToUnit(expression8.evaluate(expressionResolver5).longValue(), divSizeUnit, displayMetrics5));
                        }
                        if (expression9 != null) {
                            companion = DivSliderBinder.Companion;
                            range2.setMarginEnd(companion.castToUnit(expression9.evaluate(expressionResolver5).longValue(), divSizeUnit, displayMetrics5));
                        }
                        divSliderView3.requestLayout();
                        divSliderView3.invalidate();
                    }
                };
                range = range;
                displayMetrics = displayMetrics4;
                expression7.observeAndGet(expressionResolver2, izsVar3);
            }
            ukn uknVar = aVar.d;
            if (uknVar == null) {
                uknVar = faVar.I;
            }
            final ukn uknVar2 = uknVar;
            izs<Object, s3q0> izsVar4 = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyActiveTrackStyle$1
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
                    DivSliderBinder.Companion unused;
                    unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView3 = DivSliderView.this;
                    range.setActiveTrackDrawable(DivUtilKt.toDrawable(uknVar2, displayMetrics, expressionResolver2));
                    divSliderView3.requestLayout();
                    divSliderView3.invalidate();
                }
            };
            s3q0 s3q0Var = s3q0.a;
            izsVar4.invoke(s3q0Var);
            ExpressionSubscribersKt.observeDrawable(divSliderView2, uknVar2, expressionResolver2, izsVar4);
            ukn uknVar3 = aVar.e;
            if (uknVar3 == null) {
                uknVar3 = faVar.J;
            }
            final ukn uknVar4 = uknVar3;
            izs<Object, s3q0> izsVar5 = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyInactiveTrackStyle$1
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
                    DivSliderBinder.Companion unused;
                    unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView3 = DivSliderView.this;
                    range.setInactiveTrackDrawable(DivUtilKt.toDrawable(uknVar4, displayMetrics, expressionResolver2));
                    divSliderView3.requestLayout();
                    divSliderView3.invalidate();
                }
            };
            izsVar5.invoke(s3q0Var);
            ExpressionSubscribersKt.observeDrawable(divSliderView2, uknVar4, expressionResolver2, izsVar5);
            divSliderView = divSliderView2;
            expressionResolver = expressionResolver2;
        }
    }

    private final void setupSecondaryThumb(DivSliderView divSliderView, fa faVar, BindingContext bindingContext, DivStatePath divStatePath) {
        String str = faVar.B;
        s3q0 s3q0Var = null;
        if (str == null) {
            divSliderView.setThumbSecondaryDrawable(null);
            divSliderView.setThumbSecondaryValue(null, false);
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        observeThumbSecondaryValue(divSliderView, str, bindingContext, divStatePath);
        ukn uknVar = faVar.z;
        if (uknVar != null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, uknVar);
            s3q0Var = s3q0.a;
        }
        if (s3q0Var == null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, faVar.C);
        }
        observeThumbSecondaryTextStyle(divSliderView, expressionResolver, faVar.A);
    }

    private final void setupThumb(DivSliderView divSliderView, fa faVar, BindingContext bindingContext, DivStatePath divStatePath) {
        observeThumbValue(divSliderView, faVar, bindingContext, divStatePath);
        observeThumbStyle(divSliderView, bindingContext.getExpressionResolver(), faVar.C);
        observeThumbTextStyle(divSliderView, bindingContext.getExpressionResolver(), faVar.D);
    }

    private final void setupTickMarks(DivSliderView divSliderView, fa faVar, ExpressionResolver expressionResolver) {
        observeTickMarkActiveStyle(divSliderView, expressionResolver, faVar.F);
        observeTickMarkInactiveStyle(divSliderView, expressionResolver, faVar.G);
    }

    private final void setupTrack(DivSliderView divSliderView, fa faVar, ExpressionResolver expressionResolver) {
        observeTrackActiveStyle(divSliderView, expressionResolver, faVar.I);
        observeTrackInactiveStyle(divSliderView, expressionResolver, faVar.J);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(final DivSliderView divSliderView, BindingContext bindingContext, fa faVar, fa faVar2, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        this.errorCollector = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSliderView.setInterceptionAngle(this.horizontalInterceptionAngle);
        divSliderView.addSubscription(faVar.s.observeAndGet(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                invoke(l.longValue());
                return s3q0.a;
            }

            public final void invoke(long j) {
                DivSliderView.this.setMinValue(j);
                this.checkSliderTicks(DivSliderView.this);
            }
        }));
        divSliderView.addSubscription(faVar.r.observeAndGet(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bind$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                invoke(l.longValue());
                return s3q0.a;
            }

            public final void invoke(long j) {
                DivSliderView.this.setMaxValue(j);
                this.checkSliderTicks(DivSliderView.this);
            }
        }));
        divSliderView.addSubscription(faVar.o.observeAndGet(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bind$3
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                DivSliderView.this.setInteractive(z);
            }
        }));
        divSliderView.clearOnThumbChangedListener();
        setupThumb(divSliderView, faVar, bindingContext, divStatePath);
        setupSecondaryThumb(divSliderView, faVar, bindingContext, divStatePath);
        setupTrack(divSliderView, faVar, expressionResolver);
        setupTickMarks(divSliderView, faVar, expressionResolver);
        setupRanges(divSliderView, faVar, expressionResolver);
    }
}
