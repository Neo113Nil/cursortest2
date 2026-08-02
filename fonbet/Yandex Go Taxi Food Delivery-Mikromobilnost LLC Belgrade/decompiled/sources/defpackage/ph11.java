package defpackage;

import com.yandex.go.trusted_contacts.ui.BaseTrustedContactsModalView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes14.dex */
public final class ph11 extends m230 {
    public final ufb0 E;
    public final w030 F;
    public final tfb0 G;
    public final c1x0 H;
    public final tui I;
    public final egz J;
    public BaseTrustedContactsModalView K;

    public ph11(ufb0 ufb0Var, w030 w030Var, tfb0 tfb0Var, c1x0 c1x0Var, tui tuiVar) {
        super(null);
        this.E = ufb0Var;
        this.F = w030Var;
        this.G = tfb0Var;
        this.H = c1x0Var;
        this.I = tuiVar;
        this.J = cgq0.a;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        zy11 zy11Var = (zy11) obj;
        if (this.G.o == SlideableModalView.CardMode.FULLSCREEN) {
            u45 e = this.F.e();
            BaseTrustedContactsModalView baseTrustedContactsModalView = e instanceof BaseTrustedContactsModalView ? (BaseTrustedContactsModalView) e : null;
            this.K = baseTrustedContactsModalView;
            if (baseTrustedContactsModalView != null) {
                BaseTrustedContactsModalView.animateDismissRightToLeft$default(baseTrustedContactsModalView, null, null, 3, null);
            }
        }
        super.G(zy11Var);
    }

    @Override // defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        zy11 zy11Var = (zy11) obj;
        BaseTrustedContactsModalView baseTrustedContactsModalView = this.K;
        if (baseTrustedContactsModalView != null) {
            BaseTrustedContactsModalView.animateShowLeftToRight$default(baseTrustedContactsModalView, null, null, 3, null);
        }
        this.K = null;
        super.H(zy11Var);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        return this.E.a(this.G, this.H, this.I, this.J, null);
    }
}
