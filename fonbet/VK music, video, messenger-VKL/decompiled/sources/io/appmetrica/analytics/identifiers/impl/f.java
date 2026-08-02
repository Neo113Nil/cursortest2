package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import xsna.i5s;
import xsna.izs;

/* loaded from: classes8.dex */
public final class f {
    public final e a;
    public final izs b;
    public final String c;
    public final SafePackageManager d;

    public f(e eVar, izs izsVar, String str, SafePackageManager safePackageManager) {
        this.a = eVar;
        this.b = izsVar;
        this.c = str;
        this.d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        IBinder iBinder;
        e eVar;
        if (this.d.resolveService(context, this.a.a, 0) == null) {
            throw new l(i5s.a(new StringBuilder("could not resolve "), this.c, " services"));
        }
        try {
            eVar = this.a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.a, eVar, 1)) {
            e eVar2 = this.a;
            if (eVar2.b == null) {
                synchronized (eVar2.c) {
                    if (eVar2.b == null) {
                        try {
                            eVar2.c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.b;
            if (iBinder == null) {
                return this.b.invoke(iBinder);
            }
            throw new g(i5s.a(new StringBuilder("could not bind to "), this.c, " services"));
        }
        iBinder = null;
        if (iBinder == null) {
        }
    }

    public final void b(Context context) {
        try {
            this.a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, izs izsVar, String str) {
        this(new e(intent, str), izsVar, str, new SafePackageManager());
    }
}
