package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes10.dex */
public final class o801 {
    public static final n801 Companion = new n801();
    public final String a;

    public /* synthetic */ o801(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o801) {
            return jl40.l(this.a, ((o801) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TrackingsScreen(name=", this.a, Extension.C_BRAKE);
    }
}
