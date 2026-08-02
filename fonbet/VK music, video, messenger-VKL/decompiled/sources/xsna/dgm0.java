package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;

/* compiled from: StoryStatisticsQuestionDbModel.kt */
/* loaded from: classes6.dex */
public final class dgm0 {
    public final UserId a;
    public final String b;
    public final String c;
    public final Image d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;

    public dgm0(UserId userId, String str, String str2, Image image, String str3, boolean z, String str4, String str5) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = image;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgm0)) {
            return false;
        }
        dgm0 dgm0Var = (dgm0) obj;
        return epx.f(this.a, dgm0Var.a) && epx.f(this.b, dgm0Var.b) && epx.f(this.c, dgm0Var.c) && epx.f(this.d, dgm0Var.d) && epx.f(this.e, dgm0Var.e) && this.f == dgm0Var.f && epx.f(this.g, dgm0Var.g) && epx.f(this.h, dgm0Var.h);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
        Image image = this.d;
        int b = qoy.b(urd0.a((a + (image == null ? 0 : image.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsQuestionUserProfileDbModel(uid=");
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
        sb.append(", firstNameGen=");
        sb.append(this.g);
        sb.append(", fullNameAcc=");
        return ho8.a(sb, this.h, ')');
    }
}
