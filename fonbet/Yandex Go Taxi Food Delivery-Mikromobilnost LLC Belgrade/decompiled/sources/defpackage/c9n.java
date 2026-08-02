package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class c9n {
    public final bdz0 a;
    public final zxi b;

    public /* synthetic */ c9n(int i) {
        this(new bdz0(0), new zxi(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9n)) {
            return false;
        }
        c9n c9nVar = (c9n) obj;
        return jl40.l(this.a, c9nVar.a) && jl40.l(this.b, c9nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DynamicSearchTimelineState(timeline=" + this.a + ", description=" + this.b + Extension.C_BRAKE;
    }

    public c9n(bdz0 bdz0Var, zxi zxiVar) {
        this.a = bdz0Var;
        this.b = zxiVar;
    }

    public c9n() {
        this(0);
    }
}
