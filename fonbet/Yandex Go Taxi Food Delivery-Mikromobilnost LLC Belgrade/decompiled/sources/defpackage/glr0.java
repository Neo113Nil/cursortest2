package defpackage;

import android.content.Context;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.domain.entities.ShareSettingsMode;
import com.yandex.go.trusted_contacts.share_settings.ShareSettingsModalView;
import com.yandex.go.trusted_contacts.share_settings.a;
import com.yandex.go.trusted_contacts.ui.TrustedContactsModalView;

/* loaded from: classes14.dex */
public final class glr0 extends m230 {
    public final /* synthetic */ int E = 1;
    public final ug11 F;
    public final idj G;
    public final w030 H;
    public final boolean I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;

    public glr0(th11 th11Var, gh11 gh11Var, hlr0 hlr0Var, ug11 ug11Var, idj idjVar, qh11 qh11Var, zuj0 zuj0Var, w030 w030Var) {
        super(null);
        this.J = gh11Var;
        this.K = hlr0Var;
        this.F = ug11Var;
        this.G = idjVar;
        this.L = qh11Var;
        this.M = zuj0Var;
        this.H = w030Var;
        ih11 ih11Var = new ih11(this);
        cjw0 cjw0Var = th11Var.a;
        this.N = new sh11(ih11Var, (zg11) ((xvf0) cjw0Var.a).get(), (a201) ((mg11) cjw0Var.b).get(), (zuj0) ((tbg) cjw0Var.c).get());
        this.I = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return this.H;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return this.I;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.E;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                rlr0 rlr0Var = (rlr0) this.K;
                TrustedContactDto trustedContactDto = (TrustedContactDto) this.L;
                ShareSettingsMode shareSettingsMode = (ShareSettingsMode) this.M;
                pgk0 pgk0Var = new pgk0(27, this);
                fcj0 fcj0Var = rlr0Var.a;
                return new ShareSettingsModalView((Context) ((clr0) obj2).a.a.get(), new a((Context) ((tbg) fcj0Var.a).get(), (vkr0) ((xvf0) fcj0Var.b).get(), (ykr0) ((xvf0) fcj0Var.c).get(), trustedContactDto, shareSettingsMode, (a201) ((mg11) fcj0Var.d).get(), pgk0Var, (zuj0) ((tbg) fcj0Var.e).get()));
            default:
                sh11 sh11Var = (sh11) this.N;
                kcz0 kcz0Var = ((gh11) obj2).a;
                return new TrustedContactsModalView((Context) ((tbg) kcz0Var.a).get(), sh11Var, (ru.yandex.taxi.design.utils.a) ((tbg) kcz0Var.b).get());
        }
    }

    public glr0(w030 w030Var, clr0 clr0Var, rlr0 rlr0Var, TrustedContactDto trustedContactDto, ShareSettingsMode shareSettingsMode, idj idjVar, ug11 ug11Var, ej1 ej1Var) {
        super(null);
        this.H = w030Var;
        this.J = clr0Var;
        this.K = rlr0Var;
        this.L = trustedContactDto;
        this.M = shareSettingsMode;
        this.G = idjVar;
        this.F = ug11Var;
        this.N = ej1Var;
        this.I = true;
    }
}
