package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsInfoEntity.kt */
/* loaded from: classes6.dex */
public final class ffm0 {
    public final UserId a;
    public final int b;
    public final efm0 c;

    public ffm0(UserId userId, int i, efm0 efm0Var) {
        this.a = userId;
        this.b = i;
        this.c = efm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffm0)) {
            return false;
        }
        ffm0 ffm0Var = (ffm0) obj;
        return epx.f(this.a, ffm0Var.a) && this.b == ffm0Var.b && epx.f(this.c, ffm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        return "StoryStatisticsInfoEntity(ownerId=" + this.a + ", storyId=" + this.b + ", storyStatisticsInfo=" + this.c + ')';
    }
}
