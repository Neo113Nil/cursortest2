package xsna;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.vk.api.generated.audio.dto.AudioGetAudioPreviewUrlResponseDto;
import com.vk.api.generated.reports.dto.ReportsAddReasonDto;
import com.vk.api.generated.reports.dto.ReportsAddTypeDto;
import com.vk.api.generated.wall.dto.WallGetByIdExtendedResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.f;
import com.vk.clips.entrypoints.feature.a;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.reports.impl.ClipsReportFragment;
import com.vk.clips.reports.impl.data.ClipsReportReason;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.upload.vk.impl.rules.ClipsPublishRulesFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.scheduled_clips.d;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipTemplateItem;
import com.vk.voip.ui.BannedBottomSheet;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.chromium.net.NetError;
import xsna.asl0;
import xsna.dob;
import xsna.ir3;
import xsna.jw00;
import xsna.r6g0;
import xsna.spt;
import xsna.vyd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gr3(MusicDto musicDto, tp4 tp4Var) {
        this.b = 1;
        this.c = musicDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MusicTrack musicTrack;
        Collection<yg5> values;
        l08 l08Var;
        Pair pair;
        Pair pair2;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        StoryMusicInfo storyMusicInfo;
        ClipFeedTab.MusicTemplate musicTemplate;
        SdkClipAudioTemplate.a Ab;
        ClipsReportReason clipsReportReason;
        ReportsAddReasonDto reportsAddReasonDto;
        int i;
        xy2 a;
        int i2 = this.b;
        int i3 = 4;
        int i4 = 0;
        int i5 = 0;
        i4 = 0;
        r5 = null;
        String str = null;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                ((hr3) obj2).T(new ir3.c((List) obj));
                return s3q0.a;
            case 1:
                MusicDto musicDto = (MusicDto) obj2;
                AudioGetAudioPreviewUrlResponseDto audioGetAudioPreviewUrlResponseDto = (AudioGetAudioPreviewUrlResponseDto) obj;
                MusicTrack musicTrack2 = musicDto.m;
                if (musicTrack2 != null) {
                    String url = audioGetAudioPreviewUrlResponseDto.getUrl();
                    Integer d = audioGetAudioPreviewUrlResponseDto.d();
                    Integer e = audioGetAudioPreviewUrlResponseDto.e();
                    if (d != null && e != null) {
                        i4 = e.intValue() - d.intValue();
                    }
                    musicTrack = MusicTrack.zb(musicTrack2, 0, null, i4 / 1000, 0, url, false, null, null, false, false, null, null, null, NetError.ERR_WS_PROTOCOL_ERROR, 1048575);
                } else {
                    musicTrack = null;
                }
                return MusicDto.a(musicDto, true, musicTrack, null, 13311);
            case 2:
                com.vk.libvideo.autoplay.b bVar = (com.vk.libvideo.autoplay.b) obj2;
                Map<String, yg5> c = bVar.c();
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                if (b.C1208b.b() && c != null) {
                    c.size();
                }
                VideoPipStateHolder.a.getClass();
                VideoPipStateHolder.b();
                if (c != null && (values = c.values()) != null) {
                    for (yg5 yg5Var : values) {
                        yg5Var.stop();
                        yg5Var.release();
                    }
                }
                bVar.m.set(jgp.b);
                return s3q0.a;
            case 3:
                int i6 = BannedBottomSheet.R;
                ((BannedBottomSheet) obj2).dismiss();
                return s3q0.a;
            case 4:
                p08 p08Var = (p08) obj2;
                k08 k08Var = (k08) obj;
                if (k08Var != null && (l08Var = p08Var.a) != null) {
                    l08Var.b(k08Var);
                }
                return s3q0.a;
            case 5:
                ((sg8) obj2).b.a((fh8) ((it80) obj).a);
                return s3q0.a;
            case 6:
                float f = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj2).getPresenter();
                if (presenter != null) {
                    presenter.i4();
                }
                return s3q0.a;
            case 7:
                CatalogBasePaginatedListVh catalogBasePaginatedListVh = (CatalogBasePaginatedListVh) obj2;
                int intValue = ((Integer) obj).intValue();
                RecyclerPaginatedView recyclerPaginatedView = catalogBasePaginatedListVh.n;
                if (recyclerPaginatedView == null) {
                    recyclerPaginatedView = null;
                }
                RecyclerView.o layoutManager = recyclerPaginatedView.getRecyclerView().getLayoutManager();
                if (layoutManager instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    pair = new Pair(Integer.valueOf(gridLayoutManager.x.c(intValue)), Integer.valueOf(gridLayoutManager.s));
                } else {
                    if (layoutManager instanceof StaggeredGridLayoutManager) {
                        pair2 = new Pair(1, Integer.valueOf(((StaggeredGridLayoutManager) layoutManager).getSpanCount()));
                    } else if (layoutManager instanceof LinearLayoutManager) {
                        pair2 = new Pair(1, 1);
                    } else {
                        pair = new Pair(null, null);
                    }
                    pair = pair2;
                }
                Integer num = (Integer) pair.d();
                Integer num2 = (Integer) pair.g();
                RecyclerPaginatedView recyclerPaginatedView2 = catalogBasePaginatedListVh.n;
                return new s8a((recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null).getRecyclerView().getWidth(), num2, num);
            case 8:
                return io.reactivex.rxjava3.core.x.k(obj).l(new tt0((m7) obj2, 7)).s(5L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.a.a(), io.reactivex.rxjava3.core.x.k(obj));
            case 9:
                return ynb.i((ynb) obj2, (dob.e) obj);
            case 10:
                ((ClassifiedsCatalogBaseRootVh) obj2).q0((jw00.a) ((Map) obj).get(jw00.a.c));
                return s3q0.a;
            case 11:
                return new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.f((ViewGroup) obj, ((gqc) obj2).h);
            case 12:
                NewsEntry a2 = n9x0.a(((axc) obj2).b, (WallGetByIdExtendedResponseDto) obj);
                if (a2 != null) {
                    p870.f().e(102, a2);
                }
                return s3q0.a;
            case 13:
                nad nadVar = (nad) obj2;
                VkCell vkCell = nadVar.i;
                if (vkCell == null) {
                    vkCell = null;
                }
                bwt0.p0(vkCell, false);
                VkCell vkCell2 = nadVar.j;
                if (vkCell2 == null) {
                    vkCell2 = null;
                }
                bwt0.p0(vkCell2, false);
                VkCell vkCell3 = nadVar.k;
                if (vkCell3 == null) {
                    vkCell3 = null;
                }
                bwt0.p0(vkCell3, false);
                CircularProgressView circularProgressView = nadVar.l;
                bwt0.p0(circularProgressView != null ? circularProgressView : null, true);
                return s3q0.a;
            case 14:
                ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) obj2;
                spt.a aVar = (spt.a) obj;
                return ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, ClipsEditorMusicTrack.zb(clipsEditorMusicInfo.b, 0, 0, aVar.a, 2015), aVar.a, 0, 0, 0, null, aVar.b, 1980);
            case 15:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj2;
                com.vk.clips.entrypoints.feature.a aVar2 = (com.vk.clips.entrypoints.feature.a) obj;
                int i7 = ClipsEntryPointsFragment.i0;
                if (aVar2 instanceof a.C0582a) {
                    clipsEntryPointsFragment.finish();
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<ClipsProcessedItem> list = ((a.b) aVar2).a;
                    ClipsEntryPointsParams jo = clipsEntryPointsFragment.jo();
                    if (jo == null || (creationEntryPoint = jo.b) == null) {
                        creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
                    }
                    MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint2 = creationEntryPoint;
                    ClipsEntryPointsParams jo2 = clipsEntryPointsFragment.jo();
                    ClipsEditorMusicInfo a3 = (jo2 == null || (storyMusicInfo = jo2.c) == null) ? null : hxd.a(storyMusicInfo);
                    ClipsEntryPointsParams jo3 = clipsEntryPointsFragment.jo();
                    vyd.b bVar2 = new vyd.b(list, creationEntryPoint2, a3, jo3 != null ? jo3.d : null, null);
                    dhr0.a.getClass();
                    ((vyd) clipsEntryPointsFragment.S.getValue()).e(clipsEntryPointsFragment.kn(), bVar2, new vyd.c(dhr0.u().c, 12, 13), new ClipsEditorSessionParams(null, !clipsEntryPointsFragment.ho(), !clipsEntryPointsFragment.ho(), !clipsEntryPointsFragment.ho(), null, false, 49, null));
                }
                return s3q0.a;
            case 16:
                ((com.vk.clips.attachments.impl.publish.geolocation.presentation.e) obj2).T(new f.b((List) obj));
                return s3q0.a;
            case 17:
                ule uleVar = (ule) obj2;
                SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) obj;
                tle tleVar = uleVar.b;
                SdkClipAudioTemplate a5 = sdkClipVideoFile.a5();
                if (a5 != null && (Ab = a5.Ab()) != null) {
                    tleVar.c(MobileOfficialAppsClipsStat$TypeClipTemplateItem.EventType.CHOOSE_TEMPLATE, Ab);
                }
                wzs<View, m7f, s3q0> wzsVar = uleVar.d;
                xle xleVar = uleVar.a;
                ClipVideoFile z = k15.z(sdkClipVideoFile);
                String a1 = sdkClipVideoFile.a1();
                ClipFeedTab clipFeedTab = uleVar.c;
                ClipFeedTab.CatalogClip.MusicTemplateCatalogClip musicTemplateCatalogClip = clipFeedTab instanceof ClipFeedTab.CatalogClip.MusicTemplateCatalogClip ? (ClipFeedTab.CatalogClip.MusicTemplateCatalogClip) clipFeedTab : null;
                if (musicTemplateCatalogClip != null && (musicTemplate = musicTemplateCatalogClip.f) != null) {
                    str = musicTemplate.c;
                }
                wzsVar.invoke(xleVar, new m7f(z, a1, str));
                return s3q0.a;
            case 18:
                VkTopBar vkTopBar = (VkTopBar) obj2;
                int i8 = ClipsPublishRulesFragment.N;
                vkTopBar.setContentDescription(vkTopBar.getContext().getString(R.string.clip_rules_title));
                return s3q0.a;
            case 19:
                ClipsReportFragment clipsReportFragment = (ClipsReportFragment) obj2;
                s6g0 s6g0Var = clipsReportFragment.T;
                m1f P0 = clipsReportFragment.S.P0();
                if (P0 != null && (clipsReportReason = P0.b) != null) {
                    Bundle arguments = clipsReportFragment.getArguments();
                    Serializable serializable = arguments != null ? arguments.getSerializable("type") : null;
                    ReportsAddTypeDto reportsAddTypeDto = serializable instanceof ReportsAddTypeDto ? (ReportsAddTypeDto) serializable : null;
                    if (reportsAddTypeDto != null) {
                        ReportsAddReasonDto[] values2 = ReportsAddReasonDto.values();
                        int length = values2.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                ReportsAddReasonDto reportsAddReasonDto2 = values2[i9];
                                if (reportsAddReasonDto2.j() == clipsReportReason.h()) {
                                    reportsAddReasonDto = reportsAddReasonDto2;
                                } else {
                                    i9++;
                                }
                            } else {
                                reportsAddReasonDto = null;
                            }
                        }
                        Bundle arguments2 = clipsReportFragment.getArguments();
                        UserId userId = arguments2 != null ? (UserId) arguments2.getParcelable("clip_owner_id") : null;
                        Bundle arguments3 = clipsReportFragment.getArguments();
                        Integer valueOf = arguments3 != null ? Integer.valueOf(arguments3.getInt("clip_video_id")) : null;
                        Bundle arguments4 = clipsReportFragment.getArguments();
                        Integer valueOf2 = arguments4 != null ? Integer.valueOf(arguments4.getInt("item_id")) : null;
                        Bundle arguments5 = clipsReportFragment.getArguments();
                        boolean z2 = arguments5 != null ? arguments5.getBoolean("is_original_audio") : false;
                        int i10 = ClipsReportFragment.b.$EnumSwitchMapping$0[reportsAddTypeDto.ordinal()];
                        if (i10 != 1) {
                            if (i10 == 2) {
                                i = 3;
                                a = r6g0.a.a(s6g0Var, null, reportsAddTypeDto, reportsAddReasonDto, userId, valueOf2, null, 32737);
                            } else if ((i10 == 3 || i10 == 4) && userId != null) {
                                i = 3;
                                a = r6g0.a.a(s6g0Var, null, reportsAddTypeDto, reportsAddReasonDto, userId, null, null, 32753);
                            }
                            dz2 x = yfb.x(a);
                            ahn.D(x);
                            clipsReportFragment.fo(new io.reactivex.rxjava3.internal.operators.maybe.h(new io.reactivex.rxjava3.internal.operators.single.c0(bug0.e(rsg0.w0(x), clipsReportFragment.requireContext(), null, 6)), new s7(new jb5(clipsReportFragment, i), 8)).subscribe());
                        } else {
                            i = 3;
                            if (z2) {
                                cvk.u(R.string.report_send_success, true);
                                clipsReportFragment.finish();
                            } else if (userId != null && valueOf != null) {
                                a = r6g0.a.a(s6g0Var, null, reportsAddTypeDto, reportsAddReasonDto, userId, valueOf, null, 32737);
                                dz2 x2 = yfb.x(a);
                                ahn.D(x2);
                                clipsReportFragment.fo(new io.reactivex.rxjava3.internal.operators.maybe.h(new io.reactivex.rxjava3.internal.operators.single.c0(bug0.e(rsg0.w0(x2), clipsReportFragment.requireContext(), null, 6)), new s7(new jb5(clipsReportFragment, i), 8)).subscribe());
                            }
                        }
                    }
                }
                return s3q0.a;
            case 20:
                return ((o6f) obj2).d.b((z7f) obj);
            case 21:
                rg50 rg50Var = (rg50) obj2;
                ((Long) obj).longValue();
                int intValue2 = rg50Var.getIntValue();
                rg50Var.C(intValue2 + 1);
                return Integer.valueOf(intValue2);
            case 22:
                ((etv0) obj).b(false);
                ((View) obj2).callOnClick();
                return s3q0.a;
            case 23:
                c2h c2hVar = (c2h) obj2;
                int i11 = c2h.p1;
                Bundle bundle = new Bundle();
                bundle.putBoolean("IS_DESCRIPTION_CHANGED", true);
                c2hVar.getParentFragmentManager().k0(bundle, "RESULT_KEY");
                c2hVar.Yn();
                c2hVar.dismiss();
                return s3q0.a;
            case 24:
                ((ieh) obj2).I.u0();
                return s3q0.a;
            case 25:
                ukh ukhVar = (ukh) obj2;
                MusicTrack musicTrack3 = (MusicTrack) obj;
                xkb0 xkb0Var = (xkb0) ukhVar.t;
                if (xkb0Var != null) {
                    zih.a(ukhVar.E, xkb0Var, new pgb0(musicTrack3, xkb0Var), null, 12);
                }
                return s3q0.a;
            case 26:
                int i12 = CommunityProfileFragment.k0;
                return Boolean.valueOf(fkq0.a(((asl0.a) obj).b).equals(fkq0.a(((CommunityProfileFragment) obj2).ho())));
            case 27:
                ((arh) obj2).h.invoke(new d.o.a((Throwable) obj));
                return s3q0.a;
            case 28:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj2;
                uyh uyhVar = (uyh) obj;
                ComposeView composeView = communityReviewsFragment.f0;
                if (composeView != null) {
                    composeView.setContent(kai.b(-1770375322, new xf4(i3, uyhVar, communityReviewsFragment)));
                }
                return s3q0.a;
            default:
                com.vk.profile.core.scheduled_clips.c cVar = (com.vk.profile.core.scheduled_clips.c) obj2;
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (Object obj3 : list2) {
                    int i13 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    arrayList.add(new o0i((ClipVideoFile) obj3, Integer.valueOf(i5)));
                    i5 = i13;
                }
                cVar.T(new d.c(arrayList));
                return s3q0.a;
        }
    }

    public /* synthetic */ gr3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ gr3(m7 m7Var) {
        this.b = 8;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = m7Var;
    }
}
