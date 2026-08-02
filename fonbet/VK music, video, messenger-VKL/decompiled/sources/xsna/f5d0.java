package xsna;

import com.vk.im.engine.models.users.User;
import java.util.ArrayList;

/* compiled from: PreviewProfileData.kt */
/* loaded from: classes2.dex */
public final class f5d0 {
    public final User a;
    public final ArrayList b;
    public final int c;
    public final boolean d;

    public f5d0(User user, ArrayList arrayList, int i, boolean z) {
        this.a = user;
        this.b = arrayList;
        this.c = i;
        this.d = z;
    }

    public static f5d0 a(f5d0 f5d0Var, User user, boolean z, int i) {
        if ((i & 1) != 0) {
            user = f5d0Var.a;
        }
        ArrayList arrayList = f5d0Var.b;
        int i2 = f5d0Var.c;
        if ((i & 8) != 0) {
            z = f5d0Var.d;
        }
        f5d0Var.getClass();
        return new f5d0(user, arrayList, i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5d0)) {
            return false;
        }
        f5d0 f5d0Var = (f5d0) obj;
        return epx.f(this.a, f5d0Var.a) && this.b.equals(f5d0Var.b) && this.c == f5d0Var.c && this.d == f5d0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, qr.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewProfileData(user=");
        sb.append(this.a);
        sb.append(", mutualFriends=");
        sb.append(this.b);
        sb.append(", totalMutualFriends=");
        sb.append(this.c);
        sb.append(", isButtonLoading=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
