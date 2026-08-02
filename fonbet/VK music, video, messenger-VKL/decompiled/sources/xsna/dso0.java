package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogBlockDataTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogDiscoverDataDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vk.clips.design.view.component.video.preview.UploadBadgeDesignIconType;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.ImageStatus;
import com.vk.dto.common.gift.ImageStatusPack;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.Gift;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.fullscreenvideo.design.view.top.TopControlsView;
import com.vk.libvideo.ad.MyTargetAdLoadingState;
import com.vk.libvideo.api.pip2.VideoPipModeAction;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivityWithPip;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.gifts.GiftModalButtonType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.video.ui.discovery.minimizable.dialog.about.a;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a6t0;
import xsna.bex0;
import xsna.c8d;
import xsna.i3t0;
import xsna.inq0;
import xsna.m7z;
import xsna.mno0;
import xsna.ppr0;
import xsna.rmw;
import xsna.sst0;
import xsna.tj50;
import xsna.tlo0;
import xsna.wpr0;
import xsna.wwi0;
import xsna.xha0;
import xsna.xn50;
import xsna.y9q0;
import xsna.ypq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dso0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dso0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x0a83, code lost:
    
        if (((xsna.wxr0) r0).a.C2() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0b07, code lost:
    
        if (xsna.brm0.B(r0, java.lang.String.valueOf(r3.b), false) != true) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0b3a, code lost:
    
        if ((r0 instanceof xsna.fwr0) != false) goto L256;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0ac8  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.vk.libvideo.design.compose.base.preview.PreviewViewState$DurationBadge$IconState] */
    /* JADX WARN: Type inference failed for: r13v40, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r13v46 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        UploadBadgeDesignIconType uploadBadgeDesignIconType;
        ImageView view;
        boolean f;
        Owner s;
        VideoFile videoFile;
        Object obj2;
        String str;
        Context mo2getContext;
        ArrayList arrayList;
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section;
        List<CatalogSectionDto> j;
        List<String> list;
        int i = this.b;
        int i2 = 12;
        int i3 = 6;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Thumb thumb = (Thumb) obj3;
                w9y w9yVar = (w9y) obj;
                w9yVar.e(thumb.b, "id");
                w9yVar.c(Integer.valueOf(thumb.c), "width");
                w9yVar.c(Integer.valueOf(thumb.d), "height");
                JSONArray jSONArray = new JSONArray();
                SparseArray<Uri> sparseArray = thumb.e;
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    w9y w9yVar2 = new w9y();
                    w9yVar2.c(Integer.valueOf(sparseArray.keyAt(i4)), "width");
                    w9yVar2.e(sparseArray.valueAt(i4), "src");
                    s3q0 s3q0Var = s3q0.a;
                    jSONArray.put(w9yVar2.a);
                }
                w9yVar.e(jSONArray, "sizes");
                return s3q0.a;
            case 1:
                ((TopControlsView) obj3).n.a = (Rect) obj;
                return s3q0.a;
            case 2:
                m6r0 m6r0Var = (m6r0) obj3;
                ww50 ww50Var = (ww50) obj;
                if (m6r0Var != null) {
                    i0q0.d(50L, new df6(6, ww50Var.b, m6r0Var));
                }
                return s3q0.a;
            case 3:
                v9q0 v9q0Var = (v9q0) obj;
                com.vk.clips.design.view.component.video.preview.b bVar = ((y9q0) obj3).b;
                String str2 = v9q0Var.a;
                int i5 = v9q0Var.b;
                int i6 = v9q0Var.c;
                String str3 = v9q0Var.d;
                int i7 = y9q0.a.$EnumSwitchMapping$0[v9q0Var.e.ordinal()];
                if (i7 == 1) {
                    uploadBadgeDesignIconType = UploadBadgeDesignIconType.PROGRESS;
                } else if (i7 == 2) {
                    uploadBadgeDesignIconType = UploadBadgeDesignIconType.CANCEL;
                } else if (i7 == 3) {
                    uploadBadgeDesignIconType = UploadBadgeDesignIconType.CHECK;
                } else {
                    if (i7 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uploadBadgeDesignIconType = UploadBadgeDesignIconType.RETRY;
                }
                UploadBadgeDesignIconType uploadBadgeDesignIconType2 = uploadBadgeDesignIconType;
                boolean z = v9q0Var.f;
                boolean z2 = v9q0Var.g;
                boolean z3 = v9q0Var.h;
                boolean z4 = v9q0Var.i;
                boolean z5 = v9q0Var.j;
                w9q0 w9q0Var = new w9q0(str2, i5, i6, str3, uploadBadgeDesignIconType2, z, z2, z3, z4, z5);
                ClipRectanglePreview clipRectanglePreview = bVar.b;
                if (z && !z5) {
                    if (clipRectanglePreview.getVisibility() != 0 && !bVar.f) {
                        bVar.f = true;
                        bVar.setVisibility(0);
                        clipRectanglePreview.setVisibility(0);
                        Animation loadAnimation = AnimationUtils.loadAnimation(bVar.getContext(), R.anim.upload_badge_show);
                        d3m.h(loadAnimation, new wrl0(bVar, i2));
                        clipRectanglePreview.startAnimation(loadAnimation);
                    }
                    if (!bVar.e && str2 != null) {
                        cno<ImageView> cnoVar = bVar.d;
                        if (cnoVar != null && (view = cnoVar.getView()) != null) {
                            if (!view.isLaidOut() || view.isLayoutRequested()) {
                                view.addOnLayoutChangeListener(new s9q0(bVar, w9q0Var));
                            } else {
                                cno<ImageView> cnoVar2 = bVar.d;
                                if (cnoVar2 != null) {
                                    VKImageController.a.a(cnoVar2, str2);
                                }
                            }
                        }
                        bVar.e = true;
                    }
                    clipRectanglePreview.setPrimaryLabel(new ClipRectanglePreview.PreviewItem.b(oq.d(tlo0.Companion, z2 ? bVar.getContext().getString(R.string.clip_upload_done) : z3 ? bVar.getContext().getString(R.string.clip_upload_canceled) : z4 ? bVar.getContext().getString(R.string.clip_upload_error) : i5 > 0 ? bVar.getContext().getString(R.string.clip_upload_progress, Integer.valueOf(i5)) : bVar.getContext().getString(R.string.clip_upload_soon)), 2, new z7g(R.color.vk_white), null, null, 248));
                    clipRectanglePreview.setMainActionUpload(z2 ? null : new ClipRectanglePreview.PreviewItem.c(i5, new gko(R.drawable.vk_icon_cancel_24), new z7g(R.color.vk_white), new z7g(R.color.vk_black_alpha35), new z7g(R.color.vk_white), null, new wt30(bVar, 28), 32));
                    clipRectanglePreview.setMainIcon(z2 ? new ClipRectanglePreview.PreviewItem.Icon(new gko(R.drawable.vk_icon_done_24), new z7g(R.color.vk_white), null, 58) : null);
                } else if (!z) {
                    bVar.a();
                }
                return s3q0.a;
            case 4:
                boq0 boq0Var = (boq0) obj3;
                bwr0 bwr0Var = (bwr0) obj;
                r0e0 r0e0Var = boq0Var.c;
                UserId a = r0e0Var.a();
                if (bwr0Var instanceof wxr0) {
                    break;
                } else if (bwr0Var instanceof fyr0) {
                    fyr0 fyr0Var = (fyr0) bwr0Var;
                    List<sst0.b> list2 = boq0Var.q;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (epx.f(((sst0.b) obj2).a.a1(), fyr0Var.a.a1())) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        sst0.b bVar2 = (sst0.b) obj2;
                        if (bVar2 != null) {
                            videoFile = bVar2.a;
                            f = edi.v(r0e0Var.a(), fyr0Var, !(videoFile instanceof VideoFileOld) ? (VideoFileOld) videoFile : null);
                        }
                    }
                    videoFile = null;
                    f = edi.v(r0e0Var.a(), fyr0Var, !(videoFile instanceof VideoFileOld) ? (VideoFileOld) videoFile : null);
                } else if (bwr0Var instanceof cwr0) {
                    cwr0 cwr0Var = (cwr0) bwr0Var;
                    VideoFile videoFile2 = cwr0Var.a;
                    if (videoFile2 != null && !videoFile2.C2()) {
                        VideoFile videoFile3 = cwr0Var.a;
                        if (!epx.f((videoFile3 == null || (s = videoFile3.s()) == null) ? null : s.b, a)) {
                            String str4 = cwr0Var.b;
                            if (str4 != null) {
                                break;
                            }
                        }
                        f = true;
                    }
                    f = false;
                } else if (bwr0Var instanceof hwr0) {
                    f = epx.f(((hwr0) bwr0Var).a.c, a);
                } else if (bwr0Var instanceof jwr0) {
                    f = epx.f(((jwr0) bwr0Var).a.c, a);
                } else if (!(bwr0Var instanceof ewr0)) {
                    break;
                } else {
                    f = epx.f(((ewr0) bwr0Var).a.c, a);
                }
                return Boolean.valueOf(f);
            case 5:
                ((zoq0) obj3).n.a(UserProfileAction.d0.b.a.b);
                return s3q0.a;
            case 6:
                int i8 = 4;
                ypq0.b bVar3 = (ypq0.b) obj3;
                GiftItem giftItem = (GiftItem) bVar3.m;
                if (giftItem != null) {
                    inq0 inq0Var = bVar3.n.c;
                    FragmentImpl fragmentImpl = inq0Var.m;
                    Gift gift = giftItem.i;
                    if (gift == null) {
                        mzt mztVar = (mzt) inq0Var.t;
                        if (mztVar != null) {
                            zih.a(inq0Var.E, mztVar, new hzt(), null, 12);
                        }
                    } else {
                        GiftType giftType = gift.n;
                        switch (giftType == null ? -1 : inq0.a.$EnumSwitchMapping$0[giftType.ordinal()]) {
                            case 1:
                            case 2:
                                ImageStatus imageStatus = gift.o;
                                if (imageStatus == null || (str = imageStatus.b) == null) {
                                    ImageStatusPack imageStatusPack = gift.p;
                                    if (imageStatusPack != null) {
                                        str = imageStatusPack.b;
                                    }
                                }
                                String str5 = str;
                                Context mo2getContext2 = fragmentImpl.mo2getContext();
                                if (mo2getContext2 != null) {
                                    maz.c(xwk.d().e(), mo2getContext2, str5, LaunchContext.A, null, null, 24);
                                    break;
                                }
                                break;
                            case 3:
                                String str6 = giftItem.k;
                                if (str6 != null) {
                                    inq0Var.t6(str6);
                                    break;
                                }
                                break;
                            case 4:
                                Integer num = gift.g;
                                if (num != null && (mo2getContext = fragmentImpl.mo2getContext()) != null) {
                                    zal0.H(g2v.d().a(), mo2getContext, num.intValue(), GiftData.d, null, "gifts", null, 72);
                                    break;
                                }
                                break;
                            case 5:
                            case 6:
                            case 7:
                                if (gift.l != null) {
                                    Context mo2getContext3 = fragmentImpl.mo2getContext();
                                    if (mo2getContext3 != null) {
                                        Pair pair = inq0Var.F ? new Pair(GiftModalButtonType.SEND_IN_RETURN, "gifts_own") : new Pair(GiftModalButtonType.SEND, "gifts");
                                        GiftModalButtonType giftModalButtonType = (GiftModalButtonType) pair.d();
                                        String str7 = (String) pair.g();
                                        int i9 = m7z.c;
                                        m7z.a.a(mo2getContext3, gift, new jzt(giftModalButtonType, giftItem.d.b, gift.c, str7, new q2m0(i8, inq0Var, giftItem)));
                                        break;
                                    }
                                } else {
                                    inq0Var.v6(giftItem.d);
                                    break;
                                }
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return s3q0.a;
            case 7:
                ((bdr0) obj3).d = null;
                return s3q0.a;
            case 8:
                ppr0 ppr0Var = (ppr0) obj3;
                wpr0 wpr0Var = (wpr0) obj;
                if (wpr0Var instanceof wpr0.d) {
                    List<String> list3 = ((wpr0.d) wpr0Var).a;
                    ppr0.a aVar = ppr0Var.h;
                    if (aVar != null) {
                        aVar.c(list3);
                    }
                } else if (wpr0Var instanceof wpr0.c) {
                    cp2.d(ppr0Var, 0L, new le9(3, (wpr0.c) wpr0Var, ppr0Var), null, 27);
                } else if (wpr0Var instanceof wpr0.b) {
                    ppr0Var.i();
                } else {
                    if (!(wpr0Var instanceof wpr0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i10 = ((wpr0.a) wpr0Var).a;
                    Object obj4 = (xha0) j5g.b0(i10, ppr0Var.l.w.getCurrentList());
                    Object obj5 = obj4;
                    if (obj4 == null) {
                        ppr0Var.i();
                        obj5 = s3q0.a;
                    }
                    if (obj5 instanceof xha0.b) {
                        io.reactivex.rxjava3.core.q<Bitmap> h = mcr0.h(Uri.parse(((xha0.b) obj5).c));
                        asu0 asu0Var = asu0.a;
                        ppr0Var.getFeature().e.b(h.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new xvq0(new d6c(ppr0Var, i10, 1), 2)));
                    } else if (obj5 instanceof xha0.a) {
                        ppr0.a aVar2 = ppr0Var.h;
                        if (aVar2 != null) {
                            aVar2.d(((xha0.a) obj5).d, i10, false);
                        }
                        ppr0Var.h();
                    }
                }
                return s3q0.a;
            case 9:
                ((gsr0) obj3).l.g();
                return s3q0.a;
            case 10:
                int i11 = VideoAboutFragment.S;
                xn50.a.c((VideoAboutFragment) obj3, new a.c((VideoFile) ((Optional) obj).orElse(null)));
                return s3q0.a;
            case 11:
                int i12 = 5;
                int i13 = 7;
                VideoAutoPlay.e eVar = (VideoAutoPlay.e) obj;
                ye0 ye0Var = ((VideoAutoPlay) obj3).N;
                if (ye0Var == null) {
                    return io.reactivex.rxjava3.core.q.T(eVar);
                }
                io.reactivex.rxjava3.subjects.d<MyTargetAdLoadingState> dVar = ye0Var.h;
                b630 b630Var = new b630(new u620(29), 19);
                dVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.q2(dVar, b630Var), io.reactivex.rxjava3.internal.functions.a.a, new aad0(new kli((byte) 0, i13), 10)).U(new t9c0(i12, new f6m0(eVar, 11)));
            case 12:
                int i14 = VideoContainerActivityWithPip.G;
                ((VideoContainerActivityWithPip) obj3).Z1(VideoPipModeAction.a.a);
                return s3q0.a;
            case 13:
                com.vk.video.ui.discovery.catalog.c cVar = (com.vk.video.ui.discovery.catalog.c) obj3;
                CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto = (CatalogCatalogResponseObjectDto) obj;
                List<VideoVideoFullDto> V2 = catalogCatalogResponseObjectDto.V2();
                List<UsersUserFullDto> i22 = catalogCatalogResponseObjectDto.i2();
                List<GroupsGroupFullDto> N0 = catalogCatalogResponseObjectDto.N0();
                CatalogCatalogDto F = catalogCatalogResponseObjectDto.F();
                String e = F != null ? F.e() : null;
                CatalogCatalogDto F2 = catalogCatalogResponseObjectDto.F();
                if (F2 == null || (j = F2.j()) == null) {
                    arrayList = null;
                    videoDiscoveryCatalogRepository$Section = null;
                } else {
                    List<CatalogSectionDto> list4 = j;
                    arrayList = new ArrayList(c5g.u(list4, 10));
                    videoDiscoveryCatalogRepository$Section = null;
                    for (CatalogSectionDto catalogSectionDto : list4) {
                        List<CatalogBlockDto> g = catalogSectionDto.g();
                        CatalogBlockDto catalogBlockDto = g != null ? (CatalogBlockDto) j5g.a0(g) : null;
                        CatalogDiscoverDataDto v0 = catalogBlockDto != null ? catalogBlockDto.v0() : null;
                        String e2 = v0 != null ? v0.e() : null;
                        List<UxPoll> c = cVar.c(v0);
                        boolean a2 = cVar.a(c, v0 != null ? epx.f(v0.d(), Boolean.TRUE) : false);
                        if ((catalogBlockDto != null ? catalogBlockDto.l0() : null) != CatalogBlockDataTypeDto.VIDEOS || catalogBlockDto.n1().f() != CatalogLayoutDto.NameDto.LARGE_LIST) {
                            catalogBlockDto = null;
                        }
                        if (catalogBlockDto == null || (list = catalogBlockDto.f3()) == null) {
                            list = EmptyList.b;
                        }
                        List e3 = ums0.e(ums0.a, rli0.A(rli0.t(rli0.t(new i5g(list), new p6e0(16)), new mom(V2, 2))), i22, N0, false, 52);
                        String id = catalogSectionDto.getId();
                        String title = catalogSectionDto.getTitle();
                        String l = catalogSectionDto.l();
                        List list5 = !e3.isEmpty() ? e3 : null;
                        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section2 = new VideoDiscoveryCatalogRepository$Section(id, title, l, list5 != null ? com.vk.dto.video.a.a(list5) : null, com.vk.video.ui.discovery.catalog.c.d(e3), a2, e2, c);
                        if (id.equals(e)) {
                            videoDiscoveryCatalogRepository$Section = videoDiscoveryCatalogRepository$Section2;
                        }
                        arrayList.add(videoDiscoveryCatalogRepository$Section2);
                    }
                }
                if (videoDiscoveryCatalogRepository$Section == null) {
                    return new sfs0(null, EmptyList.b);
                }
                List list6 = arrayList;
                if (arrayList == null) {
                    list6 = EmptyList.b;
                }
                return new sfs0(videoDiscoveryCatalogRepository$Section, list6);
            case 14:
                VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
                ((sgs0) obj3).invoke(new rbt0(0, 50, videoListWithTotalCount.c, 48, com.vk.video.ui.discovery.minimizable.related_videos.d.b(videoListWithTotalCount.b)));
                return s3q0.a;
            case 15:
                int i15 = VideoEpisodesFragment.V;
                xn50.a.c((VideoEpisodesFragment) obj3, new a.b((VideoFile) ((Optional) obj).orElse(null)));
                return s3q0.a;
            case 16:
                com.vk.video.ui.discovery.minimizable.related_videos.h hVar = (com.vk.video.ui.discovery.minimizable.related_videos.h) obj;
                VideoMinimizableDiscoveryFragment.b bVar4 = ((VideoMinimizableDiscoveryFragment) obj3).U;
                cb30 cb30Var = (bVar4 == null ? null : bVar4).b;
                cb30Var.g.b.P4(hVar);
                cb30Var.h.d.P4(hVar);
                return s3q0.a;
            case 17:
                return new i3t0.a(((tj50.a) obj).e(new yp1((x2t0) obj3, 12)));
            case 18:
                a6t0 a6t0Var = (a6t0) obj3;
                nvy nvyVar = (nvy) obj;
                a6t0.a.b bVar5 = new a6t0.a.b("Medium 16x9");
                a6t0.a.c cVar2 = new a6t0.a.c("Default");
                rmw.h hVar2 = new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg");
                PreviewViewState.DurationBadge durationBadge = new PreviewViewState.DurationBadge(new mno0.i("22:34"), false ? 1 : 0, r13, i3);
                mno0.i iVar = new mno0.i("4K");
                mno0.i iVar2 = new mno0.i("12+");
                ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
                ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Overlay;
                a6t0.a.C2528a c2528a = new a6t0.a.C2528a(PreviewViewState.a0.b(hVar2, true, durationBadge, null, new PreviewViewState.k(new PreviewViewState.j(contentBadgeMode, design, null, null, iVar, null, 44), new PreviewViewState.j(contentBadgeMode, design, null, null, iVar2, null, 44)), null, null, null, null, new PreviewViewState.w(TimelineViewState.a.a(25L, 50L, 100L)), null, 1512));
                a6t0.a.c cVar3 = new a6t0.a.c("Placeholder");
                PlaceholderViewState c2 = a6t0.c();
                PreviewViewState.a0 a0Var = PreviewViewState.a0.a;
                List l2 = e43.l(bVar5, cVar2, c2528a, cVar3, new a6t0.a.C2528a(a0Var.d(true, c2)), new a6t0.a.c("Playlist"), new a6t0.a.C2528a(PreviewViewState.a0.e(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), 1, null, null, 56)), new a6t0.a.c("Blur"), new a6t0.a.C2528a(a0Var.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, a6t0.d())), new a6t0.a.c("Skeleton"), new a6t0.a.C2528a(PreviewViewState.a0.f(true)));
                nvyVar.e(l2.size(), null, new idd0(l2, 1), new jai(802480018, new z7d0(1, a6t0Var, l2), true));
                List l3 = e43.l(new a6t0.a.b("Sharp 16x9"), new a6t0.a.c("Default"), new a6t0.a.C2528a(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), false, new PreviewViewState.DurationBadge(new mno0.i("22:34"), false ? 1 : 0, null, i3), null, null, null, null, null, null, new PreviewViewState.w(new TimelineViewState(new TimelineViewState.b(25L), new TimelineViewState.b(50L), null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED)), null, 1528)), new a6t0.a.c("Placeholder"), new a6t0.a.C2528a(a0Var.d(false, a6t0.c())), new a6t0.a.c("Blur"), new a6t0.a.C2528a(a0Var.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), false, a6t0.d())), new a6t0.a.c("Skeleton"), new a6t0.a.C2528a(PreviewViewState.a0.f(false)));
                nvyVar.e(l3.size(), null, new onl0(l3, 1), new jai(802480018, new h6t0(l3, a6t0Var), true));
                List l4 = e43.l(new a6t0.a.b("Small 16x9"), new a6t0.a.c("Default"), new a6t0.a.C2528a(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PreviewViewState.DurationBadge(new mno0.i("22:34"), false, null, 6), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED)), new a6t0.a.c("Placeholder"), new a6t0.a.C2528a(a0Var.d(true, a6t0.c())), new a6t0.a.c("Playlist"), new a6t0.a.C2528a(PreviewViewState.a0.e(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), 1, null, null, 56)), new a6t0.a.c("Blur"), new a6t0.a.C2528a(a0Var.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, a6t0.d())), new a6t0.a.c("Skeleton"), new a6t0.a.C2528a(PreviewViewState.a0.f(true)));
                nvyVar.e(l4.size(), null, new b6t0(l4), new jai(802480018, new c6t0(l4, a6t0Var), true));
                a6t0.a.b bVar6 = new a6t0.a.b("Medium 2x3");
                a6t0.a.c cVar4 = new a6t0.a.c("Default");
                a6t0.a.C2528a c2528a2 = new a6t0.a.C2528a(PreviewViewState.s.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), new PreviewViewState.j(contentBadgeMode, design, null, null, new mno0.i("10 серий"), null, 44), new PreviewViewState.k(new PreviewViewState.j(contentBadgeMode, new ContentBadgeAppearance.b(VkColorToken.AccentPurple, VkColorToken.TextContrast), new rmw.d(R.drawable.vk_icon_hand_point_up_12), null, new mno0.i("Интерактив"), null, 40), 2), 244));
                a6t0.a.c cVar5 = new a6t0.a.c("Placeholder");
                PlaceholderViewState c3 = a6t0.c();
                PreviewViewState.s sVar = PreviewViewState.s.a;
                List l5 = e43.l(bVar6, cVar4, c2528a2, cVar5, new a6t0.a.C2528a(sVar.d(c3)), new a6t0.a.c("Blur"), new a6t0.a.C2528a(sVar.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), a6t0.d())), new a6t0.a.c("Skeleton"), new a6t0.a.C2528a(PreviewViewState.s.e()));
                nvyVar.e(l5.size(), null, new db5(l5, 3), new jai(802480018, new d6t0(l5, a6t0Var), true));
                List l6 = e43.l(new a6t0.a.b("Small 2x3"), new a6t0.a.c("Default"), new a6t0.a.C2528a(PreviewViewState.s.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), new PreviewViewState.j(contentBadgeMode, design, null, null, new mno0.i("10 серий"), null, 44), null, 252)), new a6t0.a.c("Placeholder"), new a6t0.a.C2528a(sVar.d(a6t0.c())), new a6t0.a.c("Blur"), new a6t0.a.C2528a(sVar.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), a6t0.d())), new a6t0.a.c("Skeleton"), new a6t0.a.C2528a(PreviewViewState.s.e()));
                nvyVar.e(l6.size(), null, new pxl(l6, 1), new jai(802480018, new e6t0(l6, a6t0Var), true));
                List l7 = e43.l(new a6t0.a.b("Small 9x16"), new a6t0.a.c("Default"), new a6t0.a.C2528a(PreviewViewState.g.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), null, new PreviewViewState.h(new c8d(oq.d(tlo0.Companion, "Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), new c8d.a(new tlo0.h("VK Видео")), new c8d.c(new tlo0.h("2,8К"), new tlo0.h("3 часа назад")))), 6)), new a6t0.a.c("Placeholder"), new a6t0.a.C2528a(PreviewViewState.g.c(a6t0.c(), null, null)), new a6t0.a.c("Blur"), new a6t0.a.C2528a(PreviewViewState.g.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), a6t0.d())), new a6t0.a.c("Skeleton"), new a6t0.a.C2528a(PreviewViewState.g.d()), new a6t0.a.c("Schedule Timer"), new a6t0.a.C2528a(PreviewViewState.g.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_more_vertical_24), null, null, null, 14), new PreviewViewState.q(new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_clock_outline_24), new mno0.i("Завтра в 08:30"), null, null, VkColorToken.OverlayPrimary, 12)), 2)));
                nvyVar.e(l7.size(), null, new f6t0(l7), new jai(802480018, new g6t0(l7, a6t0Var), true));
                return s3q0.a;
            case 19:
                List<UsersUserFullDto> list7 = (List) obj;
                j2r0 j2r0Var = ((z8u0) obj3).q;
                ArrayList arrayList2 = new ArrayList(c5g.u(list7, 10));
                for (UsersUserFullDto usersUserFullDto : list7) {
                    j2r0Var.getClass();
                    arrayList2.add(j2r0.a(usersUserFullDto));
                }
                return arrayList2;
            case 20:
                ((nm8) obj3).f(Boolean.FALSE);
                return s3q0.a;
            case 21:
                View view2 = ((VkTopBar.d) obj3).d.a;
                ViewParent parent = view2.getParent();
                r13 = parent instanceof ViewGroup ? (ViewGroup) parent : 0;
                if (r13 != 0) {
                    r13.removeView(view2);
                }
                return view2;
            case 22:
                lxv0 lxv0Var = (lxv0) obj3;
                Throwable th = (Throwable) obj;
                boolean z6 = th instanceof VKApiExecutionException;
                VKApiExecutionException vKApiExecutionException = z6 ? (VKApiExecutionException) th : null;
                String u = vKApiExecutionException != null ? vKApiExecutionException.u() : null;
                VkAppsErrors.Client client = (z6 && ((VKApiExecutionException) th).J()) ? VkAppsErrors.Client.ACCESS_DENIED : VkAppsErrors.Client.INVALID_PARAMS;
                r6y r6yVar = lxv0Var.b;
                if (r6yVar != null) {
                    bex0.a.a(r6yVar, JsApiMethodType.SHOW_COMMUNITY_WIDGET_PREVIEW_BOX, client, u, null, null, 56);
                }
                return s3q0.a;
            case 23:
                kkw0 kkw0Var = (kkw0) obj3;
                Pair pair2 = (Pair) obj;
                wwi0.a aVar3 = (wwi0.a) pair2.d();
                float floatValue = ((Float) pair2.g()).floatValue();
                kvi0 kvi0Var = kkw0Var.h;
                gxu gxuVar = kkw0Var.d;
                if (floatValue == 90.0f || floatValue == 270.0f) {
                    kvi0Var.b(aVar3);
                    gxuVar.d(aVar3);
                } else {
                    gxuVar.d(aVar3);
                    kvi0Var.b(aVar3);
                }
                return s3q0.a;
            case 24:
                return new row0((ViewGroup) obj, ((pow0) obj3).i);
            default:
                oxw0 oxw0Var = (oxw0) obj3;
                oxw0Var.z.a(oxw0Var.J);
                return s3q0.a;
        }
    }

    public /* synthetic */ dso0(sgs0 sgs0Var, com.vk.video.ui.discovery.minimizable.related_videos.d dVar) {
        this.b = 14;
        this.c = sgs0Var;
    }
}
