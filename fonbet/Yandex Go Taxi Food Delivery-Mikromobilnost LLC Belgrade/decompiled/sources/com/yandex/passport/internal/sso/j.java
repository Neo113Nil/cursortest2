package com.yandex.passport.internal.sso;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.sso.SsoContentProvider;
import defpackage.gwk0;
import defpackage.w53;

/* loaded from: classes8.dex */
public final class j {
    public final Context a;
    public final c0 b;
    public final g c;

    public j(Context context, c0 c0Var, g gVar) {
        this.a = context;
        this.b = c0Var;
        this.c = gVar;
    }

    public final Bundle a(String str, SsoContentProvider.Method method, Bundle bundle) {
        ContentProviderClient acquireUnstableContentProviderClient;
        Bundle call;
        Bundle call2;
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri parse = Uri.parse("content://com.yandex.passport.internal.sso." + str);
        try {
            try {
                String name = method.name();
                acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(parse);
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        call2 = acquireUnstableContentProviderClient.call(name, null, bundle);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    call2 = null;
                }
                gwk0.m(acquireUnstableContentProviderClient, null);
                return call2;
            } catch (Exception e) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "call", e);
                }
                c0 c0Var = this.b;
                c0Var.getClass();
                p pVar = p.b;
                w53 w53Var = new w53();
                w53Var.put("remote_package_name", str);
                w53Var.put("error", Log.getStackTraceString(e));
                c0Var.a.a(pVar, w53Var);
                return null;
            }
        } catch (RemoteException e2) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "call, trying again: " + e2.getMessage(), 8);
            }
            String name2 = method.name();
            acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(parse);
            if (acquireUnstableContentProviderClient != null) {
                try {
                    call = acquireUnstableContentProviderClient.call(name2, null, bundle);
                } finally {
                }
            } else {
                call = null;
            }
            gwk0.m(acquireUnstableContentProviderClient, null);
            return call;
        }
    }
}
