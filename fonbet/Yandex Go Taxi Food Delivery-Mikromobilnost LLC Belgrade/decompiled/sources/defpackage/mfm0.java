package defpackage;

import android.view.View;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class mfm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SbpChallengerFragment b;

    public /* synthetic */ mfm0(SbpChallengerFragment sbpChallengerFragment, int i) {
        this.a = i;
        this.b = sbpChallengerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SbpChallengerFragment sbpChallengerFragment = this.b;
        switch (i) {
            case 0:
                SbpChallengerFragment.initSmsChallenger$lambda$1(sbpChallengerFragment, view);
                break;
            default:
                SbpChallengerFragment.initBinding$lambda$0(sbpChallengerFragment, view);
                break;
        }
    }
}
