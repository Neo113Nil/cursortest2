package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class dc81 implements tp81 {
    public final String a;
    public final ld71 b;
    public final ArrayList c;

    public dc81(String str, ld71 ld71Var, ArrayList arrayList) {
        this.a = str;
        this.b = ld71Var;
        this.c = arrayList;
    }

    @Override // defpackage.xh71
    public final String a() {
        return this.a;
    }

    @Override // defpackage.tp81
    public final ArrayList b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc81)) {
            return false;
        }
        dc81 dc81Var = (dc81) obj;
        return this.a.equals(dc81Var.a) && this.b.equals(dc81Var.b) && this.c.equals(dc81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivKitAdtuneAction(actionType=");
        sb.append(this.a);
        sb.append(", design=");
        sb.append(this.b);
        sb.append(", trackingUrls=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
