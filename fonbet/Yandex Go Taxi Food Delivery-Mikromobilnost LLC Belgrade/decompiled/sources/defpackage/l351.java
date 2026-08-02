package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class l351 extends keo {
    public final String c;

    public l351(String str) {
        super("widget_failed_loading", g8e.z("widget_type", str));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l351) && jl40.l(this.c, ((l351) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("WidgetLoadingFailure(widgetType=", this.c, Extension.C_BRAKE);
    }
}
