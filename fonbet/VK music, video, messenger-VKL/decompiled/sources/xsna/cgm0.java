package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsQuestionEntity.kt */
/* loaded from: classes6.dex */
public final class cgm0 {
    public final UserId a;
    public final int b;
    public final int c;
    public final int d;
    public final bgm0 e;

    public cgm0(UserId userId, int i, int i2, int i3, bgm0 bgm0Var) {
        this.a = userId;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bgm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgm0)) {
            return false;
        }
        cgm0 cgm0Var = (cgm0) obj;
        return epx.f(this.a, cgm0Var.a) && this.b == cgm0Var.b && this.c == cgm0Var.c && this.d == cgm0Var.d && epx.f(this.e, cgm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, shy.a(this.c, shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "StoryStatisticsQuestionEntity(ownerId=" + this.a + ", storyId=" + this.b + ", questionId=" + this.c + ", date=" + this.d + ", storyStatisticsQuestion=" + this.e + ')';
    }
}
