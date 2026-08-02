package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityEvent.kt */
/* loaded from: classes5.dex */
public final class f2h {
    public final UserId a;
    public final String b;
    public final String c;

    public f2h(UserId userId, String str, String str2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2h)) {
            return false;
        }
        f2h f2hVar = (f2h) obj;
        return epx.f(this.a, f2hVar.a) && epx.f(this.b, f2hVar.b) && epx.f(this.c, f2hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityEvent(id=");
        sb.append(this.a);
        sb.append(", photoBase=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }
}
