package xsna;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* loaded from: classes12.dex */
public final class slp implements ady {
    public final Object b;
    public final int c;
    public final int d;
    public final Class<?> e;
    public final Class<?> f;
    public final ady g;
    public final Map<Class<?>, clp0<?>> h;
    public final au80 i;
    public int j;

    public slp(Object obj, ady adyVar, int i, int i2, Map<Class<?>, clp0<?>> map, Class<?> cls, Class<?> cls2, au80 au80Var) {
        nr2.r(obj, "Argument must not be null");
        this.b = obj;
        nr2.r(adyVar, "Signature must not be null");
        this.g = adyVar;
        this.c = i;
        this.d = i2;
        nr2.r(map, "Argument must not be null");
        this.h = map;
        nr2.r(cls, "Resource class must not be null");
        this.e = cls;
        nr2.r(cls2, "Transcode class must not be null");
        this.f = cls2;
        nr2.r(au80Var, "Argument must not be null");
        this.i = au80Var;
    }

    @Override // xsna.ady
    public final void b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.ady
    public final boolean equals(Object obj) {
        if (obj instanceof slp) {
            slp slpVar = (slp) obj;
            if (this.b.equals(slpVar.b) && this.g.equals(slpVar.g) && this.d == slpVar.d && this.c == slpVar.c && this.h.equals(slpVar.h) && this.e.equals(slpVar.e) && this.f.equals(slpVar.f) && this.i.equals(slpVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ady
    public final int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = this.h.hashCode() + (hashCode2 * 31);
            this.j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.j = hashCode4;
            int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
            this.j = hashCode5;
            this.j = this.i.b.hashCode() + (hashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
