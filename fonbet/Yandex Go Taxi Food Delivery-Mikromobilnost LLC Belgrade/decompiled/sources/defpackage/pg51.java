package defpackage;

import com.ybsdk.api.YBSdkVisualParams;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class pg51 {
    public final jg51 a;
    public final YBSdkVisualParams b;

    public /* synthetic */ pg51(jg51 jg51Var) {
        this(jg51Var, new YBSdkVisualParams(false, false, false, null, null, null, 63, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg51)) {
            return false;
        }
        pg51 pg51Var = (pg51) obj;
        return jl40.l(this.a, pg51Var.a) && jl40.l(this.b, pg51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YBSdkDependencies(accountFacade=" + this.a + ", visualParams=" + this.b + Extension.C_BRAKE;
    }

    public pg51(jg51 jg51Var, YBSdkVisualParams yBSdkVisualParams) {
        this.a = jg51Var;
        this.b = yBSdkVisualParams;
    }
}
