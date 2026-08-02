package xsna;

import com.vk.newsfeed.impl.data.database.entity.action.ActionWithOfflineSupportTypeEntity;
import com.vk.newsfeed.impl.data.database.entity.action.SyncStatusEntity;

/* compiled from: ActionWithOfflineSupportEntity.kt */
/* loaded from: classes.dex */
public final class a70 {
    public static final SyncStatusEntity h = SyncStatusEntity.NOT_SYNCED;
    public final long a;
    public final Object b;
    public final ActionWithOfflineSupportTypeEntity c;
    public final SyncStatusEntity d;
    public final Object e;
    public final Object f;
    public final int g;

    public a70(long j, Object obj, ActionWithOfflineSupportTypeEntity actionWithOfflineSupportTypeEntity, SyncStatusEntity syncStatusEntity, Object obj2, Object obj3, int i) {
        this.a = j;
        this.b = obj;
        this.c = actionWithOfflineSupportTypeEntity;
        this.d = syncStatusEntity;
        this.e = obj2;
        this.f = obj3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a70)) {
            return false;
        }
        a70 a70Var = (a70) obj;
        return b70.a(this.a, a70Var.a) && epx.f(this.b, a70Var.b) && this.c == a70Var.c && this.d == a70Var.d && epx.f(this.e, a70Var.e) && epx.f(this.f, a70Var.f) && this.g == a70Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + vul0.a(b70.b(this.a) * 31, 31, this.b)) * 31)) * 31;
        Object obj = this.e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f;
        return Integer.hashCode(this.g) + ((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionWithOfflineSupportEntity(id=");
        sb.append((Object) b70.c(this.a));
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", actionType=");
        sb.append(this.c);
        sb.append(", syncStatus=");
        sb.append(this.d);
        sb.append(", syncResult=");
        sb.append(this.e);
        sb.append(", lastSyncError=");
        sb.append(this.f);
        sb.append(", syncAttemptCount=");
        return vu5.b(sb, this.g, ')');
    }
}
