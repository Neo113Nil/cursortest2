package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketCommunityRatingCanAddReviewErrorDto;
import com.vk.api.generated.market.dto.MarketCommunityRatingDto;
import com.vk.api.generated.market.dto.MarketCommunityRatingMarksStatDto;
import com.vk.api.generated.market.dto.MarketCommunityReviewDto;
import com.vk.api.generated.market.dto.MarketCommunityReviewFriendDto;
import com.vk.api.generated.market.dto.MarketCommunityReviewFriendsDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewsResponseDto;
import com.vk.api.generated.market.dto.MarketReviewCommentsDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusResponseDto;
import com.vk.clips.coauthors.invite.CoauthorsInviteDialog;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickerStockItemDiscount;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vk.photo.editor.features.mlenhance.b;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.pushes.receivers.c;
import com.vk.rlottie.RLottieDrawable;
import com.vk.voip.api.join.JoinData;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Ref$BooleanRef;
import one.video.upload.exceptions.InputFileCorruptException;
import xsna.dw20;
import xsna.fcw;
import xsna.g0v;
import xsna.g8b;
import xsna.gcw;
import xsna.gfc0;
import xsna.gm50;
import xsna.i9f0;
import xsna.ikv0;
import xsna.maq0;
import xsna.mp90;
import xsna.mzx;
import xsna.o1t0;
import xsna.o1x0;
import xsna.phw0;
import xsna.s0y;
import xsna.sum0;
import xsna.xo90;
import xsna.ylw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class il7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ il7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [xsna.x9p] */
    /* JADX WARN: Type inference failed for: r11v23, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r4v19, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v2, types: [xsna.zal0] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Iterable iterable;
        ?? r6;
        List<MarketCommunityReviewFriendDto> d;
        UploadDto.UploadState I4;
        SelectionKey keyFor;
        int i = this.b;
        boolean z = true;
        ?? r4 = 0;
        r4 = null;
        String str = null;
        PostingAttachment postingAttachment = null;
        r4 = 0;
        ?? r5 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                jl7 jl7Var = (jl7) obj3;
                ql7 ql7Var = jl7Var.l;
                Context context = jl7Var.itemView.getContext();
                StickerStockItemDiscount stickerStockItemDiscount = ((ol7) obj2).b;
                Collection<UserId> collection = ql7Var.b.b;
                if (collection == null || (iterable = j5g.O0(collection)) == null) {
                    iterable = EmptyList.b;
                }
                ?? a = g2v.d().a();
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((UserId) it.next()).b));
                }
                a.u(context, true, arrayList, ql7Var.c, "bonus_catalog_discount");
                return s3q0.a;
            case 1:
                int i2 = q7b.l1;
                gm50.a.a((q7b) obj3, ((g8b.a) obj).a, new r7b(1, (f8b) obj2, f8b.class, "accept", "accept(Lcom/vk/channels/impl/payout/presentation/ui/state/ChannelPayoutViewState$Data$Content;)V", 0));
                return s3q0.a;
            case 2:
                ClipVideoFile clipVideoFile = ((CoauthorsInviteDialog) obj3).b;
                CoOwnerItem coOwnerItem = (CoOwnerItem) obj2;
                ShortVideoSetCoOwnerStatusResponseDto shortVideoSetCoOwnerStatusResponseDto = (ShortVideoSetCoOwnerStatusResponseDto) j5g.Y((List) obj);
                if (shortVideoSetCoOwnerStatusResponseDto.d()) {
                    clipVideoFile = ClipVideoFile.Kb(clipVideoFile, false, null, null, j5g.v0(CoOwnerItem.zb(coOwnerItem, CoOwnerItem.StatusDto.APPROVED, null, null, 29), j5g.s0(clipVideoFile.N1, coOwnerItem)), null, null, null, 8355839);
                }
                return io.reactivex.rxjava3.core.q.T(new Pair(shortVideoSetCoOwnerStatusResponseDto, clipVideoFile));
            case 3:
                gzh gzhVar = (gzh) obj3;
                MarketGetCommunityReviewsResponseDto marketGetCommunityReviewsResponseDto = (MarketGetCommunityReviewsResponseDto) obj;
                MarketCommunityRatingDto d2 = marketGetCommunityReviewsResponseDto.d();
                List<MarketCommunityReviewDto> i3 = marketGetCommunityReviewsResponseDto.i();
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.putAll((Map) obj2);
                for (MarketCommunityReviewDto marketCommunityReviewDto : i3) {
                    mapBuilder.put(marketCommunityReviewDto.p().j(), tci.u(marketCommunityReviewDto.p()));
                    MarketReviewCommentsDto i4 = marketCommunityReviewDto.i();
                    List<GroupsGroupFullDto> d3 = i4 != null ? i4.d() : null;
                    MarketReviewCommentsDto i5 = marketCommunityReviewDto.i();
                    mapBuilder.putAll(pn00.t(d370.o(d3, i5 != null ? i5.f() : null)));
                }
                MapBuilder h = mapBuilder.h();
                int j = d2.j();
                List<MarketCommunityReviewDto> i6 = marketGetCommunityReviewsResponseDto.i();
                int e = on00.e(c5g.u(i6, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (MarketCommunityReviewDto marketCommunityReviewDto2 : i6) {
                    Integer valueOf = Integer.valueOf(marketCommunityReviewDto2.getId());
                    nt8 nt8Var = gzhVar.e;
                    MarketReviewCommentsDto i7 = marketCommunityReviewDto2.i();
                    Pair pair = new Pair(valueOf, nt8Var.h(marketCommunityReviewDto2, j, i7 != null && i7.c0(), gzhVar.g, h));
                    linkedHashMap.put(pair.i(), pair.j());
                }
                int j2 = d2.j();
                boolean d4 = d2.d();
                Float g = d2.g();
                int g2 = marketGetCommunityReviewsResponseDto.g();
                MarketCommunityRatingCanAddReviewErrorDto e2 = d2.e();
                yo9 yo9Var = e2 != null ? new yo9(r5 == true ? 1 : 0, e2.getTitle(), e2.getDescription()) : null;
                boolean k = d2.k();
                String e3 = marketGetCommunityReviewsResponseDto.e();
                List<MarketCommunityRatingMarksStatDto> i8 = marketGetCommunityReviewsResponseDto.d().i();
                if (i8 != null) {
                    List<MarketCommunityRatingMarksStatDto> list = i8;
                    r6 = new ArrayList(c5g.u(list, 10));
                    for (MarketCommunityRatingMarksStatDto marketCommunityRatingMarksStatDto : list) {
                        r6.add(new dye0(marketCommunityRatingMarksStatDto.d(), marketCommunityRatingMarksStatDto.e(), marketCommunityRatingMarksStatDto.f()));
                    }
                } else {
                    r6 = 0;
                }
                if (r6 == 0) {
                    r6 = EmptyList.b;
                }
                List list2 = r6;
                MarketCommunityReviewFriendsDto f = marketGetCommunityReviewsResponseDto.f();
                int e4 = f != null ? f.e() : 0;
                MarketCommunityReviewFriendsDto f2 = marketGetCommunityReviewsResponseDto.f();
                if (f2 != null && (d = f2.d()) != null) {
                    List<MarketCommunityReviewFriendDto> list3 = d;
                    r4 = new ArrayList(c5g.u(list3, 10));
                    for (MarketCommunityReviewFriendDto marketCommunityReviewFriendDto : list3) {
                        r4.add(new vd10(marketCommunityReviewFriendDto.e(), marketCommunityReviewFriendDto.d(), marketCommunityReviewFriendDto.f(), marketCommunityReviewFriendDto.j(), marketCommunityReviewFriendDto.g(), marketCommunityReviewFriendDto.i(), marketCommunityReviewFriendDto.k()));
                    }
                }
                if (r4 == 0) {
                    r4 = EmptyList.b;
                }
                List list4 = r4;
                Boolean f3 = marketGetCommunityReviewsResponseDto.d().f();
                return new rzh(j2, d4, g, g2, linkedHashMap, yo9Var, k, e3, list2, e4, list4, h, f3 != null ? f3.booleanValue() : false);
            case 4:
                FeedAnimatedView feedAnimatedView = (FeedAnimatedView) obj2;
                int i9 = FeedAnimatedView.y;
                return new RLottieDrawable((String) obj, go9.b("animated_reaction_", (String) obj3), feedAnimatedView.g, feedAnimatedView.h, null, false, false, feedAnimatedView.f, PsExtractor.VIDEO_STREAM_MASK);
            case 5:
                Photo photo = (Photo) obj3;
                List<Tag> list5 = (List) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    photo.x = list5;
                }
                return s3q0.a;
            case 6:
                kvt kvtVar = (kvt) obj3;
                String str2 = (String) obj2;
                g0v g0vVar = ((iyu0) obj).f;
                if (epx.f(g0vVar, g0v.b.a)) {
                    kvtVar.l(kvtVar.k, kvtVar.l, str2);
                } else {
                    if (!(g0vVar instanceof g0v.c) && !(g0vVar instanceof g0v.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kvtVar.k();
                }
                return s3q0.a;
            case 7:
                w2w w2wVar = (w2w) obj3;
                return new s8v(t8w.b(w2wVar, j5g.O0(w2wVar.I0().j().d((Set) obj2)), new c2a0(cq.a(w2wVar), w2wVar.I0().system().j(), new ayo(w2wVar, 11))), new u8v(false, false, false, false));
            case 8:
                JoinCallFragment joinCallFragment = (JoinCallFragment) obj3;
                phw0 phw0Var = (phw0) obj2;
                mzx mzxVar = (mzx) obj;
                int i10 = JoinCallFragment.U;
                if (mzxVar instanceof mzx.c) {
                    mzx.c cVar = (mzx.c) mzxVar;
                    new ylw0.a(joinCallFragment.requireContext(), new VoipChangeNameConfig(cVar.b, "request_key_change_name", cVar.a, cVar.c, cVar.d, cVar.e, 0, null, PsExtractor.AUDIO_STREAM, null)).H0(joinCallFragment.getChildFragmentManager(), null);
                } else if (mzxVar instanceof mzx.a) {
                    joinCallFragment.finish();
                } else if (mzxVar instanceof mzx.d) {
                    mzx.d dVar = (mzx.d) mzxVar;
                    phw0Var.b(new phw0.a(new WeakReference(joinCallFragment.mo2getContext()), dVar.b, dVar.a));
                    ?? r0 = joinCallFragment.T;
                    if (r0 != null) {
                        FrameLayout frameLayout = joinCallFragment.S;
                        r0.b(frameLayout != null ? frameLayout : null);
                    }
                } else if (mzxVar instanceof mzx.f) {
                    mzx.f fVar = (mzx.f) mzxVar;
                    new o1x0.a(fVar.a, fVar.b, joinCallFragment.requireContext(), 8).I0("VoipShareLinkPagerModalDialog");
                } else if (mzxVar instanceof mzx.e) {
                    tax.f(joinCallFragment.requireContext(), ((mzx.e) mzxVar).a);
                } else if (mzxVar instanceof mzx.b) {
                    d49 d49Var = joinCallFragment.Q;
                    Context requireContext = joinCallFragment.requireContext();
                    s0y s0yVar = ((mzx.b) mzxVar).a;
                    tci tciVar = d49Var.a;
                    s0y.a aVar = s0yVar.e;
                    if (aVar instanceof s0y.a.c) {
                        s0y.a.c cVar2 = (s0y.a.c) aVar;
                        og0 og0Var = cVar2.c;
                        esa C = og0Var != null ? xo9.C(og0Var, s0yVar.a) : null;
                        JoinData joinData = cVar2.a;
                        VoipCallSource voipCallSource = s0yVar.g;
                        if (C != null) {
                            s0yVar.d.e(requireContext, joinData, voipCallSource, s0yVar.b, s0yVar.c, C);
                        } else {
                            s0yVar.d.o(requireContext, joinData, voipCallSource, s0yVar.b, s0yVar.c);
                        }
                    } else if (aVar instanceof s0y.a.b) {
                        s0y.a.b bVar = (s0y.a.b) aVar;
                        s0yVar.d.n(requireContext, bVar.a, s0yVar.g, s0yVar.b, s0yVar.c, fkq0.e(bVar.b.P0()));
                    } else if (aVar instanceof s0y.a.C3646a) {
                        wt2 wt2Var = ((s0y.a.C3646a) aVar).a;
                        Serializer.c<VoipCallSource> cVar3 = VoipCallSource.CREATOR;
                        g2v.c().j().r(requireContext, wt2Var, VoipCallSource.a.a(), s0yVar.b, s0yVar.c);
                    } else {
                        if (!(aVar instanceof s0y.a.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s0yVar.d.o(requireContext, s0yVar.f, s0yVar.g, s0yVar.b, s0yVar.c);
                    }
                } else {
                    if (!(mzxVar instanceof mzx.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((dw20.b) dw20.a.Q(new dw20.b(joinCallFragment.requireContext(), null).M(R.drawable.vk_icon_phone_down_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).v0(R.string.voip_error_administrator_disabled_anon_join_title), R.string.voip_error_administrator_disabled_anon_join_subtitle)).h0(R.string.vk_ok, new buc0(23)).I0(null);
                }
                return s3q0.a;
            case 9:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                com.vk.photo.editor.features.mlenhance.c cVar4 = (com.vk.photo.editor.features.mlenhance.c) obj2;
                if (((Boolean) obj).booleanValue() && !ref$BooleanRef.element) {
                    cVar4.c.b().b(b.C1464b.a);
                    ref$BooleanRef.element = true;
                }
                return s3q0.a;
            case 10:
                c.a aVar2 = com.vk.pushes.receivers.c.b;
                c.a.f((Context) obj3, (Intent) obj2, false);
                return s3q0.a;
            case 11:
                ((tgp0) obj).f((ur4) obj3, (Uri) obj2);
                return s3q0.a;
            case 12:
                ((x690) obj3).l.R((StickerStockItem) obj2);
                return s3q0.a;
            case 13:
                bp90 bp90Var = (bp90) obj3;
                xo90.a.f fVar2 = (xo90.a.f) ((xo90.a) obj2);
                bp90Var.t.a(new mp90.b.a.f(fVar2.a, fVar2.b, bp90Var.u));
                return s3q0.a;
            case 14:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                efc0 efc0Var = (efc0) obj2;
                gfc0.b bVar2 = (gfc0.b) obj;
                boolean z2 = bVar2.b;
                String str3 = bVar2.a;
                if (z2) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ?? next = it2.next();
                            PostingAttachment postingAttachment2 = (PostingAttachment) next;
                            UploadDto uploadDto = postingAttachment2 instanceof UploadDto ? (UploadDto) postingAttachment2 : null;
                            if (epx.f((uploadDto == null || (I4 = uploadDto.I4()) == null) ? null : I4.c, str3)) {
                                postingAttachment = next;
                            }
                        }
                    }
                    PostingAttachment postingAttachment3 = postingAttachment;
                    if (postingAttachment3 != null) {
                        efc0Var.C(new PostingAction.MediaPicker.AddAttachFromUri(Uri.parse(str3), postingAttachment3 instanceof VideoDto));
                    }
                } else {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.w, new Object[]{go9.b("Failed to copy file to ", str3)});
                    }
                }
                return s3q0.a;
            case 15:
                r9f0 r9f0Var = (r9f0) obj3;
                fcw.a aVar3 = (fcw.a) obj2;
                i9f0.a aVar4 = (i9f0.a) obj;
                ArrayList arrayList2 = aVar4.a;
                ?? r42 = r9f0Var.c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    if (((Boolean) r42.invoke(obj4)).booleanValue()) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList<Dialog> arrayList4 = aVar4.a;
                HashMap hashMap = new HashMap(arrayList4.size());
                for (Dialog dialog : arrayList4) {
                    Long Sb = dialog.Sb();
                    Boolean bool = (Boolean) r9f0Var.d.invoke(dialog);
                    bool.getClass();
                    hashMap.put(Sb, bool);
                }
                return new gcw.f(arrayList3, hashMap, aVar4.b.Ob(), new ImSearchLocalRequestLoggingInfo(aVar3.a, aVar3.c, aVar4.c, 0, aVar3.d, null, 0, r9f0Var.a != Source.CACHE, 104, null));
            case 16:
                return SpeedView.T4((SpeedView) obj3, (Context) obj2, ((Float) obj).floatValue());
            case 17:
                ((izs) obj3).invoke(sum0.d.a((sum0.d) obj2, null, (SubnavigationButton.Mode) obj, null, false, null, false, null, false, 0, null, false, false, 4093));
                return s3q0.a;
            case 18:
                k3n0 k3n0Var = (k3n0) obj3;
                Context context2 = (Context) obj2;
                VKList vKList = (VKList) obj;
                bn40.g("HSNMan", "shuffle:", Integer.valueOf(vKList.size()));
                if (vKList.isEmpty()) {
                    k3n0Var.a(context2);
                } else {
                    k3n0Var.e.N0(new lqk0((StartPlaySource) null, (MusicTrack) null, vKList, k3n0Var.d, 0, (ShuffleMode) null, PlayRequestTrigger.SHUFFLE_BUTTON, (AdsAudioPixelsContainer) null, 0L, 883));
                }
                return s3q0.a;
            case 19:
                o8q0 o8q0Var = (o8q0) obj3;
                fy00 fy00Var = o8q0Var.b;
                Fragment fragment = (Fragment) obj2;
                Triple triple = (Triple) obj;
                MarketEventGoodCreated.Source source = (MarketEventGoodCreated.Source) triple.d();
                String str4 = (String) triple.g();
                Good good = (Good) j5g.Y((List) triple.h());
                if (epx.f(str4, "create")) {
                    MarketEventGoodCreated marketEventGoodCreated = new MarketEventGoodCreated(good, source);
                    boolean z3 = good.V;
                    fy00Var.b(marketEventGoodCreated);
                    if (source != MarketEventGoodCreated.Source.CREATION_ONBOARDING_BLOCK || z3) {
                        Context requireContext2 = fragment.requireContext();
                        int i11 = z3 ? R.string.market_service_created : R.string.market_item_created;
                        ikv0.a aVar5 = new ikv0.a(requireContext2);
                        aVar5.u = new ikv0.d(requireContext2.getString(i11), (String) r4, (ikv0.d.a) r4, 6);
                        aVar5.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, requireContext2.getString(R.string.market_item_go), new defpackage.y(28, o8q0Var, good));
                        aVar5.n();
                    }
                } else if (epx.f(str4, "edit")) {
                    fy00Var.b(new jy00(good));
                    p870.f().e(120, new MarketAttachment(good));
                }
                return s3q0.a;
            case 20:
                udq0 udq0Var = (udq0) obj3;
                b9r b9rVar = (b9r) obj;
                long j3 = b9rVar.a;
                long j4 = b9rVar.a;
                b9r b9rVar2 = ((tdq0) obj2).g;
                long j5 = b9rVar2.a;
                if (j4 < j5) {
                    long j6 = b9rVar.a;
                    long j7 = b9rVar2.a;
                    StringBuilder b = fp.b(j6, "New file size ", " is less than previous one ");
                    b.append(j7);
                    throw new InputFileCorruptException(b.toString());
                }
                boolean z4 = b9rVar.b;
                if (!z4 && b9rVar2.b) {
                    throw new InputFileCorruptException("If file was marked complete it must not be set uncomplete");
                }
                if (b9rVar2.b && j4 != j5) {
                    long j8 = b9rVar2.a;
                    long j9 = b9rVar.a;
                    StringBuilder b2 = fp.b(j8, "File size must not be changed if file is complete. Current: ", ", new: ");
                    b2.append(j9);
                    throw new InputFileCorruptException(b2.toString());
                }
                b9rVar2.a = j4;
                b9rVar2.b = z4;
                for (dai0 dai0Var : udq0Var.b()) {
                    maq0 maq0Var = dai0Var instanceof maq0 ? (maq0) dai0Var : null;
                    if (maq0Var != null && maq0Var.w == maq0.a.IDLE && !maq0Var.u && (keyFor = maq0Var.f.a.keyFor((Selector) maq0Var.b.b)) != null) {
                        keyFor.interestOps(keyFor.interestOps() | 4);
                    }
                }
                return s3q0.a;
            case 21:
                CommunityProfileContentItem communityProfileContentItem = (CommunityProfileContentItem) obj2;
                u5p0 u5p0Var = ((wmq0) obj3).f;
                (u5p0Var != null ? u5p0Var : null).invoke(new UserProfileAction.g.j(communityProfileContentItem));
                return s3q0.a;
            case 22:
                ((hyq0) obj3).V((RecomSettingsGetAvailableRecomThemesResponseDto) obj2, (Set) obj);
                return s3q0.a;
            case 23:
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT value FROM user_values WHERE name = ? AND storage_name = ? LIMIT 1");
                try {
                    V0.D3(1, str5);
                    V0.D3(2, str6);
                    if (V0.step() && !V0.isNull(0)) {
                        str = V0.l2(0);
                    }
                    return str;
                } finally {
                    V0.close();
                }
            case 24:
                ((b2r0) obj2).b.b().execSQL(xqm0.g("\n            UPDATE users\n            SET sync_time_overall = -1, sync_time_online = -1\n            WHERE id = " + ((Peer.User) obj3).d + "\n            "));
                return s3q0.a;
            case 25:
                k5e0 k5e0Var = (k5e0) obj2;
                lj0 lj0Var = ((xur0) obj3).m;
                if (lj0Var != null) {
                    lj0Var.I(k5e0Var.b);
                }
                return Boolean.TRUE;
            case 26:
                return new o1t0.e((q1t0) obj3, (izs) obj2);
            case 27:
                Set set = (Set) obj2;
                String Fb = ((VideoUploadEvent) obj).b.Fb();
                if (((Set) obj3).contains(Fb) || (Fb != null && set.contains(Fb))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                g6m0 g6m0Var = new g6m0(7, (tho0) obj2, (tho0) obj);
                com.vk.core.compose.component.datetime.m mVar = ((com.vk.core.compose.component.datetime.n) obj3).a;
                g6m0Var.invoke(mVar.a());
                ((zak0) mVar.a).setValue(mVar.a());
                return s3q0.a;
        }
    }

    public /* synthetic */ il7(w2w w2wVar, f5w f5wVar, Set set) {
        this.b = 7;
        this.c = w2wVar;
        this.d = set;
    }

    public /* synthetic */ il7(kw70 kw70Var, ur4 ur4Var, Uri uri) {
        this.b = 11;
        this.c = ur4Var;
        this.d = uri;
    }
}
