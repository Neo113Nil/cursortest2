package xsna;

import android.content.Context;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySimilarTracksSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ggh;
import xsna.gk70;
import xsna.sym0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class agh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ agh(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List v0;
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((dgh) obj4).J(new ggh.b((Clips) obj3, (ExtendedCommunityProfile) obj2, z), (ggh.a) obj);
                return s3q0.a;
            case 1:
                Context context = (Context) obj4;
                SubscriptionAction subscriptionAction = (SubscriptionAction) obj3;
                izs izsVar = (izs) obj2;
                int i2 = gk70.a.$EnumSwitchMapping$0[((NotificationsPermission.Result) obj).ordinal()];
                if (i2 == 1) {
                    Collection l = e43.l(new sym0.a(subscriptionAction), new sym0.e(subscriptionAction), new sym0.d(subscriptionAction));
                    sym0.c cVar = sym0.c.g;
                    if (z) {
                        l = j5g.v0(cVar, l);
                    }
                    v0 = j5g.v0(sym0.f.g, l);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v0 = e43.l(sym0.b.g, sym0.f.g);
                }
                new ik70(context, v0, new ci6(izsVar, 2), null, 56).c();
                return s3q0.a;
            default:
                w2b0 w2b0Var = (w2b0) obj4;
                lqk0 lqk0Var = (lqk0) obj3;
                StartPlaySource startPlaySource = (StartPlaySource) obj2;
                List list = (List) obj;
                if (list.isEmpty()) {
                    w2b0Var.D(R.string.music_player_snack_bar_mix_by_track_not_found, z);
                    VkPlayerException.NoVkMixException noVkMixException = new VkPlayerException.NoVkMixException(0);
                    Iterator it = w2b0Var.d.iterator();
                    while (it.hasNext()) {
                        ((com.vk.music.player.e) it.next()).t3(noVkMixException);
                    }
                } else {
                    w2b0Var.N0(new lqk0((StartPlaySimilarTracksSource) startPlaySource, (MusicTrack) null, list, lqk0Var.d, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, lqk0Var.j, 370));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ agh(gk70 gk70Var, Context context, SubscriptionAction subscriptionAction, boolean z, izs izsVar) {
        this.b = 1;
        this.d = context;
        this.e = subscriptionAction;
        this.c = z;
        this.f = izsVar;
    }
}
