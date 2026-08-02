package defpackage;

import com.yandex.plus.core.graphql.type.UPSALE_STEP_VIEW;
import com.yandex.plus.core.graphql.type.UPSALE_TYPE_VIEW;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class am0 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final Map d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final ArrayList i;
    public final String j;
    public final String k;
    public final String l;
    public final UPSALE_STEP_VIEW m;
    public final UPSALE_TYPE_VIEW n;
    public final yl0 o;

    public am0(String str, ArrayList arrayList, String str2, Map map, boolean z, boolean z2, String str3, String str4, ArrayList arrayList2, String str5, String str6, String str7, UPSALE_STEP_VIEW upsale_step_view, UPSALE_TYPE_VIEW upsale_type_view, yl0 yl0Var) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = map;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = str4;
        this.i = arrayList2;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = upsale_step_view;
        this.n = upsale_type_view;
        this.o = yl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am0)) {
            return false;
        }
        am0 am0Var = (am0) obj;
        return this.a.equals(am0Var.a) && this.b.equals(am0Var.b) && jl40.l(this.c, am0Var.c) && this.d.equals(am0Var.d) && this.e == am0Var.e && this.f == am0Var.f && this.g.equals(am0Var.g) && this.h.equals(am0Var.h) && this.i.equals(am0Var.i) && this.j.equals(am0Var.j) && this.k.equals(am0Var.k) && this.l.equals(am0Var.l) && this.m == am0Var.m && this.n == am0Var.n && jl40.l(this.o, am0Var.o);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.n.hashCode() + ((this.m.hashCode() + unr0.b(unr0.b(unr0.b(ly3.b(unr0.b(unr0.b(unr0.e(unr0.e(unr0.d((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31)) * 31;
        yl0 yl0Var = this.o;
        return hashCode + (yl0Var != null ? yl0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalOffer(additionalText=" + this.a + ", benefits=" + this.b + ", disclaimer=" + this.c + ", iconImages=" + this.d + ", isAvailable=" + this.e + ", isSelected=" + this.f + ", offerName=" + this.g + ", offersBatchId=" + this.h + ", offersToReplace=" + this.i + ", positionId=" + this.j + ", text=" + this.k + ", title=" + this.l + ", upsaleStep=" + this.m + ", upsaleType=" + this.n + ", offerSwitchToggle=" + this.o + ')';
    }
}
