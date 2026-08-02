package defpackage;

import com.yx360.design.compose.atoms.DsButtonClose$Type;

/* loaded from: classes11.dex */
public final class dpm implements wls {
    public final /* synthetic */ DsButtonClose$Type A;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ f530 w;
    public final /* synthetic */ sls x;
    public final /* synthetic */ zx40 y;
    public final /* synthetic */ qxi z;

    public dpm(long j, long j2, long j3, f530 f530Var, sls slsVar, zx40 zx40Var, qxi qxiVar, DsButtonClose$Type dsButtonClose$Type) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.w = f530Var;
        this.x = slsVar;
        this.y = zx40Var;
        this.z = qxiVar;
        this.A = dsButtonClose$Type;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        int i = h4v.a;
        qxi qxiVar = this.z;
        boolean z = ((r17) qxiVar.getValue()).a;
        long j = this.a;
        long j2 = z ? j : this.b;
        boolean z2 = ((r17) qxiVar.getValue()).a;
        long j3 = this.c;
        long j4 = z2 ? j : j3;
        bts btsVar2 = (bts) fidVar;
        g4v a = h4v.a((agc) btsVar2.m(dgc.a), ((ldc) btsVar2.m(bfe.a)).a).a(j2, j4, ldc.m, ldc.b(j4, uzt0.a, 0.0f, 0.0f, 0.0f, 14));
        float f = ((r17) qxiVar.getValue()).b;
        f530 b = gza1.b(this.w, f, f);
        qnm.c.getClass();
        vi91.a(this.x, ljs0.v(ljs0.m(b, 40.0f), null, 3), false, a, this.y, null, wwg.S(-832884420, true, new cpm(this.A, j3, 0), fidVar), fidVar, 1597440, 36);
        return zy11.a;
    }
}
