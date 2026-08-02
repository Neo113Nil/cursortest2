package defpackage;

import com.yandex.go.scooters.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class agn0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pxm0 b;

    public /* synthetic */ agn0(pxm0 pxm0Var, int i) {
        this.a = i;
        this.b = pxm0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        pxm0 pxm0Var = this.b;
        switch (i) {
            case 0:
                ((pgn0) obj).a.r(new agn0(pxm0Var, 1));
                break;
            case 1:
                ((m6o0) obj).a.r(new agn0(pxm0Var, i2));
                break;
            default:
                d dVar = ((nuo0) obj).a;
                luo0 luo0Var = new luo0(dVar, i2);
                dVar.getClass();
                dVar.V(new zko0(pxm0Var, false, null, null), luo0Var);
                break;
        }
        return zy11Var;
    }
}
