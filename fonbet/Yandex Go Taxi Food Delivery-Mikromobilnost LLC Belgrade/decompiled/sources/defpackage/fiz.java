package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Details$State;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fiz implements jiz {
    public final LogisticsOrderTracking$Details$State a;

    public fiz(LogisticsOrderTracking$Details$State logisticsOrderTracking$Details$State) {
        this.a = logisticsOrderTracking$Details$State;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fiz) && this.a == ((fiz) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Details(state=" + this.a + Extension.C_BRAKE;
    }
}
