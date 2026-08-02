package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jr {
    public final String a;

    public /* synthetic */ jr(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return oyr.p("Action(action=", str, Extension.C_BRAKE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jr) {
            return jl40.l(this.a, ((jr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
