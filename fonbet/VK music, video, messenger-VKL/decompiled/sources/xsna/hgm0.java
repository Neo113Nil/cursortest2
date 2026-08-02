package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsQuestionsMetaEntity.kt */
/* loaded from: classes6.dex */
public final class hgm0 {
    public final UserId a;
    public final int b;
    public final int c;

    public hgm0(UserId userId, int i, int i2) {
        this.a = userId;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgm0)) {
            return false;
        }
        hgm0 hgm0Var = (hgm0) obj;
        return epx.f(this.a, hgm0Var.a) && this.b == hgm0Var.b && this.c == hgm0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsQuestionsMetaEntity(ownerId=");
        sb.append(this.a);
        sb.append(", storyId=");
        sb.append(this.b);
        sb.append(", totalQuestionsCount=");
        return vu5.b(sb, this.c, ')');
    }
}
