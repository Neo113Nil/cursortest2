package xsna;

import android.app.Activity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.stats.AdsPixel;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import ru.ok.android.webrtc.PeerConnectionClient;
import xsna.rye;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ds4(AdsAudioPixelsContainer adsAudioPixelsContainer, fs4 fs4Var) {
        this.b = 0;
        this.c = adsAudioPixelsContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdsPixel.Started poll;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AdsAudioPixelsContainer adsAudioPixelsContainer = (AdsAudioPixelsContainer) obj;
                while (!adsAudioPixelsContainer.c.isEmpty() && (poll = adsAudioPixelsContainer.c.poll()) != null) {
                    fs4.d(poll, true);
                }
            case 1:
                com.vk.lists.c cVar = ((BonusCatalogFragment) obj).W;
                if (cVar != null) {
                    cVar.p(false);
                    break;
                }
                break;
            case 2:
                rye.b bVar = (rye.b) obj;
                rye ryeVar = bVar.c;
                if (ryeVar != null) {
                    ryeVar.o(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                Activity h = e3m.h(bVar.a);
                if (h != null && !h.isFinishing() && !h.isDestroyed()) {
                    try {
                        rye ryeVar2 = bVar.c;
                        if (ryeVar2 != null) {
                            ryeVar2.show();
                            break;
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            case 3:
                int i2 = FriendsFragment.q0;
                ((FriendsFragment) obj).fo();
                break;
            case 4:
                ((odm) obj).invoke();
                break;
            case 5:
                ((ib80) obj).o();
                break;
            case 6:
                ((PeerConnectionClient) obj).n();
                break;
            case 7:
                com.vungle.ads.internal.presenter.r.c((com.vungle.ads.internal.presenter.r) obj);
                break;
            default:
                yads.wl2.b((yads.wl2) obj);
                break;
        }
    }

    public /* synthetic */ ds4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
