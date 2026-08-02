package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommentsListContract.kt */
/* loaded from: classes3.dex */
public final class zeg {
    public final iag a;
    public final UserId b;
    public final int c;

    public zeg(int i, UserId userId, iag iagVar) {
        this.a = iagVar;
        this.b = userId;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeg)) {
            return false;
        }
        zeg zegVar = (zeg) obj;
        return epx.f(this.a, zegVar.a) && epx.f(this.b, zegVar.b) && this.c == zegVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentChangedEvent(comment=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", itemId=");
        return vu5.b(sb, this.c, ')');
    }
}
