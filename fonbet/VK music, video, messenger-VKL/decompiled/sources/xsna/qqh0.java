package xsna;

import xsna.u4a;

/* compiled from: SearchEntryPointParamsModifier.kt */
/* loaded from: classes16.dex */
public final class qqh0 implements orp {
    public final dha a;
    public final boolean b;

    public qqh0(dha dhaVar, int i) {
        dhaVar = (i & 1) != 0 ? null : dhaVar;
        boolean z = (i & 2) == 0;
        this.a = dhaVar;
        this.b = z;
    }

    @Override // xsna.orp
    public final u4a a(u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        dha dhaVar = this.a;
        if (dhaVar == null) {
            dhaVar = aVar.I;
        }
        return u4a.a(u4aVar, u4a.a.a(aVar, null, null, null, null, null, this.b ? new tyh0(aVar.s) : aVar.s, null, null, null, dhaVar, new onh0(), -524289, 1048551));
    }
}
