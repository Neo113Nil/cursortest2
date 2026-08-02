package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.users.dto.UsersTabCollectionDto;
import com.vk.api.generated.users.dto.UsersTabSpecialValuesDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackWithBuyVh;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryRadioStationVh;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Thumb;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickerStockItemDiscounts;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.dto.stickers.bonus.StickersBonusReward;
import com.vk.dto.stickers.bonus.StickersBonusRewardsCatalog;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.messagetemplates.impl.keyboard.b;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$SubTitleParams;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.pushes.receivers.c;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.ComFeatures;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import okhttp3.Protocol;
import xsna.avh0;
import xsna.bc9;
import xsna.cvd0;
import xsna.f0r;
import xsna.f360;
import xsna.fh8;
import xsna.gij;
import xsna.naq0;
import xsna.ndw;
import xsna.p8a0;
import xsna.q8a0;
import xsna.rd8;
import xsna.rjo0.b;
import xsna.rmy;
import xsna.wk50;
import xsna.ymq0;
import xsna.z1f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fo6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fo6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02b7, code lost:
    
        if (r4.a(r3) == false) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [xsna.mdg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xsna.sxm, xsna.yj7] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v39, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Map map;
        SearchHistoryItemViewParams$ActionIconParams searchHistoryItemViewParams$ActionIconParams;
        ?? r3;
        ArrayList arrayList;
        Clips.ContentTabCollection contentTabCollection;
        UsersTabSpecialValuesDto usersTabSpecialValuesDto;
        Object obj2;
        List<UsersTabCollectionDto> list;
        cvd0.f fVar;
        int i = this.b;
        int i2 = 0;
        boolean z = true;
        rmy rmyVar = null;
        String str = null;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                BaseStickerPackWithBuyVh baseStickerPackWithBuyVh = (BaseStickerPackWithBuyVh) obj4;
                StickerStockItem stickerStockItem = (StickerStockItem) obj3;
                f9l0 f9l0Var = baseStickerPackWithBuyVh.c;
                Context context = baseStickerPackWithBuyVh.i;
                f9l0Var.c(context != null ? context : null, stickerStockItem, baseStickerPackWithBuyVh.d);
                return s3q0.a;
            case 1:
                ((l57) obj4).h.getClass();
                return ((Cipher) obj3).doFinal((byte[]) obj);
            case 2:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) obj3;
                StickersBonusRewardsCatalog stickersBonusRewardsCatalog = (StickersBonusRewardsCatalog) obj;
                int i3 = BonusCatalogFragment.f0;
                ((com.vk.lists.c) obj4).s(null);
                ?? r2 = bonusCatalogFragment.a0;
                r2.getClass();
                StickersBonusBalance stickersBonusBalance = stickersBonusRewardsCatalog.d;
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = stickersBonusRewardsCatalog.f;
                StickerStockItemDiscounts stickerStockItemDiscounts = stickersBonusRewardsCatalog.e;
                boolean isEmpty = stickerStockItemDiscounts.b.isEmpty();
                boolean z3 = stickersBonusRewardsCatalog.b;
                if (z3) {
                    arrayList2.add(new jk7(stickersBonusBalance, isEmpty));
                } else {
                    arrayList2.add(new ek7(stickersBonusBalance));
                }
                yk7 yk7Var = new yk7(e43.l(new wk7(R.string.stickers_bonus_catalog_tutorial_1_title, R.string.stickers_bonus_catalog_tutorial_1_description, R.drawable.vector_bonus_tutorial_1), new wk7(R.string.stickers_bonus_catalog_tutorial_2_title, R.string.stickers_bonus_catalog_tutorial_2_description, R.drawable.vector_bonus_tutorial_2), new wk7(R.string.stickers_bonus_catalog_tutorial_3_title, R.string.stickers_bonus_catalog_tutorial_3_description, R.drawable.vector_bonus_tutorial_3)));
                if (isEmpty) {
                    if (z2) {
                        arrayList2.add(ak7.c);
                    }
                    arrayList2.add(yk7Var);
                } else {
                    arrayList2.add(new nk7(stickerStockItemDiscounts));
                }
                arrayList2.add(pk7.c);
                Iterator it = stickersBonusRewardsCatalog.c.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new qk7((StickersBonusReward) it.next(), stickersBonusBalance, z3, false));
                }
                if (!isEmpty) {
                    arrayList2.add(yk7Var);
                }
                if (z3) {
                    arrayList2.add(gk7.c);
                }
                r2.setItems(arrayList2);
                StickersBonusBalance stickersBonusBalance2 = stickersBonusRewardsCatalog.d;
                ds4 ds4Var = bonusCatalogFragment.e0;
                RecyclerPaginatedView recyclerPaginatedView = bonusCatalogFragment.S;
                if (recyclerPaginatedView == null) {
                    recyclerPaginatedView = null;
                }
                recyclerPaginatedView.removeCallbacks(ds4Var);
                Long l = stickersBonusBalance2.c;
                long longValue = (l != null ? l.longValue() : 0L) - System.currentTimeMillis();
                if (longValue > 0) {
                    RecyclerPaginatedView recyclerPaginatedView2 = bonusCatalogFragment.S;
                    (recyclerPaginatedView2 == null ? null : recyclerPaginatedView2).postDelayed(ds4Var, longValue);
                }
                return s3q0.a;
            case 3:
                m68 m68Var = (m68) obj4;
                String str2 = (String) obj;
                if (m68Var.f((Photo) obj3)) {
                    m68Var.D.setText(str2);
                }
                return s3q0.a;
            case 4:
                BroadcastConfigFragment broadcastConfigFragment = (BroadcastConfigFragment) obj4;
                int i4 = BroadcastConfigFragment.U;
                rd8 d = ((pd8) obj3).d();
                if (d instanceof rd8.a) {
                    rd8.a aVar = (rd8.a) d;
                    String str3 = aVar.f;
                    String str4 = aVar.e;
                    rmyVar = str3 == null ? new rmy.a(str4, aVar.g, aVar.h, aVar.i) : new rmy.b(str3, str4);
                }
                if (rmyVar != null) {
                    eh8 fo = broadcastConfigFragment.fo();
                    if (fo != null) {
                        fo.a(new fh8.d.c(rmyVar));
                    }
                    broadcastConfigFragment.tn();
                }
                return s3q0.a;
            case 5:
                izs izsVar = (izs) obj4;
                Object obj5 = ((bc9.a) obj3).l;
                izsVar.invoke(obj5 != null ? obj5 : null);
                return s3q0.a;
            case 6:
                Collection<bdb> collection = (Collection) obj3;
                SQLiteStatement compileStatement = ((e0w) obj).compileStatement(((ChannelsDb) obj4).a.e());
                try {
                    for (bdb bdbVar : collection) {
                        compileStatement.clearBindings();
                        ChannelsDb.a(compileStatement, bdbVar);
                        compileStatement.executeInsert();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    compileStatement.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(compileStatement, th);
                        throw th2;
                    }
                }
            case 7:
                ?? r10 = (mdg) obj4;
                NewsComment newsComment = (NewsComment) obj3;
                Throwable th3 = (Throwable) obj;
                r10.M.remove(Integer.valueOf(newsComment.i));
                newsComment.C = true;
                newsComment.p++;
                r10.h1(newsComment);
                if (th3 instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th3);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 8:
                thh thhVar = (thh) obj4;
                y0q y0qVar = (y0q) obj3;
                List<Group> list2 = y0qVar.j;
                if (list2 == null || list2.isEmpty()) {
                    thh.v(thhVar, y0qVar, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    thh.v(thhVar, y0qVar, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
            case 9:
                w2w w2wVar = (w2w) obj4;
                kim kimVar = (kim) obj3;
                hpm c = sn.c(w2wVar);
                long j = kimVar.c.b;
                com.vk.im.engine.models.dialogs.b c2 = c.c(j);
                if (c2 == null) {
                    return null;
                }
                w2wVar.I0().b().e().C(c2.d.j(kimVar.d).b, j);
                xgl0 I0 = w2wVar.I0();
                return (gkx0) ((Map) I0.u(new mmm(I0, Collections.singletonList(Long.valueOf(j)), z, i2))).get(Long.valueOf(j));
            case 10:
                ndw ndwVar = (ndw) obj4;
                psm psmVar = (psm) obj3;
                oum oumVar = (oum) obj;
                if (ndwVar instanceof ndw.a) {
                    map = ((ndw.a) ndwVar).a;
                } else {
                    if (!epx.f(ndwVar, ndw.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Set<Peer> keySet = oumVar.k.keySet();
                    int e = on00.e(c5g.u(keySet, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    Map linkedHashMap = new LinkedHashMap(e);
                    for (Object obj6 : keySet) {
                        linkedHashMap.put(obj6, ImStoryState.NONE);
                    }
                    map = linkedHashMap;
                }
                oum a = oum.a(oumVar, null, null, null, null, null, null, null, null, null, null, map, null, 3071);
                Set keySet2 = map.keySet();
                ArrayList arrayList3 = new ArrayList(c5g.u(keySet2, 10));
                Iterator it2 = keySet2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(((Peer) it2.next()).b));
                }
                return psmVar.w(a, j5g.S0(arrayList3));
            case 11:
                Drawable[] drawableArr = (Drawable[]) obj;
                i1n i1nVar = ((v0n) obj4).b;
                Drawable drawable = drawableArr[0];
                Drawable drawable2 = drawableArr[1];
                Drawable drawable3 = drawableArr[2];
                Drawable drawable4 = drawableArr[3];
                Drawable drawable5 = drawableArr[4];
                i1nVar.c = drawable;
                i1nVar.d = drawable2;
                i1nVar.e = drawable3;
                i1nVar.f = drawable4;
                i1nVar.g = drawable5;
                ((RecyclerView) obj3).invalidateItemDecorations();
                return s3q0.a;
            case 12:
                ((f0r.c) obj4).h((wk50.a) obj3, (Throwable) obj);
                return s3q0.a;
            case 13:
                ((AtomicReference) obj4).set(obj);
                ((CountDownLatch) obj3).countDown();
                return s3q0.a;
            case 14:
                InAppReviewConditionKey inAppReviewConditionKey = (InAppReviewConditionKey) obj3;
                bm01 bm01Var = ((brw) obj4).d;
                if (bm01Var != null) {
                    bm01Var.b("IN_APP_REVIEW_FAILED", inAppReviewConditionKey.h(), null);
                }
                return s3q0.a;
            case 15:
                ghy ghyVar = (ghy) obj3;
                y4l0 y4l0Var = ((fhy) obj4).l;
                if (y4l0Var != null) {
                    y4l0Var.e(ghyVar.d, ghyVar.f, ghyVar.c, ghyVar.g);
                }
                return s3q0.a;
            case 16:
                ((gzs) obj4).invoke();
                ((i560) obj3).c = null;
                return s3q0.a;
            case 17:
                c.a aVar2 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) obj4, (Intent) obj3, (Throwable) obj);
                return s3q0.a;
            case 18:
                ((izs) obj4).invoke(new a.C1352a((OfflinePodcastEpisodesMviState.SortType) obj));
                ((gzs) obj3).invoke();
                return s3q0.a;
            case 19:
                ((izs) obj4).invoke((q8a0.a.b) ((p8a0.d) obj3).m);
                return s3q0.a;
            case 20:
                gij gijVar = (gij) obj;
                ((com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.c) ((pgc0) obj4).t.getValue()).a(gijVar);
                f2i f2iVar = ((ggc0) obj3).e;
                if (gijVar.b == PostingCreationEntryPoint.FeedPlus) {
                    if (gijVar instanceof gij.d) {
                        gij.d dVar = (gij.d) gijVar;
                        UserId userId = dVar.a;
                        naq0.b bVar = new naq0.b(dVar.c, fkq0.b(userId) ? R.string.feed_video_uploaded_community : R.string.feed_video_uploaded_profile, userId);
                        if (f2iVar != null) {
                            f2iVar.b(bVar);
                        }
                    } else if (gijVar instanceof gij.a) {
                        UserId userId2 = ((gij.a) gijVar).a;
                        if (!fkq0.d(userId2)) {
                            ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_NEW_UPLOADER;
                            clipsFeatures.getClass();
                            com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
                            if (bVar2.a(clipsFeatures)) {
                                ComFeatures comFeatures = ComFeatures.COM_MAIN_TAB;
                                comFeatures.getClass();
                                break;
                            }
                        }
                        naq0.a aVar3 = new naq0.a(fkq0.b(userId2) ? R.string.feed_clip_uploaded_community : R.string.feed_clip_uploaded_profile, userId2);
                        if (f2iVar != null) {
                            f2iVar.b(aVar3);
                        }
                    }
                }
                return s3q0.a;
            case 21:
                okhttp3.d dVar2 = (okhttp3.d) obj3;
                f360.a aVar4 = (f360.a) obj;
                Iterator<f360> it3 = ((r9e0) obj4).d.iterator();
                while (it3.hasNext()) {
                    it3.next().g(dVar2, aVar4);
                }
                return s3q0.a;
            case 22:
                z1f0 z1f0Var = (z1f0) obj4;
                z1f0.a aVar5 = (z1f0.a) obj3;
                yaw yawVar = (yaw) obj;
                Activity w = bwt0.w(z1f0Var);
                if (w == null) {
                    w = e3m.h(z1f0Var.getContext());
                }
                if (w != null) {
                    m5f0 m5f0Var = m5f0.a;
                    boolean z4 = aVar5.c;
                    svd svdVar = new svd(z1f0Var, yawVar, aVar5, 11);
                    m5f0Var.getClass();
                    m5f0.d(w, z4, svdVar);
                }
                return s3q0.a;
            case 23:
                RadioStation radioStation = (RadioStation) obj4;
                zuh0 zuh0Var = (zuh0) obj;
                Thumb thumb = radioStation.c;
                Context context2 = ((SearchHistoryRadioStationVh) obj3).k;
                String str5 = radioStation.e;
                avh0.c cVar = new avh0.c(thumb, null, context2.getString(R.string.music_radio_talkback_cover, str5), 14);
                bvh0 bvh0Var = new bvh0(str5, Boolean.FALSE);
                SearchHistoryItemViewParams$SubTitleParams searchHistoryItemViewParams$SubTitleParams = new SearchHistoryItemViewParams$SubTitleParams(context2.getString(R.string.music_search_history_radio_station), null);
                boolean z5 = radioStation.g;
                if (z5) {
                    searchHistoryItemViewParams$ActionIconParams = new SearchHistoryItemViewParams$ActionIconParams(SearchHistoryItemViewParams$ActionIconParams.IconType.Done, true, Integer.valueOf(R.string.music_radio_talkback_unfollow), 4);
                } else {
                    if (z5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    searchHistoryItemViewParams$ActionIconParams = new SearchHistoryItemViewParams$ActionIconParams(SearchHistoryItemViewParams$ActionIconParams.IconType.Add, true, Integer.valueOf(R.string.music_radio_talkback_follow), 4);
                }
                return zuh0.a(zuh0Var, cVar, bvh0Var, searchHistoryItemViewParams$SubTitleParams, searchHistoryItemViewParams$ActionIconParams);
            case 24:
                s1i0 s1i0Var = (s1i0) obj3;
                bwj bwjVar = (bwj) ((izs) obj4).invoke((dwj) obj);
                if (bwjVar == null) {
                    return null;
                }
                s1i0Var.c.add(bwjVar);
                return bwjVar;
            case 25:
                bn50 bn50Var = (bn50) obj4;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(bn50Var), new com.vk.messagetemplates.impl.keyboard.g(((ck3) obj3).a));
                g47Var.a(tci.k(bn50Var));
                g47Var.d(new b.a(bn50Var));
                return s3q0.a;
            case 26:
                rjo0 rjo0Var = (rjo0) obj4;
                izs<tbo0, s3q0> izsVar2 = (izs) obj3;
                rjo0Var.c.add(izsVar2);
                return rjo0Var.new b(izsVar2);
            case 27:
                Clips clips = (Clips) obj3;
                ymq0.a aVar6 = (ymq0.a) obj;
                Clips clips2 = ((ymq0) obj4).p;
                if (clips2 == null || (fVar = clips2.j) == null) {
                    r3 = EmptyList.b;
                } else {
                    ArrayList arrayList4 = fVar.a;
                    r3 = new ArrayList();
                    for (Object obj7 : arrayList4) {
                        if (epx.f(((VideoFile) obj7).getType(), "tab_collection_draft_dummy")) {
                            r3.add(obj7);
                        }
                    }
                }
                List<ExtendedUserProfile.m> list3 = aVar6.d;
                if (list3 != null) {
                    for (ExtendedUserProfile.m mVar : list3) {
                        if (mVar.a.equals("short_videos")) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                mVar = null;
                if (mVar == null || (list = mVar.g) == null) {
                    arrayList = null;
                } else {
                    List<UsersTabCollectionDto> list4 = list;
                    arrayList = new ArrayList(c5g.u(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(Clips.a.b((UsersTabCollectionDto) it4.next()));
                    }
                }
                int i5 = dnq0.a;
                if (arrayList != null) {
                    Iterator it5 = arrayList.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj2 = it5.next();
                            if (((Clips.ContentTabCollection) obj2).a == Clips.ContentTabCollection.ContentTabCollectionType.SCHEDULED) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    contentTabCollection = (Clips.ContentTabCollection) obj2;
                } else {
                    contentTabCollection = null;
                }
                VideoFileOld d2 = dnq0.d(contentTabCollection);
                Iterable singletonList = d2 != null ? Collections.singletonList(d2) : EmptyList.b;
                VKList<VideoFile> vKList = aVar6.a;
                Iterable iterable = vKList != null ? vKList : EmptyList.b;
                Integer d3 = (mVar == null || (usersTabSpecialValuesDto = mVar.h) == null) ? null : usersTabSpecialValuesDto.d();
                cvd0.f fVar2 = new cvd0.f(j5g.u0(iterable, j5g.u0(singletonList, (Collection) r3)));
                boolean z6 = myc0.f(vKList != null ? vKList.j() : null) && vKList != null && (vKList.isEmpty() ^ true);
                String j2 = vKList != null ? vKList.j() : null;
                CommunityProfileContentItem.b bVar3 = clips.q;
                if (d3 != null) {
                    Context context3 = e43.a;
                    str = (context3 != null ? context3 : null).getResources().getQuantityString(R.plurals.profile_content_clips_coauthors_invitation_count, d3.intValue(), d3);
                }
                return Clips.i(clips, fVar2, null, null, null, z6, false, j2, CommunityProfileContentItem.b.a(bVar3, str), null, null, null, d3, false, 458542);
            default:
                ((mtq0) obj4).n.a((UserProfileAction) obj3);
                return s3q0.a;
        }
    }

    public /* synthetic */ fo6(r9e0 r9e0Var, okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        this.b = 21;
        this.c = r9e0Var;
        this.d = dVar;
    }
}
