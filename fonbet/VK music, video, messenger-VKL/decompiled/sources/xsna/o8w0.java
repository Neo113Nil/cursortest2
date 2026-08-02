package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VmojiEntityStorage.kt */
/* loaded from: classes7.dex */
public final class o8w0 implements mbw0 {
    public final UserId a;
    public final String b;
    public final long c;

    public o8w0(long j, UserId userId, String str) {
        this.a = userId;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8w0)) {
            return false;
        }
        o8w0 o8w0Var = (o8w0) obj;
        return epx.f(this.a, o8w0Var.a) && epx.f(this.b, o8w0Var.b) && this.c == o8w0Var.c;
    }

    @Override // xsna.mbw0
    public final String getFileName() {
        return this.b;
    }

    @Override // xsna.mbw0
    public final UserId getUserId() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiEntityStorage(userId=");
        sb.append(this.a);
        sb.append(", fileName=");
        sb.append(this.b);
        sb.append(", lastAccess=");
        return vu5.a(')', this.c, sb);
    }
}
