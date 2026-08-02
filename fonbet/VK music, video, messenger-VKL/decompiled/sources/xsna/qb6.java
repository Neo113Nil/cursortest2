package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.soloader.MinElf;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.impl.recommended.entity.RecommendedPlaylistState;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupSmallHorizontalListItemVh;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.viewer.impl.grid.repository.cache.GridHeaderMemCache;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.ClipsEntry;
import com.vk.dto.newsfeed.entries.InterestingStoriesEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.model.DiscoverBlockType;
import com.vk.dto.tags.Tag;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachesState;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.details.impl.name_history.e;
import com.vk.profile.core.scheduled_clips.BaseCommunityScheduledClipsGridFragment;
import com.vk.profile.core.scheduled_clips.b;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetOptions;
import com.vk.profile.core.scheduled_clips.g;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.browser.internal.ui.banner.PersonalBannerView;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.bwy;
import xsna.e8v0;
import xsna.eeu0;
import xsna.g5y;
import xsna.gm50;
import xsna.jto0;
import xsna.k5a0;
import xsna.n0o0;
import xsna.o0r0;
import xsna.pwb;
import xsna.px9;
import xsna.t8a;
import xsna.xn50;
import xsna.xrh;
import xsna.zjv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qb6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qb6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, xsna.okd] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Activity h;
        int i;
        int i2;
        String a;
        MobileOfficialAppsCoreNavStat$EventScreen a2;
        ce60 ce60Var;
        List<ClipVideoFile> list;
        n0o0.a aVar;
        rnd0 rnd0Var;
        int i3 = this.b;
        int i4 = 7;
        int i5 = 2;
        int i6 = 8;
        int i7 = 4;
        int i8 = 3;
        boolean z = false;
        int i9 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                final BaseCommunityScheduledClipsGridFragment baseCommunityScheduledClipsGridFragment = (BaseCommunityScheduledClipsGridFragment) obj3;
                final com.vk.profile.core.scheduled_clips.c cVar = (com.vk.profile.core.scheduled_clips.c) obj2;
                com.vk.profile.core.scheduled_clips.g gVar = (com.vk.profile.core.scheduled_clips.g) obj;
                int i10 = BaseCommunityScheduledClipsGridFragment.S;
                if (gVar instanceof g.a) {
                    baseCommunityScheduledClipsGridFragment.finish();
                } else if (gVar instanceof g.b) {
                    ClipVideoFile clipVideoFile = ((g.b) gVar).a;
                    if (new Date(System.currentTimeMillis()).compareTo(new Date(TimeUnit.SECONDS.toMillis(clipVideoFile.r))) > 0) {
                        eeu0.a aVar2 = new eeu0.a(baseCommunityScheduledClipsGridFragment.requireContext(), R.style.VkAlertDialogNewTheme);
                        aVar2.B(R.string.community_scheduled_clip_published_or_removed);
                        aVar2.setPositiveButton(R.string.community_scheduled_clips_grid_refresh, new DialogInterface.OnClickListener() { // from class: xsna.rb6
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                int i12 = BaseCommunityScheduledClipsGridFragment.S;
                                com.vk.profile.core.scheduled_clips.c.this.C(new b.a(baseCommunityScheduledClipsGridFragment.go(), true));
                                dialogInterface.dismiss();
                            }
                        });
                        aVar2.m();
                    } else {
                        Context mo2getContext = baseCommunityScheduledClipsGridFragment.mo2getContext();
                        if (mo2getContext != null && (h = e3m.h(mo2getContext)) != null) {
                            com.vk.profile.core.scheduled_clips.a aVar3 = new com.vk.profile.core.scheduled_clips.a(baseCommunityScheduledClipsGridFragment, clipVideoFile);
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            j0i j0iVar = new j0i(clipVideoFile, baseCommunityScheduledClipsGridFragment.Q, clipVideoFile.b, rdi.p(h, new zy(ref$ObjectRef, i6)), baseCommunityScheduledClipsGridFragment.ho());
                            wx4 wx4Var = baseCommunityScheduledClipsGridFragment.getFeature().g;
                            l0i fo = baseCommunityScheduledClipsGridFragment.fo();
                            boolean ho = baseCommunityScheduledClipsGridFragment.ho();
                            ListBuilder e = e43.e();
                            e.add(new swf0(null, fo.Y()));
                            e.add(new hwf0(CommunityScheduledClipsBottomSheetOptions.REMOVE.ordinal()));
                            e.add(new vyo(null, fo.Y(), fo.a()));
                            e.add(new dee0(fo.c(), wx4Var));
                            e.add(new b1p(CommunityScheduledClipsBottomSheetOptions.EDIT_PUBLICATION_DATE.ordinal()));
                            ListBuilder g = e.g();
                            ArrayList arrayList = new ArrayList();
                            ListIterator listIterator = g.listIterator(0);
                            while (true) {
                                ListBuilder.a aVar4 = (ListBuilder.a) listIterator;
                                if (aVar4.hasNext()) {
                                    ModalActionSheetListItem a3 = ((g0i) aVar4.next()).a(h, j0iVar);
                                    if (a3 != null) {
                                        arrayList.add(a3);
                                    }
                                } else {
                                    List D0 = j5g.D0(new h0i(0), arrayList);
                                    ahc ahcVar = new ahc(g, j0iVar, aVar3);
                                    int v = ho ? dhr0.a.v() : dhr0.C().c;
                                    ez20 ez20Var = j0iVar.e;
                                    ?? okdVar = new okd(h, D0, ahcVar, v, ez20Var != null ? new i0i(ez20Var) : null);
                                    okdVar.a();
                                    ref$ObjectRef.element = okdVar;
                                }
                            }
                        }
                    }
                } else if (gVar.equals(g.d.a)) {
                    cVar.C(new b.a(baseCommunityScheduledClipsGridFragment.go(), true));
                } else {
                    if (!gVar.equals(g.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eeu0.a aVar5 = new eeu0.a(baseCommunityScheduledClipsGridFragment.requireContext(), R.style.VkAlertDialogNewTheme);
                    aVar5.setTitle("Клип уже опубликован или удалён");
                    aVar5.j("Обновить страницу", new DialogInterface.OnClickListener() { // from class: xsna.sb6
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            int i12 = BaseCommunityScheduledClipsGridFragment.S;
                            com.vk.profile.core.scheduled_clips.c.this.C(new b.a(baseCommunityScheduledClipsGridFragment.go(), true));
                            dialogInterface.dismiss();
                        }
                    });
                    aVar5.m();
                }
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                ((vw9) obj3).T(new px9.g.a((UserId) obj2));
                return s3q0.a;
            case 2:
                ((izs) obj3).invoke(((CatalogFilterData) ((List) obj2).get(((ModalActionSheetListItem) obj).a)).b);
                return s3q0.a;
            case 3:
                pwb.a aVar6 = ((pwb) obj3).l;
                kkm kkmVar = (kkm) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
                imFeatures.getClass();
                return com.vk.toggle.b.A.a(imFeatures) ? new gsr0(aVar6, viewGroup) : new fsr0(aVar6, viewGroup, kkmVar);
            case 4:
                final ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj3;
                ClipsFavoriteFolderContentListViewState clipsFavoriteFolderContentListViewState = (ClipsFavoriteFolderContentListViewState) obj2;
                ClipsFavoriteFolderContentListFragment.b bVar = (ClipsFavoriteFolderContentListFragment.b) obj;
                int i11 = ClipsFavoriteFolderContentListFragment.W;
                bVar.c.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.y2e
                    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                    public final void h() {
                        int i12 = ClipsFavoriteFolderContentListFragment.W;
                        ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment2 = ClipsFavoriteFolderContentListFragment.this;
                        clipsFavoriteFolderContentListFragment2.getClass();
                        xn50.a.c(clipsFavoriteFolderContentListFragment2, a.f.b);
                    }
                });
                RecyclerView recyclerView = bVar.d;
                clipsFavoriteFolderContentListFragment.requireContext();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
                gridLayoutManager.x = new a3e(clipsFavoriteFolderContentListFragment);
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.setAdapter((v2e) clipsFavoriteFolderContentListFragment.U.getValue());
                recyclerView.addOnScrollListener(new ye90(new ka0(clipsFavoriteFolderContentListFragment, 24)));
                int a4 = e3m.a(R.dimen.clips_favorite_folder_content_grid_spacing, clipsFavoriteFolderContentListFragment.requireContext());
                recyclerView.addItemDecoration(new igu(3, a4, a4));
                bVar.h.getErrorButton().setOnClickListener(new bn1(clipsFavoriteFolderContentListFragment, i8));
                gm50.a.b(clipsFavoriteFolderContentListFragment, clipsFavoriteFolderContentListViewState.a, new b1a(5, clipsFavoriteFolderContentListFragment, bVar));
                gm50.a.b(clipsFavoriteFolderContentListFragment, clipsFavoriteFolderContentListViewState.b, new h57(i7, bVar, clipsFavoriteFolderContentListFragment));
                gm50.a.b(clipsFavoriteFolderContentListFragment, clipsFavoriteFolderContentListViewState.c, new na7(i6, bVar, clipsFavoriteFolderContentListFragment));
                gm50.a.b(clipsFavoriteFolderContentListFragment, clipsFavoriteFolderContentListViewState.d, new u6(9, bVar, clipsFavoriteFolderContentListFragment));
                gm50.a.b(clipsFavoriteFolderContentListFragment, clipsFavoriteFolderContentListViewState.e, new d50(i4, bVar, clipsFavoriteFolderContentListFragment));
                return s3q0.a;
            case 5:
                xwk.e().m(((VkRichCell) obj3).getContext(), ((ClipGridParams.Data.Music) obj2).b.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 6:
                ((q7v0) obj3).a(((xrh.c.b) obj2).b, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            case 7:
                int i12 = CommunityNameHistoryFragment.S;
                gm50.a.a((CommunityNameHistoryFragment) obj3, ((e.c) obj).a, new wze((UsableRecyclerPaginatedView) obj2, i4));
                return s3q0.a;
            case 8:
                ((dgh) obj3).z((Clips) obj2);
                return s3q0.a;
            case 9:
                vuh vuhVar = (vuh) obj3;
                s6s0 s6s0Var = (s6s0) obj2;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    if (((Boolean) vuhVar.t.getValue()).booleanValue()) {
                        new w6s0(s6s0Var, null).e(b);
                    } else {
                        new e6s0(b, s6s0Var, null).c();
                    }
                }
                return s3q0.a;
            case 10:
                pcl pclVar = (pcl) obj3;
                dbg dbgVar = pclVar.b;
                NewsComment newsComment = (NewsComment) obj2;
                vqt vqtVar = (vqt) obj;
                ListDataSet<cbg> listDataSet = pclVar.a;
                String str = vqtVar.e;
                WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder = vqtVar.j;
                VKList<NewsComment> vKList = vqtVar.a;
                CommentThread commentThread = newsComment.L;
                if (commentThread != null) {
                    commentThread.h = str;
                }
                if (vKList.isEmpty()) {
                    i = -1;
                } else {
                    g5g.D(vKList, true, new a2a(newsComment, 4));
                    CommentThread commentThread2 = newsComment.L;
                    CommentThread commentThread3 = commentThread2 != null ? new CommentThread(commentThread2.b, commentThread2.c, commentThread2.d, commentThread2.e, new ArrayList(commentThread2.f), commentThread2.g, commentThread2.h, commentThread2.i, commentThread2.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
                    commentThread3.f.addAll(vKList);
                    newsComment.L = commentThread3;
                    ArrayList c = dbg.c(dbgVar, newsComment, vKList);
                    cbg cbgVar = (cbg) j5g.a0(c);
                    if (cbgVar != null) {
                        int a5 = pclVar.a(cbgVar.b);
                        if (a5 != -1) {
                            cbg c2 = listDataSet.c(a5);
                            iag iagVar = c2 != null ? c2.b : null;
                            int size = c.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                cbg cbgVar2 = (cbg) j5g.b0(i13, c);
                                if (cbgVar2 != null) {
                                    cbgVar2.b = iagVar;
                                }
                            }
                            listDataSet.y(a5 + 1, c);
                            i2 = c.size() + a5;
                        } else {
                            listDataSet.n0(c);
                            i2 = listDataSet.d.size();
                        }
                    } else {
                        i2 = -1;
                    }
                    i = i2 + 1;
                }
                int b2 = pclVar.b(newsComment);
                if (b2 > 0) {
                    listDataSet.A(b2);
                    i = b2;
                }
                CommentThread commentThread4 = newsComment.L;
                CommentThread commentThread5 = commentThread4 != null ? new CommentThread(commentThread4.b, commentThread4.c, commentThread4.d, commentThread4.e, new ArrayList(commentThread4.f), commentThread4.g, commentThread4.h, commentThread4.i, commentThread4.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
                commentThread5.g = wallNegativeRepliesPlaceholder;
                newsComment.L = commentThread5;
                String str2 = vqtVar.e;
                if ((str2 != null && str2.length() != 0) || wallNegativeRepliesPlaceholder != null) {
                    ArrayList arrayList2 = new ArrayList();
                    dbg.f(dbgVar, newsComment, wallNegativeRepliesPlaceholder, arrayList2);
                    if (i >= 0) {
                        listDataSet.y(i, arrayList2);
                    } else {
                        listDataSet.n0(arrayList2);
                    }
                }
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr = FragmentImpl.M;
                ((Transition) obj3).removeListener((Transition.TransitionListener) obj);
                ((n5i) obj2).invoke();
                return s3q0.a;
            case 12:
                com.vk.geo.impl.presentation.b bVar2 = (com.vk.geo.impl.presentation.b) obj3;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj2;
                CameraBounds cameraBounds = (CameraBounds) obj;
                if (bVar2.w.get() == null) {
                    return s3q0.a;
                }
                long j = bVar2.z.getValue(bVar2, com.vk.geo.impl.presentation.b.H[0]).a;
                float w0 = cameraBounds.w0((int) (j >> 32), (int) (j & 4294967295L));
                if (ref$FloatRef.element > w0) {
                    L.e("observeCameraBounds: zoom out");
                    com.vk.geo.impl.presentation.b.b0(bVar2, null, cameraBounds, 1);
                }
                ref$FloatRef.element = w0;
                return s3q0.a;
            case 13:
                ((GridHeaderMemCache) obj3).b = new Pair<>((String) obj2, (GridHeaderMemCache.HeaderCache.OwnerCache) obj);
                return s3q0.a;
            case 14:
                GroupSmallHorizontalListItemVh groupSmallHorizontalListItemVh = (GroupSmallHorizontalListItemVh) obj3;
                Group group = (Group) obj2;
                Context context = ((View) obj).getContext();
                if (((Boolean) groupSmallHorizontalListItemVh.g.getValue()).booleanValue() && groupSmallHorizontalListItemVh.g()) {
                    m3a m3aVar = groupSmallHorizontalListItemVh.i;
                    UserId userId = group.c;
                    UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                    m3aVar.j(new t8a.a(context, userId, uiTrackingScreen != null ? uiTrackingScreen.a : null, new ugm(groupSmallHorizontalListItemVh, i6)));
                } else {
                    groupSmallHorizontalListItemVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
                    FullSourceJoinApi.EntryServiceType entryServiceType = FullSourceJoinApi.EntryServiceType.COMMUNITY;
                    String h2 = FullSourceJoinApi.SourceType.COMPILATION_RECOM_RECENTLY_VISITED.h();
                    dha dhaVar = groupSmallHorizontalListItemVh.j;
                    if (dhaVar == null || (a2 = dhaVar.a()) == null || (a = a2.name()) == null) {
                        a = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_LIST);
                    }
                    groupSmallHorizontalListItemVh.h(context, group, entryServiceType, h2, a);
                }
                return s3q0.a;
            case 15:
                ((CountDownLatch) obj3).countDown();
                asu0.a.getClass();
                asu0.n().execute(new gq4(i7, (byte[]) obj, (kew) obj2));
                return s3q0.a;
            case 16:
                ((g5y) obj3).c().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), ((g5y.a) obj2).a.c(), 1, null));
                return s3q0.a;
            case 17:
                ((izs) obj3).invoke(((lvz) obj2).m);
                return s3q0.a;
            case 18:
                ((q8b0) ((vh40) obj3).k.getValue()).a((Playlist) obj2).b((Throwable) obj);
                return s3q0.a;
            case 19:
                NewsEntry newsEntry = (NewsEntry) obj3;
                va60 va60Var = (va60) obj2;
                NewsEntry newsEntry2 = (NewsEntry) obj;
                newsEntry.f = bwy.b.a;
                boolean z2 = newsEntry instanceof ClipsEntry;
                Object[] objArr = z2 && ((ClipsEntry) newsEntry).p && (newsEntry2 instanceof ClipsEntry) && ((ClipsEntry) newsEntry2).p;
                Object[] objArr2 = z2 && ((ClipsEntry) newsEntry).q && (newsEntry2 instanceof ClipsEntry) && ((ClipsEntry) newsEntry2).q;
                if (objArr != false || objArr2 != false) {
                    com.vk.dto.shortvideo.Clips clips = ((ClipsEntry) newsEntry2).j;
                    Integer valueOf = (clips == null || (list = clips.b) == null) ? null : Integer.valueOf(list.size());
                    int i14 = va60Var.a.T().a;
                    if (valueOf != null && valueOf.intValue() < i14) {
                        ce60Var = ce60.b;
                        qr.d(ce60Var, 138, newsEntry);
                        return s3q0.a;
                    }
                }
                if (newsEntry2 instanceof InterestingStoriesEntry) {
                    tdx tdxVar = ((InterestingStoriesEntry) newsEntry2).k;
                    if ((tdxVar != null ? tdxVar.e : null) == DiscoverBlockType.PHONE_BOOK_STORIES) {
                        StoriesFeatures storiesFeatures = StoriesFeatures.ST_PHONE_BOOK_STORIES;
                        storiesFeatures.getClass();
                        z = !com.vk.toggle.b.A.a(storiesFeatures);
                    }
                }
                if (z) {
                    ce60Var = ce60.b;
                    qr.d(ce60Var, 138, newsEntry);
                    return s3q0.a;
                }
                ce60.b.getClass();
                p870.f().e(135, new Pair(newsEntry, newsEntry2));
                return s3q0.a;
            case 20:
                final ew80 ew80Var = (ew80) obj3;
                izs izsVar = (izs) obj2;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new s(16, izsVar, ew80Var), f9t.z(ew80Var), new nsh(izsVar, 2));
                l370.n(g47Var, f9t.w(ew80Var), new pqz(12));
                g47Var.d(new xy() { // from class: xsna.ev80
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        ew80.this.b((OrderListAction) lj50Var);
                    }
                });
                return s3q0.a;
            case 21:
                return ((lz80) obj3).c.a((zjv.a) obj2);
            case 22:
                int i15 = PersonalBannerView.y;
                ((PersonalBannerView.a) obj3).b(((l1a0) obj2).d);
                return s3q0.a;
            case 23:
                a1y a1yVar = ((k5a0) obj3).a;
                int adapterPosition = ((k5a0.a) obj2).getAdapterPosition();
                m5a0 m5a0Var = (m5a0) a1yVar.c;
                HistoryAttach historyAttach = ((SimpleAttachesState) m5a0Var.w.b.P0()).f.get(adapterPosition).b;
                x9a0 x9a0Var = m5a0Var.x;
                (x9a0Var != null ? x9a0Var : null).h(m5a0Var.u, historyAttach);
                return Boolean.TRUE;
            case 24:
                ((com.vk.newsfeed.impl.presenters.b) obj3).h1((Bundle) obj2, (NewsEntry) obj);
                return s3q0.a;
            case 25:
                akc0 akc0Var = (akc0) obj2;
                PhotoAttachment photoAttachment = (PhotoAttachment) obj;
                v84 v84Var = (v84) ((LinkedHashMap) obj3).get(Integer.valueOf(photoAttachment.l.c));
                if (v84Var == null) {
                    return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
                }
                boolean z3 = v84Var.a;
                Photo photo = photoAttachment.l;
                boolean z4 = photo.r;
                if (z4 && !z3) {
                    return akc0Var.a(photo);
                }
                if (!z4 || !z3) {
                    return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
                }
                if (!v84Var.b || !photo.m) {
                    return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
                }
                LinkedHashSet E0 = j5g.E0(photo.x, j5g.S0(v84Var.c));
                if (!E0.isEmpty()) {
                    Iterator it = E0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Tag tag = (Tag) it.next();
                            if (tag != null && (aVar = tag.f.e) != null && (rnd0Var = aVar.b) != null && !rnd0Var.c) {
                                z = true;
                            }
                        }
                    }
                }
                return io.reactivex.rxjava3.core.q.T(Boolean.valueOf(z));
            case 26:
                Post post = (Post) obj3;
                Context context2 = (Context) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 104) {
                        UserProfile userProfile = new UserProfile();
                        Owner owner = post.o;
                        userProfile.c = owner.b;
                        userProfile.e = owner.c;
                        userProfile.h = owner.e;
                        iuc0 iuc0Var = iuc0.b;
                        iuc0.h0(fkq0.e(post.m), userProfile, context2);
                    } else {
                        j03.a.getClass();
                        j03.k(vKApiExecutionException);
                    }
                }
                return s3q0.a;
            case 27:
                RecommendedPlaylistState recommendedPlaylistState = (RecommendedPlaylistState) obj;
                return new RecommendedPlaylistState(recommendedPlaylistState.b, recommendedPlaylistState.c, recommendedPlaylistState.d, recommendedPlaylistState.e, recommendedPlaylistState.f, (PlayingState) obj3, recommendedPlaylistState.h, recommendedPlaylistState.i, recommendedPlaylistState.j, (String) obj2);
            case 28:
                List list2 = (List) ((mtk0) obj3).getValue();
                ((nvy) obj).e(list2.size(), new yfr(1, list2, new h3e0(i5)), new zfr(i9, list2, new i0r(18)), new jai(802480018, new agr(i9, (izs) obj2, list2), true));
                return s3q0.a;
            default:
                ((i0b0) obj3).invoke(jto0.b.a((jto0.b) obj2, null, null, (tho0) obj, null, false, null, false, false, false, false, null, false, false, false, null, false, 65531));
                return s3q0.a;
        }
    }
}
