package com.yandex.messaging.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.div.state.db.StateEntry;
import com.yandex.images.FadingDrawable;
import defpackage.ase;
import defpackage.gjb1;
import defpackage.k3i0;
import defpackage.kjs0;
import defpackage.ny61;
import defpackage.z83;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\u001e\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u0010!\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010/R*\u00102\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/yandex/messaging/views/RoundImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "configurePath", "()V", "onDetachedFromWindow", "onAttachedToWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "leftTop", "rightTop", "leftBottom", "rightBottom", "setCornerRadiiDp", "(FFFF)V", "Lase;", "radii", "(Lase;)V", "Landroid/graphics/RectF;", "destination", "Landroid/graphics/RectF;", "maskRect", "Landroid/graphics/Path;", "maskPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "clearPaint", "Landroid/graphics/Paint;", StateEntry.COLUMN_PATH, "", "[F", "", "value", "clipToPadding", "Z", "getClipToPadding", "()Z", "setClipToPadding", "(Z)V", "OutlineProvider", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public class RoundImageView extends AppCompatImageView {
    public static final int $stable = 8;
    private final Paint clearPaint;
    private boolean clipToPadding;
    private final RectF destination;
    private final Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private float[] radii;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/views/RoundImageView$OutlineProvider;", "Landroid/view/ViewOutlineProvider;", "<init>", "(Lcom/yandex/messaging/views/RoundImageView;)V", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lzy11;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "Landroid/graphics/Rect;", "mRect", "Landroid/graphics/Rect;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class OutlineProvider extends ViewOutlineProvider {
        private final Rect mRect = new Rect();

        public OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            float f = RoundImageView.this.radii[0];
            int i = 1;
            while (true) {
                RoundImageView roundImageView = RoundImageView.this;
                if (i >= 8) {
                    roundImageView.destination.round(this.mRect);
                    outline.setRoundRect((int) Math.ceil(this.mRect.left), (int) Math.ceil(this.mRect.top), (int) Math.floor(this.mRect.right), (int) Math.floor(this.mRect.bottom), f);
                    return;
                } else {
                    if (roundImageView.radii[i] != f) {
                        outline.setConvexPath(RoundImageView.this.path);
                        return;
                    }
                    i++;
                }
            }
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.destination = new RectF();
        this.maskRect = new RectF();
        this.maskPath = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.clearPaint = paint;
        this.path = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3i0.RoundImageView, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(k3i0.RoundImageView_leftTopRadius, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(k3i0.RoundImageView_rightTopRadius, 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(k3i0.RoundImageView_leftBottomRadius, 0);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(k3i0.RoundImageView_rightBottomRadius, 0);
        obtainStyledAttributes.recycle();
        float f = dimensionPixelSize;
        if (f < 0.0f || dimensionPixelSize2 < 0.0f || dimensionPixelSize3 < 0.0f || dimensionPixelSize4 < 0.0f) {
            ny61.g("radius values cannot be negative.");
            throw null;
        }
        float f2 = dimensionPixelSize2;
        float f3 = dimensionPixelSize4;
        float f4 = dimensionPixelSize3;
        this.radii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        setOutlineProvider(new OutlineProvider());
    }

    private final void configurePath() {
        boolean z = this.clipToPadding;
        RectF rectF = this.destination;
        if (z) {
            rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        } else {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.path.rewind();
        this.path.addRoundRect(this.destination, this.radii, Path.Direction.CW);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, getWidth(), getHeight());
        this.maskPath.addRect(this.maskRect, Path.Direction.CCW);
    }

    public final boolean getClipToPadding() {
        return this.clipToPadding;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            canvas.drawPath(this.maskPath, this.clearPaint);
        } catch (RuntimeException e) {
            Drawable drawable = getDrawable();
            if ((drawable instanceof FadingDrawable ? (FadingDrawable) drawable : null) != null) {
                z83.i();
            }
            throw e;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        configurePath();
    }

    public final void setClipToPadding(boolean z) {
        boolean z2 = this.clipToPadding;
        this.clipToPadding = z;
        if (z2 != z) {
            configurePath();
            invalidate();
        }
    }

    public final void setCornerRadiiDp(float leftTop, float rightTop, float leftBottom, float rightBottom) {
        float c = kjs0.c(leftTop);
        float c2 = kjs0.c(rightTop);
        float c3 = kjs0.c(leftBottom);
        float c4 = kjs0.c(rightBottom);
        float[] fArr = this.radii;
        if (fArr.length == 8 && gjb1.b(fArr[0], c) && gjb1.b(this.radii[2], c2) && gjb1.b(this.radii[4], c4) && gjb1.b(this.radii[6], c3)) {
            return;
        }
        this.radii = new float[]{c, c, c2, c2, c4, c4, c3, c3};
        configurePath();
        invalidate();
    }

    public void setCornerRadiiDp(ase radii) {
        setCornerRadiiDp(radii.a, radii.b, radii.d, radii.c);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public RoundImageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
