package defpackage;

import com.yandex.go.summary.ui.model.common.basetariffinfo.TariffOrderFlowUiState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ob5 {
    public static final ob5 f = new ob5("", "", null, TariffOrderFlowUiState.TAXI_FLOW);
    public final String a;
    public final String b;
    public final wu1 c;
    public final TariffOrderFlowUiState d;
    public final String e;

    public ob5(String str, String str2, wu1 wu1Var, TariffOrderFlowUiState tariffOrderFlowUiState) {
        this.a = str;
        this.b = str2;
        this.c = wu1Var;
        this.d = tariffOrderFlowUiState;
        this.e = str + str2 + wu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob5)) {
            return false;
        }
        ob5 ob5Var = (ob5) obj;
        return jl40.l(this.a, ob5Var.a) && jl40.l(this.b, ob5Var.b) && jl40.l(this.c, ob5Var.c) && this.d == ob5Var.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        wu1 wu1Var = this.c;
        return this.d.hashCode() + ((b + (wu1Var == null ? 0 : wu1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("BaseTariffInfoUiState(verticalId=", this.a, ", tariffClass=", this.b, ", altOptionGroup=");
        v.append(this.c);
        v.append(", tariffOrderFlowUiState=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
