package xsna;

import com.vk.voip.dto.broadcast.VoipBroadcastStatus;
import java.util.Collection;

/* compiled from: VoipBroadcastInfo.kt */
/* loaded from: classes7.dex */
public final class dfw0 {
    public final String a;
    public final String b;
    public final String c;
    public final VoipBroadcastStatus d;
    public final Collection<eqw0> e;
    public final String f;
    public final long g;
    public final long h;
    public final int i;
    public final Integer j;
    public final Collection<qvw0> k;
    public final int l;
    public final int m;
    public final int n;
    public final Collection<qvw0> o;
    public final int p;
    public final boolean q;
    public final boolean r;

    /* JADX WARN: Multi-variable type inference failed */
    public dfw0(String str, String str2, String str3, VoipBroadcastStatus voipBroadcastStatus, Collection<eqw0> collection, String str4, long j, long j2, int i, Integer num, Collection<? extends qvw0> collection2, int i2, int i3, int i4, Collection<? extends qvw0> collection3, int i5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = voipBroadcastStatus;
        this.e = collection;
        this.f = str4;
        this.g = j;
        this.h = j2;
        this.i = i;
        this.j = num;
        this.k = collection2;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = collection3;
        this.p = i5;
        this.q = z;
        this.r = z2;
    }

    public static dfw0 a(dfw0 dfw0Var, VoipBroadcastStatus voipBroadcastStatus, long j, Integer num, Collection collection, int i, int i2) {
        String str = dfw0Var.a;
        String str2 = dfw0Var.b;
        String str3 = dfw0Var.c;
        VoipBroadcastStatus voipBroadcastStatus2 = (i2 & 8) != 0 ? dfw0Var.d : voipBroadcastStatus;
        return new dfw0(str, str2, str3, voipBroadcastStatus2, dfw0Var.e, dfw0Var.f, dfw0Var.g, (i2 & 128) != 0 ? dfw0Var.h : j, dfw0Var.i, num, collection, dfw0Var.l, (i2 & 4096) != 0 ? dfw0Var.m : i, dfw0Var.n, dfw0Var.o, dfw0Var.p, dfw0Var.q, dfw0Var.r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfw0)) {
            return false;
        }
        dfw0 dfw0Var = (dfw0) obj;
        return epx.f(this.a, dfw0Var.a) && epx.f(this.b, dfw0Var.b) && epx.f(this.c, dfw0Var.c) && this.d == dfw0Var.d && epx.f(this.e, dfw0Var.e) && epx.f(this.f, dfw0Var.f) && this.g == dfw0Var.g && this.h == dfw0Var.h && this.i == dfw0Var.i && epx.f(this.j, dfw0Var.j) && epx.f(this.k, dfw0Var.k) && this.l == dfw0Var.l && this.m == dfw0Var.m && this.n == dfw0Var.n && epx.f(this.o, dfw0Var.o) && this.p == dfw0Var.p && this.q == dfw0Var.q && this.r == dfw0Var.r;
    }

    public final int hashCode() {
        int a = shy.a(this.i, bh10.a(bh10.a(urd0.a(s3j0.a((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, this.e, 31), 31, this.f), 31, this.g), 31, this.h), 31);
        Integer num = this.j;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Collection<qvw0> collection = this.k;
        return Boolean.hashCode(this.r) + qoy.b(shy.a(this.p, s3j0.a(shy.a(this.n, shy.a(this.m, shy.a(this.l, (hashCode + (collection != null ? collection.hashCode() : 0)) * 31, 31), 31), 31), this.o, 31), 31), 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipBroadcastInfo(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", streamId=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", images=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", timeStartMs=");
        sb.append(this.g);
        sb.append(", durationMs=");
        sb.append(this.h);
        sb.append(", viewsTotalCount=");
        sb.append(this.i);
        sb.append(", viewsUniqueCount=");
        sb.append(this.j);
        sb.append(", viewsByFriends=");
        sb.append(this.k);
        sb.append(", likesCount=");
        sb.append(this.l);
        sb.append(", commentsCount=");
        sb.append(this.m);
        sb.append(", repostsCount=");
        sb.append(this.n);
        sb.append(", spectators=");
        sb.append(this.o);
        sb.append(", spectatorsCount=");
        sb.append(this.p);
        sb.append(", canRepost=");
        sb.append(this.q);
        sb.append(", canAttachLink=");
        return defpackage.q0.a(sb, this.r, ')');
    }
}
