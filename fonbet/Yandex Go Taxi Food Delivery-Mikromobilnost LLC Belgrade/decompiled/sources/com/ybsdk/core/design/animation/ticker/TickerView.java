package com.ybsdk.core.design.animation.ticker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.ybsdk.core.utils.ColorModel;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kux0;
import defpackage.mxp0;
import defpackage.n;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.t3i0;
import defpackage.u0z0;
import defpackage.v0z0;
import defpackage.w0z0;
import defpackage.w511;
import defpackage.x0z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u008e\u00012\u00020\u0001:\u0007`\u008f\u0001\u0090\u0001\u0091\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b(\u0010'J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010#J\u001f\u0010/\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006H\u0014¢\u0006\u0004\b7\u00108J/\u0010=\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020?H\u0014¢\u0006\u0004\bA\u0010BJ\u001b\u0010D\u001a\u00020\u000e2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bD\u0010\u0013J\u0017\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020-H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000eH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010 J\u000f\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010 J\u000f\u0010L\u001a\u00020\u000eH\u0002¢\u0006\u0004\bL\u0010IJ\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bM\u0010BJ\u0019\u0010N\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\bN\u0010\u0013J\u0019\u0010O\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020Q8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001c\u0010^\u001a\n ]*\u0004\u0018\u00010\\0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010bR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010gR\u0016\u0010h\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010iR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010iR*\u0010k\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010i\u001a\u0004\bl\u0010 \"\u0004\b3\u0010#R*\u0010m\u001a\u00020-2\u0006\u0010m\u001a\u00020-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010GR\u0016\u0010r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010iR\"\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010PR\"\u0010w\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010s\u001a\u0004\bx\u0010u\"\u0004\by\u0010PR#\u0010{\u001a\u00020z8\u0016@\u0016X\u0096\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R)\u0010\u0081\u0001\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010gR0\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/ybsdk/core/design/animation/ticker/TickerView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "", "characterLists", "Lzy11;", "setCharacterLists", "([Ljava/lang/String;)V", "text", "setText", "(Ljava/lang/String;)V", "", "animate", "", "animationDelay", "(Ljava/lang/String;ZJ)V", "getText", "()Ljava/lang/String;", "Lcom/ybsdk/core/design/animation/ticker/TickerView$ScrollingDirection;", "direction", "setPreferredScrollingDirection", "(Lcom/ybsdk/core/design/animation/ticker/TickerView$ScrollingDirection;)V", "getGravity", "()I", "gravity", "setGravity", "(I)V", "Landroid/animation/Animator$AnimatorListener;", "animatorListener", "addAnimatorListener", "(Landroid/animation/Animator$AnimatorListener;)V", "removeAnimatorListener", "flags", "setPaintFlags", "Landroid/graphics/BlurMaskFilter$Blur;", "style", "", "radius", "setBlurMaskFilter", "(Landroid/graphics/BlurMaskFilter$Blur;F)V", "Lcom/ybsdk/core/utils/ColorModel;", "color", "setTextColor", "(Lcom/ybsdk/core/utils/ColorModel;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "newText", "adjustTextScale", "size", "setTextPaintSize", "(F)V", "checkForRelayout", "()V", "computeDesiredWidth", "computeDesiredHeight", "onTextPaintMeasurementChanged", "realignAndClipCanvasForGravity", "setTextInternal", "startNextAnimation", "(J)V", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Paint;", "getTextPaint", "()Landroid/graphics/Paint;", "Lcom/ybsdk/core/design/animation/ticker/d;", "metrics", "Lcom/ybsdk/core/design/animation/ticker/d;", "Lu0z0;", "columnManager", "Lu0z0;", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animator", "Landroid/animation/ValueAnimator;", "Lv0z0;", "currentAnimation", "Lv0z0;", "nextAnimation", "Landroid/graphics/Rect;", "viewBounds", "Landroid/graphics/Rect;", "Ljava/lang/String;", "lastMeasuredDesiredWidth", CA20Status.STATUS_USER_I, "lastMeasuredDesiredHeight", "textColor", "getTextColor", "textSize", "F", "getTextSize", "()F", "setTextSize", "textStyle", "J", "getAnimationDelay", "()J", "setAnimationDelay", "animationDuration", "getAnimationDuration", "setAnimationDuration", "Landroid/view/animation/Interpolator;", "animationInterpolator", "Landroid/view/animation/Interpolator;", "getAnimationInterpolator", "()Landroid/view/animation/Interpolator;", "setAnimationInterpolator", "(Landroid/view/animation/Interpolator;)V", "animateMeasurementChange", "Z", "getAnimateMeasurementChange", "()Z", "setAnimateMeasurementChange", "(Z)V", "pendingTextToSet", "Landroid/graphics/Typeface;", "typeface", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "Companion", "x0z0", "ScrollingDirection", "w0z0", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class TickerView extends View {
    public static final w0z0 Companion = new w0z0();
    private static final long DEFAULT_ANIMATION_DELAY_FLAG = -1;
    private static final int DEFAULT_ANIMATION_DURATION = 750;
    private static final int DEFAULT_GRAVITY = 8388611;
    private static final int DEFAULT_TEXT_COLOR = -16777216;
    private static final int DEFAULT_TEXT_SIZE_SP = 12;
    private boolean animateMeasurementChange;
    private long animationDelay;
    private long animationDuration;
    private Interpolator animationInterpolator;
    private final ValueAnimator animator;
    private final u0z0 columnManager;
    private v0z0 currentAnimation;
    private int gravity;
    private int lastMeasuredDesiredHeight;
    private int lastMeasuredDesiredWidth;
    private final d metrics;
    private v0z0 nextAnimation;
    private String pendingTextToSet;
    private String text;
    private int textColor;
    private final Paint textPaint;
    private float textSize;
    private int textStyle;
    private final Rect viewBounds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/design/animation/ticker/TickerView$ScrollingDirection;", "", "<init>", "(Ljava/lang/String;I)V", "ANY", "UP", "DOWN", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScrollingDirection {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ScrollingDirection[] $VALUES;
        public static final ScrollingDirection ANY = new ScrollingDirection("ANY", 0);
        public static final ScrollingDirection UP = new ScrollingDirection("UP", 1);
        public static final ScrollingDirection DOWN = new ScrollingDirection("DOWN", 2);

        private static final /* synthetic */ ScrollingDirection[] $values() {
            return new ScrollingDirection[]{ANY, UP, DOWN};
        }

        static {
            ScrollingDirection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ScrollingDirection(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ScrollingDirection valueOf(String str) {
            return (ScrollingDirection) Enum.valueOf(ScrollingDirection.class, str);
        }

        public static ScrollingDirection[] values() {
            return (ScrollingDirection[]) $VALUES.clone();
        }
    }

    public TickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        d dVar = new d(textPaint);
        this.metrics = dVar;
        this.columnManager = new u0z0(dVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
        this.animator = ofFloat;
        this.viewBounds = new Rect();
        this.animationInterpolator = new AccelerateDecelerateInterpolator();
        context.getResources();
        x0z0 x0z0Var = new x0z0();
        x0z0Var.a = DEFAULT_GRAVITY;
        x0z0Var.h = 12.0f * Resources.getSystem().getDisplayMetrics().scaledDensity;
        x0z0Var.g = -16777216;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t3i0.YbSdkTickerView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(t3i0.YbSdkTickerView_android_textAppearance, 0);
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, t3i0.YbSdkTickerView);
            x0z0Var.a(obtainStyledAttributes2);
            obtainStyledAttributes2.recycle();
        }
        x0z0Var.a(obtainStyledAttributes);
        setAnimationDuration(obtainStyledAttributes.getInt(t3i0.YbSdkTickerView_ybsdk_ticker_animation_duration, DEFAULT_ANIMATION_DURATION));
        setAnimateMeasurementChange(obtainStyledAttributes.getBoolean(t3i0.YbSdkTickerView_ybsdk_ticker_animate_measurement_change, false));
        this.gravity = x0z0Var.a;
        int i3 = x0z0Var.b;
        if (i3 != 0) {
            textPaint.setShadowLayer(x0z0Var.e, x0z0Var.c, x0z0Var.d, i3);
        }
        int i4 = x0z0Var.i;
        if (i4 != 0) {
            this.textStyle = i4;
            setTypeface(textPaint.getTypeface());
        } else {
            setTypeface(obtainStyledAttributes.getFont(t3i0.YbSdkTickerView_android_fontFamily));
        }
        textPaint.setLetterSpacing(obtainStyledAttributes.getFloat(t3i0.YbSdkTickerView_android_letterSpacing, 0.0f));
        textPaint.setFontFeatureSettings(obtainStyledAttributes.getString(t3i0.YbSdkTickerView_android_fontFeatureSettings));
        setTextColor(x0z0Var.g);
        setTextSize(x0z0Var.h);
        int i5 = obtainStyledAttributes.getInt(t3i0.YbSdkTickerView_ybsdk_ticker_default_character_list, 0);
        if (i5 == 1) {
            setCharacterLists("0123456789");
        } else if (i5 == 2) {
            setCharacterLists("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        } else if (isInEditMode()) {
            setCharacterLists("0123456789");
        }
        int i6 = obtainStyledAttributes.getInt(t3i0.YbSdkTickerView_ybsdk_ticker_default_preferred_scrolling_direction, 0);
        if (i6 == 0) {
            dVar.e = ScrollingDirection.ANY;
        } else if (i6 == 1) {
            dVar.e = ScrollingDirection.UP;
        } else {
            if (i6 != 2) {
                ny61.g(oyr.i(i6, "Unsupported YbSdkTickerView_bank_sdk_ticker_default_preferred_scrolling_direction: "));
                throw null;
            }
            dVar.e = ScrollingDirection.DOWN;
        }
        setText$default(this, x0z0Var.f, false, 0L, 4, null);
        obtainStyledAttributes.recycle();
        ofFloat.addUpdateListener(new mxp0(21, this));
        final kux0 kux0Var = new kux0(10, this);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.ybsdk.core.design.animation.ticker.TickerView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                ArrayList arrayList = TickerView.this.columnManager.b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    c cVar = (c) arrayList.get(i7);
                    cVar.a();
                    cVar.n = cVar.l;
                }
                TickerView.this.checkForRelayout();
                TickerView.this.invalidate();
                kux0Var.run();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TickerView tickerView, ValueAnimator valueAnimator) {
        tickerView.columnManager.b(valueAnimator.getAnimatedFraction());
        tickerView.checkForRelayout();
        tickerView.invalidate();
    }

    public static /* synthetic */ void adjustTextScale$default(TickerView tickerView, String str, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: adjustTextScale");
            return;
        }
        if ((i & 1) != 0) {
            str = tickerView.text;
        }
        tickerView.adjustTextScale(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkForRelayout() {
        boolean z = this.lastMeasuredDesiredWidth != computeDesiredWidth();
        boolean z2 = this.lastMeasuredDesiredHeight != computeDesiredHeight();
        if (z || z2) {
            requestLayout();
        }
    }

    private final int computeDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + ((int) this.metrics.c);
    }

    private final int computeDesiredWidth() {
        float f;
        boolean animateMeasurementChange = getAnimateMeasurementChange();
        u0z0 u0z0Var = this.columnManager;
        if (animateMeasurementChange) {
            f = u0z0Var.a();
        } else {
            ArrayList arrayList = u0z0Var.b;
            int size = arrayList.size();
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                c cVar = (c) arrayList.get(i);
                cVar.a();
                f2 += cVar.n;
            }
            f = f2;
        }
        int paddingLeft = getPaddingLeft();
        return getPaddingRight() + paddingLeft + ((int) f);
    }

    private final void onTextPaintMeasurementChanged() {
        d dVar = this.metrics;
        dVar.b.clear();
        Paint.FontMetrics fontMetrics = dVar.a.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        dVar.c = f - f2;
        dVar.d = -f2;
        checkForRelayout();
        invalidate();
    }

    private final void realignAndClipCanvasForGravity(Canvas canvas) {
        float f;
        float f2;
        float a = this.columnManager.a();
        float f3 = this.metrics.c;
        int width = this.viewBounds.width();
        int height = this.viewBounds.height();
        int i = this.gravity;
        if ((i & 16) == 16) {
            f = n.a(height, f3, 2.0f, this.viewBounds.top);
        } else {
            f = 0.0f;
        }
        if ((i & 1) == 1) {
            f2 = n.a(width, a, 2.0f, this.viewBounds.left);
        } else {
            f2 = 0.0f;
        }
        if ((i & 48) == 48) {
            f = 0.0f;
        }
        if ((i & 80) == 80) {
            f = this.viewBounds.top + (height - f3);
        }
        if ((i & DEFAULT_GRAVITY) == DEFAULT_GRAVITY) {
            f2 = 0.0f;
        }
        if ((i & 8388613) == 8388613) {
            f2 = (width - a) + this.viewBounds.left;
        }
        canvas.translate(f2, f);
        canvas.clipRect(0.0f, 0.0f, a, f3);
    }

    public static /* synthetic */ void setText$default(TickerView tickerView, String str, boolean z, long j, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: setText");
            return;
        }
        if ((i & 4) != 0) {
            j = -1;
        }
        tickerView.setText(str, z, j);
    }

    private final void setTextInternal(String text) {
        int i;
        int i2;
        int length;
        int i3;
        int i4 = 1;
        int i5 = 0;
        this.text = text;
        char[] charArray = text != null ? text.toCharArray() : new char[0];
        u0z0 u0z0Var = this.columnManager;
        ArrayList arrayList = u0z0Var.b;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            c cVar = (c) arrayList.get(i6);
            cVar.a();
            if (cVar.l > 0.0f) {
                i6++;
            } else {
                arrayList.remove(i6);
            }
        }
        int size = arrayList.size();
        char[] cArr = new char[size];
        for (int i7 = 0; i7 < size; i7++) {
            cArr[i7] = ((c) arrayList.get(i7)).c;
        }
        Set set = u0z0Var.d;
        int i8 = 2;
        ArrayList arrayList2 = new ArrayList();
        int i9 = 0;
        while (true) {
            int i10 = i9 == size ? i4 : 0;
            i = i8;
            int i11 = i5 == charArray.length ? i4 : 0;
            if (i10 != 0 && i11 != 0) {
                break;
            }
            if (i10 != 0) {
                int length2 = charArray.length - i5;
                for (int i12 = 0; i12 < length2; i12++) {
                    arrayList2.add(1);
                }
            } else if (i11 != 0) {
                int i13 = size - i9;
                for (int i14 = 0; i14 < i13; i14++) {
                    arrayList2.add(Integer.valueOf(i));
                }
            } else {
                int i15 = i4;
                boolean contains = set.contains(Character.valueOf(cArr[i9]));
                boolean contains2 = set.contains(Character.valueOf(charArray[i5]));
                if (contains && contains2) {
                    int i16 = i9 + 1;
                    while (true) {
                        if (i16 >= size) {
                            i2 = size;
                            break;
                        } else {
                            if (!set.contains(Character.valueOf(cArr[i16]))) {
                                i2 = i16;
                                break;
                            }
                            i16++;
                        }
                    }
                    int i17 = i5 + 1;
                    int length3 = charArray.length;
                    while (true) {
                        if (i17 >= length3) {
                            length = charArray.length;
                            break;
                        } else {
                            if (!set.contains(Character.valueOf(charArray[i17]))) {
                                length = i17;
                                break;
                            }
                            i17++;
                        }
                    }
                    int i18 = i2 - i9;
                    int i19 = length - i5;
                    int i20 = length;
                    int i21 = i18 < i19 ? i19 : i18;
                    if (i18 != i19) {
                        int i22 = i21;
                        int i23 = i18 + 1;
                        int i24 = i19 + 1;
                        int[][] iArr = new int[i23][];
                        int i25 = 0;
                        while (i25 < i23) {
                            int i26 = i25;
                            iArr[i26] = new int[i24];
                            i25 = i26 + 1;
                        }
                        for (int i27 = 0; i27 < i23; i27++) {
                            iArr[i27][0] = i27;
                        }
                        for (int i28 = 0; i28 < i24; i28++) {
                            iArr[0][i28] = i28;
                        }
                        int i29 = i15;
                        while (i29 < i23) {
                            int i30 = i23;
                            int i31 = i15;
                            while (i31 < i24) {
                                int i32 = i29 - 1;
                                int i33 = i31;
                                int i34 = i33 - 1;
                                int i35 = i24;
                                int i36 = cArr[i32 + i9] == charArray[i34 + i5] ? 0 : i15;
                                int[] iArr2 = iArr[i29];
                                int[] iArr3 = iArr[i32];
                                int i37 = i36;
                                int i38 = iArr3[i33] + 1;
                                int i39 = iArr2[i34] + 1;
                                int i40 = iArr3[i34];
                                int i41 = i29;
                                int i42 = i40 + i37;
                                if (i39 > i42) {
                                    i39 = i42;
                                }
                                if (i38 > i39) {
                                    i38 = i39;
                                }
                                iArr2[i33] = i38;
                                i31 = i33 + 1;
                                i29 = i41;
                                i24 = i35;
                            }
                            i29++;
                            i23 = i30;
                        }
                        ArrayList arrayList3 = new ArrayList(i22 * 2);
                        int i43 = i18;
                        while (true) {
                            if (i43 <= 0 && i19 <= 0) {
                                break;
                            }
                            if (i43 == 0) {
                                arrayList3.add(1);
                            } else if (i19 == 0) {
                                arrayList3.add(2);
                                i43--;
                            } else {
                                int i44 = i19 - 1;
                                int i45 = iArr[i43][i44];
                                int[] iArr4 = iArr[i43 - 1];
                                int i46 = i43;
                                int i47 = iArr4[i19];
                                int i48 = iArr4[i44];
                                if (i45 < i47 && i45 < i48) {
                                    arrayList3.add(1);
                                    i19--;
                                    i43 = i46;
                                } else if (i47 < i48) {
                                    arrayList3.add(2);
                                    i43 = i46 - 1;
                                } else {
                                    arrayList3.add(0);
                                    i43 = i46 - 1;
                                }
                            }
                            i19--;
                        }
                        int size2 = arrayList3.size();
                        while (true) {
                            size2--;
                            if (-1 >= size2) {
                                break;
                            } else {
                                arrayList2.add(arrayList3.get(size2));
                            }
                        }
                    } else {
                        for (int i49 = 0; i49 < i21; i49++) {
                            arrayList2.add(0);
                        }
                    }
                    i9 = i2;
                    i4 = i15;
                    i5 = i20;
                } else {
                    if (contains) {
                        arrayList2.add(1);
                    } else if (contains2) {
                        arrayList2.add(2);
                        i9++;
                        i4 = i15;
                    } else {
                        arrayList2.add(0);
                        i9++;
                    }
                    i5++;
                    i4 = i15;
                }
                i8 = 2;
            }
        }
        int size3 = arrayList2.size();
        int[] iArr5 = new int[size3];
        int size4 = arrayList2.size();
        for (int i50 = 0; i50 < size4; i50++) {
            iArr5[i50] = ((Number) arrayList2.get(i50)).intValue();
        }
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        while (i51 < size3) {
            int i54 = iArr5[i51];
            if (i54 == 0) {
                i3 = i;
                ((c) arrayList.get(i52)).b(charArray[i53]);
            } else if (i54 != i4) {
                i3 = i;
                if (i54 != i3) {
                    ny61.g(oyr.i(i54, "Unknown action: "));
                    return;
                }
                ((c) arrayList.get(i52)).b((char) 0);
                i52++;
                i51++;
                i = i3;
            } else {
                i3 = i;
                arrayList.add(i52, new c(u0z0Var.c, u0z0Var.a));
                ((c) arrayList.get(i52)).b(charArray[i53]);
            }
            i52++;
            i53++;
            i51++;
            i = i3;
        }
        setContentDescription(text);
    }

    private final void setTextPaintSize(float size) {
        this.textPaint.setTextSize(size);
        onTextPaintMeasurementChanged();
    }

    private final void startNextAnimation(long animationDelay) {
        v0z0 v0z0Var = this.nextAnimation;
        this.currentAnimation = v0z0Var;
        this.nextAnimation = null;
        if (v0z0Var == null) {
            return;
        }
        setTextInternal(v0z0Var.a);
        this.animator.setStartDelay(animationDelay == -1 ? v0z0Var.b : 0L);
        this.animator.setDuration(v0z0Var.c);
        this.animator.setInterpolator(v0z0Var.d);
        this.animator.start();
    }

    public static /* synthetic */ void startNextAnimation$default(TickerView tickerView, long j, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: startNextAnimation");
            return;
        }
        if ((i & 1) != 0) {
            j = -1;
        }
        tickerView.startNextAnimation(j);
    }

    public final void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    public void adjustTextScale(String newText) {
        int width;
        if (getWidth() <= 0 || newText == null) {
            return;
        }
        if (evu0.J(newText)) {
            newText = null;
        }
        if (newText == null || (width = (getWidth() - getPaddingLeft()) - getPaddingRight()) <= 0) {
            return;
        }
        float measureText = this.textPaint.measureText(newText);
        float f = width;
        float f2 = f / measureText;
        if (f2 >= 1.1d || f2 <= 0.0f) {
            return;
        }
        int i = width / 10;
        while (true) {
            float f3 = i;
            float f4 = f - measureText;
            Paint paint = this.textPaint;
            if (f3 <= f4) {
                setTextSize(paint.getTextSize());
                return;
            } else {
                paint.setTextSize(paint.getTextSize() - 1.0f);
                measureText = this.textPaint.measureText(newText);
            }
        }
    }

    public boolean getAnimateMeasurementChange() {
        return this.animateMeasurementChange;
    }

    public long getAnimationDelay() {
        return this.animationDelay;
    }

    public long getAnimationDuration() {
        return this.animationDuration;
    }

    public Interpolator getAnimationInterpolator() {
        return this.animationInterpolator;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Paint getTextPaint() {
        return this.textPaint;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final Typeface getTypeface() {
        return this.textPaint.getTypeface();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        canvas.save();
        realignAndClipCanvasForGravity(canvas);
        canvas.translate(0.0f, this.metrics.d);
        u0z0 u0z0Var = this.columnManager;
        Paint paint = this.textPaint;
        ArrayList arrayList = u0z0Var.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            c cVar = (c) arrayList.get(i);
            char[] cArr = cVar.e;
            int i2 = cVar.h;
            float f = cVar.i;
            if (i2 < 0 || i2 >= cArr.length) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawText(cArr, i2, 1, 0.0f, f, paint);
                int i3 = cVar.h;
                if (i3 >= 0) {
                    cVar.c = cVar.e[i3];
                }
                cVar.o = cVar.i;
            }
            char[] cArr2 = cVar.e;
            int i4 = cVar.h + 1;
            float f2 = cVar.i - cVar.j;
            if (i4 >= 0 && i4 < cArr2.length) {
                canvas2.drawText(cArr2, i4, 1, 0.0f, f2, paint);
            }
            char[] cArr3 = cVar.e;
            int i5 = cVar.h - 1;
            float f3 = cVar.i + cVar.j;
            if (i5 >= 0 && i5 < cArr3.length) {
                canvas2.drawText(cArr3, i5, 1, 0.0f, f3, paint);
            }
            cVar.a();
            canvas2.translate(cVar.l, 0.0f);
            i++;
            canvas = canvas2;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.lastMeasuredDesiredWidth = computeDesiredWidth();
        this.lastMeasuredDesiredHeight = computeDesiredHeight();
        setMeasuredDimension(View.resolveSize(this.lastMeasuredDesiredWidth, widthMeasureSpec), View.resolveSize(this.lastMeasuredDesiredHeight, heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        this.viewBounds.set(getPaddingLeft(), getPaddingTop(), width - getPaddingRight(), height - getPaddingBottom());
        adjustTextScale$default(this, null, 1, null);
    }

    public final void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    public void setAnimateMeasurementChange(boolean z) {
        this.animateMeasurementChange = z;
    }

    public void setAnimationDelay(long j) {
        this.animationDelay = j;
    }

    public void setAnimationDuration(long j) {
        this.animationDuration = j;
    }

    public void setAnimationInterpolator(Interpolator interpolator) {
        this.animationInterpolator = interpolator;
    }

    public final void setBlurMaskFilter(BlurMaskFilter.Blur style, float radius) {
        if (style == null || radius <= 0.0f) {
            setLayerType(1, null);
            this.textPaint.setMaskFilter(null);
        } else {
            this.textPaint.setMaskFilter(new BlurMaskFilter(radius, style));
        }
    }

    public final void setCharacterLists(String... characterLists) {
        u0z0 u0z0Var = this.columnManager;
        String[] strArr = (String[]) Arrays.copyOf(characterLists, characterLists.length);
        u0z0Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            b bVar = new b(str);
            linkedHashSet.addAll(bVar.c.keySet());
            arrayList.add(bVar);
        }
        u0z0Var.c = arrayList;
        u0z0Var.d = linkedHashSet;
        Iterator it = u0z0Var.b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a = u0z0Var.c;
        }
        String str2 = this.pendingTextToSet;
        if (str2 != null) {
            setText$default(this, str2, false, 0L, 4, null);
            this.pendingTextToSet = null;
        }
    }

    public final void setGravity(int gravity) {
        if (this.gravity != gravity) {
            this.gravity = gravity;
            invalidate();
        }
    }

    public final void setPaintFlags(int flags) {
        this.textPaint.setFlags(flags);
        onTextPaintMeasurementChanged();
    }

    public final void setPreferredScrollingDirection(ScrollingDirection direction) {
        this.metrics.e = direction;
    }

    public final void setText(String text, boolean animate, long animationDelay) {
        if (jl40.l(text, this.text)) {
            return;
        }
        if (!animate && this.animator.isRunning()) {
            this.animator.cancel();
            this.nextAnimation = null;
            this.currentAnimation = null;
        }
        adjustTextScale(text);
        if (animate) {
            this.nextAnimation = new v0z0(text, getAnimationDelay(), getAnimationDuration(), getAnimationInterpolator());
            if (this.currentAnimation == null) {
                startNextAnimation(animationDelay);
                return;
            }
            return;
        }
        setTextInternal(text);
        this.columnManager.b(1.0f);
        ArrayList arrayList = this.columnManager.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.a();
            cVar.n = cVar.l;
        }
        checkForRelayout();
        invalidate();
    }

    public final void setTextColor(int i) {
        if (this.textColor != i) {
            this.textColor = i;
            this.textPaint.setColor(i);
            invalidate();
        }
    }

    public final void setTextSize(float f) {
        if (this.textSize == f) {
            return;
        }
        this.textSize = f;
        setTextPaintSize(f);
    }

    public final void setTypeface(Typeface typeface) {
        int i = this.textStyle;
        if (i == 1) {
            typeface = Typeface.create(typeface, 1);
        } else if (i == 2) {
            typeface = Typeface.create(typeface, 2);
        } else if (i == 3) {
            typeface = Typeface.create(typeface, 3);
        }
        this.textPaint.setTypeface(typeface);
        onTextPaintMeasurementChanged();
    }

    public final void setTextColor(ColorModel color) {
        setTextColor(color.get(getContext()));
    }

    public void setText(String text) {
        setText$default(this, text, !(text == null || evu0.J(text)), 0L, 4, null);
    }

    public TickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public TickerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ TickerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public TickerView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
