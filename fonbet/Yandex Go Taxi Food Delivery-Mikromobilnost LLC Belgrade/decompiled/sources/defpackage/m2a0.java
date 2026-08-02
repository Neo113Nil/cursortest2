package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivity;

/* loaded from: classes12.dex */
public final /* synthetic */ class m2a0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2a0 b;

    public /* synthetic */ m2a0(r2a0 r2a0Var, int i) {
        this.a = i;
        this.b = r2a0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        r2a0 r2a0Var = this.b;
        switch (i) {
            case 0:
                return r2a0Var.h;
            case 1:
                PaymentKitActivity paymentKitActivity = r2a0Var.a;
                return new x2a0(paymentKitActivity.getApplicationContext(), eja1.s(paymentKitActivity), s8b1.c(paymentKitActivity.getIntent()));
            case 2:
                return r2a0Var.b().c;
            case 3:
                f5g f5gVar = r2a0Var.b().c;
                boolean z = false;
                return new t3a0((z22) f5gVar.Z.get(), f5gVar.y, (w870) f5gVar.V.get(), new abe(f5gVar.a, z, z), new ji41(13, (hk3) f5gVar.a0.get()), (fp51) f5gVar.f0.get());
            default:
                return s8b1.c(r2a0Var.a.getIntent());
        }
    }
}
