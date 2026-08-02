package defpackage;

import com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class b560 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ NewBindFragment b;

    public /* synthetic */ b560(NewBindFragment newBindFragment, int i) {
        this.a = i;
        this.b = newBindFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$2;
        zy11 onViewCreated$lambda$3;
        uv90 onCreate$lambda$1;
        p560 mediator_delegate$lambda$0;
        rwo eventReporter_delegate$lambda$0;
        int i = this.a;
        NewBindFragment newBindFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$2 = NewBindFragment.onViewCreated$lambda$2(newBindFragment);
                return onViewCreated$lambda$2;
            case 1:
                onViewCreated$lambda$3 = NewBindFragment.onViewCreated$lambda$3(newBindFragment);
                return onViewCreated$lambda$3;
            case 2:
                onCreate$lambda$1 = NewBindFragment.onCreate$lambda$1(newBindFragment);
                return onCreate$lambda$1;
            case 3:
                mediator_delegate$lambda$0 = NewBindFragment.mediator_delegate$lambda$0(newBindFragment);
                return mediator_delegate$lambda$0;
            default:
                eventReporter_delegate$lambda$0 = NewBindFragment.eventReporter_delegate$lambda$0(newBindFragment);
                return eventReporter_delegate$lambda$0;
        }
    }
}
