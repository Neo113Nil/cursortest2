package defpackage;

import android.content.Intent;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dzj0 {
    public final int a;
    public final int b;
    public final Intent c;

    public dzj0(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzj0)) {
            return false;
        }
        dzj0 dzj0Var = (dzj0) obj;
        return this.a == dzj0Var.a && this.b == dzj0Var.b && this.c.equals(dzj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ResultData(requestCode=", ", resultCode=", ", data=");
        s.append(this.c);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
