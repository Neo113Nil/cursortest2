package com.yandex.passport.common.analytics;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.b64;
import defpackage.evu0;
import defpackage.j18;
import defpackage.mf60;
import io.appmetrica.analytics.IParamsCallback;

/* loaded from: classes8.dex */
public final class c implements IParamsCallback {
    public final j18 a;

    public c(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onReceive(IParamsCallback.Result result) {
        j18 j18Var = this.a;
        if (j18Var.t() instanceof mf60) {
            String str = null;
            String deviceId = result != null ? result.getDeviceId() : null;
            String uuid = result != null ? result.getUuid() : null;
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, b64.l("Metrica requestStartupIdentifiers onReceive, deviceId=", deviceId, ", uuid=", uuid), 8);
            }
            if (deviceId == null) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Metrica requestStartupIdentifiers: no device id got from metrica", 8);
                }
                j18Var.resumeWith(null);
                return;
            }
            if (evu0.J(deviceId)) {
                deviceId = null;
            }
            if (deviceId == null) {
                deviceId = null;
            }
            if (uuid != null) {
                if (evu0.J(uuid)) {
                    uuid = null;
                }
                if (uuid != null) {
                    str = uuid;
                }
            }
            j18Var.resumeWith(new b(deviceId, str));
        }
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Metrica requestStartupIdentifiers onRequestError, reason=" + reason, 8);
        }
        j18 j18Var = this.a;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(null);
        }
    }
}
