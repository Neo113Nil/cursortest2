package defpackage;

import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.NetworkServiceError;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.yandex.xplat.payment.sdk.NspkBackendApiError;

/* loaded from: classes2.dex */
public class ll60 implements h060 {
    @Override // defpackage.h060
    public final NetworkServiceError h(y3x y3xVar, int i) {
        return null;
    }

    @Override // defpackage.h060
    public final NetworkServiceError i(NetworkServiceError networkServiceError) {
        return networkServiceError instanceof NspkBackendApiError ? networkServiceError : networkServiceError.h(ExternalErrorTrigger.nspk);
    }

    @Override // defpackage.h060
    public final md51 m(NetworkServiceError networkServiceError) {
        return zmx.d(NetworkServiceRetryingStrategy.noRetry);
    }

    @Override // defpackage.h060
    public final NetworkServiceError n(y3x y3xVar) {
        return null;
    }
}
