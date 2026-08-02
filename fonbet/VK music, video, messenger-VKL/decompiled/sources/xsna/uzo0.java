package xsna;

import com.vk.dto.common.VerifyInfo;

/* compiled from: TitleState.kt */
/* loaded from: classes16.dex */
public final class uzo0 {
    public final hbo0 a;
    public final VerifyInfo b;
    public final boolean c;

    public uzo0(hbo0 hbo0Var, VerifyInfo verifyInfo, boolean z, int i) {
        verifyInfo = (i & 2) != 0 ? null : verifyInfo;
        z = (i & 4) != 0 ? false : z;
        this.a = hbo0Var;
        this.b = verifyInfo;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzo0)) {
            return false;
        }
        uzo0 uzo0Var = (uzo0) obj;
        return epx.f(this.a, uzo0Var.a) && epx.f(this.b, uzo0Var.b) && this.c == uzo0Var.c;
    }

    public final int hashCode() {
        hbo0 hbo0Var = this.a;
        int hashCode = (hbo0Var == null ? 0 : hbo0Var.hashCode()) * 31;
        VerifyInfo verifyInfo = this.b;
        return Boolean.hashCode(false) + qoy.b(qoy.b(qoy.b((hashCode + (verifyInfo == null ? 0 : verifyInfo.hashCode())) * 31, 31, this.c), 31, false), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleState(text=");
        sb.append(this.a);
        sb.append(", showVerified=");
        sb.append(this.b);
        sb.append(", showMuted=");
        return n23.b(sb, this.c, ", showDropDown=false, showCasper=false, showWritingDisabled=false)");
    }
}
