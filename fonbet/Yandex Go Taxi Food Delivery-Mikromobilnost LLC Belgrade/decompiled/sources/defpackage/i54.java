package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class i54 extends c3f.e.d.a.c.AbstractC0024a {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final j54 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new j54(str, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }
}
