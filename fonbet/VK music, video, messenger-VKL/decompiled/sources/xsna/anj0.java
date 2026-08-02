package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: SilentAuthExchangeData.kt */
/* loaded from: classes5.dex */
public final class anj0 {
    public final UserId a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public anj0(UserId userId, String str, String str2, String str3, String str4) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anj0)) {
            return false;
        }
        anj0 anj0Var = (anj0) obj;
        return epx.f(this.a, anj0Var.a) && epx.f(this.b, anj0Var.b) && epx.f(this.c, anj0Var.c) && epx.f(this.d, anj0Var.d) && epx.f(this.e, anj0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SilentAuthExchangeData(userId=");
        sb.append(this.a);
        sb.append(", uuid=");
        sb.append(this.b);
        sb.append(", hash=");
        sb.append(this.c);
        sb.append(", clientDeviceId=");
        sb.append(this.d);
        sb.append(", clientExternalDeviceId=");
        return ho8.a(sb, this.e, ')');
    }
}
