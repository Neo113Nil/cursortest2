package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoProfileComponentParams.kt */
/* loaded from: classes6.dex */
public final class l7t0 implements l9i {
    public final UserId a;

    public l7t0(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7t0) && epx.f(this.a, ((l7t0) obj).a);
    }

    @Override // xsna.l9i
    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("VideoProfileComponentParams(userId="), this.a, ')');
    }
}
