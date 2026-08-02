package defpackage;

import android.content.Intent;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class frt0 {
    public final int a;
    public final Intent b;

    public frt0(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frt0)) {
            return false;
        }
        frt0 frt0Var = (frt0) obj;
        return this.a == frt0Var.a && jl40.l(this.b, frt0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Intent intent = this.b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "SplashResult(resultCode=" + this.a + ", intent=" + this.b + Extension.C_BRAKE;
    }
}
