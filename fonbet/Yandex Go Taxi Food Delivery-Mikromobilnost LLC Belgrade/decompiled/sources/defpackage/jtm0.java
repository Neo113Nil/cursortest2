package defpackage;

import com.yandex.go.scooters.passes.active.v3.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class jtm0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fum0 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ jtm0(fum0 fum0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = fum0Var;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        fum0 fum0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                c.c(fum0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                c.c(fum0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 2:
                c.b(fum0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                c.e(fum0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
