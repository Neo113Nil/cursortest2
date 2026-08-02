package xsna;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes12.dex */
public final class kag0 implements ady {
    public static final l900<Class<?>, byte[]> j = new l900<>(50);
    public final cl3 b;
    public final ady c;
    public final ady d;
    public final int e;
    public final int f;
    public final Class<?> g;
    public final au80 h;
    public final clp0<?> i;

    public kag0(cl3 cl3Var, ady adyVar, ady adyVar2, int i, int i2, clp0<?> clp0Var, Class<?> cls, au80 au80Var) {
        this.b = cl3Var;
        this.c = adyVar;
        this.d = adyVar2;
        this.e = i;
        this.f = i2;
        this.i = clp0Var;
        this.g = cls;
        this.h = au80Var;
    }

    @Override // xsna.ady
    public final void b(@NonNull MessageDigest messageDigest) {
        cl3 cl3Var = this.b;
        byte[] bArr = (byte[]) cl3Var.d();
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        clp0<?> clp0Var = this.i;
        if (clp0Var != null) {
            clp0Var.b(messageDigest);
        }
        this.h.b(messageDigest);
        l900<Class<?>, byte[]> l900Var = j;
        Class<?> cls = this.g;
        byte[] a = l900Var.a(cls);
        if (a == null) {
            a = cls.getName().getBytes(ady.a);
            l900Var.d(cls, a);
        }
        messageDigest.update(a);
        cl3Var.put(bArr);
    }

    @Override // xsna.ady
    public final boolean equals(Object obj) {
        if (obj instanceof kag0) {
            kag0 kag0Var = (kag0) obj;
            if (this.f == kag0Var.f && this.e == kag0Var.e && s2r0.b(this.i, kag0Var.i) && this.g.equals(kag0Var.g) && this.c.equals(kag0Var.c) && this.d.equals(kag0Var.d) && this.h.equals(kag0Var.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ady
    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        clp0<?> clp0Var = this.i;
        if (clp0Var != null) {
            hashCode = (hashCode * 31) + clp0Var.hashCode();
        }
        return this.h.b.hashCode() + ((this.g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
