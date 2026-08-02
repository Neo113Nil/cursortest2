package defpackage;

import com.yandex.xplat.payment.sdk.BillingServiceError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.SbpPollingStrategy;
import com.yandex.xplat.payment.sdk.ShowSbpTokensFlag;

/* loaded from: classes2.dex */
public final class bt5 {
    public final rbh a;
    public final ShowSbpTokensFlag b;
    public final lfr0 c;
    public final nhj d;
    public final qs20 e;
    public final ps90 f;
    public final rwo g;
    public final y22 h;
    public final knz0 i;
    public final pgb j;
    public final zu5 k;
    public fvv l;
    public String m;
    public w18 n;
    public boolean o;
    public boolean p;
    public wj00 q;

    public bt5(rbh rbhVar, ShowSbpTokensFlag showSbpTokensFlag, lfr0 lfr0Var, nhj nhjVar, qs20 qs20Var, ps90 ps90Var, rwo rwoVar, y22 y22Var, knz0 knz0Var, pgb pgbVar, zu5 zu5Var) {
        this.a = rbhVar;
        this.b = showSbpTokensFlag;
        this.c = lfr0Var;
        this.d = nhjVar;
        this.e = qs20Var;
        this.f = ps90Var;
        this.g = rwoVar;
        this.h = y22Var;
        this.i = knz0Var;
        this.j = pgbVar;
        this.k = zu5Var;
    }

    public final md51 a(String str) {
        fvv fvvVar = this.l;
        md51 l = ymx.l(fvvVar == null ? zmx.c(new BillingServiceError(ExternalErrorKind.internal_error, ExternalErrorTrigger.internal_sdk, null, null, "Unable to perform payment: payment is not initialized.")) : zmx.d(fvvVar), new ar5(1), null, 5);
        rbh rbhVar = this.a;
        if (str == null) {
            str = rbhVar.c;
        }
        return ymx.l(zmx.a(scc.i(l, thb1.f(str) ? (this.o || thb1.f(rbhVar.b)) ? zmx.c(new BillingServiceError(ExternalErrorKind.no_email, ExternalErrorTrigger.internal_sdk, null, null, "Unable to perform payment: email was not provided.")) : zmx.d("") : zmx.d(str))), new ps5(this, 0), null, 5);
    }

    public final md51 b(rka0 rka0Var, String str, String str2, nw70 nw70Var, oy80 oy80Var, String str3) {
        if (this.p) {
            return this.e.b(new vu20(rka0Var.a, str, str3)).g(new qs5(this, rka0Var, nw70Var, oy80Var, 0));
        }
        yhw0 yhw0Var = new yhw0(this.a.b, rka0Var.a, rka0Var.b, str, 0, str2);
        nhj nhjVar = this.d;
        return hg91.a("supply_google_pay", nhjVar.b, new bmh(18, nhjVar, yhw0Var)).g(new qs5(this, rka0Var, nw70Var, oy80Var, 1));
    }

    public final md51 c(final String str, final qgb qgbVar, dt20 dt20Var) {
        Long l = this.j.a;
        w18 w18Var = new w18();
        this.n = w18Var;
        final int i = 1;
        final int i2 = 0;
        Object obj = null;
        return this.p ? mz91.c(new sls(this) { // from class: ws5
            public final /* synthetic */ bt5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                String str2 = str;
                bt5 bt5Var = this.b;
                switch (i3) {
                    case 0:
                        return bt5Var.e.a(new tv5(str2, 1));
                    default:
                        nhj nhjVar = bt5Var.d;
                        return hg91.a("check_payment", nhjVar.b, new khj(nhjVar, new wgb(str2), 0));
                }
            }
        }, new ys5(dt20Var, i2), new kdd0(obj, new wdz(), l, w18Var)).g(new ar5(dt20Var)).h(new ps5(this, 2)).f(new ps5(this, 3)).d(new sls(this) { // from class: xs5
            public final /* synthetic */ bt5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                bt5 bt5Var = this.b;
                switch (i3) {
                    case 0:
                        bt5Var.n = null;
                        break;
                    default:
                        bt5Var.n = null;
                        break;
                }
                return zy11Var;
            }
        }) : mz91.c(new sls(this) { // from class: ws5
            public final /* synthetic */ bt5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                String str2 = str;
                bt5 bt5Var = this.b;
                switch (i3) {
                    case 0:
                        return bt5Var.e.a(new tv5(str2, 1));
                    default:
                        nhj nhjVar = bt5Var.d;
                        return hg91.a("check_payment", nhjVar.b, new khj(nhjVar, new wgb(str2), 0));
                }
            }
        }, new tls() { // from class: zs5
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3 = i2;
                qgb qgbVar2 = qgbVar;
                chb chbVar = (chb) obj2;
                switch (i3) {
                    case 0:
                        return qgbVar2.z(chbVar);
                    default:
                        return qgbVar2.q(chbVar);
                }
            }
        }, new kdd0(obj, new wdz(), l, w18Var)).g(new tls() { // from class: zs5
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3 = i;
                qgb qgbVar2 = qgbVar;
                chb chbVar = (chb) obj2;
                switch (i3) {
                    case 0:
                        return qgbVar2.z(chbVar);
                    default:
                        return qgbVar2.q(chbVar);
                }
            }
        }).h(new ps5(this, 4)).f(new ps5(this, i)).d(new sls(this) { // from class: xs5
            public final /* synthetic */ bt5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                bt5 bt5Var = this.b;
                switch (i3) {
                    case 0:
                        bt5Var.n = null;
                        break;
                    default:
                        bt5Var.n = null;
                        break;
                }
                return zy11Var;
            }
        });
    }

    public final md51 d(String str, r89 r89Var, us20 us20Var) {
        ss5 ss5Var = new ss5(this, r89Var, 0);
        ss5 ss5Var2 = new ss5(this, r89Var, 1);
        j24 j24Var = new j24(28, r89Var);
        rwo rwoVar = this.g;
        return c(str, new lsi0(ss5Var, ss5Var2, j24Var, rwoVar), new dt20(new ts5(us20Var, 0), new ts5(us20Var, 1), rwoVar));
    }

    public final md51 e(String str, SbpPollingStrategy sbpPollingStrategy, efm0 efm0Var, us20 us20Var) {
        return c(str, new tis0(17, sbpPollingStrategy, new q0v(21, efm0Var, this)), new dt20(new ts5(us20Var, 2), new ts5(us20Var, 3), this.g));
    }
}
