package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistHeaderVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.dto.gift.GiftItem;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.newsfeed.posting.donut_teaser.domain.interactor.TextValidationState;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.voip.analytics.device.audio.output.model.VoipAudioOutputTypeAnalytics;
import com.vk.voip.ui.VoipViewBehaviour;
import com.vk.voip.ui.group_selector.ui.a;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import xsna.e8v0;
import xsna.pew0;
import xsna.slx0;
import xsna.svq0;
import xsna.tj50;
import xsna.xn50;
import xsna.yo60;
import xsna.ypq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class c3k0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c3k0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 10;
        VoipAudioOutputTypeAnalytics voipAudioOutputTypeAnalytics = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ((Ref$ObjectRef) obj2).element;
                if (cVar != null) {
                    cVar.dispose();
                }
                break;
            case 1:
                break;
            case 2:
                Target target = (Target) obj;
                Target target2 = ((com.vk.sharing.core.view.j) obj2).e;
                break;
            case 3:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) obj2;
                TextValidationState textValidationState = (TextValidationState) obj;
                if (!rVar.h()) {
                    rVar.onNext(textValidationState);
                    rVar.onComplete();
                }
                break;
            case 4:
                ((ToolbarRedesignVh) obj2).c().g(((Boolean) obj).booleanValue());
                break;
            case 5:
                ((g7q0) obj2).b.i1(R.string.default_network_error, new Object[0]);
                L.i((Throwable) obj);
                break;
            case 6:
                ypq0.b bVar = (ypq0.b) obj2;
                GiftItem giftItem = (GiftItem) bVar.m;
                if (giftItem != null) {
                    bVar.n.c.v6(giftItem.d);
                }
                break;
            case 7:
                zvq0 zvq0Var = (zvq0) obj2;
                List<ol60> list = ((dwq0) zvq0Var.b.getCurrentState()).q.b.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof z1c0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((z1c0) it.next()).h.h);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof vt80) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it3.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList4.add(x9v0Var);
                    }
                }
                zvq0Var.c(new svq0.a(new yo60.i.a(arrayList4)));
                break;
            case 8:
                RecyclerPaginatedView recyclerPaginatedView = ((j8r0) obj2).a.e;
                (recyclerPaginatedView != null ? recyclerPaginatedView : null).g0();
                break;
            case 9:
                ((t40) obj2).invoke((Throwable) obj);
                break;
            case 10:
                rwo0 rwo0Var = ((VideoEditTimelineView) obj2).F;
                if (rwo0Var != null) {
                    rwo0Var.h();
                }
                break;
            case 11:
                ((zak0) ((VideoEpisodesFragment) obj2).U).setValue((List) obj);
                break;
            case 12:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).J.b((VideoMinimizableDiscoverySideEffect) obj);
                break;
            case 13:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, (com.vk.video.ui.discovery.minimizable.c) obj);
                break;
            case 14:
                VideoPlaylistHeaderVh videoPlaylistHeaderVh = (VideoPlaylistHeaderVh) obj2;
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.d()).booleanValue();
                boolean booleanValue2 = ((Boolean) pair.g()).booleanValue();
                if (booleanValue) {
                    CollapsingToolbarLayout collapsingToolbarLayout = videoPlaylistHeaderVh.c;
                    if (collapsingToolbarLayout == null) {
                        collapsingToolbarLayout = null;
                    }
                    ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
                    NonBouncedAppBarLayout.c cVar2 = layoutParams instanceof NonBouncedAppBarLayout.c ? (NonBouncedAppBarLayout.c) layoutParams : null;
                    if (cVar2 != null) {
                        cVar2.a = 0;
                    }
                }
                if (booleanValue && !booleanValue2) {
                    CollapsingToolbarLayout collapsingToolbarLayout2 = videoPlaylistHeaderVh.c;
                    if (collapsingToolbarLayout2 == null) {
                        collapsingToolbarLayout2 = null;
                    }
                    collapsingToolbarLayout2.setVisibility(8);
                    CollapsingToolbarLayout collapsingToolbarLayout3 = videoPlaylistHeaderVh.c;
                    if (collapsingToolbarLayout3 == null) {
                        collapsingToolbarLayout3 = null;
                    }
                    ((ImageView) collapsingToolbarLayout3.findViewById(R.id.video_playlist_cover)).setImageDrawable(null);
                }
                break;
            case 15:
                break;
            case 16:
                com.vk.auth.ui.password.askpassword.a aVar = (com.vk.auth.ui.password.askpassword.a) obj2;
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PARTIAL_EXPAND_SUCCESS, null, null, null, null, null, null, 254);
                aVar.e = new bjr0(1);
                aVar.c.finish();
                break;
            case 17:
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) obj2;
                ((ggj) obj).s1();
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.m.b);
                }
                break;
            case 18:
                break;
            case 19:
                pew0 pew0Var = (pew0) obj2;
                CallsAudioManager.AudioDeviceType audioDeviceType = (CallsAudioManager.AudioDeviceType) obj;
                int i4 = audioDeviceType == null ? -1 : pew0.c.$EnumSwitchMapping$0[audioDeviceType.ordinal()];
                if (i4 == 1) {
                    voipAudioOutputTypeAnalytics = VoipAudioOutputTypeAnalytics.HEADPHONES;
                } else if (i4 == 2) {
                    voipAudioOutputTypeAnalytics = VoipAudioOutputTypeAnalytics.HEADPHONES;
                } else if (i4 == 3) {
                    voipAudioOutputTypeAnalytics = VoipAudioOutputTypeAnalytics.PHONE;
                } else if (i4 == 4) {
                    voipAudioOutputTypeAnalytics = VoipAudioOutputTypeAnalytics.DYNAMIC;
                } else if (i4 == 5) {
                    voipAudioOutputTypeAnalytics = VoipAudioOutputTypeAnalytics.PHONE;
                }
                if (voipAudioOutputTypeAnalytics != null) {
                    ((qew0) pew0Var.d.getValue()).J0(voipAudioOutputTypeAnalytics);
                }
                break;
            case 20:
                kkw0 kkw0Var = (kkw0) obj2;
                Pair pair2 = (Pair) obj;
                f.a aVar2 = (f.a) pair2.d();
                float floatValue = ((Float) pair2.g()).floatValue();
                kvi0 kvi0Var = kkw0Var.h;
                gxu gxuVar = kkw0Var.d;
                f.a.C2082a c2082a = f.a.C2082a.a;
                if (floatValue == 90.0f || floatValue == 270.0f) {
                    kvi0Var.d(c2082a);
                    gxuVar.e(aVar2);
                } else {
                    gxuVar.e(c2082a);
                    kvi0Var.d(aVar2);
                }
                break;
            case 21:
                ((sow0) obj2).c.a(a.i.b.a);
                break;
            case 22:
                break;
            case 23:
                p1x0 p1x0Var = (p1x0) obj2;
                tj50.a aVar3 = (tj50.a) obj;
                awm0 awm0Var = new awm0(i2);
                ao8 ao8Var = ao8.d;
                break;
            case 24:
                VoipViewBehaviour voipViewBehaviour = (VoipViewBehaviour) obj2;
                VoipViewBehaviour.a aVar4 = voipViewBehaviour.f;
                FrameLayout frameLayout = voipViewBehaviour.a;
                if (aVar4.a) {
                    aVar4.getClass();
                    frameLayout.setScaleX(1.0f);
                    voipViewBehaviour.f.getClass();
                    frameLayout.setScaleY(1.0f);
                    frameLayout.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    frameLayout.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    voipViewBehaviour.f.a = false;
                    gzs<s3q0> gzsVar = voipViewBehaviour.n;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                break;
            case 25:
                ((plx0) obj2).T(new slx0.a((jlx0) obj));
                break;
            default:
                ((com.vk.superapp.widget_settings.p004new.b) obj2).p();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ c3k0(t40 t40Var, abs0 abs0Var, Context context) {
        this.b = 9;
        this.c = t40Var;
    }
}
