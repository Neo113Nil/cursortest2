package defpackage;

import com.yandex.messaging.domain.statuses.StatusIconType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class pdr0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final StatusIconType n;
    public final boolean o;
    public final boolean p;

    public pdr0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str, String str2, StatusIconType statusIconType, boolean z11, boolean z12) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = str;
        this.m = str2;
        this.n = statusIconType;
        this.o = z11;
        this.p = z12;
    }

    public static pdr0 a(pdr0 pdr0Var, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, StatusIconType statusIconType, boolean z5, boolean z6, int i) {
        boolean z7 = (i & 1) != 0 ? pdr0Var.a : z;
        boolean z8 = pdr0Var.b;
        boolean z9 = pdr0Var.c;
        boolean z10 = (i & 8) != 0 ? pdr0Var.d : z2;
        pdr0Var.getClass();
        boolean z11 = pdr0Var.e;
        int i2 = pdr0Var.f;
        boolean z12 = pdr0Var.g;
        pdr0Var.getClass();
        boolean z13 = (i & 512) != 0 ? pdr0Var.h : z3;
        boolean z14 = (i & 1024) != 0 ? pdr0Var.i : z4;
        boolean z15 = pdr0Var.j;
        pdr0Var.getClass();
        boolean z16 = pdr0Var.k;
        String str3 = (i & 16384) != 0 ? pdr0Var.l : str;
        String str4 = (32768 & i) != 0 ? pdr0Var.m : str2;
        StatusIconType statusIconType2 = (65536 & i) != 0 ? pdr0Var.n : statusIconType;
        boolean z17 = (131072 & i) != 0 ? pdr0Var.o : z5;
        boolean z18 = (i & 262144) != 0 ? pdr0Var.p : z6;
        pdr0Var.getClass();
        return new pdr0(z7, z8, z9, z10, z11, i2, z12, z13, z14, z15, z16, str3, str4, statusIconType2, z17, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdr0)) {
            return false;
        }
        pdr0 pdr0Var = (pdr0) obj;
        return this.a == pdr0Var.a && this.b == pdr0Var.b && this.c == pdr0Var.c && this.d == pdr0Var.d && this.e == pdr0Var.e && this.f == pdr0Var.f && this.g == pdr0Var.g && this.h == pdr0Var.h && this.i == pdr0Var.i && this.j == pdr0Var.j && this.k == pdr0Var.k && jl40.l(this.l, pdr0Var.l) && jl40.l(this.m, pdr0Var.m) && this.n == pdr0Var.n && this.o == pdr0Var.o && this.p == pdr0Var.p;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(oyr.b(this.f, unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, false), 31, this.e), 31), 31, this.g), 31, false), 31, this.h), 31, this.i), 31, this.j), 31, true), 31, this.k);
        String str = this.l;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StatusIconType statusIconType = this.n;
        return Boolean.hashCode(this.p) + unr0.e((hashCode2 + (statusIconType != null ? statusIconType.hashCode() : 0)) * 31, 31, this.o);
    }

    public final String toString() {
        StringBuilder u = qv10.u("SettingsScreenUiState(compactModeIsChecked=", ", showFoldersSettings=", ", showPrivatePolicyButton=", this.a, this.b);
        nnm.v(", showLogoutButton=", ", showAboutAppButton=false, showContactsButton=", u, this.c, this.d);
        u.append(this.e);
        u.append(", supportChatButtonTextRes=");
        u.append(this.f);
        u.append(", showSupportChatButton=");
        nnm.v(", showDebugPanelButton=false, showLoginButton=", ", showInviteLinkButton=", u, this.g, this.h);
        nnm.v(", showCallsButton=", ", showNotificationsButton=true, showPhoneNumberButton=", u, this.i, this.j);
        unr0.A(", phoneNumber=", this.l, ", personalStatusText=", u, this.k);
        u.append(this.m);
        u.append(", personalStatusIconType=");
        u.append(this.n);
        u.append(", canShowSavedMessages=");
        return smw0.k(", isAuthorizedUser=", Extension.C_BRAKE, u, this.o, this.p);
    }
}
