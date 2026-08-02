package xsna;

import com.ironsource.adapters.fyber.rewarded.FyberRewardedAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.exception.MalformedMusicTrackException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class f1t implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f1t(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FyberRewardedAdapter.loadAd$lambda$1((RewardedVideoAdListener) this.c, (FyberRewardedAdapter) this.d, (String) this.e, (String) this.f);
                break;
            default:
                MusicTrack musicTrack = (MusicTrack) this.c;
                ifp0 ifp0Var = (ifp0) this.d;
                sg40 sg40Var = (sg40) this.e;
                UserId userId = (UserId) this.f;
                if (musicTrack.i != null) {
                    sg40Var.a.Q(userId, musicTrack, null, ifp0Var);
                    break;
                } else {
                    ifp0Var.e(new MalformedMusicTrackException("MusicTrack url is null, can't download"));
                    break;
                }
        }
    }
}
