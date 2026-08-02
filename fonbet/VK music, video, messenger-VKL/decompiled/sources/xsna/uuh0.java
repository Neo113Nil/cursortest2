package xsna;

import xsna.wuh0;

/* compiled from: SearchHistoryConfig.kt */
/* loaded from: classes3.dex */
public final class uuh0 {
    public final wuh0.a a;
    public final vuh0 b;

    public uuh0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuh0)) {
            return false;
        }
        uuh0 uuh0Var = (uuh0) obj;
        return epx.f(this.a, uuh0Var.a) && epx.f(this.b, uuh0Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Default(repoConfig=" + this.a + ", providerConfig=" + this.b + ')';
    }

    public uuh0(int i) {
        wuh0.a aVar = new wuh0.a(0);
        vuh0 vuh0Var = new vuh0(0);
        this.a = aVar;
        this.b = vuh0Var;
    }
}
