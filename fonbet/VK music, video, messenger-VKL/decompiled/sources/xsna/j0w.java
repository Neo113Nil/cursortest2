package xsna;

import android.graphics.Bitmap;
import com.vk.dto.common.Peer;

/* compiled from: ImDialogShortcutArgs.kt */
/* loaded from: classes2.dex */
public final class j0w {
    public final long a;
    public final String b;
    public final Bitmap c;
    public final long d;
    public final Peer e;

    public j0w(long j, String str, Bitmap bitmap, long j2, Peer peer) {
        this.a = j;
        this.b = str;
        this.c = bitmap;
        this.d = j2;
        this.e = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0w)) {
            return false;
        }
        j0w j0wVar = (j0w) obj;
        return this.a == j0wVar.a && epx.f(this.b, j0wVar.b) && epx.f(this.c, j0wVar.c) && this.d == j0wVar.d && epx.f(this.e, j0wVar.e);
    }

    public final int hashCode() {
        int a = bh10.a((this.c.hashCode() + urd0.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
        Peer peer = this.e;
        return a + (peer == null ? 0 : Long.hashCode(peer.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImDialogShortcutArgs(dialogId=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", currentUserId=");
        sb.append(this.d);
        sb.append(", groupId=");
        return eq.a(sb, this.e, ')');
    }
}
