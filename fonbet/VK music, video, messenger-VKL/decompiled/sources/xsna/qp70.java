package xsna;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* loaded from: classes12.dex */
public final class qp70 implements ady {
    public final Object b;

    public qp70(@NonNull Object obj) {
        nr2.r(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // xsna.ady
    public final void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(ady.a));
    }

    @Override // xsna.ady
    public final boolean equals(Object obj) {
        if (obj instanceof qp70) {
            return this.b.equals(((qp70) obj).b);
        }
        return false;
    }

    @Override // xsna.ady
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("ObjectKey{object="), this.b, '}');
    }
}
