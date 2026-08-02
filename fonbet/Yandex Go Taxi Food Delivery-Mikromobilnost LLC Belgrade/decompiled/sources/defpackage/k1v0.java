package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class k1v0 {
    public final List a;
    public final boolean b;
    public final stz0 c;
    public final boolean d;
    public final Throwable e;
    public final fwn f;

    public k1v0(List list, boolean z, stz0 stz0Var, boolean z2, Throwable th, fwn fwnVar) {
        this.a = list;
        this.b = z;
        this.c = stz0Var;
        this.d = z2;
        this.e = th;
        this.f = fwnVar;
    }

    public final fwn a() {
        return this.f;
    }

    public final Throwable b() {
        return this.e;
    }

    public final boolean c() {
        return this.d;
    }

    public final List d() {
        return this.a;
    }

    public final stz0 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1v0)) {
            return false;
        }
        k1v0 k1v0Var = (k1v0) obj;
        return jl40.l(this.a, k1v0Var.a) && this.b == k1v0Var.b && jl40.l(this.c, k1v0Var.c) && this.d == k1v0Var.d && jl40.l(this.e, k1v0Var.e) && jl40.l(this.f, k1v0Var.f);
    }

    public final boolean f() {
        return this.b;
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        Throwable th = this.e;
        int hashCode = (e + (th == null ? 0 : th.hashCode())) * 31;
        fwn fwnVar = this.f;
        return hashCode + (fwnVar != null ? fwnVar.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionListViewState(recyclerItems=" + this.a + ", isLoading=" + this.b + ", toolbar=" + this.c + ", hasError=" + this.d + ", error=" + this.e + ", emptyState=" + this.f + Extension.C_BRAKE;
    }
}
