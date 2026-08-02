package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vkontakte.android.fragments.UnreadCounterSettingsFragment;
import one.video.player.OneVideoPlayer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b9d implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b9d(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                c9d c9dVar = (c9d) this.d;
                boolean z = this.c;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj;
                c9dVar.k = false;
                if (z) {
                    c9dVar.e.a(true);
                }
                bzd.this.c.getStickersInteractor().k();
                io.reactivex.rxjava3.disposables.c cVar = c9dVar.o;
                if (cVar != null) {
                    cVar.dispose();
                }
                oneVideoPlayer.pause();
                return s3q0.a;
            case 1:
                Peer peer = (Peer) this.d;
                boolean z2 = this.c;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                ChatSettings chatSettings = bVar.z;
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, chatSettings != null ? ChatSettings.zb(chatSettings, null, peer, null, 0, z2, -16389) : null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -16777217, 2097151);
            default:
                UnreadCounterSettingsFragment unreadCounterSettingsFragment = (UnreadCounterSettingsFragment) this.d;
                boolean z3 = this.c;
                int i = UnreadCounterSettingsFragment.n0;
                ((b25) unreadCounterSettingsFragment.l0.getValue()).y(z3);
                a1w a1wVar = q1w.a;
                (a1wVar != null ? a1wVar : null).x(new OnCacheInvalidateEvent("UnreadCounterSettingsFragment", OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
                hf8.b("com.vkontakte.android.COUNTERS_UPDATED");
                unreadCounterSettingsFragment.io();
                return s3q0.a;
        }
    }
}
