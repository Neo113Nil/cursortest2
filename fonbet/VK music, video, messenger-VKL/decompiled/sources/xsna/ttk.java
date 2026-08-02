package xsna;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes12.dex */
public final class ttk implements ady {
    public final ady b;
    public final ady c;

    public ttk(ady adyVar, ady adyVar2) {
        this.b = adyVar;
        this.c = adyVar2;
    }

    @Override // xsna.ady
    public final void b(@NonNull MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // xsna.ady
    public final boolean equals(Object obj) {
        if (obj instanceof ttk) {
            ttk ttkVar = (ttk) obj;
            if (this.b.equals(ttkVar.b) && this.c.equals(ttkVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ady
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
