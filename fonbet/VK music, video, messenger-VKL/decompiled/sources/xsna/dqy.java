package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes12.dex */
public final class dqy implements hag0<BitmapDrawable>, hzw {
    public final Resources b;
    public final hag0<Bitmap> c;

    public dqy(@NonNull Resources resources, @NonNull hag0<Bitmap> hag0Var) {
        nr2.r(resources, "Argument must not be null");
        this.b = resources;
        nr2.r(hag0Var, "Argument must not be null");
        this.c = hag0Var;
    }

    @Override // xsna.hag0
    public final void a() {
        this.c.a();
    }

    @Override // xsna.hag0
    @NonNull
    public final Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // xsna.hag0
    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.b, this.c.get());
    }

    @Override // xsna.hag0
    public final int getSize() {
        return this.c.getSize();
    }

    @Override // xsna.hzw
    public final void initialize() {
        hag0<Bitmap> hag0Var = this.c;
        if (hag0Var instanceof hzw) {
            ((hzw) hag0Var).initialize();
        }
    }
}
