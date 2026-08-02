package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsProfileToolbarButton.kt */
/* loaded from: classes17.dex */
public final class vxe implements yxe {
    public final UserId b;

    public vxe(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxe) && epx.f(this.b, ((vxe) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("Statistics(ofUserId="), this.b, ')');
    }
}
