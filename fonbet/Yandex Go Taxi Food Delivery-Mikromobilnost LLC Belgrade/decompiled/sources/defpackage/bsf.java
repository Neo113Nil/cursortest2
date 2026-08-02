package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bsf implements vpr {
    public final /* synthetic */ tse a;
    public final /* synthetic */ DKChallengerFragment b;
    public final /* synthetic */ PaymentMethod.SbpToken c;

    public bsf(tse tseVar, DKChallengerFragment dKChallengerFragment, PaymentMethod.SbpToken sbpToken) {
        this.a = tseVar;
        this.b = dKChallengerFragment;
        this.c = sbpToken;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        boolean tryOpenBankApp;
        psf viewModel;
        tc5 activityViewModel;
        Uri uri = (Uri) obj;
        boolean l = jl40.l(uri.getHost(), "close");
        tse tseVar = null;
        tse tseVar2 = this.a;
        tse tseVar3 = (l && jl40.l(uri.getScheme(), "payment-sdk")) ? tseVar2 : null;
        DKChallengerFragment dKChallengerFragment = this.b;
        if (tseVar3 != null) {
            activityViewModel = dKChallengerFragment.getActivityViewModel();
            activityViewModel.L();
        }
        if (((jl40.l(uri.getHost(), "resend_sms") && jl40.l(uri.getScheme(), "payment-sdk")) ? tseVar2 : null) != null) {
            viewModel = dKChallengerFragment.getViewModel();
            viewModel.Y();
        }
        if (jl40.l(uri.getHost(), "bank_open") && jl40.l(uri.getScheme(), "payment-sdk")) {
            tseVar = tseVar2;
        }
        if (tseVar != null) {
            String memberId = this.c.getMemberId();
            if (memberId == null) {
                memberId = "";
            }
            String concat = memberId.concat("://");
            tryOpenBankApp = dKChallengerFragment.tryOpenBankApp(new Intent("android.intent.action.VIEW", Uri.parse(concat)));
            rwo eventReporter = dKChallengerFragment.getEventReporter();
            qv90.a.getClass();
            ((y22) eventReporter).a(sv90.i0(concat, tryOpenBankApp));
        }
        return zy11.a;
    }
}
