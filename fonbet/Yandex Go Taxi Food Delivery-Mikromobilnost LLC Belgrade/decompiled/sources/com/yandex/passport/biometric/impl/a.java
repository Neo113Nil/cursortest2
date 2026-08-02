package com.yandex.passport.biometric.impl;

import com.yandex.passport.biometric.ui.initialization.b;
import com.yandex.passport.biometric.ui.verification.c;
import com.yandex.passport.common.ebs.t;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.x40;
import ru.rt.ebs.cryptosdk.EbsCryptoSdk;

/* loaded from: classes15.dex */
public final class a implements t {
    @Override // com.yandex.passport.common.ebs.t
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.passport.common.ebs.t
    public final x40 b() {
        return new b();
    }

    @Override // com.yandex.passport.common.ebs.t
    public final x40 c() {
        return new c();
    }

    @Override // com.yandex.passport.common.ebs.t
    public final void d() {
        try {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "EbsCryptoSdk.release()", 8);
            }
            EbsCryptoSdk.release();
        } catch (Exception unused) {
        }
    }
}
