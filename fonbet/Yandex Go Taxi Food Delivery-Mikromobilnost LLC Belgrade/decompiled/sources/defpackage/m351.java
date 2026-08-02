package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class m351 extends keo {
    public final String c;

    public m351(String str) {
        super("widget_success_loading", g8e.z("widget_type", str));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m351) && jl40.l(this.c, ((m351) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("WidgetLoadingSuccess(widgetType=", this.c, Extension.C_BRAKE);
    }
}
