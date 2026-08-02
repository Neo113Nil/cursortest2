package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gi5 extends keo {
    public final String c;

    public gi5(String str) {
        super("webview_post_message", g8e.z("type", str));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi5) && jl40.l(this.c, ((gi5) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("PostMessage(type=", this.c, Extension.C_BRAKE);
    }
}
