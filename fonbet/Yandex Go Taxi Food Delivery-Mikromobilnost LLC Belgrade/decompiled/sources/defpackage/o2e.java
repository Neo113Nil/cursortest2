package defpackage;

import ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationFragment;
import ru.yandex.taxi.altpins.models.OptionType;

/* loaded from: classes5.dex */
public final /* synthetic */ class o2e implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmAlternativeDestinationFragment b;

    public /* synthetic */ o2e(ConfirmAlternativeDestinationFragment confirmAlternativeDestinationFragment, int i) {
        this.a = i;
        this.b = confirmAlternativeDestinationFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onViewCreated$lambda$0;
        boolean onViewCreated$lambda$1;
        int i = this.a;
        ConfirmAlternativeDestinationFragment confirmAlternativeDestinationFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$0 = ConfirmAlternativeDestinationFragment.onViewCreated$lambda$0(confirmAlternativeDestinationFragment, (OptionType) obj);
                return onViewCreated$lambda$0;
            default:
                onViewCreated$lambda$1 = ConfirmAlternativeDestinationFragment.onViewCreated$lambda$1(confirmAlternativeDestinationFragment, (t1w) obj);
                return Boolean.valueOf(onViewCreated$lambda$1);
        }
    }
}
