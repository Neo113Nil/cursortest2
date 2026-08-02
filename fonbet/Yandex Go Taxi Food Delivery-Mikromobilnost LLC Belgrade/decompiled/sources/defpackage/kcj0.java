package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkcj0;", "", "Companion", "icj0", "jcj0", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class kcj0 {
    public static final jcj0 Companion = new jcj0();
    public final pcj0 a;

    public /* synthetic */ kcj0(int i, pcj0 pcj0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = pcj0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final pcj0 getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcj0) && jl40.l(this.a, ((kcj0) obj).a);
    }

    public final int hashCode() {
        pcj0 pcj0Var = this.a;
        if (pcj0Var == null) {
            return 0;
        }
        return pcj0Var.hashCode();
    }

    public final String toString() {
        return "RequirementAddressInputDto(promoBlock=" + this.a + Extension.C_BRAKE;
    }

    public kcj0() {
        this.a = null;
    }
}
