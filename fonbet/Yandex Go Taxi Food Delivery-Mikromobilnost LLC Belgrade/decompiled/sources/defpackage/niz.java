package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Details$State;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class niz {
    public final String a;
    public final LogisticsOrderTracking$Details$State b;

    public niz(String str, LogisticsOrderTracking$Details$State logisticsOrderTracking$Details$State) {
        this.a = str;
        this.b = logisticsOrderTracking$Details$State;
    }

    public final LogisticsOrderTracking$Details$State a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niz)) {
            return false;
        }
        niz nizVar = (niz) obj;
        return jl40.l(this.a, nizVar.a) && this.b == nizVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Details(buttonText=" + this.a + ", state=" + this.b + Extension.C_BRAKE;
    }
}
