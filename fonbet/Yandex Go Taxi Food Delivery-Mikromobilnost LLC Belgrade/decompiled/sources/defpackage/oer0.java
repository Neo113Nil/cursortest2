package defpackage;

import com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation.MainMenuLogOutUiState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class oer0 {
    public final zdr0 a;
    public final r8r0 b;
    public final a8h c;
    public final p3g0 d;
    public final boolean e;
    public final MainMenuLogOutUiState f;
    public final String g;
    public final boolean h;
    public final ner0 i;
    public final boolean j;

    public oer0(zdr0 zdr0Var, r8r0 r8r0Var, a8h a8hVar, p3g0 p3g0Var, boolean z, MainMenuLogOutUiState mainMenuLogOutUiState, String str, boolean z2, ner0 ner0Var, boolean z3) {
        this.a = zdr0Var;
        this.b = r8r0Var;
        this.c = a8hVar;
        this.d = p3g0Var;
        this.e = z;
        this.f = mainMenuLogOutUiState;
        this.g = str;
        this.h = z2;
        this.i = ner0Var;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oer0)) {
            return false;
        }
        oer0 oer0Var = (oer0) obj;
        return jl40.l(this.a, oer0Var.a) && jl40.l(this.b, oer0Var.b) && jl40.l(this.c, oer0Var.c) && jl40.l(this.d, oer0Var.d) && this.e == oer0Var.e && this.f == oer0Var.f && jl40.l(this.g, oer0Var.g) && this.h == oer0Var.h && this.i.equals(oer0Var.i) && this.j == oer0Var.j;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        a8h a8hVar = this.c;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + unr0.e(unr0.e(unr0.b((this.f.hashCode() + unr0.e((this.d.hashCode() + ((hashCode + (a8hVar == null ? 0 : a8hVar.hashCode())) * 31)) * 31, 31, this.e)) * 31, 31, this.g), 31, true), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsUiState(style=");
        sb.append(this.a);
        sb.append(", theme=");
        sb.append(this.b);
        sb.append(", callType=");
        sb.append(this.c);
        sb.append(", pushSettings=");
        sb.append(this.d);
        sb.append(", liveLocationEnabled=");
        sb.append(this.e);
        sb.append(", logout=");
        sb.append(this.f);
        sb.append(", logoutInfoText=");
        tse0.y(this.g, ", trafficVisible=true, dontCallVisible=", ", inAppOnlyToggleModel=", sb, this.h);
        sb.append(this.i);
        sb.append(", notificationsEnabledInSystem=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
