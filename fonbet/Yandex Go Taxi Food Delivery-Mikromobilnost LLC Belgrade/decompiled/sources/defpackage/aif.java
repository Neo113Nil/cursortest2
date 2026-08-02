package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aif {
    public final x8n a;
    public final long b;

    public aif(x8n x8nVar, long j) {
        this.a = x8nVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aif)) {
            return false;
        }
        aif aifVar = (aif) obj;
        return jl40.l(this.a, aifVar.a) && this.b == aifVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "CurrentTimeline(timeline=" + this.a + ", startTime=" + this.b + Extension.C_BRAKE;
    }
}
