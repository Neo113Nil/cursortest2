package defpackage;

import flex.theme.ThemedColor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class his0 extends ThemedColor {
    public final String a;

    public his0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return his0.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((his0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SingleThemedColor(value=", this.a, Extension.C_BRAKE);
    }
}
