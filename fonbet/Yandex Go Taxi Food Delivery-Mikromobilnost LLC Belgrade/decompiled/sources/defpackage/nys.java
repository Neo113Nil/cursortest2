package defpackage;

import kotlinx.datetime.format.f;

/* loaded from: classes9.dex */
public final class nys extends k7 {
    public final ntf0 a;
    public final String b;
    public final Object c;

    public nys(ntf0 ntf0Var, qxg qxgVar, int i) {
        String str = ntf0Var.b;
        qxgVar = (i & 4) != 0 ? null : qxgVar;
        this.a = ntf0Var;
        this.b = str;
        this.c = qxgVar;
    }

    @Override // defpackage.k7
    public final ntf0 a() {
        return this.a;
    }

    @Override // defpackage.k7
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.k7
    public final String c() {
        return this.b;
    }

    @Override // defpackage.k7
    public final f d() {
        return null;
    }
}
