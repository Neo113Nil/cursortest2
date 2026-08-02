package xsna;

import android.net.Uri;
import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.market.dto.MarketItemSkuReviewDto;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.log.L;
import com.vk.media.player.PlayerError;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.rlottie.RLottieDrawable;
import java.util.List;
import kotlin.Pair;
import one.video.player.error.OneVideoPlaybackException;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.media.PublisherImpl;
import xsna.bzp0;
import xsna.e740;
import xsna.ngl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class t34 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, Preference.c, ngl.a, SimpleVideoView.j, io.reactivex.rxjava3.core.s, cyo0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t34(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.cyo0
    public long a() {
        long lambda$createTSProvider$1;
        lambda$createTSProvider$1 = ((PublisherImpl) this.c).lambda$createTSProvider$1();
        return lambda$createTSProvider$1;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
        }
        return (Pair) ((qte) this.c).invoke(obj, obj2);
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.j
    public void b(PlayerError playerError, Exception exc) {
        Uri uri;
        q7r q7rVar = (q7r) this.c;
        mkm0 mkm0Var = q7rVar.i0;
        if (q7rVar.q == 0) {
            q7rVar.q = q7rVar.v.getCurrentPosition();
        }
        PlayerError playerError2 = PlayerError.ERROR_NETWORK;
        int i = 0;
        if (playerError != playerError2) {
            cmf0.e(mkm0Var.getContext(), mkm0Var.getWindow(), q7rVar.k0.getContext().getResources().getString(gpt0.n(playerError, false)), 48);
        }
        if (exc != null) {
            sht0 currentVideoSource = q7rVar.v.a.getCurrentVideoSource();
            StoryEntry currentStory = mkm0Var.getCurrentStory();
            String str = "unknown";
            String Kb = currentStory != null ? currentStory.Kb() : "unknown";
            if (currentVideoSource != null) {
                str = currentVideoSource.toString();
                uri = currentVideoSource.b;
            } else {
                uri = null;
            }
            q7rVar.w0.f(uri, exc);
            if (currentStory != null && currentStory.Rb()) {
                mq50 mq50Var = q7rVar.t0;
                if (exc instanceof OneVideoPlaybackException) {
                    mq50Var.getClass();
                    OneVideoPlaybackException oneVideoPlaybackException = (OneVideoPlaybackException) exc;
                    if (oneVideoPlaybackException.d() == OneVideoPlaybackException.ErrorCode.TIMEOUT || oneVideoPlaybackException.d() == OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_TIMEOUT) {
                        i = 1;
                    }
                }
                cjx cjxVar = mq50Var.a;
                if (cjxVar != null) {
                    cjxVar.n(i);
                }
            }
            if (playerError != playerError2) {
                com.vk.metrics.eventtracking.b.a.a(new RuntimeException(y57.a("Story loading exception, currentVideoSource:  ", str, " currentStory ", Kb), exc));
            }
            L.i(exc);
        }
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        jpp jppVar = (jpp) ((EnterProfilePresenter) this.c).a;
        if (jppVar != null) {
            jppVar.E4(new ipp(cVar.a));
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        ParticipantStatesManager participantStatesManager = (ParticipantStatesManager) this.c;
        ParticipantStatesManager.Listener listener = new ParticipantStatesManager.Listener() { // from class: xsna.al90
            @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
            public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager2, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
                io.reactivex.rxjava3.core.r.this.onNext(participantStatesManager2.getAssistanceRequestIds());
            }
        };
        participantStatesManager.addAssistanceRequestListener(listener);
        rVar.i(new io.reactivex.rxjava3.disposables.a(new z2t(2, participantStatesManager, listener)));
        rVar.onNext(participantStatesManager.getAssistanceRequestIds());
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 6:
                return ((Boolean) ((b40) obj2).invoke(obj)).booleanValue();
            default:
                int i2 = el70.g1;
                return ((Boolean) ((dl70) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = AttachVideoFragment.F0;
                return (VkPaginationList) ((s34) obj2).invoke(obj);
            case 1:
                return (nd4) ((b40) obj2).invoke(obj);
            case 2:
            case 5:
            case 6:
            case 9:
            case 12:
            case 13:
            case 14:
            case 16:
            case 23:
            case 24:
            default:
                return (Pair) ((mm1) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((nn4) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((mm1) obj2).invoke(obj);
            case 7:
                return (RLottieDrawable) ((b40) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((o2e) obj2).invoke(obj);
            case 10:
                return (Pair) ((lz0) obj2).invoke(obj);
            case 11:
                return (MarketItemSkuReviewDto) ((izs) obj2).invoke(obj);
            case 15:
                return (crq) ((b40) obj2).invoke(obj);
            case 17:
                int i3 = FriendsRecommendationsFragment.b0;
                return (VKFromList) ((mm1) obj2).invoke(obj);
            case 18:
                return (List) ((bw6) obj2).invoke(obj);
            case 19:
                return (GeoLocation) ((b40) obj2).invoke(obj);
            case 20:
                return (it80) ((f410) obj2).invoke(obj);
            case 21:
                return (hda) ((e740.a) obj2).invoke(obj);
            case 22:
                return (vf60) ((hb40) obj2).invoke(obj);
            case 25:
                return (Group) ((q520) obj2).invoke(obj);
            case 26:
                return (NewsEntry) ((hb40) obj2).invoke(obj);
        }
    }
}
