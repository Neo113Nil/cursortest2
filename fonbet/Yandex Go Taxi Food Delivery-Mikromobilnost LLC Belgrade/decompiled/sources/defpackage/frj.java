package defpackage;

import com.yandex.go.promocodes.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class frj implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ynv0 b;

    public /* synthetic */ frj(ynv0 ynv0Var, int i) {
        this.a = i;
        this.b = ynv0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        ynv0 ynv0Var = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                qrj qrjVar = (qrj) obj;
                switch (qrjVar.a) {
                    case 0:
                        ((rrj) qrjVar.b).r(new frj(ynv0Var, 1));
                        break;
                    default:
                        ((d) qrjVar.b).r(new frj(ynv0Var, 3));
                        break;
                }
            case 1:
                ((trf0) obj).a.r(new frj(ynv0Var, 4));
                break;
            case 2:
                ((sqe0) obj).a.b0(ghv0.a, null, this.b, null, true);
                break;
            case 3:
                ((prf0) obj).e0(ynv0Var);
                break;
            default:
                ((prf0) obj).e0(ynv0Var);
                break;
        }
        return zy11Var;
    }
}
