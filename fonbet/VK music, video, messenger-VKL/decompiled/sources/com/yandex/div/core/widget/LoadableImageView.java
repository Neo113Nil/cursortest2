package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.R$id;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.drawable.ScaleDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import java.util.concurrent.Future;
import xsna.epx;
import xsna.gzs;
import xsna.ozl;
import xsna.s3q0;

/* compiled from: LoadableImageView.kt */
/* loaded from: classes7.dex */
public class LoadableImageView extends AspectImageView implements LoadableImage, Releasable {
    private ImageTransformer _imageTransformer;
    private Bitmap currentBitmapWithoutFilters;
    private Drawable externalImage;
    private gzs<s3q0> imageChangeCallback;
    private LoadReference loadReference;
    private Drawable sourceDrawable;

    public LoadableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._imageTransformer = ImageTransformer.NOP.INSTANCE;
    }

    private final Drawable scaleAccordingToDensity(Drawable drawable) {
        if (shouldScaleAccordingToDensity()) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    bitmap.setDensity(160);
                }
                bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
                return drawable;
            }
            if (drawable instanceof AnimatedImageDrawable) {
                return new ScaleDrawable(drawable, getContext().getResources().getDisplayMetrics().density);
            }
        }
        return drawable;
    }

    private final boolean shouldScaleAccordingToDensity() {
        return (wrapsSize(getLayoutParams().width) && wrapsSize(getLayoutParams().height)) || getImageScale() == AspectImageView.Scale.NO_SCALE;
    }

    private final boolean wrapsSize(int i) {
        return i == -3 || i == -2;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        getDelegate();
        super.buildDrawingCache(z);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void cleanLoadingTask() {
        setTag(R$id.bitmap_load_references_tag, null);
    }

    public final Bitmap getCurrentBitmapWithoutFilters$div_release() {
        return this.currentBitmapWithoutFilters;
    }

    public DivViewDelegate getDelegate() {
        return null;
    }

    public final Drawable getExternalImage() {
        return this.externalImage;
    }

    public final ImageTransformer getImageTransformer() {
        return this._imageTransformer;
    }

    public final LoadReference getLoadReference$div_release() {
        return this.loadReference;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public Future<?> getLoadingTask() {
        Object tag = getTag(R$id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    public void imageLoaded() {
        setTag(R$id.image_loaded_flag, Boolean.TRUE);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        getDelegate();
        super.invalidateDrawable(drawable);
    }

    public boolean isImageLoaded() {
        return epx.f(getTag(R$id.image_loaded_flag), Boolean.TRUE);
    }

    public boolean isImagePreview() {
        return epx.f(getTag(R$id.image_loaded_flag), Boolean.FALSE);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getDelegate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDelegate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        getDelegate();
    }

    public void previewLoaded() {
        setTag(R$id.image_loaded_flag, Boolean.FALSE);
    }

    public void release() {
        this.currentBitmapWithoutFilters = null;
        setExternalImage(null);
        this.sourceDrawable = null;
        resetImageLoaded();
        Future<?> loadingTask = getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        cleanLoadingTask();
    }

    public void resetImageLoaded() {
        setTag(R$id.image_loaded_flag, null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void saveLoadingTask(Future<?> future) {
        setTag(R$id.bitmap_load_references_tag, future);
    }

    public final void setCurrentBitmapWithoutFilters$div_release(Bitmap bitmap) {
        this.currentBitmapWithoutFilters = bitmap;
    }

    public final void setExternalImage(Drawable drawable) {
        this.externalImage = drawable != null ? scaleAccordingToDensity(drawable) : null;
        invalidate();
    }

    public void setImage(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (shouldScaleAccordingToDensity() && bitmap != null) {
            bitmap.setDensity(160);
        }
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
    }

    public final void setImageChangeCallback(gzs<s3q0> gzsVar) {
        this.imageChangeCallback = gzsVar;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.sourceDrawable = drawable;
        if (this.externalImage == null) {
            Drawable transform = this._imageTransformer.transform(drawable);
            super.setImageDrawable(transform != null ? scaleAccordingToDensity(transform) : null);
            gzs<s3q0> gzsVar = this.imageChangeCallback;
            if (gzsVar != null) {
                gzsVar.invoke();
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.externalImage;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        gzs<s3q0> gzsVar2 = this.imageChangeCallback;
        if (gzsVar2 != null) {
            gzsVar2.invoke();
        }
    }

    public final void setImageTransformer(ImageTransformer imageTransformer) {
        if (imageTransformer == null) {
            imageTransformer = ImageTransformer.NOP.INSTANCE;
        }
        this._imageTransformer = imageTransformer;
        Drawable drawable = this.sourceDrawable;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    public final void setLoadReference$div_release(LoadReference loadReference) {
        this.loadReference = loadReference;
    }

    public void setPlaceholder(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        getDelegate();
        super.unscheduleDrawable(drawable);
    }

    public void setImage(Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.externalImage == null) {
            ((Animatable) drawable2).start();
        }
    }

    public void setPreview(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @ozl
    public static /* synthetic */ void getCurrentBitmapWithoutFilters$div_release$annotations() {
    }

    @ozl
    public static /* synthetic */ void getExternalImage$annotations() {
    }

    /* compiled from: LoadableImageView.kt */
    public interface ImageTransformer {
        Drawable transform(Drawable drawable);

        /* compiled from: LoadableImageView.kt */
        public static final class NOP implements ImageTransformer {
            public static final NOP INSTANCE = new NOP();

            private NOP() {
            }

            @Override // com.yandex.div.core.widget.LoadableImageView.ImageTransformer
            public Drawable transform(Drawable drawable) {
                return drawable;
            }
        }
    }

    public void setDelegate(DivViewDelegate divViewDelegate) {
    }
}
