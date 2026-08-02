package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public final class cy8 {
    public final CharSequence a;
    public final CharSequence b;
    public final ContentAlignment c;
    public final l690 d;
    public final zh4 e;
    public final b151 f;
    public final x2s g;

    public cy8(CharSequence charSequence, CharSequence charSequence2, ContentAlignment contentAlignment, l690 l690Var, zh4 zh4Var, x9x0 x9x0Var, x2s x2sVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = contentAlignment;
        this.d = l690Var;
        this.e = zh4Var;
        this.f = x9x0Var;
        this.g = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy8)) {
            return false;
        }
        cy8 cy8Var = (cy8) obj;
        return jl40.l(this.a, cy8Var.a) && jl40.l(this.b, cy8Var.b) && this.c == cy8Var.c && this.d.equals(cy8Var.d) && jl40.l(this.e, cy8Var.e) && jl40.l(this.f, cy8Var.f) && this.g.equals(cy8Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31;
        zh4 zh4Var = this.e;
        int hashCode3 = (hashCode2 + (zh4Var == null ? 0 : zh4Var.hashCode())) * 31;
        b151 b151Var = this.f;
        return this.g.hashCode() + ((hashCode3 + (b151Var != null ? b151Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "CarouselItemModel(title=", ", subtitle=", ", textAlignment=");
        r.append(this.c);
        r.append(", contentPaddings=");
        r.append(this.d);
        r.append(", backgroundState=");
        r.append(this.e);
        r.append(", widgetAction=");
        r.append(this.f);
        r.append(", onShownAnalyticsData=");
        r.append(this.g);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
