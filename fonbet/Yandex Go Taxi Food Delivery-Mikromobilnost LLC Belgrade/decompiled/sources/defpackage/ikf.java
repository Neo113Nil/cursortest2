package defpackage;

/* loaded from: classes11.dex */
public final class ikf implements xfc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ikf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xfc
    public final long a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((jkf) obj).a;
            case 1:
                oqh oqhVar = (oqh) obj;
                long a = oqhVar.y.a();
                return a != 16 ? a : ((ldc) npb1.c(oqhVar, cfe.a)).a;
            case 2:
                arh arhVar = (arh) obj;
                long a2 = arhVar.z.a();
                if (a2 != 16) {
                    return a2;
                }
                trk0 trk0Var = (trk0) npb1.c(arhVar, esk0.a);
                if (trk0Var != null) {
                    long j = trk0Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((ldc) npb1.c(arhVar, bfe.a)).a;
            case 3:
                arh arhVar2 = (arh) obj;
                long a3 = arhVar2.z.a();
                if (a3 != 16) {
                    return a3;
                }
                urk0 urk0Var = (urk0) npb1.c(arhVar2, fsk0.a);
                if (urk0Var != null) {
                    long j2 = urk0Var.a;
                    if (j2 != 16) {
                        return j2;
                    }
                }
                return ((ldc) npb1.c(arhVar2, k2z.a)).a;
            case 4:
                arh arhVar3 = (arh) obj;
                long a4 = arhVar3.z.a();
                if (a4 != 16) {
                    return a4;
                }
                vrk0 vrk0Var = (vrk0) npb1.c(arhVar3, gsk0.a);
                if (vrk0Var != null) {
                    long j3 = vrk0Var.a;
                    if (j3 != 16) {
                        return j3;
                    }
                }
                long j4 = ((ldc) npb1.c(arhVar3, cfe.a)).a;
                return (((lic) npb1.c(arhVar3, mic.a)).e() || ((double) rzo.M(j4)) >= 0.5d) ? j4 : ldc.f;
            case 5:
                return ((hsk0) obj).c;
            case 6:
                return ((isk0) obj).d;
            default:
                return ((jsk0) obj).c;
        }
    }
}
