package defpackage;

import android.os.SystemClock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class g790 {
    public final long a;
    public Long b;

    public g790(int i) {
        this.a = SystemClock.elapsedRealtime();
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g790)) {
            return false;
        }
        g790 g790Var = (g790) obj;
        return this.a == g790Var.a && jl40.l(this.b, g790Var.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "ChatMoments(chatLoadStarted=" + this.a + ", chatLoadFinished=" + this.b + Extension.C_BRAKE;
    }

    public g790() {
        this(0);
    }
}
