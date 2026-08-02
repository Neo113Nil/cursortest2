package defpackage;

import android.graphics.Matrix;

/* loaded from: classes10.dex */
public final class bp7 implements dav {
    public final ap7 a;

    public bp7(ap7 ap7Var) {
        this.a = ap7Var;
    }

    @Override // defpackage.dav
    public final void a(ilo iloVar) {
        this.a.a(iloVar);
    }

    @Override // defpackage.dav
    public final q6x0 b() {
        return this.a.b();
    }

    @Override // defpackage.dav
    public final Matrix c() {
        return new Matrix();
    }

    @Override // defpackage.dav
    public final int d() {
        int ordinal = this.a.d().ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.dav
    public final int e() {
        return 0;
    }

    @Override // defpackage.dav
    public final long getTimestamp() {
        return this.a.getTimestamp();
    }
}
