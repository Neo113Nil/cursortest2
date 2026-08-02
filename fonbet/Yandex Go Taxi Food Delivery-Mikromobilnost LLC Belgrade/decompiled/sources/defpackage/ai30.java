package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.ui.routeinfo.MtFloatingButtonState;

/* loaded from: classes6.dex */
public final class ai30 {
    public final String a;
    public final String b;
    public final List c;
    public final MtFloatingButtonState d;
    public final gwc e;
    public final lm30 f;
    public final yt30 g;
    public final ku30 h;

    public /* synthetic */ ai30(String str, String str2, List list, lm30 lm30Var, yt30 yt30Var, ku30 ku30Var, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? EmptyList.a : list, MtFloatingButtonState.FOCUS_USER_LOCATION, gwc.c, (i & 32) != 0 ? null : lm30Var, (i & 64) != 0 ? null : yt30Var, (i & 128) != 0 ? null : ku30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai30)) {
            return false;
        }
        ai30 ai30Var = (ai30) obj;
        return jl40.l(this.a, ai30Var.a) && jl40.l(this.b, ai30Var.b) && jl40.l(this.c, ai30Var.c) && this.d == ai30Var.d && jl40.l(this.e, ai30Var.e) && jl40.l(this.f, ai30Var.f) && jl40.l(this.g, ai30Var.g) && jl40.l(this.h, ai30Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        lm30 lm30Var = this.f;
        int hashCode2 = (hashCode + (lm30Var == null ? 0 : lm30Var.hashCode())) * 31;
        yt30 yt30Var = this.g;
        int hashCode3 = (hashCode2 + (yt30Var == null ? 0 : yt30Var.a.hashCode())) * 31;
        ku30 ku30Var = this.h;
        return hashCode3 + (ku30Var != null ? ku30Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtDetailedRouteV2UiState(title=", this.a, ", subtitle=", this.b, ", items=");
        v.append(this.c);
        v.append(", floatingButtonState=");
        v.append(this.d);
        v.append(", compassState=");
        v.append(this.e);
        v.append(", hubButtonContainer=");
        v.append(this.f);
        v.append(", purchaseFooter=");
        v.append(this.g);
        v.append(", purchaseOptions=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ai30() {
        this(null, null, null, null, null, null, 255);
    }

    public ai30(String str, String str2, List list, MtFloatingButtonState mtFloatingButtonState, gwc gwcVar, lm30 lm30Var, yt30 yt30Var, ku30 ku30Var) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = mtFloatingButtonState;
        this.e = gwcVar;
        this.f = lm30Var;
        this.g = yt30Var;
        this.h = ku30Var;
    }
}
