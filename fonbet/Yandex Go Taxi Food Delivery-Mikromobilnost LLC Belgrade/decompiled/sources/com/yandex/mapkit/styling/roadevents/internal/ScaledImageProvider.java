package com.yandex.mapkit.styling.roadevents.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.runtime.image.ImageProvider;
import defpackage.vng;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yandex/mapkit/styling/roadevents/internal/ScaledImageProvider;", "Lcom/yandex/runtime/image/ImageProvider;", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "resId", "", "scale", "", "<init>", "(Ljava/lang/ref/WeakReference;IF)V", "bitmap", "Landroid/graphics/Bitmap;", "getId", "", "getImage", "com.yandex.mapkit.styling.roadevents_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ScaledImageProvider extends ImageProvider {
    private Bitmap bitmap;
    private final WeakReference<Context> contextWeakReference;
    private final int resId;
    private final float scale;

    public ScaledImageProvider(WeakReference<Context> weakReference, int i, float f) {
        super(true);
        this.contextWeakReference = weakReference;
        this.resId = i;
        this.scale = f;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public String getId() {
        return "road_events_resId_" + this.resId + "_scale_" + this.scale;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    /* renamed from: getImage */
    public Bitmap get$image() {
        Context context = this.contextWeakReference.get();
        if (context == null) {
            return null;
        }
        if (this.bitmap == null) {
            Drawable t = vng.t(this.resId, context);
            if (t == null) {
                return null;
            }
            this.bitmap = DrawableUtils.INSTANCE.drawableToBitmap(t, this.scale);
        }
        return this.bitmap;
    }
}
