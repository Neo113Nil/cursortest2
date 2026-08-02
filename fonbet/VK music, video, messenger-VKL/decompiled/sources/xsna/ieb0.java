package xsna;

import xsna.ewo0;

/* compiled from: PlaylistTimeline.java */
/* loaded from: classes12.dex */
public final class ieb0 extends das {
    public final ewo0.c c;

    public ieb0(ewo0 ewo0Var) {
        super(ewo0Var);
        this.c = new ewo0.c();
    }

    @Override // xsna.das, xsna.ewo0
    public final ewo0.b f(int i, ewo0.b bVar, boolean z) {
        ewo0 ewo0Var = this.b;
        ewo0.b f = ewo0Var.f(i, bVar, z);
        if (ewo0Var.m(f.c, this.c, 0L).a()) {
            f.h(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, xg0.c, true);
            return f;
        }
        f.f = true;
        return f;
    }
}
