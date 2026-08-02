package defpackage;

import com.yandex.xplat.payment.sdk.DiehardBackendApiError;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.NetworkServiceError;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;

/* loaded from: classes2.dex */
public class ohj implements h060 {
    public final nj51 a = new nj51(scc.i("success", "wait_for_notification", "wait_for_processing"));

    @Override // defpackage.h060
    public final NetworkServiceError h(y3x y3xVar, int i) {
        tyj0 d = mbb1.d(y3xVar, new lhj(3));
        if (d.b()) {
            return null;
        }
        return cg91.b((whj) d.a(), i);
    }

    @Override // defpackage.h060
    public final NetworkServiceError i(NetworkServiceError networkServiceError) {
        return networkServiceError instanceof DiehardBackendApiError ? networkServiceError : networkServiceError.h(ExternalErrorTrigger.diehard);
    }

    @Override // defpackage.h060
    public final md51 m(NetworkServiceError networkServiceError) {
        return zmx.d(NetworkServiceRetryingStrategy.noRetry);
    }

    @Override // defpackage.h060
    public final NetworkServiceError n(y3x y3xVar) {
        tyj0 d = mbb1.d(y3xVar, new lhj(3));
        if (d.b()) {
            return null;
        }
        whj whjVar = (whj) d.a();
        if (this.a.a.contains(whjVar.a)) {
            return null;
        }
        return cg91.b(whjVar, 200);
    }
}
