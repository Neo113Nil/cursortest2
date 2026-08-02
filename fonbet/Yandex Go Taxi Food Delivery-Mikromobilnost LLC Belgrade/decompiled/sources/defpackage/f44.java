package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class f44 extends c3f.c.a {
    public String a;
    public String b;

    public final g44 a() {
        String str;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new g44(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" key");
        }
        if (this.b == null) {
            sb.append(" value");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final f44 b(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        ny61.t("Null key");
        return null;
    }

    public final f44 c(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        ny61.t("Null value");
        return null;
    }
}
