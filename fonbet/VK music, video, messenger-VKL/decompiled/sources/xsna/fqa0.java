package xsna;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PixelStatsDeduplicatorImpl.kt */
/* loaded from: classes14.dex */
public final class fqa0 implements eqa0 {
    public final ConcurrentHashMap.KeySetView a = ConcurrentHashMap.newKeySet();

    @Override // xsna.eqa0
    public final void a(UUID uuid) {
        this.a.add(uuid);
    }

    @Override // xsna.eqa0
    public final boolean b(UUID uuid) {
        return this.a.contains(uuid);
    }
}
