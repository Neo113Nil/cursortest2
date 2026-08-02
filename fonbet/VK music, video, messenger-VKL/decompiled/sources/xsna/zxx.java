package xsna;

/* compiled from: JavascriptInterface.kt */
/* loaded from: classes6.dex */
public final class zxx {
    public final r6y a;

    public zxx(r6y r6yVar) {
        this.a = r6yVar;
    }

    public final r6y a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxx)) {
            return false;
        }
        zxx zxxVar = (zxx) obj;
        zxxVar.getClass();
        return epx.f(this.a, zxxVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 527257528;
    }

    public final String toString() {
        return "JavascriptInterface(name=AndroidBridge, bridge=" + this.a + ')';
    }
}
