package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class kk2 implements CharSequence {
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList w;

    static {
        tig0 tig0Var = t2m0.a;
    }

    public kk2(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                ik2 ik2Var = (ik2) list.get(i);
                if (ik2Var.c() instanceof bmt0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(ik2Var);
                } else if (ik2Var.c() instanceof gc90) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(ik2Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.w = arrayList2;
        List x0 = arrayList2 != null ? a.x0(arrayList2, new jk2()) : null;
        List list2 = x0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int b = ((ik2) a.P(x0)).b();
        vx40 vx40Var = v5w.a;
        vx40 vx40Var2 = new vx40(1);
        vx40Var2.c(b);
        int size2 = x0.size();
        for (int i2 = 1; i2 < size2; i2++) {
            ik2 ik2Var2 = (ik2) x0.get(i2);
            while (true) {
                if (vx40Var2.b == 0) {
                    break;
                }
                int b2 = vx40Var2.b();
                if (ik2Var2.d() >= b2) {
                    vx40Var2.e(vx40Var2.b - 1);
                } else if (ik2Var2.b() > b2) {
                    jxv.a("Paragraph overlap not allowed, end " + ik2Var2.b() + " should be less than or equal to " + b2);
                }
            }
            vx40Var2.c(ik2Var2.b());
        }
    }

    public final List a(int i) {
        List list = this.a;
        if (list == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            ik2 ik2Var = (ik2) obj;
            if ((ik2Var.c() instanceof kky) && mk2.d(0, i, ik2Var.d(), ik2Var.b())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kk2 subSequence(int i, int i2) {
        if (i > i2) {
            jxv.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        return new kk2(mk2.b(i, i2, this.a), str.substring(i, i2));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk2)) {
            return false;
        }
        kk2 kk2Var = (kk2) obj;
        return jl40.l(this.b, kk2Var.b) && jl40.l(this.a, kk2Var.a);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List list = this.a;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, kotlin.collections.EmptyList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kk2(int i, String str, ArrayList arrayList) {
        this(mk2.a(r2 != 0 ? r0 : arrayList, r0), str);
        int i2 = i & 2;
        ?? r0 = EmptyList.a;
    }

    public /* synthetic */ kk2(String str) {
        this(str, EmptyList.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kk2(String str, List list) {
        this(r3.isEmpty() ? null : r3, str);
        List list2 = list;
    }
}
