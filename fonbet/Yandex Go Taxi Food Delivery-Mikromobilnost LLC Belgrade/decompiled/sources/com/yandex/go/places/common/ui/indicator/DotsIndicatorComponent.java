package com.yandex.go.places.common.ui.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b6w;
import defpackage.d6w;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.qke;
import defpackage.tje;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.ytg0;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.HapticController$Effect;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\n2\b\b\u0001\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010 J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\fJ'\u0010(\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010 R\"\u00105\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00101\u001a\u0004\b6\u00103\"\u0004\b7\u0010 R\"\u00108\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00101\u001a\u0004\b9\u00103\"\u0004\b:\u0010 R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00101R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00101R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00101R\u0014\u0010B\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00101R\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00101R\u0016\u0010F\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00101R\u0016\u0010G\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00101R\u0016\u0010H\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00101R\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010CR\u0016\u0010L\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010C¨\u0006M"}, d2 = {"Lcom/yandex/go/places/common/ui/indicator/DotsIndicatorComponent;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setDotsCount", "()V", "Landroid/graphics/Canvas;", "canvas", "", "cx", "cy", "radius", "drawCircleWithStroke", "(Landroid/graphics/Canvas;FFF)V", "startColor", "endColor", "interpolatedColor", "(II)I", "start", "end", "fraction", "interpolate", "(IIF)F", "elementsCount", "setElementsCount", "(I)V", "maxDotsCount", "setMaxDotsCount", "scrollFinished", "position", "positionOffset", "", "ignoreRtl", "setPageScroll", "(IFZ)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDraw", "(Landroid/graphics/Canvas;)V", "selectedDotColor", CA20Status.STATUS_USER_I, "getSelectedDotColor", "()I", "setSelectedDotColor", "dotColor", "getDotColor", "setDotColor", "strokeColor", "getStrokeColor", "setStrokeColor", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "strokePaint", "selectedDotRadius", "dotRadius", "dotSpacing", "isViewRtl", "Z", "lastIndex", "middleDotIndex", "maxDotCount", "dotsCount", "currentIndex", "currentPositionOffset", "F", "isRtl", "isNextLast", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DotsIndicatorComponent extends View {
    private int currentIndex;
    private float currentPositionOffset;
    private int dotColor;
    private final int dotRadius;
    private final int dotSpacing;
    private int dotsCount;
    private boolean isNextLast;
    private boolean isRtl;
    private final boolean isViewRtl;
    private int lastIndex;
    private int maxDotCount;
    private int middleDotIndex;
    private final Paint paint;
    private int selectedDotColor;
    private final int selectedDotRadius;
    private int strokeColor;
    private final Paint strokePaint;

    public DotsIndicatorComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectedDotColor = getContext().getColor(mqg0.black);
        this.dotColor = getContext().getColor(mqg0.black_alpha20);
        this.strokeColor = getContext().getColor(mqg0.white_alpha50);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.paint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.strokeColor);
        paint2.setStrokeWidth(tje.v(getContext(), 0.5f));
        this.strokePaint = paint2;
        this.selectedDotRadius = tje.r(mrg0.component_dots_indicator_large_item_size, getContext()) / 2;
        this.dotRadius = tje.r(mrg0.component_dots_indicator_normal_item_size, getContext()) / 2;
        this.dotSpacing = tje.r(ytg0.discovery_organizations_dot_indicator_spacing, getContext());
        boolean n = xw31.n(context);
        this.isViewRtl = n;
        this.maxDotCount = 3;
        this.isRtl = n;
    }

    private final void drawCircleWithStroke(Canvas canvas, float cx, float cy, float radius) {
        canvas.drawCircle(cx, cy, radius, this.paint);
        canvas.drawCircle(cx, cy, radius, this.strokePaint);
    }

    private final float interpolate(int start, int end, float fraction) {
        return ((end - start) * fraction) + start;
    }

    private final int interpolatedColor(int startColor, int endColor) {
        return Color.argb((int) interpolate(Color.alpha(startColor), Color.alpha(endColor), this.currentPositionOffset), (int) interpolate(Color.red(startColor), Color.red(endColor), this.currentPositionOffset), (int) interpolate(Color.green(startColor), Color.green(endColor), this.currentPositionOffset), (int) interpolate(Color.blue(startColor), Color.blue(endColor), this.currentPositionOffset));
    }

    private final void setDotsCount() {
        int min = Math.min(this.lastIndex + 1, this.maxDotCount);
        this.dotsCount = min;
        this.middleDotIndex = min / 2;
        requestLayout();
    }

    public static /* synthetic */ void setPageScroll$default(DotsIndicatorComponent dotsIndicatorComponent, int i, float f, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        dotsIndicatorComponent.setPageScroll(i, f, z);
    }

    public final int getDotColor() {
        return this.dotColor;
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x012f A[LOOP:0: B:21:0x006d->B:27:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0132 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f;
        int i = this.dotsCount;
        if (i <= 1) {
            return;
        }
        int i2 = (i * 2 * this.selectedDotRadius) + ((i - 1) * this.dotSpacing);
        int width = this.isRtl ? ((getWidth() - i2) / 2) - ((this.selectedDotRadius * 2) + this.dotSpacing) : (getWidth() - i2) / 2;
        boolean z = this.isRtl;
        int i3 = z ? 1 : -1;
        b6w i4 = z ? y6i0.i(3, 0) : new d6w(0, this.dotsCount, 1);
        int i5 = i4.b;
        int i6 = i4.a;
        float f2 = (this.currentIndex != this.middleDotIndex || this.isNextLast) ? 0.0f : this.currentPositionOffset * i3 * ((this.selectedDotRadius * 2) + this.dotSpacing);
        int i7 = i4.c;
        if ((i7 <= 0 || i6 > i5) && (i7 >= 0 || i5 > i6)) {
            return;
        }
        int i8 = i6;
        while (true) {
            this.paint.setColor(this.dotColor);
            int i9 = this.dotRadius;
            float f3 = i9;
            int i10 = this.currentIndex;
            if (i8 == i10) {
                this.paint.setColor(interpolatedColor(this.selectedDotColor, this.dotColor));
                f3 = interpolate(this.dotRadius, this.selectedDotRadius, 1.0f - this.currentPositionOffset);
            } else if (i8 == i10 + 1) {
                this.paint.setColor(interpolatedColor(this.dotColor, this.selectedDotColor));
                f3 = interpolate(this.dotRadius, this.selectedDotRadius, this.currentPositionOffset);
            } else {
                if (i8 == i6) {
                    if (!this.isRtl || f2 == 0.0f) {
                        if (f2 != 0.0f) {
                            f3 = interpolate(0, i9, 1.0f - this.currentPositionOffset);
                        }
                        f = 0.0f;
                    } else {
                        f3 = interpolate(0, i9, this.currentPositionOffset);
                        f = (this.selectedDotRadius * 2) + this.dotSpacing;
                    }
                } else if (i8 == i5) {
                    if (this.isRtl && f2 != 0.0f) {
                        f3 = interpolate(0, i9, 1.0f - this.currentPositionOffset);
                    } else if (f2 != 0.0f && i3 * f2 > i9 * 2) {
                        f3 = interpolate(0, i9, this.currentPositionOffset);
                        f = -((this.selectedDotRadius * 2) + this.dotSpacing);
                    }
                    f = 0.0f;
                }
                float max = Math.max(f3 - this.dotRadius, 0.0f);
                drawCircleWithStroke(canvas, width + f3 + f, getHeight() / 2.0f, f3);
                width += (this.selectedDotRadius * 2) + this.dotSpacing + ((int) max);
                if (i8 != i5) {
                    return;
                } else {
                    i8 += i7;
                }
            }
            f = f2;
            float max2 = Math.max(f3 - this.dotRadius, 0.0f);
            drawCircleWithStroke(canvas, width + f3 + f, getHeight() / 2.0f, f3);
            width += (this.selectedDotRadius * 2) + this.dotSpacing + ((int) max2);
            if (i8 != i5) {
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = this.selectedDotRadius * 2;
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824) {
            i = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        int i2 = this.dotsCount;
        setMeasuredDimension((i2 * 2 * this.selectedDotRadius) + ((i2 - 1) * this.dotSpacing), i);
    }

    public final void scrollFinished() {
        qke.E(getContext(), HapticController$Effect.TICK, false, 8);
    }

    public final void setDotColor(int i) {
        this.dotColor = i;
    }

    public final void setElementsCount(int elementsCount) {
        this.lastIndex = elementsCount - 1;
        setDotsCount();
    }

    public final void setMaxDotsCount(int maxDotsCount) {
        this.maxDotCount = maxDotsCount;
        setDotsCount();
    }

    public final void setPageScroll(int position, float positionOffset, boolean ignoreRtl) {
        this.isRtl = this.isViewRtl && !ignoreRtl;
        d6w d6wVar = new d6w(0, this.middleDotIndex, 1);
        int i = this.lastIndex;
        int i2 = (i - this.middleDotIndex) + 1;
        d6w d6wVar2 = new d6w(i2, i, 1);
        this.currentIndex = (position > d6wVar.b || position < 0) ? (position > d6wVar2.b || i2 > position) ? this.middleDotIndex : (this.dotsCount % 2) + a.T(d6wVar2, Integer.valueOf(position)) + this.middleDotIndex : position;
        this.isNextLast = position == ((this.dotsCount + 1) % 2) + (this.lastIndex - this.middleDotIndex);
        this.currentPositionOffset = positionOffset;
        invalidate();
    }

    public final void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
    }

    public final void setStrokeColor(int i) {
        this.strokeColor = i;
    }

    public DotsIndicatorComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DotsIndicatorComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DotsIndicatorComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
