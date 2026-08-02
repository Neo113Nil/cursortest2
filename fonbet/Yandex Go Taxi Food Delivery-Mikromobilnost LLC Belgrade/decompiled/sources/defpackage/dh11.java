package defpackage;

import com.yandex.go.trusted_contacts.ui.TrustedContactsModalView;
import defpackage.sh11;
import defpackage.tje;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes14.dex */
public final class dh11 implements jh11 {
    public final /* synthetic */ TrustedContactsModalView a;

    public dh11(TrustedContactsModalView trustedContactsModalView) {
        this.a = trustedContactsModalView;
    }

    @Override // defpackage.jh11
    public final void pa(xh11 xh11Var) {
        kg11 kg11Var;
        final TrustedContactsModalView trustedContactsModalView = this.a;
        fh11 access$getBinding = TrustedContactsModalView.access$getBinding(trustedContactsModalView);
        if (!(xh11Var instanceof vh11)) {
            if (!jl40.l(xh11Var, wh11.a)) {
                w511.b();
                return;
            }
            fh11 access$getBinding2 = TrustedContactsModalView.access$getBinding(trustedContactsModalView);
            cma1.M(access$getBinding2.e);
            cma1.J(access$getBinding2.f);
            return;
        }
        cma1.L(access$getBinding.f);
        cma1.J(access$getBinding.e);
        uh11 uh11Var = ((vh11) xh11Var).a;
        fh11 access$getBinding3 = TrustedContactsModalView.access$getBinding(trustedContactsModalView);
        ToolbarComponent toolbarComponent = access$getBinding3.b;
        ButtonComponent buttonComponent = access$getBinding3.c;
        toolbarComponent.setTitle(toolbarComponent.getContext().getString(uh11Var.a));
        Integer num = uh11Var.b;
        final int i = 0;
        if (num != null) {
            toolbarComponent.setClickableTrailImage(num.intValue());
            toolbarComponent.getTrailImageView().setDebounceClickListener(new Runnable() { // from class: com.yandex.go.trusted_contacts.ui.a
                @Override // java.lang.Runnable
                public final void run() {
                    sh11 sh11Var;
                    sh11 sh11Var2;
                    int i2 = i;
                    TrustedContactsModalView trustedContactsModalView2 = trustedContactsModalView;
                    switch (i2) {
                        case 0:
                            sh11Var = trustedContactsModalView2.presenter;
                            tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$onToolbarDeleteButtonClicked$1(sh11Var, null), 3);
                            break;
                        default:
                            sh11Var2 = trustedContactsModalView2.presenter;
                            tje.N(sh11Var2.Jg(), null, null, new TrustedContactsPresenter$onCompleteDeleteButtonClicked$1(sh11Var2, null), 3);
                            break;
                    }
                }
            });
            toolbarComponent.getTrailImageView().setContentDescription(toolbarComponent.getContext().getString(kyh0.trusted_contacts_delete_title));
        } else {
            toolbarComponent.clearTrailView();
        }
        int i2 = ch11.a[uh11Var.d.ordinal()];
        final int i3 = 1;
        if (i2 == 1) {
            buttonComponent.setDebounceClickListener(new bh11(0, trustedContactsModalView));
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.trusted_contacts.ui.a
                @Override // java.lang.Runnable
                public final void run() {
                    sh11 sh11Var;
                    sh11 sh11Var2;
                    int i22 = i3;
                    TrustedContactsModalView trustedContactsModalView2 = trustedContactsModalView;
                    switch (i22) {
                        case 0:
                            sh11Var = trustedContactsModalView2.presenter;
                            tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$onToolbarDeleteButtonClicked$1(sh11Var, null), 3);
                            break;
                        default:
                            sh11Var2 = trustedContactsModalView2.presenter;
                            tje.N(sh11Var2.Jg(), null, null, new TrustedContactsPresenter$onCompleteDeleteButtonClicked$1(sh11Var2, null), 3);
                            break;
                    }
                }
            });
        }
        buttonComponent.setText(uh11Var.c);
        kg11Var = trustedContactsModalView.trustedContactsAdapter;
        if (kg11Var != null) {
            kg11Var.submitList(uh11Var.e, null);
        }
    }
}
