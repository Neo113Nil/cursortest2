package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import defpackage.e890;
import defpackage.job1;
import defpackage.k3i0;
import defpackage.kjs0;
import defpackage.pt31;
import defpackage.qt31;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001GB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0014¢\u0006\u0004\b \u0010!J7\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u00100\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00101R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u00105\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R.\u0010;\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0017R\u0014\u0010E\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/yandex/messaging/views/ViewPagerIndicator;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "currentPosition", "", "positionOffset", "Lzy11;", "updateIndicatorPosition", "(IF)V", "left", "right", "setIndicatorPosition", "(FF)V", CoreConstants.PushMessage.SERVICE_TYPE, "countDotPosition", "(I)I", "countWidth", "()F", "countStart", "colorInt", "setColorFilter", "(I)V", "clearColorFilter", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "top", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "dotSpacing", CA20Status.STATUS_USER_I, "dotSize", "defaultDotColor", "defaultDotColorAlpha", "F", "defaultSelectedDotColor", "selLeft", "selRight", "currentPositionOffset", "Landroid/graphics/Paint;", "dotPaint", "Landroid/graphics/Paint;", "selectedDotPaint", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "setViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "getRadius", "radius", "getDotsCount", "()I", "dotsCount", "Companion", "pt31", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ViewPagerIndicator extends View {
    public static final int $stable = 8;
    public static final pt31 Companion = new pt31();
    private static final int DEFAULT_COLOR = 0;
    private static final int DEFAULT_SELECTED_COLOR = -16777216;
    private static final int DEFAULT_SIZE_DP = 5;
    private static final int DEFAULT_SPACING_DP = 10;
    private int currentPosition;
    private float currentPositionOffset;
    private final int defaultDotColor;
    private final float defaultDotColorAlpha;
    private final int defaultSelectedDotColor;
    private final Paint dotPaint;
    private final int dotSize;
    private final int dotSpacing;
    private float selLeft;
    private float selRight;
    private final Paint selectedDotPaint;
    private ViewPager viewPager;

    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.dotPaint = paint;
        Paint paint2 = new Paint(1);
        this.selectedDotPaint = paint2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.ViewPagerIndicator, 0, 0);
        this.dotSpacing = obtainStyledAttributes.getDimensionPixelSize(k3i0.ViewPagerIndicator_dotSpacing, kjs0.b(10));
        this.dotSize = obtainStyledAttributes.getDimensionPixelSize(k3i0.ViewPagerIndicator_dotSize, kjs0.b(5));
        TypedValue typedValue = new TypedValue();
        this.defaultDotColorAlpha = obtainStyledAttributes.getValue(k3i0.ViewPagerIndicator_dotColorAlpha, typedValue) ? typedValue.getFloat() : 1.0f;
        int color = obtainStyledAttributes.getColor(k3i0.ViewPagerIndicator_dotColor, 0);
        this.defaultDotColor = color;
        int color2 = obtainStyledAttributes.getColor(k3i0.ViewPagerIndicator_dotColorSelected, -16777216);
        this.defaultSelectedDotColor = color2;
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint2.setColor(color2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        obtainStyledAttributes.recycle();
    }

    private final int countDotPosition(int i) {
        return (int) ((((2.0f * getRadius()) + this.dotSpacing) * i) + countStart() + getRadius());
    }

    private final float countStart() {
        return (getWidth() - countWidth()) / 2.0f;
    }

    private final float countWidth() {
        return (getRadius() * 2.0f * getDotsCount()) + ((getDotsCount() - 1) * this.dotSpacing);
    }

    private final int getDotsCount() {
        e890 adapter;
        ViewPager viewPager = this.viewPager;
        if (viewPager == null || (adapter = viewPager.getAdapter()) == null) {
            return 0;
        }
        return adapter.b() + 1;
    }

    private final float getRadius() {
        return this.dotSize / 2.0f;
    }

    private final void setIndicatorPosition(float left, float right) {
        if (left == this.selLeft && right == this.selRight) {
            return;
        }
        this.selLeft = left;
        this.selRight = right;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIndicatorPosition(int currentPosition, float positionOffset) {
        float countStart = countStart();
        int i = this.dotSize;
        int i2 = this.dotSpacing;
        int i3 = (i * 2) + i2;
        float f = i + i2;
        float f2 = currentPosition;
        float min = ((Math.min(1.0f, positionOffset * 2.0f) + f2) * f) + countStart;
        float f3 = ((f2 + (positionOffset > 0.5f ? (positionOffset - 0.5f) * 2.0f : 0.0f)) * f) + countStart + i3;
        int i4 = this.dotSize;
        setIndicatorPosition(min + (i4 / 2), f3 - (i4 / 2));
    }

    public final void clearColorFilter() {
        this.dotPaint.setColor(job1.g(this.defaultDotColor, this.defaultDotColorAlpha));
        this.selectedDotPaint.setColor(this.defaultSelectedDotColor);
    }

    public final ViewPager getViewPager() {
        return this.viewPager;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int dotsCount = getDotsCount();
        if (dotsCount == 1) {
            return;
        }
        for (int i = 0; i < dotsCount; i++) {
            canvas.drawCircle(countDotPosition(i), getRadius(), getRadius(), this.dotPaint);
        }
        this.selectedDotPaint.setStrokeWidth(this.dotSize);
        canvas.drawLine(this.selLeft, getRadius(), this.selRight, getRadius(), this.selectedDotPaint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        updateIndicatorPosition(this.currentPosition, this.currentPositionOffset);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec), View.resolveSize(this.dotSize, heightMeasureSpec));
    }

    public final void setColorFilter(int colorInt) {
        this.dotPaint.setColor(job1.g(colorInt, this.defaultDotColorAlpha));
        this.selectedDotPaint.setColor(colorInt);
    }

    public final void setViewPager(ViewPager viewPager) {
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new qt31(this));
        } else {
            viewPager = null;
        }
        this.viewPager = viewPager;
        invalidate();
    }
}
