package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* loaded from: classes11.dex */
public final class c0 {
    public boolean a = false;
    public final /* synthetic */ InstallActivity b;

    public c0(InstallActivity installActivity) {
        this.b = installActivity;
    }

    public final void a(w wVar) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    return;
                }
                this.b.f(wVar);
                ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
                ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                int ordinal = wVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        this.b.c(new UnavailableUserDeclinedInstallationException());
                    } else if (ordinal == 2) {
                        if (!this.b.g() && q.m.d) {
                            this.b.e();
                        }
                        this.b.c(null);
                    }
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(FatalException fatalException) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.b.f(w.b);
                this.b.c(fatalException);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
