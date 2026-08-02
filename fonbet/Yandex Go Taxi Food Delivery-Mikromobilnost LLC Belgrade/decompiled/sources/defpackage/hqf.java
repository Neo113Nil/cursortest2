package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class hqf extends b3 implements q3 {
    public static final p1 b = new p1(15, hqf.class);
    public final byte[] a;

    public hqf(String str) {
        this.a = quu0.b(str);
    }

    @Override // defpackage.q3
    public final String f() {
        return quu0.a(this.a);
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return rza1.e(this.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var instanceof hqf) {
            return Arrays.equals(this.a, ((hqf) b3Var).a);
        }
        return false;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.I(19, this.a, z);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(this.a.length, z);
    }

    public final String toString() {
        return quu0.a(this.a);
    }

    public hqf(byte[] bArr) {
        this.a = bArr;
    }
}
