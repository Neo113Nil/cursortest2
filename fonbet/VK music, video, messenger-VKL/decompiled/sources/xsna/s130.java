package xsna;

import android.os.Bundle;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Counters;
import java.util.List;

/* compiled from: ModalPostReactionsState.kt */
/* loaded from: classes4.dex */
public final class s130 implements km50 {
    public final long b;
    public final UserId c;
    public final String d;
    public final LikesGetList.Type e;
    public final Counters f;
    public final List<v130> g;
    public final Bundle h;
    public final UserId i;
    public final String j;
    public final boolean k;
    public final boolean l;

    public s130(long j, UserId userId, String str, LikesGetList.Type type, Counters counters, List<v130> list, Bundle bundle, UserId userId2, String str2, boolean z, boolean z2) {
        this.b = j;
        this.c = userId;
        this.d = str;
        this.e = type;
        this.f = counters;
        this.g = list;
        this.h = bundle;
        this.i = userId2;
        this.j = str2;
        this.k = z;
        this.l = z2;
    }

    public static s130 a(s130 s130Var, long j, UserId userId, String str, LikesGetList.Type type, Counters counters, List list, UserId userId2, String str2, boolean z, boolean z2, int i) {
        long j2 = (i & 1) != 0 ? s130Var.b : j;
        UserId userId3 = (i & 2) != 0 ? s130Var.c : userId;
        String str3 = (i & 4) != 0 ? s130Var.d : str;
        LikesGetList.Type type2 = (i & 8) != 0 ? s130Var.e : type;
        Counters counters2 = (i & 16) != 0 ? s130Var.f : counters;
        Bundle bundle = s130Var.h;
        UserId userId4 = (i & 128) != 0 ? s130Var.i : userId2;
        String str4 = (i & 256) != 0 ? s130Var.j : str2;
        boolean z3 = (i & 512) != 0 ? s130Var.k : z;
        boolean z4 = (i & 1024) != 0 ? s130Var.l : z2;
        s130Var.getClass();
        return new s130(j2, userId3, str3, type2, counters2, list, bundle, userId4, str4, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s130)) {
            return false;
        }
        s130 s130Var = (s130) obj;
        return this.b == s130Var.b && epx.f(this.c, s130Var.c) && epx.f(this.d, s130Var.d) && this.e == s130Var.e && epx.f(this.f, s130Var.f) && epx.f(this.g, s130Var.g) && epx.f(this.h, s130Var.h) && epx.f(this.i, s130Var.i) && epx.f(this.j, s130Var.j) && this.k == s130Var.k && this.l == s130Var.l;
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
        String str = this.d;
        int hashCode = (this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Counters counters = this.f;
        int hashCode2 = (this.h.hashCode() + fw3.a((hashCode + (counters == null ? 0 : counters.hashCode())) * 31, 31, this.g)) * 31;
        UserId userId = this.i;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str2 = this.j;
        return Boolean.hashCode(this.l) + qoy.b((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalPostReactionsState(itemId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", trackCode=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", counters=");
        sb.append(this.f);
        sb.append(", tabs=");
        sb.append(this.g);
        sb.append(", arguments=");
        sb.append(this.h);
        sb.append(", publisherId=");
        sb.append(this.i);
        sb.append(", oneTimeDonutMiniAppUrl=");
        sb.append(this.j);
        sb.append(", isLoading=");
        sb.append(this.k);
        sb.append(", isError=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
