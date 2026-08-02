package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AlbumPaginationData.kt */
/* loaded from: classes5.dex */
public final class aj1 {
    public final UserId a;

    public aj1(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj1) && epx.f(this.a, ((aj1) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + shy.a(10, shy.a(0, shy.a(-6, Long.hashCode(this.a.b) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "AlbumPaginationData(userId=" + this.a + ", albumId=-6, offset=0, count=10, isReverse=true)";
    }
}
