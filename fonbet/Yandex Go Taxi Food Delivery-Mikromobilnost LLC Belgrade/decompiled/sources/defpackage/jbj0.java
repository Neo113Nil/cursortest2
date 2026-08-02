package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljbj0;", "", "Companion", "hbj0", "ibj0", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class jbj0 {
    public static final ibj0 Companion = new ibj0();
    public final kcj0 a;

    public /* synthetic */ jbj0(int i, kcj0 kcj0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = kcj0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbj0) && jl40.l(this.a, ((jbj0) obj).a);
    }

    public final int hashCode() {
        kcj0 kcj0Var = this.a;
        if (kcj0Var == null) {
            return 0;
        }
        return kcj0Var.hashCode();
    }

    public final String toString() {
        return "RequirementActionsDto(addressInput=" + this.a + Extension.C_BRAKE;
    }

    public jbj0() {
        this.a = null;
    }
}
