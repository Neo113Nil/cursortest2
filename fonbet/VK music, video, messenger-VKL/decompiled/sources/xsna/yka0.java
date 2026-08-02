package xsna;

import android.os.Looper;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchViewVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachesState;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.lists.ListDataSet;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vk.money.createtransfer.input.TransferInputFieldView;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.posting.presentation.model.VideoAttachParams;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.reefton.Reef;
import com.vk.stickers.keyboard.StickersView;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vk.video.profile.presentation.f;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import xsna.ala0;
import xsna.bhg0;
import xsna.gm50;
import xsna.h5c0;
import xsna.ikv0;
import xsna.iv20;
import xsna.l6c0;
import xsna.v1t0;
import xsna.xn50;
import xsna.yks0;
import xsna.z0o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yka0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yka0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARN: Type inference failed for: r11v24, types: [com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh] */
    /* JADX WARN: Type inference failed for: r2v80, types: [androidx.coordinatorlayout.widget.CoordinatorLayout$f] */
    /* JADX WARN: Type inference failed for: r4v32, types: [com.vk.catalog2.common.dto.api.ui.UIBlock] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [com.vk.catalog2.common.dto.ui.UIBlockList] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        CoownershipStatusUiDto coownershipStatusUiDto;
        NewsfeedCoowners newsfeedCoowners;
        VideoFile videoFile;
        Iterator it;
        int i = this.b;
        int i2 = 5;
        int i3 = 8;
        int i4 = 12;
        int i5 = 4;
        CoordinatorLayout.c<View> cVar = null;
        v1t0.c cVar2 = null;
        List<NewsfeedCoowners.CoownerRequest> list = null;
        ?? r9 = 1;
        int i6 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ala0 ala0Var = (ala0) obj2;
                ((zak0) ala0Var.n).setValue((ala0.b) ala0Var.f.get((String) obj));
                return s3q0.a;
            case 1:
                lfg lfgVar = ((PostFragment) obj2).J0;
                (lfgVar != null ? lfgVar : null).H7();
                return s3q0.a;
            case 2:
                l6c0 l6c0Var = (l6c0) obj2;
                nn50 nn50Var = l6c0Var.b;
                l6c0.a aVar = (l6c0.a) obj;
                NewsEntry newsEntry = aVar.a;
                if (newsEntry instanceof Post) {
                    Post post = (Post) newsEntry;
                    if (!post.Z1() && (newsfeedCoowners = post.f0) != null && (!newsfeedCoowners.g.isEmpty())) {
                        NewsfeedCoowners newsfeedCoowners2 = post.f0;
                        List<NewsfeedCoowners.CoownerRequest> list2 = newsfeedCoowners2 != null ? newsfeedCoowners2.g : null;
                        coownershipStatusUiDto = CoownershipStatusUiDto.None;
                        l6c0Var.e(new h5c0.a.C2973a(coownershipStatusUiDto, list2));
                        NewsfeedCoowners newsfeedCoowners3 = post.f0;
                        list = newsfeedCoowners3 != null ? newsfeedCoowners3.g : ((m5c0) nn50Var.getCurrentState()).o;
                        s5c0 s5c0Var = l6c0Var.f;
                        pn60 pn60Var = s5c0Var.b;
                        pn60 pn60Var2 = s5c0Var.b;
                        pn60Var.a();
                        return odq.c(s5c0Var.a, new aic(), new wc3(aVar.a, ((m5c0) nn50Var.getCurrentState()).d, aVar.c, pn60Var2, l6c0Var.h), new vc3(newsEntry, pn60Var2, coownershipStatusUiDto, list), new xc3(e43.a(newsEntry), null, pn60Var2, l6c0Var.i, null, true, null)).l(new uxb0(new juz(i4), true ? 1 : 0));
                    }
                }
                coownershipStatusUiDto = CoownershipStatusUiDto.None;
                s5c0 s5c0Var2 = l6c0Var.f;
                pn60 pn60Var3 = s5c0Var2.b;
                pn60 pn60Var22 = s5c0Var2.b;
                pn60Var3.a();
                return odq.c(s5c0Var2.a, new aic(), new wc3(aVar.a, ((m5c0) nn50Var.getCurrentState()).d, aVar.c, pn60Var22, l6c0Var.h), new vc3(newsEntry, pn60Var22, coownershipStatusUiDto, list), new xc3(e43.a(newsEntry), null, pn60Var22, l6c0Var.i, null, true, null)).l(new uxb0(new juz(i4), true ? 1 : 0));
            case 3:
                Pair pair = (Pair) ((gzs) obj).invoke();
                ((xgc0) obj2).e = new VideoAttachParams((Integer) ((HashMap) pair.i()).get("videos"), (Integer) ((HashMap) pair.i()).get("video_playlists"), (Integer) ((HashMap) pair.j()).get("videos"), (Integer) ((HashMap) pair.j()).get("video_playlists"));
                return s3q0.a;
            case 4:
                ((com.vk.attachpicker.screen.l) obj2).g();
                return s3q0.a;
            case 5:
                com.vk.auth.modal.qrwithcode.a aVar2 = (com.vk.auth.modal.qrwithcode.a) obj2;
                iv20.b bVar = aVar2.d;
                if (bVar == null) {
                    bVar = null;
                }
                String str = bVar.e;
                ufx ufxVar = new ufx("auth.checkValidationStatus", new k73(i5), new pm0(i2));
                ufx.n(ufxVar, "auth_code", str, 0, 12);
                return new io.reactivex.rxjava3.internal.operators.single.d0(rdx0.p(e370.e(ufxVar)).l(new did0(new ow60(i3), true ? 1 : 0)), new yq(aVar2, 26), null);
            case 6:
                ((dof0) obj2).d.b();
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
            case 7:
                Attach attach = (Attach) obj;
                return Boolean.valueOf((attach instanceof AttachWithTranscription) && ((AttachWithTranscription) attach).getId() == ((AttachWithTranscription) obj2).getId());
            case 8:
                ReviewHeaderView reviewHeaderView = (ReviewHeaderView) obj2;
                eig0<bhg0> eig0Var = reviewHeaderView.j;
                if (eig0Var != null) {
                    ImageView imageView = reviewHeaderView.f;
                    eig0Var.a(new bhg0.a(imageView != null ? imageView : null));
                }
                return s3q0.a;
            case 9:
                io.reactivex.rxjava3.core.w wVar = (io.reactivex.rxjava3.core.w) obj2;
                io.reactivex.rxjava3.core.k i7 = io.reactivex.rxjava3.core.k.i((io.reactivex.rxjava3.core.p) obj);
                if (!epx.f(Looper.getMainLooper(), Looper.myLooper())) {
                    i7 = i7.k(wVar);
                }
                int i8 = 24;
                return new io.reactivex.rxjava3.internal.operators.maybe.f(i7, new uq(new nyq(i8), i8));
            case 10:
                ((nah0) obj2).o.c(false);
                return s3q0.a;
            case 11:
                StickersView stickersView = (StickersView) obj2;
                com.vk.stickers.keyboard.navigation.a aVar3 = stickersView.v;
                ArrayList arrayList = new ArrayList(aVar3.h);
                g5g.D(arrayList, true, new p2u(i5));
                aVar3.setItems(arrayList);
                stickersView.m(false);
                int b = stickersView.n.j ? cn70.b(8) + stickersView.o.getHeight() : cn70.b(8);
                ikv0.a aVar4 = new ikv0.a(stickersView.getContext());
                aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_accent_blue), (Size) null, 12);
                aVar4.u = new ikv0.d(stickersView.getContext().getString(R.string.stickers_keyboard_ugc_hidden_title), (String) null, new ikv0.d.a(stickersView.getContext().getString(R.string.stickers_keyboard_ugc_hidden_subtitle), null, new qhg0(stickersView, i2), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
                aVar4.l = 80;
                aVar4.o = Integer.valueOf(b);
                aVar4.e = 3000L;
                aVar4.o(stickersView);
                return s3q0.a;
            case 12:
                View view = (View) obj;
                View.OnClickListener onClickListener = ((cmm0) obj2).c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                return s3q0.a;
            case 13:
                ((ymn0) obj2).o = (azl) obj;
                return s3q0.a;
            case 14:
                TaggedItemsBottomSheet taggedItemsBottomSheet = (TaggedItemsBottomSheet) obj2;
                int i9 = TaggedItemsBottomSheet.o1;
                yzt0<Throwable> yzt0Var = ((z0o0.b) obj).a;
                b1o0 b1o0Var = new b1o0(i6);
                taggedItemsBottomSheet.getClass();
                gm50.a.a(taggedItemsBottomSheet, yzt0Var, b1o0Var);
                return s3q0.a;
            case 15:
                TransferInputField.a aVar5 = ((TransferInputFieldView) obj2).n;
                if (aVar5 != null) {
                    aVar5.e();
                }
                return s3q0.a;
            case 16:
                ListDataSet listDataSet = (ListDataSet) obj2;
                SparseArray sparseArray = (SparseArray) obj;
                int size = sparseArray.size();
                while (i6 < size) {
                    listDataSet.F(sparseArray.keyAt(i6), (u1c0) sparseArray.valueAt(i6));
                    i6++;
                }
                return s3q0.a;
            case 17:
                ((k7q0) obj2).P4(((View) obj).getId());
                return s3q0.a;
            case 18:
                ((fpq0) obj2).C(UserProfileAction.b.c.b);
                return s3q0.a;
            case 19:
                AttachVideo attachVideo = (AttachVideo) obj2;
                SimpleAttachesState simpleAttachesState = (SimpleAttachesState) obj;
                List<SimpleAttachListItem> list3 = simpleAttachesState.f;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (SimpleAttachListItem simpleAttachListItem : list3) {
                    Attach attach2 = simpleAttachListItem.b.d;
                    AttachVideo attachVideo2 = attach2 instanceof AttachVideo ? (AttachVideo) attach2 : null;
                    if (attachVideo2 != null && attachVideo2.getId() == attachVideo.getId()) {
                        HistoryAttach historyAttach = simpleAttachListItem.b;
                        attachVideo2.b.N6(false);
                        s3q0 s3q0Var = s3q0.a;
                        simpleAttachListItem = new SimpleAttachListItem(HistoryAttach.zb(historyAttach, attachVideo2, null, 123));
                    }
                    arrayList2.add(simpleAttachListItem);
                }
                return SimpleAttachesState.Fb(simpleAttachesState, arrayList2);
            case 20:
                yks0 yks0Var = (yks0) obj2;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof wxr0) {
                    videoFile = ((wxr0) bwr0Var).a;
                } else if (bwr0Var instanceof fyr0) {
                    videoFile = ((fyr0) bwr0Var).a;
                } else if (bwr0Var instanceof oxr0) {
                    videoFile = ((oxr0) bwr0Var).a;
                } else if (bwr0Var instanceof qxr0) {
                    qxr0 qxr0Var = (qxr0) bwr0Var;
                    videoFile = qxr0Var.a.I0().b == yks0Var.e.I0().b ? yks0Var.e : qxr0Var.a;
                } else if (bwr0Var instanceof axr0) {
                    videoFile = ((axr0) bwr0Var).a;
                } else if (bwr0Var instanceof cxr0) {
                    videoFile = ((cxr0) bwr0Var).a;
                } else if (bwr0Var instanceof fxr0) {
                    yks0Var.e.q6(Boolean.TRUE);
                    videoFile = yks0Var.e;
                } else {
                    videoFile = null;
                }
                if (bwr0Var instanceof axr0) {
                    cVar2 = new v1t0.c(true);
                } else if (bwr0Var instanceof cxr0) {
                    cVar2 = new v1t0.c(false);
                }
                if (videoFile != null && epx.f(videoFile.a1(), yks0Var.e.a1())) {
                    yks0Var.j(videoFile);
                    if (bwr0Var instanceof oxr0) {
                        yks0Var.i(((oxr0) bwr0Var).b);
                    }
                    if (bwr0Var instanceof qxr0) {
                        ((qxr0) bwr0Var).getClass();
                    }
                    Iterator it2 = yks0Var.f.iterator();
                    while (it2.hasNext()) {
                        ((yks0.a) it2.next()).He(e43.m(cVar2), yks0Var.e);
                    }
                }
                return s3q0.a;
            case 21:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                int i10 = VideoMinimizableDiscoveryFragment.p1;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, (com.vk.video.ui.discovery.minimizable.c) obj);
                return s3q0.a;
            case 22:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) obj2;
                int i11 = VideoOfflineFragment.f1;
                List<czs0> list4 = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                for (czs0 czs0Var : list4) {
                    videoOfflineFragment.requireContext();
                    arrayList3.add(dzs0.a(czs0Var, videoOfflineFragment.I0.f()));
                }
                return arrayList3;
            case 23:
                ?? r11 = (VideoPlaylistRootVh) obj2;
                oyp0 oyp0Var = (oyp0) obj;
                UIBlockCatalog uIBlockCatalog = r11.z;
                if (uIBlockCatalog != null) {
                    ArrayList<UIBlock> arrayList4 = uIBlockCatalog.A;
                    if (arrayList4 == null || !arrayList4.isEmpty()) {
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            ArrayList<UIBlock> arrayList5 = ((UIBlockList) ((UIBlock) it3.next())).y;
                            if (arrayList5 == null || !arrayList5.isEmpty()) {
                                Iterator it4 = arrayList5.iterator();
                                while (it4.hasNext()) {
                                    if (((UIBlock) it4.next()) instanceof UIBlockVideo) {
                                        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList4, 10));
                                        it = arrayList4.iterator();
                                        while (it.hasNext()) {
                                            ?? r4 = (UIBlock) it.next();
                                            if (epx.f(r4.b, oyp0Var.a.b)) {
                                                r4 = oyp0Var.a;
                                            }
                                            arrayList6.add(r4);
                                        }
                                        UIBlockList uIBlockList = uIBlockCatalog.y;
                                        UIBlockCatalog uIBlockCatalog2 = new UIBlockCatalog(uIBlockList, uIBlockList, arrayList6, uIBlockCatalog.B, uIBlockCatalog.D, uIBlockCatalog.j, uIBlockCatalog.g, uIBlockCatalog.E, null, 256, null);
                                        if (r9 == 0) {
                                            r11.z = uIBlockCatalog2;
                                            UIBlockList uIBlockList2 = oyp0Var.a;
                                            if (uIBlockList2 != null) {
                                                r11.r0(uIBlockList2);
                                            }
                                            View view2 = r11.A;
                                            ?? r2 = (CoordinatorLayout.f) (view2 != null ? view2.getLayoutParams() : null);
                                            ArrayList<UIBlock> arrayList7 = oyp0Var.a.y;
                                            if (arrayList7 == null || !arrayList7.isEmpty()) {
                                                Iterator it5 = arrayList7.iterator();
                                                while (it5.hasNext()) {
                                                    if (((UIBlock) it5.next()) instanceof UIBlockPlaceholder) {
                                                        r2.c(cVar);
                                                    }
                                                }
                                            }
                                            cVar = r11.B;
                                            r2.c(cVar);
                                        } else {
                                            r11.N6(uIBlockCatalog2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    r9 = 0;
                    ArrayList arrayList62 = new ArrayList(c5g.u(arrayList4, 10));
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                    }
                    UIBlockList uIBlockList3 = uIBlockCatalog.y;
                    UIBlockCatalog uIBlockCatalog22 = new UIBlockCatalog(uIBlockList3, uIBlockList3, arrayList62, uIBlockCatalog.B, uIBlockCatalog.D, uIBlockCatalog.j, uIBlockCatalog.g, uIBlockCatalog.E, null, 256, null);
                    if (r9 == 0) {
                    }
                }
                return s3q0.a;
            case 24:
                ((h9t0) obj2).e.invoke(f.h.c.b);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 25:
                ((ggu0) obj2).O = ((AddActionSuggestion) obj).g;
                return s3q0.a;
            case 26:
                int i12 = VkCardForm.g;
                View findViewById = ((View) obj).findViewById(R.id.text_field_right_icon);
                izs<? super View, s3q0> izsVar = ((VkCardForm) obj2).e;
                if (izsVar != null) {
                    izsVar.invoke(findViewById);
                }
                return s3q0.a;
            case 27:
                ((ytu0) obj2).b.invoke();
                return s3q0.a;
            case 28:
                return lcv0.e((lcv0) obj2);
            default:
                return ((VkSearchViewVh) obj2).d.a(((pno0) obj).d().toString());
        }
    }
}
