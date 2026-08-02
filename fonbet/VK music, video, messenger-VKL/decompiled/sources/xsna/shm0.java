package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsViewerEntity.kt */
/* loaded from: classes6.dex */
public final class shm0 {
    public final int a;
    public final UserId b;
    public final int c;
    public final UserId d;
    public final rhm0 e;

    public shm0(int i, UserId userId, int i2, UserId userId2, rhm0 rhm0Var) {
        this.a = i;
        this.b = userId;
        this.c = i2;
        this.d = userId2;
        this.e = rhm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shm0)) {
            return false;
        }
        shm0 shm0Var = (shm0) obj;
        return this.a == shm0Var.a && epx.f(this.b, shm0Var.b) && this.c == shm0Var.c && epx.f(this.d, shm0Var.d) && epx.f(this.e, shm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + bh10.a(shy.a(this.c, bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31), 31, this.d.b);
    }

    public final String toString() {
        return "StoryStatisticsViewerEntity(ordinalId=" + this.a + ", ownerId=" + this.b + ", storyId=" + this.c + ", userId=" + this.d + ", storyStatisticsViewer=" + this.e + ')';
    }
}
