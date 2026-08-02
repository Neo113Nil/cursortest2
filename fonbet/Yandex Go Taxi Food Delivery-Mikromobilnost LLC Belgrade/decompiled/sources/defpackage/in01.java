package defpackage;

import com.ybsdk.feature.transfer.version2.api.CrossBorderScenario;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.PhonePlaceholder;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.PhoneSelectionScenario;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class in01 {
    public final u8j0 a;
    public final u8j0 b;
    public final u8j0 c;
    public final String d;
    public final hn01 e;
    public final String f;
    public final u8j0 g;
    public final u8j0 h;
    public final PhonePlaceholder i;
    public final br51 j;
    public final PhoneSelectionScenario k;
    public final String l;
    public final CrossBorderScenario m;

    public /* synthetic */ in01(PhoneSelectionScenario phoneSelectionScenario, String str, CrossBorderScenario crossBorderScenario, int i) {
        this(new t8j0(), new t8j0(), null, null, null, "", new t8j0(), new t8j0(), PhonePlaceholder.PHONE_ONLY, null, (i & 1024) != 0 ? PhoneSelectionScenario.REGULAR : phoneSelectionScenario, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? CrossBorderScenario.PARTNER : crossBorderScenario);
    }

    public static in01 a(in01 in01Var, u8j0 u8j0Var, u8j0 u8j0Var2, u8j0 u8j0Var3, String str, hn01 hn01Var, String str2, u8j0 u8j0Var4, u8j0 u8j0Var5, PhonePlaceholder phonePlaceholder, br51 br51Var, int i) {
        u8j0 u8j0Var6 = (i & 1) != 0 ? in01Var.a : u8j0Var;
        u8j0 u8j0Var7 = (i & 2) != 0 ? in01Var.b : u8j0Var2;
        u8j0 u8j0Var8 = (i & 4) != 0 ? in01Var.c : u8j0Var3;
        String str3 = (i & 8) != 0 ? in01Var.d : str;
        hn01 hn01Var2 = (i & 16) != 0 ? in01Var.e : hn01Var;
        String str4 = (i & 32) != 0 ? in01Var.f : str2;
        u8j0 u8j0Var9 = (i & 64) != 0 ? in01Var.g : u8j0Var4;
        u8j0 u8j0Var10 = (i & 128) != 0 ? in01Var.h : u8j0Var5;
        PhonePlaceholder phonePlaceholder2 = (i & 256) != 0 ? in01Var.i : phonePlaceholder;
        br51 br51Var2 = (i & 512) != 0 ? in01Var.j : br51Var;
        PhoneSelectionScenario phoneSelectionScenario = in01Var.k;
        String str5 = in01Var.l;
        CrossBorderScenario crossBorderScenario = in01Var.m;
        in01Var.getClass();
        return new in01(u8j0Var6, u8j0Var7, u8j0Var8, str3, hn01Var2, str4, u8j0Var9, u8j0Var10, phonePlaceholder2, br51Var2, phoneSelectionScenario, str5, crossBorderScenario);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in01)) {
            return false;
        }
        in01 in01Var = (in01) obj;
        return jl40.l(this.a, in01Var.a) && jl40.l(this.b, in01Var.b) && jl40.l(this.c, in01Var.c) && jl40.l(this.d, in01Var.d) && jl40.l(this.e, in01Var.e) && jl40.l(this.f, in01Var.f) && jl40.l(this.g, in01Var.g) && jl40.l(this.h, in01Var.h) && this.i == in01Var.i && jl40.l(this.j, in01Var.j) && this.k == in01Var.k && jl40.l(this.l, in01Var.l) && this.m == in01Var.m;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        u8j0 u8j0Var = this.c;
        int hashCode2 = (hashCode + (u8j0Var == null ? 0 : u8j0Var.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        hn01 hn01Var = this.e;
        int hashCode4 = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + unr0.b((hashCode3 + (hn01Var == null ? 0 : hn01Var.hashCode())) * 31, 31, this.f)) * 31)) * 31)) * 31;
        br51 br51Var = this.j;
        int hashCode5 = (this.k.hashCode() + ((hashCode4 + (br51Var == null ? 0 : br51Var.hashCode())) * 31)) * 31;
        String str2 = this.l;
        return this.m.hashCode() + ((hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TransferPhoneInputState(history=" + this.a + ", contacts=" + this.b + ", ybs=" + this.c + ", transferId=" + this.d + ", selectedPhone=" + this.e + ", filterText=" + this.f + ", copiedNumber=" + this.g + ", myselfNumber=" + this.h + ", placeholder=" + this.i + ", errorInfo=" + this.j + ", phoneSelectionScenario=" + this.k + ", title=" + this.l + ", crossBorderScenario=" + this.m + Extension.C_BRAKE;
    }

    public in01(u8j0 u8j0Var, u8j0 u8j0Var2, u8j0 u8j0Var3, String str, hn01 hn01Var, String str2, u8j0 u8j0Var4, u8j0 u8j0Var5, PhonePlaceholder phonePlaceholder, br51 br51Var, PhoneSelectionScenario phoneSelectionScenario, String str3, CrossBorderScenario crossBorderScenario) {
        this.a = u8j0Var;
        this.b = u8j0Var2;
        this.c = u8j0Var3;
        this.d = str;
        this.e = hn01Var;
        this.f = str2;
        this.g = u8j0Var4;
        this.h = u8j0Var5;
        this.i = phonePlaceholder;
        this.j = br51Var;
        this.k = phoneSelectionScenario;
        this.l = str3;
        this.m = crossBorderScenario;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public in01() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191);
    }
}
