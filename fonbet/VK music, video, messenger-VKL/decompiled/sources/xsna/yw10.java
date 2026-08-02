package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* compiled from: MediaRouteDiscoveryRequest.java */
/* loaded from: classes12.dex */
public final class yw10 {
    public final Bundle a;
    public ex10 b;

    public yw10(@NonNull ex10 ex10Var, boolean z) {
        if (ex10Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = ex10Var;
        bundle.putBundle("selector", ex10Var.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.b == null) {
            ex10 b = ex10.b(this.a.getBundle("selector"));
            this.b = b;
            if (b == null) {
                this.b = ex10.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yw10) {
            yw10 yw10Var = (yw10) obj;
            a();
            ex10 ex10Var = this.b;
            yw10Var.a();
            if (ex10Var.equals(yw10Var.b) && b() == yw10Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode() ^ (b() ? 1 : 0);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.b.a();
        return n23.b(sb, !r1.b.contains(null), " }");
    }
}
