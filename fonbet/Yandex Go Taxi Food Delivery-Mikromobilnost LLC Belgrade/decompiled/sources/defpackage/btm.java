package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class btm implements wls {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float w;
    public final /* synthetic */ Object x;

    public /* synthetic */ btm(float f, long j, v4v v4vVar, int i) {
        this.w = f;
        this.c = j;
        this.x = v4vVar;
        this.b = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                f530 f530Var = (f530) obj3;
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                ow91.a(this.w, O, this.b, this.c, (fid) obj, f530Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                float f = this.w;
                int i2 = this.b;
                long j = this.c;
                cpb1.c(f, i2, O2, j, (fid) obj, (f530) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                int O3 = vng.O(this.b | 1);
                eqb1.c(this.w, this.c, (v4v) obj3, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ btm(int i, long j, float f, f530 f530Var, int i2) {
        this.b = i;
        this.c = j;
        this.w = f;
        this.x = f530Var;
    }

    public /* synthetic */ btm(f530 f530Var, long j, float f, int i, int i2) {
        this.x = f530Var;
        this.c = j;
        this.w = f;
        this.b = i2;
    }
}
