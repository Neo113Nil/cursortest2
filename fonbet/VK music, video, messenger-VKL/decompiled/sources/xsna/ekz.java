package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: LiveParams.kt */
/* loaded from: classes17.dex */
public final class ekz {
    public final UserId a;
    public final int b;

    public ekz(UserId userId, int i) {
        this.a = userId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekz)) {
            return false;
        }
        ekz ekzVar = (ekz) obj;
        return epx.f(this.a, ekzVar.a) && this.b == ekzVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveParams(userId=");
        sb.append(this.a);
        sb.append(", videoId=");
        return vu5.b(sb, this.b, ')');
    }
}
