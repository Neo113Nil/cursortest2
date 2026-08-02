package xsna;

import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.strictmode.Violation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.source.i;
import com.android.billingclient.api.Purchase;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedItemId;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedWallItemId;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import xsna.o1d0;
import xsna.q1d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fwq implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fwq(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ehp0 ehp0Var;
        switch (this.b) {
            case 0:
                NewsEntry newsEntry = (NewsEntry) this.c;
                iwq iwqVar = (iwq) this.d;
                UserId o = k9q0.o(newsEntry);
                int n = di60.n(newsEntry);
                iwqVar.s.add(new MobileOfficialAppsFeedStat$FeedItemId(newsEntry.Db(), (epx.f(o, UserId.d) || n == 0) ? null : new MobileOfficialAppsFeedStat$FeedWallItemId(Long.valueOf(o.b), Integer.valueOf(n)), null, 4, null));
                return;
            case 1:
                String str = (String) this.c;
                Violation violation = (Violation) this.d;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
                throw violation;
            case 2:
                ((com.vk.billing.h) this.c).m(false, (Purchase) this.d);
                return;
            case 3:
                q1d0.d dVar = (q1d0.d) this.c;
                androidx.media3.exoplayer.source.h hVar = (androidx.media3.exoplayer.source.h) this.d;
                q1d0 q1d0Var = q1d0.this;
                if (q1d0Var.E()) {
                    return;
                }
                o1d0 o1d0Var = (o1d0) hVar;
                qfp0 trackGroups = o1d0Var.b.getTrackGroups();
                Pair<o1d0, q1d0.b> pair = q1d0Var.x;
                pair.getClass();
                q1d0.b bVar = (q1d0.b) pair.second;
                try {
                    ao80 ao80Var = q1d0Var.m;
                    androidx.media3.exoplayer.k[] kVarArr = q1d0Var.o;
                    i.b bVar2 = bVar.a;
                    ewo0 ewo0Var = q1d0Var.w;
                    ewo0Var.getClass();
                    ehp0Var = ao80Var.g(kVarArr, trackGroups, bVar2, ewo0Var);
                } catch (ExoPlaybackException e) {
                    ahn.o("PreloadMediaSource", "Failed to select tracks", e);
                    ehp0Var = null;
                }
                if (ehp0Var == null) {
                    q1d0Var.G();
                    return;
                }
                d7q[] d7qVarArr = ehp0Var.c;
                long j = dVar.b;
                m0h0[] m0h0VarArr = new m0h0[d7qVarArr.length];
                boolean[] zArr = new boolean[d7qVarArr.length];
                boolean[] zArr2 = new boolean[d7qVarArr.length];
                o1d0Var.f = new o1d0.a(d7qVarArr, zArr2, m0h0VarArr, zArr, o1d0Var.b(d7qVarArr, zArr2, m0h0VarArr, zArr, j));
                if (!q1d0Var.l.f(q1d0Var)) {
                    q1d0Var.G();
                    return;
                }
                f.a aVar = new f.a();
                aVar.a = dVar.b;
                o1d0Var.k(new androidx.media3.exoplayer.f(aVar));
                return;
            default:
                SessionRoomListenerManagerImpl.onCurrentParticipantActiveRoomChanged$lambda$0((SessionRoomListenerManagerImpl) this.c, (CallSessionRoomsListener.ActiveRoomChangedParams) this.d);
                return;
        }
    }
}
