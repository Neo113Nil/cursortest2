package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PostsAsyncData.kt */
/* loaded from: classes4.dex */
public final class c0c0 {
    public final UserId a;
    public final int b;
    public final boolean c;

    public c0c0(int i, UserId userId, boolean z) {
        this.a = userId;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0c0)) {
            return false;
        }
        c0c0 c0c0Var = (c0c0) obj;
        return epx.f(this.a, c0c0Var.a) && this.b == c0c0Var.b && this.c == c0c0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostActivityRequestDto(ownerId=");
        sb.append(this.a);
        sb.append(", postId=");
        sb.append(this.b);
        sb.append(", isClipPost=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
