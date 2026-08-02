package defpackage;

import com.yandex.go.taxi.order.details.v2.state.elements.status_progress.RideCardStatusProgressItemUiState$State;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bok0 implements olk0 {
    public final String a;
    public final String b;
    public final vnk0 c;
    public final wnk0 d;
    public final wnk0 e;
    public final aok0 f;
    public final xnk0 g;
    public final RideCardStatusProgressItemUiState$State h;
    public final vfk0 i;
    public final akk0 j;

    public bok0(String str, String str2, vnk0 vnk0Var, wnk0 wnk0Var, wnk0 wnk0Var2, aok0 aok0Var, xnk0 xnk0Var, RideCardStatusProgressItemUiState$State rideCardStatusProgressItemUiState$State, vfk0 vfk0Var) {
        this.a = str;
        this.b = str2;
        this.c = vnk0Var;
        this.d = wnk0Var;
        this.e = wnk0Var2;
        this.f = aok0Var;
        this.g = xnk0Var;
        this.h = rideCardStatusProgressItemUiState$State;
        this.i = vfk0Var;
        this.j = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bok0)) {
            return false;
        }
        bok0 bok0Var = (bok0) obj;
        return jl40.l(this.a, bok0Var.a) && jl40.l(this.b, bok0Var.b) && jl40.l(this.c, bok0Var.c) && this.d.equals(bok0Var.d) && jl40.l(this.e, bok0Var.e) && jl40.l(this.f, bok0Var.f) && jl40.l(this.g, bok0Var.g) && this.h == bok0Var.h && jl40.l(this.i, bok0Var.i);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.j;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        vnk0 vnk0Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (vnk0Var == null ? 0 : vnk0Var.hashCode())) * 31)) * 31;
        wnk0 wnk0Var = this.e;
        int hashCode4 = (hashCode3 + (wnk0Var == null ? 0 : wnk0Var.hashCode())) * 31;
        aok0 aok0Var = this.f;
        int hashCode5 = (hashCode4 + (aok0Var == null ? 0 : aok0Var.hashCode())) * 31;
        xnk0 xnk0Var = this.g;
        int hashCode6 = xnk0Var != null ? xnk0Var.hashCode() : 0;
        return this.i.hashCode() + ((this.h.hashCode() + ((hashCode5 + hashCode6) * 31)) * 31);
    }

    @Override // defpackage.olk0
    public final vfk0 o() {
        return this.i;
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardStatusProgressItemUiState(id=", this.a, ", analyticsId=", this.b, ", progressBar=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", subtitle=");
        v.append(this.e);
        v.append(", trail=");
        v.append(this.f);
        v.append(", timer=");
        v.append(this.g);
        v.append(", state=");
        v.append(this.h);
        v.append(", sourceType=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
