package defpackage;

import com.ybsdk.feature.qr.payments.api.model.QrPaymentAgreementParams;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class i9g0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ i9g0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        QrPaymentAgreementParams qrPaymentAgreementParams;
        r0 r0Var;
        Object obj2;
        r0 r0Var2;
        Object value;
        g9g0 g9g0Var;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                QrPaymentAgreementParams qrPaymentAgreementParams2 = (QrPaymentAgreementParams) obj;
                d9g0 b = qca1.b((h9g0) bVar.X());
                if (b != null) {
                    yj1 yj1Var = b.f;
                    if (!jl40.l(qrPaymentAgreementParams2.getAgreementId(), yj1Var != null ? yj1Var.a : null) || !jl40.l(qrPaymentAgreementParams2.getAutopaymentId(), yj1Var.c)) {
                        pz40 Y = bVar.Y();
                        while (true) {
                            r0 r0Var3 = (r0) Y;
                            Object value2 = r0Var3.getValue();
                            g9g0 g9g0Var2 = ((h9g0) value2).a;
                            if (g9g0Var2 instanceof f9g0) {
                                yj1 yj1Var2 = new yj1(qrPaymentAgreementParams2.getAgreementId(), qrPaymentAgreementParams2.getProductCode(), qrPaymentAgreementParams2.getAutopaymentId(), qrPaymentAgreementParams2.getMemberId());
                                qrPaymentAgreementParams = qrPaymentAgreementParams2;
                                obj2 = value2;
                                r0Var = r0Var3;
                                g9g0Var2 = d9g0.c(b, yj1Var2, null, null, null, null, null, null, false, null, 65503);
                            } else {
                                qrPaymentAgreementParams = qrPaymentAgreementParams2;
                                r0Var = r0Var3;
                                obj2 = value2;
                            }
                            if (r0Var.k(obj2, new h9g0(g9g0Var2))) {
                                bVar.J.a(null, false);
                                break;
                            } else {
                                qrPaymentAgreementParams2 = qrPaymentAgreementParams;
                            }
                        }
                    }
                }
                break;
            default:
                ka6 ka6Var = (ka6) obj;
                d9g0 b2 = qca1.b((h9g0) bVar.X());
                if (b2 != null) {
                    pz40 Y2 = bVar.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value = r0Var2.getValue();
                        g9g0Var = ((h9g0) value).a;
                        if (g9g0Var instanceof f9g0) {
                            g9g0Var = d9g0.c(b2, null, null, null, null, null, null, null, false, ka6Var, 32767);
                        }
                    } while (!r0Var2.k(value, new h9g0(g9g0Var)));
                }
                break;
        }
        return zy11Var;
    }
}
