package defpackage;

/* loaded from: classes4.dex */
public final class jrm implements zls {
    public final /* synthetic */ f530 a;
    public final /* synthetic */ kk2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int w;
    public final /* synthetic */ ety0 x;

    public jrm(dry0 dry0Var, y7m y7mVar, f530 f530Var, kk2 kk2Var, long j, int i, ety0 ety0Var, lry0 lry0Var) {
        this.a = f530Var;
        this.b = kk2Var;
        this.c = j;
        this.w = i;
        this.x = ety0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dj6 dj6Var = (dj6) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(dj6Var) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-1400415932);
        btsVar2.t(false);
        btsVar2.e0(-460372402);
        btsVar2.e0(1849434622);
        Object Q = btsVar2.Q();
        if (Q == did.a) {
            Q = new c0m(28);
            btsVar2.o0(Q);
        }
        btsVar2.t(false);
        vqy0.d(this.b, fnq0.b(this.a, false, (tls) Q), this.c, 0L, 0L, null, 0L, 2, false, this.w, 0, null, null, this.x, btsVar2, 0, 384, 241656);
        btsVar2.t(false);
        return zy11.a;
    }
}
