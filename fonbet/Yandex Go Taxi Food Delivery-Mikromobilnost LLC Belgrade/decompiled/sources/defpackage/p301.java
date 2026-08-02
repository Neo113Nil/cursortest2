package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class p301 {
    public final n301 a;
    public final ArrayList b;

    public p301(n301 n301Var, ArrayList arrayList) {
        this.a = n301Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p301)) {
            return false;
        }
        p301 p301Var = (p301) obj;
        return this.a.equals(p301Var.a) && this.b.equals(p301Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackingCardCircleTimelineUiState(image=" + this.a + ", stroke=" + this.b + Extension.C_BRAKE;
    }
}
