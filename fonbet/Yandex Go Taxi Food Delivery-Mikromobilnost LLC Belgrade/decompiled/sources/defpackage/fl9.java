package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fl9 {
    public final ArrayList a;
    public final String b;

    public fl9(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl9)) {
            return false;
        }
        fl9 fl9Var = (fl9) obj;
        return this.a.equals(fl9Var.a) && jl40.l(this.b, fl9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TabsConfig(modes=" + this.a + ", selectedModeId=" + this.b + Extension.C_BRAKE;
    }
}
