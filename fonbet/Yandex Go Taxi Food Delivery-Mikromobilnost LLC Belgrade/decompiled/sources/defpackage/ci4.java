package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class ci4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ci4(zp1 zp1Var, Object obj, int i) {
        this.a = i;
        this.b = zp1Var;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        zp1 zp1Var = this.b;
        switch (i) {
            case 0:
                if (zp1Var.a == 0) {
                    zp1Var.l(obj);
                    break;
                }
                break;
            default:
                int i2 = zp1Var.a - 1;
                zp1Var.a = i2;
                if (i2 == 0) {
                    zp1Var.l(obj);
                    break;
                }
                break;
        }
    }
}
