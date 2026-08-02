package defpackage;

import ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationFragment;

/* loaded from: classes5.dex */
public final class q2e implements x2e {
    public final /* synthetic */ ConfirmAlternativeDestinationFragment a;

    public q2e(ConfirmAlternativeDestinationFragment confirmAlternativeDestinationFragment) {
        this.a = confirmAlternativeDestinationFragment;
    }

    @Override // defpackage.x2e
    public final void O6(s2e s2eVar) {
        ConfirmAlternativeDestinationFragment confirmAlternativeDestinationFragment = this.a;
        confirmAlternativeDestinationFragment.renderViewModel(s2eVar);
        confirmAlternativeDestinationFragment.applyTopFade();
    }
}
