package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsViewersMetaEntity.kt */
/* loaded from: classes6.dex */
public final class bim0 {
    public final UserId a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public bim0(UserId userId, int i, int i2, int i3, int i4, int i5) {
        this.a = userId;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bim0)) {
            return false;
        }
        bim0 bim0Var = (bim0) obj;
        return epx.f(this.a, bim0Var.a) && this.b == bim0Var.b && this.c == bim0Var.c && this.d == bim0Var.d && this.e == bim0Var.e && this.f == bim0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsViewersMetaEntity(ownerId=");
        sb.append(this.a);
        sb.append(", storyId=");
        sb.append(this.b);
        sb.append(", viewsCount=");
        sb.append(this.c);
        sb.append(", answersCount=");
        sb.append(this.d);
        sb.append(", reactionsCount=");
        sb.append(this.e);
        sb.append(", newReactions=");
        return vu5.b(sb, this.f, ')');
    }
}
