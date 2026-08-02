package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k6o implements yf90, zf90 {
    public final yf90 a;
    public final ArrayList b = new ArrayList();
    public final o5o c = new o5o(1, this);

    public k6o(yf90 yf90Var) {
        this.a = yf90Var;
    }

    @Override // defpackage.yf90
    public final eg90 a() {
        return this.c;
    }

    @Override // defpackage.yf90
    public final ofy0 b() {
        return this.a.b();
    }

    @Override // defpackage.zf90
    public final yf90 c() {
        return this.a;
    }

    @Override // defpackage.yf90
    public final boolean i() {
        return this.a.i();
    }
}
