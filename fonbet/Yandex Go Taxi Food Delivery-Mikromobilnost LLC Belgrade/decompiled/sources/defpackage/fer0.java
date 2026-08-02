package defpackage;

import com.ybsdk.feature.settings.api.SettingsTheme;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fer0 implements e9r0 {
    public final String a;
    public final SettingsTheme b;

    public fer0(String str, SettingsTheme settingsTheme) {
        this.a = str;
        this.b = settingsTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fer0)) {
            return false;
        }
        fer0 fer0Var = (fer0) obj;
        return jl40.l(this.a, fer0Var.a) && this.b == fer0Var.b;
    }

    @Override // defpackage.e9r0
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SettingsThemeViewItem(key=" + this.a + ", currentTheme=" + this.b + Extension.C_BRAKE;
    }
}
