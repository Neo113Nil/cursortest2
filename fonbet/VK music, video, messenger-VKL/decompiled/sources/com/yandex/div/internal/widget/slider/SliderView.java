package com.yandex.div.internal.widget.slider;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.sda0;
import xsna.zcl;

/* compiled from: SliderView.kt */
/* loaded from: classes7.dex */
public class SliderView extends View {
    public static final Companion Companion = new Companion(null);
    private final SliderAccessibilityHelper a11yHelper;
    private final ActiveRange activeRange;
    private Drawable activeTickMarkDrawable;
    private Drawable activeTrackDrawable;
    private long animationDuration;
    private boolean animationEnabled;
    private AccelerateDecelerateInterpolator animationInterpolator;
    private final SliderThumbAnimatorListener animatorListener;
    private final SliderThumbAnimatorListener animatorSecondaryListener;
    private Drawable inactiveTickMarkDrawable;
    private Drawable inactiveTrackDrawable;
    private boolean interactive;
    private float interceptionAngle;
    private float interceptionAngleTg;
    private final ObserverList<ChangedListener> listeners;
    private int maxTickmarkOrThumbWidth;
    private float maxValue;
    private float minValue;
    private Float prevThumbSecondaryValue;
    private float prevThumbValue;
    private float prevX;
    private float prevY;
    private final List<Range> ranges;
    private ValueAnimator sliderAnimator;
    private final SliderDrawDelegate sliderDrawDelegate;
    private ValueAnimator sliderSecondaryAnimator;
    private Drawable thumbDrawable;
    private Thumb thumbOnTouch;
    private TextDrawable thumbSecondTextDrawable;
    private Drawable thumbSecondaryDrawable;
    private Float thumbSecondaryValue;
    private TextDrawable thumbTextDrawable;
    private float thumbValue;
    private Integer touchSlop;

    /* compiled from: SliderView.kt */
    public final class ActiveRange {
        public ActiveRange() {
        }

        private final float max(float f, Float f2) {
            return f2 != null ? Math.max(f, f2.floatValue()) : f;
        }

        private final float min(float f, Float f2) {
            return f2 != null ? Math.min(f, f2.floatValue()) : f;
        }

        public final float getEnd() {
            return !SliderView.this.isThumbSecondaryEnabled() ? SliderView.this.getThumbValue() : max(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }

        public final float getStart() {
            return !SliderView.this.isThumbSecondaryEnabled() ? SliderView.this.getMinValue() : min(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }
    }

    /* compiled from: SliderView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final int getBoundsHeight(Drawable drawable) {
            Rect bounds;
            if (drawable == null || (bounds = drawable.getBounds()) == null) {
                return 0;
            }
            return bounds.height();
        }

        public final int getBoundsWidth(Drawable drawable) {
            Rect bounds;
            if (drawable == null || (bounds = drawable.getBounds()) == null) {
                return 0;
            }
            return bounds.width();
        }

        private Companion() {
        }
    }

    /* compiled from: SliderView.kt */
    public static final class Range {
        private Drawable activeTrackDrawable;
        private int endPosition;
        private float endValue;
        private Drawable inactiveTrackDrawable;
        private int marginEnd;
        private int marginStart;
        private int startPosition;
        private float startValue;

        public final Drawable getActiveTrackDrawable() {
            return this.activeTrackDrawable;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final float getEndValue() {
            return this.endValue;
        }

        public final Drawable getInactiveTrackDrawable() {
            return this.inactiveTrackDrawable;
        }

        public final int getMarginEnd() {
            return this.marginEnd;
        }

        public final int getMarginStart() {
            return this.marginStart;
        }

        public final int getStartPosition() {
            return this.startPosition;
        }

        public final float getStartValue() {
            return this.startValue;
        }

        public final void setActiveTrackDrawable(Drawable drawable) {
            this.activeTrackDrawable = drawable;
        }

        public final void setEndPosition(int i) {
            this.endPosition = i;
        }

        public final void setEndValue(float f) {
            this.endValue = f;
        }

        public final void setInactiveTrackDrawable(Drawable drawable) {
            this.inactiveTrackDrawable = drawable;
        }

        public final void setMarginEnd(int i) {
            this.marginEnd = i;
        }

        public final void setMarginStart(int i) {
            this.marginStart = i;
        }

        public final void setStartPosition(int i) {
            this.startPosition = i;
        }

        public final void setStartValue(float f) {
            this.startValue = f;
        }
    }

    /* compiled from: SliderView.kt */
    public enum Thumb {
        THUMB,
        THUMB_SECONDARY
    }

    /* compiled from: SliderView.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Thumb.values().length];
            try {
                iArr[Thumb.THUMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Thumb.THUMB_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.sliderDrawDelegate = new SliderDrawDelegate();
        this.listeners = new ObserverList<>();
        this.animatorListener = new SliderThumbAnimatorListener(new izs<Boolean, s3q0>() { // from class: com.yandex.div.internal.widget.slider.SliderView$animatorListener$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                float f;
                SliderView.this.sliderAnimator = null;
                if (z) {
                    return;
                }
                SliderView sliderView = SliderView.this;
                f = sliderView.prevThumbValue;
                sliderView.notifyThumbChangedListeners(Float.valueOf(f), SliderView.this.getThumbValue());
            }
        });
        this.animatorSecondaryListener = new SliderThumbAnimatorListener(new izs<Boolean, s3q0>() { // from class: com.yandex.div.internal.widget.slider.SliderView$animatorSecondaryListener$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                Float f;
                SliderView.this.sliderSecondaryAnimator = null;
                if (z) {
                    return;
                }
                SliderView sliderView = SliderView.this;
                f = sliderView.prevThumbSecondaryValue;
                sliderView.notifyThumbSecondaryChangedListeners(f, SliderView.this.getThumbSecondaryValue());
            }
        });
        this.ranges = new ArrayList();
        this.animationDuration = 300L;
        this.animationInterpolator = new AccelerateDecelerateInterpolator();
        this.animationEnabled = true;
        this.maxValue = 100.0f;
        this.thumbValue = this.minValue;
        this.a11yHelper = new SliderAccessibilityHelper(this);
        this.maxTickmarkOrThumbWidth = -1;
        this.activeRange = new ActiveRange();
        this.thumbOnTouch = Thumb.THUMB;
        this.interactive = true;
        this.interceptionAngle = 45.0f;
        this.interceptionAngleTg = (float) Math.tan(45.0f);
    }

    private final int getMaxTickmarkOrThumbWidth() {
        if (this.maxTickmarkOrThumbWidth == -1) {
            Companion companion = Companion;
            this.maxTickmarkOrThumbWidth = Math.max(Math.max(companion.getBoundsWidth(this.activeTickMarkDrawable), companion.getBoundsWidth(this.inactiveTickMarkDrawable)), Math.max(companion.getBoundsWidth(this.thumbDrawable), companion.getBoundsWidth(this.thumbSecondaryDrawable)));
        }
        return this.maxTickmarkOrThumbWidth;
    }

    private final float getTouchValue(int i) {
        return (this.inactiveTickMarkDrawable == null && this.activeTickMarkDrawable == null) ? toValue(i) : an10.b(toValue(i));
    }

    private final int getTrackLength(int i) {
        return ((i - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
    }

    public static /* synthetic */ int getTrackLength$default(SliderView sliderView, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrackLength");
        }
        if ((i2 & 1) != 0) {
            i = sliderView.getWidth();
        }
        return sliderView.getTrackLength(i);
    }

    private final float inBoarders(float f) {
        return Math.min(Math.max(f, this.minValue), this.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThumbSecondaryEnabled() {
        return this.thumbSecondaryValue != null;
    }

    private final int measureDimension(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i : size : Math.min(i, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbChangedListeners(Float f, float f2) {
        if (epx.d(f, f2)) {
            return;
        }
        Iterator<ChangedListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onThumbValueChanged(f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbSecondaryChangedListeners(Float f, Float f2) {
        if (epx.e(f, f2)) {
            return;
        }
        Iterator<ChangedListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onThumbSecondaryValueChanged(f2);
        }
    }

    private static final void onDraw$lambda$10$drawTrackPart(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i, int i2) {
        sliderView.sliderDrawDelegate.drawTrackPart(canvas, drawable, i, i2);
    }

    public static /* synthetic */ void onDraw$lambda$10$drawTrackPart$default(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw$lambda$10$drawTrackPart");
        }
        if ((i3 & 16) != 0) {
            i = range.getStartPosition();
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = range.getEndPosition();
        }
        onDraw$lambda$10$drawTrackPart(range, sliderView, canvas, drawable, i4, i2);
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.animationDuration);
        valueAnimator.setInterpolator(this.animationInterpolator);
    }

    private final void setThumbsInBoarders() {
        trySetThumbValue(inBoarders(this.thumbValue), false, true);
        if (isThumbSecondaryEnabled()) {
            Float f = this.thumbSecondaryValue;
            trySetThumbSecondaryValue(f != null ? Float.valueOf(inBoarders(f.floatValue())) : null, false, true);
        }
    }

    private final void setThumbsOnTickMarks() {
        trySetThumbValue(an10.b(this.thumbValue), false, true);
        if (this.thumbSecondaryValue != null) {
            trySetThumbSecondaryValue(Float.valueOf(an10.b(r0.floatValue())), false, true);
        }
    }

    private final void setValueToThumb(Thumb thumb, float f, boolean z, boolean z2) {
        int i = WhenMappings.$EnumSwitchMapping$0[thumb.ordinal()];
        if (i == 1) {
            trySetThumbValue(f, z, z2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            trySetThumbSecondaryValue(Float.valueOf(f), z, z2);
        }
    }

    public static /* synthetic */ void setValueToThumb$default(SliderView sliderView, Thumb thumb, float f, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setValueToThumb");
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        sliderView.setValueToThumb(thumb, f, z, z2);
    }

    private final int toPosition(float f, int i) {
        return an10.b((getTrackLength(i) / (this.maxValue - this.minValue)) * (ViewsKt.isLayoutRtl(this) ? this.maxValue - f : f - this.minValue));
    }

    public static /* synthetic */ int toPosition$default(SliderView sliderView, float f, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPosition");
        }
        if ((i2 & 1) != 0) {
            i = sliderView.getWidth();
        }
        return sliderView.toPosition(f, i);
    }

    private final float toValue(int i) {
        float f = this.minValue;
        float trackLength$default = ((this.maxValue - f) * i) / getTrackLength$default(this, 0, 1, null);
        if (ViewsKt.isLayoutRtl(this)) {
            trackLength$default = (this.maxValue - trackLength$default) - 1;
        }
        return f + trackLength$default;
    }

    private final void trySetThumbSecondaryValue(Float f, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        Float f2;
        Float valueOf = f != null ? Float.valueOf(inBoarders(f.floatValue())) : null;
        if (epx.e(this.thumbSecondaryValue, valueOf)) {
            return;
        }
        if (!z || !this.animationEnabled || (f2 = this.thumbSecondaryValue) == null || valueOf == null) {
            if (z2 && (valueAnimator = this.sliderSecondaryAnimator) != null) {
                valueAnimator.cancel();
            }
            if (z2 || this.sliderSecondaryAnimator == null) {
                Float f3 = this.thumbSecondaryValue;
                this.prevThumbSecondaryValue = f3;
                this.thumbSecondaryValue = valueOf;
                notifyThumbSecondaryChangedListeners(f3, valueOf);
            }
        } else {
            ValueAnimator valueAnimator2 = this.sliderSecondaryAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbSecondaryValue = f2;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.thumbSecondaryValue.floatValue(), valueOf.floatValue());
            ofFloat.addUpdateListener(new sda0(this, 3));
            ofFloat.addListener(this.animatorSecondaryListener);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.sliderSecondaryAnimator = ofFloat;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbSecondaryValue$lambda$5$lambda$4(SliderView sliderView, ValueAnimator valueAnimator) {
        sliderView.thumbSecondaryValue = (Float) valueAnimator.getAnimatedValue();
        sliderView.postInvalidateOnAnimation();
    }

    private final void trySetThumbValue(float f, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        float inBoarders = inBoarders(f);
        float f2 = this.thumbValue;
        if (f2 == inBoarders) {
            return;
        }
        if (z && this.animationEnabled) {
            ValueAnimator valueAnimator2 = this.sliderAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbValue = f2;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.thumbValue, inBoarders);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.i1k0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SliderView.trySetThumbValue$lambda$3$lambda$2(SliderView.this, valueAnimator3);
                }
            });
            ofFloat.addListener(this.animatorListener);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.sliderAnimator = ofFloat;
        } else {
            if (z2 && (valueAnimator = this.sliderAnimator) != null) {
                valueAnimator.cancel();
            }
            if (z2 || this.sliderAnimator == null) {
                float f3 = this.thumbValue;
                this.prevThumbValue = f3;
                this.thumbValue = inBoarders;
                notifyThumbChangedListeners(Float.valueOf(f3), this.thumbValue);
            }
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbValue$lambda$3$lambda$2(SliderView sliderView, ValueAnimator valueAnimator) {
        sliderView.thumbValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sliderView.postInvalidateOnAnimation();
    }

    public final void addOnThumbChangedListener(ChangedListener changedListener) {
        this.listeners.addObserver(changedListener);
    }

    public final void clearOnThumbChangedListener() {
        this.listeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.a11yHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a11yHelper.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final Drawable getActiveTickMarkDrawable() {
        return this.activeTickMarkDrawable;
    }

    public final Drawable getActiveTrackDrawable() {
        return this.activeTrackDrawable;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    public final Thumb getClosestThumb$div_release(int i) {
        return !isThumbSecondaryEnabled() ? Thumb.THUMB : Math.abs(i - toPosition$default(this, this.thumbValue, 0, 1, null)) < Math.abs(i - toPosition$default(this, this.thumbSecondaryValue.floatValue(), 0, 1, null)) ? Thumb.THUMB : Thumb.THUMB_SECONDARY;
    }

    public final Drawable getInactiveTickMarkDrawable() {
        return this.inactiveTickMarkDrawable;
    }

    public final Drawable getInactiveTrackDrawable() {
        return this.inactiveTrackDrawable;
    }

    public final boolean getInteractive() {
        return this.interactive;
    }

    public final float getInterceptionAngle() {
        return this.interceptionAngle;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final int getPositionInView$div_release(float f) {
        return getPaddingLeft() + toPosition$default(this, f, 0, 1, null);
    }

    public final List<Range> getRanges() {
        return this.ranges;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Integer valueOf;
        Companion companion = Companion;
        int max = Math.max(companion.getBoundsHeight(this.activeTrackDrawable), companion.getBoundsHeight(this.inactiveTrackDrawable));
        Iterator<T> it = this.ranges.iterator();
        if (it.hasNext()) {
            Range range = (Range) it.next();
            valueOf = Integer.valueOf(Math.max(companion.getBoundsHeight(range.getActiveTrackDrawable()), companion.getBoundsHeight(range.getInactiveTrackDrawable())));
            while (it.hasNext()) {
                Range range2 = (Range) it.next();
                Companion companion2 = Companion;
                Integer valueOf2 = Integer.valueOf(Math.max(companion2.getBoundsHeight(range2.getActiveTrackDrawable()), companion2.getBoundsHeight(range2.getInactiveTrackDrawable())));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Companion companion3 = Companion;
        return Math.max(Math.max(companion3.getBoundsHeight(this.thumbDrawable), companion3.getBoundsHeight(this.thumbSecondaryDrawable)), Math.max(max, intValue));
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int i = (int) ((this.maxValue - this.minValue) + 1);
        Companion companion = Companion;
        int max = Math.max(Math.max(companion.getBoundsWidth(this.thumbDrawable), companion.getBoundsWidth(this.thumbSecondaryDrawable)), Math.max(companion.getBoundsWidth(this.activeTrackDrawable), companion.getBoundsWidth(this.inactiveTrackDrawable)) * i);
        TextDrawable textDrawable = this.thumbTextDrawable;
        int intrinsicWidth = textDrawable != null ? textDrawable.getIntrinsicWidth() : 0;
        TextDrawable textDrawable2 = this.thumbSecondTextDrawable;
        return Math.max(max, Math.max(intrinsicWidth, textDrawable2 != null ? textDrawable2.getIntrinsicWidth() : 0));
    }

    public final Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    public final TextDrawable getThumbSecondTextDrawable() {
        return this.thumbSecondTextDrawable;
    }

    public final Drawable getThumbSecondaryDrawable() {
        return this.thumbSecondaryDrawable;
    }

    public final Float getThumbSecondaryValue() {
        return this.thumbSecondaryValue;
    }

    public final TextDrawable getThumbTextDrawable() {
        return this.thumbTextDrawable;
    }

    public final float getThumbValue() {
        return this.thumbValue;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        SliderView sliderView;
        SliderView sliderView2 = this;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(sliderView2.getPaddingLeft() + (sliderView2.getMaxTickmarkOrThumbWidth() / 2), sliderView2.getPaddingTop());
        int save = canvas2.save();
        for (Range range : sliderView2.ranges) {
            canvas2.clipRect(range.getStartPosition() - range.getMarginStart(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, range.getMarginEnd() + range.getEndPosition(), sliderView2.getHeight(), Region.Op.DIFFERENCE);
        }
        sliderView2.sliderDrawDelegate.drawInactiveTrack(canvas2, sliderView2.inactiveTrackDrawable);
        float start = sliderView2.activeRange.getStart();
        float end = sliderView2.activeRange.getEnd();
        int position$default = toPosition$default(sliderView2, start, 0, 1, null);
        int position$default2 = toPosition$default(sliderView2, end, 0, 1, null);
        sliderView2.sliderDrawDelegate.drawTrackPart(canvas2, sliderView2.activeTrackDrawable, position$default > position$default2 ? position$default2 : position$default, position$default2 < position$default ? position$default : position$default2);
        canvas2.restoreToCount(save);
        for (Range range2 : sliderView2.ranges) {
            if (range2.getEndPosition() < position$default || range2.getStartPosition() > position$default2) {
                canvas2 = canvas;
                onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
                sliderView = this;
            } else if (range2.getStartPosition() < position$default || range2.getEndPosition() > position$default2) {
                if (range2.getStartPosition() < position$default && range2.getEndPosition() <= position$default2) {
                    Drawable inactiveTrackDrawable = range2.getInactiveTrackDrawable();
                    int i = position$default - 1;
                    int startPosition = range2.getStartPosition();
                    int i2 = i < startPosition ? startPosition : i;
                    canvas2 = canvas;
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, inactiveTrackDrawable, 0, i2, 16, null);
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getActiveTrackDrawable(), position$default, 0, 32, null);
                } else if (range2.getStartPosition() < position$default || range2.getEndPosition() <= position$default2) {
                    canvas2 = canvas;
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
                    onDraw$lambda$10$drawTrackPart(range2, this, canvas2, range2.getActiveTrackDrawable(), position$default, position$default2);
                } else {
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getActiveTrackDrawable(), 0, position$default2, 16, null);
                    Drawable inactiveTrackDrawable2 = range2.getInactiveTrackDrawable();
                    int i3 = position$default2 + 1;
                    int endPosition = range2.getEndPosition();
                    int i4 = i3 > endPosition ? endPosition : i3;
                    canvas2 = canvas;
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, inactiveTrackDrawable2, i4, 0, 32, null);
                }
                sliderView = this;
            } else {
                onDraw$lambda$10$drawTrackPart$default(range2, sliderView2, canvas2, range2.getActiveTrackDrawable(), 0, 0, 48, null);
                sliderView = this;
                canvas2 = canvas;
            }
            sliderView2 = sliderView;
        }
        SliderView sliderView3 = sliderView2;
        int i5 = (int) sliderView3.minValue;
        int i6 = (int) sliderView3.maxValue;
        if (i5 <= i6) {
            while (true) {
                sliderView3.sliderDrawDelegate.drawOnPosition(canvas2, (i5 > ((int) end) || ((int) start) > i5) ? sliderView3.inactiveTickMarkDrawable : sliderView3.activeTickMarkDrawable, sliderView3.toPosition(i5));
                if (i5 == i6) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        sliderView3.sliderDrawDelegate.drawThumb(canvas2, toPosition$default(sliderView3, sliderView3.thumbValue, 0, 1, null), sliderView3.thumbDrawable, (int) sliderView3.thumbValue, sliderView3.thumbTextDrawable);
        if (sliderView3.isThumbSecondaryEnabled()) {
            sliderView3.sliderDrawDelegate.drawThumb(canvas, toPosition$default(sliderView3, sliderView3.thumbSecondaryValue.floatValue(), 0, 1, null), sliderView3.thumbSecondaryDrawable, (int) sliderView3.thumbSecondaryValue.floatValue(), sliderView3.thumbSecondTextDrawable);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.a11yHelper.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int measureDimension = measureDimension(paddingRight, i);
        int measureDimension2 = measureDimension(paddingBottom, i2);
        setMeasuredDimension(measureDimension, measureDimension2);
        this.sliderDrawDelegate.onMeasure(getTrackLength(measureDimension), (measureDimension2 - getPaddingTop()) - getPaddingBottom());
        for (Range range : this.ranges) {
            range.setStartPosition(range.getMarginStart() + toPosition(Math.max(range.getStartValue(), this.minValue), measureDimension));
            range.setEndPosition(toPosition(Math.min(range.getEndValue(), this.maxValue), measureDimension) - range.getMarginEnd());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int scaledTouchSlop;
        if (!this.interactive) {
            return false;
        }
        int x = (((int) motionEvent.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
        int action = motionEvent.getAction();
        if (action == 0) {
            Thumb closestThumb$div_release = getClosestThumb$div_release(x);
            this.thumbOnTouch = closestThumb$div_release;
            setValueToThumb$default(this, closestThumb$div_release, getTouchValue(x), this.animationEnabled, false, 8, null);
            this.prevX = motionEvent.getX();
            this.prevY = motionEvent.getY();
            return true;
        }
        if (action == 1) {
            setValueToThumb$default(this, this.thumbOnTouch, getTouchValue(x), this.animationEnabled, false, 8, null);
            return true;
        }
        if (action != 2) {
            return false;
        }
        setValueToThumb(this.thumbOnTouch, getTouchValue(x), false, true);
        Integer num = this.touchSlop;
        if (num != null) {
            scaledTouchSlop = num.intValue();
        } else {
            scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            this.touchSlop = Integer.valueOf(scaledTouchSlop);
        }
        float abs = Math.abs(motionEvent.getY() - this.prevY);
        if (abs < scaledTouchSlop) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getParent().requestDisallowInterceptTouchEvent(abs / Math.abs(motionEvent.getX() - this.prevX) <= this.interceptionAngleTg);
        }
        this.prevX = motionEvent.getX();
        this.prevY = motionEvent.getY();
        return true;
    }

    public final void setActiveTickMarkDrawable(Drawable drawable) {
        this.activeTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setActiveTrackDrawable(Drawable drawable) {
        this.activeTrackDrawable = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j) {
        if (this.animationDuration == j || j < 0) {
            return;
        }
        this.animationDuration = j;
    }

    public final void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    public final void setInactiveTickMarkDrawable(Drawable drawable) {
        this.inactiveTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setInactiveTrackDrawable(Drawable drawable) {
        this.inactiveTrackDrawable = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z) {
        this.interactive = z;
    }

    public final void setInterceptionAngle(float f) {
        float max = Math.max(45.0f, Math.abs(f) % 90);
        this.interceptionAngle = max;
        this.interceptionAngleTg = (float) Math.tan(max);
    }

    public final void setMaxValue(float f) {
        if (this.maxValue == f) {
            return;
        }
        setMinValue(Math.min(this.minValue, f - 1.0f));
        this.maxValue = f;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setMinValue(float f) {
        if (this.minValue == f) {
            return;
        }
        setMaxValue(Math.max(this.maxValue, 1.0f + f));
        this.minValue = f;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.thumbDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(TextDrawable textDrawable) {
        this.thumbSecondTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(Drawable drawable) {
        this.thumbSecondaryDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondaryValue(Float f, boolean z) {
        trySetThumbSecondaryValue(f, z, true);
    }

    public final void setThumbTextDrawable(TextDrawable textDrawable) {
        this.thumbTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbValue(float f, boolean z) {
        trySetThumbValue(f, z, true);
    }

    public final void setValueToAccessibilityThumb$div_release(Thumb thumb, float f) {
        setValueToThumb(thumb, inBoarders(f), false, true);
    }

    private final int toPosition(int i) {
        return toPosition$default(this, i, 0, 1, null);
    }

    /* compiled from: SliderView.kt */
    public interface ChangedListener {
        default void onThumbSecondaryValueChanged(Float f) {
        }

        default void onThumbValueChanged(float f) {
        }
    }
}
