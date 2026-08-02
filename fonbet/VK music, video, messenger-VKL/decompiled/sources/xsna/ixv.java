package xsna;

import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import java.util.Map;
import kotlin.Pair;

/* compiled from: ImBgSyncStatus.kt */
/* loaded from: classes.dex */
public final class ixv {
    public static final ixv c;
    public static final ixv d;
    public static final ixv e;
    public final ImBgSyncState a;
    public final Map<LongPollType, ImBgSyncState> b;

    static {
        ImBgSyncState imBgSyncState = ImBgSyncState.DISCONNECTED;
        LongPollType longPollType = LongPollType.MESSAGES;
        Pair pair = new Pair(longPollType, imBgSyncState);
        LongPollType longPollType2 = LongPollType.CHANNELS;
        c = new ixv(imBgSyncState, pn00.k(pair, new Pair(longPollType2, imBgSyncState)));
        ImBgSyncState imBgSyncState2 = ImBgSyncState.CONNECTING;
        d = new ixv(imBgSyncState2, pn00.k(new Pair(longPollType, imBgSyncState2), new Pair(longPollType2, imBgSyncState2)));
        ImBgSyncState imBgSyncState3 = ImBgSyncState.CONNECTED;
        e = new ixv(imBgSyncState3, pn00.k(new Pair(longPollType, imBgSyncState3), new Pair(longPollType2, imBgSyncState3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ixv(ImBgSyncState imBgSyncState, Map<LongPollType, ? extends ImBgSyncState> map) {
        this.a = imBgSyncState;
        this.b = map;
    }

    public final ImBgSyncState a(LongPollType longPollType) {
        ImBgSyncState imBgSyncState = this.b.get(longPollType);
        return imBgSyncState == null ? ImBgSyncState.DISCONNECTED : imBgSyncState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixv)) {
            return false;
        }
        ixv ixvVar = (ixv) obj;
        return this.a == ixvVar.a && epx.f(this.b, ixvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImBgSyncStatus(composed=");
        sb.append(this.a);
        sb.append(", typesMap=");
        return cjl0.a(sb, this.b, ')');
    }
}
