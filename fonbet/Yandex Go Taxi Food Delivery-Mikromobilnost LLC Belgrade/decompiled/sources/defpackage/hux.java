package defpackage;

import android.content.Context;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class hux {
    public final rbv a;
    public final rbv b;

    public hux(rbv rbvVar, rbv rbvVar2) {
        this.a = rbvVar;
        this.b = rbvVar2;
    }

    public final rbv a(Context context) {
        return lob1.f(context) ? this.b : this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hux)) {
            return false;
        }
        hux huxVar = (hux) obj;
        return jl40.l(this.a, huxVar.a) && jl40.l(this.b, huxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LateInitImageCallbackImpl(lightThemeImage=" + this.a + ", darkThemeImage=" + this.b + Extension.C_BRAKE;
    }
}
