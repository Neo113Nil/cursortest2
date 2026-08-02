package defpackage;

import com.yandex.quark.contracts.theme.ThemeMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class pnh {
    public final n4u0 a;

    public pnh() {
        this(bvf0.c(ThemeMode.AutoSwitch));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnh) && jl40.l(this.a, ((pnh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultWebChatUiThemeArgs(themeMode=" + this.a + Extension.C_BRAKE;
    }

    public pnh(n4u0 n4u0Var) {
        this.a = n4u0Var;
    }
}
