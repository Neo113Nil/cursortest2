package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.ParserException;
import defpackage.au1;
import defpackage.egg;
import defpackage.gyc;
import defpackage.mgo;
import defpackage.ngo;
import defpackage.nsb;
import defpackage.ogg;
import defpackage.qyc0;
import defpackage.ryc0;
import defpackage.syc0;
import defpackage.tw21;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class PlayerEmsgHandler implements Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final au1 allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private long expiredManifestPublishTimeUs;
    private boolean isWaitingForManifestRefresh;
    private egg manifest;
    private final ryc0 playerEmsgCallback;
    private boolean released;
    private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs = new TreeMap<>();
    private final Handler handler = tw21.n(this);
    private final ngo decoder = new ngo();

    public PlayerEmsgHandler(egg eggVar, ryc0 ryc0Var, au1 au1Var) {
        this.manifest = eggVar;
        this.playerEmsgCallback = ryc0Var;
        this.allocator = au1Var;
    }

    private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long j) {
        return this.manifestPublishTimeToExpiryTimeUs.ceilingEntry(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getManifestPublishTimeMsInEmsg(mgo mgoVar) {
        try {
            return tw21.Z(tw21.p(mgoVar.x));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    private void handleManifestExpiredMessage(long j, long j2) {
        Long l = this.manifestPublishTimeToExpiryTimeUs.get(Long.valueOf(j2));
        if (l == null) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPlayerEmsgEvent(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
        if (this.chunkLoadedCompletedSinceLastManifestRefreshRequest) {
            this.isWaitingForManifestRefresh = true;
            this.chunkLoadedCompletedSinceLastManifestRefreshRequest = false;
            ogg oggVar = (ogg) ((gyc) this.playerEmsgCallback).a;
            oggVar.W.removeCallbacks(oggVar.P);
            oggVar.n();
        }
    }

    private void notifyManifestPublishTimeExpired() {
        ryc0 ryc0Var = this.playerEmsgCallback;
        long j = this.expiredManifestPublishTimeUs;
        ogg oggVar = (ogg) ((gyc) ryc0Var).a;
        long j2 = oggVar.i0;
        if (j2 == -9223372036854775807L || j2 < j) {
            oggVar.i0 = j;
        }
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
        Iterator<Map.Entry<Long, Long>> it = this.manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.manifest.publishTimeMs) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.released) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        qyc0 qyc0Var = (qyc0) message.obj;
        handleManifestExpiredMessage(qyc0Var.a, qyc0Var.b);
        return true;
    }

    public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
        egg eggVar = this.manifest;
        boolean z = false;
        if (!eggVar.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime = ceilingExpiryEntryForPublishTime(eggVar.publishTimeMs);
        if (ceilingExpiryEntryForPublishTime != null && ceilingExpiryEntryForPublishTime.getValue().longValue() < j) {
            this.expiredManifestPublishTimeUs = ceilingExpiryEntryForPublishTime.getKey().longValue();
            notifyManifestPublishTimeExpired();
            z = true;
        }
        if (z) {
            maybeNotifyDashManifestRefreshNeeded();
        }
        return z;
    }

    public syc0 newPlayerTrackEmsgHandler() {
        return new syc0(this, this.allocator);
    }

    public void onChunkLoadCompleted(nsb nsbVar) {
        this.chunkLoadedCompletedSinceLastManifestRefreshRequest = true;
    }

    public boolean onChunkLoadError(boolean z) {
        if (!this.manifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        if (!z) {
            return false;
        }
        maybeNotifyDashManifestRefreshNeeded();
        return true;
    }

    public void release() {
        this.released = true;
        this.handler.removeCallbacksAndMessages(null);
    }

    public void updateManifest(egg eggVar) {
        this.isWaitingForManifestRefresh = false;
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.manifest = eggVar;
        removePreviouslyExpiredManifestPublishTimeValues();
    }
}
