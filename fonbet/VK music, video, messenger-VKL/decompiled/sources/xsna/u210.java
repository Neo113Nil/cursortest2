package xsna;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment.c;
import com.vk.gif.di.GifSelectorComponent;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.mediapicker.api.di.MediaPickerComponent;
import com.vk.mediapicker.impl.presentation.MediaPickerActivity;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Signer;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.im_engine_impl.di.SharingImEngineComponentImpl;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.MediaPipelineComponentVkApp;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import xsna.k840;
import xsna.rye;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class u210 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u210(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) obj;
                qcy<Object>[] qcyVarArr = MarketItemReviewRepliesFragment.b0;
                return new k2g0(marketItemReviewRepliesFragment, ((SharingComponent) ((k7m) m7m.f(marketItemReviewRepliesFragment)).a(fpf0.a(SharingComponent.class))).P8(), ((BridgeComponent) ((k7m) m7m.f(marketItemReviewRepliesFragment)).a(fpf0.a(BridgeComponent.class))).F(), marketItemReviewRepliesFragment.new c(), ((BridgeComponent) ((k7m) m7m.f(marketItemReviewRepliesFragment)).a(fpf0.a(BridgeComponent.class))).ob());
            case 1:
                return Boolean.valueOf(MimeTypes.AUDIO_RAW.equalsIgnoreCase(((gr10) obj).b));
            case 2:
                int i2 = MediaPickerActivity.h;
                return ((MediaPickerComponent) m7m.a((MediaPickerActivity) obj).mo408a(fpf0.a(MediaPickerComponent.class))).Xc();
            case 3:
                qcy<Object>[] qcyVarArr2 = MediaPipelineComponentVkApp.d;
                return new dle(new bpn0(new k7y((ClipsConfigAuthorsComponent) obj, 9)));
            case 4:
                return ((VideoPromoComponent) ((k7m) m7m.c((k120) obj)).a(fpf0.a(VideoPromoComponent.class))).L();
            case 5:
                zf40 zf40Var = ((com.vk.catalog2.feature.music.configuration.b) obj).Q;
                return Boolean.valueOf(zf40Var != null ? zf40Var.c() : false);
            case 6:
                ((nle) ((mf40) obj).F.getValue()).c();
                MusicSelectorCatalogRootVh.a aVar = MusicSelectorCatalogRootVh.D;
                if (aVar != null) {
                    aVar.c();
                }
                return s3q0.a;
            case 7:
                ro40 ro40Var = (ro40) obj;
                k840.a.d().X(ro40Var.a, ro40Var.e);
                return s3q0.a;
            case 8:
                int i3 = MviComponentFragment.S;
                return ((MviComponentFragment) obj).eo();
            case 9:
                androidx.lifecycle.f fVar = (FragmentImpl) obj;
                ((pds) fVar).o1();
                if (fVar instanceof dw60) {
                    ((dw60) fVar).Nb(false);
                }
                return s3q0.a;
            case 10:
                qcy<Object>[] qcyVarArr3 = NewsfeedSearchFragment.p0;
                return m7m.d((NewsfeedSearchFragment) obj);
            case 11:
                ewy ewyVar = ((OnlineBookingInternalComponent) obj).b;
                qcy<Object> qcyVar = OnlineBookingInternalComponent.o[1];
                return new sha0((isi0) ewyVar.c());
            case 12:
                ((com.vk.im.popup.b) obj).c.b();
                return s3q0.a;
            case 13:
                return ((DonutPriceComponent) ((k7m) m7m.c(((h0c0) obj).a)).a(fpf0.a(DonutPriceComponent.class))).kf();
            case 14:
                return ((MarketComponent) ((k7m) m7m.f((y1c0) obj)).a(fpf0.a(MarketComponent.class))).Ob();
            case 15:
                return rl3.u0(((o7c0) obj).getFillPoints());
            case 16:
                PostViewFragment postViewFragment = (PostViewFragment) obj;
                String[] strArr = PostViewFragment.T0;
                if (!postViewFragment.a0()) {
                    h3p0.b(postViewFragment);
                }
                return s3q0.a;
            case 17:
                Bundle bundle = ((rbc0) obj).a;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("signer", Signer.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = bundle.getParcelable("signer");
                    if (!(parcelable3 instanceof Signer)) {
                        parcelable3 = null;
                    }
                    parcelable = (Signer) parcelable3;
                }
                return (Signer) parcelable;
            case 18:
                pid0 pid0Var = (pid0) obj;
                return ((ModerationComponent) ((k7m) m7m.f(pid0Var)).mo408a(fpf0.a(ModerationComponent.class))).pa().a(pid0Var.b, pid0Var.c);
            case 19:
                tmq.a().n((Activity) obj);
                return s3q0.a;
            case 20:
                final dwe0 dwe0Var = (dwe0) obj;
                return new ParticipantStatesManager.Listener() { // from class: xsna.cwe0
                    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
                    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
                        AccessibilityEvents accessibilityEvents = dwe0.this.b;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (ParticipantStatesManager.ParticipantStateChange participantStateChange : stateChangedEvent.getChanges()) {
                            if (participantStateChange.isOn()) {
                                arrayList.add(mnh0.E(participantStateChange.getParticipantId()));
                            } else {
                                arrayList2.add(mnh0.E(participantStateChange.getParticipantId()));
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            accessibilityEvents.getClass();
                            accessibilityEvents.d(new qk(0, accessibilityEvents, arrayList));
                        }
                        if (arrayList2.isEmpty()) {
                            return;
                        }
                        accessibilityEvents.getClass();
                        accessibilityEvents.d(new pk(0, accessibilityEvents, arrayList2));
                    }
                };
            case 21:
                return ((ReactionsFeedFragment) obj).Z;
            case 22:
                return ((prf0) obj).a.findViewById(R.id.nativeads_advertising_dot);
            case 23:
                gzs<s3q0> gzsVar = ((sgg0) ((zak0) ((tgg0) obj).a).getValue()).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 24:
                ((rye.b) obj).a();
                return s3q0.a;
            case 25:
                return ((GifSelectorComponent) ((k7m) m7m.c(((afi0) obj).a)).a(fpf0.a(GifSelectorComponent.class))).r9();
            case 26:
                SharingImEngineComponentImpl sharingImEngineComponentImpl = (SharingImEngineComponentImpl) obj;
                return new vbj0(sharingImEngineComponentImpl.b.b0(), sharingImEngineComponentImpl.c.l(), sharingImEngineComponentImpl.d.g(), sharingImEngineComponentImpl.e.g());
            case 27:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.content);
            case 28:
                return (mey) ((np) obj).invoke();
            default:
                StoryArchiveFragment.this.finish();
                return s3q0.a;
        }
    }
}
