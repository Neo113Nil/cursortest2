package defpackage;

import com.yandex.go.places.models.ui.DiscoveryMainTab$TabType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class itj {
    public final DiscoveryMainTab$TabType a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public itj(DiscoveryMainTab$TabType discoveryMainTab$TabType, String str, boolean z, boolean z2, List list) {
        this.a = discoveryMainTab$TabType;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itj)) {
            return false;
        }
        itj itjVar = (itj) obj;
        return this.a == itjVar.a && jl40.l(this.b, itjVar.b) && this.c == itjVar.c && this.d == itjVar.d && this.e.equals(itjVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryMainUiState(selectedTabType=");
        sb.append(this.a);
        sb.append(", selectedTabScreenId=");
        sb.append(this.b);
        sb.append(", isMapTabOpened=");
        nnm.v(", shouldShowExpandedTopScrim=", ", tabs=", sb, this.c, this.d);
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
