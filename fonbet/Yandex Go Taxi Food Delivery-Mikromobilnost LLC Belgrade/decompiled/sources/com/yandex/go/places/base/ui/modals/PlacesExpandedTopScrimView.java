package com.yandex.go.places.base.ui.modals;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/go/places/base/ui/modals/PlacesExpandedTopScrimView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "height", "Lzy11;", "setTopWindowInsetHeight", "(I)V", "radius", "setCornerRadius", "color", "setScrimColor", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "hasOverlappingRendering", "()Z", "topWindowInset", CA20Status.STATUS_USER_I, "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "clipOutRect", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "clipOutCirclesPath", "Landroid/graphics/Path;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesExpandedTopScrimView extends View {
    private final Path clipOutCirclesPath;
    private final RectF clipOutRect;
    private float cornerRadius;
    private final Paint paint;
    private int topWindowInset;

    public PlacesExpandedTopScrimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        this.clipOutRect = new RectF();
        this.clipOutCirclesPath = new Path();
        setClickable(false);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.cornerRadius == 0.0f) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.paint);
            return;
        }
        Canvas canvas2 = canvas;
        this.clipOutCirclesPath.reset();
        Path path = this.clipOutCirclesPath;
        float f = this.cornerRadius;
        float height = getHeight();
        float f2 = this.cornerRadius;
        Path.Direction direction = Path.Direction.CCW;
        path.addCircle(f, height, f2, direction);
        path.addCircle(getWidth() - this.cornerRadius, getHeight(), this.cornerRadius, direction);
        this.clipOutRect.set(this.cornerRadius, getHeight() - this.cornerRadius, getWidth() - this.cornerRadius, getHeight());
        int save = canvas2.save();
        try {
            canvas2.clipOutRect(this.clipOutRect);
            canvas2.clipOutPath(this.clipOutCirclesPath);
            try {
                canvas2.drawRect(0.0f, 0.0f, canvas2.getWidth(), canvas2.getHeight(), this.paint);
                canvas2.restoreToCount(save);
            } catch (Throwable th) {
                th = th;
                canvas2 = canvas2;
                Throwable th2 = th;
                canvas2.restoreToCount(save);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (this.topWindowInset + this.cornerRadius), 1073741824));
    }

    public final void setCornerRadius(int radius) {
        float f = radius;
        if (this.cornerRadius == f) {
            return;
        }
        this.cornerRadius = f;
        requestLayout();
    }

    public final void setScrimColor(int color) {
        if (this.paint.getColor() == color) {
            return;
        }
        this.paint.setColor(color);
        invalidate();
    }

    public final void setTopWindowInsetHeight(int height) {
        if (this.topWindowInset == height) {
            return;
        }
        this.topWindowInset = height;
        requestLayout();
    }

    public PlacesExpandedTopScrimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlacesExpandedTopScrimView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PlacesExpandedTopScrimView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
