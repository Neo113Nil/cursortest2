package defpackage;

import com.yandex.go.zone.dto.objects.a3;
import com.yandex.go.zone.dto.objects.e3;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class h8e0 implements i8e0 {
    public final String a;
    public final String b;
    public final a3 c;
    public final kdc d;
    public final kdc e;

    public h8e0(String str, String str2, e3 e3Var, kdc kdcVar, kdc kdcVar2) {
        this.a = str;
        this.b = str2;
        this.c = e3Var;
        this.d = kdcVar;
        this.e = kdcVar2;
    }

    @Override // defpackage.i8e0
    public final String a() {
        return "order_sent";
    }

    @Override // defpackage.i8e0
    public final String b() {
        return "slider";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8e0)) {
            return false;
        }
        h8e0 h8e0Var = (h8e0) obj;
        return jl40.l(this.a, h8e0Var.a) && jl40.l(this.b, h8e0Var.b) && jl40.l(this.c, h8e0Var.c) && this.d.equals(h8e0Var.d) && this.e.equals(h8e0Var.e);
    }

    @Override // defpackage.i8e0
    public final a3 getAction() {
        return this.c;
    }

    @Override // defpackage.i8e0
    public final String getSubtitle() {
        return this.b;
    }

    @Override // defpackage.i8e0
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + smw0.d(this.d, (this.c.hashCode() + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 756376041) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Slider(title=", this.a, ", subtitle=", this.b, ", analyticsEvent=order_sent, action=");
        v.append(this.c);
        v.append(", bgColor=");
        v.append(this.d);
        v.append(", textColor=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
