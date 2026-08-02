package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.domain.entities.ShareSettingsMode;
import com.yandex.go.trusted_contacts.ui.BaseTrustedContactsModalView;
import com.yandex.go.trusted_contacts.ui.TrustedContactsModalView;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes14.dex */
public final class ih11 {
    public final /* synthetic */ glr0 a;

    public ih11(glr0 glr0Var) {
        this.a = glr0Var;
    }

    public final void a(TrustedContactDto trustedContactDto, ShareSettingsMode shareSettingsMode) {
        glr0 glr0Var = this.a;
        u45 i = glr0Var.H.i(TrustedContactsModalView.class);
        BaseTrustedContactsModalView baseTrustedContactsModalView = i instanceof BaseTrustedContactsModalView ? (BaseTrustedContactsModalView) i : null;
        hh11 hh11Var = new hh11(baseTrustedContactsModalView, this);
        if (baseTrustedContactsModalView != null) {
            BaseTrustedContactsModalView.animateDismissRightToLeft$default(baseTrustedContactsModalView, new hek0(glr0Var, trustedContactDto, shareSettingsMode, hh11Var, 6), null, 2, null);
        }
    }

    public final void b() {
        glr0 glr0Var = this.a;
        qh11 qh11Var = (qh11) glr0Var.L;
        zuj0 zuj0Var = (zuj0) glr0Var.M;
        String h = ((avj0) zuj0Var).h(kyh0.trusted_contacts_add_contact);
        int u = tje.u(16, ((avj0) zuj0Var).a);
        tfb0 tfb0Var = new tfb0(h, EmptyList.a, null, null, true, SlideableModalView.CardMode.FULLSCREEN, Integer.valueOf(u), 636);
        c1x0 c1x0Var = new c1x0(glr0Var);
        tui tuiVar = new tui(2);
        a201 a201Var = qh11Var.a;
        glr0Var.z(new ph11((ufb0) ((tbg) a201Var.b).get(), (w030) ((xvf0) a201Var.c).get(), tfb0Var, c1x0Var, tuiVar), sy60.Q2);
    }
}
