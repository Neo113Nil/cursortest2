package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class c54 extends c3f.e.d.a.b.AbstractC0018d.AbstractC0019a {
    public String a;
    public String b;
    public long c;
    public byte d;

    public final d54 a() {
        String str;
        String str2;
        if (this.d == 1 && (str = this.a) != null && (str2 = this.b) != null) {
            return new d54(str, str2, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.b == null) {
            sb.append(" code");
        }
        if ((this.d & 1) == 0) {
            sb.append(" address");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final c54 b(long j) {
        this.c = j;
        this.d = (byte) (this.d | 1);
        return this;
    }

    public final c54 c(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        ny61.t("Null code");
        return null;
    }

    public final c54 d(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        ny61.t("Null name");
        return null;
    }
}
