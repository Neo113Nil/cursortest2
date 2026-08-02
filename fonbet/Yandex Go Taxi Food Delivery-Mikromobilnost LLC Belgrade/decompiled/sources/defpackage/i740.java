package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class i740 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ i740(float f, f530 f530Var, int i) {
        this.a = 1;
        this.b = f;
        this.w = f530Var;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        float f = this.b;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                sl91.b((Long) obj3, f, (fid) obj, vng.O(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                mdb1.d(f, O, (fid) obj, (f530) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                r4z0.b((a4b1) obj3, f, (fid) obj, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ i740(Object obj, float f, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = f;
        this.c = i;
    }
}
