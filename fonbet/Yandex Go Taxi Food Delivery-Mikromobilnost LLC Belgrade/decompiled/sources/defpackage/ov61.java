package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class ov61 implements nv61 {
    public final u87 a;

    public ov61(u87 u87Var) {
        this.a = u87Var;
    }

    @Override // defpackage.nv61
    public final ncc b() {
        y87 y87Var = u87.e;
        m3 m3Var = this.a.a.z;
        y87Var.getClass();
        return y87.d(m3Var);
    }

    @Override // defpackage.nv61
    public final ncc c() {
        y87 y87Var = u87.e;
        m3 m3Var = this.a.a.A;
        y87Var.getClass();
        return y87.c(m3Var);
    }

    @Override // defpackage.nv61
    public final ncc d() {
        u2 u2Var = jw61.a;
        y87 y87Var = u87.e;
        m3 m3Var = this.a.a.A;
        y87Var.getClass();
        return y87.e(u2Var, m3Var);
    }

    @Override // defpackage.nv61
    public final bcs0 e() {
        return this.a.b();
    }

    @Override // defpackage.nv61
    public final byte[] f() {
        return this.a.b.getEncoded();
    }

    @Override // defpackage.nv61
    public final InputStream g() {
        z87 z87Var = this.a.c;
        if (z87Var != null) {
            return new ByteArrayInputStream((byte[]) z87Var.getContent());
        }
        return null;
    }
}
