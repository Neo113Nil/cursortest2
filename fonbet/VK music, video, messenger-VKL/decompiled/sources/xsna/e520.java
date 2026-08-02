package xsna;

import android.content.Context;
import xsna.f520;

/* compiled from: MenuBottomSheetAction.kt */
/* loaded from: classes17.dex */
public final class e520 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final int l;
    public final String m;
    public final f520 n;
    public final boolean o;

    public e520(int i, int i2, int i3, String str, int i4, boolean z, int i5, int i6, boolean z2, String str2, int i7, f520 f520Var, boolean z3, int i8) {
        i7 = (i8 & 2048) != 0 ? 0 : i7;
        boolean z4 = (i8 & 16384) != 0 ? true : z3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
        this.f = z;
        this.g = i5;
        this.h = i6;
        this.i = false;
        this.j = z2;
        this.k = str2;
        this.l = i7;
        this.m = null;
        this.n = f520Var;
        this.o = z4;
    }

    public final String a(Context context) {
        String str = this.d;
        if (str != null && str.length() != 0) {
            return str;
        }
        int i = this.c;
        return i != 0 ? context.getString(i) : "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e520)) {
            return false;
        }
        e520 e520Var = (e520) obj;
        return this.a == e520Var.a && this.b == e520Var.b && this.c == e520Var.c && epx.f(this.d, e520Var.d) && this.e == e520Var.e && this.f == e520Var.f && this.g == e520Var.g && this.h == e520Var.h && this.i == e520Var.i && this.j == e520Var.j && epx.f(this.k, e520Var.k) && this.l == e520Var.l && epx.f(this.m, e520Var.m) && epx.f(this.n, e520Var.n) && this.o == e520Var.o;
    }

    public final int hashCode() {
        int a = shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        int b = qoy.b(qoy.b(shy.a(this.h, shy.a(this.g, qoy.b(shy.a(this.e, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f), 31), 31), 31, this.i), 31, this.j);
        String str2 = this.k;
        int a2 = shy.a(this.l, (b + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.m;
        int hashCode = (a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        f520 f520Var = this.n;
        return Boolean.hashCode(this.o) + ((hashCode + (f520Var != null ? f520Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuBottomSheetAction(id=");
        sb.append(this.a);
        sb.append(", iconResId=");
        sb.append(this.b);
        sb.append(", nameResId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", ordinal=");
        sb.append(this.e);
        sb.append(", isHighlighted=");
        sb.append(this.f);
        sb.append(", iconColor=");
        sb.append(this.g);
        sb.append(", textColor=");
        sb.append(this.h);
        sb.append(", isShowOnboarding=");
        sb.append(this.i);
        sb.append(", shouldHideActionIcon=");
        sb.append(this.j);
        sb.append(", groupId=");
        sb.append(this.k);
        sb.append(", descriptionResId=");
        sb.append(this.l);
        sb.append(", description=");
        sb.append(this.m);
        sb.append(", menuBottomSheetActionType=");
        sb.append(this.n);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.o, ')');
    }

    public e520(int i, int i2, int i3, int i4, boolean z, int i5, int i6, boolean z2, String str, int i7, f520.a aVar, boolean z3, int i8) {
        this(i, (i8 & 2) != 0 ? 0 : i2, i3, null, i4, (i8 & 16) != 0 ? false : z, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 256) != 0 ? false : z2, (i8 & 512) != 0 ? null : str, (i8 & 1024) != 0 ? 0 : i7, (i8 & 2048) != 0 ? null : aVar, (i8 & 4096) != 0 ? true : z3, 4096);
    }

    public e520(int i, int i2, int i3, int i4, String str) {
        this(i, (i4 & 2) != 0 ? 0 : i2, 0, str, i3, false, 0, 0, (i4 & 64) == 0, null, 0, null, false, 18688);
    }
}
