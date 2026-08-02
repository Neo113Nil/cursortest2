package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$VerticalAlignment;

/* loaded from: classes2.dex */
public final class e8s implements h8s, x7s {
    public final String a;
    public final FormattedText$VerticalAlignment b;
    public final String c;
    public final boolean d;

    public e8s() {
        FormattedText$VerticalAlignment formattedText$VerticalAlignment = FormattedText$VerticalAlignment.BASELINE;
        this.a = "";
        this.b = formattedText$VerticalAlignment;
        this.c = "";
        this.d = true;
    }

    @Override // defpackage.x7s
    public final String a() {
        return this.c;
    }

    @Override // defpackage.x7s
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.x7s
    public final FormattedText$VerticalAlignment c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8s)) {
            return false;
        }
        e8s e8sVar = (e8s) obj;
        return jl40.l(this.a, e8sVar.a) && this.b == e8sVar.b && jl40.l(this.c, e8sVar.c) && this.d == e8sVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageUrl(url=");
        sb.append(this.a);
        sb.append(", verticalAlignment=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", updateFontMetrics=");
        return unr0.u(sb, this.d, ')');
    }
}
