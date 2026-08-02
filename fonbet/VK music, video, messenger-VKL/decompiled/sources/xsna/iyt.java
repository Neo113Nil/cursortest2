package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes12.dex */
public final class iyt implements clp0<gyt> {
    public final clp0<Bitmap> b;

    public iyt(clp0<Bitmap> clp0Var) {
        nr2.r(clp0Var, "Argument must not be null");
        this.b = clp0Var;
    }

    @Override // xsna.clp0
    @NonNull
    public final hag0<gyt> a(@NonNull Context context, @NonNull hag0<gyt> hag0Var, int i, int i2) {
        gyt gytVar = hag0Var.get();
        hag0<Bitmap> wc7Var = new wc7(gytVar.b.a.l, com.bumptech.glide.a.a(context).b);
        clp0<Bitmap> clp0Var = this.b;
        hag0<Bitmap> a = clp0Var.a(context, wc7Var, i, i2);
        if (!wc7Var.equals(a)) {
            wc7Var.a();
        }
        gytVar.b.a.c(clp0Var, a.get());
        return hag0Var;
    }

    @Override // xsna.ady
    public final void b(@NonNull MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // xsna.ady
    public final boolean equals(Object obj) {
        if (obj instanceof iyt) {
            return this.b.equals(((iyt) obj).b);
        }
        return false;
    }

    @Override // xsna.ady
    public final int hashCode() {
        return this.b.hashCode();
    }
}
