package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.video.dto.VideoGetForPlayFieldsDto;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.mvp.holder.video.SubcategoryFilterVh;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectInputModel;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorPatch;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.AdSection;
import com.vk.dto.common.InstreamAd;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.internal.jobs.dialogs.DialogArchiveUnarchiveJob;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachesState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.photoflow.presentation.l;
import com.vk.profile.core.content.ContentTab;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.OneVideoPlayer;
import xsna.adt0;
import xsna.cxz;
import xsna.dw20;
import xsna.e8v0;
import xsna.ejm0;
import xsna.j0j;
import xsna.k5a0;
import xsna.kdj;
import xsna.m5a0.a;
import xsna.mbf;
import xsna.o2k;
import xsna.qrd0;
import xsna.uxd0;
import xsna.vim0;
import xsna.w770;
import xsna.wim0;
import xsna.x6i0;
import xsna.ye0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sf4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v115, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r2v178, types: [java.lang.CharSequence] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        List<String> list;
        String str2;
        int c2;
        Object obj2;
        InstreamAd U7;
        d3b0 d3b0Var;
        io.reactivex.rxjava3.core.a aVar;
        io.reactivex.rxjava3.core.x b;
        tfx tfxVar;
        ArrayList arrayList;
        yws0 yws0Var;
        d8x d8xVar;
        d3b0 d3b0Var2;
        d3b0 d3b0Var3;
        int i = 17;
        int i2 = 12;
        int i3 = 19;
        int i4 = 4;
        str = "";
        int i5 = 0;
        switch (this.b) {
            case 0:
                ((wf4) this.c).b.h((hyg0) obj, (fg4) this.d);
                return s3q0.a;
            case 1:
                return z9a.s((z9a) this.c, (String) this.d, null, null, (List) obj, 22);
            case 2:
                bnd bndVar = (bnd) this.c;
                ClipsCoauthorsSelectorInputParams clipsCoauthorsSelectorInputParams = (ClipsCoauthorsSelectorInputParams) this.d;
                Result result = (Result) obj;
                if (!(result.d() instanceof Result.Failure)) {
                    smd smdVar = smd.c;
                    Object d = result.d();
                    smd smdVar2 = smd.c;
                    if (d instanceof Result.Failure) {
                        d = smdVar2;
                    }
                    smd smdVar3 = (smd) d;
                    Set<ClipsCoauthorsSelectInputModel> set = clipsCoauthorsSelectorInputParams.c;
                    UserId userId = clipsCoauthorsSelectorInputParams.f;
                    Set<ClipsCoauthorsSelectInputModel> set2 = set;
                    ArrayList arrayList2 = new ArrayList(c5g.u(set2, 10));
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(com.vk.clips.coauthors.domain.model.a.a((ClipsCoauthorsSelectInputModel) it.next()));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!((ClipsCoauthorSelectorUserItem) next).b.equals(userId)) {
                            arrayList3.add(next);
                        }
                    }
                    Set S0 = j5g.S0(arrayList3);
                    List<ClipsCoauthorSelectorUserItem> list2 = smdVar3.a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!((ClipsCoauthorSelectorUserItem) obj3).b.equals(userId)) {
                            arrayList4.add(obj3);
                        }
                    }
                    bndVar.T(new ClipsCoauthorsSelectorPatch.c(S0, arrayList4, clipsCoauthorsSelectorInputParams.f, clipsCoauthorsSelectorInputParams.g, smdVar3.b));
                } else if (result.d() instanceof Result.Failure) {
                    Throwable a = Result.a(result.d());
                    ClipsCoauthorsException clipsCoauthorsException = a instanceof ClipsCoauthorsException ? (ClipsCoauthorsException) a : null;
                    if (clipsCoauthorsException != null) {
                        bndVar.T(new ClipsCoauthorsSelectorPatch.b(clipsCoauthorsException));
                    }
                }
                return s3q0.a;
            case 3:
                ((com.vk.clips.entrypoints.ui.d) this.c).a.a((VkOnboardingCampaign) this.d, VkOnboardingType.Tooltip, ((Boolean) obj).booleanValue() ? e8v0.i.b : e8v0.g.b);
                return s3q0.a;
            case 4:
                nld nldVar = (nld) this.c;
                izs izsVar = (izs) this.d;
                ActivityResult activityResult = (ActivityResult) obj;
                if (activityResult.b == -1) {
                    Intent intent = activityResult.c;
                    ClipsChoosePreviewResult clipsChoosePreviewResult = intent != null ? (ClipsChoosePreviewResult) intent.getParcelableExtra(nldVar == null ? null : "") : null;
                    if (clipsChoosePreviewResult != null) {
                        izsVar.invoke(new mbf.c.k(clipsChoosePreviewResult));
                    }
                }
                return s3q0.a;
            case 5:
                s0j s0jVar = (s0j) this.c;
                com.vk.voip.ui.sessionrooms.c cVar = (com.vk.voip.ui.sessionrooms.c) this.d;
                f.a.b bVar = (f.a.b) ((it80) obj).a;
                if (bVar != null) {
                    cVar.e(bVar);
                }
                s0jVar.C(j0j.b.b);
                return s3q0.a;
            case 6:
                kdj kdjVar = (kdj) this.c;
                Collection collection = (Collection) this.d;
                kdjVar.c.f(collection);
                kdj.a aVar2 = kdjVar.d;
                aVar2.f.u(new csk0(2, aVar2, collection));
                return s3q0.a;
            case 7:
                return new o2k.b((Bitmap) obj, new o2k.b.a((RectF) this.c, (String) this.d));
            case 8:
                com.vk.im.engine.internal.jobs.dialogs.b bVar2 = (com.vk.im.engine.internal.jobs.dialogs.b) this.c;
                DialogArchiveUnarchiveJob.Action action = (DialogArchiveUnarchiveJob.Action) this.d;
                xgl0 xgl0Var = (xgl0) obj;
                hpm e = xgl0Var.b().e();
                long j = bVar2.b;
                e.h0(j, action.h());
                com.vk.im.engine.models.dialogs.b c = e.c(j);
                if (c != null) {
                    new sum(xgl0Var).a(c);
                }
                czh0 v = xgl0Var.v();
                if (action == DialogArchiveUnarchiveJob.Action.ARCHIVE) {
                    v.n(Collections.singletonList(Long.valueOf(j)));
                } else {
                    v.h(-1L);
                }
                return s3q0.a;
            case 9:
                htp htpVar = (htp) this.c;
                atp atpVar = (atp) this.d;
                int intValue = ((Integer) obj).intValue();
                bzs0 bzs0Var = htpVar.m;
                String r1 = atpVar.b.r1();
                TimelineThumbs B0 = atpVar.b.B0();
                if (B0 != null && (list = B0.i) != null && (str2 = list.get(intValue)) != null) {
                    str = str2;
                }
                return bzs0Var.A(intValue, r1, str);
            case 10:
                StickerStockItem stickerStockItem = (StickerStockItem) this.c;
                t1z t1zVar = (t1z) this.d;
                View view = (View) obj;
                if (stickerStockItem != null) {
                    int i6 = stickerStockItem.b;
                    tfx tfxVar2 = new tfx("store.activateProduct", new zyk0(r12), new azk0(r12));
                    tfx.o(tfxVar2, "type", "stickers", 0, 0, 12);
                    tfx.l(tfxVar2, "product_id", i6, 0, 0, 8);
                    hg1.b(view, hg1.m(rsg0.y0(yfb.x(tfxVar2), null, null, 3), view.getContext(), 0L, false, 62).subscribe(new m5y(new com.vk.libvideo.b(18, t1zVar, stickerStockItem), r12)));
                }
                return s3q0.a;
            case 11:
                cxz.a aVar3 = cxz.a.a;
                Integer num = (Integer) this.c;
                Integer num2 = (Integer) this.d;
                xwz xwzVar = (xwz) obj;
                exz exzVar = xwz.c;
                if (num != null) {
                    xwzVar.getClass();
                    xwzVar.a(xwz.d(xwz.e(R.string.vk_from)));
                    xwzVar.a(exzVar);
                    xwzVar.a(new dxz(num, aVar3));
                }
                if (num != null && num2 != null) {
                    xwzVar.a(exzVar);
                }
                if (num2 != null) {
                    xwzVar.getClass();
                    xwzVar.a(xwz.d(xwz.e(R.string.vk_to)));
                    xwzVar.a(exzVar);
                    xwzVar.a(new dxz(num2, aVar3));
                }
                return s3q0.a;
            case 12:
                wq30 wq30Var = (wq30) this.c;
                AttachGift attachGift = (AttachGift) this.d;
                pk30 pk30Var = wq30Var.u;
                if (pk30Var != null) {
                    pk30Var.k(attachGift);
                }
                return s3q0.a;
            case 13:
                qgi0.h((tgi0) obj, ((w770.d) ((w770) this.c)).c.a((Context) this.d).toString());
                return s3q0.a;
            case 14:
                ((dn80) this.c).i.remove((String) this.d);
                return s3q0.a;
            case 15:
                com.vk.attachpicker.fragment.gallery.h hVar = (com.vk.attachpicker.fragment.gallery.h) this.c;
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.d;
                ((Boolean) obj).booleanValue();
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                if (epx.f(hVar.d, Boolean.TRUE)) {
                    FrameLayout frameLayout = hVar.a;
                    LinearLayout linearLayout = frameLayout != null ? (LinearLayout) bwt0.q(frameLayout, R.id.root_container_permission, null, 6) : null;
                    if (linearLayout != null) {
                        VkSimpleButton vkSimpleButton = new VkSimpleButton(bwt0.u(galleryFragmentImpl.requireContext()), null, 6);
                        vkSimpleButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        vkSimpleButton.setText(R.string.story_open_camera);
                        f4m.t(iah0.a(16), vkSimpleButton);
                        f4m.m(17, vkSimpleButton);
                        vkSimpleButton.setAppearance(VkButton.Appearance.Accent);
                        vkSimpleButton.setSize(VkButton.Size.Medium);
                        vkSimpleButton.setMode(VkButton.Mode.Primary);
                        bwt0.i0(vkSimpleButton, new fju(hVar, i3));
                        linearLayout.addView(vkSimpleButton);
                    }
                }
                GalleryFragmentImpl galleryFragmentImpl2 = hVar.c.a;
                int i7 = GalleryFragmentImpl.R0;
                u3p0 u3p0Var = galleryFragmentImpl2.X;
                if (u3p0Var != null) {
                    u3p0Var.a.c(u3p0Var.b);
                }
                return s3q0.a;
            case 16:
                k5a0 k5a0Var = (k5a0) this.c;
                k5a0.a aVar4 = (k5a0.a) this.d;
                a1y a1yVar = k5a0Var.a;
                int adapterPosition = aVar4.getAdapterPosition();
                m5a0 m5a0Var = (m5a0) a1yVar.c;
                List<SimpleAttachListItem> list3 = ((SimpleAttachesState) m5a0Var.w.b.P0()).f;
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    Attach attach = ((SimpleAttachListItem) it3.next()).b.d;
                    AttachImage attachImage = attach instanceof AttachImage ? (AttachImage) attach : null;
                    if (attachImage != null) {
                        arrayList5.add(attachImage);
                    }
                }
                AttachImage attachImage2 = (AttachImage) j5g.b0(adapterPosition, arrayList5);
                if (attachImage2 != null) {
                    ImageViewer imageViewer = m5a0Var.t;
                    Context context = m5a0Var.u;
                    bpn0 bpn0Var = enj.a;
                    ImageViewer.a(imageViewer, attachImage2, arrayList5, e3m.h(context), m5a0Var.new a(), !m5a0Var.h1(), com.vk.dto.common.a.b(m5a0Var.j.q()), 112);
                }
                return s3q0.a;
            case 17:
                com.vk.photos.root.photoflow.presentation.j jVar = (com.vk.photos.root.photoflow.presentation.j) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                l.c cVar2 = (l.c) obj;
                List<y7a0> list4 = cVar2.a;
                Throwable th = cVar2.c;
                if (th != null) {
                    jVar.l.fj(th, null);
                } else {
                    if (ref$BooleanRef.element) {
                        ref$BooleanRef.element = false;
                        if (list4 != null) {
                            for (Object obj4 : list4) {
                                int i8 = i5 + 1;
                                if (i5 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                jVar.o.y(i5, epx.f(((y7a0) obj4).b, Boolean.TRUE));
                                i5 = i8;
                            }
                        }
                    }
                    if (list4 != null) {
                        jVar.q.submitList(list4, new m67(jVar, 8));
                        Integer num3 = cVar2.b;
                        jVar.r.submitList(num3 == null ? EmptyList.b : Collections.singletonList(new rxj(num3.intValue())));
                    }
                }
                return s3q0.a;
            case 18:
                qrd0.f fVar = (qrd0.f) this.c;
                izs izsVar2 = (izs) this.d;
                ArrayList arrayList6 = fVar.b;
                wow wowVar = new wow(arrayList6);
                ((nvy) obj).e(arrayList6.size(), new qrd0.c(new c3v(i), wowVar), new qrd0.d(wowVar), new jai(802480018, new qrd0.e(wowVar, izsVar2), true));
                return s3q0.a;
            case 19:
                View view2 = (View) this.c;
                wh50 wh50Var = (wh50) this.d;
                vtf0 vtf0Var = new vtf0(wh50Var);
                wh50Var.setValue(Boolean.valueOf(view2.isAttachedToWindow()));
                view2.addOnAttachStateChangeListener(vtf0Var);
                return new wtf0(view2, vtf0Var);
            case 20:
                s6s0 s6s0Var = (s6s0) this.c;
                y6s0 y6s0Var = (y6s0) this.d;
                adt0.a aVar5 = (adt0.a) obj;
                aVar5.a = s6s0Var.a;
                aVar5.c = s6s0Var.b;
                if (y6s0Var != null && (c2 = y6s0Var.c2()) > -1) {
                    gpt0 gpt0Var = gpt0.a;
                    aVar5.b = z8s.a(c2);
                }
                return aVar5.a();
            case 21:
                return new x6i0.d(((LayoutInflater) this.c).inflate(R.layout.im_channel_selection_owner_vh, (ViewGroup) obj, false), (x6i0.b) this.d);
            case 22:
                ((o9l0) this.c).b.g((hyg0) obj, (ArrayList) this.d);
                return s3q0.a;
            case 23:
                wim0.d dVar = (wim0.d) this.c;
                wim0 wim0Var = (wim0) this.d;
                ejm0.a aVar6 = dVar.o;
                if (aVar6 != null) {
                    wim0Var.c.fo(new vim0.c(aVar6));
                }
                return s3q0.a;
            case 24:
                SubcategoryFilterVh subcategoryFilterVh = (SubcategoryFilterVh) this.c;
                UIBlock uIBlock = (UIBlock) this.d;
                CheckedTextView checkedTextView = subcategoryFilterVh.c;
                if (checkedTextView == null) {
                    checkedTextView = null;
                }
                if (checkedTextView.isChecked()) {
                    return s3q0.a;
                }
                UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) uIBlock;
                if (uIBlockActionFilter.z.j == CatalogFilterData.FromType.CUSTOM) {
                    CheckedTextView checkedTextView2 = subcategoryFilterVh.c;
                    if (checkedTextView2 == null) {
                        checkedTextView2 = null;
                    }
                    Context context2 = checkedTextView2.getContext();
                    CheckedTextView checkedTextView3 = subcategoryFilterVh.c;
                    if (checkedTextView3 == null) {
                        checkedTextView3 = null;
                    }
                    Activity b2 = enj.b(checkedTextView3);
                    FragmentActivity fragmentActivity = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
                    if (fragmentActivity != null) {
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = ((dw20.b) new dw20.b(context2, null).u0(dhr0.C().c).v0(R.string.video_media_license_title).r0(R.string.video_media_license_sport_text).t0(context2.getColor(R.color.vk_steel_gray_500)).F(enj.e(R.drawable.vk_icon_dismiss_dark_24, R.attr.vk_ui_icon_secondary, context2), null)).b0(new qhg0(ref$ObjectRef, i2)).B0(Integer.valueOf(iah0.a(4))).x(0).v(0).p0(iah0.a(24)).h0(R.string.video_disclaimer_button_ok, new cy20(14)).H0(fragmentActivity.getSupportFragmentManager(), null);
                    }
                } else {
                    subcategoryFilterVh.b.a(uIBlockActionFilter, false);
                }
                return s3q0.a;
            case 25:
                u5n0 u5n0Var = (u5n0) this.c;
                Photo photo = (Photo) this.d;
                Runnable runnable = u5n0Var.F;
                if (runnable != null) {
                    runnable.run();
                }
                ysg0<Object> ysg0Var = ysg0.b;
                ysg0Var.a(new k9q0());
                ysg0Var.a(new zaa0(-9000, photo.e, photo.c));
                u5n0Var.R6(u5n0Var.o6(R.drawable.vk_icon_check_circle_filled_blue_24), u5n0Var.v6(R.string.photo_tags_self_confirm));
                return s3q0.a;
            case 26:
                return new d66((ioq0) this.c, (uxd0.a.InterfaceC3848a) obj, (View) this.d, 5);
            case 27:
                fpq0 fpq0Var = (fpq0) this.c;
                com.vk.profile.user.impl.ui.g gVar = (com.vk.profile.user.impl.ui.g) this.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                cvq0 cvq0Var = fpq0Var.w;
                ContentTab contentTab = gVar.i;
                cvq0Var.d = extendedUserProfile;
                if (extendedUserProfile != null && bwd0.d(extendedUserProfile) && !(contentTab instanceof ContentTab.Wall)) {
                    cvq0Var.b(bwd0.i(extendedUserProfile));
                }
                return s3q0.a;
            case 28:
                final VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.c;
                b990 b990Var = (b990) this.d;
                VideoAutoPlay.e eVar = (VideoAutoPlay.e) obj;
                final VideoFile videoFile = eVar.a;
                m7q m7qVar = eVar.b;
                if (videoAutoPlay.g1() && (d3b0Var3 = videoAutoPlay.p0) != null) {
                    d3b0Var3.a();
                }
                videoAutoPlay.N(videoFile);
                videoAutoPlay.C1(m7q.a(m7qVar, null, null, null, 0, false, videoAutoPlay.n1(), null, 0L, null, null, false, 134152191));
                if (!videoAutoPlay.u.z0()) {
                    videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.PLAY);
                }
                if (videoAutoPlay.u.z0()) {
                    obj2 = VideoAutoPlay.c.d.a;
                } else if (videoAutoPlay.P0() && videoAutoPlay.m1()) {
                    obj2 = VideoAutoPlay.c.b.a;
                } else {
                    ye0 ye0Var = videoAutoPlay.N;
                    obj2 = (ye0Var == null || !ye0Var.b(AdSection.PREROLL, null) || (videoAutoPlay.Z0().p == PlayerType.INLINE && ((U7 = videoAutoPlay.u.U7()) == null || !U7.h)) || !videoAutoPlay.m1()) ? VideoAutoPlay.c.a.a : VideoAutoPlay.c.C1206c.a;
                }
                if (obj2 instanceof VideoAutoPlay.c.a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        qu5.c().getClass();
                    }
                    d3b0Var = (d3b0) b990Var.invoke();
                } else {
                    d3b0Var = null;
                }
                if (epx.f(obj2, VideoAutoPlay.c.d.a)) {
                    if (videoAutoPlay.g1() && (d3b0Var2 = videoAutoPlay.p0) != null) {
                        d3b0Var2.a();
                    }
                    videoAutoPlay.C(false);
                } else if (epx.f(obj2, VideoAutoPlay.c.b.a)) {
                    d3b0 d3b0Var4 = videoAutoPlay.p0;
                    if (d3b0Var4 != null) {
                        d3b0Var4.C(false);
                        d3b0Var4.j(null);
                    }
                    ye0 ye0Var2 = videoAutoPlay.N;
                    if (ye0Var2 != null) {
                        ye0.a aVar7 = ye0Var2.z;
                        com.vk.libvideo.api.ad.a j2 = aVar7.j();
                        if (j2 != null) {
                            videoAutoPlay.y.m(aVar7, j2);
                        }
                        ye0Var2.h(videoAutoPlay.e1(), false);
                        c8x c8xVar = ye0Var2.i;
                        if (c8xVar != null) {
                            p7z0 p7z0Var = c8xVar.i;
                            if (p7z0Var != null && p7z0Var.j != null && !p7z0Var.q.d() && (d8xVar = p7z0Var.d.g) != null) {
                                d8xVar.a();
                            }
                            com.vk.movika.sdk.base.model.l lVar = (com.vk.movika.sdk.base.model.l) ye0Var2.A.c;
                            if (lVar != null && (yws0Var = (yws0) lVar.b) != null) {
                                yws0Var.a();
                                VideoAutoPlay videoAutoPlay2 = ((l3s0) lVar.a).a;
                                videoAutoPlay2.y.V3(videoAutoPlay2);
                            }
                        }
                        videoAutoPlay.U.getClass();
                        if (ad0.w()) {
                            videoAutoPlay.l0();
                            videoAutoPlay.O1(false);
                            videoAutoPlay.i1();
                        }
                    }
                    videoAutoPlay.U.getClass();
                    if (!ad0.w()) {
                        videoAutoPlay.l0();
                        videoAutoPlay.O1(false);
                        videoAutoPlay.i1();
                        s3q0 s3q0Var = s3q0.a;
                    }
                } else if (epx.f(obj2, VideoAutoPlay.c.C1206c.a)) {
                    videoAutoPlay.U.getClass();
                    if (!ad0.w()) {
                        d3b0 d3b0Var5 = videoAutoPlay.p0;
                        if (d3b0Var5 != null) {
                            d3b0Var5.C(false);
                            d3b0Var5.j(null);
                        }
                        videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.PLAY);
                    }
                    ye0 ye0Var3 = videoAutoPlay.N;
                    if (ye0Var3 != null) {
                        AdSection adSection = AdSection.PREROLL;
                        if (ye0Var3.b(adSection, null)) {
                            ye0Var3.s = false;
                            ye0Var3.f.getClass();
                            if (!ad0.w()) {
                                VideoAutoPlay videoAutoPlay3 = ye0Var3.c.a;
                                videoAutoPlay3.y.n2(videoAutoPlay3);
                            }
                            ye0Var3.y = true;
                            ye0Var3.r = adSection;
                            ye0Var3.g("request_preroll");
                            c8x c8xVar2 = ye0Var3.i;
                            if (c8xVar2 != null) {
                                c8xVar2.l = ye0Var3.j;
                            }
                            Pair<d8x, e8x> c3 = ye0Var3.c();
                            d8x d2 = c3.d();
                            e8x g = c3.g();
                            c8x c8xVar3 = ye0Var3.i;
                            if (c8xVar3 != null) {
                                c8xVar3.f(d2);
                            }
                            c8x c8xVar4 = ye0Var3.i;
                            if (c8xVar4 != null && g != null) {
                                c8xVar4.k = g;
                                p7z0 p7z0Var2 = c8xVar4.i;
                                if (p7z0Var2 != null) {
                                    n0z0 n0z0Var = p7z0Var2.e;
                                    n0z0Var.b = g;
                                    g.f(n0z0Var);
                                }
                            }
                            c8x c8xVar5 = ye0Var3.i;
                            if (c8xVar5 != null) {
                                c8xVar5.d("preroll");
                            }
                        }
                    }
                    videoAutoPlay.U.getClass();
                    if (!ad0.w()) {
                        videoAutoPlay.l0();
                        videoAutoPlay.O1(false);
                        videoAutoPlay.i1();
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } else {
                    if (!epx.f(obj2, VideoAutoPlay.c.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (d3b0Var != null) {
                        nza0 h = d3b0Var.h();
                        if (h != null) {
                            h.c(videoAutoPlay.n1());
                        }
                        videoAutoPlay.T.stop();
                        OneVideoPlayer a2 = d3b0Var.a();
                        if (a2 != null) {
                            a2.resume();
                        }
                        videoAutoPlay.A1();
                        videoAutoPlay.t1();
                        if (d3b0Var.e()) {
                            videoAutoPlay.E0(null);
                        } else if (videoAutoPlay.d()) {
                            videoAutoPlay.y.n2(videoAutoPlay);
                        }
                        if (!BuildInfo.q() || videoAutoPlay.n1()) {
                            aVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
                        } else {
                            w1s0 w1s0Var = w1s0.b;
                            String C1 = videoFile.C1();
                            r12 = (videoFile.o0() == 0 || epx.f(videoFile.I0(), UserId.d)) ? 0 : 1;
                            if (videoFile.A2() != null || r12 == 0) {
                                b = sn.b("Skipping skippable parts request: video file does not satisfy conditions.");
                            } else {
                                uft0 uft0Var = w1s0.e;
                                UserId I0 = videoFile.I0();
                                int o0 = videoFile.o0();
                                List l = e43.l(VideoGetForPlayFieldsDto.SKIPPABLE_PARTS, VideoGetForPlayFieldsDto.IS_SERIAL);
                                uft0Var.getClass();
                                tfx tfxVar3 = new tfx("video.getForPlay", new cjl0(i4), new sni0(9));
                                tfx.n(tfxVar3, "owner_id", I0, 0L, 0L, 12);
                                tfx.l(tfxVar3, "video_id", o0, 1, 0, 8);
                                if (C1 != null) {
                                    tfxVar = tfxVar3;
                                    tfx.o(tfxVar, "access_key", C1, 0, 0, 12);
                                } else {
                                    tfxVar = tfxVar3;
                                }
                                if (l != null) {
                                    List list5 = l;
                                    arrayList = new ArrayList(c5g.u(list5, 10));
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        arrayList.add(((VideoGetForPlayFieldsDto) it4.next()).i());
                                    }
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    tfxVar.i("fields", arrayList);
                                }
                                fz2 y = yfb.y(tfxVar, new ow60(i3));
                                ahn.D(y);
                                Context context3 = e43.a;
                                if (context3 == null) {
                                    context3 = null;
                                }
                                y.K("device_id", b6m.b(context3));
                                b = rsg0.y0(y, null, null, 3).K();
                            }
                            aVar = new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(b, new n3t(new b3m0(videoFile, i2), 28))), io.reactivex.rxjava3.internal.functions.a.g);
                        }
                        videoAutoPlay.Q.b(aVar.subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.f3s0
                            @Override // io.reactivex.rxjava3.functions.a
                            public final void run() {
                                VideoAutoPlay videoAutoPlay4 = VideoAutoPlay.this;
                                if (videoAutoPlay4.g1()) {
                                    d3b0 d3b0Var6 = videoAutoPlay4.p0;
                                    if (d3b0Var6 != null) {
                                        d3b0Var6.a();
                                    }
                                    videoFile.o0();
                                    new Exception();
                                }
                            }
                        }));
                    }
                    videoAutoPlay.l0();
                    videoAutoPlay.O1(false);
                    videoAutoPlay.i1();
                    s3q0 s3q0Var3 = s3q0.a;
                }
                return s3q0.a;
            default:
                Context context4 = (Context) this.c;
                ees0 ees0Var = (ees0) this.d;
                ClipboardManager clipboardManager = (ClipboardManager) context4.getSystemService("clipboard");
                if (clipboardManager == null) {
                    return s3q0.a;
                }
                ?? text = ees0Var.b.getText();
                str = text != 0 ? text : "";
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
                cvk.u(R.string.text_copied, false);
                return s3q0.a;
        }
    }

    public /* synthetic */ sf4(u5n0 u5n0Var, Photo photo, PhotoTag photoTag) {
        this.b = 25;
        this.c = u5n0Var;
        this.d = photo;
    }
}
