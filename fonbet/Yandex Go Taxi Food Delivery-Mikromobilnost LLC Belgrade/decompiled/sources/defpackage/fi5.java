package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fi5 extends keo {
    public final Integer c;
    public final String d;

    public fi5(Integer num, String str) {
        super("webview_page_size", b.i(new Pair("page_size", (num == null || (r0 = num.toString()) == null) ? "unknown" : r0), new Pair("url", str), new Pair("type", "bdui_webview")));
        String num2;
        this.c = num;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi5)) {
            return false;
        }
        fi5 fi5Var = (fi5) obj;
        return jl40.l(this.c, fi5Var.c) && jl40.l(this.d, fi5Var.d);
    }

    public final int hashCode() {
        Integer num = this.c;
        return this.d.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "PageSize(size=" + this.c + ", url=" + this.d + Extension.C_BRAKE;
    }
}
