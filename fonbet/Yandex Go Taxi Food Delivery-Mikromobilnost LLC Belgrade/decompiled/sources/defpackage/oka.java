package defpackage;

import com.yandex.go.chargers.passes.data.ChargersPassesPaymentSettingsResponseDto;
import com.yandex.go.chargers.passes.data.q0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class oka implements pka {
    public final ChargersPassesPaymentSettingsResponseDto a;

    static {
        q0 q0Var = ChargersPassesPaymentSettingsResponseDto.Companion;
    }

    public oka(ChargersPassesPaymentSettingsResponseDto chargersPassesPaymentSettingsResponseDto) {
        this.a = chargersPassesPaymentSettingsResponseDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oka) && jl40.l(this.a, ((oka) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(settings=" + this.a + Extension.C_BRAKE;
    }
}
