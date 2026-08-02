package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes12.dex */
public final class jko implements clp0<Drawable> {
    public final clp0<Bitmap> b;

    public jko(clp0 clp0Var) {
        this.b = clp0Var;
    }

    @Override // xsna.clp0
    @NonNull
    public final hag0<Drawable> a(@NonNull Context context, @NonNull hag0<Drawable> hag0Var, int i, int i2) {
        tc7 tc7Var = com.bumptech.glide.a.a(context).b;
        Drawable drawable = hag0Var.get();
        wc7 a = iko.a(tc7Var, drawable, i, i2);
        if (a == null) {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        hag0<Bitmap> a2 = this.b.a(context, a, i, i2);
        if (!a2.equals(a)) {
            return new dqy(context.getResources(), a2);
        }
        a2.a();
        return hag0Var;
    }

    @Override // xsna.ady
    public final void b(@NonNull MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // xsna.ady
    public final boolean equals(Object obj) {
        if (obj instanceof jko) {
            return this.b.equals(((jko) obj).b);
        }
        return false;
    }

    @Override // xsna.ady
    public final int hashCode() {
        return this.b.hashCode();
    }
}
