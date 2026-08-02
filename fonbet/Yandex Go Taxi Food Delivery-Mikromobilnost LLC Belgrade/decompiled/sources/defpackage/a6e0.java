package defpackage;

import com.yandex.go.zone.dto.objects.Notification;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a6e0 implements vfy {
    public final String a;
    public final String b;
    public final Notification.Type c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public a6e0(String str, String str2, Notification.Type type, String str3, String str4, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = type;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.vfy
    /* renamed from: a */
    public final int getA() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6e0)) {
            return false;
        }
        a6e0 a6e0Var = (a6e0) obj;
        return jl40.l(this.a, a6e0Var.a) && this.b.equals(a6e0Var.b) && this.c == a6e0Var.c && jl40.l(this.d, a6e0Var.d) && jl40.l(this.e, a6e0Var.e) && this.f == a6e0Var.f && this.g == a6e0Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Notification.Type type = this.c;
        int hashCode = (b + (type == null ? 0 : type.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Integer.hashCode(this.g) + oyr.b(this.f, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PoolReminderData(orderId=", this.a, ", tariffClassName=", this.b, ", type=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", body=");
        b64.A(this.f, this.e, ", showCountLimit=", ", maxWaitingTimeInMin=", v);
        return oyr.m(this.g, Extension.C_BRAKE, v);
    }
}
