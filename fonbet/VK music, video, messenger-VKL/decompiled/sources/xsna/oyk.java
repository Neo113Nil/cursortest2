package xsna;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class oyk implements nyk {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // xsna.nyk
    public final String a(Long l, Locale locale) {
        return yz8.a(l.longValue(), "yMMMM", locale, this.a);
    }

    @Override // xsna.nyk
    public final String b(Long l, Locale locale, boolean z) {
        if (l == null) {
            return null;
        }
        return yz8.a(l.longValue(), z ? "yMMMMEEEEd" : "yMMMd", locale, this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oyk)) {
            return false;
        }
        ((oyk) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 436998964;
    }
}
