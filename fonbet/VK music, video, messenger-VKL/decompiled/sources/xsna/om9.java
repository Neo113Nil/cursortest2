package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.ui.carousel.UserCarouselView;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b6l;
import xsna.cri;
import xsna.d5h;
import xsna.dt1;
import xsna.e510;
import xsna.ikv0;
import xsna.lsr;
import xsna.nb9;
import xsna.ncb0;
import xsna.q630;
import xsna.s3q0;
import xsna.spj;
import xsna.xpv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class om9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ om9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05df  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        o7m0 o7m0Var;
        o7m0 o7m0Var2;
        Object obj3;
        Throwable th;
        int i = this.b;
        int i2 = 6;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) obj4;
                List<? extends nov> list = (List) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                aVar.f = true;
                WebStoryBox webStoryBox = aVar.c.u;
                if (webStoryBox != null && webStoryBox.Db()) {
                    aVar.T = list != null ? com.vk.cameraui.impl.a.c0(list) : null;
                    p5p Y = aVar.Y();
                    if (Y != null) {
                        Y.j(list);
                    }
                }
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_AUDIO_TRACK;
                storiesFeatures.getClass();
                if (com.vk.toggle.b.A.a(storiesFeatures)) {
                    if (booleanValue) {
                        CameraUIView cameraUIView = aVar.b;
                        ikv0.a aVar2 = new ikv0.a(cameraUIView.getContext());
                        ikv0.d.c cVar = new ikv0.d.c(cameraUIView.getContext().getString(R.string.story_audio_track_error));
                        o7m0Var = null;
                        aVar2.i(new ikv0.d(cVar, (ikv0.d.b) null, (ikv0.d.a) null, 6));
                        aVar2.e(iah0.a(88));
                        aVar2.n();
                    } else {
                        o7m0Var = null;
                    }
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (((nov) obj3) instanceof o7m0) {
                            }
                        } else {
                            obj3 = o7m0Var;
                        }
                    }
                    if (obj3 instanceof o7m0) {
                        o7m0Var2 = (o7m0) obj3;
                        if (o7m0Var2 == null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj5 : list) {
                                if (!(((nov) obj5) instanceof sov)) {
                                    arrayList.add(obj5);
                                }
                            }
                            p5p Y2 = aVar.Y();
                            if (Y2 != null) {
                                Y2.i(arrayList);
                            }
                            p5p Y3 = aVar.Y();
                            if (Y3 != null) {
                                Y3.E(o7m0Var2.getInfo());
                            }
                        } else {
                            p5p Y4 = aVar.Y();
                            if (Y4 != null) {
                                Y4.i(list);
                            }
                        }
                        return s3q0.a;
                    }
                } else {
                    o7m0Var = null;
                }
                o7m0Var2 = o7m0Var;
                if (o7m0Var2 == null) {
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = naf.k1;
                ((naf) obj4).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                d5h.c cVar2 = (d5h.c) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-880558623, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItem.ViewHolder.<anonymous> (CommunityInternalMenuItem.kt:269)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-113306810, new o4e(cVar2, 3), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                CommunityStaticCover communityStaticCover = (CommunityStaticCover) obj4;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = CommunityStaticCover.g;
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(608657316, intValue2, -1, "com.vk.community.design.view.cover.CommunityStaticCover.<anonymous>.<anonymous> (CommunityStaticCover.kt:87)");
                    }
                    boolean y = aVar4.y(communityStaticCover);
                    Object x = aVar4.x();
                    if (y || x == c0012a) {
                        x = new wqf(communityStaticCover, i2);
                        aVar4.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    izs<Integer, s3q0> onHeightChanges = communityStaticCover.getOnHeightChanges();
                    CommunityStaticCover.a state = communityStaticCover.getState();
                    boolean withOverlay = communityStaticCover.getWithOverlay();
                    boolean y2 = aVar4.y(communityStaticCover);
                    Object x2 = aVar4.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new trf(communityStaticCover, 7);
                        aVar4.R(x2);
                    }
                    com.vk.community.design.view.cover.b.a(gzsVar, onHeightChanges, state, withOverlay, (gzs) x2, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                com.vk.donut.design.compose.banner.b.c((q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((wvq) obj4).g(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ((izs) obj4).invoke(new e510.e(((Long) obj).longValue(), ((Integer) obj2).intValue()));
                return s3q0.a;
            case 7:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) obj4;
                String str = (String) obj;
                musicMyAudiosCatalogRootVh.t = str;
                if (epx.f(musicMyAudiosCatalogRootVh.r, musicMyAudiosCatalogRootVh.L.l())) {
                    musicMyAudiosCatalogRootVh.q0(str);
                } else {
                    musicMyAudiosCatalogRootVh.p0(str);
                }
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ei80.b((wh50) obj4, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
            case 9:
                ((ks80) obj4).b.remove((String) obj2);
                ((ohk0) obj).c("onPlayerStop");
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((lv90) obj4).eo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 11:
                com.vk.music.player.playback.c cVar3 = (com.vk.music.player.playback.c) obj4;
                Collections.swap(cVar3.o, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                cVar3.c.l(cVar3.o);
                return s3q0.a;
            case 12:
                jai jaiVar = (jai) obj4;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-152710248, intValue3, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.Theme.<anonymous> (PlayerEqualizerSettingsMviView.kt:60)");
                    }
                    if (cq.i(0, aVar5, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 13:
                final PlaylistScreenFragment playlistScreenFragment = (PlaylistScreenFragment) obj4;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(457380892, intValue4, -1, "com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment.ScreenContent.<anonymous> (PlaylistScreenFragment.kt:120)");
                    }
                    boolean J = aVar6.J(playlistScreenFragment);
                    Object x3 = aVar6.x();
                    if (J || x3 == c0012a) {
                        x3 = new yhu(playlistScreenFragment, 20);
                        aVar6.R(x3);
                    }
                    izs izsVar = (izs) x3;
                    boolean J2 = aVar6.J(playlistScreenFragment);
                    Object x4 = aVar6.x();
                    if (J2 || x4 == c0012a) {
                        x4 = playlistScreenFragment.new c(null);
                        aVar6.R(x4);
                    }
                    r37.a(izsVar, (yzs) x4, kai.c(1114402231, new zzs() { // from class: xsna.qcb0
                        @Override // xsna.zzs
                        public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                            int i5;
                            z37 z37Var = (z37) obj6;
                            zdb0 zdb0Var = (zdb0) obj7;
                            androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj8;
                            int intValue5 = ((Integer) obj9).intValue();
                            qcy<Object>[] qcyVarArr2 = PlaylistScreenFragment.T;
                            if ((intValue5 & 6) == 0) {
                                i5 = (aVar7.J(z37Var) ? 4 : 2) | intValue5;
                            } else {
                                i5 = intValue5;
                            }
                            if ((intValue5 & 48) == 0) {
                                i5 |= aVar7.J(zdb0Var) ? 32 : 16;
                            }
                            if (aVar7.t(i5 & 1, (i5 & 147) != 146)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1114402231, i5, -1, "com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment.ScreenContent.<anonymous>.<anonymous> (PlaylistScreenFragment.kt:127)");
                                }
                                Object x5 = aVar7.x();
                                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                PlaylistScreenFragment playlistScreenFragment2 = PlaylistScreenFragment.this;
                                if (x5 == c0012a2) {
                                    final nb9 k = tci.k(playlistScreenFragment2.ho());
                                    x5 = new a1q(new ksr<Object>() { // from class: com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment$ScreenContent$lambda$12$lambda$11$lambda$8$$inlined$filterIsInstance$1

                                        /* compiled from: Emitters.kt */
                                        /* renamed from: com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment$ScreenContent$lambda$12$lambda$11$lambda$8$$inlined$filterIsInstance$1$2, reason: invalid class name */
                                        public static final class AnonymousClass2<T> implements lsr {
                                            public final /* synthetic */ lsr b;

                                            @b6l(c = "com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment$ScreenContent$lambda$12$lambda$11$lambda$8$$inlined$filterIsInstance$1$2", f = "PlaylistScreenFragment.kt", l = {50}, m = "emit")
                                            /* renamed from: com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment$ScreenContent$lambda$12$lambda$11$lambda$8$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                                            public static final class AnonymousClass1 extends ContinuationImpl {
                                                int I$0;
                                                Object L$0;
                                                Object L$1;
                                                Object L$2;
                                                Object L$3;
                                                int label;
                                                /* synthetic */ Object result;

                                                public AnonymousClass1(spj spjVar) {
                                                    super(spjVar);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    this.result = obj;
                                                    this.label |= Integer.MIN_VALUE;
                                                    return AnonymousClass2.this.emit(null, this);
                                                }
                                            }

                                            public AnonymousClass2(lsr lsrVar) {
                                                this.b = lsrVar;
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                                            @Override // xsna.lsr
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final Object emit(Object obj, spj spjVar) {
                                                AnonymousClass1 anonymousClass1;
                                                int i;
                                                if (spjVar instanceof AnonymousClass1) {
                                                    anonymousClass1 = (AnonymousClass1) spjVar;
                                                    int i2 = anonymousClass1.label;
                                                    if ((i2 & Integer.MIN_VALUE) != 0) {
                                                        anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                                        Object obj2 = anonymousClass1.result;
                                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                        i = anonymousClass1.label;
                                                        if (i != 0) {
                                                            kotlin.a.a(obj2);
                                                            if (obj instanceof ncb0.a) {
                                                                anonymousClass1.L$0 = null;
                                                                anonymousClass1.L$1 = null;
                                                                anonymousClass1.L$2 = null;
                                                                anonymousClass1.L$3 = null;
                                                                anonymousClass1.I$0 = 0;
                                                                anonymousClass1.label = 1;
                                                                if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                                                    return coroutineSingletons;
                                                                }
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.a.a(obj2);
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }
                                                anonymousClass1 = new AnonymousClass1(spjVar);
                                                Object obj22 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i != 0) {
                                                }
                                                return s3q0.a;
                                            }
                                        }

                                        @Override // xsna.ksr
                                        public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
                                            Object collect = nb9.this.collect(new AnonymousClass2(lsrVar), spjVar);
                                            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                                        }
                                    });
                                    aVar7.R(x5);
                                }
                                rvi.a(bvz.a.b(playlistScreenFragment2.R), kai.c(1982280311, new pcb0(playlistScreenFragment2, zdb0Var, z37Var, ((a1q) x5).a), aVar7), aVar7, 56);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar7.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar6), aVar6, 384, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 14:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                View view = ((PostsFromNotificationsFragment) obj4).b0;
                if (view != null) {
                    view.setVisibility(booleanValue2 ? 0 : 8);
                }
                return s3q0.a;
            case 15:
                fnj0 fnj0Var = (fnj0) obj4;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1706067759, intValue5, -1, "com.vk.profile.design.view.silentmodebanner.SilentModeBannerContent.<anonymous> (SilentModeBannerView.kt:73)");
                    }
                    q630.a aVar8 = q630.a.a;
                    q630 f = txj0.f(aVar8, 1.0f);
                    float f2 = kqu0.v;
                    q630 H = s200.H(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar7, 48);
                    int hashCode = Long.hashCode(n34.n(aVar7));
                    sy90 D = aVar7.D();
                    q630 c = qri.c(aVar7, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar9 = cri.a.b;
                    if (aVar7.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar7.H();
                    if (aVar7.L()) {
                        aVar7.I(aVar9);
                    } else {
                        aVar7.f();
                    }
                    cri.a.c cVar4 = cri.a.f;
                    k9q0.w(aVar7, a, cVar4);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar7, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar7, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar7, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar7, c, dVar);
                    if (androidx.compose.runtime.b.d()) {
                        th = null;
                        androidx.compose.runtime.b.f(243729308, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-LotusOutline28> (VkSdkIcons.kt:2446)");
                    } else {
                        th = null;
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_lotus_outline_28, 0, aVar7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    gdv0.c(xpv.a.a(a2, wlb0.h(aVar7).getIcon().a, new rek0(wlb0.h(aVar7).getBackground().g), aVar7, 24584, 8), 40, null, PictureRadius.Large, null, null, null, aVar7, 3120, 116);
                    f9t.e(txj0.v(aVar8, kqu0.t), aVar7, 0);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    xpy xpyVar = new xpy(1.0f, true);
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar7, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar7));
                    sy90 D2 = aVar7.D();
                    q630 c2 = qri.c(aVar7, xpyVar);
                    if (aVar7.N() == null) {
                        n34.r();
                        throw th;
                    }
                    aVar7.H();
                    if (aVar7.L()) {
                        aVar7.I(aVar9);
                    } else {
                        aVar7.f();
                    }
                    k9q0.w(aVar7, a3, cVar4);
                    k9q0.w(aVar7, D2, eVar);
                    ur.d(hashCode2, aVar7, bVar, aVar7, c2678a);
                    k9q0.w(aVar7, c2, dVar);
                    yqv0.c(fnj0Var.a, txj0.f(aVar8, 1.0f), wlb0.h(aVar7).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar7).d0, aVar7, 48, 0, 8184);
                    yqv0.c(fnj0Var.b, txj0.f(aVar8, 1.0f), wlb0.h(aVar7).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar7).i0, aVar7, 48, 0, 8184);
                    aVar7.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1231053620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronCompactRight24> (VkSdkIcons.kt:416)");
                    }
                    lg90 a4 = pg90.a(R.drawable.vk_icon_chevron_compact_right_24, 0, aVar7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a4, null, null, wlb0.h(aVar7).getIcon().a, aVar7, 56, 4);
                    aVar7.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 16:
                ((Integer) obj2).getClass();
                ((spo0) obj4).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 17:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Cell.a.C0752a) obj4).a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                Integer num = (Integer) obj2;
                num.getClass();
                int i5 = UserCarouselView.d;
                ((xk6) obj4).invoke((List) obj, num);
                return s3q0.a;
        }
    }

    public /* synthetic */ om9(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
