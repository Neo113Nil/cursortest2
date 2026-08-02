package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes.dex */
public final class jl5 extends j5k.e.d.a.b.AbstractC3099b {
    public final String a;
    public final String b;
    public final List<j5k.e.d.a.b.AbstractC3100d.AbstractC3101a> c;
    public final j5k.e.d.a.b.AbstractC3099b d;
    public final int e;

    public jl5() {
        throw null;
    }

    public jl5(String str, String str2, List list, j5k.e.d.a.b.AbstractC3099b abstractC3099b, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = abstractC3099b;
        this.e = i;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3099b
    @Nullable
    public final j5k.e.d.a.b.AbstractC3099b a() {
        return this.d;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3099b
    @NonNull
    public final List<j5k.e.d.a.b.AbstractC3100d.AbstractC3101a> b() {
        return this.c;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3099b
    public final int c() {
        return this.e;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3099b
    @Nullable
    public final String d() {
        return this.b;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3099b
    @NonNull
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.a.b.AbstractC3099b)) {
            return false;
        }
        j5k.e.d.a.b.AbstractC3099b abstractC3099b = (j5k.e.d.a.b.AbstractC3099b) obj;
        if (!this.a.equals(abstractC3099b.e())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (abstractC3099b.d() != null) {
                return false;
            }
        } else if (!str.equals(abstractC3099b.d())) {
            return false;
        }
        if (!this.c.equals(abstractC3099b.b())) {
            return false;
        }
        j5k.e.d.a.b.AbstractC3099b abstractC3099b2 = this.d;
        if (abstractC3099b2 == null) {
            if (abstractC3099b.a() != null) {
                return false;
            }
        } else if (!abstractC3099b2.equals(abstractC3099b.a())) {
            return false;
        }
        return this.e == abstractC3099b.c();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        j5k.e.d.a.b.AbstractC3099b abstractC3099b = this.d;
        return ((hashCode2 ^ (abstractC3099b != null ? abstractC3099b.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return h5s.c(this.e, "}", sb);
    }
}
