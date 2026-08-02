package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsViewerDbModel.kt */
/* loaded from: classes6.dex */
public final class rhm0 {
    public final UserId a;
    public final String b;
    public final String c;
    public final Image d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final Integer h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public rhm0(UserId userId, String str, String str2, Image image, String str3, boolean z, boolean z2, Integer num, boolean z3, boolean z4, boolean z5) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = image;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = num;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhm0)) {
            return false;
        }
        rhm0 rhm0Var = (rhm0) obj;
        return epx.f(this.a, rhm0Var.a) && epx.f(this.b, rhm0Var.b) && epx.f(this.c, rhm0Var.c) && epx.f(this.d, rhm0Var.d) && epx.f(this.e, rhm0Var.e) && this.f == rhm0Var.f && this.g == rhm0Var.g && epx.f(this.h, rhm0Var.h) && this.i == rhm0Var.i && this.j == rhm0Var.j && this.k == rhm0Var.k;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
        Image image = this.d;
        int b = qoy.b(qoy.b(urd0.a((a + (image == null ? 0 : image.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Integer num = this.h;
        return Boolean.hashCode(this.k) + qoy.b(qoy.b((b + (num != null ? num.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsViewerDbModel(uid=");
        sb.append(this.a);
        sb.append(", fullName=");
        sb.append(this.b);
        sb.append(", firstName=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", photo=");
        sb.append(this.e);
        sb.append(", canMessage=");
        sb.append(this.f);
        sb.append(", isLiked=");
        sb.append(this.g);
        sb.append(", reactionId=");
        sb.append(this.h);
        sb.append(", isVerified=");
        sb.append(this.i);
        sb.append(", isTrending=");
        sb.append(this.j);
        sb.append(", isOauthVerified=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
