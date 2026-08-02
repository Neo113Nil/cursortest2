package defpackage;

import android.content.Context;
import com.yandex.go.payments.analytics.PaymentsAnalytics$Button;
import com.yandex.go.payments.analytics.PaymentsAnalytics$PaymentMethodsType;
import com.yandex.go.payments.domain.y;
import defpackage.agd;
import defpackage.evu0;
import defpackage.l0;
import defpackage.mca0;
import defpackage.oca0;
import defpackage.qu;
import defpackage.rca0;
import defpackage.rol0;
import defpackage.sca0;
import defpackage.tca0;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.yfd;
import defpackage.zy11;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class oca0 extends pgd {
    public final Context F;
    public final w030 G;
    public final x770 H;
    public final y I;
    public final mu5 J;

    public oca0(Context context, w030 w030Var, x770 x770Var, y yVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = x770Var;
        this.I = yVar;
        this.J = new mu5(new tls() { // from class: com.yandex.go.payments.nameedit.navigation.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final yfd yfdVar = (yfd) obj;
                final oca0 oca0Var = oca0.this;
                ((agd) yfdVar).c = new rol0(new PaymentMethodsNameEditRouter$content$1$1(oca0Var, yfdVar, null));
                agd agdVar = (agd) yfdVar;
                agdVar.e = new tls() { // from class: com.yandex.go.payments.nameedit.navigation.b
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tca0 tca0Var = (tca0) obj2;
                        boolean z = tca0Var instanceof sca0;
                        oca0 oca0Var2 = oca0.this;
                        yfd yfdVar2 = yfdVar;
                        if (z) {
                            tje.N(oca0Var2.o(), null, null, new PaymentMethodsNameEditRouter$content$1$2$1(oca0Var2, tca0Var, yfdVar2, null), 3);
                        } else {
                            if (!(tca0Var instanceof rca0)) {
                                w511.b();
                                return null;
                            }
                            PaymentsAnalytics$PaymentMethodsType U = oca0.U(((mca0) ((agd) yfdVar2).a).b.a);
                            if (U != null) {
                                oca0Var2.H.a(U, !evu0.J(((rca0) tca0Var).a), PaymentsAnalytics$Button.Cancel);
                            }
                            oca0Var2.r(new qu(9));
                        }
                        return zy11.a;
                    }
                };
                agdVar.g = new androidx.compose.runtime.internal.a(-642979390, new l0(24, oca0Var, yfdVar), true);
                return zy11.a;
            }
        });
    }

    public static PaymentsAnalytics$PaymentMethodsType U(PaymentMethod$Type paymentMethod$Type) {
        switch (nca0.a[paymentMethod$Type.ordinal()]) {
            case 1:
                return PaymentsAnalytics$PaymentMethodsType.Card;
            case 2:
                return PaymentsAnalytics$PaymentMethodsType.SbpToken;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return null;
            default:
                w511.b();
                return null;
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
