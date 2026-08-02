package defpackage;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jda {
    public final boolean a;
    public final CharSequence b;
    public final ChargersActiveOrderStatus c;

    public jda(boolean z, CharSequence charSequence, ChargersActiveOrderStatus chargersActiveOrderStatus) {
        this.a = z;
        this.b = charSequence;
        this.c = chargersActiveOrderStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jda)) {
            return false;
        }
        jda jdaVar = (jda) obj;
        return this.a == jdaVar.a && jl40.l(this.b, jdaVar.b) && this.c == jdaVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ChargersOrderPreparingUiState(inProgress=" + this.a + ", text=" + ((Object) this.b) + ", status=" + this.c + Extension.C_BRAKE;
    }
}
