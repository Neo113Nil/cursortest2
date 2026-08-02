package defpackage;

import defpackage.cc4;

/* loaded from: classes10.dex */
public final class c760 extends cc4.a {
    public sls a;

    public c760(sls slsVar) {
        this.a = slsVar;
    }

    @Override // cc4.a
    public final void a() {
        this.a = null;
    }

    @Override // cc4.a
    public final void b(Throwable th) {
        throw th;
    }

    public final void c() {
        sls slsVar = this.a;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }
}
