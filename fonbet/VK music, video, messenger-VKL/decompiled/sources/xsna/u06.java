package xsna;

import com.vk.dto.common.id.UserId;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: BannedPage.kt */
/* loaded from: classes18.dex */
public final class u06 {
    public final int a;
    public final int b;
    public final List<UserId> c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;

    public u06(int i, int i2, List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = linkedHashMap;
        this.e = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u06)) {
            return false;
        }
        u06 u06Var = (u06) obj;
        return this.a == u06Var.a && this.b == u06Var.b && epx.f(this.c, u06Var.c) && this.d.equals(u06Var.d) && this.e.equals(u06Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + uf3.b(this.d, fw3.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        return "BannedPage(total=" + this.a + ", offset=" + this.b + ", ownerIds=" + this.c + ", profiles=" + this.d + ", groups=" + this.e + ')';
    }
}
