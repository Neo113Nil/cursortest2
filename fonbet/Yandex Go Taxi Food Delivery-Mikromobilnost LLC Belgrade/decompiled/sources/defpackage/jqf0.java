package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.HorizontalAlignmentModel;

/* loaded from: classes5.dex */
public final class jqf0 extends s4z0 {
    public final String a;
    public final qfc b;
    public final HorizontalAlignmentModel c;
    public final Boolean d;

    public jqf0(String str, qfc qfcVar, HorizontalAlignmentModel horizontalAlignmentModel, Boolean bool) {
        this.a = str;
        this.b = qfcVar;
        this.c = horizontalAlignmentModel;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqf0)) {
            return false;
        }
        jqf0 jqf0Var = (jqf0) obj;
        return jl40.l(this.a, jqf0Var.a) && jl40.l(this.b, jqf0Var.b) && this.c == jqf0Var.c && jl40.l(this.d, jqf0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        qfc qfcVar = this.b;
        int hashCode2 = (hashCode + (qfcVar == null ? 0 : qfcVar.hashCode())) * 31;
        HorizontalAlignmentModel horizontalAlignmentModel = this.c;
        int hashCode3 = (hashCode2 + (horizontalAlignmentModel == null ? 0 : horizontalAlignmentModel.hashCode())) * 31;
        Boolean bool = this.d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PromoTileFooterModel(text=" + this.a + ", textColor=" + this.b + ", horizontalAlignment=" + this.c + ", locked=" + this.d + Extension.C_BRAKE;
    }

    public jqf0() {
        this(null, null, null, null);
    }
}
