package defpackage;

import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class hfm0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SbpChallengerActivity b;

    public /* synthetic */ hfm0(SbpChallengerActivity sbpChallengerActivity, int i) {
        this.a = i;
        this.b = sbpChallengerActivity;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 observeViewModel$lambda$0;
        zy11 observeViewModel$lambda$1;
        zy11 onCreate$lambda$1;
        int i = this.a;
        SbpChallengerActivity sbpChallengerActivity = this.b;
        switch (i) {
            case 0:
                observeViewModel$lambda$0 = SbpChallengerActivity.observeViewModel$lambda$0(sbpChallengerActivity, (f950) obj);
                return observeViewModel$lambda$0;
            case 1:
                observeViewModel$lambda$1 = SbpChallengerActivity.observeViewModel$lambda$1(sbpChallengerActivity, (cgm0) obj);
                return observeViewModel$lambda$1;
            default:
                onCreate$lambda$1 = SbpChallengerActivity.onCreate$lambda$1(sbpChallengerActivity, (mx60) obj);
                return onCreate$lambda$1;
        }
    }
}
