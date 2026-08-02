package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: StickersInfoModel.kt */
/* loaded from: classes6.dex */
public final class mal0 {
    public final ArrayList a;
    public final Object b;
    public final List<ewp0> c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public mal0(ArrayList arrayList, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = arrayList;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mal0)) {
            return false;
        }
        mal0 mal0Var = (mal0) obj;
        return this.a.equals(mal0Var.a) && this.b.equals(mal0Var.b) && this.c.equals(mal0Var.c) && this.d == mal0Var.d && this.e == mal0Var.e && this.f == mal0Var.f && this.g == mal0Var.g && this.h == mal0Var.h && this.i == mal0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(fw3.a(vul0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersInfoModel(stickers=");
        sb.append(this.a);
        sb.append(", vmojiStickers=");
        sb.append(this.b);
        sb.append(", ugcStickers=");
        sb.append(this.c);
        sb.append(", hasRecent=");
        sb.append(this.d);
        sb.append(", hasFavorites=");
        sb.append(this.e);
        sb.append(", isUgcTabVisible=");
        sb.append(this.f);
        sb.append(", showCreateVmojiTab=");
        sb.append(this.g);
        sb.append(", showCreateUgc=");
        sb.append(this.h);
        sb.append(", resetLastSelectedPack=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
