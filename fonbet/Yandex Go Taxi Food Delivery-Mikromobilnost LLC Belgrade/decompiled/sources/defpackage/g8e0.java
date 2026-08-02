package defpackage;

import com.yandex.go.zone.dto.objects.a3;
import com.yandex.go.zone.dto.objects.e3;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g8e0 implements i8e0 {
    public final String a;
    public final String b;
    public final String c;
    public final a3 d;
    public final String e;

    public g8e0(String str, String str2, String str3, a3 a3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a3Var;
        this.e = "button";
    }

    @Override // defpackage.i8e0
    public final String a() {
        return this.c;
    }

    @Override // defpackage.i8e0
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8e0)) {
            return false;
        }
        g8e0 g8e0Var = (g8e0) obj;
        return jl40.l(this.a, g8e0Var.a) && jl40.l(this.b, g8e0Var.b) && jl40.l(this.c, g8e0Var.c) && jl40.l(this.d, g8e0Var.d);
    }

    @Override // defpackage.i8e0
    public final a3 getAction() {
        return this.d;
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
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(title=", this.a, ", subtitle=", this.b, ", analyticsEvent=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ g8e0(String str, String str2) {
        this(str, str2, "order_sent", e3.INSTANCE);
    }
}
