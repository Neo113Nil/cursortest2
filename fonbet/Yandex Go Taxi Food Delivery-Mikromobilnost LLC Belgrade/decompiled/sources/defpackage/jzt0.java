package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jzt0 extends ofb1 {
    public final v4v a;

    public jzt0(v4v v4vVar) {
        this.a = v4vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jzt0) && jl40.l(this.a, ((jzt0) obj).a);
    }

    public final int hashCode() {
        v4v v4vVar = this.a;
        if (v4vVar == null) {
            return 0;
        }
        return v4vVar.hashCode();
    }

    public final String toString() {
        return "IdleStageModel(dynamicDescription=null, iconModel=" + this.a + Extension.C_BRAKE;
    }

    public jzt0() {
        this(null);
    }
}
