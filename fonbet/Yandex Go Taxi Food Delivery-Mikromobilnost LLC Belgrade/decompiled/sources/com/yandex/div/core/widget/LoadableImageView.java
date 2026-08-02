package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.yandex.div.core.view2.drawable.ScaleDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import defpackage.dtz;
import defpackage.epl;
import defpackage.hxy;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ngh0;
import defpackage.oxy;
import defpackage.sls;
import defpackage.ssi0;
import defpackage.sxy;
import defpackage.w511;
import defpackage.x4c;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001KB%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u0016\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u001a\u0010\u0015J\u001b\u0010\u001d\u001a\u00020\r2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u0019\u0010\"\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\"\u0010\u0015J\u0019\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b$\u0010\u0019J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0015J\u0019\u0010(\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b(\u0010\u0015J\u001f\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\tH\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0014¢\u0006\u0004\b.\u0010\u000fJ\u000f\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b/\u0010\u000fJ\u0017\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\r2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000104¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b8\u0010\u000fJ\u0013\u00109\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000200H\u0002¢\u0006\u0004\b;\u0010<J\u0013\u0010>\u001a\u00020=*\u00020\u0012H\u0002¢\u0006\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR4\u0010V\u001a\u0004\u0018\u00010\u00122\b\u0010U\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bV\u0010J\u0012\u0004\bZ\u0010\u000f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010\u0015R(\u0010_\u001a\u0004\u0018\u00010K2\b\u0010U\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010`\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010<R\u0014\u0010a\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010<¨\u0006b"}, d2 = {"Lcom/yandex/div/core/widget/LoadableImageView;", "Lcom/yandex/div/internal/widget/AspectImageView;", "Loxy;", "", "Lssi0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "imageLoaded", "()V", "previewLoaded", "resetImageLoaded", "Landroid/graphics/drawable/Drawable;", "drawable", "setPlaceholder", "(Landroid/graphics/drawable/Drawable;)V", "setPreview", "Landroid/graphics/Bitmap;", "bitmap", "(Landroid/graphics/Bitmap;)V", "setImage", "Ljava/util/concurrent/Future;", "task", "saveLoadingTask", "(Ljava/util/concurrent/Future;)V", "getLoadingTask", "()Ljava/util/concurrent/Future;", "cleanLoadingTask", "setImageDrawable", "bm", "setImageBitmap", "dr", "invalidateDrawable", "who", "unscheduleDrawable", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "autoScale", "buildDrawingCache", "(Z)V", "Lkotlin/Function0;", "callback", "setImageChangeCallback", "(Lsls;)V", "release", "scaleAccordingToDensity", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "shouldScaleAccordingToDensity", "()Z", "Lcom/yandex/div/core/view2/drawable/ScaleDrawable;", "toScaleDrawable", "(Landroid/graphics/drawable/Drawable;)Lcom/yandex/div/core/view2/drawable/ScaleDrawable;", "Lhxy;", "loadReference", "Lhxy;", "getLoadReference$div_release", "()Lhxy;", "setLoadReference$div_release", "(Lhxy;)V", "imageChangeCallback", "Lsls;", "sourceDrawable", "Landroid/graphics/drawable/Drawable;", "Lsxy;", "_imageTransformer", "Lsxy;", "Lepl;", "delegate", "Lepl;", "getDelegate", "()Lepl;", "setDelegate", "(Lepl;)V", "value", "externalImage", "getExternalImage", "()Landroid/graphics/drawable/Drawable;", "setExternalImage", "getExternalImage$annotations", "getImageTransformer", "()Lsxy;", "setImageTransformer", "(Lsxy;)V", "imageTransformer", "isImageLoaded", "isImagePreview", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class LoadableImageView extends AspectImageView implements oxy, ssi0 {
    private sxy _imageTransformer;
    private epl delegate;
    private Drawable externalImage;
    private sls imageChangeCallback;
    private hxy loadReference;
    private Drawable sourceDrawable;

    public /* synthetic */ LoadableImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @jxi
    public static /* synthetic */ void getExternalImage$annotations() {
    }

    private final Drawable scaleAccordingToDensity(Drawable drawable) {
        if (shouldScaleAccordingToDensity()) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    bitmap.setDensity(160);
                }
                bitmapDrawable.setTargetDensity(160);
                bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
                return drawable;
            }
            if ((drawable instanceof PictureDrawable) || (drawable instanceof AnimatedImageDrawable)) {
                return toScaleDrawable(drawable);
            }
        }
        return drawable;
    }

    public static /* synthetic */ void setImageChangeCallback$default(LoadableImageView loadableImageView, sls slsVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: setImageChangeCallback");
            return;
        }
        if ((i & 1) != 0) {
            slsVar = null;
        }
        loadableImageView.setImageChangeCallback(slsVar);
    }

    private final boolean shouldScaleAccordingToDensity() {
        if (getCurrentBitmapWithoutFilters() != null) {
            return false;
        }
        if (getImageScale() == AspectImageView.Scale.NO_SCALE) {
            return true;
        }
        return com.yandex.div.core.view2.divs.a.P(this);
    }

    private final ScaleDrawable toScaleDrawable(Drawable drawable) {
        return new ScaleDrawable(drawable, getContext().getResources().getDisplayMetrics().density);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean autoScale) {
        epl delegate = getDelegate();
        if (delegate != null) {
            dtz dtzVar = (dtz) delegate;
            LoadableImageView loadableImageView = dtzVar.a;
            int i = dtzVar.j + 1;
            dtzVar.j = i;
            if (i == 1 && loadableImageView.getWidth() > 0 && loadableImageView.getHeight() > 0 && loadableImageView.getLayerType() == 1 && loadableImageView.getDrawingCache(autoScale) == null) {
                dtzVar.e = RenderMode.HARDWARE;
                dtzVar.a();
            }
            dtzVar.j--;
        }
        super.buildDrawingCache(autoScale);
    }

    @Override // defpackage.oxy
    public void cleanLoadingTask() {
        setTag(ngh0.bitmap_load_references_tag, null);
    }

    public epl getDelegate() {
        return this.delegate;
    }

    public final Drawable getExternalImage() {
        return this.externalImage;
    }

    /* renamed from: getImageTransformer, reason: from getter */
    public final sxy get_imageTransformer() {
        return this._imageTransformer;
    }

    /* renamed from: getLoadReference$div_release, reason: from getter */
    public final hxy getLoadReference() {
        return this.loadReference;
    }

    @Override // defpackage.oxy
    public Future<?> getLoadingTask() {
        Object tag = getTag(ngh0.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    public void imageLoaded() {
        setTag(ngh0.image_loaded_flag, Boolean.TRUE);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable dr) {
        epl delegate = getDelegate();
        if (delegate != null) {
            dtz dtzVar = (dtz) delegate;
            Drawable drawable = dtzVar.a.getDrawable();
            Drawable drawable2 = dtzVar.b;
            if (drawable != drawable2) {
                drawable2 = dr;
            }
            if (drawable2 != null) {
                dr = drawable2;
            }
        }
        super.invalidateDrawable(dr);
    }

    @Override // defpackage.oxy
    public boolean isImageLoaded() {
        return jl40.l(getTag(ngh0.image_loaded_flag), Boolean.TRUE);
    }

    @Override // defpackage.oxy
    public boolean isImagePreview() {
        return jl40.l(getTag(ngh0.image_loaded_flag), Boolean.FALSE);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        epl delegate = getDelegate();
        if (delegate != null) {
            dtz dtzVar = (dtz) delegate;
            dtzVar.b.addAnimatorListener(dtzVar.m);
            if (dtzVar.a.isInEditMode() || !dtzVar.i) {
                return;
            }
            dtzVar.d();
            dtzVar.i = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        epl delegate = getDelegate();
        if (delegate != null) {
            dtz dtzVar = (dtz) delegate;
            LottieDrawable lottieDrawable = dtzVar.b;
            lottieDrawable.removeAnimatorListener(dtzVar.m);
            if (lottieDrawable.isAnimating()) {
                dtzVar.i = false;
                dtzVar.h = false;
                dtzVar.g = false;
                lottieDrawable.cancelAnimation();
                dtzVar.a();
                dtzVar.i = true;
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        epl delegate = getDelegate();
        if (delegate != null) {
            ((dtz) delegate).b();
        }
    }

    public void previewLoaded() {
        setTag(ngh0.image_loaded_flag, Boolean.FALSE);
    }

    public void release() {
        setCurrentBitmapWithoutFilters$div_release(null);
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
        setTag(ngh0.image_loaded_flag, null);
    }

    @Override // defpackage.oxy
    public void saveLoadingTask(Future<?> task) {
        setTag(ngh0.bitmap_load_references_tag, task);
    }

    public void setDelegate(epl eplVar) {
        this.delegate = eplVar;
    }

    public final void setExternalImage(Drawable drawable) {
        this.externalImage = drawable != null ? scaleAccordingToDensity(drawable) : null;
        invalidate();
    }

    @Override // defpackage.oxy
    public void setImage(Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.externalImage == null) {
            ((Animatable) drawable2).start();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        BitmapDrawable bitmapDrawable = bm != null ? new BitmapDrawable(getContext().getResources(), bm) : null;
        if (shouldScaleAccordingToDensity() && bitmapDrawable != null) {
            bitmapDrawable.setTargetDensity(160);
        }
        setImageDrawable(bitmapDrawable);
    }

    public final void setImageChangeCallback(sls callback) {
        this.imageChangeCallback = callback;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.sourceDrawable = drawable;
        if (this.externalImage == null) {
            Drawable a = this._imageTransformer.a(drawable);
            super.setImageDrawable(a != null ? scaleAccordingToDensity(a) : null);
            sls slsVar = this.imageChangeCallback;
            if (slsVar != null) {
                slsVar.invoke();
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.externalImage;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        sls slsVar2 = this.imageChangeCallback;
        if (slsVar2 != null) {
            slsVar2.invoke();
        }
    }

    public final void setImageTransformer(sxy sxyVar) {
        if (sxyVar == null) {
            sxyVar = x4c.P;
        }
        this._imageTransformer = sxyVar;
        Drawable drawable = this.sourceDrawable;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    public final void setLoadReference$div_release(hxy hxyVar) {
        this.loadReference = hxyVar;
    }

    public void setPlaceholder(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable who) {
        LottieDrawable lottieDrawable;
        epl delegate = getDelegate();
        if (delegate != null) {
            dtz dtzVar = (dtz) delegate;
            if (!dtzVar.f && who == (lottieDrawable = dtzVar.b) && lottieDrawable.isAnimating()) {
                dtzVar.c();
            } else if (!dtzVar.f && (who instanceof LottieDrawable)) {
                LottieDrawable lottieDrawable2 = (LottieDrawable) who;
                if (lottieDrawable2.isAnimating()) {
                    lottieDrawable2.pauseAnimation();
                }
            }
        }
        super.unscheduleDrawable(who);
    }

    public void setPreview(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public LoadableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._imageTransformer = x4c.P;
    }

    public void setImage(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }
}
