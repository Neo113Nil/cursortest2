package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubAnalyticsPayload;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class he31 {
    public final List a;
    public final int b;
    public final HubAnalyticsPayload c;
    public final String d;

    public he31(List list, int i, HubAnalyticsPayload hubAnalyticsPayload, String str) {
        this.a = list;
        this.b = i;
        this.c = hubAnalyticsPayload;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he31)) {
            return false;
        }
        he31 he31Var = (he31) obj;
        return jl40.l(this.a, he31Var.a) && this.b == he31Var.b && jl40.l(this.c, he31Var.c) && jl40.l(this.d, he31Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HubItemAnalyticsData(analytics=" + this.a + ", serialNumber=" + this.b + ", analyticsPayload=" + this.c + ", selectedFilter=" + this.d + Extension.C_BRAKE;
    }
}
