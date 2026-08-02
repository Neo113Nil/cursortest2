package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcmx0;", "", "Companion", "amx0", "bmx0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class cmx0 {
    public static final bmx0 Companion = new bmx0();
    public final Boolean a;
    public final Boolean b;
    public final String c;
    public final f1b0 d;

    public /* synthetic */ cmx0(int i, Boolean bool, Boolean bool2, String str, f1b0 f1b0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f1b0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final f1b0 getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmx0)) {
            return false;
        }
        cmx0 cmx0Var = (cmx0) obj;
        return jl40.l(this.a, cmx0Var.a) && jl40.l(this.b, cmx0Var.b) && jl40.l(this.c, cmx0Var.c) && jl40.l(this.d, cmx0Var.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        f1b0 f1b0Var = this.d;
        return hashCode3 + (f1b0Var != null ? f1b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TariffRequirementOverrideDto(glued=" + this.a + ", gluedOptional=" + this.b + ", unsetOrderButtonKey=" + this.c + ", persistencePolicy=" + this.d + Extension.C_BRAKE;
    }

    public cmx0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
