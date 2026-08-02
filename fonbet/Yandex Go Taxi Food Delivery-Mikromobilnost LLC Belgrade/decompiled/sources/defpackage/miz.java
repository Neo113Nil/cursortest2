package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Cancellation$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class miz {
    public final LogisticsOrderTracking$Cancellation$Type a;
    public final String b;
    public final liz c;

    public miz(LogisticsOrderTracking$Cancellation$Type logisticsOrderTracking$Cancellation$Type, String str, liz lizVar) {
        this.a = logisticsOrderTracking$Cancellation$Type;
        this.b = str;
        this.c = lizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof miz)) {
            return false;
        }
        miz mizVar = (miz) obj;
        return this.a == mizVar.a && jl40.l(this.b, mizVar.b) && this.c.equals(mizVar.c);
    }

    public final int hashCode() {
        LogisticsOrderTracking$Cancellation$Type logisticsOrderTracking$Cancellation$Type = this.a;
        return this.c.hashCode() + unr0.b((logisticsOrderTracking$Cancellation$Type == null ? 0 : logisticsOrderTracking$Cancellation$Type.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "Cancellation(type=" + this.a + ", text=" + this.b + ", dialog=" + this.c + Extension.C_BRAKE;
    }
}
