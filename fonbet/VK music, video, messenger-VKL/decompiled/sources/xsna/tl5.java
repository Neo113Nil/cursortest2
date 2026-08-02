package xsna;

import androidx.annotation.NonNull;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes.dex */
public final class tl5 extends j5k.e.AbstractC3106e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    public static final class a extends j5k.e.AbstractC3106e.a {
        public int a;
        public String b;
        public String c;
        public boolean d;
        public byte e;

        public final tl5 a() {
            String str;
            String str2;
            if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
                return new tl5(this.a, str, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.b == null) {
                sb.append(" version");
            }
            if (this.c == null) {
                sb.append(" buildVersion");
            }
            if ((this.e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }
    }

    public tl5(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // xsna.j5k.e.AbstractC3106e
    @NonNull
    public final String a() {
        return this.c;
    }

    @Override // xsna.j5k.e.AbstractC3106e
    public final int b() {
        return this.a;
    }

    @Override // xsna.j5k.e.AbstractC3106e
    @NonNull
    public final String c() {
        return this.b;
    }

    @Override // xsna.j5k.e.AbstractC3106e
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.AbstractC3106e)) {
            return false;
        }
        j5k.e.AbstractC3106e abstractC3106e = (j5k.e.AbstractC3106e) obj;
        return this.a == abstractC3106e.b() && this.b.equals(abstractC3106e.c()) && this.c.equals(abstractC3106e.a()) && this.d == abstractC3106e.d();
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return n23.b(sb, this.d, "}");
    }
}
