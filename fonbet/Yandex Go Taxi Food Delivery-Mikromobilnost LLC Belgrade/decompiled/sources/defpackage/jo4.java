package defpackage;

import com.ybsdk.core.common.data.network.dto.Themes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jo4 {
    public final zhc a;
    public final Themes b;

    public jo4(zhc zhcVar, Themes themes) {
        this.a = zhcVar;
        this.b = themes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo4)) {
            return false;
        }
        jo4 jo4Var = (jo4) obj;
        return this.a.equals(jo4Var.a) && jl40.l(this.b, jo4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Themes themes = this.b;
        return hashCode + (themes == null ? 0 : themes.hashCode());
    }

    public final String toString() {
        return "BalanceItemEntity(coloredText=" + this.a + ", themedImage=" + this.b + Extension.C_BRAKE;
    }
}
