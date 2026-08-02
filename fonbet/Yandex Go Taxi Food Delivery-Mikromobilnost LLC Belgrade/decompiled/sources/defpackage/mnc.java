package defpackage;

import com.yandex.go.requirements.experiment.ComposeCompoundOptionSelectExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes13.dex */
public final class mnc extends h55 {
    public final yvf0 D;
    public final yvf0 E;
    public final yvf0 F;
    public final wiq0 G;
    public final rz0 H;

    public mnc(ncb ncbVar, qrb qrbVar, g6 g6Var, wiq0 wiq0Var, rz0 rz0Var) {
        super(null);
        this.D = ncbVar;
        this.E = qrbVar;
        this.F = g6Var;
        this.G = wiq0Var;
        this.H = rz0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        mi31 mi31Var;
        wud wudVar = (wud) obj;
        int i = lnc.a[wudVar.b.t.b.ordinal()];
        final int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                A(((ComposeCompoundOptionSelectExperiment) this.H.b.b()).b ? (h55) this.E.get() : (h55) this.D.get(), wudVar, new sy60(this) { // from class: knc
                    public final /* synthetic */ mnc b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sy60
                    public final void a() {
                        int i3 = i2;
                        mnc mncVar = this.b;
                        switch (i3) {
                            case 0:
                                mncVar.r(new qu(9));
                                break;
                            default:
                                mncVar.r(new qu(9));
                                break;
                        }
                    }
                });
                return;
            } else {
                w511.b();
                return;
            }
        }
        fnx0 n = ((k) this.G).n();
        if (n == null || (mi31Var = n.a) == null) {
            xby.l(jst.e, "Summary:Requirement:OptionSelection:Modal:Show", null, null, "Selected tariff is null", 6);
            r(new qu(9));
        } else {
            final int i3 = 0;
            A((m950) this.F.get(), new iob(mi31Var, wudVar.b, wudVar.d), new sy60(this) { // from class: knc
                public final /* synthetic */ mnc b;

                {
                    this.b = this;
                }

                @Override // defpackage.sy60
                public final void a() {
                    int i32 = i3;
                    mnc mncVar = this.b;
                    switch (i32) {
                        case 0:
                            mncVar.r(new qu(9));
                            break;
                        default:
                            mncVar.r(new qu(9));
                            break;
                    }
                }
            });
        }
    }
}
