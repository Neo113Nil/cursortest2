package xsna;

import com.vk.dto.stickers.StickerStockItem;
import java.util.List;

/* compiled from: StickerSettingsState.kt */
/* loaded from: classes6.dex */
public final class p6l0 {
    public final List<StickerStockItem> a;
    public final List<StickerStockItem> b;
    public final bbw0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public p6l0(List<StickerStockItem> list, List<StickerStockItem> list2, bbw0 bbw0Var, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = list2;
        this.c = bbw0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static p6l0 a(p6l0 p6l0Var, List list, List list2, bbw0 bbw0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = p6l0Var.a;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            list2 = p6l0Var.b;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            bbw0Var = p6l0Var.c;
        }
        bbw0 bbw0Var2 = bbw0Var;
        boolean z3 = p6l0Var.d;
        if ((i & 16) != 0) {
            z = p6l0Var.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = p6l0Var.f;
        }
        p6l0Var.getClass();
        return new p6l0(list3, list4, bbw0Var2, z3, z4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6l0)) {
            return false;
        }
        p6l0 p6l0Var = (p6l0) obj;
        return epx.f(this.a, p6l0Var.a) && epx.f(this.b, p6l0Var.b) && epx.f(this.c, p6l0Var.c) && this.d == p6l0Var.d && this.e == p6l0Var.e && this.f == p6l0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b((this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSettingsScreenData(active=");
        sb.append(this.a);
        sb.append(", inactive=");
        sb.append(this.b);
        sb.append(", vmoji=");
        sb.append(this.c);
        sb.append(", isAnimationsAvailable=");
        sb.append(this.d);
        sb.append(", isSuggestsEnabled=");
        sb.append(this.e);
        sb.append(", isAnimationsEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
