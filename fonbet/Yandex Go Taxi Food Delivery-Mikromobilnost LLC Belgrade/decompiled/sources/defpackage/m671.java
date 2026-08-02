package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class m671 implements tp81 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ArrayList e;

    public m671(String str, String str2, String str3, boolean z, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = arrayList;
    }

    @Override // defpackage.xh71
    public final String a() {
        return this.a;
    }

    @Override // defpackage.tp81
    public final ArrayList b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m671)) {
            return false;
        }
        m671 m671Var = (m671) obj;
        return this.a.equals(m671Var.a) && this.b.equals(m671Var.b) && this.c.equals(m671Var.c) && this.d == m671Var.d && this.e.equals(m671Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("AdtuneAction(actionType=", this.a, ", adtuneUrl=", this.b, ", optOutUrl=");
        tse0.y(this.c, ", darkTheme=", ", trackingUrls=", v, this.d);
        return b64.n(Extension.C_BRAKE, v, this.e);
    }
}
