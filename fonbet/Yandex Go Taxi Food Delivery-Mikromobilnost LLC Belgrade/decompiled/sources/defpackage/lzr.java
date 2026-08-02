package defpackage;

import com.adjust.sdk.Constants;

/* loaded from: classes.dex */
public final class lzr implements Comparable {
    public static final lzr A;
    public static final lzr B;
    public static final lzr C;
    public static final lzr D;
    public static final lzr E;
    public static final lzr F;
    public static final lzr G;
    public static final lzr H;
    public static final lzr I;
    public static final lzr b;
    public static final lzr c;
    public static final lzr w;
    public static final lzr x;
    public static final lzr y;
    public static final lzr z;
    public final int a;

    static {
        lzr lzrVar = new lzr(100);
        lzr lzrVar2 = new lzr(200);
        lzr lzrVar3 = new lzr(300);
        lzr lzrVar4 = new lzr(Constants.MINIMAL_ERROR_STATUS_CODE);
        b = lzrVar4;
        lzr lzrVar5 = new lzr(500);
        c = lzrVar5;
        lzr lzrVar6 = new lzr(600);
        w = lzrVar6;
        lzr lzrVar7 = new lzr(700);
        x = lzrVar7;
        lzr lzrVar8 = new lzr(800);
        y = lzrVar8;
        lzr lzrVar9 = new lzr(900);
        z = lzrVar9;
        A = lzrVar;
        B = lzrVar2;
        C = lzrVar3;
        D = lzrVar4;
        E = lzrVar5;
        F = lzrVar6;
        G = lzrVar7;
        H = lzrVar8;
        I = lzrVar9;
        scc.g(lzrVar, lzrVar2, lzrVar3, lzrVar4, lzrVar5, lzrVar6, lzrVar7, lzrVar8, lzrVar9);
    }

    public lzr(int i) {
        this.a = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        jxv.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(lzr lzrVar) {
        return jl40.q(this.a, lzrVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lzr) {
            return this.a == ((lzr) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return oyr.s(new StringBuilder("FontWeight(weight="), this.a, ')');
    }
}
