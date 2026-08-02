package xsna;

import com.vk.ecomm.reviews.model.reviewfriends.ReviewFriendsModel;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ReviewFriendsState.kt */
/* loaded from: classes18.dex */
public final class thg0 implements km50 {
    public final int b;
    public final List<ReviewFriendsModel> c;
    public final Throwable d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;

    public thg0() {
        this(0);
    }

    public static thg0 a(thg0 thg0Var, List list, Throwable th, boolean z, boolean z2, boolean z3, int i) {
        int i2 = thg0Var.b;
        if ((i & 2) != 0) {
            list = thg0Var.c;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            th = thg0Var.d;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            z = thg0Var.e;
        }
        boolean z4 = z;
        boolean z5 = (i & 64) != 0 ? thg0Var.h : false;
        int i3 = (i & 128) != 0 ? thg0Var.i : 0;
        thg0Var.getClass();
        return new thg0(i2, list2, th2, z4, z2, z3, z5, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thg0)) {
            return false;
        }
        thg0 thg0Var = (thg0) obj;
        return this.b == thg0Var.b && epx.f(this.c, thg0Var.c) && epx.f(this.d, thg0Var.d) && this.e == thg0Var.e && this.f == thg0Var.f && this.g == thg0Var.g && this.h == thg0Var.h && this.i == thg0Var.i;
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.b) * 31, 31, this.c);
        Throwable th = this.d;
        return Integer.hashCode(this.i) + qoy.b(qoy.b(qoy.b(qoy.b((a + (th == null ? 0 : th.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewFriendsState(totalCount=");
        sb.append(this.b);
        sb.append(", friends=");
        sb.append(this.c);
        sb.append(", errorLoading=");
        sb.append(this.d);
        sb.append(", isLoading=");
        sb.append(this.e);
        sb.append(", isNextPageLoading=");
        sb.append(this.f);
        sb.append(", isPaginationError=");
        sb.append(this.g);
        sb.append(", hasNext=");
        sb.append(this.h);
        sb.append(", nextOffset=");
        return vu5.b(sb, this.i, ')');
    }

    public thg0(int i, List<ReviewFriendsModel> list, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.b = i;
        this.c = list;
        this.d = th;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = i2;
    }

    public thg0(int i) {
        this(0, EmptyList.b, null, false, false, false, false, 0);
    }
}
