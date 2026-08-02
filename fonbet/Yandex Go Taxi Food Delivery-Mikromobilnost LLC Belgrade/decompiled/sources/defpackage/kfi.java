package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkfi;", "Lxn11;", "Companion", "jfi", "ifi", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class kfi implements xn11 {
    public static final jfi Companion = new jfi();
    public static final i3y[] t;
    public static final kfi u;
    public final boolean b;
    public final List c;
    public final List d;
    public final nmi e;
    public final String f;
    public final List g;
    public final String h;
    public final List i;
    public final p1i j;
    public final k8j k;
    public final String l;
    public final h7i m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final List r;
    public final tfr0 s;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        t = new i3y[]{null, a.b(lazyThreadSafetyMode, new n5h(21)), a.b(lazyThreadSafetyMode, new n5h(22)), null, null, a.b(lazyThreadSafetyMode, new n5h(23)), null, a.b(lazyThreadSafetyMode, new n5h(24)), null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new n5h(25)), null};
        u = new kfi(0);
    }

    public /* synthetic */ kfi(int i, boolean z, List list, List list2, nmi nmiVar, String str, List list3, String str2, List list4, p1i p1iVar, k8j k8jVar, String str3, h7i h7iVar, boolean z2, String str4, boolean z3, boolean z4, List list5, tfr0 tfr0Var) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 8) == 0) {
            this.e = new nmi(0);
        } else {
            this.e = nmiVar;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str;
        }
        if ((i & 32) == 0) {
            this.g = emptyList;
        } else {
            this.g = list3;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str2;
        }
        if ((i & 128) == 0) {
            this.i = emptyList;
        } else {
            this.i = list4;
        }
        if ((i & 256) == 0) {
            this.j = new p1i(0);
        } else {
            this.j = p1iVar;
        }
        if ((i & 512) == 0) {
            this.k = new k8j(0);
        } else {
            this.k = k8jVar;
        }
        if ((i & 1024) == 0) {
            this.l = "";
        } else {
            this.l = str3;
        }
        if ((i & 2048) == 0) {
            this.m = null;
        } else {
            this.m = h7iVar;
        }
        if ((i & 4096) == 0) {
            this.n = false;
        } else {
            this.n = z2;
        }
        if ((i & 8192) == 0) {
            this.o = "";
        } else {
            this.o = str4;
        }
        this.p = (i & 16384) == 0 ? true : z3;
        if ((32768 & i) == 0) {
            this.q = false;
        } else {
            this.q = z4;
        }
        if ((65536 & i) == 0) {
            this.r = emptyList;
        } else {
            this.r = list5;
        }
        this.s = (i & 131072) == 0 ? new tfr0(0) : tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfi)) {
            return false;
        }
        kfi kfiVar = (kfi) obj;
        return this.b == kfiVar.b && jl40.l(this.c, kfiVar.c) && jl40.l(this.d, kfiVar.d) && jl40.l(this.e, kfiVar.e) && jl40.l(this.f, kfiVar.f) && jl40.l(this.g, kfiVar.g) && jl40.l(this.h, kfiVar.h) && jl40.l(this.i, kfiVar.i) && jl40.l(this.j, kfiVar.j) && jl40.l(this.k, kfiVar.k) && jl40.l(this.l, kfiVar.l) && jl40.l(this.m, kfiVar.m) && this.n == kfiVar.n && jl40.l(this.o, kfiVar.o) && this.p == kfiVar.p && this.q == kfiVar.q && jl40.l(this.r, kfiVar.r) && jl40.l(this.s, kfiVar.s);
    }

    public final int hashCode() {
        int b = unr0.b((this.e.hashCode() + unr0.c(unr0.c(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f);
        List list = this.g;
        int b2 = unr0.b(unr0.c((this.j.hashCode() + unr0.c(unr0.b((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.h), 31, this.i)) * 31, 31, this.k.a), 31, this.l);
        h7i h7iVar = this.m;
        return this.s.hashCode() + unr0.c(unr0.e(unr0.e(unr0.b(unr0.e((b2 + (h7iVar != null ? h7iVar.hashCode() : 0)) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryOrderAdditionalStepExperiment(enabled=");
        sb.append(this.b);
        sb.append(", tariffs=");
        sb.append(this.c);
        sb.append(", shortFormTariffs=");
        sb.append(this.d);
        sb.append(", addressRelatedRequirement=");
        sb.append(this.e);
        sb.append(", title=");
        tse0.x(this.f, ", titleOverwritingByTariffRules=", ", priceLabel=", sb, this.g);
        tse0.x(this.h, ", points=", ", continueAlert=", sb, this.i);
        sb.append(this.j);
        sb.append(", detailsFieldEffects=");
        sb.append(this.k);
        sb.append(", userContactName=");
        sb.append(this.l);
        sb.append(", emptyContactItem=");
        sb.append(this.m);
        sb.append(", newDeliveryFlow=");
        unr0.A(", orderButtonText=", this.o, ", showRequirementOnSummary=", sb, this.n);
        nnm.v(", isCommentDisabledOnSummary=", ", additionalRequirements=", sb, this.p, this.q);
        sb.append(this.r);
        sb.append(", setupRequirements=");
        sb.append(this.s);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public kfi() {
        this(0);
    }

    public kfi(int i) {
        nmi nmiVar = new nmi(0);
        p1i p1iVar = new p1i(0);
        k8j k8jVar = new k8j(0);
        tfr0 tfr0Var = new tfr0(0);
        this.b = false;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = nmiVar;
        this.f = "";
        this.g = emptyList;
        this.h = "";
        this.i = emptyList;
        this.j = p1iVar;
        this.k = k8jVar;
        this.l = "";
        this.m = null;
        this.n = false;
        this.o = "";
        this.p = true;
        this.q = false;
        this.r = emptyList;
        this.s = tfr0Var;
    }
}
