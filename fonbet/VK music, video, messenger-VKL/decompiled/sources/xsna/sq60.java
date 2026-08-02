package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: NewsfeedListItems.kt */
/* loaded from: classes4.dex */
public final class sq60 {
    public static final sq60 i;
    public final List<ol60> a;
    public final List<qyp0> b;
    public final c9x c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Integer g;
    public final a9q0 h;

    static {
        EmptyList emptyList = EmptyList.b;
        i = new sq60(emptyList, emptyList, d9x.a, false, false, false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sq60(List<? extends ol60> list, List<? extends qyp0> list2, c9x c9xVar, boolean z, boolean z2, boolean z3, Integer num, a9q0 a9q0Var) {
        this.a = list;
        this.b = list2;
        this.c = c9xVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = num;
        this.h = a9q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sq60 a(sq60 sq60Var, List list, ArrayList arrayList, c9x c9xVar, boolean z, boolean z2, Integer num, a9q0 a9q0Var, int i2) {
        if ((i2 & 1) != 0) {
            list = sq60Var.a;
        }
        List list2 = list;
        List list3 = arrayList;
        if ((i2 & 2) != 0) {
            list3 = sq60Var.b;
        }
        List list4 = list3;
        if ((i2 & 4) != 0) {
            c9xVar = sq60Var.c;
        }
        c9x c9xVar2 = c9xVar;
        if ((i2 & 8) != 0) {
            z = sq60Var.d;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 16) != 0 ? sq60Var.e : false;
        if ((i2 & 32) != 0) {
            z2 = sq60Var.f;
        }
        boolean z5 = z2;
        if ((i2 & 64) != 0) {
            num = sq60Var.g;
        }
        Integer num2 = num;
        a9q0 a9q0Var2 = (i2 & 128) != 0 ? sq60Var.h : a9q0Var;
        sq60Var.getClass();
        return new sq60(list2, list4, c9xVar2, z3, z4, z5, num2, a9q0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq60)) {
            return false;
        }
        sq60 sq60Var = (sq60) obj;
        return epx.f(this.a, sq60Var.a) && epx.f(this.b, sq60Var.b) && epx.f(this.c, sq60Var.c) && this.d == sq60Var.d && this.e == sq60Var.e && this.f == sq60Var.f && epx.f(this.g, sq60Var.g) && epx.f(this.h, sq60Var.h);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b((this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.g;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        a9q0 a9q0Var = this.h;
        return hashCode + (a9q0Var != null ? a9q0Var.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedListItems(list=" + this.a + ", overlayList=" + this.b + ", holderOffsets=" + this.c + ", shouldScrollToTop=" + this.d + ", shouldSafeScrollPosition=" + this.e + ", shouldRestoreScroll=" + this.f + ", scrollToPosition=" + this.g + ", reason=" + this.h + ')';
    }
}
