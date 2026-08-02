package defpackage;

import com.yandex.go.trusted_contacts.domain.entities.RenderedContactState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cyi0 {
    public final String a;
    public final String b;
    public final RenderedContactState c;
    public final Object d;

    public cyi0(String str, String str2, RenderedContactState renderedContactState, Object obj) {
        this.a = str;
        this.b = str2;
        this.c = renderedContactState;
        this.d = obj;
    }

    public static cyi0 a(cyi0 cyi0Var, RenderedContactState renderedContactState) {
        String str = cyi0Var.a;
        String str2 = cyi0Var.b;
        Object obj = cyi0Var.d;
        cyi0Var.getClass();
        return new cyi0(str, str2, renderedContactState, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyi0)) {
            return false;
        }
        cyi0 cyi0Var = (cyi0) obj;
        return jl40.l(this.a, cyi0Var.a) && jl40.l(this.b, cyi0Var.b) && this.c == cyi0Var.c && jl40.l(this.d, cyi0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        Object obj = this.d;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("RenderedContact(title=", this.a, ", subtitle=", this.b, ", state=");
        v.append(this.c);
        v.append(", contact=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
