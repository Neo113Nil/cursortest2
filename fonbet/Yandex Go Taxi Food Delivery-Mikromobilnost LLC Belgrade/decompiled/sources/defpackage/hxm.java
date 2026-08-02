package defpackage;

/* loaded from: classes4.dex */
public final /* synthetic */ class hxm implements wls {
    public final /* synthetic */ cms A;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ cms y;
    public final /* synthetic */ Object z;

    public /* synthetic */ hxm(pwm pwmVar, int i, int i2, int i3, tls tlsVar, tls tlsVar2, tls tlsVar3, int i4) {
        this.x = pwmVar;
        this.b = i;
        this.c = i2;
        this.w = i3;
        this.y = tlsVar;
        this.z = tlsVar2;
        this.A = tlsVar3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cms cmsVar = this.A;
        Object obj3 = this.z;
        cms cmsVar2 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                oy91.f((pwm) obj4, this.b, this.c, this.w, (tls) cmsVar2, (tls) obj3, (tls) cmsVar, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(this.w | 1);
                bk91.b((f530) obj4, (sls) cmsVar2, (qrm) obj3, (sls) cmsVar, this.b, this.c, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ hxm(f530 f530Var, sls slsVar, qrm qrmVar, sls slsVar2, int i, int i2, int i3) {
        this.x = f530Var;
        this.y = slsVar;
        this.z = qrmVar;
        this.A = slsVar2;
        this.b = i;
        this.c = i2;
        this.w = i3;
    }
}
