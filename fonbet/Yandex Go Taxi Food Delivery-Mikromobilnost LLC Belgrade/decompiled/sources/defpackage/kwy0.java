package defpackage;

import com.yandex.messaging.ui.settings.theme.ThemeVariant;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class kwy0 {
    public final ThemeVariant a;
    public final boolean b;

    public kwy0(ThemeVariant themeVariant, boolean z) {
        this.a = themeVariant;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwy0)) {
            return false;
        }
        kwy0 kwy0Var = (kwy0) obj;
        return this.a == kwy0Var.a && this.b == kwy0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + ((this.a.hashCode() + (Boolean.hashCode(false) * 31)) * 31);
    }

    public final String toString() {
        return "ThemeSettingsUiState(showThemeSettingsButton=false, selectedTheme=" + this.a + ", showThemeDialog=" + this.b + Extension.C_BRAKE;
    }
}
