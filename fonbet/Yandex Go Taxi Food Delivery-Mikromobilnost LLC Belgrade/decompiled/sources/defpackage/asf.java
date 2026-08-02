package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class asf implements vpr {
    public final /* synthetic */ tse a;
    public final /* synthetic */ DKChallengerFragment b;

    public asf(tse tseVar, DKChallengerFragment dKChallengerFragment) {
        this.a = tseVar;
        this.b = dKChallengerFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        psf viewModel;
        z89 z89Var;
        psf viewModel2;
        tc5 activityViewModel;
        Uri uri = (Uri) obj;
        boolean l = jl40.l(uri.getHost(), "close");
        tse tseVar = this.a;
        tse tseVar2 = (l && jl40.l(uri.getScheme(), "payment-sdk")) ? tseVar : null;
        DKChallengerFragment dKChallengerFragment = this.b;
        if (tseVar2 != null) {
            activityViewModel = dKChallengerFragment.getActivityViewModel();
            activityViewModel.L();
        }
        if (((jl40.l(uri.getHost(), "resend_sms") && jl40.l(uri.getScheme(), "payment-sdk")) ? tseVar : null) != null) {
            viewModel2 = dKChallengerFragment.getViewModel();
            viewModel2.Y();
        }
        if (!jl40.l(uri.getHost(), "bank_open") || !jl40.l(uri.getScheme(), "payment-sdk")) {
            tseVar = null;
        }
        if (tseVar != null) {
            viewModel = dKChallengerFragment.getViewModel();
            PaymentMethod.SbpToken sbpToken = viewModel.D;
            String memberId = sbpToken != null ? sbpToken.getMemberId() : null;
            if (memberId == null) {
                memberId = "";
            }
            String concat = memberId.concat("://");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(concat));
            z89Var = dKChallengerFragment.callbacks;
            boolean R = ((zbq0) (z89Var != null ? z89Var : null)).R(intent);
            rwo eventReporter = dKChallengerFragment.getEventReporter();
            qv90.a.getClass();
            ((y22) eventReporter).a(sv90.i0(concat, R));
        }
        return zy11.a;
    }
}
