package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.net.Uri;
import android.util.LruCache;
import android.widget.ImageView;
import androidx.core.content.FileProvider;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketItemOwnerInfoDto;
import com.vk.api.generated.market.dto.MarketItemSkuReviewDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.channels.api.CommentsHistory;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.reviews.api.model.CreateMarketItemReviewArguments;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model.CreateMarketItemReviewData;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesRefSource;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.design.view.actionlink.b;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayerTrack;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.profile.community.chats.api.di.CommunityChatsComponent;
import com.vk.profile.community.impl.ui.events.CommunityEventsFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.asl0;
import xsna.dw20;
import xsna.f0r;
import xsna.fgj;
import xsna.gm50;
import xsna.l1h;
import xsna.lsv;
import xsna.o3t;
import xsna.qeg;
import xsna.tlo0;
import xsna.wk50;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j20 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j20(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v45, types: [T, com.vk.dto.common.id.UserId] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        BaseImageDto baseImageDto;
        MusicTrack musicTrack;
        Object v;
        int i = 29;
        boolean z = true;
        Object Y = null;
        switch (this.b) {
            case 0:
                return com.vk.libvideo.design.view.actionlink.a.d((com.vk.libvideo.design.view.actionlink.a) this.c, (b.C1229b.a.j) this.d);
            case 1:
                com.vk.photos.root.albumdetails.presentation.j jVar = (com.vk.photos.root.albumdetails.presentation.j) this.c;
                gg1 gg1Var = (gg1) this.d;
                Throwable th = (Throwable) obj;
                PhotoAlbum photoAlbum = jVar.l;
                if (photoAlbum != null) {
                    tlo0.a aVar = tlo0.Companion;
                    Object[] objArr = {photoAlbum.g};
                    aVar.getClass();
                    gg1Var.Z(new g5(gg1Var, 2), new tlo0.f(R.string.photos_retry), tlo0.a.c(R.string.album_details_delete_album_fail, objArr));
                } else {
                    String b = gg1Var.g.b(th);
                    tlo0.Companion.getClass();
                    gg1Var.Z(null, null, new tlo0.h(b));
                }
                return s3q0.a;
            case 2:
                o84 o84Var = (o84) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                VideoFile videoFile2 = (VideoFile) obj;
                u0y0 c = bay.c();
                Activity activity = o84Var.a;
                if (videoFile2 != null) {
                    videoFile = videoFile2;
                }
                c.l(activity, videoFile);
                return s3q0.a;
            case 3:
                PhotoAlbum photoAlbum2 = (PhotoAlbum) this.c;
                vj6 vj6Var = (vj6) this.d;
                ysg0.b.a(new ok1(photoAlbum2.b, photoAlbum2.c));
                vj6Var.c.finish();
                return s3q0.a;
            case 4:
                com.vk.catalog2.common.ui.mvp.util.a aVar2 = (com.vk.catalog2.common.ui.mvp.util.a) this.c;
                nda ndaVar = (nda) this.d;
                aVar2.i = null;
                if (ndaVar != null) {
                    ndaVar.c(false);
                }
                return s3q0.a;
            case 5:
                List list = (List) this.c;
                ChatFragment chatFragment = (ChatFragment) this.d;
                int intValue = ((Integer) obj).intValue();
                ChatFragment.d dVar = ChatFragment.w1;
                int xb = ((AttachWithImage) list.get(intValue)).xb();
                com.vk.im.ui.components.msg_list.a aVar3 = chatFragment.H0;
                return (aVar3 != null ? aVar3 : null).m1(xb);
            case 6:
                ClipsControlsView clipsControlsView = (ClipsControlsView) this.c;
                ClipsControlsView.a aVar4 = (ClipsControlsView.a) this.d;
                int i2 = ClipsControlsView.P;
                ImageView imageView = clipsControlsView.L;
                if (imageView.isClickable()) {
                    boolean z2 = clipsControlsView.x;
                    clipsControlsView.x = !z2;
                    imageView.setImageDrawable(m33.a(!z2 ? R.drawable.vk_icon_microphone_outline_shadow_large_48 : R.drawable.vk_icon_microphone_slash_outline_shadow_large_48, e43.a));
                    boolean z3 = clipsControlsView.x;
                    int i3 = ClipsControlsView.P;
                    aVar4.h(z3);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 7:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                qeg.a aVar5 = (qeg.a) this.d;
                CommentsHistory.Order order = (CommentsHistory.Order) obj;
                VkContextMenu vkContextMenu = (VkContextMenu) ref$ObjectRef.element;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                aVar5.g(order);
                return s3q0.a;
            case 8:
                dw20 dw20Var = (dw20) this.c;
                m1h m1hVar = (m1h) this.d;
                l1h l1hVar = (l1h) obj;
                Context mo2getContext = dw20Var.mo2getContext();
                if (mo2getContext != null) {
                    if (l1hVar instanceof l1h.j) {
                        ((oga0) m1hVar.a.b.getValue()).g(mo2getContext, ((l1h.j) l1hVar).a, false);
                    } else if (l1hVar instanceof l1h.h) {
                        rml0.a((rml0) m1hVar.a.c.getValue(), mo2getContext, ((l1h.h) l1hVar).a, new MarketAnalyticsParams(null, MobileOfficialAppsCoreNavStat$EventScreen.GROUP, CommonMarketStat$TypeRefSource.COMMUNITY_TAB_MARKET, null, null, null, null, false, null, false, false, null, false, 8185, null), 8);
                    } else if (l1hVar instanceof l1h.e) {
                        ((n9p0) m1hVar.a.d.getValue()).a(mo2getContext, fkq0.a(((l1h.e) l1hVar).a), false);
                    } else if (l1hVar instanceof l1h.l) {
                        com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) m1hVar.a.e.getValue(), mo2getContext, ((l1h.l) l1hVar).a, null, null, null, false, StorefrontServicesRefSource.COMMUNITY_TAB_SERVICES, null, 296);
                    } else if (l1hVar instanceof l1h.a) {
                        m1hVar.a(mo2getContext, "https://" + a0a.d + "/@" + ((l1h.a) l1hVar).a);
                    } else if (l1hVar instanceof l1h.c) {
                        m1hVar.a(mo2getContext, ((l1h.c) l1hVar).b);
                    } else if (l1hVar instanceof l1h.i) {
                        ((su50) m1hVar.a.f.getValue()).b(((l1h.i) l1hVar).a, MobileOfficialAppsCoreNavStat$EventScreen.GROUP, false).k(mo2getContext);
                    } else if (l1hVar instanceof l1h.b) {
                        m1hVar.a(mo2getContext, "https://" + a0a.d + "/audios" + ((l1h.b) l1hVar).a);
                    } else if (l1hVar instanceof l1h.k) {
                        ((fl4) m1hVar.a.g.getValue()).v(mo2getContext, ((l1h.k) l1hVar).a, MusicPlaybackLaunchContext.D);
                    } else if (l1hVar instanceof l1h.d) {
                        l1h.d dVar2 = (l1h.d) l1hVar;
                        ((CommunityChatsComponent) m1hVar.a.h.getValue()).a().a(dVar2.b, mo2getContext, fkq0.a(dVar2.a));
                    } else if (l1hVar instanceof l1h.g) {
                        ((bvn) m1hVar.a.i.getValue()).b(mo2getContext, ((l1h.g) l1hVar).a, false);
                    } else {
                        if (!(l1hVar instanceof l1h.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        UserId userId = ((l1h.f) l1hVar).a;
                        CommunityEventsFragment.a aVar6 = new CommunityEventsFragment.a(CommunityEventsFragment.class, null, null);
                        aVar6.j.putParcelable("events_arg_group_id", fkq0.a(userId));
                        aVar6.k(mo2getContext);
                    }
                }
                return s3q0.a;
            case 9:
                ((izs) this.c).invoke(((fgj.b) this.d).m);
                return s3q0.a;
            case 10:
                swj swjVar = (swj) this.c;
                String str = (String) this.d;
                swjVar.c.remove(str);
                swjVar.d.remove(str);
                return s3q0.a;
            case 11:
                p8k p8kVar = (p8k) this.c;
                CreateMarketItemReviewArguments createMarketItemReviewArguments = (CreateMarketItemReviewArguments) this.d;
                Pair pair = (Pair) obj;
                mzp0 mzp0Var = p8kVar.i;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                MarketMarketItemFullDto marketMarketItemFullDto = (MarketMarketItemFullDto) pair.d();
                MarketItemSkuReviewDto marketItemSkuReviewDto = (MarketItemSkuReviewDto) pair.g();
                List<List<BaseImageDto>> p = marketItemSkuReviewDto.p();
                List a = p != null ? azg.a(p) : null;
                if (a == null) {
                    a = EmptyList.b;
                }
                List list2 = a;
                CreateMarketItemReviewData createMarketItemReviewData = new CreateMarketItemReviewData(marketItemSkuReviewDto.n(), marketItemSkuReviewDto.f(), marketItemSkuReviewDto.l(), marketItemSkuReviewDto.i(), list2, Integer.valueOf(marketItemSkuReviewDto.getId()));
                long j = createMarketItemReviewArguments.b;
                String title = marketMarketItemFullDto.getTitle();
                MarketItemOwnerInfoDto W = marketMarketItemFullDto.W();
                String e = W != null ? W.e() : null;
                String str2 = e == null ? "" : e;
                List<BaseImageDto> K0 = marketMarketItemFullDto.K0();
                String url = (K0 == null || (baseImageDto = (BaseImageDto) j5g.a0(K0)) == null) ? null : baseImageDto.getUrl();
                String str3 = url == null ? "" : url;
                UserId userId2 = createMarketItemReviewArguments.c;
                String f = marketItemSkuReviewDto.f();
                String str4 = f == null ? "" : f;
                String l = marketItemSkuReviewDto.l();
                String str5 = l == null ? "" : l;
                String i4 = marketItemSkuReviewDto.i();
                String str6 = i4 == null ? "" : i4;
                Float n = marketItemSkuReviewDto.n();
                p8kVar.T(new v8k(str5, str6, str4, Long.valueOf(j), str3, userId2, str2, title, n != null ? n.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, list2, false, false, createMarketItemReviewData));
                MarketMarketItemRatingDto F = marketMarketItemFullDto.F();
                Float valueOf = F != null ? Float.valueOf(F.d()) : null;
                MarketMarketItemRatingDto F2 = marketMarketItemFullDto.F();
                Integer valueOf2 = F2 != null ? Integer.valueOf(F2.e()) : null;
                Float n2 = marketItemSkuReviewDto.n();
                CreateMarketItemReviewArguments createMarketItemReviewArguments2 = p8kVar.f;
                if (createMarketItemReviewArguments2 != null) {
                    p8kVar.h.d(new q110(null, null, null, Long.valueOf(createMarketItemReviewArguments2.c.b), Long.valueOf(createMarketItemReviewArguments2.b), valueOf, valueOf2, n2, 7));
                }
                return s3q0.a;
            case 12:
                DebugFileManagerFragment debugFileManagerFragment = (DebugFileManagerFragment) this.c;
                Context context = (Context) this.d;
                File file = (File) obj;
                int i5 = DebugFileManagerFragment.R;
                debugFileManagerFragment.getClass();
                try {
                    Uri uriForFile = FileProvider.getUriForFile(context, context.getString(R.string.vk_file_provider_authority), file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.STREAM", uriForFile);
                    intent.addFlags(1);
                    context.startActivity(Intent.createChooser(intent, file.getName()));
                } catch (IllegalArgumentException e2) {
                    L.i(e2);
                }
                return s3q0.a;
            case 13:
                ((f0r.t) this.c).h((wk50.a) this.d, (Throwable) obj);
                return s3q0.a;
            case 14:
                wh50 wh50Var = (wh50) this.c;
                tho0 tho0Var = (tho0) obj;
                ((wh50) this.d).setValue(tho0Var);
                wh50Var.setValue(rfr.d(tho0Var.a.c));
                return s3q0.a;
            case 15:
                ((syr) this.c).l.invoke(((w4e) this.d).f);
                return s3q0.a;
            case 16:
                o3t o3tVar = (o3t) this.c;
                List<o3t.a> list3 = (List) this.d;
                o3tVar.getClass();
                bpn0 bpn0Var = i0q0.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (j3k0 j3k0Var : (List) obj) {
                    for (o3t.a aVar7 : list3) {
                        long j2 = aVar7.a;
                        boolean z4 = z;
                        long j3 = aVar7.b;
                        List list4 = list3;
                        long j4 = j3k0Var.b;
                        String str7 = j3k0Var.d;
                        String str8 = j3k0Var.c;
                        long j5 = j4 * 1000;
                        if (j2 <= j5 && j5 <= j3) {
                            Integer num = (Integer) linkedHashMap.get(aVar7);
                            linkedHashMap.put(aVar7, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                            if (!drm0.D(str8, "Screenshots", z4) && !drm0.D(str7, "Screenshots", z4) && !drm0.D(str8, "Movies/Screen", z4) && !drm0.D(str7, "Movies/Screen", z4)) {
                                Integer num2 = (Integer) linkedHashMap2.get(aVar7);
                                linkedHashMap2.put(aVar7, Integer.valueOf((num2 != null ? num2.intValue() : 0) + (z4 ? 1 : 0)));
                            }
                            if (j3k0Var.a) {
                                Integer num3 = (Integer) linkedHashMap3.get(aVar7);
                                linkedHashMap3.put(aVar7, Integer.valueOf((num3 != null ? num3.intValue() : 0) + 1));
                            }
                        }
                        list3 = list4;
                        z = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (o3t.a aVar8 : list3) {
                    String str9 = aVar8.c;
                    String b2 = go9.b("total_content", str9);
                    Integer num4 = (Integer) linkedHashMap.get(aVar8);
                    jSONObject.put(b2, num4 != null ? num4.intValue() : 0);
                    String str10 = "live_content" + str9;
                    Integer num5 = (Integer) linkedHashMap2.get(aVar8);
                    jSONObject.put(str10, num5 != null ? num5.intValue() : 0);
                    String str11 = "fav_content" + str9;
                    Integer num6 = (Integer) linkedHashMap3.get(aVar8);
                    jSONObject.put(str11, num6 != null ? num6.intValue() : 0);
                }
                return jSONObject;
            case 17:
                lsv lsvVar = (lsv) this.c;
                StoryBoxPrepared storyBoxPrepared = (StoryBoxPrepared) this.d;
                lsv.b bVar = (lsv.b) obj;
                if (lsvVar.i == storyBoxPrepared) {
                    lsvVar.j.put(storyBoxPrepared, bVar);
                    lsvVar.a(storyBoxPrepared, bVar);
                    return s3q0.a;
                }
                Bitmap bitmap = bVar.a;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                return s3q0.a;
            case 18:
                Uri uri = (Uri) this.c;
                Context context2 = (Context) this.d;
                MediaExtractor mediaExtractor = (MediaExtractor) obj;
                if (epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                    mediaExtractor.setDataSource(context2, uri, (Map<String, String>) null);
                } else {
                    String path = uri.getPath();
                    if (path == null) {
                        return s3q0.a;
                    }
                    mediaExtractor.setDataSource(path);
                }
                return s3q0.a;
            case 19:
                ((lr50) this.c).E.a(((Integer) obj).intValue(), (NewsEntry) this.d);
                return s3q0.a;
            case 20:
                com.vk.music.player.playback.c cVar = (com.vk.music.player.playback.c) this.c;
                LinkedHashMap linkedHashMap4 = cVar.m;
                izs izsVar = (izs) this.d;
                List<xd50> list5 = (List) obj;
                int size = list5.size();
                if (!list5.isEmpty()) {
                    List<xd50> list6 = list5;
                    int e3 = on00.e(c5g.u(list6, 10));
                    if (e3 < 16) {
                        e3 = 16;
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(e3);
                    for (Object obj2 : list6) {
                        linkedHashMap5.put(((xd50) obj2).a.Fb(), obj2);
                    }
                    linkedHashMap4.putAll(linkedHashMap5);
                    cVar.c.e(linkedHashMap4);
                    if (cVar.w.j() && cVar.w.l()) {
                        cVar.I(list5);
                    }
                }
                PlayerTrack playerTrack = cVar.i;
                if (playerTrack != null && (musicTrack = playerTrack.b) != null && musicTrack.Wb()) {
                    cVar.G();
                }
                cVar.f(size, true);
                if (!cVar.t) {
                    PlayerTrack playerTrack2 = cVar.i;
                    izsVar.invoke(playerTrack2 != null ? playerTrack2.f : null);
                }
                return s3q0.a;
            case 21:
                ((bk30) this.c).invoke(Integer.valueOf(((n2f0) this.d).getAbsoluteAdapterPosition()));
                return s3q0.a;
            case 22:
                xaf0 xaf0Var = (xaf0) this.c;
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.d;
                StickerPackRecommendationBlock stickerPackRecommendationBlock = (StickerPackRecommendationBlock) obj;
                String str12 = xaf0Var.i;
                if (str12 != null) {
                    cVar2.s(stickerPackRecommendationBlock.f);
                    cbf0 a2 = xaf0Var.c.a(str12);
                    if (a2 == null) {
                        return s3q0.a;
                    }
                    xaf0Var.a(a2);
                }
                return s3q0.a;
            case 23:
                rdf0 rdf0Var = (rdf0) this.c;
                String str13 = (String) this.d;
                StickerPackRecommendationBlock stickerPackRecommendationBlock2 = (StickerPackRecommendationBlock) obj;
                List<StickerStockItem> list7 = stickerPackRecommendationBlock2.e;
                String str14 = stickerPackRecommendationBlock2.d;
                String str15 = stickerPackRecommendationBlock2.c;
                LruCache<String, cbf0> lruCache = rdf0Var.a;
                cbf0 cbf0Var = lruCache.get(str13);
                if (cbf0Var == null) {
                    lruCache.put(str13, new cbf0(str15, str14, stickerPackRecommendationBlock2.e));
                } else {
                    ArrayList arrayList = new ArrayList(cbf0Var.c);
                    arrayList.addAll(list7);
                    lruCache.put(str13, new cbf0(str15, str14, arrayList));
                }
                return s3q0.a;
            case 24:
                gm50.a.a((vwi0) this.c, ((ywi0.g) obj).a, new ece0((kxi0) this.d, 6));
                return s3q0.a;
            case 25:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.c;
                arl0 arl0Var = (arl0) this.d;
                asl0.a aVar9 = (asl0.a) obj;
                ref$ObjectRef2.element = aVar9.b;
                arl0Var.E.d(aVar9.a);
                return s3q0.a;
            case 26:
                z46 z46Var = (z46) this.c;
                ((z3i0) z46Var).w0(new ibk0(new rm0(i, Thread.currentThread(), (yvj) this.d)));
                return new tmp0(z46Var);
            case 27:
                cks cksVar = (cks) this.c;
                nup0 nup0Var = (nup0) this.d;
                oup0 oup0Var = (oup0) obj;
                synchronized (((xa4) cksVar.b)) {
                    try {
                        if (oup0Var.B()) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return s3q0.a;
            case 28:
                ue40 ue40Var = new ue40(9, (Ref$ObjectRef) this.c, (Ref$ObjectRef) this.d);
                c63 c63Var = c63.a;
                Activity b3 = c63.b();
                if (b3 == null || (v = s200.v(b3)) == null) {
                    NavigationDelegateActivity a3 = x93.a();
                    if (a3 != null) {
                        Y = a3.Y();
                    }
                } else {
                    Y = v;
                }
                if (Y != null) {
                    ue40Var.invoke(Y);
                }
                return s3q0.a;
            default:
                com.vk.libvideo.autoplay.background.controller.e eVar = (com.vk.libvideo.autoplay.background.controller.e) this.c;
                Activity activity2 = (Activity) this.d;
                eVar.d.getClass();
                fxc0.B().U();
                dw20.b a0 = new dw20.b(activity2, null).a0(new b990((cd80) obj, i));
                dhr0.a.getClass();
                ((dw20.b) dw20.a.Q(a0.u0(dhr0.u().c).M(R.drawable.vk_icon_video_circle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).v0(R.string.video_background_hint_title), R.string.video_background_hint_text)).i0(R.string.video_background_hint_button, new r4s0()).I0(null);
                return s3q0.a;
        }
    }

    public /* synthetic */ j20(com.vk.catalog2.common.ui.mvp.util.a aVar, nda ndaVar, c06 c06Var) {
        this.b = 4;
        this.c = aVar;
        this.d = ndaVar;
    }
}
