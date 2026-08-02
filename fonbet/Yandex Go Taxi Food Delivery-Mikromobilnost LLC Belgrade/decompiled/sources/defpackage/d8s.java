package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$VerticalAlignment;

/* loaded from: classes2.dex */
public final class d8s implements h8s, x7s {
    public final String a;
    public final FormattedText$VerticalAlignment b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;

    public d8s(String str, FormattedText$VerticalAlignment formattedText$VerticalAlignment, String str2, int i, int i2, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        formattedText$VerticalAlignment = (i3 & 2) != 0 ? FormattedText$VerticalAlignment.BASELINE : formattedText$VerticalAlignment;
        str2 = (i3 & 4) != 0 ? "" : str2;
        i = (i3 & 8) != 0 ? 0 : i;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        this.a = str;
        this.b = formattedText$VerticalAlignment;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = true;
    }

    @Override // defpackage.x7s
    public final String a() {
        return this.c;
    }

    @Override // defpackage.x7s
    public final boolean b() {
        return this.f;
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
        if (!(obj instanceof d8s)) {
            return false;
        }
        d8s d8sVar = (d8s) obj;
        return jl40.l(this.a, d8sVar.a) && this.b == d8sVar.b && jl40.l(this.c, d8sVar.c) && this.d == d8sVar.d && this.e == d8sVar.e && this.f == d8sVar.f;
    }

    @Override // defpackage.x7s
    public final Integer getHeight() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.x7s
    public final Integer getWidth() {
        return Integer.valueOf(this.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + oyr.b(this.e, oyr.b(this.d, unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(tag=");
        sb.append(this.a);
        sb.append(", verticalAlignment=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", updateFontMetrics=");
        return unr0.u(sb, this.f, ')');
    }

    public d8s() {
        this(null, null, null, 0, 0, 63);
    }
}
