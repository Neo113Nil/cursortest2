package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class di5 extends keo {
    public final String c;

    public di5(String str) {
        super("webview_page_load_finished", b.i(new Pair("url", str), new Pair("type", "bdui_webview")));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof di5) && jl40.l(this.c, ((di5) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("PageLoadFinished(url=", this.c, Extension.C_BRAKE);
    }
}
