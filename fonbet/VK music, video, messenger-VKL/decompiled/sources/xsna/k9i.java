package xsna;

import xsna.a7m;

/* compiled from: Node.kt */
/* loaded from: classes.dex */
public final class k9i<C extends a7m> implements z470 {
    public final rfc a;
    public final l9i b;

    public k9i(rfc rfcVar, l9i l9iVar) {
        this.a = rfcVar;
        this.b = l9iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9i)) {
            return false;
        }
        k9i k9iVar = (k9i) obj;
        return epx.f(this.a, k9iVar.a) && epx.f(this.b, k9iVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l9i l9iVar = this.b;
        return hashCode + (l9iVar == null ? 0 : l9iVar.hashCode());
    }

    public final String toString() {
        return "ComponentNodeKey(kClass=" + this.a + ", params=" + this.b + ')';
    }
}
