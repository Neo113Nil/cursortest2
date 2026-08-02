package com.yandex.passport.internal.report;

import defpackage.gvu0;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class vd extends wd {
    public final Throwable d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vd(Throwable th) {
        super(th, "host.crash.uncaught: ".concat(r0 != null ? gvu0.A0(50, r0) : "unknown"));
        String message = th.getMessage();
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd) && jl40.l(this.d, ((vd) obj).d);
    }

    public final int hashCode() {
        Throwable th = this.d;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("HostCrashUncaught(exception="), this.d, ')');
    }
}
