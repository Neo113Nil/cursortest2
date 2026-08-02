package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l6n extends n351 {
    public final float c;

    public l6n(float f) {
        super("dynamic-content-separator-key", false, 14);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6n) && y7m.b(this.c, ((l6n) obj).c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return oyr.p("DynamicContentSeparatorModel(paddingTop=", y7m.c(this.c), Extension.C_BRAKE);
    }
}
