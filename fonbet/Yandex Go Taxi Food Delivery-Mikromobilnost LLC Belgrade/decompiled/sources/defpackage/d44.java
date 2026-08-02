package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class d44 extends c3f.a.AbstractC0010a.AbstractC0011a {
    public String a;
    public String b;
    public String c;

    public final e44 a() {
        String str;
        String str2;
        String str3 = this.a;
        if (str3 != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new e44(str3, str, str2);
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
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final d44 b(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        ny61.t("Null arch");
        return null;
    }

    public final d44 c(String str) {
        if (str != null) {
            this.c = str;
            return this;
        }
        ny61.t("Null buildId");
        return null;
    }

    public final d44 d(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        ny61.t("Null libraryName");
        return null;
    }
}
