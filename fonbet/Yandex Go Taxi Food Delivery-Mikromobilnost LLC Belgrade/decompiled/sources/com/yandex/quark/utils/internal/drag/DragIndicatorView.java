package com.yandex.quark.utils.internal.drag;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import com.yandex.div.state.db.StateEntry;
import com.yandex.quark.utils.internal.drag.DragIndicatorView;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.q9m;
import defpackage.sls;
import defpackage.svg0;
import defpackage.w511;
import defpackage.y6i0;
import defpackage.zpg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 32\u00020\u0001:\u000245B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010+¨\u00066"}, d2 = {"Lcom/yandex/quark/utils/internal/drag/DragIndicatorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "start", "end", "fraction", "interpolate", "(FFF)F", "Lzy11;", "playThresholdBounce", "()V", "deltaY", "setDragDelta", "(F)V", "resetToBar", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "indicatorPaint", "Landroid/graphics/Paint;", "thresholdPx$delegate", "Li3y;", "getThresholdPx", "()F", "thresholdPx", "bounceOffsetPx$delegate", "getBounceOffsetPx", "bounceOffsetPx", "dragDeltaY", "F", "", "wasAboveUpThreshold", "Z", "Landroid/animation/AnimatorSet;", "bounceAnimator", "Landroid/animation/AnimatorSet;", "translationYBeforeBounce", "Companion", "Direction", "q9m", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DragIndicatorView extends View {
    private static final long BOUNCE_DOWN_DURATION_MS = 110;
    private static final float BOUNCE_OFFSET_DP = 3.0f;
    private static final long BOUNCE_UP_DURATION_MS = 70;
    private static final q9m Companion = new q9m();
    private static final float DIRECTION_DEAD_ZONE_PX = 2.0f;
    private static final int PROGRESS_BUCKET_COUNT = 60;
    private static final float SIDE_END_OFFSET_FACTOR = 0.6f;
    private AnimatorSet bounceAnimator;

    /* renamed from: bounceOffsetPx$delegate, reason: from kotlin metadata */
    private final i3y bounceOffsetPx;
    private float dragDeltaY;
    private final Paint indicatorPaint;
    private final Path path;

    /* renamed from: thresholdPx$delegate, reason: from kotlin metadata */
    private final i3y thresholdPx;
    private float translationYBeforeBounce;
    private boolean wasAboveUpThreshold;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/quark/utils/internal/drag/DragIndicatorView$Direction;", "", "Up", "Down", "None", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Direction {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction Down;
        public static final Direction None;
        public static final Direction Up;

        static {
            Direction direction = new Direction("Up", 0);
            Up = direction;
            Direction direction2 = new Direction("Down", 1);
            Down = direction2;
            Direction direction3 = new Direction("None", 2);
            None = direction3;
            Direction[] directionArr = {direction, direction2, direction3};
            $VALUES = directionArr;
            $ENTRIES = kotlin.enums.a.a(directionArr);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    public DragIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.path = new Path();
        final int i2 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDimension(svg0.quark_drag_indicator_stroke));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(context.getColor(zpg0.quark_drag_indicator));
        this.indicatorPaint = paint;
        final int i3 = 0;
        this.thresholdPx = kotlin.a.a(new sls(this) { // from class: p9m
            public final /* synthetic */ DragIndicatorView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float thresholdPx_delegate$lambda$1;
                int i4 = i3;
                DragIndicatorView dragIndicatorView = this.b;
                switch (i4) {
                    case 0:
                        thresholdPx_delegate$lambda$1 = DragIndicatorView.thresholdPx_delegate$lambda$1(dragIndicatorView);
                        break;
                    default:
                        thresholdPx_delegate$lambda$1 = DragIndicatorView.bounceOffsetPx_delegate$lambda$2(dragIndicatorView);
                        break;
                }
                return Float.valueOf(thresholdPx_delegate$lambda$1);
            }
        });
        this.bounceOffsetPx = kotlin.a.a(new sls(this) { // from class: p9m
            public final /* synthetic */ DragIndicatorView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float thresholdPx_delegate$lambda$1;
                int i4 = i2;
                DragIndicatorView dragIndicatorView = this.b;
                switch (i4) {
                    case 0:
                        thresholdPx_delegate$lambda$1 = DragIndicatorView.thresholdPx_delegate$lambda$1(dragIndicatorView);
                        break;
                    default:
                        thresholdPx_delegate$lambda$1 = DragIndicatorView.bounceOffsetPx_delegate$lambda$2(dragIndicatorView);
                        break;
                }
                return Float.valueOf(thresholdPx_delegate$lambda$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float bounceOffsetPx_delegate$lambda$2(DragIndicatorView dragIndicatorView) {
        return dragIndicatorView.getResources().getDisplayMetrics().density * 3.0f;
    }

    private final float getBounceOffsetPx() {
        return ((Number) this.bounceOffsetPx.getValue()).floatValue();
    }

    private final float getThresholdPx() {
        return ((Number) this.thresholdPx.getValue()).floatValue();
    }

    private final float interpolate(float start, float end, float fraction) {
        return g8e.b(end, start, fraction, start);
    }

    private final void playThresholdBounce() {
        AnimatorSet animatorSet = this.bounceAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float translationY = getTranslationY();
        this.translationYBeforeBounce = translationY;
        float bounceOffsetPx = translationY - getBounceOffsetPx();
        float[] fArr = {this.translationYBeforeBounce, bounceOffsetPx};
        Property property = View.TRANSLATION_Y;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<DragIndicatorView, Float>) property, fArr);
        ofFloat.setDuration(BOUNCE_UP_DURATION_MS);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<DragIndicatorView, Float>) property, bounceOffsetPx, this.translationYBeforeBounce);
        ofFloat2.setDuration(BOUNCE_DOWN_DURATION_MS);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(ofFloat, ofFloat2);
        animatorSet2.start();
        this.bounceAnimator = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float thresholdPx_delegate$lambda$1(DragIndicatorView dragIndicatorView) {
        return dragIndicatorView.getResources().getDimension(svg0.quark_drag_threshold);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.bounceAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.bounceAnimator = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float width2 = (getWidth() / 2.0f) - (this.indicatorPaint.getStrokeWidth() / 2.0f);
        float f = this.dragDeltaY;
        Direction direction = f > 2.0f ? Direction.Up : f < -2.0f ? Direction.Down : Direction.None;
        float c = y6i0.c(Math.abs(f) / getThresholdPx(), 0.0f, 1.0f);
        float height2 = (getHeight() - this.indicatorPaint.getStrokeWidth()) / 2.0f;
        float f2 = height2 >= 0.0f ? height2 : 0.0f;
        float f3 = height - f2;
        float f4 = 0.6f * f2;
        float f5 = height + f4;
        float f6 = f2 + height;
        float f7 = height - f4;
        int[] iArr = a.a;
        int i = iArr[direction.ordinal()];
        if (i != 1) {
            if (i == 2) {
                f3 = f6;
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                f3 = height;
            }
        }
        int i2 = iArr[direction.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                f5 = f7;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return;
                }
                f5 = height;
            }
        }
        float interpolate = interpolate(height, f3, c);
        float interpolate2 = interpolate(height, f5, c);
        this.path.reset();
        this.path.moveTo(width - width2, interpolate2);
        this.path.lineTo(width, interpolate);
        this.path.lineTo(width + width2, interpolate2);
        canvas.drawPath(this.path, this.indicatorPaint);
    }

    public final void resetToBar() {
        AnimatorSet animatorSet = this.bounceAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.bounceAnimator = null;
        setTranslationY(this.translationYBeforeBounce);
        this.wasAboveUpThreshold = false;
        if (this.dragDeltaY == 0.0f) {
            return;
        }
        this.dragDeltaY = 0.0f;
        postInvalidateOnAnimation();
    }

    public final void setDragDelta(float deltaY) {
        float f = this.dragDeltaY;
        Direction direction = f > 2.0f ? Direction.Up : f < -2.0f ? Direction.Down : Direction.None;
        Direction direction2 = deltaY > 2.0f ? Direction.Up : deltaY < -2.0f ? Direction.Down : Direction.None;
        int c = (int) (y6i0.c(Math.abs(f) / getThresholdPx(), 0.0f, 1.0f) * 60.0f);
        int c2 = (int) (y6i0.c(Math.abs(deltaY) / getThresholdPx(), 0.0f, 1.0f) * 60.0f);
        boolean z = deltaY >= getThresholdPx();
        if (z && !this.wasAboveUpThreshold) {
            playThresholdBounce();
        }
        this.wasAboveUpThreshold = z;
        this.dragDeltaY = deltaY;
        if (direction == direction2 && c == c2) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public DragIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DragIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DragIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
