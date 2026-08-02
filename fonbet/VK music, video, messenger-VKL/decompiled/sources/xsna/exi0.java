package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.vk.api.generated.catalog.dto.CatalogBlockDataTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogDiscoverDataDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.core.fragments.FragmentImpl;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.ecomm.catalog.api.catalog.MarketCatalogSectionId;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.sharing.core.view.k;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.superapp.dto.ListData;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.minimizable.announce.author.VideoAnnounceAuthorView;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerArguments;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragment;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragmentInternalComponent;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import one.video.ad.ux.ShoppableAdView;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.ljk0;
import xsna.lyr0;
import xsna.xjl0;
import xsna.yat0;
import xsna.yfs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class exi0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ exi0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        if ((r2 != null ? r2.e : null) == com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section.SectionType.ContinueWatch) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Photo photo;
        WebStoryBox webStoryBox;
        tfs0 tfs0Var;
        List<String> f3;
        List A;
        List e;
        int i = this.b;
        boolean z = false;
        z = false;
        final boolean z2 = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                SessionRoomId sessionRoomId = (SessionRoomId) obj2;
                f.a.b bVar = (f.a.b) obj;
                if (bVar.c && !epx.f(bVar.a, sessionRoomId)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                ((ShoppableAdView) obj2).e.setTranslationX(((Float) obj).floatValue());
                return s3q0.a;
            case 2:
                cvj0 cvj0Var = (cvj0) obj2;
                Tag tag = (Tag) obj;
                PhotoAttachment photoAttachment = (PhotoAttachment) cvj0Var.C;
                UserId userId = (photoAttachment == null || (photo = photoAttachment.l) == null) ? null : photo.e;
                if (userId == null || !((u4h) cvj0Var.L.getValue()).d(userId)) {
                    zzq zzqVar = (zzq) cvj0Var.J.getValue();
                    int i2 = tag.b;
                    long j = tag.d.b;
                    String str = cvj0Var.v;
                    FeedGoodsPhotoHolder.a aVar = cvj0Var.I;
                    Integer valueOf = aVar != null ? Integer.valueOf(aVar.m2()) : null;
                    zzqVar.getClass();
                    zzq.b(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.PIN, i2, j, str, valueOf, null);
                    cvj0Var.f7(tag, (PhotoAttachment) cvj0Var.C);
                } else {
                    ((c1c0) cvj0Var.M.getValue()).Y(cvj0Var.itemView.getContext(), tag, new h4(16, cvj0Var, tag), new com.vk.newsfeed.common.recycler.holders.attachments.a(z ? 1 : 0, cvj0Var, tag));
                }
                return s3q0.a;
            case 3:
                pjk0 pjk0Var = (pjk0) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                pjk0Var.i = ljk0.d.a;
                if (!pjk0Var.f) {
                    pjk0Var.b(cVar);
                }
                return s3q0.a;
            case 4:
                ((tdu) obj).b(1.0f - ((vak0) ((ofl0) obj2).h).getFloatValue());
                return s3q0.a;
            case 5:
                StorefrontAlbumsFragment storefrontAlbumsFragment = (StorefrontAlbumsFragment) obj2;
                xjl0 xjl0Var = (xjl0) obj;
                if (xjl0Var instanceof xjl0.b) {
                    ikl0 ikl0Var = (ikl0) storefrontAlbumsFragment.Q.getValue();
                    xjl0.b bVar2 = (xjl0.b) xjl0Var;
                    wjl0 wjl0Var = ikl0Var.c;
                    UserId userId2 = ikl0Var.a;
                    FragmentImpl fragmentImpl = ikl0Var.b;
                    if (bVar2 instanceof xjl0.b.c) {
                        ((vrq) wjl0Var.e.getValue()).a(fragmentImpl.requireContext());
                    } else if (bVar2 instanceof xjl0.b.d) {
                        fy9.a((fy9) wjl0Var.d.getValue(), fragmentImpl.requireContext(), userId2, null, null, 12);
                    } else if (bVar2 instanceof xjl0.b.C4010b) {
                        fragmentImpl.finish();
                    } else if (bVar2 instanceof xjl0.b.a) {
                        xjl0.b.a aVar2 = (xjl0.b.a) bVar2;
                        ((dhc) wjl0Var.f.getValue()).d(fragmentImpl.requireContext(), new ngc(null, MarketCatalogSectionId.ALBUM.h(), userId2, null, null, null, null, null, null, null, new MarketAnalyticsParams(new MarketUtmData(null, null, null, null, null, null, null, 56, null), MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ALBUMS, CommonMarketStat$TypeRefSource.COMMUNITY_GROUP_GOODS, null, null, null, null, false, null, false, false, null, false, 8056, null), Integer.valueOf(aVar2.a), aVar2.b, aVar2.c, 3211235));
                    } else if (bVar2 instanceof xjl0.b.e) {
                        ((q9h) wjl0Var.g.getValue()).c(fragmentImpl.requireContext(), userId2);
                    } else {
                        if (!(bVar2 instanceof xjl0.b.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((dhc) wjl0Var.f.getValue()).d(fragmentImpl.requireContext(), new ngc(null, MarketCatalogSectionId.VIEWED_PRODUCTS.h(), userId2, null, null, null, null, null, null, null, new MarketAnalyticsParams(new MarketUtmData(null, null, null, null, null, null, null, 56, null), MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM_ALBUM, CommonMarketStat$TypeRefSource.COMMUNITY_GROUP_GOODS, null, null, null, null, false, null, false, false, null, false, 8056, null), null, false, null, 3604451));
                    }
                } else {
                    qcy<Object>[] qcyVarArr = StorefrontAlbumsFragment.R;
                    if (!(xjl0Var instanceof xjl0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h03.b(((xjl0.a) xjl0Var).a);
                }
                return s3q0.a;
            case 6:
                StoryGalleryActivity storyGalleryActivity = (StoryGalleryActivity) obj2;
                b.d dVar = (b.d) obj;
                StoryCameraParams storyCameraParams = storyGalleryActivity.z;
                if (storyCameraParams != null && (webStoryBox = storyCameraParams.u) != null && webStoryBox.Db()) {
                    nf9 nf9Var = nf9.b;
                    StoryCameraParams storyCameraParams2 = storyGalleryActivity.z;
                    nf9.n(dVar, storyCameraParams2 != null ? storyCameraParams2.Y : null);
                }
                return s3q0.a;
            case 7:
                List<y0f0> list = (List) obj2;
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    for (y0f0 y0f0Var : list) {
                        if (y0f0Var.a == ((y0f0) optional.get()).a) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                y0f0Var = (y0f0) j5g.Y(list);
                List<y0f0> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (y0f0 y0f0Var2 : list2) {
                    arrayList.add(new vze0(y0f0Var2, epx.f(y0f0Var, y0f0Var2)));
                }
                return arrayList;
            case 8:
                Object obj3 = ((fch) obj2).c;
                efm0 efm0Var = ((ffm0) obj).c;
                String str2 = efm0Var.a;
                String str3 = efm0Var.b;
                String str4 = efm0Var.c;
                ArrayList<lem0> arrayList2 = efm0Var.d;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                for (lem0 lem0Var : arrayList2) {
                    String str5 = lem0Var.a;
                    ArrayList<nem0> arrayList4 = lem0Var.b;
                    ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                    for (nem0 nem0Var : arrayList4) {
                        arrayList5.add(new wdm0(nem0Var.a, nem0Var.b, nem0Var.c));
                    }
                    arrayList3.add(new vdm0(str5, arrayList5));
                }
                return new c3m0(str2, str3, str4, arrayList3);
            case 9:
                com.vk.superapp.ui.a aVar3 = (com.vk.superapp.ui.a) obj2;
                ArrayList r1 = aVar3.r1(true);
                aVar3.A = r1;
                ListData.Cause cause = ListData.Cause.DEFAULT;
                aVar3.J.getClass();
                aVar3.b.so(new ListData(r1, cause, 24));
                return s3q0.a;
            case 10:
                qvn0 qvn0Var = (qvn0) obj2;
                List<GroupsGroupFullDto> e2 = ((GroupsGetObjectExtendedResponseDto) obj).e();
                ArrayList arrayList6 = new ArrayList(c5g.u(e2, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : e2) {
                    qvn0Var.getClass();
                    UserId e3 = !fkq0.b(groupsGroupFullDto.P0()) ? fkq0.e(groupsGroupFullDto.P0()) : groupsGroupFullDto.P0();
                    String y1 = groupsGroupFullDto.y1();
                    String str6 = "";
                    if (y1 == null) {
                        y1 = "";
                    }
                    String V1 = groupsGroupFullDto.V1();
                    if (V1 == null) {
                        String X1 = groupsGroupFullDto.X1();
                        if (X1 != null) {
                            str6 = X1;
                        }
                    } else {
                        str6 = V1;
                    }
                    arrayList6.add(new sh00(e3, y1, str6));
                }
                return arrayList6;
            case 11:
                k.a aVar4 = ((com.vk.sharing.core.view.k) obj2).d;
                if (aVar4 != null) {
                    aVar4.a();
                }
                return s3q0.a;
            case 12:
                ((Boolean) obj).booleanValue();
                ((o5p0) obj2).c.invoke();
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((x8h0) obj).getClass().equals((Class) obj2));
            case 14:
                ((g7q0) obj2).t(true);
                return s3q0.a;
            case 15:
                mgq0 mgq0Var = (mgq0) obj2;
                int i3 = mgq0Var.g;
                int x0 = mgq0Var.x0((UserItem) obj);
                mgq0Var.g = x0;
                mgq0Var.c.invoke(mgq0Var.f, Integer.valueOf(x0));
                if (mgq0Var.g != i3) {
                    if (i3 != -1) {
                        mgq0Var.notifyItemChanged(i3);
                    }
                    mgq0Var.notifyItemChanged(mgq0Var.g);
                }
                return s3q0.a;
            case 16:
                return fai.g(((tuq0) obj2).b, (MusicTrack) obj).toString();
            case 17:
                return new Pair((d5w) obj2, (ProfilesInfo) obj);
            case 18:
                Toast.makeText(((u8r0) obj2).a.a.requireContext(), R.string.vk_common_network_error, 0).show();
                return s3q0.a;
            case 19:
                ((u5p0) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 20:
                int i4 = VideoAnnounceAuthorView.A;
                ((rrn0) obj2).invoke();
                return s3q0.a;
            case 21:
                com.vk.video.ui.discovery.catalog.c cVar2 = (com.vk.video.ui.discovery.catalog.c) obj2;
                CatalogSectionResponseObjectDto catalogSectionResponseObjectDto = (CatalogSectionResponseObjectDto) obj;
                List<VideoVideoFullDto> V2 = catalogSectionResponseObjectDto.V2();
                List<UsersUserFullDto> X12 = catalogSectionResponseObjectDto.X1();
                List<GroupsGroupFullDto> K0 = catalogSectionResponseObjectDto.K0();
                CatalogSectionDto E2 = catalogSectionResponseObjectDto.E2();
                if (E2 != null) {
                    List<CatalogBlockDto> g = E2.g();
                    CatalogBlockDto catalogBlockDto = g != null ? (CatalogBlockDto) j5g.a0(g) : null;
                    CatalogDiscoverDataDto v0 = catalogBlockDto != null ? catalogBlockDto.v0() : null;
                    String e4 = v0 != null ? v0.e() : null;
                    List<UxPoll> c = cVar2.c(v0);
                    boolean a = cVar2.a(c, v0 != null ? epx.f(v0.d(), Boolean.TRUE) : false);
                    if (catalogBlockDto != null) {
                        if (catalogBlockDto.l0() != CatalogBlockDataTypeDto.VIDEOS || catalogBlockDto.n1().f() != CatalogLayoutDto.NameDto.LARGE_LIST) {
                            catalogBlockDto = null;
                        }
                        if (catalogBlockDto != null && (f3 = catalogBlockDto.f3()) != null && (A = rli0.A(rli0.t(rli0.t(new i5g(f3), new hxm0(8)), new m2l0(V2, 17)))) != null && (e = ums0.e(ums0.a, A, X12, K0, false, 52)) != null) {
                            String id = E2.getId();
                            String title = E2.getTitle();
                            String l = E2.l();
                            List list3 = !e.isEmpty() ? e : null;
                            tfs0Var = new tfs0(new VideoDiscoveryCatalogRepository$Section(id, title, l, list3 != null ? com.vk.dto.video.a.a(list3) : null, com.vk.video.ui.discovery.catalog.c.d(e), a, e4, c));
                            if (tfs0Var != null) {
                                return tfs0Var;
                            }
                        }
                    }
                    tfs0Var = null;
                    if (tfs0Var != null) {
                    }
                }
                return new tfs0(null);
            case 22:
                ((io.reactivex.rxjava3.core.y) obj2).onSuccess((rbt0) obj);
                return s3q0.a;
            case 23:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).C(c.m0.b);
                return s3q0.a;
            case 24:
                ((io.reactivex.rxjava3.core.r) obj2).onNext((List) obj);
                return s3q0.a;
            case 25:
                final yat0 yat0Var = (yat0) obj2;
                yfs0 yfs0Var = (yfs0) obj;
                if (yfs0Var instanceof yfs0.b) {
                    yat0Var.getClass();
                    return io.reactivex.rxjava3.core.q.T(rl3.I(new AboutVideoItem[]{gsi0.b().c ? null : AboutVideoItem.k.b, AboutVideoItem.x.b}));
                }
                if (!(yfs0Var instanceof yfs0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                final yfs0.a aVar5 = (yfs0.a) yfs0Var;
                yat0Var.getClass();
                if (fxc0.B().J().f1().d) {
                    VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = aVar5.b;
                    break;
                }
                z2 = false;
                return yat0Var.g.s0(new awi0(new k7l0((!aVar5.e ? io.reactivex.rxjava3.core.q.T(new lyr0.a.C3311a(false)) : yat0Var.b.b()).s0(new osk0(new xat0(yat0Var, aVar5, new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.wat0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        DonutVideoCardSource donutVideoCardSource;
                        List list4;
                        List list5;
                        String a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY);
                        yfs0.a aVar6 = yfs0.a.this;
                        int i5 = aVar6.g;
                        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section2 = aVar6.b;
                        yat0 yat0Var2 = yat0Var;
                        boolean z3 = !yat0Var2.d && gsi0.b().d;
                        VideoDiscoveryCatalogRepository$Section.SectionType sectionType = videoDiscoveryCatalogRepository$Section2 != null ? videoDiscoveryCatalogRepository$Section2.e : null;
                        int i6 = sectionType == null ? -1 : yat0.a.$EnumSwitchMapping$0[sectionType.ordinal()];
                        AboutVideoItem.SimilarVideoRedesign.Style style = (i6 == 1 || i6 == 2) ? AboutVideoItem.SimilarVideoRedesign.Style.NORMAL : (i6 == 3 && z3) ? AboutVideoItem.SimilarVideoRedesign.Style.COMPACT_NO_OWNER : (i6 == 4 && z3) ? AboutVideoItem.SimilarVideoRedesign.Style.COMPACT : AboutVideoItem.SimilarVideoRedesign.Style.NORMAL;
                        int i7 = yat0.a.$EnumSwitchMapping$1[style.ordinal()];
                        if (i7 == 1) {
                            donutVideoCardSource = DonutVideoCardSource.LARGE_CARD;
                        } else if (i7 == 2) {
                            donutVideoCardSource = DonutVideoCardSource.SMALL_CARD;
                        } else {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            donutVideoCardSource = DonutVideoCardSource.SMALL_CARD;
                        }
                        VideoRecommendationVideosType videoRecommendationVideosType = aVar6.d;
                        VideoRecommendationVideosType videoRecommendationVideosType2 = VideoRecommendationVideosType.OFFLINE;
                        boolean z4 = z2;
                        if (videoRecommendationVideosType == videoRecommendationVideosType2) {
                            tat0 tat0Var = yat0Var2.i;
                            if (videoDiscoveryCatalogRepository$Section2 == null || (list5 = videoDiscoveryCatalogRepository$Section2.d) == null) {
                                list5 = EmptyList.b;
                            }
                            return tat0Var.b(list5, i5, a2, style, donutVideoCardSource, z4);
                        }
                        tat0 tat0Var2 = yat0Var2.i;
                        if (videoDiscoveryCatalogRepository$Section2 == null || (list4 = videoDiscoveryCatalogRepository$Section2.d) == null) {
                            list4 = EmptyList.b;
                        }
                        return tat0.c(tat0Var2, list4, i5, videoRecommendationVideosType, a2, style, donutVideoCardSource, z4, null, 128);
                    }
                }), z2), 14)), 21), 9));
            case 26:
                return VideoRelatedVideosFragment.ho((VideoRelatedVideosFragment) obj2, (mbt0) obj);
            case 27:
                qcy<Object>[] qcyVarArr2 = VideoViewerFragment.P;
                final VideoViewerFragmentInternalComponent videoViewerFragmentInternalComponent = (VideoViewerFragmentInternalComponent) ((VideoViewerFragment) obj2).N.getValue();
                videoViewerFragmentInternalComponent.getClass();
                return new cn50(up2.d(new y8q(4, (gzs) obj), new wb0() { // from class: xsna.mrt0
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        VideoViewerFragmentInternalComponent videoViewerFragmentInternalComponent2 = VideoViewerFragmentInternalComponent.this;
                        VideoViewerArguments videoViewerArguments = videoViewerFragmentInternalComponent2.a.a;
                        Context context = videoViewerFragmentInternalComponent2.b.a;
                        nwy nwyVar = videoViewerFragmentInternalComponent2.c;
                        qcy<Object> qcyVar = VideoViewerFragmentInternalComponent.f[0];
                        return new urt0(videoViewerArguments, context, (vrt0) nwyVar.c(), sj50Var);
                    }
                }, svj.b));
            case 28:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i5 = p0d.l;
                eul0 eul0Var = ((uxt0) obj2).e0;
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                eul0Var.getClass();
                View inflate = from.inflate(R.layout.fullscreen_clip_item_controls, viewGroup, false);
                inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return new p0d(inflate);
            default:
                ((MusicTrack) obj2).P = true;
                return s3q0.a;
        }
    }
}
