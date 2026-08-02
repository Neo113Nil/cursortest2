package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.channels.api.Channel;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.ic50;
import xsna.ne20;
import xsna.to50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tbb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tbb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ubb ubbVar = (ubb) this.c;
                Msg msg = (Msg) this.d;
                gzs gzsVar = (gzs) this.e;
                Channel b = ubbVar.h.b();
                io.reactivex.rxjava3.internal.operators.completable.u o = ubbVar.i.c(msg, b != null ? b.z : null).o(asu0.a.d());
                com.vk.im.popup.a aVar = ubbVar.j;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures.getClass();
                ubbVar.l.b(com.vk.im.popup.e.a(o, aVar, new ehd0(com.vk.toggle.b.A.a(imFeatures))).subscribe(new f68(1, gzsVar, ubbVar), new ew(new k00(ubbVar, 19), 9)));
                return s3q0.a;
            case 1:
                one.video.player.j jVar = (one.video.player.j) this.c;
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) this.d;
                one.video.player.tracks.a aVar2 = (one.video.player.tracks.a) this.e;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().t(baseVideoPlayer, aVar2);
                }
                return s3q0.a;
            case 2:
                return (Map) ((l7r0) this.c).d((ij20) this.d, (ne20.a) this.e);
            case 3:
                return "tracksSize=" + this.c.size() + "; playlistsSize=" + this.d.size() + "; playlistsToTracksSize=" + ((List) this.e).size();
            case 4:
                to50 to50Var = (to50) this.c;
                to50.d dVar = (to50.d) this.d;
                to50.d dVar2 = (to50.d) this.e;
                if (!to50Var.a(dVar.a, dVar.b)) {
                    return to50Var.b(dVar, dVar2, to50Var.b, to50Var.d);
                }
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return new to50.b(f, f, f, 15);
            case 5:
                ubb0 ubb0Var = (ubb0) this.c;
                UserId userId = (UserId) this.d;
                String str = (String) this.e;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b + " pid=" + str});
                }
                List D0 = j5g.D0(new r420(1), ubb0Var.b.y(String.valueOf(userId.b), str));
                ArrayList arrayList = new ArrayList(c5g.u(D0, 10));
                Iterator it2 = D0.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ic50.a.a((ic50) it2.next()));
                }
                return arrayList;
            default:
                izs izsVar = (izs) this.c;
                ((wh50) this.e).setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                izsVar.invoke(this.d);
                return s3q0.a;
        }
    }
}
