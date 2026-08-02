package defpackage;

import com.yandex.go.chargers.api.ChargersOpenReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q2a implements s2a {
    public final nar a;
    public final boolean b;

    public q2a(nar narVar, boolean z) {
        this.a = narVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2a)) {
            return false;
        }
        q2a q2aVar = (q2a) obj;
        return jl40.l(this.a, q2aVar.a) && this.b == q2aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.s2a
    public final ChargersOpenReason j() {
        return ChargersOpenReason.SHOW_FEEDBACK;
    }

    public final String toString() {
        return "ShowFeedback(order=" + this.a + ", shouldStayInChargers=" + this.b + Extension.C_BRAKE;
    }
}
