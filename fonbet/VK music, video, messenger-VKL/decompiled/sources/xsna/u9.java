package xsna;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.antispam.ProfileSpamAction;
import com.vk.api.base.Document;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.snackbar.HideReason;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.picture.VkImage;
import com.vk.documents.impl.list.DocumentsListFragment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.hints.Hint;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.popup.Popup;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.a0;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.ModalPostAllReactionsFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.b;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.multiaccount.api.SessionUnavailableType;
import com.vk.superapp.multiaccount.api.ValidationRequiredType;
import com.vk.superapp.multiaccount.api.f;
import com.vk.superapp.multiaccount.api.j;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import xsna.b4;
import xsna.fcw;
import xsna.g05;
import xsna.gcw;
import xsna.god0;
import xsna.gwc;
import xsna.i340;
import xsna.kx30;
import xsna.ldm;
import xsna.nfd0;
import xsna.oap;
import xsna.p1s;
import xsna.p8a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (com.vk.permission.PermissionHelper.o(r10.requireContext()) == false) goto L32;
     */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        VideoFile A;
        int i;
        Collection collection;
        String str;
        int i2 = this.b;
        int i3 = 4;
        int i4 = 5;
        int i5 = 3;
        boolean z = false;
        z = false;
        String str2 = null;
        Object obj2 = null;
        Object obj3 = null;
        str2 = null;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i2) {
            case 0:
                com.vk.libvideo.bottomsheet.about.delegate.a0 a0Var = (com.vk.libvideo.bottomsheet.about.delegate.a0) obj5;
                c4 c4Var = ((a0.a) obj4).l;
                if (a0Var.b && a0Var.c) {
                    c4Var.d(b4.g0.a);
                } else {
                    c4Var.d(b4.j0.a);
                }
                return s3q0.a;
            case 1:
                AttachVideoFragment.b bVar = (AttachVideoFragment.b) obj5;
                VideoFile videoFile = (VideoFile) obj4;
                VkImage vkImage = (VkImage) obj;
                bpn0 bpn0Var = VideoOverlayView.I;
                VkImage vkImage2 = bVar.q;
                VideoOverlayView videoOverlayView = bVar.w;
                View view = videoFile.W9() ? bVar.v : bVar.u;
                boolean c = fxc0.B().c(videoFile);
                VideoRestriction O = videoFile.O();
                com.vk.libvideo.design.view.overlay.b a = O != null ? ((a390) bVar.C.getValue()).a(O) : null;
                boolean z2 = videoFile.d8() || videoFile.z0();
                VideoPipStateHolder.a.getClass();
                yg5 c2 = VideoPipStateHolder.c();
                if (c2 != null && (A = c2.A()) != null) {
                    str2 = A.a1();
                }
                boolean f = epx.f(str2, videoFile.a1());
                i1t0 i1t0Var = (i1t0) bVar.D.getValue();
                b44 b44Var = new b44(bVar, videoFile, vkImage, z ? 1 : 0);
                w5 w5Var = new w5(bVar, i4);
                int i6 = 6;
                VideoOverlayView.b.a(new VideoOverlayView.a(vkImage2, videoOverlayView, b44Var, w5Var, view, false, false, c, new j1(videoFile, i6), new defpackage.f0(i3, bVar, videoFile), a, z2, f, new com.vk.movika.sdk.base.ui.f(bVar, i6), i1t0Var, null, 65760));
                return s3q0.a;
            case 2:
                x94 x94Var = (x94) obj5;
                final ha4 ha4Var = ((na4) obj4).a;
                int i7 = x94Var.d;
                if (i7 >= 0) {
                    return ha4Var.b(x94Var.a);
                }
                final x94 x94Var2 = new x94(x94Var.a, x94Var.c, i7 + 1, x94Var.b);
                return io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.ga4
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        ha4 ha4Var2 = ha4.this;
                        ConcurrentHashMap<Long, x94> concurrentHashMap = ha4Var2.b;
                        x94 x94Var3 = x94Var2;
                        if (concurrentHashMap.containsKey(Long.valueOf(x94Var3.c()))) {
                            ha4Var2.b.put(Long.valueOf(x94Var3.c()), x94Var3);
                            ha4Var2.d.onNext(x94Var3);
                        }
                    }
                });
            case 3:
                g05 g05Var = (g05) obj5;
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.d()).intValue();
                float[] fArr = (float[]) pair.g();
                g05.a aVar = g05Var.b.get((String) obj4);
                g05.d dVar = aVar instanceof g05.d ? (g05.d) aVar : null;
                if (dVar != null) {
                    b05 b05Var = dVar.b;
                    b05Var.b = fArr;
                    b05Var.e = intValue;
                }
                g05Var.a.a();
                return s3q0.a;
            case 4:
                return new AboutVideoItem.d.InterfaceC1215d.b((String) obj4, ((VideoMinimizableState) obj) instanceof VideoMinimizableState.Expanded ? (Hint) obj5 : null);
            case 5:
                fcw.a aVar2 = (fcw.a) obj5;
                my8 my8Var = (my8) obj4;
                kx30.a aVar3 = (kx30.a) obj;
                List<zpp<Dialog>> list = aVar3.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list) {
                    if (((Boolean) my8Var.b.invoke(((zpp) obj6).a)).booleanValue()) {
                        arrayList.add(obj6);
                    }
                }
                List<zpp<Dialog>> list2 = aVar3.a;
                HashMap hashMap = new HashMap(list2.size());
                for (zpp<Dialog> zppVar : list2) {
                    hashMap.put(zppVar.a.Sb(), (Boolean) my8Var.c.invoke(zppVar.a));
                }
                return new gcw.c(arrayList, hashMap, aVar3.d, new ImSearchLocalRequestLoggingInfo(aVar2.a, aVar2.c, aVar3.g, 0, aVar2.d, null, 0, false, 232, null));
            case 6:
                gwc gwcVar = (gwc) obj5;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj4;
                gwcVar.j = null;
                int i8 = gwc.a.$EnumSwitchMapping$0[((HideReason) obj).ordinal()];
                if (i8 == 1 || i8 == 2 || i8 == 3 || i8 == 4) {
                    VideoFile A2 = k15.A(sdkVideoFile);
                    wjs0.a(new oxr0(A2, true));
                    zfj0.a(gwcVar.b, A2, new pd(gwcVar, 23));
                } else if (i8 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 7:
                ComposeHeaderShowAllVh composeHeaderShowAllVh = (ComposeHeaderShowAllVh) obj5;
                hg1.b(composeHeaderShowAllVh.a(), eda.c(composeHeaderShowAllVh.q, (String) obj, new oap.a((Context) obj4), null, 12));
                return s3q0.a;
            case 8:
                ((tij) obj5).h1((nfd0.b) obj4);
                return s3q0.a;
            case 9:
                ((ddl) obj5).n().c(((cwj) obj4).a);
                return s3q0.a;
            case 10:
                List list3 = (List) obj;
                return new d0l((Long) list3.get(0), (Long) list3.get(1), new k9x(((Integer) list3.get(2)).intValue(), ((Integer) list3.get(3)).intValue(), 1), ((Integer) list3.get(4)).intValue(), (eai0) obj5, (Locale) obj4);
            case 11:
                xam xamVar = (xam) obj5;
                FragmentActivity fragmentActivity = xamVar.i;
                List<ProfileSpamAction> list4 = (List) obj4;
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                for (ProfileSpamAction profileSpamAction : list4) {
                    if (epx.f(profileSpamAction, ProfileSpamAction.DeleteChat.b)) {
                        i = R.string.vkim_msg_header_spam_progress_desc;
                    } else if (epx.f(profileSpamAction, ProfileSpamAction.BlackList.b)) {
                        i = R.string.vkim_msg_header_ban_chat_progress_desc;
                    } else {
                        if (!epx.f(profileSpamAction, ProfileSpamAction.Report.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.vkim_msg_header_report_spam_progress_desc;
                    }
                    arrayList2.add(fragmentActivity.getString(i));
                }
                String g0 = arrayList2.size() < 2 ? (String) j5g.a0(arrayList2) : j5g.g0(arrayList2, ". ", null, ".", 0, null, 58);
                if (g0 == null) {
                    g0 = "";
                }
                String str3 = g0;
                zam zamVar = xamVar.u;
                if (zamVar != null) {
                    com.vk.im.popup.a a2 = zamVar.a();
                    ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                    imFeatures.getClass();
                    a2.b(new Popup.c(0, 3, null, str3, com.vk.toggle.b.A.a(imFeatures)), new bzj(zamVar, i5));
                }
                return s3q0.a;
            case 12:
                pdm pdmVar = (pdm) obj5;
                rdm rdmVar = (rdm) obj4;
                ldm i9 = pdmVar.i();
                i9.getClass();
                List singletonList = Collections.singletonList(rdmVar);
                ArrayList arrayList3 = new ArrayList();
                tgl0 tgl0Var = i9.b;
                tgl0Var.b().h(new eo3(singletonList, i9, arrayList3, i4));
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
                }
                if (arrayList4.isEmpty()) {
                    collection = EmptyList.b;
                } else if (arrayList4.size() == 1) {
                    collection = e43.m(i9.b(((Number) j5g.X(arrayList4)).intValue()));
                } else {
                    Cursor d = tgl0Var.b().d(i9.a.b(arrayList4, ldm.a.ID), null);
                    ArrayList arrayList5 = new ArrayList(d.getCount());
                    Trace.beginSection(ndp0.f("Cursor.forEach"));
                    try {
                        try {
                            if (d.moveToFirst()) {
                                while (!d.isAfterLast()) {
                                    arrayList5.add(ldm.c(d));
                                    d.moveToNext();
                                }
                            }
                        } finally {
                            d.close();
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                int i10 = rdmVar.a;
                rey k = pdmVar.b.I0().k();
                List list5 = EmptyList.b;
                String string = k.getString("folders_order");
                if (string != null) {
                    list5 = f370.J(new JSONArray(string));
                }
                boolean contains = list5.contains(Integer.valueOf(i10));
                ArrayList arrayList6 = new ArrayList(list5);
                if (!contains) {
                    arrayList6.add(Integer.valueOf(i10));
                    pdmVar.q(arrayList6);
                }
                return s3q0.a;
            case 13:
                int i11 = DocumentsListFragment.V;
                Context requireContext = ((DocumentsListFragment) obj4).requireContext();
                rp1 rp1Var = new rp1(9, (Document) obj5, requireContext);
                if (gz80.a(34)) {
                    rp1Var.invoke();
                } else {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    permissionHelper.getClass();
                    permissionHelper.d(requireContext, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, rp1Var, null);
                }
                return s3q0.a;
            case 14:
                ((wfo) obj5).e(obj4);
                return s3q0.a;
            case 15:
                izs izsVar = (izs) obj5;
                gmq gmqVar = (gmq) obj4;
                Throwable th = (Throwable) obj;
                L.i(th);
                h03.b(th);
                if (izsVar != null) {
                    izsVar.invoke(gmqVar);
                }
                return s3q0.a;
            case 16:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "FoldersToolbar");
                Context context = ((ViewGroup) ((View) obj4)).getContext();
                qgi0.h(tgi0Var, ((com.vk.folders.impl.configure.h) obj5).f ? context.getString(R.string.vkim_folder_create_title) : context.getString(R.string.vkim_folder_configure_title));
                return s3q0.a;
            case 17:
                t1s t1sVar = (t1s) obj5;
                xyr xyrVar = (xyr) obj4;
                wzr wzrVar = (wzr) obj;
                VkContextMenu vkContextMenu = t1sVar.u;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                t1sVar.u = null;
                t1sVar.O(new p1s.d(xyrVar, wzrVar));
                return s3q0.a;
            case 18:
                RectF rectF = (RectF) obj5;
                HighlightEditFragment highlightEditFragment = (HighlightEditFragment) obj4;
                int i12 = HighlightEditFragment.h0;
                Bitmap g = kd7.g(highlightEditFragment.requireContext(), Bitmap.createBitmap((Bitmap) obj, (int) (r0.getWidth() * rectF.left), (int) (r0.getHeight() * rectF.top), (int) ((rectF.right - rectF.left) * r0.getWidth()), (int) ((rectF.bottom - rectF.top) * r0.getHeight())));
                VKCircleImageView vKCircleImageView = highlightEditFragment.U;
                (vKCircleImageView != null ? vKCircleImageView : null).setImageBitmap(g);
                return s3q0.a;
            case 19:
                ((wh50) obj4).setValue(new pco(((azl) obj5).j1((int) (((tny) obj).a() & 4294967295L))));
                return s3q0.a;
            case 20:
                return CatalogSectionState.a((CatalogSectionState) obj, (ArrayList) ((wxm) obj5).b, false, false, null, null, false, null, null, ((CatalogSectionDo) obj4).d, null, 6139);
            case 21:
                int i13 = ModalPostAllReactionsFragment.Z;
                ((ModalPostAllReactionsFragment) obj5).fo((List) obj, epx.f(((b.d) obj4).b.a(), Boolean.TRUE));
                return s3q0.a;
            case 22:
                i340 i340Var = (i340) obj4;
                f.a aVar4 = (f.a) obj;
                int i14 = i340.g.$EnumSwitchMapping$0[((SessionUnavailableType) obj5).ordinal()];
                if (i14 == 1) {
                    return new f.c.C1893c(aVar4.a(), ValidationRequiredType.FULL_AUTH);
                }
                com.vk.superapp.multiaccount.api.j jVar = j.e.b;
                if (i14 == 2) {
                    Iterator it2 = g5g.E(i340Var.d(), f.c.a.class).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (epx.f(((f.c.a) next).d.b, aVar4.a().b)) {
                                obj3 = next;
                            }
                        }
                    }
                    f.c.a aVar5 = (f.c.a) obj3;
                    com.vk.superapp.multiaccount.api.g a3 = aVar4.a();
                    if (aVar5 != null) {
                        jVar = aVar5.e;
                    }
                    return new f.c.a(a3, jVar);
                }
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it3 = g5g.E(i340Var.d(), f.c.b.class).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (epx.f(((f.c.b) next2).d.b, aVar4.a().b)) {
                            obj2 = next2;
                        }
                    }
                }
                f.c.b bVar2 = (f.c.b) obj2;
                com.vk.superapp.multiaccount.api.g a4 = aVar4.a();
                if (bVar2 != null) {
                    jVar = bVar2.e;
                }
                return new f.c.b(a4, jVar);
            case 23:
                u440 u440Var = (u440) obj5;
                u440Var.U7((tam0) obj4);
                if (u440Var.getCurrentIndex() == 0) {
                    u440Var.e8();
                }
                return s3q0.a;
            case 24:
                PhotoAlbum photoAlbum = (PhotoAlbum) obj5;
                p8a0.d dVar2 = (p8a0.d) obj4;
                ImageSize Cb = photoAlbum.u.Cb(dVar2.o.getWidth(), true, false);
                if (Cb == null || (str = Cb.d.d) == null) {
                    str = photoAlbum.k;
                }
                dVar2.o.load(str);
                return s3q0.a;
            case 25:
                FrameLayout frameLayout = (FrameLayout) obj5;
                PostingAttachGalleryFragment postingAttachGalleryFragment = (PostingAttachGalleryFragment) obj4;
                int i15 = PostingAttachGalleryFragment.p0;
                if (((Boolean) obj).booleanValue()) {
                    if (postingAttachGalleryFragment.i0) {
                        PermissionHelper permissionHelper2 = PermissionHelper.a;
                        Context requireContext2 = postingAttachGalleryFragment.requireContext();
                        permissionHelper2.getClass();
                        if (!PermissionHelper.b(requireContext2, PermissionHelper.e)) {
                            break;
                        }
                    }
                    z = true;
                }
                bwt0.p0(frameLayout, z);
                return s3q0.a;
            case 26:
                nk0 nk0Var = (nk0) obj4;
                c5u c5uVar = (c5u) ((LinkedHashMap) obj5).get((MarketProductTileConfig) obj);
                if (c5uVar != null) {
                    nk0Var.invoke(c5uVar);
                }
                return s3q0.a;
            case 27:
                ((bkd0) obj5).o.a((QuickMessageItem) obj, (Context) obj4);
                return s3q0.a;
            case 28:
                god0.a aVar6 = (god0.a) obj4;
                vcr vcrVar = (vcr) obj;
                ncr<vcr<?>> ncrVar = ((god0) obj5).b;
                if (ncrVar != null) {
                    ncrVar.c(vcrVar);
                }
                aVar6.a(null);
                return s3q0.a;
            default:
                Iterator<f360> it4 = ((r9e0) obj5).d.iterator();
                while (it4.hasNext()) {
                    it4.next().getClass();
                }
                return s3q0.a;
        }
    }
}
