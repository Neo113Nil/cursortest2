package defpackage;

import android.content.Intent;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ejm0 {
    public final Intent a;
    public final String b;
    public final String c;

    public ejm0(Intent intent, String str, String str2) {
        this.a = intent;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejm0)) {
            return false;
        }
        ejm0 ejm0Var = (ejm0) obj;
        return this.a.equals(ejm0Var.a) && this.b.equals(ejm0Var.b) && this.c.equals(ejm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenBankData(intent=");
        sb.append(this.a);
        sb.append(", scheme=");
        sb.append(this.b);
        sb.append(", urlTemplate=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
