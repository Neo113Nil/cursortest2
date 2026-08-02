package defpackage;

import com.yandex.go.rida.bids.state.MapDecorationUiState$PulsarType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jh00 {
    public final MapDecorationUiState$PulsarType a;
    public final k1c0 b;
    public final ih00 c;

    public jh00(MapDecorationUiState$PulsarType mapDecorationUiState$PulsarType, k1c0 k1c0Var, ih00 ih00Var) {
        this.a = mapDecorationUiState$PulsarType;
        this.b = k1c0Var;
        this.c = ih00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh00)) {
            return false;
        }
        jh00 jh00Var = (jh00) obj;
        return this.a == jh00Var.a && this.b.equals(jh00Var.b) && this.c.equals(jh00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b.a.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MapDecorationUiState(pulsarUiState=" + this.a + ", pinV2UiState=" + this.b + ", point=" + this.c + Extension.C_BRAKE;
    }
}
