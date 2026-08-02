package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lbc0 {
    public final i5t0 a;
    public final ArrayList b;
    public final LinkedHashSet c;
    public final boolean d;

    public lbc0(i5t0 i5t0Var, ArrayList arrayList, LinkedHashSet linkedHashSet, boolean z) {
        this.a = i5t0Var;
        this.b = arrayList;
        this.c = linkedHashSet;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbc0)) {
            return false;
        }
        lbc0 lbc0Var = (lbc0) obj;
        return jl40.l(this.a, lbc0Var.a) && this.b.equals(lbc0Var.b) && this.c.equals(lbc0Var.c) && this.d == lbc0Var.d;
    }

    public final int hashCode() {
        i5t0 i5t0Var = this.a;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ly3.b((i5t0Var == null ? 0 : i5t0Var.hashCode()) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ReplaceResult(info=" + this.a + ", addedPinsDelta=" + this.b + ", removedPinsDelta=" + this.c + ", shouldReplaySelection=" + this.d + Extension.C_BRAKE;
    }
}
