package defpackage;

import com.yandex.go.taxi.order.api.titles.OrderTitles$Alignment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class b980 {
    public final String a;
    public final kdc b;
    public final CharSequence c;
    public final kdc d;
    public final q48 e;
    public final DriveState f;
    public final boolean g;
    public final String h;
    public final OrderTitles$Alignment i;

    public /* synthetic */ b980(String str, kdc kdcVar, CharSequence charSequence, kdc kdcVar2, q48 q48Var, DriveState driveState, boolean z, String str2, int i) {
        this(str, kdcVar, charSequence, kdcVar2, q48Var, driveState, z, (i & 128) != 0 ? str : str2, OrderTitles$Alignment.CENTER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b980)) {
            return false;
        }
        b980 b980Var = (b980) obj;
        return jl40.l(this.a, b980Var.a) && jl40.l(this.b, b980Var.b) && jl40.l(this.c, b980Var.c) && jl40.l(this.d, b980Var.d) && jl40.l(this.e, b980Var.e) && this.f == b980Var.f && this.g == b980Var.g && jl40.l(this.h, b980Var.h) && this.i == b980Var.i;
    }

    public final int hashCode() {
        int d = smw0.d(this.d, smw0.b(smw0.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
        q48 q48Var = this.e;
        return this.i.hashCode() + unr0.b(unr0.e((this.f.hashCode() + ((d + (q48Var == null ? 0 : q48Var.hashCode())) * 31)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderTitles(title=");
        sb.append(this.a);
        sb.append(", titleColor=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", subtitleColor=");
        sb.append(this.d);
        sb.append(", carData=");
        sb.append(this.e);
        sb.append(", driveState=");
        sb.append(this.f);
        sb.append(", hasNavigationAction=");
        unr0.A(", titleContentDescription=", this.h, ", alignment=", sb, this.g);
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public b980(String str, kdc kdcVar, CharSequence charSequence, kdc kdcVar2, q48 q48Var, DriveState driveState, boolean z, String str2, OrderTitles$Alignment orderTitles$Alignment) {
        this.a = str;
        this.b = kdcVar;
        this.c = charSequence;
        this.d = kdcVar2;
        this.e = q48Var;
        this.f = driveState;
        this.g = z;
        this.h = str2;
        this.i = orderTitles$Alignment;
    }
}
