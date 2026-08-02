package defpackage;

import com.yandex.go.zone.dto.objects.CancelReasonsGrouped;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gx7 {
    public final CancelReasonsGrouped a;

    public gx7(CancelReasonsGrouped cancelReasonsGrouped) {
        this.a = cancelReasonsGrouped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx7) && jl40.l(this.a, ((gx7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "V3(cancelReasonsGrouped=" + this.a + Extension.C_BRAKE;
    }
}
