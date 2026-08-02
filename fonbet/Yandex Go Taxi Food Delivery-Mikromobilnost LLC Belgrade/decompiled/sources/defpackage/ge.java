package defpackage;

import com.yandex.go.design.compose.spinner.SpinnerState;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ge {
    public final String a;
    public final SpinnerState b;
    public final List c;

    static {
        SpinnerState spinnerState = SpinnerState.LOADING;
    }

    public ge(String str, SpinnerState spinnerState, List list) {
        this.a = str;
        this.b = spinnerState;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return jl40.l(this.a, geVar.a) && this.b == geVar.b && jl40.l(this.c, geVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AcceptancePaymentFullscreenUiState(title=");
        sb.append(this.a);
        sb.append(", spinnerState=");
        sb.append(this.b);
        sb.append(", buttons=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
