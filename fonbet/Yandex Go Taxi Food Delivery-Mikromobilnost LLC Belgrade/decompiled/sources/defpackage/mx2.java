package defpackage;

import com.yandex.go.settings.presentation.models.AppSettingsTransitionMode;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mx2 {
    public final AppSettingsTransitionMode a;
    public final List b;
    public final lx2 c;

    public mx2(AppSettingsTransitionMode appSettingsTransitionMode, List list, lx2 lx2Var) {
        this.a = appSettingsTransitionMode;
        this.b = list;
        this.c = lx2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx2)) {
            return false;
        }
        mx2 mx2Var = (mx2) obj;
        return this.a == mx2Var.a && jl40.l(this.b, mx2Var.b) && jl40.l(this.c, mx2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AppSettingsUiState(transitionMode=" + this.a + ", frames=" + this.b + ", metadata=" + this.c + Extension.C_BRAKE;
    }
}
