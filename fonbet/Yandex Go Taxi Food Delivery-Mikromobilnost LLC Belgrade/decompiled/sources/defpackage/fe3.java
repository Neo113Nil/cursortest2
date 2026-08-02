package defpackage;

import com.yandex.go.zone.dto.objects.AuctionInfo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fe3 {
    public final AuctionInfo a;
    public final double b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fe3(int i) {
        this(AuctionInfo.f, 0.0d);
        AuctionInfo.Companion.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe3)) {
            return false;
        }
        fe3 fe3Var = (fe3) obj;
        return jl40.l(this.a, fe3Var.a) && Double.compare(this.b, fe3Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AuctionState(infoDto=" + this.a + ", selectedPrice=" + this.b + Extension.C_BRAKE;
    }

    public fe3(AuctionInfo auctionInfo, double d) {
        this.a = auctionInfo;
        this.b = d;
    }

    public fe3() {
        this(0);
    }
}
