package defpackage;

import com.yandex.payment.sdk.core.data.SbpChallengeResultInfo$SbpChallengeStatus;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerFragment;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class nfm0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SbpChallengerFragment b;

    public /* synthetic */ nfm0(SbpChallengerFragment sbpChallengerFragment, int i) {
        this.a = i;
        this.b = sbpChallengerFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 addObservers$lambda$0;
        zy11 addObservers$lambda$1;
        zy11 initBinding$lambda$1;
        int i = this.a;
        SbpChallengerFragment sbpChallengerFragment = this.b;
        switch (i) {
            case 0:
                addObservers$lambda$0 = SbpChallengerFragment.addObservers$lambda$0(sbpChallengerFragment, (SbpChallengeResultInfo$SbpChallengeStatus) obj);
                return addObservers$lambda$0;
            case 1:
                addObservers$lambda$1 = SbpChallengerFragment.addObservers$lambda$1(sbpChallengerFragment, (Pair) obj);
                return addObservers$lambda$1;
            default:
                initBinding$lambda$1 = SbpChallengerFragment.initBinding$lambda$1(sbpChallengerFragment, (Pair) obj);
                return initBinding$lambda$1;
        }
    }
}
