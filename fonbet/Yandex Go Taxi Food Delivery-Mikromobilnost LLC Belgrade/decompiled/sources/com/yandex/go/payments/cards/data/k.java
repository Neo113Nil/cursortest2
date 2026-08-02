package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.cards.data.model.VerificationsStatusResponse;
import defpackage.j831;
import defpackage.l2e0;
import defpackage.u32;
import java.io.IOException;
import javax.net.ssl.SSLException;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.network.api.models.GoApiOtherException;
import ru.yandex.taxi.network.api.models.GoCheckException;
import ru.yandex.taxi.network.api.models.GoParsingException;

/* loaded from: classes13.dex */
public final /* synthetic */ class k implements l2e0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.l2e0
    public final Object a(Throwable th, Object obj, int i) {
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                l lVar = (l) obj2;
                j831 j831Var = (j831) obj;
                u32 u32Var = lVar.d;
                if (th instanceof VerificationRepository$ResponseInProgressException) {
                    VerificationRepository$ResponseInProgressException verificationRepository$ResponseInProgressException = (VerificationRepository$ResponseInProgressException) th;
                    Verification verification = verificationRepository$ResponseInProgressException.getVerification();
                    Integer num = verification.h;
                    u32Var.j(j831Var.a, verification.b());
                    return new j831(j831Var.a, verification.a, verification.b(), null, false, verification.c, verification.i, verificationRepository$ResponseInProgressException.getRetryTime(), verificationRepository$ResponseInProgressException.getPollingDeadline(), j831Var.j, j831Var.k, null, j831Var.m, verificationRepository$ResponseInProgressException.getVerification().e);
                }
                if (th instanceof GoApiHttpException) {
                    lVar.f.g((GoApiHttpException) th, j831Var.a);
                } else {
                    if (!(th instanceof GoApiOtherException)) {
                        if (th instanceof GoParsingException) {
                            throw th;
                        }
                        if (th instanceof GoCheckException) {
                            throw th;
                        }
                        throw th;
                    }
                    Throwable original = ((GoApiOtherException) th).getOriginal();
                    if (!(original instanceof IOException)) {
                        throw th;
                    }
                    if (original instanceof SSLException) {
                        throw th;
                    }
                }
                u32Var.j(j831Var.a, j831Var.c);
                return j831Var;
            default:
                o oVar = (o) obj2;
                j831 j831Var2 = (j831) obj;
                u32 u32Var2 = oVar.d;
                if (!(th instanceof VerificationV4Repository$ResponseInProgressException)) {
                    if (th instanceof GoApiHttpException) {
                        oVar.f.g((GoApiHttpException) th, j831Var2.a);
                    }
                    u32Var2.j(j831Var2.a, null);
                    return j831Var2;
                }
                VerificationV4Repository$ResponseInProgressException verificationV4Repository$ResponseInProgressException = (VerificationV4Repository$ResponseInProgressException) th;
                VerificationsStatusResponse response = verificationV4Repository$ResponseInProgressException.getResponse();
                Long retryTime = verificationV4Repository$ResponseInProgressException.getRetryTime();
                Long pollingDeadline = verificationV4Repository$ResponseInProgressException.getPollingDeadline();
                Integer num2 = response.f;
                u32Var2.j(j831Var2.a, response.b());
                return new j831(j831Var2.a, j831Var2.b, j831Var2.c, null, false, response.a, response.g, retryTime, pollingDeadline, j831Var2.j, j831Var2.k, null, j831Var2.m, response.c);
        }
    }
}
