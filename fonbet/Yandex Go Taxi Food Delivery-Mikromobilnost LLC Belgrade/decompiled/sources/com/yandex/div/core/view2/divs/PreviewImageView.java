package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.div2.DivVideoScale;
import defpackage.vxe0;
import defpackage.w511;
import defpackage.wxe0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/divs/PreviewImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/drawable/Drawable;", "tryScaleAccordingToDensity", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "drawable", "Lzy11;", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Lcom/yandex/div2/DivVideoScale;", "scale", "setScale", "(Lcom/yandex/div2/DivVideoScale;)V", "Companion", "vxe0", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PreviewImageView extends AppCompatImageView {
    public static final vxe0 Companion = new vxe0();
    private static final ImageView.ScaleType NO_SCALE = ImageView.ScaleType.CENTER;
    private static final ImageView.ScaleType FIT = ImageView.ScaleType.FIT_CENTER;
    private static final ImageView.ScaleType FILL = ImageView.ScaleType.CENTER_CROP;

    public PreviewImageView(Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        setVisibility(4);
    }

    private final Drawable tryScaleAccordingToDensity(Drawable drawable) {
        if (getScaleType() == NO_SCALE && (drawable instanceof BitmapDrawable)) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                bitmap.setDensity(160);
            }
            bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
        }
        return drawable;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        if (getScaleType() == NO_SCALE && bm != null) {
            bm.setDensity(160);
        }
        super.setImageBitmap(bm);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable != null ? tryScaleAccordingToDensity(drawable) : null);
    }

    public final void setScale(DivVideoScale scale) {
        ImageView.ScaleType scaleType;
        int i = wxe0.a[scale.ordinal()];
        if (i == 1) {
            scaleType = FILL;
        } else if (i == 2) {
            scaleType = NO_SCALE;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            scaleType = FIT;
        }
        setScaleType(scaleType);
    }
}
