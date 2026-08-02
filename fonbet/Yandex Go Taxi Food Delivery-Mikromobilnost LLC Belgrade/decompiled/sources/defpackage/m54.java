package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class m54 extends c3f.e.d.AbstractC0025d.a {
    public String a;

    public final n54 a() {
        String str = this.a;
        if (str != null) {
            return new n54(str);
        }
        ny61.r("Missing required properties: content");
        return null;
    }

    public final m54 b(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        ny61.t("Null content");
        return null;
    }
}
