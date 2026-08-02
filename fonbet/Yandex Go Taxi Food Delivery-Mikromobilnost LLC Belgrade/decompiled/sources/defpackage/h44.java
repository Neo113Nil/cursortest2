package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes11.dex */
public final class h44 extends c3f.d.a {
    public List a;
    public String b;

    public final i44 a() {
        List list = this.a;
        if (list != null) {
            return new i44(list, this.b);
        }
        ny61.r("Missing required properties: files");
        return null;
    }

    public final h44 b(List list) {
        if (list != null) {
            this.a = list;
            return this;
        }
        ny61.t("Null files");
        return null;
    }

    public final h44 c(String str) {
        this.b = str;
        return this;
    }
}
