package com.yandex.div.core.view2.spannable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextViewKt;
import com.yandex.div.core.view2.spannable.ImageSpan;
import com.yandex.div.core.view2.spannable.MaskData;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.spannable.LetterSpacingSpan;
import com.yandex.div.internal.spannable.NoStrikethroughSpan;
import com.yandex.div.internal.spannable.NoUnderlineSpan;
import com.yandex.div.internal.spannable.TextColorSpan;
import com.yandex.div.internal.spannable.TypefaceSpan;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.ec;
import com.yandex.div2.ic;
import com.yandex.div2.n9;
import com.yandex.div2.pc;
import com.yandex.div2.sc;
import com.yandex.div2.zb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.e9e0;
import xsna.epx;
import xsna.fpf0;
import xsna.g5g;
import xsna.hk;
import xsna.iut0;
import xsna.izs;
import xsna.j5g;
import xsna.jon;
import xsna.jw5;
import xsna.mq;
import xsna.oa01;
import xsna.rl3;
import xsna.ro;
import xsna.s3q0;
import xsna.uik0;
import xsna.zcl;

/* compiled from: SpannedTextBuilder.kt */
/* loaded from: classes7.dex */
public final class SpannedTextBuilder {
    private static final Companion Companion = new Companion(null);
    private final boolean debugFontMetrics;
    private final DivImageLoader imageLoader;
    private final Paint tempPaint = new Paint();
    private final DivTypefaceResolver typefaceResolver;

    /* compiled from: SpannedTextBuilder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: SpannedTextBuilder.kt */
    public static final class ImageDownloadCallbackImpl extends DivIdLoggingImageDownloadCallback {
        private final BindingContext bindingContext;
        private final DivText.Image image;
        private final ImageSpan imageSpan;
        private final Spanned spannedText;
        private final izs<Spanned, s3q0> textConsumer;

        /* JADX WARN: Multi-variable type inference failed */
        public ImageDownloadCallbackImpl(BindingContext bindingContext, DivText.Image image, ImageSpan imageSpan, Spanned spanned, izs<? super Spanned, s3q0> izsVar) {
            super(bindingContext.getDivView());
            this.bindingContext = bindingContext;
            this.image = image;
            this.imageSpan = imageSpan;
            this.spannedText = spanned;
            this.textConsumer = izsVar;
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(CachedBitmap cachedBitmap) {
            super.onSuccess(cachedBitmap);
            Resources resources = this.bindingContext.getDivView().getResources();
            ExpressionResolver expressionResolver = this.bindingContext.getExpressionResolver();
            Expression<Integer> expression = this.image.g;
            Integer evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            PorterDuff.Mode porterDuffMode = DivUtilKt.toPorterDuffMode(this.image.h.evaluate(expressionResolver));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, cachedBitmap.getBitmap());
            if (evaluate != null) {
                bitmapDrawable.setColorFilter(new PorterDuffColorFilter(evaluate.intValue(), porterDuffMode));
            }
            this.imageSpan.setImage(bitmapDrawable);
            izs<Spanned, s3q0> izsVar = this.textConsumer;
            if (izsVar != null) {
                izsVar.invoke(this.spannedText);
            }
        }
    }

    /* compiled from: SpannedTextBuilder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivText.Image.IndexingDirection.values().length];
            try {
                iArr[DivText.Image.IndexingDirection.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivText.Image.IndexingDirection.REVERSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivLineStyle.values().length];
            try {
                iArr2[DivLineStyle.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DivLineStyle.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivText.Image.Accessibility.Type.values().length];
            try {
                iArr3[DivText.Image.Accessibility.Type.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.AUTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivTextAlignmentVertical.values().length];
            try {
                iArr4[DivTextAlignmentVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[DivTextAlignmentVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[DivTextAlignmentVertical.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DivTextAlignmentVertical.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public SpannedTextBuilder(DivTypefaceResolver divTypefaceResolver, DivImageLoader divImageLoader) {
        this.typefaceResolver = divTypefaceResolver;
        this.imageLoader = divImageLoader;
    }

    private final void addActionSpan(BindingContext bindingContext, TextView textView, Spannable spannable, int i, int i2, List<DivAction> list) {
        List<DivAction> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        textView.setMovementMethod(SelectableLinkMovementMethod.INSTANCE);
        spannable.setSpan(new PerformActionSpan(bindingContext, list), i, i2, 33);
        hk d = iut0.d(textView);
        if (d == null) {
            d = new hk();
        }
        iut0.q(textView, d);
    }

    private final void addDecorationSpan(BindingContext bindingContext, TextView textView, Spannable spannable, int i, int i2, ec ecVar, zb zbVar) {
        if (ecVar == null && zbVar == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivBackgroundSpan divBackgroundSpan = new DivBackgroundSpan(ecVar, zbVar);
        if (textView instanceof DivLineHeightTextView) {
            DivLineHeightTextView divLineHeightTextView = (DivLineHeightTextView) textView;
            if (DivLineHeightTextViewKt.hasBackgroundSpan(divLineHeightTextView, spannable, divBackgroundSpan, i, i2, expressionResolver)) {
                return;
            }
            spannable.setSpan(divBackgroundSpan, i, i2, 33);
            DivTextRangesBackgroundHelper textRoundedBgHelper$div_release = divLineHeightTextView.getTextRoundedBgHelper$div_release();
            if (textRoundedBgHelper$div_release != null) {
                textRoundedBgHelper$div_release.addBackgroundSpan$div_release(divBackgroundSpan);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImageSpan addImageSpan(BindingContext bindingContext, TextView textView, Spannable spannable, TextData textData, DivText.Image image) {
        ImageSpan.Accessibility accessibility;
        String str;
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int imagePosition = imagePosition(textData.getTextLength(), image, expressionResolver);
        int px = BaseDivViewExtensionsKt.toPx(image.j, displayMetrics, expressionResolver);
        int px2 = BaseDivViewExtensionsKt.toPx(image.c, displayMetrics, expressionResolver);
        Integer lineHeight = textData.getLineHeight();
        int intValue = lineHeight != null ? lineHeight.intValue() : 0;
        TextVerticalAlignment textVerticalAlignment = toTextVerticalAlignment(image.b.evaluate(expressionResolver));
        DivText.Image.Accessibility accessibility2 = image.a;
        if (accessibility2 != null) {
            int i = WhenMappings.$EnumSwitchMapping$2[accessibility2.b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    str = fpf0.a(Button.class).h();
                } else if (i == 3) {
                    str = fpf0.a(ImageView.class).h();
                } else if (i == 4) {
                    str = fpf0.a(TextView.class).h();
                } else if (i == 5) {
                    str = fpf0.a(ImageView.class).h();
                }
                Expression<String> expression = accessibility2.a;
                String evaluate = expression == null ? expression.evaluate(expressionResolver) : null;
                List<DivAction> actionsForPosition = getActionsForPosition(bindingContext, spannable, imagePosition);
                accessibility = new ImageSpan.Accessibility(str, evaluate, actionsForPosition == null ? new uik0(divView, bindingContext, textView, actionsForPosition) : null);
            }
            str = null;
            Expression<String> expression2 = accessibility2.a;
            if (expression2 == null) {
            }
            List<DivAction> actionsForPosition2 = getActionsForPosition(bindingContext, spannable, imagePosition);
            accessibility = new ImageSpan.Accessibility(str, evaluate, actionsForPosition2 == null ? new uik0(divView, bindingContext, textView, actionsForPosition2) : null);
        } else {
            accessibility = null;
        }
        ImageSpan imageSpan = new ImageSpan(null, px, px2, intValue, textVerticalAlignment, accessibility);
        spannable.setSpan(imageSpan, imagePosition, imagePosition + 1, 33);
        DivLineHeightTextView divLineHeightTextView = textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null;
        if (divLineHeightTextView != null) {
            divLineHeightTextView.addImageSpan$div_release(imageSpan);
        }
        return imageSpan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addImageSpan$lambda$22$lambda$21$lambda$20(Div2View div2View, BindingContext bindingContext, TextView textView, List list) {
        div2View.getDiv2Component$div_release().getActionBinder().handleTapClick$div_release(bindingContext, textView, list);
    }

    private final void addSpan(final TextView textView, Spannable spannable, TextData textData, SpanData spanData) {
        int start = spanData.getStart();
        int end = spanData.getEnd();
        if (start > end) {
            return;
        }
        DivTextAlignmentVertical alignmentVertical = spanData.getAlignmentVertical();
        if (alignmentVertical == null) {
            alignmentVertical = DivTextAlignmentVertical.BASELINE;
        }
        int baselineOffset = spanData.getBaselineOffset();
        if (baselineOffset != 0) {
            Integer lineHeight = spanData.getLineHeight();
            spannable.setSpan(new BaselineShiftSpan(baselineOffset, (lineHeight == null && (lineHeight = textData.getLineHeight()) == null) ? 0 : lineHeight.intValue()), start, end, 33);
        } else if (alignmentVertical != DivTextAlignmentVertical.BASELINE) {
            Integer fontSize = spanData.getFontSize();
            spannable.setSpan(new VerticalAlignmentSpan(fontSize != null ? fontSize.intValue() : 0, toTextVerticalAlignment(alignmentVertical), new e9e0() { // from class: xsna.tik0
                @Override // xsna.e9e0
                public final Object get() {
                    Layout layout;
                    layout = textView.getLayout();
                    return layout;
                }
            }), start, end, 33);
        }
        Integer fontSize2 = spanData.getFontSize();
        if (fontSize2 != null) {
            int intValue = fontSize2.intValue();
            Integer lineHeight2 = spanData.getLineHeight();
            spannable.setSpan(new FontSizeSpan(intValue, (lineHeight2 == null && (lineHeight2 = textData.getLineHeight()) == null) ? 0 : lineHeight2.intValue()), start, end, 33);
        }
        String fontFeatureSettings = spanData.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            spannable.setSpan(new FontFeatureSpan(fontFeatureSettings), start, end, 33);
        }
        Integer textColor = spanData.getTextColor();
        if (textColor != null) {
            spannable.setSpan(new TextColorSpan(textColor.intValue()), start, end, 33);
        }
        Double letterSpacing = spanData.getLetterSpacing();
        if (letterSpacing != null) {
            spannable.setSpan(new LetterSpacingSpan((float) letterSpacing.doubleValue()), start, end, 33);
        }
        DivLineStyle strike = spanData.getStrike();
        if (strike != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[strike.ordinal()];
            if (i == 1) {
                spannable.setSpan(new StrikethroughSpan(), start, end, 33);
            } else if (i == 2) {
                spannable.setSpan(new NoStrikethroughSpan(), start, end, 33);
            }
        }
        DivLineStyle underline = spanData.getUnderline();
        if (underline != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[underline.ordinal()];
            if (i2 == 1) {
                spannable.setSpan(new UnderlineSpan(), start, end, 33);
            } else if (i2 == 2) {
                spannable.setSpan(new NoUnderlineSpan(), start, end, 33);
            }
        }
        DivTypefaceResolver divTypefaceResolver = this.typefaceResolver;
        String fontFamily = spanData.getFontFamily();
        if (fontFamily == null) {
            fontFamily = textData.getFontFamily();
        }
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(fontFamily);
        if (spanData.getFontFamily() != null || spanData.getFontWeight() != null || spanData.getFontWeightValue() != null) {
            spannable.setSpan(new TypefaceSpan(DivTypefaceResolverKt.getTypeface((spanData.getFontWeight() == null && spanData.getFontWeightValue() == null) ? DivTypefaceResolverKt.getTypefaceValue(textData.getFontWeight(), textData.getFontWeightValue()) : DivTypefaceResolverKt.getTypefaceValue(spanData.getFontWeight(), spanData.getFontWeightValue()), typefaceProvider)), start, end, 33);
        }
        if (TextViewExtensionsKt.getSupportFontVariations() && typefaceProvider.isVariable() && (spanData.getFontWeight() != null || spanData.getFontWeightValue() != null || spanData.getFontVariationSettings() != null)) {
            spannable.setSpan(new FontVariationSpan(TextViewExtensionsKt.getFontVariations(spanData.getFontWeight(), spanData.getFontWeightValue(), spanData.getFontVariationSettings())), start, end, 33);
        }
        if (spanData.getLineHeight() != null || spanData.getTopOffset() != null) {
            int i3 = epx.f(spanData.getLineHeight(), textData.getLineHeight()) ? 18 : 33;
            Integer topOffset = spanData.getTopOffset();
            int intValue2 = topOffset != null ? topOffset.intValue() : 0;
            Integer lineHeight3 = spanData.getLineHeight();
            int intValue3 = lineHeight3 != null ? lineHeight3.intValue() : 0;
            Integer topOffsetStart = spanData.getTopOffsetStart();
            int intValue4 = topOffsetStart != null ? topOffsetStart.intValue() : start;
            Integer topOffsetEnd = spanData.getTopOffsetEnd();
            spannable.setSpan(new LineHeightWithTopOffsetSpan(intValue2, intValue3, intValue4, topOffsetEnd != null ? topOffsetEnd.intValue() : end), start, end, i3);
        }
        ShadowData textShadow = spanData.getTextShadow();
        if (textShadow != null) {
            spannable.setSpan(new ShadowSpan(textShadow), start, end, 33);
        }
        MaskData mask = spanData.getMask();
        if (mask != null) {
            if (mask instanceof MaskData.Particles) {
                if (((MaskData.Particles) mask).isEnabled()) {
                    spannable.setSpan(new MaskSpan(mask, textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null), start, end, 33);
                }
            } else if ((mask instanceof MaskData.Solid) && ((MaskData.Solid) mask).isEnabled()) {
                spannable.setSpan(new MaskSpan(mask, textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null), start, end, 33);
            }
        }
    }

    private final MaskData createMaskData(Context context, BindingContext bindingContext, ic icVar) {
        if (icVar == null) {
            return null;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (icVar instanceof ic.a) {
            pc pcVar = ((ic.a) icVar).b;
            long longValue = pcVar.e.b.evaluate(expressionResolver).longValue();
            return new MaskData.Particles(pcVar.a.evaluate(expressionResolver).intValue(), (float) pcVar.b.evaluate(expressionResolver).doubleValue(), pcVar.c.evaluate(expressionResolver).booleanValue(), pcVar.d.evaluate(expressionResolver).booleanValue(), BaseDivViewExtensionsKt.unitToPxF(Long.valueOf(longValue), displayMetrics, pcVar.e.a.evaluate(expressionResolver)));
        }
        if (!(icVar instanceof ic.b)) {
            throw new NoWhenBranchMatchedException();
        }
        sc scVar = ((ic.b) icVar).b;
        return new MaskData.Solid(scVar.a.evaluate(expressionResolver).intValue(), scVar.b.evaluate(expressionResolver).booleanValue());
    }

    private final ShadowData createShadowData(Context context, BindingContext bindingContext, n9 n9Var, int i) {
        if (n9Var == null) {
            return null;
        }
        jon jonVar = n9Var.d;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        float dpToPxF = BaseDivViewExtensionsKt.dpToPxF(n9Var.b.evaluate(expressionResolver), displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(jonVar.a, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(jonVar.b, displayMetrics, expressionResolver);
        Paint paint = this.tempPaint;
        paint.setColor(n9Var.c.evaluate(expressionResolver).intValue());
        paint.setAlpha((int) (n9Var.a.evaluate(expressionResolver).doubleValue() * (i >>> 24)));
        return new ShadowData(px, px2, dpToPxF, paint.getColor());
    }

    private final SpanData createSpanData(Context context, BindingContext bindingContext, TextData textData, DivText.b bVar, int i, int i2) {
        Integer num;
        long j;
        Integer num2;
        Double d;
        Integer num3;
        int i3;
        int i4;
        int i5;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int fontSizeValue = textData.getFontSizeValue();
        Expression<Long> expression = bVar.i;
        Expression<Long> expression2 = bVar.u;
        if (expression != null) {
            long longValue = expression.evaluate(expressionResolver).longValue();
            long j2 = longValue >> 31;
            if (j2 == 0 || j2 == -1) {
                i5 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i5 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i5);
        } else {
            num = null;
        }
        DivSizeUnit evaluate = bVar.j.evaluate(expressionResolver);
        Expression<DivTextAlignmentVertical> expression3 = bVar.b;
        DivTextAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        int unitToPx = BaseDivViewExtensionsKt.unitToPx(bVar.d.evaluate(expressionResolver), displayMetrics, evaluate);
        Expression<String> expression4 = bVar.g;
        String evaluate3 = expression4 != null ? expression4.evaluate(expressionResolver) : null;
        Expression<String> expression5 = bVar.h;
        String evaluate4 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Integer valueOf = num != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(num, displayMetrics, evaluate)) : null;
        Expression<DivFontWeight> expression6 = bVar.l;
        DivFontWeight evaluate5 = expression6 != null ? expression6.evaluate(expressionResolver) : null;
        Expression<Long> expression7 = bVar.m;
        if (expression7 != null) {
            j = -1;
            long longValue2 = expression7.evaluate(expressionResolver).longValue();
            long j3 = longValue2 >> 31;
            if (j3 == 0 || j3 == -1) {
                i4 = (int) longValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue2, "Unable convert '", "' to Int");
                }
                i4 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num2 = Integer.valueOf(i4);
        } else {
            j = -1;
            num2 = null;
        }
        Expression<JSONObject> expression8 = bVar.k;
        JSONObject evaluate6 = expression8 != null ? expression8.evaluate(expressionResolver) : null;
        Expression<Double> expression9 = bVar.n;
        if (expression9 != null) {
            double doubleValue = expression9.evaluate(expressionResolver).doubleValue();
            if (num != null) {
                fontSizeValue = num.intValue();
            }
            d = Double.valueOf(doubleValue / fontSizeValue);
        } else {
            d = null;
        }
        Expression<Long> expression10 = bVar.o;
        Integer valueOf2 = expression10 != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression10.evaluate(expressionResolver).longValue()), displayMetrics, evaluate)) : null;
        MaskData createMaskData = createMaskData(context, bindingContext, bVar.p);
        Expression<DivLineStyle> expression11 = bVar.r;
        DivLineStyle evaluate7 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<Integer> expression12 = bVar.s;
        Integer evaluate8 = expression12 != null ? expression12.evaluate(expressionResolver) : null;
        ShadowData createShadowData = createShadowData(context, bindingContext, bVar.t, textData.getTextColor());
        if (expression2 != null) {
            long longValue3 = expression2.evaluate(expressionResolver).longValue();
            long j4 = longValue3 >> 31;
            if (j4 == 0 || j4 == j) {
                i3 = (int) longValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue3, "Unable convert '", "' to Int");
                }
                i3 = longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num3 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i3), displayMetrics, evaluate));
        } else {
            num3 = null;
        }
        Integer valueOf3 = expression2 != null ? Integer.valueOf(i) : null;
        Integer valueOf4 = expression2 != null ? Integer.valueOf(i2) : null;
        Expression<DivLineStyle> expression13 = bVar.v;
        return new SpanData(i, i2, evaluate2, unitToPx, evaluate3, evaluate4, valueOf, evaluate, evaluate5, num2, evaluate6, d, valueOf2, createMaskData, evaluate7, evaluate8, createShadowData, num3, valueOf3, valueOf4, expression13 != null ? expression13.evaluate(expressionResolver) : null);
    }

    private final TextData createTextData(Context context, BindingContext bindingContext, DivText divText, String str) {
        int i;
        char c;
        Integer num;
        Integer num2;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        long longValue = divText.v.evaluate(expressionResolver).longValue();
        long j = longValue >> 31;
        int i3 = Integer.MIN_VALUE;
        if (j == 0 || j == -1) {
            i = (int) longValue;
        } else {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue, "Unable convert '", "' to Int");
            }
            i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        int i4 = i;
        DivSizeUnit evaluate = divText.w.evaluate(expressionResolver);
        int unitToPx = BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i4), displayMetrics, evaluate);
        Expression<DivFontWeight> expression = divText.y;
        DivFontWeight evaluate2 = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divText.z;
        if (expression2 != null) {
            c = 31;
            long longValue2 = expression2.evaluate(expressionResolver).longValue();
            long j2 = longValue2 >> 31;
            if (j2 == 0 || j2 == -1) {
                i2 = (int) longValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue2, "Unable convert '", "' to Int");
                }
                i2 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i2);
        } else {
            c = 31;
            num = null;
        }
        Expression<String> expression3 = divText.t;
        String evaluate3 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divText.I;
        if (expression4 != null) {
            long longValue3 = expression4.evaluate(expressionResolver).longValue();
            long j3 = longValue3 >> c;
            if (j3 == 0 || j3 == -1) {
                i3 = (int) longValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue3, "Unable convert '", "' to Int");
                }
                if (longValue3 > 0) {
                    i3 = Integer.MAX_VALUE;
                }
            }
            num2 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i3), displayMetrics, evaluate));
        } else {
            num2 = null;
        }
        return new TextData(str, unitToPx, i4, evaluate, evaluate3, evaluate2, num, num2, divText.Z.evaluate(expressionResolver).intValue());
    }

    private final List<DivAction> getActionsForPosition(BindingContext bindingContext, Spannable spannable, int i) {
        PerformActionSpan[] performActionSpanArr = (PerformActionSpan[]) spannable.getSpans(i, i + 1, PerformActionSpan.class);
        if (performActionSpanArr.length > 1) {
            DivActionTypedUtilsKt.logWarning(bindingContext.getDivView(), new Throwable("Two or more clickable ranges intersect."));
        }
        PerformActionSpan performActionSpan = (PerformActionSpan) rl3.O(performActionSpanArr);
        if (performActionSpan != null) {
            return performActionSpan.getActions();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int imagePosition(int i, DivText.Image image, ExpressionResolver expressionResolver) {
        long longValue = image.f.evaluate(expressionResolver).longValue();
        int i2 = WhenMappings.$EnumSwitchMapping$0[image.d.evaluate(expressionResolver).ordinal()];
        if (i2 == 1) {
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                return (int) longValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue, "Unable convert '", "' to Int");
            }
            return longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        long j2 = i - longValue;
        long j3 = j2 >> 31;
        if (j3 == 0 || j3 == -1) {
            return (int) j2;
        }
        KAssert kAssert2 = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            mq.a(j2, "Unable convert '", "' to Int");
        }
        return j2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    private final List<DivText.Image> preprocessImages(final TextData textData, List<DivText.Image> list, final ExpressionResolver expressionResolver) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((DivText.Image) obj).f.evaluate(expressionResolver).longValue() <= textData.getTextLength()) {
                    arrayList.add(obj);
                }
            }
            List<DivText.Image> D0 = j5g.D0(new Comparator() { // from class: com.yandex.div.core.view2.spannable.SpannedTextBuilder$preprocessImages$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int imagePosition;
                    int imagePosition2;
                    imagePosition = SpannedTextBuilder.this.imagePosition(textData.getTextLength(), (DivText.Image) t, expressionResolver);
                    Integer valueOf = Integer.valueOf(imagePosition);
                    imagePosition2 = SpannedTextBuilder.this.imagePosition(textData.getTextLength(), (DivText.Image) t2, expressionResolver);
                    return jw5.b(valueOf, Integer.valueOf(imagePosition2));
                }
            }, arrayList);
            if (D0 != null) {
                return D0;
            }
        }
        return EmptyList.b;
    }

    private final List<SpanData> preprocessSpans(Context context, BindingContext bindingContext, TextData textData, List<DivText.b> list) {
        int i;
        int i2;
        int i3;
        List<DivText.b> list2;
        if (textData.getLineHeight() == null && ((list2 = list) == null || list2.isEmpty())) {
            return EmptyList.b;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int textLength = textData.getTextLength();
        int size = list != null ? list.size() : 0;
        TreeSet b = oa01.b(new Integer[0]);
        int i4 = 1;
        ArrayList arrayList = new ArrayList(size + 1);
        if (list != null) {
            for (DivText.b bVar : list) {
                long longValue = bVar.q.evaluate(expressionResolver).longValue();
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
                if (i > textLength) {
                    i = textLength;
                }
                Expression<Long> expression = bVar.f;
                if (expression != null) {
                    long longValue2 = expression.evaluate(expressionResolver).longValue();
                    long j2 = longValue2 >> 31;
                    if (j2 == 0 || j2 == -1) {
                        i3 = (int) longValue2;
                    } else {
                        KAssert kAssert2 = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            mq.a(longValue2, "Unable convert '", "' to Int");
                        }
                        i3 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    if (i3 > textLength) {
                        i3 = textLength;
                    }
                    i2 = i3;
                } else {
                    i2 = textLength;
                }
                if (i < i2) {
                    int i5 = i;
                    SpanData createSpanData = createSpanData(context, bindingContext, textData, bVar, i5, i2);
                    if (!createSpanData.isEmpty()) {
                        b.add(Integer.valueOf(i5));
                        b.add(Integer.valueOf(i2));
                        arrayList.add(createSpanData);
                    }
                }
            }
        }
        g5g.K(arrayList);
        Integer lineHeight = textData.getLineHeight();
        if (lineHeight != null) {
            int intValue = lineHeight.intValue();
            b.add(0);
            b.add(Integer.valueOf(textLength));
            arrayList.add(0, SpanData.Companion.lineHeight$div_release(0, textLength, intValue));
        }
        if (arrayList.isEmpty()) {
            return EmptyList.b;
        }
        List O0 = j5g.O0(b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int intValue2 = ((Number) j5g.Y(O0)).intValue();
        if (O0.size() == 1) {
            SpanData empty$div_release = SpanData.Companion.empty$div_release(intValue2, intValue2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                empty$div_release = empty$div_release.mergeWith((SpanData) it.next(), intValue2, intValue2);
            }
            arrayList2.add(empty$div_release);
            return arrayList2;
        }
        int size2 = O0.size();
        while (i4 < size2) {
            int intValue3 = ((Number) O0.get(i4)).intValue();
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                SpanData spanData = (SpanData) arrayList.get(i6);
                if (intValue3 < spanData.getStart()) {
                    break;
                }
                if (intValue3 > spanData.getStart() && intValue3 <= spanData.getEnd()) {
                    arrayList3.add(spanData);
                }
            }
            if (!arrayList3.isEmpty()) {
                SpanData empty$div_release2 = SpanData.Companion.empty$div_release(intValue2, intValue3);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    empty$div_release2 = empty$div_release2.mergeWith((SpanData) it2.next(), intValue2, intValue3);
                }
                arrayList2.add(empty$div_release2);
            }
            arrayList3.clear();
            i4++;
            intValue2 = intValue3;
        }
        return arrayList2;
    }

    private final TextVerticalAlignment toTextVerticalAlignment(DivTextAlignmentVertical divTextAlignmentVertical) {
        int i = WhenMappings.$EnumSwitchMapping$3[divTextAlignmentVertical.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? TextVerticalAlignment.BASELINE : TextVerticalAlignment.BOTTOM : TextVerticalAlignment.BASELINE : TextVerticalAlignment.CENTER : TextVerticalAlignment.TOP;
    }

    public final Spanned buildEllipsis(BindingContext bindingContext, TextView textView, DivText divText, DivText.a aVar, izs<? super Spanned, s3q0> izsVar) {
        return buildText(bindingContext, textView, divText, aVar.d.evaluate(bindingContext.getExpressionResolver()), aVar.c, aVar.b, aVar.a, izsVar);
    }

    public final Spanned buildPlainText(BindingContext bindingContext, TextView textView, DivText divText) {
        return buildText(bindingContext, textView, divText, divText.W.evaluate(bindingContext.getExpressionResolver()), null, null, null, null);
    }

    public final Spanned buildText(BindingContext bindingContext, TextView textView, DivText divText, izs<? super Spanned, s3q0> izsVar) {
        return buildText(bindingContext, textView, divText, divText.W.evaluate(bindingContext.getExpressionResolver()), divText.Q, divText.F, null, izsVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        r15 = r29.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        if (r15.hasNext() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        r7 = (com.yandex.div2.DivText.b) r15.next();
        r3 = r7.q.evaluate(r9).longValue();
        r16 = r3 >> 31;
        r21 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (r16 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        if (r16 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
    
        r16 = com.yandex.div.internal.KAssert.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        if (com.yandex.div.internal.Assert.isEnabled() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
    
        xsna.mq.a(r3, "Unable convert '", "' to Int");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if (r3 <= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        r3 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
    
        if (r3 <= r11) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        r3 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:
    
        r29 = r15;
        r14 = r3.evaluate(r9).longValue();
        r16 = r14 >> 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        if (r16 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        if (r16 != (-1)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
    
        r3 = com.yandex.div.internal.KAssert.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        if (com.yandex.div.internal.Assert.isEnabled() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
    
        xsna.mq.a(r14, "Unable convert '", "' to Int");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        if (r14 <= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
    
        r21 = Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
    
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0131, code lost:
    
        if (r3 <= r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0133, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0134, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
    
        r0.addActionSpan(r1, r2, r3, r4, r5, r7.a);
        r0 = r24;
        r1 = r25;
        r2 = r26;
        r0.addDecorationSpan(r1, r2, r3, r4, r5, r7.e, r7.c);
        r15 = r29;
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        r3 = (int) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0137, code lost:
    
        r29 = r15;
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ff, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f7, code lost:
    
        r3 = Integer.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fa, code lost:
    
        r3 = (int) r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Spanned buildText(BindingContext bindingContext, TextView textView, DivText divText, String str, List<DivText.b> list, List<DivText.Image> list2, List<DivAction> list3, izs<? super Spanned, s3q0> izsVar) {
        izs<? super Spanned, s3q0> izsVar2;
        SpannedTextBuilder spannedTextBuilder = this;
        BindingContext bindingContext2 = bindingContext;
        TextView textView2 = textView;
        Context context = textView2.getContext();
        Div2View divView = bindingContext2.getDivView();
        ExpressionResolver expressionResolver = bindingContext2.getExpressionResolver();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.length() == 0 ? "\u200b" : str);
        TextData createTextData = spannedTextBuilder.createTextData(context, bindingContext2, divText, str);
        int textLength = createTextData.getTextLength();
        List<SpanData> preprocessSpans = spannedTextBuilder.preprocessSpans(context, bindingContext2, createTextData, list);
        List<DivText.Image> preprocessImages = spannedTextBuilder.preprocessImages(createTextData, list2, expressionResolver);
        if (spannedTextBuilder.debugFontMetrics) {
            spannableStringBuilder.setSpan(new LineMetricsSpan(), 0, spannableStringBuilder.length(), 33);
        }
        DivLineHeightTextView divLineHeightTextView = textView2 instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView2 : null;
        if (divLineHeightTextView != null) {
            divLineHeightTextView.clearImageSpans$div_release();
            DivTextRangesBackgroundHelper textRoundedBgHelper$div_release = divLineHeightTextView.getTextRoundedBgHelper$div_release();
            if (textRoundedBgHelper$div_release != null) {
                textRoundedBgHelper$div_release.invalidateSpansCache$div_release();
            }
        }
        Iterator<T> it = preprocessSpans.iterator();
        while (it.hasNext()) {
            spannedTextBuilder.addSpan(textView2, spannableStringBuilder, createTextData, (SpanData) it.next());
        }
        if (list != null) {
            List<DivText.b> list4 = list;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                for (DivText.b bVar : list4) {
                    if (bVar.a != null || bVar.c != null || bVar.e != null) {
                    }
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        SpannedTextBuilder spannedTextBuilder2 = this;
        spannedTextBuilder2.addActionSpan(bindingContext, textView, spannableStringBuilder2, 0, spannableStringBuilder2.length(), list3);
        int size = preprocessImages.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                DivText.Image image = preprocessImages.get(size);
                int imagePosition = spannedTextBuilder2.imagePosition(createTextData.getTextLength(), image, expressionResolver);
                int imagePosition2 = size > 0 ? spannedTextBuilder2.imagePosition(createTextData.getTextLength(), preprocessImages.get(size - 1), expressionResolver) : Integer.MIN_VALUE;
                spannableStringBuilder2.insert(imagePosition, (CharSequence) "#");
                TextData textData = createTextData;
                ImageSpan addImageSpan = spannedTextBuilder2.addImageSpan(bindingContext, textView, spannableStringBuilder2, textData, image);
                SpannedTextBuilder spannedTextBuilder3 = spannedTextBuilder2;
                boolean z = imagePosition2 + 1 == imagePosition;
                boolean z2 = imagePosition > 0 && !ro.j(spannableStringBuilder2.charAt(imagePosition + (-1)));
                if (!z && z2) {
                    spannableStringBuilder2.insert(imagePosition, (CharSequence) "\u2060");
                }
                izsVar2 = izsVar;
                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                spannableStringBuilder2 = spannableStringBuilder3;
                divView.addLoadReference(spannedTextBuilder3.imageLoader.loadImage(image.i.evaluate(expressionResolver).toString(), new ImageDownloadCallbackImpl(bindingContext, image, addImageSpan, spannableStringBuilder3, izsVar2)), textView);
                if (i < 0) {
                    break;
                }
                size = i;
                spannedTextBuilder2 = spannedTextBuilder3;
                createTextData = textData;
            }
        } else {
            izsVar2 = izsVar;
        }
        if (izsVar2 != null) {
            izsVar2.invoke(spannableStringBuilder2);
        }
        return spannableStringBuilder2;
    }
}
