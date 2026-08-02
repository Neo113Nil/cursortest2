package com.yandex.passport.biometric.api;

import com.yandex.passport.biometric.impl.a;
import com.yandex.passport.common.ebs.t;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/passport/biometric/api/PassportBiometricFactory;", "", "<init>", "()V", "Lcom/yandex/passport/common/ebs/t;", "createPassportEbsApi", "()Lcom/yandex/passport/common/ebs/t;", "passport-biometric_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportBiometricFactory {
    public static final PassportBiometricFactory INSTANCE = new PassportBiometricFactory();

    private PassportBiometricFactory() {
    }

    public static final t createPassportEbsApi() {
        return new a();
    }
}
