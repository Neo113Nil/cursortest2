package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m29 {
    public final Text a;
    public final Text b;
    public final List c;
    public final int d;
    public final int e;
    public final kao f;
    public final boolean g;
    public final boolean h;

    public m29(Text text, Text text2, List list, int i, int i2, kao kaoVar, boolean z, boolean z2) {
        this.a = text;
        this.b = text2;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = kaoVar;
        this.g = z;
        this.h = z2;
    }

    public static m29 a(m29 m29Var, Text text, Text text2, List list, int i, int i2, kao kaoVar, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            text = m29Var.a;
        }
        Text text3 = text;
        if ((i3 & 2) != 0) {
            text2 = m29Var.b;
        }
        Text text4 = text2;
        if ((i3 & 4) != 0) {
            list = m29Var.c;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            i = m29Var.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = m29Var.e;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            kaoVar = m29Var.f;
        }
        kao kaoVar2 = kaoVar;
        boolean z3 = (i3 & 64) != 0 ? m29Var.g : z;
        boolean z4 = (i3 & 128) != 0 ? m29Var.h : z2;
        m29Var.getClass();
        return new m29(text3, text4, list2, i4, i5, kaoVar2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m29)) {
            return false;
        }
        m29 m29Var = (m29) obj;
        return jl40.l(this.a, m29Var.a) && jl40.l(this.b, m29Var.b) && jl40.l(this.c, m29Var.c) && this.d == m29Var.d && this.e == m29Var.e && jl40.l(this.f, m29Var.f) && this.g == m29Var.g && this.h == m29Var.h;
    }

    public final int hashCode() {
        int b = oyr.b(this.e, oyr.b(this.d, unr0.c(n.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31);
        kao kaoVar = this.f;
        return Boolean.hashCode(this.h) + unr0.e((b + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder p = n.p("CashbackCategoriesState(title=", this.a, ", description=", this.b, ", items=");
        p.append(this.c);
        p.append(", maxItems=");
        p.append(this.d);
        p.append(", itemsSelected=");
        p.append(this.e);
        p.append(", errorState=");
        p.append(this.f);
        p.append(", promosFetchingInProgress=");
        return smw0.k(", itemsSubmittingInProgress=", Extension.C_BRAKE, p, this.g, this.h);
    }

    public m29() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m29(int i) {
        this(r1, r1, EmptyList.a, 0, 0, null, false, false);
        Text.Empty empty = Text.Empty.INSTANCE;
    }
}
