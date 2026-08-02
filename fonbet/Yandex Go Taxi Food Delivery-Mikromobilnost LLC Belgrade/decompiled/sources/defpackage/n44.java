package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class n44 extends c3f.e.a.AbstractC0012a {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public final o44 a() {
        String str;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new o44(str2, str, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" identifier");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }
}
