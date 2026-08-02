package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AuthBridge.kt */
/* loaded from: classes15.dex */
public final class t200 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final UserId d;
    public final boolean e;
    public final String f;

    public t200(UserId userId, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = userId;
        this.e = z3;
        this.f = str2;
    }

    public final String a() {
        return this.a;
    }

    public final UserId b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t200)) {
            return false;
        }
        t200 t200Var = (t200) obj;
        return epx.f(this.a, t200Var.a) && this.b == t200Var.b && this.c == t200Var.c && epx.f(this.d, t200Var.d) && this.e == t200Var.e && epx.f(this.f, t200Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 961, this.c), 31, this.d.b), 31, this.e);
        String str = this.f;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogoutData(reason=");
        sb.append(this.a);
        sb.append(", sendAnalytics=");
        sb.append(this.b);
        sb.append(", awaitCleanup=");
        sb.append(this.c);
        sb.append(", banInfo=null, userId=");
        sb.append(this.d);
        sb.append(", shouldLoadUserExchangeData=");
        sb.append(this.e);
        sb.append(", methodName=");
        return ho8.a(sb, this.f, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ t200(int i, UserId userId, String str, String str2, boolean z, boolean z2, boolean z3) {
        this((i & 16) != 0 ? o25.a().c() : userId, str, (i & 64) != 0 ? null : str2, z, z2, (i & 32) != 0 ? true : z3);
        z = (i & 2) != 0 ? true : z;
        z2 = (i & 4) != 0 ? false : z2;
    }
}
