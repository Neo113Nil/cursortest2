package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkz20;", "", "Companion", "iz20", "jz20", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class kz20 {
    public static final jz20 Companion = new jz20();
    public final String a;
    public final Float b;

    public /* synthetic */ kz20(int i, String str, Float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz20)) {
            return false;
        }
        kz20 kz20Var = (kz20) obj;
        return jl40.l(this.a, kz20Var.a) && jl40.l(this.b, kz20Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.b;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "ModalRatioHeightHeightConfigDto(status=" + this.a + ", ratio=" + this.b + Extension.C_BRAKE;
    }

    public kz20(String str, Float f) {
        this.a = str;
        this.b = f;
    }

    public kz20() {
        this(null, null);
    }
}
