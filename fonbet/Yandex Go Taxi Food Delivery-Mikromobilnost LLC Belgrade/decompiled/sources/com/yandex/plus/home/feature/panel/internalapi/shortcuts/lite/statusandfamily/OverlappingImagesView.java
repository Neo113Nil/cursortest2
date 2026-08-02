package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.ffx;
import defpackage.h8;
import defpackage.wuj0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010 R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+¨\u0006."}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/statusandfamily/OverlappingImagesView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "maskRes", "setMask", "(I)V", "imageSize", "maxImageOffset", "imageOutlineWidth", "setProperties", "(III)V", "imagesCount", "setImagesCount", CA20Status.STATUS_USER_I, "Landroid/graphics/Bitmap;", "imageMask", "Landroid/graphics/Bitmap;", "outlineMask", "Landroid/graphics/Paint;", "destinationInPaint", "Landroid/graphics/Paint;", "destinationOutPaint", "imageCanvas", "Landroid/graphics/Canvas;", "imageBitmap", "Landroid/graphics/Rect;", "srcRect", "Landroid/graphics/Rect;", "dstRect", "ChildImageView", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OverlappingImagesView extends FrameLayout {
    private final Paint destinationInPaint;
    private final Paint destinationOutPaint;
    private Rect dstRect;
    private Bitmap imageBitmap;
    private Canvas imageCanvas;
    private Bitmap imageMask;
    private int imageOutlineWidth;
    private int imageSize;
    private int maxImageOffset;
    private Bitmap outlineMask;
    private Rect srcRect;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\u00060\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/statusandfamily/OverlappingImagesView$ChildImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Bitmap;", "", "isHardware", "(Landroid/graphics/Bitmap;)Z", "kotlin.jvm.PlatformType", "toSoftwareBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lzy11;", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "bitmap", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class ChildImageView extends AppCompatImageView {
        public ChildImageView(Context context) {
            super(context);
        }

        private final boolean isHardware(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.HARDWARE;
        }

        private final Bitmap toSoftwareBitmap(Bitmap bitmap) {
            return bitmap.copy(Bitmap.Config.ARGB_8888, false);
        }

        @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
        public void setImageBitmap(Bitmap bitmap) {
            if (bitmap != null && isHardware(bitmap)) {
                bitmap = toSoftwareBitmap(bitmap);
            }
            super.setImageBitmap(bitmap);
        }

        @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
        public void setImageDrawable(Drawable drawable) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (isHardware(bitmapDrawable.getBitmap())) {
                    drawable = new BitmapDrawable(getContext().getResources(), toSoftwareBitmap(bitmapDrawable.getBitmap()));
                }
            }
            super.setImageDrawable(drawable);
        }
    }

    public OverlappingImagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.destinationInPaint = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.destinationOutPaint = paint2;
        this.imageCanvas = new Canvas();
        this.srcRect = new Rect();
        this.dstRect = new Rect();
        setLayerType(1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int width = getWidth() - this.imageSize;
        int childCount = getChildCount() - 1;
        if (childCount < 1) {
            childCount = 1;
        }
        int min = Math.min(this.maxImageOffset, (width / childCount) - this.imageSize);
        for (int childCount2 = getChildCount() - 1; -1 < childCount2; childCount2--) {
            getChildAt(childCount2).draw(this.imageCanvas);
            Bitmap bitmap = this.imageMask;
            if (bitmap != null) {
                this.imageCanvas.drawBitmap(bitmap, 0.0f, 0.0f, this.destinationInPaint);
            }
            if (childCount2 > 0 && min < 0) {
                int i = this.imageSize;
                int i2 = this.imageOutlineWidth;
                int i3 = i + i2 + min;
                int i4 = (-min) + i2;
                this.srcRect.set(i3, i2, i3 + i4, i2 + i);
                this.dstRect.set(0, 0, i4, i);
                Bitmap bitmap2 = this.outlineMask;
                if (bitmap2 != null) {
                    this.imageCanvas.drawBitmap(bitmap2, this.srcRect, this.dstRect, this.destinationOutPaint);
                }
            }
            float f = childCount2 * (this.imageSize + min);
            Bitmap bitmap3 = this.imageBitmap;
            if (bitmap3 != null) {
                int save = canvas.save();
                canvas.translate(f, 0.0f);
                try {
                    canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
            this.imageCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getLayoutParams().width == -2) {
            int childCount = getChildCount() * this.imageSize;
            int i = this.maxImageOffset;
            int childCount2 = getChildCount() - 1;
            if (childCount2 < 0) {
                childCount2 = 0;
            }
            size = (i * childCount2) + childCount;
        } else {
            size = View.MeasureSpec.getSize(widthMeasureSpec);
        }
        setMeasuredDimension(size, this.imageSize);
    }

    public final void setImagesCount(int imagesCount) {
        if (getChildCount() <= imagesCount) {
            int childCount = imagesCount - getChildCount();
            for (int i = 0; i < childCount; i++) {
                ChildImageView childImageView = new ChildImageView(getContext());
                int i2 = this.imageSize;
                addView(childImageView, new FrameLayout.LayoutParams(i2, i2));
            }
        } else if (imagesCount > 0) {
            removeViews(imagesCount - 1, getChildCount() - imagesCount);
        } else {
            removeAllViews();
        }
        h8 h8Var = new h8(3, this);
        while (h8Var.hasNext()) {
            View view = (View) h8Var.next();
            ChildImageView childImageView2 = view instanceof ChildImageView ? (ChildImageView) view : null;
            if (childImageView2 != null) {
                childImageView2.setImageDrawable(null);
            }
        }
    }

    public final void setMask(int maskRes) {
        Bitmap bitmap;
        Resources resources = getResources();
        ThreadLocal threadLocal = wuj0.a;
        Drawable drawable = resources.getDrawable(maskRes, null);
        if (drawable != null) {
            int i = this.imageSize;
            bitmap = ffx.d0(drawable, i, i, 4);
        } else {
            bitmap = null;
        }
        this.imageMask = bitmap;
        int i2 = (this.imageOutlineWidth * 2) + this.imageSize;
        Drawable drawable2 = getResources().getDrawable(maskRes, null);
        this.outlineMask = drawable2 != null ? ffx.d0(drawable2, i2, i2, 4) : null;
    }

    public final void setProperties(int imageSize, int maxImageOffset, int imageOutlineWidth) {
        this.imageSize = imageSize;
        this.maxImageOffset = maxImageOffset;
        this.imageOutlineWidth = imageOutlineWidth;
        Bitmap createBitmap = Bitmap.createBitmap(imageSize, imageSize, Bitmap.Config.ARGB_8888);
        this.imageCanvas = new Canvas(createBitmap);
        this.imageBitmap = createBitmap;
    }

    public OverlappingImagesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OverlappingImagesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public OverlappingImagesView(Context context) {
        this(context, null, 0, 6, null);
    }
}
