package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class mvz0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvz0) && y7m.b(16.0f, 16.0f) && y7m.b(12.0f, 12.0f) && y7m.b(24.0f, 24.0f) && y7m.b(8.0f, 8.0f);
    }

    public final int hashCode() {
        return Float.hashCode(8.0f) + g8e.c(24.0f, g8e.c(12.0f, Float.hashCode(16.0f) * 31, 31), 31);
    }

    public final String toString() {
        String c = y7m.c(16.0f);
        String c2 = y7m.c(12.0f);
        return g8e.r(b64.v("TooltipProperties(horizontalPadding=", c, ", backgroundCornerRadius=", c2, ", pointerWidth="), y7m.c(24.0f), ", pointerHeight=", y7m.c(8.0f), Extension.C_BRAKE);
    }
}
