package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubAnalyticsPayload;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kt60 {
    public final mie a;
    public final mie b;
    public final mie c;
    public final mie d;
    public final wp2 e;
    public final pzu f;
    public final List g;
    public final int h;
    public final HubAnalyticsPayload i;

    public kt60(mie mieVar, mie mieVar2, mie mieVar3, mie mieVar4, wp2 wp2Var, pzu pzuVar, List list, int i, HubAnalyticsPayload hubAnalyticsPayload) {
        this.a = mieVar;
        this.b = mieVar2;
        this.c = mieVar3;
        this.d = mieVar4;
        this.e = wp2Var;
        this.f = pzuVar;
        this.g = list;
        this.h = i;
        this.i = hubAnalyticsPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt60)) {
            return false;
        }
        kt60 kt60Var = (kt60) obj;
        return jl40.l(this.a, kt60Var.a) && jl40.l(this.b, kt60Var.b) && jl40.l(this.c, kt60Var.c) && jl40.l(this.d, kt60Var.d) && jl40.l(this.e, kt60Var.e) && jl40.l(this.f, kt60Var.f) && jl40.l(this.g, kt60Var.g) && this.h == kt60Var.h && jl40.l(this.i, kt60Var.i);
    }

    public final int hashCode() {
        mie mieVar = this.a;
        int hashCode = (mieVar == null ? 0 : mieVar.hashCode()) * 31;
        mie mieVar2 = this.b;
        int hashCode2 = (hashCode + (mieVar2 == null ? 0 : mieVar2.hashCode())) * 31;
        mie mieVar3 = this.c;
        int hashCode3 = (hashCode2 + (mieVar3 == null ? 0 : mieVar3.hashCode())) * 31;
        mie mieVar4 = this.d;
        int b = n.b(this.e, (hashCode3 + (mieVar4 == null ? 0 : mieVar4.hashCode())) * 31, 31);
        pzu pzuVar = this.f;
        int b2 = oyr.b(this.h, unr0.c((b + (pzuVar == null ? 0 : pzuVar.hashCode())) * 31, 31, this.g), 31);
        HubAnalyticsPayload hubAnalyticsPayload = this.i;
        return b2 + (hubAnalyticsPayload != null ? hubAnalyticsPayload.hashCode() : 0);
    }

    public final String toString() {
        return "OfferTableItemState(contentTopStart=" + this.a + ", contentTopEnd=" + this.b + ", contentBottomStart=" + this.c + ", contentBottomEnd=" + this.d + ", bgColor=" + this.e + ", hubItemUiAction=" + this.f + ", analytics=" + this.g + ", serialNumber=" + this.h + ", analyticsPayload=" + this.i + Extension.C_BRAKE;
    }
}
