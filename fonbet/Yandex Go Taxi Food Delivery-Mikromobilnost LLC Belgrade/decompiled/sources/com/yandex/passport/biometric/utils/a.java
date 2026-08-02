package com.yandex.passport.biometric.utils;

import android.util.Log;
import java.util.EnumSet;
import ru.rt.ebs.cryptosdk.core.logging.EventLoggerType;
import ru.rt.ebs.cryptosdk.core.logging.IEbsLoggerClient;

/* loaded from: classes4.dex */
public final class a implements IEbsLoggerClient {
    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLoggerClient
    public final void data(String str, String str2) {
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLoggerClient
    public final void error(String str, Throwable th) {
        Log.e(str, "error", th);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLoggerClient
    public final EnumSet getEventLoggerTypes() {
        return EnumSet.of(EventLoggerType.ERROR);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLoggerClient
    public final void info(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLoggerClient
    public final void warning(String str, String str2, Throwable th) {
    }
}
