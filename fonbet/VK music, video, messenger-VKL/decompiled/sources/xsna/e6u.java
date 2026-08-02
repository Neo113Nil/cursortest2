package xsna;

import java.util.List;

/* compiled from: GoodPreviewContent.kt */
/* loaded from: classes18.dex */
public final class e6u {
    public final k7u a;
    public final o5u b;
    public final List<k7u> c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final f7u h;

    public e6u(k7u k7uVar, o5u o5uVar, List<k7u> list, int i, boolean z, boolean z2, boolean z3, f7u f7uVar) {
        this.a = k7uVar;
        this.b = o5uVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = f7uVar;
    }

    public static e6u a(e6u e6uVar, k7u k7uVar, o5u o5uVar, List list, int i, boolean z, boolean z2, boolean z3, f7u f7uVar, int i2) {
        if ((i2 & 1) != 0) {
            k7uVar = e6uVar.a;
        }
        k7u k7uVar2 = k7uVar;
        if ((i2 & 2) != 0) {
            o5uVar = e6uVar.b;
        }
        o5u o5uVar2 = o5uVar;
        if ((i2 & 4) != 0) {
            list = e6uVar.c;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            i = e6uVar.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = e6uVar.e;
        }
        boolean z4 = z;
        if ((i2 & 32) != 0) {
            z2 = e6uVar.f;
        }
        boolean z5 = z2;
        boolean z6 = (i2 & 64) != 0 ? e6uVar.g : z3;
        f7u f7uVar2 = (i2 & 128) != 0 ? e6uVar.h : f7uVar;
        e6uVar.getClass();
        return new e6u(k7uVar2, o5uVar2, list2, i3, z4, z5, z6, f7uVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6u)) {
            return false;
        }
        e6u e6uVar = (e6u) obj;
        return epx.f(this.a, e6uVar.a) && epx.f(this.b, e6uVar.b) && epx.f(this.c, e6uVar.c) && this.d == e6uVar.d && this.e == e6uVar.e && this.f == e6uVar.f && this.g == e6uVar.g && epx.f(this.h, e6uVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o5u o5uVar = this.b;
        int hashCode2 = (hashCode + (o5uVar == null ? 0 : o5uVar.hashCode())) * 31;
        List<k7u> list = this.c;
        int b = qoy.b(qoy.b(qoy.b(shy.a(this.d, (hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
        f7u f7uVar = this.h;
        return b + (f7uVar != null ? f7uVar.hashCode() : 0);
    }

    public final String toString() {
        return "GoodPreviewContent(good=" + this.a + ", buttons=" + this.b + ", recommendations=" + this.c + ", loadedOffset=" + this.d + ", isInCart=" + this.e + ", isPageLoading=" + this.f + ", isPageEnded=" + this.g + ", toolbarBadges=" + this.h + ')';
    }
}
