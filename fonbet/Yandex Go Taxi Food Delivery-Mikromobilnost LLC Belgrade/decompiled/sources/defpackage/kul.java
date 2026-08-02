package defpackage;

/* loaded from: classes4.dex */
public final class kul extends pdh {
    public final /* synthetic */ int a;

    @Override // defpackage.pdh
    public final boolean a(u0x u0xVar, u0x u0xVar2) {
        switch (this.a) {
            case 0:
                aul aulVar = (aul) u0xVar2;
                if (u0xVar instanceof aul) {
                    aul aulVar2 = (aul) u0xVar;
                    xvl xvlVar = aulVar2.a;
                    ztl ztlVar = aulVar2.m;
                    ztl ztlVar2 = aulVar.m;
                    xvl xvlVar2 = aulVar.a;
                    if (jl40.l(ztlVar.b, ztlVar2.b) && (((ztlVar.c && ztlVar2.c) || jl40.l(xvlVar, xvlVar2)) && jl40.l(null, null))) {
                        return true;
                    }
                }
                return false;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.pdh
    public boolean b(u0x u0xVar, u0x u0xVar2) {
        switch (this.a) {
            case 0:
                aul aulVar = (aul) u0xVar2;
                if (u0xVar != aulVar) {
                    if (u0xVar instanceof aul) {
                        aul aulVar2 = (aul) u0xVar;
                        if (jl40.l(aulVar2.l, aulVar.l)) {
                            ztl ztlVar = aulVar2.m;
                            ztl ztlVar2 = aulVar.m;
                            if (!ztlVar.a || !ztlVar2.a || !jl40.l(aulVar2.a.a, aulVar.a.a)) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            default:
                return super.b(u0xVar, u0xVar2);
        }
    }

    @Override // defpackage.pdh
    public final Object c(u0x u0xVar, u0x u0xVar2) {
        switch (this.a) {
            case 0:
                aul aulVar = (aul) u0xVar2;
                if (u0xVar instanceof aul) {
                    ztl ztlVar = ((aul) u0xVar).m;
                    ztl ztlVar2 = aulVar.m;
                    if (!ztlVar.d || !ztlVar2.d) {
                        break;
                    }
                }
                break;
            case 1:
                break;
            default:
                break;
        }
        return Boolean.TRUE;
    }
}
