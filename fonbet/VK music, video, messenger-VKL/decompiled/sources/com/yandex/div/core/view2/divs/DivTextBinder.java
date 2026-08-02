package com.yandex.div.core.view2.divs;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.ShadowData;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.div.internal.widget.TextViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.a;
import com.yandex.div2.ec;
import com.yandex.div2.f8;
import com.yandex.div2.g8;
import com.yandex.div2.ic;
import com.yandex.div2.n9;
import com.yandex.div2.pc;
import com.yandex.div2.q4;
import com.yandex.div2.q8;
import com.yandex.div2.rb;
import com.yandex.div2.s3;
import com.yandex.div2.s6;
import com.yandex.div2.sc;
import com.yandex.div2.va;
import com.yandex.div2.zb;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.bpn;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.jon;
import xsna.mq;
import xsna.s3q0;
import xsna.zkn;

/* compiled from: DivTextBinder.kt */
/* loaded from: classes7.dex */
public final class DivTextBinder extends DivViewBinder<a.p, DivText, DivLineHeightTextView> {
    private final boolean isHyphenationEnabled;
    private final SpannedTextBuilder spannedTextBuilder;
    private final DivTypefaceResolver typefaceResolver;

    /* compiled from: DivTextBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivLineStyle.values().length];
            try {
                iArr2[DivLineStyle.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DivLineStyle.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivRadialGradientRelativeRadius.Value.values().length];
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.NEAREST_CORNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.NEAREST_SIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivText.Truncate.values().length];
            try {
                iArr4[DivText.Truncate.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DivText.Truncate.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DivText.Truncate.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[DivText.Truncate.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public DivTextBinder(DivBaseBinder divBaseBinder, DivTypefaceResolver divTypefaceResolver, SpannedTextBuilder spannedTextBuilder, boolean z) {
        super(divBaseBinder);
        this.typefaceResolver = divTypefaceResolver;
        this.spannedTextBuilder = spannedTextBuilder;
        this.isHyphenationEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if ((r6 != null ? r6.evaluate(r7).booleanValue() : false) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyEllipsize(DivLineHeightTextView divLineHeightTextView, DivText divText, ExpressionResolver expressionResolver) {
        TextUtils.TruncateAt truncateAt;
        DivText.Truncate evaluate = divText.j0.evaluate(expressionResolver);
        int i = WhenMappings.$EnumSwitchMapping$3[evaluate.ordinal()];
        boolean z = true;
        if (i == 1) {
            truncateAt = null;
        } else if (i == 2) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i == 3) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            truncateAt = TextUtils.TruncateAt.END;
        }
        divLineHeightTextView.setEllipsisLocation(truncateAt);
        if (evaluate != DivText.Truncate.NONE) {
            Expression<Boolean> expression = divText.i;
        }
        z = false;
        divLineHeightTextView.setAutoEllipsize(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFontFeatureSettings(TextView textView, String str) {
        if (str == null || !(!drm0.N(str))) {
            str = null;
        }
        textView.setFontFeatureSettings(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHyphenation(TextView textView, String str) {
        if (TextViewsKt.checkHyphenationSupported()) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i = 0;
            if (this.isHyphenationEnabled && drm0.E(str, (char) 173)) {
                i = 1;
            }
            if (hyphenationFrequency != i) {
                textView.setHyphenationFrequency(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLinearTextGradientColor(final TextView textView, final long j, final Colormap colormap) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyLinearTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(LinearGradientDrawable.Companion.createLinearGradient(j, colormap.getColors(), colormap.getPositions(), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(LinearGradientDrawable.Companion.createLinearGradient(j, colormap.getColors(), colormap.getPositions(), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMaxLines(DivLineHeightTextView divLineHeightTextView, Div2View div2View, Long l, Long l2) {
        int i;
        AdaptiveMaxLines adaptiveMaxLines$div_release = divLineHeightTextView.getAdaptiveMaxLines$div_release();
        if (adaptiveMaxLines$div_release != null) {
            adaptiveMaxLines$div_release.reset();
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        if (l == null || l2 == null) {
            if (l != null) {
                long longValue = l.longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i2 = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        mq.a(longValue, "Unable convert '", "' to Int");
                    }
                    if (longValue > 0) {
                        i2 = Integer.MAX_VALUE;
                    }
                }
                i3 = i2;
            }
            divLineHeightTextView.setMaxLines(i3);
            return;
        }
        AdaptiveMaxLines adaptiveMaxLines = new AdaptiveMaxLines(divLineHeightTextView, div2View.getViewComponent$div_release().getDrawingPassOverrideStrategy());
        long longValue2 = l.longValue();
        long j2 = longValue2 >> 31;
        if (j2 == 0 || j2 == -1) {
            i = (int) longValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue2, "Unable convert '", "' to Int");
            }
            i = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue3 = l2.longValue();
        long j3 = longValue3 >> 31;
        if (j3 == 0 || j3 == -1) {
            i2 = (int) longValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue3, "Unable convert '", "' to Int");
            }
            if (longValue3 > 0) {
                i2 = Integer.MAX_VALUE;
            }
        }
        adaptiveMaxLines.apply(new AdaptiveMaxLines.Params(i, i2));
        divLineHeightTextView.setAdaptiveMaxLines$div_release(adaptiveMaxLines);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainEllipsis(DivLineHeightTextView divLineHeightTextView, String str) {
        if (str == null) {
            str = "…";
        }
        divLineHeightTextView.setEllipsis(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainText(TextView textView, BindingContext bindingContext, DivText divText) {
        textView.setText(this.spannedTextBuilder.buildPlainText(bindingContext, textView, divText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRadialTextGradientColor(final TextView textView, final RadialGradientDrawable.Radius radius, final RadialGradientDrawable.Center center, final RadialGradientDrawable.Center center2, final List<Integer> list) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRadialTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(RadialGradientDrawable.Companion.createRadialGradient(radius, center, center2, j5g.N0(list), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(RadialGradientDrawable.Companion.createRadialGradient(radius, center, center2, j5g.N0(list), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichEllipsis(final EllipsizedTextView ellipsizedTextView, BindingContext bindingContext, DivText divText) {
        DivText.a aVar = divText.p;
        if (aVar == null) {
            ellipsizedTextView.setEllipsis("…");
        } else {
            this.spannedTextBuilder.buildEllipsis(bindingContext, ellipsizedTextView, divText, aVar, new izs<Spanned, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRichEllipsis$1
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Spanned spanned) {
                    invoke2(spanned);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Spanned spanned) {
                    EllipsizedTextView.this.setEllipsis(spanned);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichText(final TextView textView, BindingContext bindingContext, DivText divText) {
        this.spannedTextBuilder.buildText(bindingContext, textView, divText, new izs<Spanned, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRichText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Spanned spanned) {
                invoke2(spanned);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Spanned spanned) {
                textView.setText(spanned, TextView.BufferType.NORMAL);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySelectable(TextView textView, boolean z) {
        MovementMethod movementMethod = textView.getMovementMethod();
        textView.setTextIsSelectable(z);
        if (movementMethod instanceof SelectableLinkMovementMethod) {
            textView.setMovementMethod(movementMethod);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStrikethrough(TextView textView, DivLineStyle divLineStyle) {
        int i = WhenMappings.$EnumSwitchMapping$1[divLineStyle.ordinal()];
        if (i == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        } else {
            if (i != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextAlignment(TextView textView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        textView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        int i = WhenMappings.$EnumSwitchMapping$0[divAlignmentHorizontal.ordinal()];
        int i2 = 5;
        if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3 || (i != 4 && i == 5)) {
                i2 = 6;
            }
        }
        textView.setTextAlignment(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextColor(TextView textView, int i, Integer num) {
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{num != null ? num.intValue() : i, i}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextShadow(TextView textView, ShadowData shadowData) {
        DivViewWrapper divViewWrapper;
        if (shadowData == null) {
            ViewParent parent = textView.getParent();
            divViewWrapper = parent instanceof DivViewWrapper ? (DivViewWrapper) parent : null;
            if (divViewWrapper != null) {
                divViewWrapper.setClipChildren(true);
                divViewWrapper.setClipToPadding(true);
            }
            textView.setClipToOutline(true);
            textView.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            return;
        }
        ViewParent parent2 = textView.getParent();
        divViewWrapper = parent2 instanceof DivViewWrapper ? (DivViewWrapper) parent2 : null;
        if (divViewWrapper != null) {
            divViewWrapper.setClipChildren(false);
            divViewWrapper.setClipToPadding(false);
        }
        textView.setClipToOutline(false);
        textView.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTightenWidth(DivLineHeightTextView divLineHeightTextView, boolean z) {
        divLineHeightTextView.setTightenWidth(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyUnderline(TextView textView, DivLineStyle divLineStyle) {
        int i = WhenMappings.$EnumSwitchMapping$1[divLineStyle.ordinal()];
        if (i == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        } else {
            if (i != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        }
    }

    private final void bindEllipsis(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        DivText.a aVar = divText.p;
        if ((aVar != null ? aVar.c : null) == null) {
            if ((aVar != null ? aVar.b : null) == null) {
                if ((aVar != null ? aVar.a : null) == null) {
                    bindPlainEllipsis(divLineHeightTextView, aVar, divText2 != null ? divText2.p : null, bindingContext.getExpressionResolver());
                    return;
                }
            }
        }
        bindRichEllipsis(divLineHeightTextView, bindingContext, divText);
    }

    private final void bindEllipsize(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        Expression<Boolean> expression = divText.i;
        Expression<Boolean> expression2 = divText.i;
        Expression<DivText.Truncate> expression3 = divText.j0;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.i : null)) {
            if (ExpressionsKt.equalsToConstant(expression3, divText2 != null ? divText2.j0 : null)) {
                return;
            }
        }
        applyEllipsize(divLineHeightTextView, divText, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(expression2) && ExpressionsKt.isConstant(expression3)) {
            return;
        }
        izs<? super Boolean, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindEllipsize$callback$1
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
                DivTextBinder.this.applyEllipsize(divLineHeightTextView, divText, expressionResolver);
            }
        };
        if (expression2 != null) {
            divLineHeightTextView.addSubscription(expression2.observe(expressionResolver, izsVar));
        }
        divLineHeightTextView.addSubscription(expression3.observe(expressionResolver, izsVar));
    }

    private final void bindFontFeatureSettings(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        Expression<String> expression = divText.u;
        Expression<String> expression2 = divText.u;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.u : null)) {
            return;
        }
        applyFontFeatureSettings(divLineHeightTextView, expression2 != null ? expression2.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression2)) {
            return;
        }
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindFontFeatureSettings$callback$1
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
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Expression<String> expression3 = divText.u;
                divTextBinder.applyFontFeatureSettings(divLineHeightTextView2, expression3 != null ? expression3.evaluate(expressionResolver) : null);
            }
        }) : null);
    }

    private final void bindFontSize(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeFontSize(divLineHeightTextView, divText.v, divText.w, divText2 != null ? divText2.v : null, divText2 != null ? divText2.w : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindLetterSpacing(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeLetterSpacing(divLineHeightTextView, divText.H, divText.v, divText2 != null ? divText2.H : null, divText2 != null ? divText2.v : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindLinearTextGradient(final DivLineHeightTextView divLineHeightTextView, final Div2View div2View, final s6 s6Var, rb rbVar, final ExpressionResolver expressionResolver) {
        if (rbVar instanceof rb.a) {
            rb.a aVar = (rb.a) rbVar;
            if (ExpressionsKt.equalsToConstant(s6Var.a, aVar.b.a) && ExpressionsKt.equalsToConstant(s6Var.c, aVar.b.c)) {
                List<s6.a> list = s6Var.b;
                List<s6.a> list2 = aVar.b.b;
                if (list == null && list2 == null) {
                    return;
                }
                if (list != null && list2 != null && list.size() == list2.size()) {
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (DivDataExtensionsKt.equalsToConstant((s6.a) obj, list2.get(i))) {
                            i = i2;
                        }
                    }
                    return;
                }
            }
        }
        Expression<Long> expression = s6Var.a;
        List<s6.a> list3 = s6Var.b;
        ExpressionList<Integer> expressionList = s6Var.c;
        Expression<Long> expression2 = s6Var.a;
        applyLinearTextGradientColor(divLineHeightTextView, expression.evaluate(expressionResolver).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(s6Var, expressionResolver), div2View));
        if (ExpressionsKt.isConstant(expression2) && ExpressionsKt.isConstantOrNull(expressionList)) {
            if (list3 != null) {
                List<s6.a> list4 = list3;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    return;
                }
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    if (!DivDataExtensionsKt.isConstant((s6.a) it.next())) {
                    }
                }
                return;
            }
            return;
        }
        izs<? super List<? extends Integer>, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindLinearTextGradient$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj2) {
                invoke2(obj2);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj2) {
                DivTextBinder.this.applyLinearTextGradientColor(divLineHeightTextView, s6Var.a.evaluate(expressionResolver).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(s6Var, expressionResolver), div2View));
            }
        };
        divLineHeightTextView.addSubscription(expression2.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, izsVar) : null);
        if (list3 != null) {
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                ExpressionSubscribersKt.observeColorPoint(divLineHeightTextView, (s6.a) it2.next(), expressionResolver, izsVar);
            }
        }
    }

    private final void bindMaxLines(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        Expression<Long> expression = divText.L;
        Expression<Long> expression2 = divText.L;
        Expression<Long> expression3 = divText.M;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.L : null)) {
            if (ExpressionsKt.equalsToConstant(expression3, divText2 != null ? divText2.M : null)) {
                return;
            }
        }
        applyMaxLines(divLineHeightTextView, bindingContext.getDivView(), expression2 != null ? expression2.evaluate(expressionResolver) : null, expression3 != null ? expression3.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression2) && ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindMaxLines$callback$1
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
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Div2View divView = bindingContext.getDivView();
                Expression<Long> expression4 = divText.L;
                Long evaluate = expression4 != null ? expression4.evaluate(expressionResolver) : null;
                Expression<Long> expression5 = divText.M;
                divTextBinder.applyMaxLines(divLineHeightTextView2, divView, evaluate, expression5 != null ? expression5.evaluate(expressionResolver) : null);
            }
        };
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, izsVar) : null);
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, izsVar) : null);
    }

    private final void bindPlainEllipsis(final DivLineHeightTextView divLineHeightTextView, DivText.a aVar, DivText.a aVar2, ExpressionResolver expressionResolver) {
        Expression<String> expression;
        Expression<String> expression2;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.d : null, aVar2 != null ? aVar2.d : null)) {
            return;
        }
        applyPlainEllipsis(divLineHeightTextView, (aVar == null || (expression2 = aVar.d) == null) ? null : expression2.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(aVar != null ? aVar.d : null)) {
            if (ExpressionsKt.isConstantOrNull(aVar != null ? aVar.d : null)) {
                return;
            }
        }
        if (aVar != null && (expression = aVar.d) != null) {
            disposable = expression.observe(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainEllipsis$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                    invoke2(str);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    DivTextBinder.this.applyPlainEllipsis(divLineHeightTextView, str);
                }
            });
        }
        divLineHeightTextView.addSubscription(disposable);
    }

    private final void bindPlainText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText, DivText divText2) {
        Expression<String> expression = divText.W;
        Expression<String> expression2 = divText.W;
        Expression<DivSizeUnit> expression3 = divText.w;
        Expression<Long> expression4 = divText.I;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.W : null)) {
            if (ExpressionsKt.equalsToConstant(expression4, divText2 != null ? divText2.I : null)) {
                if (ExpressionsKt.equalsToConstant(expression3, divText2 != null ? divText2.w : null)) {
                    List<zkn> list = divText.q;
                    List<zkn> list2 = divText2 != null ? divText2.q : null;
                    if (list == null && list2 == null) {
                        return;
                    }
                    if (list != null && list2 != null && list.size() == list2.size()) {
                        int i = 0;
                        for (Object obj : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            if (epx.f(((zkn) obj).a, list2.get(i).a)) {
                                i = i2;
                            }
                        }
                        return;
                    }
                }
            }
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        String evaluate = expression2.evaluate(expressionResolver);
        applyPlainText(divLineHeightTextView, bindingContext, divText);
        applyHyphenation(divLineHeightTextView, evaluate);
        if (ExpressionsKt.isConstant(expression2) && ExpressionsKt.isConstantOrNull(expression4) && ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        izs<? super String, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj2) {
                invoke2(obj2);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj2) {
                String evaluate2 = DivText.this.W.evaluate(expressionResolver);
                this.applyPlainText(divLineHeightTextView, bindingContext, DivText.this);
                this.applyHyphenation(divLineHeightTextView, evaluate2);
            }
        };
        divLineHeightTextView.addSubscription(expression2.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, izsVar) : null);
        divLineHeightTextView.addSubscription(expression3.observe(expressionResolver, izsVar));
    }

    private final void bindRadialTextGradient(final DivLineHeightTextView divLineHeightTextView, final f8 f8Var, rb rbVar, final ExpressionResolver expressionResolver) {
        List<Integer> list;
        if (rbVar instanceof rb.b) {
            rb.b bVar = (rb.b) rbVar;
            if (epx.f(f8Var.e, bVar.b.e) && epx.f(f8Var.a, bVar.b.a) && epx.f(f8Var.b, bVar.b.b) && ExpressionsKt.equalsToConstant(f8Var.d, bVar.b.d)) {
                return;
            }
        }
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        q8 q8Var = f8Var.e;
        ExpressionList<Integer> expressionList = f8Var.d;
        RadialGradientDrawable.Radius radialGradientDrawableRadius = toRadialGradientDrawableRadius(q8Var, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter = toRadialGradientDrawableCenter(f8Var.a, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter2 = toRadialGradientDrawableCenter(f8Var.b, displayMetrics, expressionResolver);
        if (expressionList == null || (list = expressionList.evaluate(expressionResolver)) == null) {
            list = EmptyList.b;
        }
        applyRadialTextGradientColor(divLineHeightTextView, radialGradientDrawableRadius, radialGradientDrawableCenter, radialGradientDrawableCenter2, list);
        if (ExpressionsKt.isConstantOrNull(expressionList)) {
            return;
        }
        divLineHeightTextView.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, new izs<List<? extends Integer>, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRadialTextGradient$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(List<? extends Integer> list2) {
                invoke2((List<Integer>) list2);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Integer> list2) {
                RadialGradientDrawable.Radius radialGradientDrawableRadius2;
                RadialGradientDrawable.Center radialGradientDrawableCenter3;
                RadialGradientDrawable.Center radialGradientDrawableCenter4;
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                radialGradientDrawableRadius2 = divTextBinder.toRadialGradientDrawableRadius(f8Var.e, displayMetrics, expressionResolver);
                radialGradientDrawableCenter3 = DivTextBinder.this.toRadialGradientDrawableCenter(f8Var.a, displayMetrics, expressionResolver);
                radialGradientDrawableCenter4 = DivTextBinder.this.toRadialGradientDrawableCenter(f8Var.b, displayMetrics, expressionResolver);
                divTextBinder.applyRadialTextGradientColor(divLineHeightTextView2, radialGradientDrawableRadius2, radialGradientDrawableCenter3, radialGradientDrawableCenter4, list2);
            }
        }) : null);
    }

    private final void bindRichEllipsis(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText) {
        va vaVar;
        Expression<Double> expression;
        va vaVar2;
        Expression<Integer> expression2;
        applyRichEllipsis(divLineHeightTextView, bindingContext, divText);
        DivText.a aVar = divText.p;
        if (aVar == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        izs<? super String, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichEllipsis$callback$1
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
                DivTextBinder.this.applyRichEllipsis(divLineHeightTextView, bindingContext, divText);
            }
        };
        divLineHeightTextView.addSubscription(aVar.d.observe(expressionResolver, izsVar));
        List<DivText.b> list = aVar.c;
        if (list != null) {
            for (DivText.b bVar : list) {
                Expression<Long> expression3 = bVar.q;
                ec ecVar = bVar.e;
                divLineHeightTextView.addSubscription(expression3.observe(expressionResolver, izsVar));
                Expression<Long> expression4 = bVar.f;
                divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, izsVar) : null);
                Expression<DivTextAlignmentVertical> expression5 = bVar.b;
                divLineHeightTextView.addSubscription(expression5 != null ? expression5.observe(expressionResolver, izsVar) : null);
                divLineHeightTextView.addSubscription(bVar.d.observe(expressionResolver, izsVar));
                Expression<Long> expression6 = bVar.i;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, izsVar) : null);
                divLineHeightTextView.addSubscription(bVar.j.observe(expressionResolver, izsVar));
                Expression<String> expression7 = bVar.g;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, izsVar) : null);
                Expression<DivFontWeight> expression8 = bVar.l;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, izsVar) : null);
                Expression<Long> expression9 = bVar.m;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, izsVar) : null);
                Expression<String> expression10 = bVar.h;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, izsVar) : null);
                Expression<Double> expression11 = bVar.n;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, izsVar) : null);
                Expression<Long> expression12 = bVar.o;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, izsVar) : null);
                Expression<DivLineStyle> expression13 = bVar.r;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, izsVar) : null);
                Expression<Integer> expression14 = bVar.s;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, izsVar) : null);
                Expression<Long> expression15 = bVar.u;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, izsVar) : null);
                Expression<DivLineStyle> expression16 = bVar.v;
                divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, izsVar) : null);
                zb zbVar = bVar.c;
                Object a = zbVar != null ? zbVar.a() : null;
                if (a instanceof bpn) {
                    divLineHeightTextView.addSubscription(((bpn) a).a.observe(expressionResolver, izsVar));
                }
                ic icVar = bVar.p;
                Object a2 = icVar != null ? icVar.a() : null;
                if (a2 instanceof sc) {
                    sc scVar = (sc) a2;
                    divLineHeightTextView.addSubscription(scVar.b.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(scVar.a.observe(expressionResolver, izsVar));
                } else if (a2 instanceof pc) {
                    pc pcVar = (pc) a2;
                    divLineHeightTextView.addSubscription(pcVar.d.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.a.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.b.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.c.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.e.b.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.e.a.observe(expressionResolver, izsVar));
                }
                divLineHeightTextView.addSubscription((ecVar == null || (vaVar2 = ecVar.b) == null || (expression2 = vaVar2.a) == null) ? null : expression2.observe(expressionResolver, izsVar));
                divLineHeightTextView.addSubscription((ecVar == null || (vaVar = ecVar.b) == null || (expression = vaVar.d) == null) ? null : expression.observe(expressionResolver, izsVar));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression<JSONObject> expression17 = bVar.k;
                    divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, izsVar) : null);
                }
            }
        }
        List<DivText.Image> list2 = aVar.b;
        if (list2 != null) {
            for (DivText.Image image : list2) {
                Expression<Long> expression18 = image.f;
                q4 q4Var = image.j;
                divLineHeightTextView.addSubscription(expression18.observe(expressionResolver, izsVar));
                divLineHeightTextView.addSubscription(image.i.observe(expressionResolver, izsVar));
                Expression<Integer> expression19 = image.g;
                divLineHeightTextView.addSubscription(expression19 != null ? expression19.observe(expressionResolver, izsVar) : null);
                divLineHeightTextView.addSubscription(q4Var.b.observe(expressionResolver, izsVar));
                divLineHeightTextView.addSubscription(q4Var.a.observe(expressionResolver, izsVar));
            }
        }
    }

    private final void bindRichText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText) {
        va vaVar;
        Expression<Double> expression;
        va vaVar2;
        Expression<Integer> expression2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyRichText(divLineHeightTextView, bindingContext, divText);
        applyHyphenation(divLineHeightTextView, divText.W.evaluate(expressionResolver));
        divLineHeightTextView.addSubscription(divText.W.observe(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                invoke2(str);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                DivTextBinder.this.applyRichText(divLineHeightTextView, bindingContext, divText);
                DivTextBinder.this.applyHyphenation(divLineHeightTextView, str);
            }
        }));
        izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$callback$1
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
                DivTextBinder.this.applyRichText(divLineHeightTextView, bindingContext, divText);
            }
        };
        divLineHeightTextView.addSubscription(divText.v.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription(divText.w.observe(expressionResolver, izsVar));
        Expression<String> expression3 = divText.t;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, izsVar) : null);
        Expression<Long> expression4 = divText.I;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, izsVar) : null);
        List<DivText.b> list = divText.Q;
        if (list != null) {
            for (DivText.b bVar : list) {
                Expression<Long> expression5 = bVar.q;
                ec ecVar = bVar.e;
                divLineHeightTextView.addSubscription(expression5.observe(expressionResolver, izsVar));
                Expression<Long> expression6 = bVar.f;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, izsVar) : null);
                Expression<DivTextAlignmentVertical> expression7 = bVar.b;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, izsVar) : null);
                divLineHeightTextView.addSubscription(bVar.d.observe(expressionResolver, izsVar));
                Expression<Long> expression8 = bVar.i;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, izsVar) : null);
                divLineHeightTextView.addSubscription(bVar.j.observe(expressionResolver, izsVar));
                Expression<String> expression9 = bVar.g;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, izsVar) : null);
                Expression<DivFontWeight> expression10 = bVar.l;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, izsVar) : null);
                Expression<Long> expression11 = bVar.m;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, izsVar) : null);
                Expression<String> expression12 = bVar.h;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, izsVar) : null);
                Expression<Double> expression13 = bVar.n;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, izsVar) : null);
                Expression<Long> expression14 = bVar.o;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, izsVar) : null);
                Expression<DivLineStyle> expression15 = bVar.r;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, izsVar) : null);
                Expression<Integer> expression16 = bVar.s;
                divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, izsVar) : null);
                Expression<Long> expression17 = bVar.u;
                divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, izsVar) : null);
                Expression<DivLineStyle> expression18 = bVar.v;
                divLineHeightTextView.addSubscription(expression18 != null ? expression18.observe(expressionResolver, izsVar) : null);
                zb zbVar = bVar.c;
                Object a = zbVar != null ? zbVar.a() : null;
                if (a instanceof bpn) {
                    divLineHeightTextView.addSubscription(((bpn) a).a.observe(expressionResolver, izsVar));
                }
                ic icVar = bVar.p;
                Object a2 = icVar != null ? icVar.a() : null;
                if (a2 instanceof sc) {
                    sc scVar = (sc) a2;
                    divLineHeightTextView.addSubscription(scVar.b.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(scVar.a.observe(expressionResolver, izsVar));
                } else if (a2 instanceof pc) {
                    pc pcVar = (pc) a2;
                    divLineHeightTextView.addSubscription(pcVar.d.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.a.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.b.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.c.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.e.b.observe(expressionResolver, izsVar));
                    divLineHeightTextView.addSubscription(pcVar.e.a.observe(expressionResolver, izsVar));
                }
                divLineHeightTextView.addSubscription((ecVar == null || (vaVar2 = ecVar.b) == null || (expression2 = vaVar2.a) == null) ? null : expression2.observe(expressionResolver, izsVar));
                divLineHeightTextView.addSubscription((ecVar == null || (vaVar = ecVar.b) == null || (expression = vaVar.d) == null) ? null : expression.observe(expressionResolver, izsVar));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression<JSONObject> expression19 = bVar.k;
                    divLineHeightTextView.addSubscription(expression19 != null ? expression19.observe(expressionResolver, izsVar) : null);
                }
            }
        }
        List<DivText.Image> list2 = divText.F;
        if (list2 != null) {
            for (DivText.Image image : list2) {
                Expression<Long> expression20 = image.f;
                q4 q4Var = image.j;
                divLineHeightTextView.addSubscription(expression20.observe(expressionResolver, izsVar));
                divLineHeightTextView.addSubscription(image.d.observe(expressionResolver, izsVar));
                divLineHeightTextView.addSubscription(image.i.observe(expressionResolver, izsVar));
                divLineHeightTextView.addSubscription(image.b.observe(expressionResolver, izsVar));
                Expression<Integer> expression21 = image.g;
                divLineHeightTextView.addSubscription(expression21 != null ? expression21.observe(expressionResolver, izsVar) : null);
                divLineHeightTextView.addSubscription(q4Var.b.observe(expressionResolver, izsVar));
                divLineHeightTextView.addSubscription(q4Var.a.observe(expressionResolver, izsVar));
            }
        }
    }

    private final void bindSelectable(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        Expression<Boolean> expression = divText.T;
        Expression<Boolean> expression2 = divText.T;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.T : null)) {
            return;
        }
        applySelectable(divLineHeightTextView, expression2.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(expression2)) {
            return;
        }
        divLineHeightTextView.addSubscription(expression2.observe(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindSelectable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                DivTextBinder.this.applySelectable(divLineHeightTextView, z);
            }
        }));
    }

    private final void bindStrikethrough(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        Expression<DivLineStyle> expression = divText.V;
        Expression<DivLineStyle> expression2 = divText.V;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.V : null)) {
            return;
        }
        applyStrikethrough(divLineHeightTextView, expression2.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(expression2)) {
            return;
        }
        divLineHeightTextView.addSubscription(expression2.observe(expressionResolver, new izs<DivLineStyle, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindStrikethrough$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(DivLineStyle divLineStyle) {
                invoke2(divLineStyle);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivLineStyle divLineStyle) {
                DivTextBinder.this.applyStrikethrough(divLineHeightTextView, divLineStyle);
            }
        }));
    }

    private final void bindText(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        if (divText.Q == null && divText.F == null) {
            bindPlainText(divLineHeightTextView, bindingContext, divText, divText2);
        } else {
            bindRichText(divLineHeightTextView, bindingContext, divText);
        }
    }

    private final void bindTextAlignment(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        Expression<DivAlignmentHorizontal> expression = divText.X;
        Expression<DivAlignmentHorizontal> expression2 = divText.X;
        Expression<DivAlignmentVertical> expression3 = divText.Y;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.X : null)) {
            if (ExpressionsKt.equalsToConstant(expression3, divText2 != null ? divText2.Y : null)) {
                return;
            }
        }
        applyTextAlignment(divLineHeightTextView, expression2.evaluate(expressionResolver), expression3.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(expression2) && ExpressionsKt.isConstant(expression3)) {
            return;
        }
        izs<? super DivAlignmentHorizontal, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextAlignment$callback$1
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
                DivTextBinder.this.applyTextAlignment(divLineHeightTextView, divText.X.evaluate(expressionResolver), divText.Y.evaluate(expressionResolver));
            }
        };
        divLineHeightTextView.addSubscription(expression2.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription(expression3.observe(expressionResolver, izsVar));
    }

    private final void bindTextColor(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        Expression<Integer> expression = divText.Z;
        Expression<Integer> expression2 = divText.Z;
        Expression<Integer> expression3 = divText.s;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.Z : null)) {
            if (ExpressionsKt.equalsToConstant(expression3, divText2 != null ? divText2.s : null)) {
                return;
            }
        }
        applyTextColor(divLineHeightTextView, expression2.evaluate(expressionResolver).intValue(), expression3 != null ? expression3.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstant(expression2) && ExpressionsKt.isConstantOrNull(expression3)) {
            return;
        }
        izs<? super Integer, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextColor$callback$1
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
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                int intValue = divText.Z.evaluate(expressionResolver).intValue();
                Expression<Integer> expression4 = divText.s;
                divTextBinder.applyTextColor(divLineHeightTextView2, intValue, expression4 != null ? expression4.evaluate(expressionResolver) : null);
            }
        };
        divLineHeightTextView.addSubscription(expression2.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, izsVar) : null);
    }

    private final void bindTextGradient(DivLineHeightTextView divLineHeightTextView, Div2View div2View, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        rb rbVar = divText.a0;
        if (rbVar == null) {
            divLineHeightTextView.getPaint().setShader(null);
        } else if (rbVar instanceof rb.a) {
            bindLinearTextGradient(divLineHeightTextView, div2View, ((rb.a) rbVar).b, divText2 != null ? divText2.a0 : null, expressionResolver);
        } else if (rbVar instanceof rb.b) {
            bindRadialTextGradient(divLineHeightTextView, ((rb.b) rbVar).b, divText2 != null ? divText2.a0 : null, expressionResolver);
        }
    }

    private final void bindTextShadow(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        jon jonVar;
        s3 s3Var;
        Expression<DivSizeUnit> expression;
        jon jonVar2;
        s3 s3Var2;
        Expression<Double> expression2;
        jon jonVar3;
        s3 s3Var3;
        Expression<DivSizeUnit> expression3;
        jon jonVar4;
        s3 s3Var4;
        Expression<Double> expression4;
        Expression<Long> expression5;
        Expression<Integer> expression6;
        Expression<Double> expression7;
        jon jonVar5;
        s3 s3Var5;
        jon jonVar6;
        s3 s3Var6;
        jon jonVar7;
        s3 s3Var7;
        jon jonVar8;
        s3 s3Var8;
        n9 n9Var;
        jon jonVar9;
        s3 s3Var9;
        jon jonVar10;
        s3 s3Var10;
        n9 n9Var2;
        jon jonVar11;
        s3 s3Var11;
        jon jonVar12;
        s3 s3Var12;
        n9 n9Var3;
        jon jonVar13;
        s3 s3Var13;
        jon jonVar14;
        s3 s3Var14;
        n9 n9Var4;
        jon jonVar15;
        s3 s3Var15;
        jon jonVar16;
        s3 s3Var16;
        n9 n9Var5;
        n9 n9Var6;
        n9 n9Var7;
        n9 n9Var8 = divText.b0;
        n9 n9Var9 = divText.b0;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(n9Var8 != null ? n9Var8.a : null, (divText2 == null || (n9Var7 = divText2.b0) == null) ? null : n9Var7.a)) {
            if (ExpressionsKt.equalsToConstant(n9Var9 != null ? n9Var9.b : null, (divText2 == null || (n9Var6 = divText2.b0) == null) ? null : n9Var6.b)) {
                if (ExpressionsKt.equalsToConstant(n9Var9 != null ? n9Var9.c : null, (divText2 == null || (n9Var5 = divText2.b0) == null) ? null : n9Var5.c)) {
                    if (ExpressionsKt.equalsToConstant((n9Var9 == null || (jonVar16 = n9Var9.d) == null || (s3Var16 = jonVar16.a) == null) ? null : s3Var16.b, (divText2 == null || (n9Var4 = divText2.b0) == null || (jonVar15 = n9Var4.d) == null || (s3Var15 = jonVar15.a) == null) ? null : s3Var15.b)) {
                        if (ExpressionsKt.equalsToConstant((n9Var9 == null || (jonVar14 = n9Var9.d) == null || (s3Var14 = jonVar14.a) == null) ? null : s3Var14.a, (divText2 == null || (n9Var3 = divText2.b0) == null || (jonVar13 = n9Var3.d) == null || (s3Var13 = jonVar13.a) == null) ? null : s3Var13.a)) {
                            if (ExpressionsKt.equalsToConstant((n9Var9 == null || (jonVar12 = n9Var9.d) == null || (s3Var12 = jonVar12.b) == null) ? null : s3Var12.b, (divText2 == null || (n9Var2 = divText2.b0) == null || (jonVar11 = n9Var2.d) == null || (s3Var11 = jonVar11.b) == null) ? null : s3Var11.b)) {
                                if (ExpressionsKt.equalsToConstant((n9Var9 == null || (jonVar10 = n9Var9.d) == null || (s3Var10 = jonVar10.b) == null) ? null : s3Var10.a, (divText2 == null || (n9Var = divText2.b0) == null || (jonVar9 = n9Var.d) == null || (s3Var9 = jonVar9.b) == null) ? null : s3Var9.a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        final n9 n9Var10 = divText.b0;
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        applyTextShadow(divLineHeightTextView, n9Var10 != null ? getShadowData(n9Var10, expressionResolver, displayMetrics, divText.Z.evaluate(expressionResolver).intValue()) : null);
        if (ExpressionsKt.isConstantOrNull(n9Var9 != null ? n9Var9.a : null)) {
            if (ExpressionsKt.isConstantOrNull(n9Var9 != null ? n9Var9.b : null)) {
                if (ExpressionsKt.isConstantOrNull(n9Var9 != null ? n9Var9.c : null)) {
                    if (ExpressionsKt.isConstantOrNull((n9Var9 == null || (jonVar8 = n9Var9.d) == null || (s3Var8 = jonVar8.a) == null) ? null : s3Var8.b)) {
                        if (ExpressionsKt.isConstantOrNull((n9Var9 == null || (jonVar7 = n9Var9.d) == null || (s3Var7 = jonVar7.a) == null) ? null : s3Var7.a)) {
                            if (ExpressionsKt.isConstantOrNull((n9Var9 == null || (jonVar6 = n9Var9.d) == null || (s3Var6 = jonVar6.b) == null) ? null : s3Var6.b)) {
                                if (ExpressionsKt.isConstantOrNull((n9Var9 == null || (jonVar5 = n9Var9.d) == null || (s3Var5 = jonVar5.b) == null) ? null : s3Var5.a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        izs<? super DivSizeUnit, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextShadow$callback$1
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
                ShadowData shadowData;
                DivTextBinder divTextBinder = DivTextBinder.this;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                n9 n9Var11 = n9Var10;
                if (n9Var11 != null) {
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    shadowData = divTextBinder.getShadowData(n9Var11, expressionResolver2, displayMetrics, divText.Z.evaluate(expressionResolver2).intValue());
                } else {
                    shadowData = null;
                }
                divTextBinder.applyTextShadow(divLineHeightTextView2, shadowData);
            }
        };
        divLineHeightTextView.addSubscription((n9Var10 == null || (expression7 = n9Var10.a) == null) ? null : expression7.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription((n9Var10 == null || (expression6 = n9Var10.c) == null) ? null : expression6.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription((n9Var10 == null || (expression5 = n9Var10.b) == null) ? null : expression5.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription((n9Var10 == null || (jonVar4 = n9Var10.d) == null || (s3Var4 = jonVar4.a) == null || (expression4 = s3Var4.b) == null) ? null : expression4.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription((n9Var10 == null || (jonVar3 = n9Var10.d) == null || (s3Var3 = jonVar3.a) == null || (expression3 = s3Var3.a) == null) ? null : expression3.observe(expressionResolver, izsVar));
        divLineHeightTextView.addSubscription((n9Var10 == null || (jonVar2 = n9Var10.d) == null || (s3Var2 = jonVar2.b) == null || (expression2 = s3Var2.b) == null) ? null : expression2.observe(expressionResolver, izsVar));
        if (n9Var10 != null && (jonVar = n9Var10.d) != null && (s3Var = jonVar.b) != null && (expression = s3Var.a) != null) {
            disposable = expression.observe(expressionResolver, izsVar);
        }
        divLineHeightTextView.addSubscription(disposable);
    }

    private final void bindTightenWidth(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        Expression<Boolean> expression = divText.c0;
        Expression<Boolean> expression2 = divText.c0;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.c0 : null)) {
            return;
        }
        applyTightenWidth(divLineHeightTextView, expression2.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(expression2)) {
            return;
        }
        divLineHeightTextView.addSubscription(expression2.observe(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTightenWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                DivTextBinder.this.applyTightenWidth(divLineHeightTextView, z);
            }
        }));
    }

    private final void bindTypeface(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeTypeface(divLineHeightTextView, divText.t, divText.y, divText.z, divText.x, divText2 != null ? divText2.t : null, divText2 != null ? divText2.y : null, divText2 != null ? divText2.z : null, divText2 != null ? divText2.x : null, divText2, this.typefaceResolver, expressionResolver);
    }

    private final void bindUnderline(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        Expression<DivLineStyle> expression = divText.k0;
        Expression<DivLineStyle> expression2 = divText.k0;
        if (ExpressionsKt.equalsToConstant(expression, divText2 != null ? divText2.k0 : null)) {
            return;
        }
        applyUnderline(divLineHeightTextView, expression2.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(expression2)) {
            return;
        }
        divLineHeightTextView.addSubscription(expression2.observe(expressionResolver, new izs<DivLineStyle, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindUnderline$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(DivLineStyle divLineStyle) {
                invoke2(divLineStyle);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivLineStyle divLineStyle) {
                DivTextBinder.this.applyUnderline(divLineHeightTextView, divLineStyle);
            }
        }));
    }

    private final void configureView(BindingContext bindingContext, DivLineHeightTextView divLineHeightTextView) {
        divLineHeightTextView.setDrawingPassOverrideStrategy$div_release(bindingContext.getDivView().getViewComponent$div_release().getDrawingPassOverrideStrategy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRealTextWidth(TextView textView) {
        return Math.min((textView.getWidth() - textView.getPaddingRight()) - textView.getPaddingLeft(), (int) textView.getPaint().measureText(textView.getText().toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShadowData getShadowData(n9 n9Var, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics, int i) {
        float dpToPxF = BaseDivViewExtensionsKt.dpToPxF(n9Var.b.evaluate(expressionResolver), displayMetrics);
        jon jonVar = n9Var.d;
        float px = BaseDivViewExtensionsKt.toPx(jonVar.a, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(jonVar.b, displayMetrics, expressionResolver);
        Paint paint = new Paint();
        paint.setColor(n9Var.c.evaluate(expressionResolver).intValue());
        paint.setAlpha((int) (n9Var.a.evaluate(expressionResolver).doubleValue() * (i >>> 24)));
        return new ShadowData(px, px2, dpToPxF, paint.getColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Center toRadialGradientDrawableCenter(g8 g8Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (g8Var instanceof g8.a) {
            return new RadialGradientDrawable.Center.Fixed(BaseDivViewExtensionsKt.dpToPxF(((g8.a) g8Var).b.b.evaluate(expressionResolver), displayMetrics));
        }
        if (g8Var instanceof g8.b) {
            return new RadialGradientDrawable.Center.Relative((float) ((g8.b) g8Var).b.a.evaluate(expressionResolver).doubleValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius(q8 q8Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        RadialGradientDrawable.Radius.Relative.Type type;
        if (q8Var instanceof q8.a) {
            return new RadialGradientDrawable.Radius.Fixed(BaseDivViewExtensionsKt.dpToPxF(((q8.a) q8Var).b.b.evaluate(expressionResolver), displayMetrics));
        }
        if (!(q8Var instanceof q8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = WhenMappings.$EnumSwitchMapping$2[((q8.b) q8Var).b.a.evaluate(expressionResolver).ordinal()];
        if (i == 1) {
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
        } else if (i == 2) {
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
        } else if (i == 3) {
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
        }
        return new RadialGradientDrawable.Radius.Relative(type);
    }

    private final void updateFocusableState(View view, DivText divText) {
        view.setFocusable(view.isFocusable() || divText.s != null);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        configureView(bindingContext, divLineHeightTextView);
        BaseDivViewExtensionsKt.applyDivActions(divLineHeightTextView, bindingContext, divText.b, divText.d, divText.J, divText.o, divText.D, divText.C, divText.P, divText.O, divText.c, divText.l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        bindTypeface(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextAlignment(divLineHeightTextView, divText, divText2, expressionResolver);
        bindFontSize(divLineHeightTextView, divText, divText2, expressionResolver);
        bindLetterSpacing(divLineHeightTextView, divText, divText2, expressionResolver);
        bindFontFeatureSettings(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextColor(divLineHeightTextView, divText, divText2, expressionResolver);
        bindUnderline(divLineHeightTextView, divText, divText2, expressionResolver);
        bindStrikethrough(divLineHeightTextView, divText, divText2, expressionResolver);
        bindMaxLines(divLineHeightTextView, bindingContext, divText, divText2, expressionResolver);
        bindText(divLineHeightTextView, bindingContext, divText, divText2);
        bindEllipsis(divLineHeightTextView, bindingContext, divText, divText2);
        bindEllipsize(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextGradient(divLineHeightTextView, bindingContext.getDivView(), divText, divText2, expressionResolver);
        bindTextShadow(divLineHeightTextView, divText, divText2, expressionResolver);
        bindSelectable(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTightenWidth(divLineHeightTextView, divText, divText2, expressionResolver);
        updateFocusableState(divLineHeightTextView, divText);
    }
}
