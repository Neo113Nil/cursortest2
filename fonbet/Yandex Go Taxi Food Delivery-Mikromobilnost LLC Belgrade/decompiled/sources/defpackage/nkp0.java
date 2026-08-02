package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class nkp0 implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ nkp0(float f, float f2, int i, Object obj, tls tlsVar) {
        this.b = f;
        this.c = f2;
        this.w = i;
        this.x = obj;
        this.y = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.y;
        c530 c530Var = c530.a;
        float f = this.b;
        switch (i) {
            case 0:
                qkp0 qkp0Var = (qkp0) obj4;
                dj6 dj6Var = (dj6) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(dj6Var) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    float d = dj6Var.d() - (2.0f * f);
                    int i2 = this.w;
                    float f2 = this.c;
                    float f3 = (d - ((i2 - 1) * f2)) / i2;
                    f530 m = an91.m(pw91.l(c530Var, pw91.o(btsVar), 14), f, 0.0f, 2);
                    boolean e = btsVar.e(qkp0Var);
                    Object Q = btsVar.Q();
                    if (e || Q == did.a) {
                        Q = new uyo0(10, qkp0Var);
                        btsVar.o0(Q);
                    }
                    veb1.a(m, 0, 0, f3, f3, f2, this.x, (tls) Q, btsVar, 0, 6);
                    break;
                }
            default:
                tls tlsVar = (tls) obj4;
                dj6 dj6Var2 = (dj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(dj6Var2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    float d2 = dj6Var2.d() - (2.0f * f);
                    int i3 = this.w;
                    float f4 = this.c;
                    float f5 = (d2 - ((i3 - 1) * f4)) / i3;
                    veb1.a(an91.m(ljs0.c(c530Var, 1.0f), f, 0.0f, 2), i3, 0, f5, f5, f4, this.x, tlsVar, btsVar2, 0, 4);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ nkp0(float f, float f2, int i, Object obj, qkp0 qkp0Var) {
        this.b = f;
        this.c = f2;
        this.w = i;
        this.x = obj;
        this.y = qkp0Var;
    }
}
