package defpackage;

import com.yandex.go.taxi.order.support.domain.entities.SupportButtonsArrangement;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class akw0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final SupportButtonsArrangement e;
    public final List f;

    public akw0(String str, String str2, String str3, String str4, SupportButtonsArrangement supportButtonsArrangement, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = supportButtonsArrangement;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akw0)) {
            return false;
        }
        akw0 akw0Var = (akw0) obj;
        return jl40.l(this.a, akw0Var.a) && jl40.l(this.b, akw0Var.b) && jl40.l(this.c, akw0Var.c) && jl40.l(this.d, akw0Var.d) && this.e == akw0Var.e && this.f.equals(akw0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SupportModalWindowInfo(id=", this.a, ", iconTag=", this.b, ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", buttonsArrangement=");
        v.append(this.e);
        v.append(", actionButtons=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
