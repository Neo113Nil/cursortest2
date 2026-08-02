package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ea5 {
    public final int a;
    public final int b;
    public final ba5 c;
    public final String d;
    public final BaseShortcutModel$Source e;
    public final OfferType f;
    public final da5 g;
    public final da5 h;
    public final fa5 i;
    public final String j;
    public final q1 k;
    public final List l;
    public final f0 m;
    public final Counters n;
    public final String o;
    public final List p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ea5(int i, int i2, ba5 ba5Var, String str, BaseShortcutModel$Source baseShortcutModel$Source, OfferType offerType, da5 da5Var, da5 da5Var2, fa5 fa5Var, String str2, q1 q1Var, List list, f0 f0Var, Counters counters, List list2, int i3) {
        this(i, i2, ba5Var, str, baseShortcutModel$Source, offerType, da5Var, da5Var2, fa5Var, str2, q1Var, list, r15, r16, (String) null, (i3 & 32768) != 0 ? EmptyList.a : list2);
        Counters counters2;
        f0 f0Var2 = (i3 & 4096) != 0 ? null : f0Var;
        if ((i3 & 8192) != 0) {
            Counters.Companion.getClass();
            counters2 = Counters.c;
        } else {
            counters2 = counters;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea5)) {
            return false;
        }
        ea5 ea5Var = (ea5) obj;
        return this.a == ea5Var.a && this.b == ea5Var.b && jl40.l(this.c, ea5Var.c) && jl40.l(this.d, ea5Var.d) && this.e == ea5Var.e && this.f == ea5Var.f && jl40.l(this.g, ea5Var.g) && jl40.l(this.h, ea5Var.h) && jl40.l(this.i, ea5Var.i) && jl40.l(this.j, ea5Var.j) && jl40.l(this.k, ea5Var.k) && jl40.l(this.l, ea5Var.l) && jl40.l(this.m, ea5Var.m) && jl40.l(this.n, ea5Var.n) && jl40.l(this.o, ea5Var.o) && jl40.l(this.p, ea5Var.p);
    }

    public final int hashCode() {
        int b = unr0.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.b((this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, this.d)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j);
        q1 q1Var = this.k;
        int c = unr0.c((b + (q1Var == null ? 0 : q1Var.hashCode())) * 31, 31, this.l);
        f0 f0Var = this.m;
        int c2 = unr0.c((c + (f0Var == null ? 0 : f0Var.hashCode())) * 31, 31, this.n.a);
        String str = this.o;
        return this.p.hashCode() + ((c2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ShortcutBase(width=", ", height=", ", background=");
        s.append(this.c);
        s.append(", gridId=");
        s.append(this.d);
        s.append(", source=");
        s.append(this.e);
        s.append(", type=");
        s.append(this.f);
        s.append(", title=");
        s.append(this.g);
        s.append(", subtitle=");
        s.append(this.h);
        s.append(", textStyle=");
        s.append(this.i);
        s.append(", shortcutId=");
        s.append(this.j);
        s.append(", action=");
        s.append(this.k);
        s.append(", badges=");
        s.append(this.l);
        s.append(", onboarding=");
        s.append(this.m);
        s.append(", counters=");
        s.append(this.n);
        s.append(", eventPayload=");
        return tse0.j(this.o, ", nestedButtons=", Extension.C_BRAKE, s, this.p);
    }

    public ea5(int i, int i2, ba5 ba5Var, String str, BaseShortcutModel$Source baseShortcutModel$Source, OfferType offerType, da5 da5Var, da5 da5Var2, fa5 fa5Var, String str2, q1 q1Var, List list, f0 f0Var, Counters counters, String str3, List list2) {
        this.a = i;
        this.b = i2;
        this.c = ba5Var;
        this.d = str;
        this.e = baseShortcutModel$Source;
        this.f = offerType;
        this.g = da5Var;
        this.h = da5Var2;
        this.i = fa5Var;
        this.j = str2;
        this.k = q1Var;
        this.l = list;
        this.m = f0Var;
        this.n = counters;
        this.o = str3;
        this.p = list2;
    }
}
