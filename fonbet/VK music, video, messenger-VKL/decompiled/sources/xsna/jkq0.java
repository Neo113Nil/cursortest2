package xsna;

import ru.ok.gleffects.dto.UserGender;

/* compiled from: UserInfoRawDto.kt */
/* loaded from: classes16.dex */
public final class jkq0 {
    public final String a;
    public final String b;
    public final String c;
    public final UserGender d;
    public final int e;

    public jkq0(String str, String str2, String str3, UserGender userGender, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = userGender;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkq0)) {
            return false;
        }
        jkq0 jkq0Var = (jkq0) obj;
        return epx.f(this.a, jkq0Var.a) && epx.f(this.b, jkq0Var.b) && epx.f(this.c, jkq0Var.c) && this.d == jkq0Var.d && this.e == jkq0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfoRawDto(avatarUrl=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", userCity=");
        sb.append(this.c);
        sb.append(", userGender=");
        sb.append(this.d);
        sb.append(", userAge=");
        return vu5.b(sb, this.e, ')');
    }
}
