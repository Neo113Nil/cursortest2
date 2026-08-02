package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmmp;", "", "Companion", "kmp", "lmp", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class mmp {
    public static final lmp Companion = new lmp();
    public final Boolean a;
    public final Float b;

    public /* synthetic */ mmp(int i, Boolean bool, Float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final Float getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmp)) {
            return false;
        }
        mmp mmpVar = (mmp) obj;
        return jl40.l(this.a, mmpVar.a) && jl40.l(this.b, mmpVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Float f = this.b;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturePropertiesBehaviour(stickPin=" + this.a + ", stickPinScale=" + this.b + Extension.C_BRAKE;
    }

    public mmp() {
        this.a = null;
        this.b = null;
    }
}
