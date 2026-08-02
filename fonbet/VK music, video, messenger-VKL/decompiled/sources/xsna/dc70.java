package xsna;

import java.util.List;
import kotlin.collections.EmptyList;
import xsna.xh70;

/* compiled from: NotificationListState.kt */
/* loaded from: classes4.dex */
public final class dc70 implements km50 {
    public final String b;
    public final Long c;
    public final List<o870> d;
    public final int e;
    public final xh70 f;
    public final t770 g;
    public final List<zi70> h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public dc70() {
        this(0);
    }

    public static dc70 a(dc70 dc70Var, String str, Long l, List list, int i, xh70 xh70Var, t770 t770Var, List list2, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            str = dc70Var.b;
        }
        String str2 = str;
        if ((i3 & 2) != 0) {
            l = dc70Var.c;
        }
        Long l2 = l;
        if ((i3 & 4) != 0) {
            list = dc70Var.d;
        }
        List list3 = list;
        if ((i3 & 8) != 0) {
            i = dc70Var.e;
        }
        int i4 = i;
        xh70 xh70Var2 = (i3 & 16) != 0 ? dc70Var.f : xh70Var;
        t770 t770Var2 = (i3 & 32) != 0 ? dc70Var.g : t770Var;
        List list4 = (i3 & 64) != 0 ? dc70Var.h : list2;
        int i5 = (i3 & 128) != 0 ? dc70Var.i : i2;
        boolean z3 = (i3 & 256) != 0 ? dc70Var.j : z;
        boolean z4 = (i3 & 512) != 0 ? dc70Var.k : z2;
        dc70Var.getClass();
        return new dc70(str2, l2, list3, i4, xh70Var2, t770Var2, list4, i5, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc70)) {
            return false;
        }
        dc70 dc70Var = (dc70) obj;
        return epx.f(this.b, dc70Var.b) && epx.f(this.c, dc70Var.c) && epx.f(this.d, dc70Var.d) && this.e == dc70Var.e && epx.f(this.f, dc70Var.f) && epx.f(this.g, dc70Var.g) && epx.f(this.h, dc70Var.h) && this.i == dc70Var.i && this.j == dc70Var.j && this.k == dc70Var.k;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.c;
        int hashCode2 = (this.f.hashCode() + shy.a(this.e, fw3.a((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31)) * 31;
        t770 t770Var = this.g;
        return Boolean.hashCode(this.k) + qoy.b(shy.a(this.i, fw3.a((hashCode2 + (t770Var != null ? t770Var.hashCode() : 0)) * 31, 31, this.h), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationListState(title=");
        sb.append(this.b);
        sb.append(", currentSourceId=");
        sb.append(this.c);
        sb.append(", pages=");
        sb.append(this.d);
        sb.append(", snackbarKey=");
        sb.append(this.e);
        sb.append(", snackbarType=");
        sb.append(this.f);
        sb.append(", alert=");
        sb.append(this.g);
        sb.append(", categories=");
        sb.append(this.h);
        sb.append(", selectedCategoryIndex=");
        sb.append(this.i);
        sb.append(", tabsEnabled=");
        sb.append(this.j);
        sb.append(", canShowBanner=");
        return defpackage.q0.a(sb, this.k, ')');
    }

    public dc70(String str, Long l, List<o870> list, int i, xh70 xh70Var, t770 t770Var, List<zi70> list2, int i2, boolean z, boolean z2) {
        this.b = str;
        this.c = l;
        this.d = list;
        this.e = i;
        this.f = xh70Var;
        this.g = t770Var;
        this.h = list2;
        this.i = i2;
        this.j = z;
        this.k = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dc70(int i) {
        this(null, null, r3, 0, xh70.b.a, null, r3, 0, false, false);
        EmptyList emptyList = EmptyList.b;
    }
}
