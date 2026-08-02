package xsna;

import com.vk.dto.common.EntitySyncState;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FriendsMutual.kt */
/* loaded from: classes2.dex */
public final class ers {
    public static final ers g = new ers(EmptyList.b, EntitySyncState.ACTUAL, 0, false, new ProfilesInfo(), 32, 0);
    public final List<Peer> a;
    public final EntitySyncState b;
    public final long c;
    public final boolean d;
    public final ProfilesInfo e;
    public final int f;

    public ers() {
        this(null, null, 0L, false, null, 63, 0);
    }

    public static ers a(ers ersVar, List list, ProfilesInfo profilesInfo, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = ersVar.a;
        }
        List list2 = list;
        EntitySyncState entitySyncState = ersVar.b;
        long j = ersVar.c;
        boolean z = ersVar.d;
        if ((i2 & 16) != 0) {
            profilesInfo = ersVar.e;
        }
        ProfilesInfo profilesInfo2 = profilesInfo;
        if ((i2 & 32) != 0) {
            i = ersVar.f;
        }
        return new ers(list2, entitySyncState, j, z, profilesInfo2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ers)) {
            return false;
        }
        ers ersVar = (ers) obj;
        return epx.f(this.a, ersVar.a) && this.b == ersVar.b && this.c == ersVar.c && this.d == ersVar.d && epx.f(this.e, ersVar.e) && this.f == ersVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ur.b(this.e, qoy.b(bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsMutual(items=");
        sb.append(this.a);
        sb.append(", itemsSyncState=");
        sb.append(this.b);
        sb.append(", itemsSyncTime=");
        sb.append(this.c);
        sb.append(", itemsRefreshed=");
        sb.append(this.d);
        sb.append(", profiles=");
        sb.append(this.e);
        sb.append(", count=");
        return vu5.b(sb, this.f, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ers(List<? extends Peer> list, EntitySyncState entitySyncState, long j, boolean z, ProfilesInfo profilesInfo, int i) {
        this.a = list;
        this.b = entitySyncState;
        this.c = j;
        this.d = z;
        this.e = profilesInfo;
        this.f = i;
    }

    public ers(List list, EntitySyncState entitySyncState, long j, boolean z, ProfilesInfo profilesInfo, int i, int i2) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? EntitySyncState.MISSED : entitySyncState, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new ProfilesInfo() : profilesInfo, 0);
    }
}
