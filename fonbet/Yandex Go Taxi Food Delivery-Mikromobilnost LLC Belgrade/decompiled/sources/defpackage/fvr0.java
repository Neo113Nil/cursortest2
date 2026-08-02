package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class fvr0 implements wls {
    public final /* synthetic */ rbn A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ ehr0 y;
    public final /* synthetic */ int z;

    public /* synthetic */ fvr0(f530 f530Var, float f, long j, long j2, ehr0 ehr0Var, int i, rbn rbnVar, int i2, int i3, int i4) {
        this.a = i4;
        this.b = f530Var;
        this.c = f;
        this.w = j;
        this.x = j2;
        this.y = ehr0Var;
        this.z = i;
        this.A = rbnVar;
        this.B = i2;
        this.C = i3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                ocb1.b(this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, O, this.C);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                ocb1.c(this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, O2, this.C);
                break;
        }
        return zy11Var;
    }
}
