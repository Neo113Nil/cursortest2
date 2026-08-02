package xsna;

import com.vk.dto.common.EntitySyncState;
import java.util.List;

/* compiled from: FriendsSuggestions.kt */
/* loaded from: classes2.dex */
public final class rts {
    public final List<qtd0> a;
    public final EntitySyncState b;
    public final long c;

    /* JADX WARN: Multi-variable type inference failed */
    public rts(List<? extends qtd0> list, EntitySyncState entitySyncState, long j) {
        this.a = list;
        this.b = entitySyncState;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rts)) {
            return false;
        }
        rts rtsVar = (rts) obj;
        return epx.f(this.a, rtsVar.a) && this.b == rtsVar.b && this.c == rtsVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsSuggestions(profiles=");
        sb.append(this.a);
        sb.append(", syncState=");
        sb.append(this.b);
        sb.append(", syncTime=");
        return vu5.a(')', this.c, sb);
    }
}
