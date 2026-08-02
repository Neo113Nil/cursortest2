package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class gny0 implements zls {
    public final /* synthetic */ wls A;
    public final /* synthetic */ wls B;
    public final /* synthetic */ dmh C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ gy31 x;
    public final /* synthetic */ zx40 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ gny0(j690 j690Var, String str, boolean z, boolean z2, gy31 gy31Var, zx40 zx40Var, boolean z3, wls wlsVar, wls wlsVar2, dmh dmhVar) {
        this.D = j690Var;
        this.b = str;
        this.c = z;
        this.w = z2;
        this.x = gy31Var;
        this.y = zx40Var;
        this.z = z3;
        this.A = wlsVar;
        this.B = wlsVar2;
        this.C = dmhVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.D;
        switch (i) {
            case 0:
                j690 j690Var = (j690) obj4;
                wls wlsVar = (wls) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= fidVar.e(wlsVar) ? 4 : 2;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 19) != 18)) {
                    btsVar.Y();
                    break;
                } else {
                    omy0.a.d(this.b, wlsVar, this.c, this.w, this.x, this.y, this.z, this.A, this.B, null, null, null, this.C, j690Var, btsVar, (intValue << 3) & 112, 2048);
                    break;
                }
            default:
                ehr0 ehr0Var = (ehr0) obj4;
                wls wlsVar2 = (wls) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= fidVar2.e(wlsVar2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    omy0.a.d(this.b, wlsVar2, this.c, this.w, this.x, this.y, this.z, this.A, this.B, null, null, ehr0Var, this.C, null, btsVar2, (intValue2 << 3) & 112, 8192);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ gny0(String str, boolean z, boolean z2, gy31 gy31Var, zx40 zx40Var, boolean z3, wls wlsVar, wls wlsVar2, ehr0 ehr0Var, dmh dmhVar) {
        this.b = str;
        this.c = z;
        this.w = z2;
        this.x = gy31Var;
        this.y = zx40Var;
        this.z = z3;
        this.A = wlsVar;
        this.B = wlsVar2;
        this.D = ehr0Var;
        this.C = dmhVar;
    }
}
