package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsProfileToolbarButton.kt */
/* loaded from: classes17.dex */
public final class wxe implements yxe {
    public final UserId b;

    public wxe(UserId userId) {
        this.b = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxe) && epx.f(this.b, ((wxe) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("Message(toUserId="), this.b, ')');
    }
}
