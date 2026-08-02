package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.mapkit.styling.automotivenavigation.DrawableUtils;
import com.yandex.runtime.image.ImageProvider;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class elm0 extends ImageProvider {
    public final WeakReference a;
    public final int b;
    public final float c;
    public Bitmap d;

    public elm0(WeakReference weakReference, int i, float f) {
        super(true);
        this.a = weakReference;
        this.b = i;
        this.c = f;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final String getId() {
        return "road_events_resId_" + this.b + "_scale_" + this.c;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    /* renamed from: getImage */
    public final Bitmap get$image() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return null;
        }
        if (this.d == null) {
            Drawable t = vng.t(this.b, context);
            if (t == null) {
                return null;
            }
            this.d = DrawableUtils.INSTANCE.drawableToBitmap(t, this.c);
        }
        return this.d;
    }
}
