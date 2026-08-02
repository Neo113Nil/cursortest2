package defpackage;

import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class lp60 implements khx {
    public final Object b;

    public lp60(Object obj) {
        z2a1.e(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(khx.a));
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        if (obj instanceof lp60) {
            return this.b.equals(((lp60) obj).b);
        }
        return false;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("ObjectKey{object="), this.b, '}');
    }
}
