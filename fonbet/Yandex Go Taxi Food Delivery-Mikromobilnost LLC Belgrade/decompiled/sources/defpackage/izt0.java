package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class izt0 extends ofb1 {
    public final long a;
    public final float b;
    public final String c;
    public final v4v d;

    public izt0(long j, float f, String str, v4v v4vVar) {
        this.a = j;
        this.b = f;
        this.c = str;
        this.d = v4vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izt0)) {
            return false;
        }
        izt0 izt0Var = (izt0) obj;
        return this.a == izt0Var.a && Float.compare(this.b, izt0Var.b) == 0 && jl40.l(this.c, izt0Var.c) && jl40.l(this.d, izt0Var.d);
    }

    public final int hashCode() {
        int c = g8e.c(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        v4v v4vVar = this.d;
        return hashCode + (v4vVar != null ? v4vVar.hashCode() : 0);
    }

    public final String toString() {
        return "AnimatableStageModel(displayDuration=" + this.a + ", progress=" + this.b + ", dynamicDescription=" + this.c + ", iconModel=" + this.d + Extension.C_BRAKE;
    }
}
