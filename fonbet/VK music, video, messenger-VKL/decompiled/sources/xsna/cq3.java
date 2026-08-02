package xsna;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.api.generated.market.dto.MarketProfileInfoDto;
import com.vk.api.generated.market.dto.MarketProfileInfoSimpleButtonDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.channels.api.CommentsHistory;
import com.vk.channels.impl.comments.g;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.common.links.LaunchContext;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.ecomm.catalog.impl.catalog.simple.b;
import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;
import com.vk.folders.impl.configure.d;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.friends.recommendations.impl.presentation.Item;
import com.vk.home.HomeFragment2;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.channelcreation.impl.j;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.profile.questions.impl.d;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToBookmarks;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.superapp.api.dto.story.actions.WebActionSticker;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.attachments.VideoAttachment;
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
import xsna.d960;
import xsna.e0f;
import xsna.ir5;
import xsna.lta;
import xsna.mwa;
import xsna.orx;
import xsna.pum;
import xsna.pzx;
import xsna.s240;
import xsna.syj;
import xsna.t240;
import xsna.wiw;
import xsna.wk50;
import xsna.xry;
import xsna.y2r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class cq3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cq3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v113, types: [com.vk.profile.questions.impl.d$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DialogsFilter dialogsFilter;
        ArrayList arrayList;
        List<pum> l;
        ArrayList arrayList2;
        MarketProfileInfoSimpleButtonDto d;
        String url;
        MarketUtmData marketUtmData;
        ImageSize Cb;
        String valueOf;
        int i = 11;
        int i2 = 7;
        int i3 = 12;
        int i4 = 1;
        int i5 = 0;
        r10 = null;
        String str = null;
        switch (this.b) {
            case 0:
                return new dq3((sjx0) obj, (com.vk.articles.a) this.c, (lpj) this.d);
            case 1:
                hn4 hn4Var = (hn4) this.c;
                kyd kydVar = (kyd) obj;
                AudioEffectType audioEffectType = ((cn4) this.d).a;
                hn4Var.getClass();
                if (kydVar instanceof ClipsEditorAudioItem) {
                    return ClipsEditorAudioItem.a((ClipsEditorAudioItem) kydVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, audioEffectType, 23);
                }
                if (kydVar instanceof com.vk.clips.editor.state.model.c) {
                    return com.vk.clips.editor.state.model.c.a((com.vk.clips.editor.state.model.c) kydVar, null, 0L, 0L, null, null, null, null, audioEffectType, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 520191);
                }
                if (kydVar instanceof com.vk.clips.editor.state.model.b) {
                    return kydVar;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                ir5 ir5Var = (ir5) this.c;
                kq5 kq5Var = (kq5) this.d;
                List list = (List) obj;
                if ((ir5Var instanceof ir5.a) || (ir5Var instanceof ir5.c)) {
                    return !list.isEmpty() ? io.reactivex.rxjava3.core.x.k(lta.a.c.C3294a.a) : io.reactivex.rxjava3.core.x.k(lta.a.b.a);
                }
                if (!(ir5Var instanceof ir5.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fzd0 fzd0Var = kq5Var.b;
                c63 c63Var = c63.a;
                fzd0Var.c(c63.b(), ((ir5.b) ir5Var).b.b);
                kq5Var.d.G();
                return io.reactivex.rxjava3.core.x.k(lta.a.c.d.a);
            case 3:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.c;
                mwa.a aVar = (mwa.a) this.d;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                bVar.n.removeIf(new ewa(new j5(aVar, i), 0));
                List s = com.vk.channels.impl.comments.b.s(bVar, aVar, false, 3);
                CommentsHistory commentsHistory = aVar.b;
                g.b bVar2 = gVar.c;
                hag a = rbg.a(commentsHistory.a, bVar2 != null ? bVar2.b() : null, false);
                return com.vk.channels.impl.comments.g.a(gVar, s, new g.a(false), (a != null ? Integer.valueOf(a.a) : null) == null ? bVar2 != null ? new g.b(g.b.a.C0535b.a) : null : bVar2, false, 8);
            case 4:
                return com.vk.im.channelcreation.impl.j.a((com.vk.im.channelcreation.impl.j) obj, j.a.a(((com.vk.im.channelcreation.impl.b) this.c).g().b, null, ((g.e) ((com.vk.im.channelcreation.impl.g) this.d)).b, false, 11), null, 5);
            case 5:
                uwb uwbVar = (uwb) this.c;
                gzs gzsVar = (gzs) this.d;
                DialogExt dialogExt = (DialogExt) obj;
                uwbVar.r = dialogExt;
                Dialog Cb2 = dialogExt.Cb();
                if (Cb2 != null) {
                    uwbVar.s = kq01.p(Cb2.Hb());
                    uwbVar.f1();
                }
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 6:
                e0f.a aVar2 = (e0f.a) this.c;
                VideoAttachment videoAttachment = (VideoAttachment) this.d;
                w1s0.e(aVar2.itemView.getContext(), videoAttachment.k, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS), null, new nh3(i2, aVar2, videoAttachment));
                e0f.a.J7((ImageView) aVar2.s0.getValue(), videoAttachment.k);
                return s3q0.a;
            case 7:
                ((syj.a) this.c).l.invoke(((wyj) this.d).a);
                return s3q0.a;
            case 8:
                Integer num = (Integer) this.c;
                com.vk.im.engine.models.dialogs.b bVar3 = (com.vk.im.engine.models.dialogs.b) obj;
                ((hpm) this.d).b.b().execSQL("UPDATE dialogs SET is_new = 0, count_unread = ?, count_unread_local = ?, last_msg_cnv_id = ?, timestamp = COALESCE(?, timestamp) WHERE id = ?", new String[]{String.valueOf(bVar3.j), String.valueOf(bVar3.l), String.valueOf(bVar3.i), num != null ? String.valueOf(num) : null, String.valueOf(bVar3.b)});
                return s3q0.a;
            case 9:
                mrm mrmVar = (mrm) this.c;
                vjm vjmVar = mrmVar.e;
                vjm vjmVar2 = mrmVar.d;
                w2w w2wVar = (w2w) this.d;
                List<com.vk.im.engine.models.dialogs.a> list2 = mrmVar.c;
                List<com.vk.im.engine.models.dialogs.a> list3 = list2;
                pum pumVar = mrmVar.h;
                pum.b bVar4 = pumVar instanceof pum.b ? (pum.b) pumVar : null;
                new wfm(list3, null, bVar4 != null ? bVar4.a : -1, 10).o(w2wVar);
                boolean z = mrmVar.g;
                boolean z2 = mrmVar.f;
                xgl0 I0 = w2wVar.I0();
                com.vk.im.engine.internal.storage.delegates.dialogs.b a2 = I0.b().a();
                nrm f = a2.f(pumVar);
                int d2 = I0.system().d();
                if (f == null && !z2) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"DialogMissedIssue", "Meta is missing!"});
                    }
                } else if (f != null && f.b.compareTo(vjmVar2) > 0 && !z2) {
                    L l3 = L.a;
                    l3.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l3, L.LogType.d, new Object[]{"DialogMissedIssue", "Actual meta is outdated (" + vjmVar2 + "): " + f});
                    }
                } else if (f == null || f.b.compareTo(vjmVar) >= 0 || z) {
                    ArrayList arrayList3 = new ArrayList();
                    nrm nrmVar = new nrm(pumVar, vjmVar, z, d2);
                    p4g.a(nrmVar, arrayList3, !nrmVar.equals(f));
                    boolean z3 = pumVar instanceof pum.b;
                    if (z3) {
                        dialogsFilter = ((pum.b) pumVar).b;
                    } else {
                        if (!(pumVar instanceof pum.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dialogsFilter = ((pum.a) pumVar).a;
                    }
                    if (dialogsFilter == DialogsFilter.MAIN) {
                        if (z3) {
                            l = Collections.singletonList(new pum.b(((pum.b) pumVar).a, DialogsFilter.UNREAD));
                        } else {
                            if (!(pumVar instanceof pum.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            l = e43.l(new pum.a(DialogsFilter.UNREAD), new pum.a(DialogsFilter.CHATS));
                        }
                        for (pum pumVar2 : l) {
                            nrm f2 = a2.f(pumVar2);
                            if (nrmVar.c || f2 == null || (!f2.c && f2.b.compareTo(nrmVar.b) > 0)) {
                                arrayList3.add(nrm.a(nrmVar, pumVar2, null, 14));
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        L l4 = L.a;
                        l4.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.LogType logType = L.LogType.d;
                            StringBuilder sb = new StringBuilder("Update dialogs meta ");
                            arrayList = arrayList3;
                            sb.append(j5g.g0(arrayList3, null, null, null, 0, null, 63));
                            L.u(l4, logType, new Object[]{"DialogMissedIssue", sb.toString()});
                            a2.i(arrayList);
                        }
                    }
                    arrayList = arrayList3;
                    a2.i(arrayList);
                } else {
                    L l5 = L.a;
                    l5.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l5, L.LogType.d, new Object[]{"DialogMissedIssue", "Actual meta is ok (" + vjmVar + "): " + f + " current phase " + d2});
                    }
                }
                xgl0 I02 = w2wVar.I0();
                com.vk.im.engine.internal.storage.delegates.dialogs.b a3 = I02.b().a();
                List<com.vk.im.engine.models.dialogs.a> list4 = list2;
                ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList4.add(Long.valueOf(((com.vk.im.engine.models.dialogs.a) it.next()).a));
                }
                pum pumVar3 = mrmVar.h;
                Direction direction = Direction.BEFORE;
                a3.getClass();
                ArrayList d3 = a3.d("x_sort_id_server", pumVar3, ((vjm) jw5.w(vjmVar2, vjmVar)).a(), ((vjm) jw5.v(vjmVar2, vjmVar)).a(), direction, -1);
                ArrayList arrayList5 = new ArrayList(c5g.u(d3, 10));
                Iterator it2 = d3.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(Long.valueOf(((arm) it2.next()).a));
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!arrayList4.contains(Long.valueOf(((Number) next).longValue()))) {
                        arrayList6.add(next);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    if (pumVar instanceof pum.a) {
                        hpm e = I02.b().e();
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            e.B(((Number) it4.next()).longValue(), vjm.l);
                        }
                    } else {
                        if (!(pumVar instanceof pum.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (w2wVar.getExperiments().F()) {
                            hpm e2 = I02.b().e();
                            Iterator it5 = arrayList6.iterator();
                            while (it5.hasNext()) {
                                e2.D(((Number) it5.next()).longValue(), gkx0.d, ((pum.b) pumVar).a);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 10:
                y2r.s sVar = (y2r.s) this.c;
                wk50.a aVar3 = (wk50.a) this.d;
                qih0 qih0Var = (qih0) obj;
                gbq gbqVar = sVar.c;
                sVar.f(aVar3, qih0Var, gbqVar != null ? new a3r(2, gbqVar, gbq.class, "extendFeedItemsWithBlocks", "extendFeedItemsWithBlocks(Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;Ljava/util/List;)Ljava/util/List;", 0) : null);
                return s3q0.a;
            case 11:
                gtm gtmVar = (gtm) this.c;
                com.vk.folders.impl.configure.d dVar = (com.vk.folders.impl.configure.d) this.d;
                ayr ayrVar = (ayr) obj;
                Map<Long, wt90> map = ayrVar.e;
                Map<Long, wt90> map2 = ayrVar.f;
                Iterable h = ayrVar.j.isEmpty() ? gtmVar.a.Nb().h() : gtmVar.b;
                ArrayList arrayList7 = new ArrayList(c5g.u(h, 10));
                Iterator it6 = h.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(Long.valueOf(((Peer) it6.next()).b));
                }
                Set S0 = j5g.S0(arrayList7);
                Collection<wt90> values = map2.values();
                ArrayList arrayList8 = new ArrayList(c5g.u(values, 10));
                Iterator it7 = values.iterator();
                while (it7.hasNext()) {
                    arrayList8.add(((wt90) it7.next()).c);
                }
                LinkedHashMap w = com.vk.folders.impl.configure.d.w(arrayList8, map2, S0, gtmVar.a);
                Collection<wt90> values2 = map.values();
                ArrayList arrayList9 = new ArrayList(c5g.u(values2, 10));
                Iterator it8 = values2.iterator();
                while (it8.hasNext()) {
                    arrayList9.add(((wt90) it8.next()).c);
                }
                LinkedHashMap w2 = com.vk.folders.impl.configure.d.w(arrayList9, map, S0, gtmVar.a);
                return ayr.a(ayrVar, d.a.a(w2, w, ayrVar.i, ayrVar.h, ayrVar.a, null, null, ayrVar.d, com.vk.folders.impl.configure.b.a(dVar.h), ayrVar.g, dVar.m, dVar.p), false, false, null, w2, w, null, null, null, gtmVar.a, false, 15822);
            case 12:
                com.vk.lists.c cVar = (com.vk.lists.c) this.c;
                FriendsRecommendationsFragment friendsRecommendationsFragment = (FriendsRecommendationsFragment) this.d;
                VKFromList vKFromList = (VKFromList) obj;
                int i6 = FriendsRecommendationsFragment.b0;
                String j = cVar.j();
                if (j == null || j.length() == 0 || epx.f(cVar.j(), "0")) {
                    if (g620.q != 0) {
                        rsg0.y0(new sm4(), null, null, 3).subscribe(new defpackage.n(new y8(21), 28), new bf2(new qm(24), 17));
                    }
                    friendsRecommendationsFragment.io().clear();
                    friendsRecommendationsFragment.io().n0((List) friendsRecommendationsFragment.X.getValue());
                }
                CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
                catalogFeatures.getClass();
                if (com.vk.toggle.b.A.a(catalogFeatures)) {
                    arrayList2 = new ArrayList();
                    for (Object obj2 : vKFromList) {
                        Item.Type type = ((Item) obj2).a;
                        if (type == Item.Type.FOLLOW_SUGGEST || type == Item.Type.REQUEST) {
                            arrayList2.add(obj2);
                        }
                    }
                } else {
                    arrayList2 = vKFromList;
                }
                cVar.s(vKFromList.i());
                friendsRecommendationsFragment.io().n0(arrayList2);
                return s3q0.a;
            case 13:
                VkBlurView vkBlurView = (VkBlurView) this.c;
                HomeFragment2 homeFragment2 = (HomeFragment2) this.d;
                int i7 = HomeFragment2.x0;
                int measuredHeight = ((VkBlurView) obj).getMeasuredHeight();
                if (measuredHeight > 0) {
                    vkBlurView.setColorOverlayShader(v7p0.a(measuredHeight, homeFragment2.requireContext()));
                    vkBlurView.setFallbackColorOverlay(v7p0.a(measuredHeight, homeFragment2.requireContext()));
                }
                return s3q0.a;
            case 14:
                izs izsVar = (izs) this.c;
                ImageGalleryItem imageGalleryItem = (ImageGalleryItem) this.d;
                ((Integer) obj).getClass();
                izsVar.invoke(new wiw.b(((ImageGalleryItem.ImageGalleryImageItem) imageGalleryItem).b));
                return s3q0.a;
            case 15:
                p0x p0xVar = (p0x) this.c;
                ImageList imageList = (ImageList) this.d;
                View view = p0xVar.h;
                ek30 ek30Var = p0xVar.j;
                if (view == null) {
                    view = null;
                }
                f4m.j(view);
                FrescoImageView frescoImageView = p0xVar.d;
                if (frescoImageView == null) {
                    frescoImageView = null;
                }
                frescoImageView.setVisibility(0);
                FrescoImageView frescoImageView2 = p0xVar.d;
                if (frescoImageView2 == null) {
                    frescoImageView2 = null;
                }
                frescoImageView2.n(null, null);
                FrescoImageView frescoImageView3 = p0xVar.d;
                if (frescoImageView3 == null) {
                    frescoImageView3 = null;
                }
                frescoImageView3.setPlaceholder(ek30Var);
                FrescoImageView frescoImageView4 = p0xVar.d;
                if (frescoImageView4 == null) {
                    frescoImageView4 = null;
                }
                frescoImageView4.setEmptyPlaceholder(ek30Var);
                FrescoImageView frescoImageView5 = p0xVar.d;
                (frescoImageView5 != null ? frescoImageView5 : null).setRemoteImage(imageList);
                return s3q0.a;
            case 16:
                drx drxVar = (drx) this.c;
                erx erxVar = (erx) this.d;
                GroupsGetFriendsInvitationListResponseDto groupsGetFriendsInvitationListResponseDto = (GroupsGetFriendsInvitationListResponseDto) obj;
                ArrayList W = drxVar.W(groupsGetFriendsInvitationListResponseDto.i());
                InviteFriendsTabIndex inviteFriendsTabIndex = InviteFriendsTabIndex.INVITED;
                drxVar.T(new orx.c.C3467c(inviteFriendsTabIndex, bsx.a(frx.e(erxVar, inviteFriendsTabIndex).c, W, groupsGetFriendsInvitationListResponseDto.g())));
                return s3q0.a;
            case 17:
                ((kzx) this.c).T(new pzx.b.a((String) this.d, (wt2) obj));
                return s3q0.a;
            case 18:
                xry xryVar = (xry) this.c;
                hry hryVar = (hry) this.d;
                xry.c b = xryVar.b(((Integer) obj).intValue());
                int i8 = b.a;
                List<tfu> list5 = b.b;
                ArrayList arrayList10 = new ArrayList(list5.size());
                int size = list5.size();
                int i9 = 0;
                while (i5 < size) {
                    int i10 = (int) list5.get(i5).a;
                    arrayList10.add(new Pair(Integer.valueOf(i8), new o6j(hryVar.a(i9, i10))));
                    i8++;
                    i9 += i10;
                    i5++;
                }
                return arrayList10;
            case 19:
                b.C0929b c0929b = (b.C0929b) this.c;
                com.vk.ecomm.catalog.impl.catalog.simple.b bVar5 = (com.vk.ecomm.catalog.impl.catalog.simple.b) this.d;
                View view2 = (View) obj;
                yfc yfcVar = c0929b.a;
                MarketAnalyticsParams b2 = yfcVar != null ? yfcVar.b() : null;
                c0929b.e.getClass();
                String str2 = b2 != null ? b2.j : null;
                CommonMarketStat$TypeAdCampaign a4 = wfc.a(b2);
                if (b2 != null && (marketUtmData = b2.b) != null) {
                    str = marketUtmData.h;
                }
                wfc.b(str2, new CommonMarketStat$TypeMarketTransitionToBookmarks(a4, str));
                MarketProfileInfoDto marketProfileInfoDto = c0929b.c;
                if (marketProfileInfoDto == null || (d = marketProfileInfoDto.d()) == null || (url = d.getUrl()) == null) {
                    return s3q0.a;
                }
                maz.c(bVar5.c, view2.getContext(), url, LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 20:
                ((s240) this.c).c.onNext(new s240.a((UserId) this.d, (t240.a) obj));
                return s3q0.a;
            case 21:
                zc40 zc40Var = (zc40) this.c;
                CatalogViewHolder catalogViewHolder = (CatalogViewHolder) this.d;
                hda hdaVar = (hda) obj;
                UIBlock uIBlock = (UIBlock) j5g.a0(jda.a(zc40Var.b, hdaVar.a, hdaVar.b, false, false, 12));
                if (uIBlock != null) {
                    catalogViewHolder.N6(uIBlock);
                }
                return s3q0.a;
            case 22:
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE audio_track SET json_raw = ? WHERE mid = ?");
                try {
                    V0.D3(1, str3);
                    V0.D3(2, str4);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 23:
                ((um50) this.c).c(new i4(i3, (h7f0) obj, (hn50) this.d));
                return s3q0.a;
            case 24:
                d960.b.a aVar4 = (d960.b.a) this.c;
                gd80 gd80Var = (gd80) this.d;
                VkImage vkImage = (VkImage) obj;
                VkImage vkImage2 = aVar4.n;
                Image image = gd80Var.a;
                vkImage2.o0((image == null || (Cb = image.Cb(vkImage.getMeasuredWidth(), true, false)) == null) ? null : Cb.d.d, null);
                return s3q0.a;
            case 25:
                com.vk.profile.questions.impl.h hVar = (com.vk.profile.questions.impl.h) this.c;
                com.vk.profile.questions.impl.d dVar2 = (com.vk.profile.questions.impl.d) this.d;
                LinkedHashMap linkedHashMap = hVar.j;
                Integer num2 = (Integer) linkedHashMap.get(com.vk.profile.questions.impl.h.j7(dVar2));
                int intValue = (num2 != null ? num2.intValue() : 0) + 1;
                linkedHashMap.put(com.vk.profile.questions.impl.h.j7(dVar2), Integer.valueOf(intValue));
                d.b aVar5 = intValue >= 3 ? new d.a(dVar2.b(), dVar2.a(), epx.f(dVar2.b().j(), Boolean.TRUE)) : new d.b(dVar2.b(), dVar2.a(), false);
                int id = dVar2.b().getId();
                ArrayList arrayList11 = hVar.h;
                Iterator it9 = arrayList11.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        i5 = -1;
                    } else if (((com.vk.profile.questions.impl.d) it9.next()).b().getId() != id) {
                        i5++;
                    }
                }
                if (i5 >= 0) {
                    arrayList11.set(i5, aVar5);
                    hVar.i--;
                    s3q0 s3q0Var = s3q0.a;
                    hVar.u7();
                }
                return s3q0.a;
            case 26:
                c1h c1hVar = (c1h) this.c;
                lop0 lop0Var = (lop0) this.d;
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                lop0Var.a(ggjVar, (((Number) c1hVar.s.getValue()).floatValue() * Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L))) + ((Number) c1hVar.r.getValue()).floatValue());
                return s3q0.a;
            case 27:
                ((ctl0) this.c).b.e(128, new Pair((StoryEntry) this.d, (Throwable) obj));
                return s3q0.a;
            case 28:
                WebActionSticker webActionSticker = (WebActionSticker) this.c;
                szl0 szl0Var = (szl0) this.d;
                StickerItem stickerItem = (StickerItem) obj;
                t6g0 t6g0Var = t6g0.b;
                String z0 = t6g0.d().z0(stickerItem, iah0.v() / 3, dhr0.M());
                String a5 = stickerItem.a(dhr0.M());
                int i11 = webActionSticker.b;
                int i12 = webActionSticker.c;
                if (i12 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append('_');
                    sb2.append(i11);
                    valueOf = sb2.toString();
                } else {
                    valueOf = String.valueOf(i11);
                }
                int i13 = 6;
                if (a5.length() <= 0) {
                    return mcr0.h(Uri.parse(z0)).U(new aad0(new p83(webActionSticker, szl0Var, valueOf, i2), i13));
                }
                bpn0 bpn0Var = yse0.a;
                return RLottieDrawable.s ? c7r0.i(a5).U(new cfz(new zsl0(i4, webActionSticker, valueOf), 13)) : c7r0.g(a5, valueOf, false).U(new b630(new tol(webActionSticker, valueOf, a5, i13), i3));
            default:
                ((izs) this.c).invoke(((StoryViewHeader) this.d).g);
                return s3q0.a;
        }
    }
}
