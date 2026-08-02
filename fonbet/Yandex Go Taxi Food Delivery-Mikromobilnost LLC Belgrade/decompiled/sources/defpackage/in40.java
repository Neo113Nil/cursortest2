package defpackage;

import com.yandex.go.tariffcard.ui.MultiTariffOption$Subtitle$SubtitleType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class in40 {
    public final String a;
    public final MultiTariffOption$Subtitle$SubtitleType b;

    public in40(String str, MultiTariffOption$Subtitle$SubtitleType multiTariffOption$Subtitle$SubtitleType) {
        this.a = str;
        this.b = multiTariffOption$Subtitle$SubtitleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in40)) {
            return false;
        }
        in40 in40Var = (in40) obj;
        return jl40.l(this.a, in40Var.a) && this.b == in40Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subtitle(text=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
