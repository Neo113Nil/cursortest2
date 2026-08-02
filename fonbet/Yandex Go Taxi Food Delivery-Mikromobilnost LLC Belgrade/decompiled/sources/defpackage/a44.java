package defpackage;

import java.io.File;

/* loaded from: classes11.dex */
public final class a44 extends h3f {
    public final c3f a;
    public final String b;
    public final File c;

    public a44(c3f c3fVar, String str, File file) {
        if (c3fVar == null) {
            ny61.t("Null report");
            throw null;
        }
        this.a = c3fVar;
        if (str == null) {
            ny61.t("Null sessionId");
            throw null;
        }
        this.b = str;
        if (file != null) {
            this.c = file;
        } else {
            ny61.t("Null reportFile");
            throw null;
        }
    }

    @Override // defpackage.h3f
    public final c3f b() {
        return this.a;
    }

    @Override // defpackage.h3f
    public final File c() {
        return this.c;
    }

    @Override // defpackage.h3f
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h3f)) {
            return false;
        }
        h3f h3fVar = (h3f) obj;
        return this.a.equals(h3fVar.b()) && this.b.equals(h3fVar.d()) && this.c.equals(h3fVar.c());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
