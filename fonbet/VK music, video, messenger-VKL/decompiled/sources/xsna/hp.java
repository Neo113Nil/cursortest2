package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;

/* compiled from: AccountManagerData.kt */
/* loaded from: classes14.dex */
public final class hp {
    public final UserId a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final int g;
    public final String h;
    public final AccountProfileType i;
    public final UserId j;

    static {
        UserId.b bVar = UserId.c;
        AccountProfileType.a aVar = AccountProfileType.Companion;
    }

    public hp(UserId userId, String str, String str2, String str3, int i, long j, int i2, String str4, AccountProfileType accountProfileType, UserId userId2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = j;
        this.g = i2;
        this.h = str4;
        this.i = accountProfileType;
        this.j = userId2;
    }

    public static hp a(hp hpVar, String str, String str2, int i) {
        UserId userId = hpVar.a;
        String str3 = hpVar.b;
        if ((i & 4) != 0) {
            str = hpVar.c;
        }
        String str4 = hpVar.d;
        int i2 = hpVar.e;
        long j = hpVar.f;
        int i3 = hpVar.g;
        AccountProfileType accountProfileType = hpVar.i;
        UserId userId2 = hpVar.j;
        hpVar.getClass();
        return new hp(userId, str3, str, str4, i2, j, i3, str2, accountProfileType, userId2);
    }

    public final String b() {
        return this.c;
    }

    public final AccountProfileType c() {
        return this.i;
    }

    public final long d() {
        return this.f;
    }

    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return epx.f(this.a, hpVar.a) && epx.f(this.b, hpVar.b) && epx.f(this.c, hpVar.c) && epx.f(this.d, hpVar.d) && this.e == hpVar.e && this.f == hpVar.f && this.g == hpVar.g && epx.f(this.h, hpVar.h) && this.i == hpVar.i && epx.f(this.j, hpVar.j);
    }

    public final int f() {
        return this.e;
    }

    public final UserId g() {
        return this.j;
    }

    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (this.i.hashCode() + urd0.a(shy.a(this.g, bh10.a(shy.a(this.e, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f), 31), 31, this.h)) * 31;
        UserId userId = this.j;
        return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String i() {
        return this.d;
    }

    public final UserId j() {
        return this.a;
    }

    public final String k() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountManagerData(uid=");
        sb.append(this.a);
        sb.append(", username=");
        sb.append(this.b);
        sb.append(", accessToken=");
        sb.append(this.c);
        sb.append(", secret=");
        sb.append(this.d);
        sb.append(", expiresInSec=");
        sb.append(this.e);
        sb.append(", createdMs=");
        sb.append(this.f);
        sb.append(", ordinal=");
        sb.append(this.g);
        sb.append(", exchangeToken=");
        sb.append(this.h);
        sb.append(", accountProfileType=");
        sb.append(this.i);
        sb.append(", masterAccountId=");
        return gp.b(sb, this.j, ')');
    }
}
