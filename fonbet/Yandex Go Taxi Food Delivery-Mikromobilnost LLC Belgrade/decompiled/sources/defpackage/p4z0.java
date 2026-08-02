package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class p4z0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ mcu b;
    public final /* synthetic */ int c;

    public /* synthetic */ p4z0(mcu mcuVar, int i, int i2) {
        this.a = i2;
        this.b = mcuVar;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        mcu mcuVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                r4z0.m(mcuVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                r4z0.l(mcuVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
