package xsna;

import com.vkontakte.android.R;

/* compiled from: UnreadMessageConfig.kt */
/* loaded from: classes2.dex */
public final class h5q0 {
    public final int a;

    public h5q0() {
        this((Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5q0) && this.a == ((h5q0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("UnreadMessageConfig(unreadMessageRes="), this.a, ')');
    }

    public h5q0(int i) {
        this.a = i;
    }

    public /* synthetic */ h5q0(Object obj) {
        this(R.string.vkim_msg_list_unread);
    }
}
