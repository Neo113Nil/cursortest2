package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: StoriesAskQuestion.kt */
/* loaded from: classes15.dex */
public final class zpl0 {
    public final UserId a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public zpl0(UserId userId, boolean z, boolean z2, String str, int i) {
        this.a = userId;
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpl0)) {
            return false;
        }
        zpl0 zpl0Var = (zpl0) obj;
        return epx.f(this.a, zpl0Var.a) && this.b == zpl0Var.b && epx.f(this.c, zpl0Var.c) && this.d == zpl0Var.d && this.e == zpl0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(urd0.a(shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesAskQuestionRequestParams(ownerId=");
        sb.append(this.a);
        sb.append(", storyId=");
        sb.append(this.b);
        sb.append(", question=");
        sb.append(this.c);
        sb.append(", isAnonymous=");
        sb.append(this.d);
        sb.append(", withMention=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
