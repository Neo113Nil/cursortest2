package xsna;

import xsna.z6y0;

/* compiled from: ZoomConfig.kt */
/* loaded from: classes4.dex */
public final class n6y0 {
    public final z6y0.b a;
    public final d7y0 b;

    public n6y0(z6y0.b bVar, d7y0 d7y0Var) {
        this.a = bVar;
        this.b = d7y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6y0)) {
            return false;
        }
        n6y0 n6y0Var = (n6y0) obj;
        return this.a.equals(n6y0Var.a) && this.b.equals(n6y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ZoomConfig(setting=" + this.a + ", statEvents=" + this.b + ")";
    }
}
