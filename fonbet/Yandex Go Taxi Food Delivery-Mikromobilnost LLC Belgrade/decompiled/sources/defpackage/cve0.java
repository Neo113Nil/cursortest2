package defpackage;

import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class cve0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreselectNewBindFragment b;

    public /* synthetic */ cve0(PreselectNewBindFragment preselectNewBindFragment, int i) {
        this.a = i;
        this.b = preselectNewBindFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onCreateView$lambda$1$0;
        zy11 onCreateView$lambda$1$1;
        zy11 onCreateView$lambda$1$2;
        zy11 observeChanges$lambda$0;
        zy11 observeChanges$lambda$1;
        zy11 observeChanges$lambda$2;
        int i = this.a;
        PreselectNewBindFragment preselectNewBindFragment = this.b;
        switch (i) {
            case 0:
                onCreateView$lambda$1$0 = PreselectNewBindFragment.onCreateView$lambda$1$0(preselectNewBindFragment, (CardInput$State) obj);
                return onCreateView$lambda$1$0;
            case 1:
                onCreateView$lambda$1$1 = PreselectNewBindFragment.onCreateView$lambda$1$1(preselectNewBindFragment, (String) obj);
                return onCreateView$lambda$1$1;
            case 2:
                onCreateView$lambda$1$2 = PreselectNewBindFragment.onCreateView$lambda$1$2(preselectNewBindFragment, (CardPaymentSystem) obj);
                return onCreateView$lambda$1$2;
            case 3:
                observeChanges$lambda$0 = PreselectNewBindFragment.observeChanges$lambda$0(preselectNewBindFragment, (qve0) obj);
                return observeChanges$lambda$0;
            case 4:
                observeChanges$lambda$1 = PreselectNewBindFragment.observeChanges$lambda$1(preselectNewBindFragment, (kve0) obj);
                return observeChanges$lambda$1;
            default:
                observeChanges$lambda$2 = PreselectNewBindFragment.observeChanges$lambda$2(preselectNewBindFragment, (tve0) obj);
                return observeChanges$lambda$2;
        }
    }
}
