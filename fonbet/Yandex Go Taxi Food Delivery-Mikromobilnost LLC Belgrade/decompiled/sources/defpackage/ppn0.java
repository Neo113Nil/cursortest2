package defpackage;

import com.yandex.go.scooters.ignition.controlling.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class ppn0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rqn0 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ yx40 w;
    public final /* synthetic */ oip0 x;
    public final /* synthetic */ int y;

    public /* synthetic */ ppn0(rqn0 rqn0Var, tls tlsVar, yx40 yx40Var, oip0 oip0Var, int i, int i2) {
        this.a = i2;
        this.b = rqn0Var;
        this.c = tlsVar;
        this.w = yx40Var;
        this.x = oip0Var;
        this.y = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                d.c(this.b, this.c, this.w, this.x, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                d.a(this.b, this.c, this.w, this.x, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
