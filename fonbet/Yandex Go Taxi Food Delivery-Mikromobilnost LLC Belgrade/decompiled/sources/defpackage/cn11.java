package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupType;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cn11 {
    public final boolean a;
    public final AutoTopupType b;
    public final String c;
    public final List d;

    public cn11(boolean z, AutoTopupType autoTopupType, String str, ArrayList arrayList) {
        this.a = z;
        this.b = autoTopupType;
        this.c = str;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn11)) {
            return false;
        }
        cn11 cn11Var = (cn11) obj;
        return this.a == cn11Var.a && this.b == cn11Var.b && jl40.l(this.c, cn11Var.c) && jl40.l(this.d, cn11Var.d);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
        List list = this.d;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSettingEntity(selected=");
        sb.append(this.a);
        sb.append(", autotopupType=");
        sb.append(this.b);
        sb.append(", title=");
        return tse0.j(this.c, ", moneyFields=", Extension.C_BRAKE, sb, this.d);
    }
}
