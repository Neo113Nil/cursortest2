package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ci5 extends keo {
    public final Exception c;
    public final String d;

    public ci5(Exception exc, String str) {
        super("webview_page_load_error", b.i(new Pair("url", str), new Pair("error", exc.toString()), new Pair("type", "bdui_webview")));
        this.c = exc;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci5)) {
            return false;
        }
        ci5 ci5Var = (ci5) obj;
        return jl40.l(this.c, ci5Var.c) && jl40.l(this.d, ci5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "PageLoadError(error=" + this.c + ", url=" + this.d + Extension.C_BRAKE;
    }
}
