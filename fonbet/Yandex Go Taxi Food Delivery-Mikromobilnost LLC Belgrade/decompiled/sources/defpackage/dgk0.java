package defpackage;

import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class dgk0 implements zjk0 {
    public final String a;
    public final String b;
    public final xqs0 c;
    public final bdc d;
    public final akk0 e;

    public dgk0(String str, String str2, xqs0 xqs0Var, bdc bdcVar) {
        this.a = str;
        this.b = str2;
        this.c = xqs0Var;
        this.d = bdcVar;
        this.e = qpa1.c(xqs0Var.a, str2, EmptyList.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgk0)) {
            return false;
        }
        dgk0 dgk0Var = (dgk0) obj;
        return jl40.l(this.a, dgk0Var.a) && jl40.l(this.b, dgk0Var.b) && this.c.equals(dgk0Var.c) && this.d.equals(dgk0Var.d);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(true) + oyr.b(this.d.a, (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardDoneButtonItemUiState(id=", this.a, ", analyticsId=", this.b, ", slotItemButtonState=");
        v.append(this.c);
        v.append(", backgroundColor=");
        v.append(this.d);
        v.append(", isEnabled=true)");
        return v.toString();
    }
}
