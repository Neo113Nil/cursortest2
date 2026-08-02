package defpackage;

import flex.theme.ThemedColor;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ex40 extends ThemedColor {
    public final LinkedHashMap a;

    public ex40(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
        if (linkedHashMap.isEmpty()) {
            ny61.g("There is no any color passed.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ex40.class.equals(obj != null ? obj.getClass() : null) && this.a.equals(((ex40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultipleThemedColor(values=" + this.a + Extension.C_BRAKE;
    }
}
