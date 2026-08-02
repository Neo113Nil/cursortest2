package defpackage;

import android.content.Intent;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ov90 {
    public final int a;
    public final Intent b;

    public ov90(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov90)) {
            return false;
        }
        ov90 ov90Var = (ov90) obj;
        return this.a == ov90Var.a && jl40.l(this.b, ov90Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Intent intent = this.b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "PaymentActivityResult(resultCode=" + this.a + ", intent=" + this.b + Extension.C_BRAKE;
    }
}
