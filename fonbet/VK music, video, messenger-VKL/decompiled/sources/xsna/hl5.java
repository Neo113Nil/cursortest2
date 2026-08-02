package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes.dex */
public final class hl5 extends j5k.e.d.a.b {
    public final List<j5k.e.d.a.b.AbstractC3100d> a;
    public final j5k.e.d.a.b.AbstractC3099b b;
    public final j5k.a c;
    public final kl5 d;
    public final List<j5k.e.d.a.b.AbstractC3098a> e;

    public hl5() {
        throw null;
    }

    public hl5(List list, jl5 jl5Var, j5k.a aVar, kl5 kl5Var, List list2) {
        this.a = list;
        this.b = jl5Var;
        this.c = aVar;
        this.d = kl5Var;
        this.e = list2;
    }

    @Override // xsna.j5k.e.d.a.b
    @Nullable
    public final j5k.a a() {
        return this.c;
    }

    @Override // xsna.j5k.e.d.a.b
    @NonNull
    public final List<j5k.e.d.a.b.AbstractC3098a> b() {
        return this.e;
    }

    @Override // xsna.j5k.e.d.a.b
    @Nullable
    public final j5k.e.d.a.b.AbstractC3099b c() {
        return this.b;
    }

    @Override // xsna.j5k.e.d.a.b
    @NonNull
    public final j5k.e.d.a.b.c d() {
        return this.d;
    }

    @Override // xsna.j5k.e.d.a.b
    @Nullable
    public final List<j5k.e.d.a.b.AbstractC3100d> e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.a.b)) {
            return false;
        }
        j5k.e.d.a.b bVar = (j5k.e.d.a.b) obj;
        List<j5k.e.d.a.b.AbstractC3100d> list = this.a;
        if (list == null) {
            if (bVar.e() != null) {
                return false;
            }
        } else if (!list.equals(bVar.e())) {
            return false;
        }
        j5k.e.d.a.b.AbstractC3099b abstractC3099b = this.b;
        if (abstractC3099b == null) {
            if (bVar.c() != null) {
                return false;
            }
        } else if (!abstractC3099b.equals(bVar.c())) {
            return false;
        }
        j5k.a aVar = this.c;
        if (aVar == null) {
            if (bVar.a() != null) {
                return false;
            }
        } else if (!aVar.equals(bVar.a())) {
            return false;
        }
        return this.d.equals(bVar.d()) && this.e.equals(bVar.b());
    }

    public final int hashCode() {
        List<j5k.e.d.a.b.AbstractC3100d> list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        j5k.e.d.a.b.AbstractC3099b abstractC3099b = this.b;
        int hashCode2 = (hashCode ^ (abstractC3099b == null ? 0 : abstractC3099b.hashCode())) * 1000003;
        j5k.a aVar = this.c;
        return (((((aVar != null ? aVar.hashCode() : 0) ^ hashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        return vp.b("}", sb, this.e);
    }
}
