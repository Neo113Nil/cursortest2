package xsna;

import android.os.Trace;
import com.vk.bridges.di.BridgeComponent;
import com.vk.httpexecutor.core.knet.KnetExecutorType;
import com.vk.music.api.di.MusicPlaybackQueueComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.subscription.impl.di.MusicSubscriptionComponentImpl;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class rxv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rxv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        KnetExecutorType[] knetExecutorTypeArr;
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                return (NewsfeedRouterComponent) ((g8m) r1).a(fpf0.a(NewsfeedRouterComponent.class));
            case 1:
                KnetExecutorType.a aVar = KnetExecutorType.Companion;
                ((dky) r1).e.getClass();
                o2l.a.getClass();
                String c = o2l.c("__dbg_network_executor", "");
                aVar.getClass();
                knetExecutorTypeArr = KnetExecutorType.VALUES;
                for (KnetExecutorType knetExecutorType : knetExecutorTypeArr) {
                    if (epx.f(knetExecutorType.getId(), c)) {
                        return knetExecutorType;
                    }
                }
                return null;
            case 2:
                MusicSubscriptionComponentImpl musicSubscriptionComponentImpl = (MusicSubscriptionComponentImpl) r1;
                qcy<Object>[] qcyVarArr = MusicSubscriptionComponentImpl.e;
                return new i950(musicSubscriptionComponentImpl.a, musicSubscriptionComponentImpl.b, new zkv(musicSubscriptionComponentImpl, 3));
            case 3:
                nx50 nx50Var = (nx50) r1;
                b25 v0 = nx50Var.v0();
                NavigationDelegateActivity navigationDelegateActivity = nx50Var.b;
                return new mxa0(v0, ((MusicPlaybackQueueComponent) m7m.a(navigationDelegateActivity).a(fpf0.a(MusicPlaybackQueueComponent.class))).za(), (PlayerUIComponent) m7m.a(navigationDelegateActivity).a(fpf0.a(PlayerUIComponent.class)));
            case 4:
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                return (BridgeComponent) r1.getValue();
            case 5:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) r1;
                qcy<Object>[] qcyVarArr3 = OfflineAudioComponentImpl.M;
                return new gm80(bu70.a, ((sp40) offlineAudioComponentImpl.E.getValue()).getCache(), (androidx.media3.exoplayer.offline.c) offlineAudioComponentImpl.C.getValue(), new t2j0(offlineAudioComponentImpl), offlineAudioComponentImpl.g);
            default:
                bhl0 bhl0Var = (bhl0) r1;
                Trace.beginSection(ndp0.f("lazy StorageManager.msgsManager"));
                try {
                    e040 e040Var = new e040(bhl0Var.B());
                    bhl0Var.z(e040Var);
                    return e040Var;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
