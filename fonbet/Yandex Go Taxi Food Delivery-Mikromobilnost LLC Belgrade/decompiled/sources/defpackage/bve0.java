package defpackage;

import com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class bve0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreselectNewBindFragment b;

    public /* synthetic */ bve0(PreselectNewBindFragment preselectNewBindFragment, int i) {
        this.a = i;
        this.b = preselectNewBindFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$2;
        rwo eventReporter_delegate$lambda$0;
        int i = this.a;
        PreselectNewBindFragment preselectNewBindFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$2 = PreselectNewBindFragment.onViewCreated$lambda$2(preselectNewBindFragment);
                return onViewCreated$lambda$2;
            default:
                eventReporter_delegate$lambda$0 = PreselectNewBindFragment.eventReporter_delegate$lambda$0(preselectNewBindFragment);
                return eventReporter_delegate$lambda$0;
        }
    }
}
