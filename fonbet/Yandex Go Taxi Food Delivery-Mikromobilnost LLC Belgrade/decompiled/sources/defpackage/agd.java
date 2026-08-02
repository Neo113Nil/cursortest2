package defpackage;

/* loaded from: classes12.dex */
public final class agd implements yfd {
    public final Object a;
    public final chd b;
    public tpr c;
    public final Object d;
    public tls e;
    public oe4 f = xpb1.x;
    public bms g;

    public agd(Object obj, chd chdVar) {
        this.a = obj;
        this.b = chdVar;
        this.d = chdVar.a;
    }

    public final zfd a() {
        tpr tprVar = this.c;
        if (tprVar == null) {
            ny61.r("It is required to set uiStateFlow");
            return null;
        }
        tls tlsVar = this.e;
        if (tlsVar == null) {
            ny61.r("It is required to set action handler");
            return null;
        }
        oe4 oe4Var = this.f;
        bms bmsVar = this.g;
        if (bmsVar != null) {
            return new zfd(tprVar, oe4Var, tlsVar, this, bmsVar);
        }
        ny61.r("It is required to set content");
        return null;
    }
}
