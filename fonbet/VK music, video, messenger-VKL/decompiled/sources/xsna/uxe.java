package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsProfileToolbarButton.kt */
/* loaded from: classes17.dex */
public final class uxe implements yxe {
    public final UserId b;

    public uxe(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxe) && epx.f(this.b, ((uxe) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("Promotion(ofUserId="), this.b, ')');
    }
}
