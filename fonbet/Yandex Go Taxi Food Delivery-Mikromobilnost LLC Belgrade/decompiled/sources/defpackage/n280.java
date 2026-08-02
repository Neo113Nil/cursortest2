package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;

/* loaded from: classes6.dex */
public final class n280 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final OrderNotification$OrderNotificationType g;
    public final long h;
    public final m280 i;
    public final boolean j;

    public /* synthetic */ n280(int i, String str, String str2, String str3, String str4, boolean z, OrderNotification$OrderNotificationType orderNotification$OrderNotificationType, long j, boolean z2, int i2) {
        this(i, str, str2, str3, str4, z, orderNotification$OrderNotificationType, (i2 & 128) != 0 ? 0L : j, (m280) null, (i2 & 512) != 0 ? false : z2);
    }

    public static n280 a(n280 n280Var, String str, String str2, m280 m280Var, int i) {
        int i2 = n280Var.a;
        String str3 = n280Var.b;
        String str4 = n280Var.c;
        if ((i & 8) != 0) {
            str = n280Var.d;
        }
        String str5 = str;
        if ((i & 16) != 0) {
            str2 = n280Var.e;
        }
        return new n280(i2, str3, str4, str5, str2, n280Var.f, n280Var.g, n280Var.h, (i & 256) != 0 ? n280Var.i : m280Var, n280Var.j);
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.h;
    }

    public final m280 d() {
        return this.i;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n280)) {
            return false;
        }
        n280 n280Var = (n280) obj;
        return this.a == n280Var.a && jl40.l(this.b, n280Var.b) && jl40.l(this.c, n280Var.c) && jl40.l(this.d, n280Var.d) && jl40.l(this.e, n280Var.e) && this.f == n280Var.f && this.g == n280Var.g && this.h == n280Var.h && jl40.l(this.i, n280Var.i) && this.j == n280Var.j;
    }

    public final boolean f() {
        return this.j;
    }

    public final boolean g() {
        return this.f;
    }

    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int c = qv10.c((this.g.hashCode() + unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f)) * 31, 31, this.h);
        m280 m280Var = this.i;
        return Boolean.hashCode(this.j) + ((c + (m280Var != null ? m280Var.hashCode() : 0)) * 31);
    }

    public final OrderNotification$OrderNotificationType i() {
        return this.g;
    }

    public final String j() {
        return this.b;
    }

    public final String k() {
        return this.d;
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "OrderNotificationParams(id=", ", orderId=", this.b, ", groupId=");
        g8e.D(v, this.c, ", title=", this.d, ", body=");
        tse0.y(this.e, ", headsUp=", ", notificationType=", v, this.f);
        v.append(this.g);
        v.append(", expirationIntervalInMillis=");
        v.append(this.h);
        v.append(", extendedParams=");
        v.append(this.i);
        v.append(", hasSelectorDecorations=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public n280(int i, String str, String str2, String str3, String str4, boolean z, OrderNotification$OrderNotificationType orderNotification$OrderNotificationType, long j, m280 m280Var, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = orderNotification$OrderNotificationType;
        this.h = j;
        this.i = m280Var;
        this.j = z2;
    }
}
