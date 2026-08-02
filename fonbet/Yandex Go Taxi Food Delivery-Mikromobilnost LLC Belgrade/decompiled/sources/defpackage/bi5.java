package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bi5 extends keo {
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bi5(String str) {
        super("webview_new_tab", r0.j());
        MapBuilder y = qv10.y("type", "bdui_webview");
        if (str != null) {
            y.put("url", str);
        }
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi5) && jl40.l(this.c, ((bi5) obj).c);
    }

    public final int hashCode() {
        String str = this.c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("NewTab(url=", this.c, Extension.C_BRAKE);
    }
}
