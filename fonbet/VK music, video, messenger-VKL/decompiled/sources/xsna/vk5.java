package xsna;

import java.io.File;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* loaded from: classes13.dex */
public final class vk5 extends u5k {
    public final uk5 a;
    public final String b;
    public final File c;

    public vk5(uk5 uk5Var, String str, File file) {
        this.a = uk5Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.c = file;
    }

    @Override // xsna.u5k
    public final j5k b() {
        return this.a;
    }

    @Override // xsna.u5k
    public final File c() {
        return this.c;
    }

    @Override // xsna.u5k
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u5k)) {
            return false;
        }
        u5k u5kVar = (u5k) obj;
        return this.a.equals(u5kVar.b()) && this.b.equals(u5kVar.d()) && this.c.equals(u5kVar.c());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
