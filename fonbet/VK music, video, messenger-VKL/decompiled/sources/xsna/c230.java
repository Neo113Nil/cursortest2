package xsna;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.Toast;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.users.dto.UsersSearchResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.design.view.QRSharingView;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.common.data.VKList;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.dto.PosterSettings;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.b;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.polls.entities.exceptions.UserDidntVoteException;
import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefRequestReason;
import com.vk.reefton.trackers.j;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import xsna.cf70;
import xsna.m7h0;
import xsna.osb0;
import xsna.q7h0;
import xsna.qn60;
import xsna.qr60;
import xsna.s270;
import xsna.tj50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c230 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c230(SnowballsCoverHolder snowballsCoverHolder, SnowballsCoverView.a aVar) {
        this.b = 27;
        this.c = snowballsCoverHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.Long] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 7;
        boolean z = false;
        z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.a aVar = (com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.a) obj2;
                tj50.a aVar2 = (tj50.a) obj;
                e230 e230Var = new e230(1, aVar, com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.a.class, "mapStateToReactedUsers", "mapStateToReactedUsers(Lcom/vk/newsfeed/impl/postmodal/reactions/tabs/mvi/ModalPostReactionsTabState;)Ljava/util/List;", 0);
                ao8 ao8Var = ao8.d;
                return new b.d(aVar2.a(e230Var, ao8Var), aVar2.a(new f230(1, aVar, com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.a.class, "mapStateToMsgReposted", "mapStateToMsgReposted(Lcom/vk/newsfeed/impl/postmodal/reactions/tabs/mvi/ModalPostReactionsTabState;)Lcom/vk/newsfeed/impl/postmodal/reactions/tabs/ModalPostReactionsRecyclerItem$MessengerRepost;", 0), ao8Var), aVar2.a(new vd1(26), ao8Var), aVar2.a(new d230(false ? 1 : 0), ao8Var), aVar2.a(g230.b, ao8Var), aVar2.a(new uuz(i2), ao8Var));
            case 1:
                yv30 yv30Var = (yv30) obj2;
                InstantJob instantJob = (InstantJob) obj;
                if ((instantJob instanceof sv30) && yv30Var.b.contains(((sv30) instantJob).c)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                rx30 rx30Var = (rx30) obj2;
                int i3 = ovr0.n;
                return new ovr0(rx30Var.i.inflate(R.layout.vkim_search_sync_contacts_vh, (ViewGroup) obj, false), rx30Var.h);
            case 3:
                ((tam0) obj2).j = (vlo) obj;
                return s3q0.a;
            case 4:
                int i4 = MultiVideoTimelineView.y0;
                L.g("MultiVideoTimelineView", (Throwable) obj);
                Toast.makeText(((MultiVideoTimelineView) obj2).getContext(), R.string.vk_error, 0).show();
                return s3q0.a;
            case 5:
                return ((dv60) obj2).b.e(new kv60((qr60.a) obj));
            case 6:
                t270 t270Var = (t270) obj2;
                int i5 = t270.j1;
                t270Var.getClass();
                xn50.a.c(t270Var, s270.a.b);
                return s3q0.a;
            case 7:
                ((qe70) obj2).T(new cf70.h((VKList) obj));
                return s3q0.a;
            case 8:
                ((hg70) obj2).T(sg70.b);
                return s3q0.a;
            case 9:
                return OnboardingPromoState.a((OnboardingPromoState) obj, null, null, (OnboardingPromoState.CurrentSlide) obj2, false, 11);
            case 10:
                yp80 yp80Var = (yp80) obj2;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 11:
                NewsEntry.TrackData trackData = ((OptionalNativeAdEntry) obj2).n;
                ((x9v0) obj).getNetworkName();
                throw null;
            case 12:
                oa90 oa90Var = (oa90) obj2;
                UsersSearchResponseDto usersSearchResponseDto = (UsersSearchResponseDto) obj;
                List<UsersUserFullDto> d = usersSearchResponseDto.d();
                j2r0 j2r0Var = oa90Var.k;
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (UsersUserFullDto usersUserFullDto : d) {
                    j2r0Var.getClass();
                    arrayList.add(j2r0.a(usersUserFullDto));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!oa90Var.d.J(new l6u(((UserProfile) next).c, 25))) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new pqs((UserProfile) it2.next()));
                }
                return new dts(new ArrayList(arrayList3), usersSearchResponseDto.getCount(), !usersSearchResponseDto.d().isEmpty());
            case 13:
                int i6 = u1a0.A1;
                ((u1a0) obj2).hide();
                return s3q0.a;
            case 14:
                final mqa0 mqa0Var = (mqa0) obj2;
                final PixelStats pixelStats = (PixelStats) obj;
                return new io.reactivex.rxjava3.internal.operators.observable.q0(new io.reactivex.rxjava3.functions.a() { // from class: xsna.jqa0
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        PixelStats pixelStats2 = pixelStats;
                        AdsItemBlockAdStatPixelDto.TypeDto typeDto = pixelStats2.c;
                        switch (typeDto == null ? -1 : PixelStats.b.$EnumSwitchMapping$0[typeDto.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                                mqa0.this.d.a((UUID) pixelStats2.e.getValue());
                                break;
                        }
                    }
                });
            case 15:
                ((wh50) obj2).setValue((gob0) obj);
                return s3q0.a;
            case 16:
                lsb0 lsb0Var = (lsb0) obj2;
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                if (th2 instanceof UserDidntVoteException) {
                    lsb0Var.T(new osb0.a(r3, 2));
                }
                return s3q0.a;
            case 17:
                com.vk.newsfeed.impl.posting.a aVar3 = (com.vk.newsfeed.impl.posting.a) obj2;
                olc0 olc0Var = (olc0) obj;
                PosterSettings posterSettings = olc0Var.d;
                if (posterSettings != null) {
                    wmi0.a.a("posterSettings", posterSettings);
                }
                aVar3.f(Boolean.valueOf(!olc0Var.a.isEmpty()));
                return olc0Var;
            case 18:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                ((SwipeDrawableRefreshLayout) obj2).setProgressDrawableFactory((d2e0) obj);
                return s3q0.a;
            case 19:
                VKList vKList = (VKList) obj2;
                qn60.c cVar = (qn60.c) obj;
                return new mwc0(cVar.a, cVar.b, vKList, vKList.j());
            case 20:
                return new rod0((ViewGroup) obj, ((aod0) obj2).j);
            case 21:
                int i7 = QRSharingView.g;
                ((VkImageSimple) ((QRSharingView) obj2).findViewById(R.id.qr_image)).setImageBitmap((Bitmap) obj);
                return s3q0.a;
            case 22:
                final ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) obj2;
                com.vk.mvi.binder.c cVar2 = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr2 = ReactionsFeedFragment.q0;
                com.vk.mvi.binder.c.a(cVar2, f9t.w(reactionsFeedFragment.ho()), new iyp() { // from class: xsna.v3f0
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        qcy<Object>[] qcyVarArr3 = ReactionsFeedFragment.q0;
                        ReactionsFeedFragment reactionsFeedFragment2 = ReactionsFeedFragment.this;
                        reactionsFeedFragment2.eo();
                        o3f0.a(reactionsFeedFragment2.eo(), reactionsFeedFragment2, reactionsFeedFragment2.getActivity(), reactionsFeedFragment2.Z, (d4f0) pk50Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar2, f9t.F(f9t.z(reactionsFeedFragment.ho()), new amp(23)), new xq70(reactionsFeedFragment, i2));
                return s3q0.a;
            case 23:
                com.vk.reefton.trackers.j jVar = (com.vk.reefton.trackers.j) obj2;
                com.vk.reefton.d dVar = jVar.a;
                ReefEvent reefEvent = (ReefEvent) obj;
                if (reefEvent instanceof ReefEvent.x) {
                    String str = ((ReefEvent.x) reefEvent).c;
                    if (!epx.f(jVar.i, str)) {
                        jVar.i = str;
                        jVar.g = 0;
                        jVar.e = j.a.b();
                        jVar.f = 0;
                        jVar.h = Long.valueOf(System.currentTimeMillis());
                        jVar.d = false;
                        jVar.j = -1L;
                        jVar.l = null;
                        jVar.e = uya0.a(jVar.e, UUID.randomUUID().toString(), false, null, null, null, null, 0L, null, 0, null, null, null, null, null, null, false, 0L, 0L, null, 294588);
                    }
                } else if (reefEvent instanceof ReefEvent.y) {
                    dVar.a(jVar, ReefRequestReason.PLAYBACK_STOP, ((ReefEvent.y) reefEvent).a);
                    jVar.h = null;
                } else if (reefEvent instanceof ReefEvent.k) {
                    jVar.e = uya0.a(jVar.e, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, true, 0L, 0L, null, 491519);
                } else if (reefEvent instanceof ReefEvent.l) {
                    ReefEvent.l lVar = (ReefEvent.l) reefEvent;
                    jVar.d = false;
                    long currentTimeMillis = jVar.l != null ? System.currentTimeMillis() - jVar.l.longValue() : 0L;
                    uya0 uya0Var = jVar.e;
                    long j = lVar.b;
                    long j2 = lVar.a;
                    Long a = j.a.a(jVar.h);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    int i8 = jVar.f + 1;
                    jVar.f = i8;
                    jVar.e = uya0.a(uya0Var, null, false, null, null, null, Long.valueOf(j), a, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Integer.valueOf(i8), Long.valueOf(currentTimeMillis2), Long.valueOf(j2), 0L, null, null, null, false, jVar.e.q + currentTimeMillis, currentTimeMillis, null, 323615);
                    jVar.l = null;
                    dVar.a(jVar, ReefRequestReason.BUFFERING_STARTED, j2);
                } else if (reefEvent instanceof ReefEvent.n) {
                    ReefEvent.n nVar = (ReefEvent.n) reefEvent;
                    uya0 uya0Var2 = jVar.e;
                    nVar.getClass();
                    Long a2 = j.a.a(jVar.h);
                    Long l = jVar.e.j;
                    Long valueOf = l != null ? Long.valueOf(System.currentTimeMillis() - l.longValue()) : null;
                    Long l2 = jVar.e.k;
                    jVar.e = uya0.a(uya0Var2, null, false, null, null, null, 0L, a2, null, null, null, null, valueOf, l2 != null ? Long.valueOf(nVar.a - l2.longValue()) : null, null, null, false, 0L, 0L, null, 518047);
                } else if (reefEvent instanceof ReefEvent.m) {
                    ReefEvent.m mVar = (ReefEvent.m) reefEvent;
                    jVar.d = true;
                    uya0 uya0Var3 = jVar.e;
                    long j3 = mVar.b;
                    long j4 = mVar.a;
                    Long valueOf2 = Long.valueOf(j3);
                    Long a3 = j.a.a(jVar.h);
                    Float valueOf3 = Float.valueOf(1.0f);
                    Long a4 = j.a.a(jVar.e.j);
                    Long l3 = jVar.e.k;
                    uya0 a5 = uya0.a(uya0Var3, null, false, null, null, null, valueOf2, a3, valueOf3, null, null, null, a4, l3 != null ? Long.valueOf(j4 - l3.longValue()) : null, null, null, false, 0L, 0L, null, 517919);
                    jVar.e = a5;
                    if (a5.b) {
                        jVar.l = Long.valueOf(System.currentTimeMillis());
                    }
                    dVar.a(jVar, ReefRequestReason.BUFFERING_ENDED, j4);
                } else if (reefEvent instanceof ReefEvent.q) {
                    ReefEvent.q qVar = (ReefEvent.q) reefEvent;
                    jVar.e = uya0.a(jVar.e, null, true, null, null, null, Long.valueOf(qVar.b), j.a.a(jVar.h), null, null, null, null, null, null, null, null, false, 0L, 0L, null, 524189);
                    if (jVar.d) {
                        jVar.l = Long.valueOf(System.currentTimeMillis());
                    }
                    dVar.a(jVar, ReefRequestReason.PLAYBACK_START, qVar.a);
                } else if (reefEvent instanceof ReefEvent.p) {
                    ReefEvent.p pVar = (ReefEvent.p) reefEvent;
                    if (jVar.e.b) {
                        long currentTimeMillis3 = jVar.l != null ? System.currentTimeMillis() - jVar.l.longValue() : 0L;
                        jVar.e = uya0.a(jVar.e, null, false, null, null, null, Long.valueOf(pVar.b), j.a.a(jVar.h), null, null, null, null, null, null, null, null, false, jVar.e.q + currentTimeMillis3, currentTimeMillis3, null, 327581);
                        jVar.l = null;
                        dVar.a(jVar, ReefRequestReason.PLAYBACK_PAUSE, pVar.a);
                    }
                } else if (reefEvent instanceof ReefEvent.u) {
                    ReefEvent.u uVar = (ReefEvent.u) reefEvent;
                    uya0 uya0Var4 = jVar.e;
                    if (!uya0Var4.b) {
                        uVar.getClass();
                        jVar.e = uya0.a(uya0Var4, null, true, null, null, null, 0L, j.a.a(jVar.h), null, null, null, null, null, null, null, null, false, 0L, 0L, null, 524189);
                        if (jVar.d) {
                            jVar.l = Long.valueOf(System.currentTimeMillis());
                        }
                        dVar.a(jVar, ReefRequestReason.PLAYBACK_RESUME, uVar.a);
                    }
                } else if (reefEvent instanceof ReefEvent.z) {
                    jVar.e = uya0.a(jVar.e, null, false, Integer.valueOf(((ReefEvent.z) reefEvent).b), null, null, null, j.a.a(jVar.h), null, null, null, null, null, null, null, null, false, 0L, 0L, null, 524219);
                } else if (reefEvent instanceof ReefEvent.PlayerQualityChange) {
                    ReefEvent.PlayerQualityChange playerQualityChange = (ReefEvent.PlayerQualityChange) reefEvent;
                    if (playerQualityChange.c == ReefEvent.PlayerQualityChange.Reason.ACTUAL) {
                        uya0 uya0Var5 = jVar.e;
                        jVar.e = uya0.a(uya0Var5, null, false, null, playerQualityChange.b, uya0Var5.d, null, null, null, null, null, null, null, null, null, null, false, 0L, 0L, playerQualityChange.d, 262119);
                        dVar.a(jVar, ReefRequestReason.BITRATE_CHANGED_ACTUAL, playerQualityChange.a);
                    }
                } else if (reefEvent instanceof ReefEvent.w) {
                    jVar.e = uya0.a(jVar.e, null, false, null, null, null, 0L, j.a.a(jVar.h), null, null, null, null, null, null, null, null, false, 0L, 0L, null, 524191);
                    dVar.a(jVar, ReefRequestReason.PLAYBACK_SEEK_START, ((ReefEvent.w) reefEvent).a);
                } else if (reefEvent instanceof ReefEvent.v) {
                    ReefEvent.v vVar = (ReefEvent.v) reefEvent;
                    jVar.e = uya0.a(jVar.e, null, false, null, null, null, Long.valueOf(vVar.b), j.a.a(jVar.h), null, null, null, null, null, null, null, null, false, 0L, 0L, null, 524191);
                    dVar.a(jVar, ReefRequestReason.PLAYBACK_SEEK_END, vVar.a);
                } else if (reefEvent instanceof ReefEvent.e) {
                    ReefEvent.e eVar = (ReefEvent.e) reefEvent;
                    jVar.e = uya0.a(jVar.e, null, false, null, null, null, Long.valueOf(eVar.b), null, null, null, null, null, null, null, null, new zmf0(eVar.c, eVar.d, eVar.e), false, 0L, 0L, null, 507871);
                } else if (reefEvent instanceof ReefEvent.s) {
                    ReefEvent.s sVar = (ReefEvent.s) reefEvent;
                    long j5 = sVar.b;
                    long j6 = jVar.j;
                    if (j5 != j6 && jVar.e.b && j6 == -1) {
                        dVar.a(jVar, ReefRequestReason.UX_PLAYBACK_PLAY, sVar.a);
                        jVar.j = j5;
                    }
                } else if (reefEvent instanceof ReefEvent.r) {
                    jVar.j = -1L;
                } else if (reefEvent instanceof ReefEvent.g) {
                    ReefEvent.g gVar = (ReefEvent.g) reefEvent;
                    Throwable th3 = gVar.b;
                    String message = th3.getMessage();
                    if (message == null) {
                        message = th3.toString();
                    }
                    jVar.c = new bwa0(-1, message);
                    dVar.a(jVar, ReefRequestReason.PLAYBACK_ERROR, gVar.a);
                }
                return s3q0.a;
            case 24:
                q7h0.a aVar4 = (q7h0.a) obj;
                return new m7h0.b(aVar4.c, ((c7h0) obj2).l.a(aVar4.a), aVar4.b);
            case 25:
                ((io.reactivex.rxjava3.core.b) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 26:
                ((zak0) ((a9k0) obj2).d).setValue((String) obj);
                return s3q0.a;
            case 27:
                SnowballsCoverHolder snowballsCoverHolder = (SnowballsCoverHolder) obj2;
                snowballsCoverHolder.c(SnowballsCoverHolder.SnowballModalEvent.CLOSE);
                dw20 dw20Var = snowballsCoverHolder.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 28:
                ((StickersRecyclerView) obj2).p = true;
                return s3q0.a;
            default:
                ((mfm0) obj2).j = (StoryEntry) obj;
                return s3q0.a;
        }
    }

    public /* synthetic */ c230(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ c230(tt80 tt80Var, int i, OptionalNativeAdEntry optionalNativeAdEntry) {
        this.b = 11;
        this.c = optionalNativeAdEntry;
    }
}
