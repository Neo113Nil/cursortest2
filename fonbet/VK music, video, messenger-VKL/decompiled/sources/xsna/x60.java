package xsna;

import com.vk.newsfeed.impl.domain.model.ActionWithOfflineSupportType;
import com.vk.newsfeed.impl.domain.model.SyncStatus;

/* compiled from: ActionWithOfflineSupport.kt */
/* loaded from: classes4.dex */
public final class x60 {
    public final long a;
    public final Object b;
    public final ActionWithOfflineSupportType c;
    public final SyncStatus d;
    public final int e;

    public x60(long j, Object obj, ActionWithOfflineSupportType actionWithOfflineSupportType, SyncStatus syncStatus, int i) {
        this.a = j;
        this.b = obj;
        this.c = actionWithOfflineSupportType;
        this.d = syncStatus;
        this.e = i;
    }

    public final Object a() {
        return this.b;
    }

    public final ActionWithOfflineSupportType b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final int d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x60)) {
            return false;
        }
        x60 x60Var = (x60) obj;
        return b70.a(this.a, x60Var.a) && this.b.equals(x60Var.b) && this.c == x60Var.c && this.d == x60Var.d && this.e == x60Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + vul0.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 29791);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionWithOfflineSupport(id=");
        sb.append((Object) b70.c(this.a));
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", actionType=");
        sb.append(this.c);
        sb.append(", syncStatus=");
        sb.append(this.d);
        sb.append(", syncResult=null, lastSyncError=null, syncAttemptCount=");
        return vu5.b(sb, this.e, ')');
    }
}
