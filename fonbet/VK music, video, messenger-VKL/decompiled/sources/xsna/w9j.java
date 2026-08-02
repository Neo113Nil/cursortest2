package xsna;

import android.os.HandlerThread;
import android.util.Log;
import android.util.Pair;
import androidx.media3.exoplayer.source.i;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Ya;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vk.dto.music.Playlist;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import java.util.ArrayList;
import java.util.Objects;
import org.webrtc.SessionDescription;
import ru.ok.android.webrtc.PeerConnectionClient;
import xsna.ewo0;
import xsna.hul;
import xsna.q1d0;
import xsna.q1d0.d;
import xsna.yif0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class w9j implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w9j(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                x9j x9jVar = (x9j) this.c;
                x9jVar.b.a((PromoSessionInfo) this.d);
                break;
            case 1:
                Runnable runnable = (Runnable) this.c;
                hul.a aVar = (hul.a) this.d;
                try {
                    runnable.run();
                    break;
                } catch (Exception e) {
                    aVar.b(e);
                    return;
                }
            case 2:
                GeoPostsFragment geoPostsFragment = (GeoPostsFragment) this.c;
                sq60 sq60Var = (sq60) this.d;
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                if (!geoPostsFragment.eo().a().A0(sq60Var.a)) {
                    geoPostsFragment.o0.d(sq60Var, (tc60) geoPostsFragment.eo().a.U.getValue(), geoPostsFragment.go().get());
                }
                geoPostsFragment.eo().b().l();
                break;
            case 3:
                qkz qkzVar = (qkz) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                okz okzVar = qkzVar.d;
                if (okzVar == null) {
                    Log.e("xsna.qkz", "Error starting player - no video decoder");
                    qkzVar.c(15);
                    break;
                } else {
                    try {
                        HandlerThread handlerThread = qkzVar.c;
                        Objects.toString(handlerThread);
                        okzVar.d();
                        okzVar.f = null;
                        if (handlerThread != null) {
                            okzVar.f = new b8l(okzVar, handlerThread.getLooper());
                        }
                        qkzVar.b = new pkz(qkzVar, arrayList, qkzVar.c, qkzVar.a.getApplicationContext(), qkzVar.t);
                        qkzVar.b.l();
                        break;
                    } catch (Exception e2) {
                        Log.e("xsna.qkz", "Error starting rtmp player", e2);
                        qkzVar.c(15);
                        return;
                    }
                }
            case 4:
                ((com.vk.music.offline.impl.sync.d) this.c).s(o25.a().c(), (Playlist) this.d, true);
                break;
            case 5:
                ((PeerConnectionClient) this.c).c((SessionDescription) this.d);
                break;
            case 6:
                q1d0 q1d0Var = (q1d0) this.c;
                ewo0 ewo0Var = (ewo0) this.d;
                if (!q1d0Var.E() && !q1d0Var.z) {
                    q1d0Var.z = true;
                    if (!q1d0Var.l.c(q1d0Var)) {
                        q1d0Var.G();
                        break;
                    } else {
                        Pair<Object, Long> i = ewo0Var.i(new ewo0.c(), new ewo0.b(), 0, q1d0Var.v);
                        o1d0 m = q1d0Var.m(new i.b(i.first), q1d0Var.p, ((Long) i.second).longValue());
                        q1d0.d dVar = q1d0Var.new d(((Long) i.second).longValue());
                        long longValue = ((Long) i.second).longValue();
                        m.e = dVar;
                        if (m.c) {
                            dVar.b(m);
                        }
                        if (!m.d) {
                            m.d = true;
                            m.b.e(new n1d0(m), longValue);
                            break;
                        }
                    }
                }
                break;
            case 7:
                ((yif0.a) this.c).a((RecyclerView.e0) this.d);
                break;
            case 8:
                Ya.a((Ya) this.c, (LevelPlayAdInfo) this.d);
                break;
            default:
                yads.wl2.a((yads.wl2) this.c, (yads.j5) this.d);
                break;
        }
    }
}
