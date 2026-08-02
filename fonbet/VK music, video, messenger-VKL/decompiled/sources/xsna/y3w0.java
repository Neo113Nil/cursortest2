package xsna;

import android.app.Application;

/* compiled from: VkpnsAuthConfig.kt */
/* loaded from: classes.dex */
public final class y3w0 {
    public final Application a;
    public final zzp b;
    public final yhe0 c;
    public final boolean d;

    public y3w0(Application application, zzp zzpVar, yhe0 yhe0Var, boolean z) {
        this.a = application;
        this.b = zzpVar;
        this.c = yhe0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3w0)) {
            return false;
        }
        y3w0 y3w0Var = (y3w0) obj;
        return epx.f(this.a, y3w0Var.a) && epx.f(this.b, y3w0Var.b) && epx.f(this.c, y3w0Var.c) && this.d == y3w0Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (hashCode + i) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkpnsAuthConfig(application=");
        sb.append(this.a);
        sb.append(", authProvider=");
        sb.append(this.b);
        sb.append(", logger=");
        sb.append(this.c);
        sb.append(", sdkEnabled=");
        return n23.b(sb, this.d, ", hostInfoProvider=null, testModeEnabled=false, analyticsCallback=null)");
    }
}
