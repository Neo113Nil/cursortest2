package defpackage;

import com.yandex.payment.divkit.sbp.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class buf implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ int c;

    public /* synthetic */ buf(a aVar, int i, int i2) {
        this.a = i2;
        this.b = aVar;
        this.c = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.b0(new fuf(i2, 4));
                aVar.c0();
                break;
            default:
                aVar.A.getClass();
                aVar.b0(new fuf(i2, Integer.valueOf(ryh0.paymentsdk_divkit_sbp_waiting_info), true));
                break;
        }
        return zy11Var;
    }
}
