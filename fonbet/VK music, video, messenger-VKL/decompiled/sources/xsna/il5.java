package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes.dex */
public final class il5 extends j5k.e.d.a.b.AbstractC3098a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public il5(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3098a
    @NonNull
    public final long a() {
        return this.a;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3098a
    @NonNull
    public final String b() {
        return this.c;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3098a
    public final long c() {
        return this.b;
    }

    @Override // xsna.j5k.e.d.a.b.AbstractC3098a
    @Nullable
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.a.b.AbstractC3098a)) {
            return false;
        }
        j5k.e.d.a.b.AbstractC3098a abstractC3098a = (j5k.e.d.a.b.AbstractC3098a) obj;
        if (this.a != abstractC3098a.a() || this.b != abstractC3098a.c() || !this.c.equals(abstractC3098a.b())) {
            return false;
        }
        String str = this.d;
        return str == null ? abstractC3098a.d() == null : str.equals(abstractC3098a.d());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return i5s.a(sb, this.d, "}");
    }
}
