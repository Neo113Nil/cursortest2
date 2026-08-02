package defpackage;

import com.yandex.go.delivery.rental_duration_selector.b;
import com.yandex.go.delivery.rental_duration_selector.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gzi0 implements uni {
    public final bbu a;
    public final pt6 b;
    public final String c;
    public final tpr w;
    public final tpr x;

    public gzi0(bbu bbuVar, pt6 pt6Var, String str, b bVar, d dVar) {
        this.a = bbuVar;
        this.b = pt6Var;
        this.c = str;
        this.w = bVar;
        this.x = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzi0)) {
            return false;
        }
        gzi0 gzi0Var = (gzi0) obj;
        return jl40.l(this.a, gzi0Var.a) && jl40.l(this.b, gzi0Var.b) && this.c.equals(gzi0Var.c) && jl40.l(this.w, gzi0Var.w) && jl40.l(this.x, gzi0Var.x);
    }

    public final int hashCode() {
        bbu bbuVar = this.a;
        int hashCode = (bbuVar == null ? 0 : bbuVar.hashCode()) * 31;
        pt6 pt6Var = this.b;
        return this.x.hashCode() + ((this.w.hashCode() + unr0.b((hashCode + (pt6Var != null ? pt6Var.a.hashCode() : 0)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "RentalDurationArgs(headerModel=" + this.a + ", bulletListModel=" + this.b + ", confirmButtonText=" + this.c + ", timeDetailsFlow=" + this.w + ", counterFlow=" + this.x + Extension.C_BRAKE;
    }
}
