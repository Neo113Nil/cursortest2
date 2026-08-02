package xsna;

import android.os.SystemClock;
import com.vk.dto.common.id.UserId;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AudienceResearchRemoteRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class ra4 {
    public final wy2 a;
    public final ConcurrentHashMap<SchemeStat$TypeDevNullItem, Long> b = new ConcurrentHashMap<>();

    public ra4(wy2 wy2Var) {
        this.a = wy2Var;
    }

    public final io.reactivex.rxjava3.core.a a(UserId userId, String str) {
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.AUDIENCE_RESEARCH.h(), null, String.valueOf(userId.b), null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
        ConcurrentHashMap<SchemeStat$TypeDevNullItem, Long> concurrentHashMap = this.b;
        Long l = concurrentHashMap.get(schemeStat$TypeDevNullItem);
        if (l != null) {
            if (SystemClock.elapsedRealtime() - l.longValue() < 1000) {
                return io.reactivex.rxjava3.core.a.k(new IllegalStateException("The event " + userId + '_' + str + " was tracked less than 1000 ago"));
            }
            concurrentHashMap.remove(schemeStat$TypeDevNullItem);
        }
        concurrentHashMap.put(schemeStat$TypeDevNullItem, Long.valueOf(SystemClock.elapsedRealtime()));
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        return io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.qa4
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                Iterator<Map.Entry<SchemeStat$TypeDevNullItem, Long>> it = ra4.this.b.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().longValue() < elapsedRealtime) {
                        it.remove();
                    }
                }
            }
        }).c(io.reactivex.rxjava3.core.a.l(new oa4(schemeStat$TypeDevNullItem, 0)));
    }
}
