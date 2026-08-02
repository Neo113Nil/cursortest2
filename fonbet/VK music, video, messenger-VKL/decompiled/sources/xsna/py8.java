package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CachedSubscriptionEntity.kt */
/* loaded from: classes18.dex */
public final class py8 {
    public final UserId a;
    public final UserId b;
    public final String c;
    public final long d;
    public final long e;

    public py8(UserId userId, UserId userId2, String str, long j, long j2) {
        this.a = userId;
        this.b = userId2;
        this.c = str;
        this.d = j;
        this.e = j2;
    }

    public final long a() {
        return this.d;
    }

    public final UserId b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.e;
    }

    public final UserId e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py8)) {
            return false;
        }
        py8 py8Var = (py8) obj;
        return epx.f(this.a, py8Var.a) && epx.f(this.b, py8Var.b) && epx.f(this.c, py8Var.c) && this.d == py8Var.d && this.e == py8Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + bh10.a(urd0.a(bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedSubscriptionEntity(userId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", nextPaymentDate=");
        sb.append(this.d);
        sb.append(", updatedAt=");
        return vu5.a(')', this.e, sb);
    }
}
