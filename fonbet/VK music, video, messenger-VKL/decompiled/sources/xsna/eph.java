package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.util.Size;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.video.group_filter.GroupFilterTileVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupHorizontalListItemVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.GifWithQueryData;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.labels.MarketItemModalApproveInfoModel;
import com.vk.ecomm.market.api.labels.MarketModalContentItem;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.a;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.im.chat.api.ChatAnalyticsParamsNoLogging;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.ui.components.common.UserActions;
import com.vk.im.ui.fragments.ImStartGroupCallFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.music.playlist.display.domain.i;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.profile.community.api.router.CommunityMembersSource;
import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToBookmarks;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.multiaccount.api.SimpleDate;
import com.vk.toggle.features.SmbFeatures;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;
import com.vk.voip.ui.join.directly.withpreview.JoinCallConfig;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.b26;
import xsna.cos;
import xsna.crd0;
import xsna.dkq0;
import xsna.e3s;
import xsna.fys;
import xsna.gm50;
import xsna.ikv0;
import xsna.kjf0;
import xsna.ppd0;
import xsna.pzx;
import xsna.qs80;
import xsna.tj50;
import xsna.tkd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class eph implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eph(UIBlockGroupFilter uIBlockGroupFilter, GroupFilterTileVh groupFilterTileVh) {
        this.b = 25;
        this.c = uIBlockGroupFilter;
    }

    private final Object a(Object obj) {
        pno0 pno0Var = (pno0) obj;
        com.vk.im.ui.components.contacts.a aVar = ((ImStartGroupCallFragment) this.c).W;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a1(pno0Var.d());
        return s3q0.a;
    }

    private final Object c(Object obj) {
        com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) this.c;
        cVar.c.a();
        com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar = cVar.c;
        dVar.e(true);
        dVar.d((Poll) obj, true);
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05dd  */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v144, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v186, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v189, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v58, types: [V extends xsna.x65, xsna.x65] */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v128, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v132, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v135, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v141, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v143, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v146, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v149, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v152, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v59, types: [xsna.ojd0] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v96, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v95, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign, java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r9v23, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ChatFragment.b bVar;
        String message;
        Image image;
        Image image2;
        String str;
        String str2;
        String str3;
        List list;
        MarketModalContentItem marketModalContentItem;
        MarketItemModalApproveInfoModel marketItemModalApproveInfoModel;
        MarketModalContentItem marketModalContentItem2;
        List<kjf0.a> list2;
        long j;
        UserId userId;
        boolean z;
        int i = this.b;
        int i2 = 8;
        boolean z2 = true;
        r6 = true;
        boolean z3 = true;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((hph) obj2).f.invoke(new d.a(true));
                return s3q0.a;
            case 1:
                ((ush) obj2).f.invoke(new d.n.a(false));
                return s3q0.a;
            case 2:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) obj2;
                Throwable th = (Throwable) ((Pair) obj).d();
                if (th != null) {
                    wej c1 = aVar.c1();
                    c1.getClass();
                    zk70.e(th);
                    c1.h.removeCallbacksAndMessages(c1.g);
                }
                return s3q0.a;
            case 3:
                puj pujVar = (puj) obj2;
                List list3 = (List) obj;
                if (pujVar.t.d() != null) {
                    list3.add(pujVar.t.d().a);
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 4:
                CreateChatTransferFragment createChatTransferFragment = (CreateChatTransferFragment) obj2;
                EditText editText = createChatTransferFragment.q0;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (createChatTransferFragment.isResumed()) {
                        editText.requestFocus();
                        editText.setSelection(text.length());
                        mhy.j(editText);
                    }
                }
                return s3q0.a;
            case 5:
                return xck.a((xck) ((wck) obj2).b.getCurrentState(), null, null, SnackBar.COPY, 127);
            case 6:
                ((d0l) obj2).d(((Long) obj).longValue());
                return s3q0.a;
            case 7:
                ugl uglVar = (ugl) obj2;
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                uglVar.w(ocx.a(uglVar.l, null, null, false, null, null, null, false, false, th2, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4193791));
                io.reactivex.rxjava3.disposables.c cVar = uglVar.p;
                if (cVar != null) {
                    cVar.dispose();
                }
                uglVar.p = null;
                return s3q0.a;
            case 8:
                List list4 = (List) obj;
                qkr0 qkr0Var = ((zam) obj2).h;
                if (qkr0Var != null) {
                    boolean contains = list4.contains(UserActions.MARK_AS_SPAM);
                    xam xamVar = qkr0Var.a;
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    xamVar.j.D(xamVar, new yv30(Peer.a.b(xamVar.t.a.e), MsgRequestStatus.REJECTED, contains));
                    b26.b bVar2 = xamVar.x;
                    if (bVar2 != null && (bVar = b26.this.m) != null) {
                        ChatFragment chatFragment = ChatFragment.this;
                        chatFragment.Hn();
                        chatFragment.finish();
                    }
                }
                return s3q0.a;
            case 9:
                Collection<Long> collection = (Collection) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                Map J = xgl0Var.b().e().J(-1, collection);
                Map<Long, lj30> R = xgl0Var.o().R(collection);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (com.vk.im.engine.models.dialogs.b bVar3 : J.values()) {
                    Long valueOf = Long.valueOf(bVar3.b);
                    lj30 lj30Var = R.get(Long.valueOf(bVar3.b));
                    vjm vjmVar = bVar3.e;
                    if (vjmVar == null) {
                        vjmVar = bVar3.d;
                    }
                    linkedHashMap.put(valueOf, lmm.b(vjmVar.c(bVar3.S && bVar3.c()).b(bVar3.v.d()).b, vjmVar.c, ((lj30Var != null && !lj30Var.j) && (lj30Var != null && lj30Var.m)) ? lj30Var.c : 0, lj30Var != null ? lj30Var.c() : false));
                }
                return new nmm(linkedHashMap, J, R);
            case 10:
                Peer peer = (Peer) obj2;
                com.vk.im.engine.models.dialogs.b bVar4 = (com.vk.im.engine.models.dialogs.b) obj;
                ChatSettings chatSettings = bVar4.z;
                if (chatSettings == null) {
                    return bVar4;
                }
                Set R0 = j5g.R0(chatSettings.e);
                R0.add(peer);
                return com.vk.im.engine.models.dialogs.b.a(bVar4, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, ChatSettings.zb(chatSettings, null, null, R0, 0, false, -9), null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -16777217, 2097151);
            case 11:
                com.vk.music.playlist.display.domain.f fVar = (com.vk.music.playlist.display.domain.f) obj2;
                tj50.a aVar2 = (tj50.a) obj;
                int i4 = 16;
                g53 g53Var = new g53(i4);
                ao8 ao8Var = ao8.d;
                return new i.a.C1350a(aVar2.a(g53Var, ao8Var), aVar2.a(sfn.b, ao8Var), aVar2.a(tfn.b, ao8Var), aVar2.a(ufn.b, ao8Var), aVar2.a(vfn.b, ao8Var), aVar2.a(new u4e(fVar, 12), ao8Var), aVar2.a(wfn.b, ao8Var), aVar2.a(new af2(fVar, i4), ao8Var), aVar2.a(xfn.b, ao8Var), aVar2.a(new sm(21), ao8Var), aVar2.a(new vd1(14), ao8Var), aVar2.a(pfn.b, ao8Var), aVar2.a(qfn.b, ao8Var), aVar2.a(rfn.b, ao8Var));
            case 12:
                com.vk.photos.ui.editalbum.domain.c cVar3 = (com.vk.photos.ui.editalbum.domain.c) obj2;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                com.vk.photos.ui.editalbum.domain.d dVar = cVar3.f;
                List<Uri> list5 = dVar.h.c;
                if (list5 != null && !list5.isEmpty()) {
                    com.vk.photos.root.common.a a = dVar.g.a(photoAlbum.b, photoAlbum.c);
                    List<Uri> list6 = dVar.h.c;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list6.iterator();
                    while (it.hasNext()) {
                        String path = ((Uri) it.next()).getPath();
                        if (path != null) {
                            arrayList.add(path);
                        }
                    }
                    a.b(arrayList, cVar3.e);
                }
                return s3q0.a;
            case 13:
                vop vopVar = (vop) obj2;
                i270.a(vopVar.a, drm0.p0(vopVar.N).toString(), vopVar.b, null);
                return s3q0.a;
            case 14:
                EnterProfilePresenter enterProfilePresenter = (EnterProfilePresenter) obj2;
                enterProfilePresenter.D = false;
                enterProfilePresenter.B0(com.vk.auth.entername.a.b(enterProfilePresenter.A, null, null, (SimpleDate) obj, null, null, 27));
                return s3q0.a;
            case 15:
                int i5 = ExploreFragment.h0;
                h3p0.b((ExploreFragment) obj2);
                return s3q0.a;
            case 16:
                ((q7r) obj2).r0.c();
                return s3q0.a;
            case 17:
                h3s h3sVar = ((d3s) obj2).b;
                dkq0 dkq0Var = (dkq0) obj;
                if (dkq0Var instanceof dkq0.a) {
                    h3sVar.C(new e3s.a.C2775a(true, ((dkq0.a) dkq0Var).a, false));
                } else {
                    if (!(dkq0Var instanceof dkq0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((dkq0.b) dkq0Var).getClass();
                    h3sVar.C(new e3s.a.b(true, null, false));
                }
                return s3q0.a;
            case 18:
                FriendsCleanupFragment friendsCleanupFragment = (FriendsCleanupFragment) obj2;
                int i6 = FriendsCleanupFragment.W;
                xns fo = friendsCleanupFragment.fo();
                fo.a.setVisibility(8);
                fo.b.setVisibility(8);
                fo.c.setVisibility(0);
                fo.d.setVisibility(8);
                gm50.a.a(friendsCleanupFragment, ((cos.c) obj).a, new dwg(friendsCleanupFragment, 15));
                return s3q0.a;
            case 19:
                fws fwsVar = (fws) obj2;
                gws gwsVar = fwsVar.a;
                gwsVar.f = true;
                gwsVar.e = GifWithQueryData.zb(gwsVar.e, (String) obj, null, 2);
                io.reactivex.rxjava3.subjects.f<s3q0> fVar2 = fwsVar.n;
                s3q0 s3q0Var = s3q0.a;
                fVar2.onNext(s3q0Var);
                return s3q0Var;
            case 20:
                cys cysVar = (cys) obj2;
                if (cysVar.e instanceof fys.b) {
                    cysVar.b.invoke();
                }
                return s3q0.a;
            case 21:
                final GoodFragment goodFragment = (GoodFragment) obj2;
                tkd0 tkd0Var = (tkd0) obj;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                boolean z4 = tkd0Var instanceof tkd0.e;
                if (z4) {
                    tkd0.e eVar = (tkd0.e) tkd0Var;
                    UsableRecyclerView usableRecyclerView = goodFragment.n0;
                    RecyclerView.Adapter adapter = usableRecyclerView != null ? usableRecyclerView.getAdapter() : null;
                    jid0 jid0Var = adapter instanceof jid0 ? (jid0) adapter : null;
                    if (jid0Var != null && (list2 = jid0Var.c) != null) {
                        Iterator it2 = list2.iterator();
                        int i7 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (i7 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                int i8 = ((kjf0.a) next).a;
                                eVar.getClass();
                                if (i8 != 25) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        Integer valueOf2 = i7 != -1 ? Integer.valueOf(i7) : null;
                        if (valueOf2 != null) {
                            int intValue = valueOf2.intValue();
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) goodFragment.n0.getLayoutManager();
                            if (linearLayoutManager != null) {
                                linearLayoutManager.K(intValue, 0);
                            }
                        }
                    }
                } else {
                    boolean z5 = tkd0Var instanceof tkd0.g;
                    if (z5) {
                        goodFragment.po();
                    } else {
                        boolean z6 = tkd0Var instanceof ukd0;
                        if (z6) {
                            cxo Po = goodFragment.Po();
                            h8u h8uVar = goodFragment.Po().J;
                            Po.J = h8uVar != null ? h8u.c(h8uVar, null, 523263) : null;
                            jid0 jid0Var2 = goodFragment.Po().G;
                            if (jid0Var2 != null) {
                                jid0Var2.A0(kjf0.a.c(25, goodFragment.Po().J));
                            }
                        } else {
                            vkd0 vkd0Var = (vkd0) goodFragment.N0.getValue();
                            vkd0Var.getClass();
                            if (tkd0Var instanceof tkd0.c) {
                                ald0 ald0Var = (ald0) vkd0Var.c.getValue();
                                tkd0.c cVar4 = (tkd0.c) tkd0Var;
                                rkd0 rkd0Var = ald0Var.b;
                                if (cVar4 instanceof tkd0.c.a) {
                                    tkd0.c.a aVar3 = (tkd0.c.a) cVar4;
                                    ((ImageViewer) rkd0Var.q.getValue()).g(aVar3.b, aVar3.a, goodFragment.requireContext(), new zkd0(aVar3, ald0Var), o25.a().c());
                                } else {
                                    if (!(cVar4 instanceof tkd0.c.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ((ydt0) rkd0Var.s.getValue()).k(goodFragment.requireContext(), ((tkd0.c.b) cVar4).a, (r43 & 4) != 0 ? null : com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM), (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                                }
                            } else if (tkd0Var instanceof tkd0.d) {
                                lld0 lld0Var = (lld0) vkd0Var.d.getValue();
                                tkd0.d dVar2 = (tkd0.d) tkd0Var;
                                rkd0 rkd0Var2 = lld0Var.b;
                                Context requireContext = goodFragment.requireContext();
                                if (dVar2 instanceof tkd0.d.f) {
                                    a.b bVar5 = ((tkd0.d.f) dVar2).a;
                                    oac oacVar = new oac(lld0Var, 13);
                                    pb00 pb00Var = new pb00(lld0Var, 19);
                                    u70 u70Var = new u70(lld0Var, 9);
                                    MarketFavable marketFavable = bVar5.a;
                                    String str4 = bVar5.b;
                                    GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = bVar5.c;
                                    ((com.vk.ecomm.market.good.c) ((com.vk.ecomm.market.good.c) rkd0Var2.J.getValue()).j.c).g.a(requireContext, marketFavable, u70Var, oacVar, pb00Var, true, str4, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : 0);
                                    s3q0 s3q0Var2 = s3q0.a;
                                } else if (dVar2 instanceof tkd0.d.e) {
                                    mpd0 mpd0Var = ((tkd0.d.e) dVar2).a;
                                    lld0Var.c = new l5u(requireContext, new MarketItemModalApproveInfoModel(mpd0Var.d, mpd0Var.a, mpd0Var.b, mpd0Var.c, MarketItemModalApproveInfoModel.ModalApproveInfoType.INTEGRATION_PRICE), new rkt(lld0Var, 26), false).I0(null);
                                } else if (dVar2 instanceof tkd0.d.C3754d) {
                                    tkd0.d.C3754d c3754d = (tkd0.d.C3754d) dVar2;
                                    ((ajg0) rkd0Var2.z.getValue()).p(requireContext, c3754d.a, c3754d.b, c3754d.c, c3754d.d);
                                } else if (dVar2 instanceof tkd0.d.c) {
                                    ((ajg0) rkd0Var2.z.getValue()).r(0, requireContext, ((tkd0.d.c) dVar2).a);
                                } else if (dVar2 instanceof tkd0.d.b) {
                                    tkd0.d.b bVar6 = (tkd0.d.b) dVar2;
                                    ((ajg0) rkd0Var2.z.getValue()).l(requireContext, bVar6.a, bVar6.b, null);
                                } else {
                                    if (!(dVar2 instanceof tkd0.d.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ppd0 ppd0Var = ((tkd0.d.a) dVar2).a.f;
                                    if (!(ppd0Var instanceof ppd0.a) && ppd0Var != null) {
                                        boolean z7 = ppd0Var instanceof mpd0;
                                        if (z7) {
                                            image2 = ((mpd0) ppd0Var).d;
                                        } else if (ppd0Var instanceof npd0) {
                                            image2 = ((npd0) ppd0Var).d;
                                        } else if (ppd0Var instanceof opd0) {
                                            image2 = ((opd0) ppd0Var).d;
                                        } else {
                                            image = null;
                                            if (!z7) {
                                                str = ((mpd0) ppd0Var).a;
                                            } else if (ppd0Var instanceof npd0) {
                                                str = ((npd0) ppd0Var).a;
                                            } else if (ppd0Var instanceof opd0) {
                                                str = ((opd0) ppd0Var).a;
                                            }
                                            String str5 = str;
                                            if (!z7) {
                                                str2 = ((mpd0) ppd0Var).b;
                                            } else if ((ppd0Var instanceof npd0) || (ppd0Var instanceof opd0)) {
                                                str2 = str5;
                                            }
                                            if (!z7) {
                                                str3 = ((mpd0) ppd0Var).c;
                                            } else if (ppd0Var instanceof npd0) {
                                                str3 = ((npd0) ppd0Var).c;
                                            } else if (ppd0Var instanceof opd0) {
                                                str3 = ((opd0) ppd0Var).c;
                                            }
                                            String str6 = str3;
                                            if (!(ppd0Var instanceof npd0)) {
                                                List<ihj> list7 = ((npd0) ppd0Var).e;
                                                list = new ArrayList(c5g.u(list7, 10));
                                                for (ihj ihjVar : list7) {
                                                    int i9 = qpd0.$EnumSwitchMapping$0[ihjVar.a.ordinal()];
                                                    if (i9 == 1) {
                                                        marketModalContentItem2 = MarketModalContentItem.FULL_SIZE_APPLICATION;
                                                    } else if (i9 == 2) {
                                                        marketModalContentItem2 = MarketModalContentItem.FULL_SIZE_PAYMENT;
                                                    } else {
                                                        if (i9 != 3) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        marketModalContentItem2 = MarketModalContentItem.FULL_SIZE_DELIVERY;
                                                    }
                                                    list.add(new c210(marketModalContentItem2, ihjVar.b, ihjVar.c, ihjVar.d));
                                                }
                                            } else if (ppd0Var instanceof opd0) {
                                                List<ihj> list8 = ((opd0) ppd0Var).e;
                                                list = new ArrayList(c5g.u(list8, 10));
                                                for (ihj ihjVar2 : list8) {
                                                    int i10 = qpd0.$EnumSwitchMapping$0[ihjVar2.a.ordinal()];
                                                    if (i10 == 1) {
                                                        marketModalContentItem = MarketModalContentItem.FULL_SIZE_APPLICATION;
                                                    } else if (i10 == 2) {
                                                        marketModalContentItem = MarketModalContentItem.FULL_SIZE_PAYMENT;
                                                    } else {
                                                        if (i10 != 3) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        marketModalContentItem = MarketModalContentItem.FULL_SIZE_DELIVERY;
                                                    }
                                                    list.add(new c210(marketModalContentItem, ihjVar2.b, ihjVar2.c, ihjVar2.d));
                                                }
                                            } else {
                                                list = EmptyList.b;
                                            }
                                            marketItemModalApproveInfoModel = new MarketItemModalApproveInfoModel(image, str5, str2, str6, MarketItemModalApproveInfoModel.ModalApproveInfoType.LABEL, list);
                                            if (marketItemModalApproveInfoModel != null) {
                                                if (!(ppd0Var instanceof npd0) && !(ppd0Var instanceof opd0)) {
                                                    z3 = false;
                                                }
                                                lld0Var.c = new l5u(requireContext, marketItemModalApproveInfoModel, new kld0(lld0Var, i3), z3).I0(null);
                                            }
                                        }
                                        image = image2;
                                        if (!z7) {
                                        }
                                        String str52 = str;
                                        if (!z7) {
                                        }
                                        if (!z7) {
                                        }
                                        String str62 = str3;
                                        if (!(ppd0Var instanceof npd0)) {
                                        }
                                        marketItemModalApproveInfoModel = new MarketItemModalApproveInfoModel(image, str52, str2, str62, MarketItemModalApproveInfoModel.ModalApproveInfoType.LABEL, list);
                                        if (marketItemModalApproveInfoModel != null) {
                                        }
                                    }
                                    marketItemModalApproveInfoModel = null;
                                    if (marketItemModalApproveInfoModel != null) {
                                    }
                                }
                            } else if (tkd0Var instanceof tkd0.b) {
                                zjd0 zjd0Var = (zjd0) vkd0Var.e.getValue();
                                tkd0.b bVar7 = (tkd0.b) tkd0Var;
                                rkd0 rkd0Var3 = zjd0Var.b;
                                Context requireContext2 = goodFragment.requireContext();
                                if (bVar7 instanceof tkd0.b.f) {
                                    e4h.l((e4h) rkd0Var3.t.getValue(), requireContext2, ((tkd0.b.f) bVar7).a, new pb00(zjd0Var, 18), null, 24);
                                } else if (bVar7 instanceof tkd0.b.a) {
                                    ((d0i) rkd0Var3.u.getValue()).d(requireContext2, fkq0.e(((tkd0.b.a) bVar7).a));
                                } else if (bVar7 instanceof tkd0.b.C3753b) {
                                    rml0.a((rml0) rkd0Var3.w.getValue(), requireContext2, ((tkd0.b.C3753b) bVar7).a, null, 28);
                                } else if (bVar7 instanceof tkd0.b.d) {
                                    com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) rkd0Var3.B.getValue(), requireContext2, ((tkd0.b.d) bVar7).a, null, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                                } else if (bVar7 instanceof tkd0.b.c) {
                                    tkd0.b.c cVar5 = (tkd0.b.c) bVar7;
                                    ((d0i) rkd0Var3.u.getValue()).c(requireContext2, cVar5.a, cVar5.b, CommunityMembersSource.MARKET, requireContext2.getString(R.string.good_group_members));
                                } else {
                                    if (!(bVar7 instanceof tkd0.b.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    tkd0.b.e eVar2 = (tkd0.b.e) bVar7;
                                    me10.b((me10) rkd0Var3.D.getValue(), requireContext2, eVar2.a, Long.valueOf(eVar2.b), null, 8);
                                }
                            } else if (tkd0Var instanceof tkd0.f) {
                                Exception exc = ((tkd0.f) tkd0Var).a;
                                Context requireContext3 = goodFragment.requireContext();
                                VKApiExecutionException vKApiExecutionException = exc instanceof VKApiExecutionException ? (VKApiExecutionException) exc : null;
                                if (vKApiExecutionException == null || (message = vKApiExecutionException.t()) == null) {
                                    message = exc.getMessage();
                                }
                                ikv0.a aVar4 = new ikv0.a(requireContext3);
                                aVar4.u = new ikv0.d(message, (String) null, (ikv0.d.a) null, 6);
                                aVar4.k = 1;
                                aVar4.n();
                            } else if (tkd0Var instanceof tkd0.a) {
                                final qjd0 qjd0Var = (qjd0) vkd0Var.f.getValue();
                                tkd0.a aVar5 = (tkd0.a) tkd0Var;
                                rkd0 rkd0Var4 = qjd0Var.b;
                                if (aVar5 instanceof tkd0.a.b) {
                                    tkd0.a.b bVar8 = (tkd0.a.b) aVar5;
                                    dw20 dw20Var = qjd0Var.c;
                                    if (dw20Var != null) {
                                        dw20Var.dismiss();
                                    }
                                    qjd0Var.c = null;
                                    kmu0 kmu0Var = new kmu0(goodFragment.requireContext(), tzp0.a(null, 3));
                                    kmu0Var.F0(true);
                                    kmu0Var.P0();
                                    kmu0Var.O0();
                                    kmu0Var.U0(new jai(-1739998637, new n85(i2, qjd0Var, bVar8), true));
                                    qjd0Var.c = kmu0Var.I0(null);
                                } else if (aVar5 instanceof tkd0.a.C3752a) {
                                    tkd0.a.C3752a c3752a = (tkd0.a.C3752a) aVar5;
                                    ((kk6) rkd0Var4.O.getValue()).i(PostingCreationEntryPoint.CommunityCreationOnboardingBlock).g(c3752a.a, c3752a.b).e(c3752a.c).j().l(goodFragment.requireContext());
                                } else {
                                    if (!(aVar5 instanceof tkd0.a.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (qjd0Var.d == null) {
                                        final UserId userId2 = ((tkd0.a.c) aVar5).a;
                                        qjd0Var.d = new bd70() { // from class: xsna.ojd0
                                            /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
                                            @Override // xsna.bd70
                                            public final void x0(int i11, int i12, Object obj3) {
                                                NewsEntry newsEntry = (NewsEntry) obj3;
                                                if (epx.f(k9q0.o(newsEntry), UserId.this)) {
                                                    Context requireContext4 = goodFragment.requireContext();
                                                    ikv0.a aVar6 = new ikv0.a(requireContext4);
                                                    aVar6.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                                                    aVar6.u = new ikv0.d(requireContext4.getString(R.string.product_card_business_onboarding_post_created_title), (String) null, (ikv0.d.a) null, 6);
                                                    String string = requireContext4.getString(R.string.product_card_business_onboarding_post_created_button);
                                                    qjd0 qjd0Var2 = qjd0Var;
                                                    aVar6.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, string, new dda(qjd0Var2, newsEntry, requireContext4, 7));
                                                    aVar6.k = 1;
                                                    aVar6.n();
                                                    ((p870) qjd0Var2.b.P.getValue()).g(qjd0Var2.d);
                                                    qjd0Var2.d = null;
                                                }
                                            }
                                        };
                                        ((p870) rkd0Var4.P.getValue()).b(105, qjd0Var.d);
                                    }
                                }
                            } else if (!z4 && !z5 && !z6) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                }
                return s3q0.a;
            case 22:
                GoodPreviewFragment goodPreviewFragment = (GoodPreviewFragment) obj2;
                crd0 crd0Var = (crd0) obj;
                zqd0 zqd0Var = ((drd0) goodPreviewFragment.S.getValue()).a;
                if (crd0Var instanceof crd0.b) {
                    goodPreviewFragment.kn().onBackPressed();
                } else if (crd0Var instanceof crd0.h) {
                    ((dhc) zqd0Var.h.getValue()).c(goodPreviewFragment.requireContext(), new cgc(null, null, false, null, null, 262143));
                } else if (crd0Var instanceof crd0.c) {
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS;
                    SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
                    UiTrackingScreen b = UiTracker.j.b();
                    SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, null, new CommonMarketStat$TypeMarketTransitionToBookmarks(r5, r5, z2 ? 1 : 0, r5), 57), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b2, uzp0Var.a).q();
                    ((vrq) zqd0Var.f.getValue()).a(goodPreviewFragment.requireContext());
                } else if (crd0Var instanceof crd0.e) {
                    Good good = ((crd0.e) crd0Var).a;
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS;
                    SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUTTONS_REFACH;
                    smbFeatures.getClass();
                    Long valueOf3 = com.vk.toggle.b.A.a(smbFeatures) ? null : Long.valueOf(good.c.b);
                    pyb pybVar = (pyb) zqd0Var.k.getValue();
                    Context requireContext4 = goodPreviewFragment.requireContext();
                    long j2 = good.c.b;
                    String string = good.V ? goodPreviewFragment.requireContext().getString(R.string.market_services_chat_greetings) : goodPreviewFragment.requireContext().getString(R.string.market_chat_greetings);
                    List singletonList = Collections.singletonList(new MarketAttachment(good));
                    String name = commonMarketStat$TypeRefSource2.name();
                    long j3 = good.b;
                    UserId userId3 = good.c;
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM;
                    if (userId3 == null) {
                        Owner owner = good.M;
                        userId = owner != null ? owner.b : null;
                        j = j3;
                    } else {
                        j = j3;
                        userId = userId3;
                    }
                    pyb.b(pybVar, requireContext4, valueOf3, j2, string, singletonList, name, new ChatAnalyticsParamsNoLogging(Long.valueOf(j), userId3, commonMarketStat$TypeRefSource2, mobileOfficialAppsCoreNavStat$EventScreen, true, null, userId, null, 160, null), 31456944);
                } else if (crd0Var instanceof crd0.i) {
                    crd0.i iVar = (crd0.i) crd0Var;
                    ((sz00) zqd0Var.l.getValue()).e(goodPreviewFragment.requireContext(), new rz00(iVar.a, CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS, null, iVar.b, null, null, null, null, null, null, null, null, null, null, null, null, 65524));
                } else if (crd0Var instanceof crd0.j) {
                    crd0.j jVar = (crd0.j) crd0Var;
                    Long valueOf4 = Long.valueOf(jVar.b);
                    Long valueOf5 = Long.valueOf(jVar.a.b);
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource3 = CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS;
                    SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, valueOf4, valueOf5, null, null, null, 40, null);
                    UiTrackingScreen b3 = UiTracker.j.b();
                    SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b3 != null ? b3.a : null, commonMarketStat$TypeRefSource3, null, null, new com.vk.stat.scheme.g0(), 41), 2);
                    UiTracker uiTracker2 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    uzp0 uzp0Var2 = UiTracker.h;
                    uzp0Var2.getClass();
                    new bjc(c2, b4, uzp0Var2.a).q();
                    ((dhc) zqd0Var.h.getValue()).c(goodPreviewFragment.requireContext(), new cgc(null, null, jVar.c, null, null, 255999));
                } else if (crd0Var instanceof crd0.k) {
                    Good good2 = ((crd0.k) crd0Var).a;
                    String a2 = ((y110) zqd0Var.n.getValue()).a(good2);
                    tbj0 a3 = ((bbj0) zqd0Var.o.getValue()).a(goodPreviewFragment.requireContext());
                    a3.q = "market_item";
                    UserId userId4 = good2.c;
                    a3.r = "market" + userId4.b + '_' + good2.b;
                    a3.c = ((a84) zqd0Var.p.getValue()).h(good2, a2);
                    a3.j = good2;
                    a3.d = ((d70) zqd0Var.q.getValue()).i(good2);
                    a3.h = Integer.valueOf(SharingDataType.GOOD.ordinal());
                    a3.c();
                } else if (crd0Var instanceof crd0.d) {
                    crd0.d dVar3 = (crd0.d) crd0Var;
                    fy9 fy9Var = (fy9) zqd0Var.i.getValue();
                    Context requireContext5 = goodPreviewFragment.requireContext();
                    UserId userId5 = dVar3.a;
                    Integer num = dVar3.b;
                    fy9.a(fy9Var, requireContext5, userId5, num != null ? new CartCounterState(num.intValue()) : null, null, 8);
                } else if (crd0Var instanceof crd0.g) {
                    maz.c(((qdz) zqd0Var.r.getValue()).e(), goodPreviewFragment.requireContext(), ((crd0.g) crd0Var).a, LaunchContext.A, null, null, 24);
                } else if (crd0Var instanceof crd0.f) {
                    crd0.f fVar3 = (crd0.f) crd0Var;
                    Context mo2getContext = goodPreviewFragment.mo2getContext();
                    if (mo2getContext != null) {
                        ((e8c) zqd0Var.m.getValue()).a(mo2getContext, fVar3.a, Long.valueOf(fVar3.b));
                    }
                } else {
                    if (!(crd0Var instanceof crd0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    crd0.a aVar6 = (crd0.a) crd0Var;
                    Context mo2getContext2 = goodPreviewFragment.mo2getContext();
                    if (mo2getContext2 != null) {
                        ((kz00) zqd0Var.s.getValue()).b(mo2getContext2, aVar6.a);
                    }
                }
                return s3q0.a;
            case 23:
                ((rg50) obj2).C((int) (((q9x) obj).a & 4294967295L));
                return s3q0.a;
            case 24:
                rgu rguVar = (rgu) obj2;
                rguVar.m.a(rguVar.getBindingAdapterPosition());
                return s3q0.a;
            case 25:
                return Boolean.valueOf(GroupFilterTileVh.p((UIBlockList) obj, (UIBlockGroupFilter) obj2));
            case 26:
                GroupHorizontalListItemVh groupHorizontalListItemVh = (GroupHorizontalListItemVh) obj2;
                if (((qs80) obj) instanceof qs80.c) {
                    groupHorizontalListItemVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_PLAYER_LIVE);
                } else {
                    groupHorizontalListItemVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
                }
                return s3q0.a;
            case 27:
                return a(obj);
            case 28:
                return c(obj);
            default:
                kzx kzxVar = (kzx) obj2;
                s89 s89Var = (s89) obj;
                String str7 = s89Var.b;
                String str8 = s89Var.c;
                int i11 = s89Var.d;
                CallId callId = s89Var.a;
                jsa jsaVar = kzxVar.g;
                lyk0 lyk0Var = kzxVar.i;
                JoinCallConfig joinCallConfig = kzxVar.f;
                String a4 = jsaVar.a();
                JoinData joinData = s89Var.e;
                if (callId.d) {
                    JoinCallConfig.JoinAs joinAs = joinCallConfig.g;
                    if (joinAs.b || joinAs.c || joinAs.d) {
                        z = true;
                        kzxVar.T(new pzx.a.b(a4, callId, str7, str8, i11, joinData, z, joinCallConfig.f, lyk0Var.c(), lyk0Var.e()));
                        return s3q0.a;
                    }
                }
                z = false;
                kzxVar.T(new pzx.a.b(a4, callId, str7, str8, i11, joinData, z, joinCallConfig.f, lyk0Var.c(), lyk0Var.e()));
                return s3q0.a;
        }
    }

    public /* synthetic */ eph(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
