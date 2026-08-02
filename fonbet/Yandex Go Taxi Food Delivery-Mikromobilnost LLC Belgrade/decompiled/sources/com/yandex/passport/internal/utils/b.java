package com.yandex.passport.internal.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import defpackage.ike;
import defpackage.ioq0;
import defpackage.ni9;
import defpackage.oi9;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import kotlinx.coroutines.flow.e;

/* loaded from: classes2.dex */
public abstract class b {
    public static final void a(int i, String str) {
        c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "ConnectivityManager." + str + ", callbackHashcode = " + i, 8);
        }
    }

    public static final void b(int i, Exception exc, String str) {
        c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.INFO, null, "ConnectivityManager." + str + ", callbackHashcode = " + i, exc);
        }
    }

    public static final void c(ioq0 ioq0Var, com.yandex.passport.sloth.ui.c cVar, tse tseVar) {
        Object d = ioq0Var.d(cVar);
        ni9 ni9Var = oi9.b;
        if (d instanceof ni9) {
            tje.N(tseVar, null, null, new ConnectivityManagerUtilsKt$trySendWithFallback$1(ioq0Var, cVar, null), 3);
        }
    }

    public static final com.yandex.passport.sloth.ui.c d(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        com.yandex.passport.sloth.ui.c cVar = com.yandex.passport.sloth.ui.c.b;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            boolean hasCapability = networkCapabilities.hasCapability(12);
            if (hasCapability) {
                return com.yandex.passport.sloth.ui.c.a;
            }
            if (hasCapability) {
                w511.b();
                return null;
            }
        }
        return cVar;
    }

    public static final String e(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return com.yandex.passport.common.util.a.e(sb.toString());
    }

    public static final kotlinx.coroutines.flow.b f(ConnectivityManager connectivityManager, ike ikeVar) {
        return e.g(new ConnectivityManagerUtilsKt$observeConnectivity$1(connectivityManager, ikeVar, null));
    }
}
