package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsQuestionDbModel.kt */
/* loaded from: classes6.dex */
public final class bgm0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final dgm0 f;
    public final boolean g;
    public final boolean h;
    public final int i;

    public bgm0(int i, UserId userId, String str, boolean z, boolean z2, dgm0 dgm0Var, boolean z3, boolean z4, int i2) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = dgm0Var;
        this.g = z3;
        this.h = z4;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgm0)) {
            return false;
        }
        bgm0 bgm0Var = (bgm0) obj;
        return this.a == bgm0Var.a && epx.f(this.b, bgm0Var.b) && epx.f(this.c, bgm0Var.c) && this.d == bgm0Var.d && this.e == bgm0Var.e && epx.f(this.f, bgm0Var.f) && this.g == bgm0Var.g && this.h == bgm0Var.h && this.i == bgm0Var.i;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        UserId userId = this.b;
        int b = qoy.b(qoy.b(urd0.a((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.c), 31, this.d), 31, this.e);
        dgm0 dgm0Var = this.f;
        return Integer.hashCode(this.i) + qoy.b(qoy.b((b + (dgm0Var != null ? dgm0Var.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsQuestionDbModel(questionId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", question=");
        sb.append(this.c);
        sb.append(", isAnonymous=");
        sb.append(this.d);
        sb.append(", isOwnerBlocked=");
        sb.append(this.e);
        sb.append(", profile=");
        sb.append(this.f);
        sb.append(", isPublished=");
        sb.append(this.g);
        sb.append(", withMention=");
        sb.append(this.h);
        sb.append(", date=");
        return vu5.b(sb, this.i, ')');
    }
}
