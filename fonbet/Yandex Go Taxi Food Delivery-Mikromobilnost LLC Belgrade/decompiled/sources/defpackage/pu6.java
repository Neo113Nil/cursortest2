package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class pu6 implements w201 {
    public final String a;
    public final i501 b;
    public final FormattedText c;
    public final FormattedText d;
    public final List e;
    public final ArrayList f;
    public final List g;

    public pu6(String str, i501 i501Var, FormattedText formattedText, FormattedText formattedText2, List list, ArrayList arrayList, List list2) {
        this.a = str;
        this.b = i501Var;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = list;
        this.f = arrayList;
        this.g = list2;
    }

    public static pu6 c(pu6 pu6Var, i501 i501Var) {
        return new pu6(pu6Var.a, i501Var, pu6Var.c, pu6Var.d, pu6Var.e, pu6Var.f, pu6Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu6)) {
            return false;
        }
        pu6 pu6Var = (pu6) obj;
        return jl40.l(this.a, pu6Var.a) && jl40.l(this.b, pu6Var.b) && jl40.l(this.c, pu6Var.c) && jl40.l(this.d, pu6Var.d) && jl40.l(this.e, pu6Var.e) && this.f.equals(pu6Var.f) && jl40.l(this.g, pu6Var.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.g.hashCode() + ly3.b(unr0.c(unr0.c(unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a), 31, this.d.a), 31, this.e), 31, this.f);
    }

    public final List m() {
        return this.e;
    }

    public final FormattedText n() {
        return this.d;
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BundleTracking(id=");
        sb.append(this.a);
        sb.append(", cardSwipeBehaviour=");
        sb.append(this.b);
        sb.append(", title=");
        n.C(sb, this.c, ", subtitle=", this.d, ", images=");
        sb.append(this.e);
        sb.append(", services=");
        sb.append(this.f);
        sb.append(", trackings=");
        return ly3.s(sb, this.g, Extension.C_BRAKE);
    }

    public final FormattedText v() {
        return this.c;
    }

    public final List w() {
        return this.g;
    }
}
