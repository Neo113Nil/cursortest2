package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class n6 {
    public final ArrayList a;
    public final rbv b;
    public final Text c;

    public n6(ArrayList arrayList, lbv lbvVar, Text text) {
        this.a = arrayList;
        this.b = lbvVar;
        this.c = text;
    }

    public final List a() {
        return this.a;
    }

    public final rbv b() {
        return this.b;
    }

    public final Text c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return this.a.equals(n6Var.a) && jl40.l(this.b, n6Var.b) && jl40.l(this.c, n6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbv rbvVar = this.b;
        int hashCode2 = (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        Text text = this.c;
        return hashCode2 + (text != null ? text.hashCode() : 0);
    }

    public final String toString() {
        return "AboutViewState(aboutItems=" + this.a + ", coinImageModel=" + this.b + ", versionInfo=" + this.c + Extension.C_BRAKE;
    }
}
