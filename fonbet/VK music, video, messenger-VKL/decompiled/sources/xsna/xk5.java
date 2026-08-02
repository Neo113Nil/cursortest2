package xsna;

import androidx.annotation.NonNull;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* loaded from: classes.dex */
public final class xk5 extends j5k.a.AbstractC3094a {
    public final String a;
    public final String b;
    public final String c;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    /* loaded from: classes13.dex */
    public static final class a extends j5k.a.AbstractC3094a.AbstractC3095a {
        public String a;
        public String b;
        public String c;

        public final xk5 a() {
            String str;
            String str2;
            String str3 = this.a;
            if (str3 != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new xk5(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" arch");
            }
            if (this.b == null) {
                sb.append(" libraryName");
            }
            if (this.c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }

        public final a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.a = str;
            return this;
        }

        public final a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.c = str;
            return this;
        }

        public final a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.b = str;
            return this;
        }
    }

    public xk5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // xsna.j5k.a.AbstractC3094a
    @NonNull
    public final String a() {
        return this.a;
    }

    @Override // xsna.j5k.a.AbstractC3094a
    @NonNull
    public final String b() {
        return this.c;
    }

    @Override // xsna.j5k.a.AbstractC3094a
    @NonNull
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.a.AbstractC3094a)) {
            return false;
        }
        j5k.a.AbstractC3094a abstractC3094a = (j5k.a.AbstractC3094a) obj;
        return this.a.equals(abstractC3094a.a()) && this.b.equals(abstractC3094a.c()) && this.c.equals(abstractC3094a.b());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return i5s.a(sb, this.c, "}");
    }
}
