package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes11.dex */
public final class a54 extends c3f.e.d.a.b.c.AbstractC0017a {
    public String a;
    public String b;
    public List c;
    public c3f.e.d.a.b.c d;
    public int e;
    public byte f;

    public final b54 a() {
        String str;
        List list;
        if (this.f == 1 && (str = this.a) != null && (list = this.c) != null) {
            return new b54(str, this.b, list, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" frames");
        }
        if ((this.f & 1) == 0) {
            sb.append(" overflowCount");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final a54 b(c3f.e.d.a.b.c cVar) {
        this.d = cVar;
        return this;
    }

    public final a54 c(List list) {
        if (list != null) {
            this.c = list;
            return this;
        }
        ny61.t("Null frames");
        return null;
    }

    public final a54 d(int i) {
        this.e = i;
        this.f = (byte) (this.f | 1);
        return this;
    }

    public final a54 e(String str) {
        this.b = str;
        return this;
    }

    public final a54 f(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        ny61.t("Null type");
        return null;
    }
}
