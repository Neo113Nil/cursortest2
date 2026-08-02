package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hi5 extends keo {
    public final String c;

    public hi5(String str) {
        super("webview_closed", b.i(new Pair("type", "bdui_webview"), new Pair("url", str)));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi5) && jl40.l(this.c, ((hi5) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("WebViewClosed(url=", this.c, Extension.C_BRAKE);
    }
}
