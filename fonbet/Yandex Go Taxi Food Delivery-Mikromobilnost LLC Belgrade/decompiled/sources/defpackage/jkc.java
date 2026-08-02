package defpackage;

import com.ybsdk.core.navigation.cicerone.Screen;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class jkc implements dlc {
    public final Screen a;

    public jkc(Screen screen) {
        this.a = screen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jkc) && jl40.l(this.a, ((jkc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Replace(", this.a.getScreenKey(), Extension.C_BRAKE);
    }
}
