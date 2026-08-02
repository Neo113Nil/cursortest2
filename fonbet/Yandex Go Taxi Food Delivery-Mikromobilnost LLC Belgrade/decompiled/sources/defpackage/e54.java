package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes11.dex */
public final class e54 extends c3f.e.d.a.b.AbstractC0020e.AbstractC0021a {
    public String a;
    public int b;
    public List c;
    public byte d;

    public final f54 a() {
        String str;
        List list;
        if (this.d == 1 && (str = this.a) != null && (list = this.c) != null) {
            return new f54(str, this.b, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if ((1 & this.d) == 0) {
            sb.append(" importance");
        }
        if (this.c == null) {
            sb.append(" frames");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final e54 b(List list) {
        if (list != null) {
            this.c = list;
            return this;
        }
        ny61.t("Null frames");
        return null;
    }

    public final e54 c(int i) {
        this.b = i;
        this.d = (byte) (this.d | 1);
        return this;
    }

    public final e54 d(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        ny61.t("Null name");
        return null;
    }
}
