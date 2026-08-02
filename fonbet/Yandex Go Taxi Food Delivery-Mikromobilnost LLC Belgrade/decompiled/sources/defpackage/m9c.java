package defpackage;

import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusScreenParams;
import com.ybsdk.screens.registration.codeconfirmation.domain.interactors.b;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m9c implements vpr {
    public final /* synthetic */ b a;

    public m9c(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        s2e0 s2e0Var = (s2e0) obj;
        boolean z = s2e0Var instanceof q2e0;
        b bVar = this.a;
        if (z) {
            if (l9c.a[((ee9) ((q2e0) s2e0Var).a).a.ordinal()] == 1) {
                bVar.i(ChangePhoneStatusScreenParams.Status.SUCCESS);
            }
        } else {
            if (s2e0Var instanceof n2e0) {
                Throwable th = ((n2e0) s2e0Var).a;
                if ((th instanceof ApplicationStatusFailedException ? (ApplicationStatusFailedException) th : null) != null) {
                    bVar.i(ChangePhoneStatusScreenParams.Status.FAIL);
                }
            } else if (!jl40.l(s2e0Var, o2e0.a) && !(s2e0Var instanceof p2e0) && !jl40.l(s2e0Var, r2e0.a)) {
                w511.b();
                return null;
            }
        }
        return zy11.a;
    }
}
