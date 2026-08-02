package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class e8r0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8r0 b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ int x;

    public /* synthetic */ e8r0(u8r0 u8r0Var, f530 f530Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = u8r0Var;
        this.c = f530Var;
        this.w = tlsVar;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        tls tlsVar = this.w;
        f530 f530Var = this.c;
        u8r0 u8r0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oab1.h(u8r0Var, f530Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                oab1.d(u8r0Var, f530Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                oab1.c(u8r0Var, f530Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
