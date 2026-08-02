package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerItem;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.chat_profile.ChatProfileBottomSheetBuilder;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.MsgPartGroupCallHolderItem;
import com.vk.im.ui.formatters.a;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.profile.user.impl.ui.b;
import com.vk.reefton.Reef;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.navigation.KeyboardNavigationButton;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.fmc0;
import xsna.ikv0;
import xsna.rls;
import xsna.tlo0;
import xsna.tma0;
import xsna.v810;
import xsna.x7j0;
import xsna.xn50;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class b810 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b810(Peer peer, fv30 fv30Var, u6p u6pVar, Peer peer2) {
        this.b = 5;
        this.c = peer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v132, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        la10 b;
        pk30 pk30Var;
        tlo0.a aVar;
        int i;
        Photo photo;
        Photo photo2;
        Object obj2;
        int i2;
        int i3 = this.b;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                c810 c810Var = (c810) obj3;
                ?? r1 = c810Var.n1;
                v810 v810Var = (v810) obj;
                int i4 = c810.o1;
                if (v810Var instanceof v810.c.b) {
                    v810.c.b bVar = (v810.c.b) v810Var;
                    ((z810) r1.getValue()).c(bVar.b);
                    zl20 zl20Var = c810Var.i1;
                    if (zl20Var != null) {
                        zl20Var.invoke(bVar.a);
                    }
                    c810Var.hide();
                } else if (v810Var instanceof v810.c.a) {
                    mgz mgzVar = c810Var.j1;
                    if (mgzVar != null) {
                        mgzVar.invoke(((v810.c.a) v810Var).a);
                    }
                } else if (v810Var instanceof x810) {
                    ((z810) r1.getValue()).c(((x810) v810Var).a);
                } else if (v810Var instanceof w810) {
                    ((z810) r1.getValue()).a();
                } else if (v810Var instanceof v810.d) {
                    f910 f910Var = c810Var.k1;
                    if (f910Var != null) {
                        String str = ((v810.d) v810Var).a;
                        Context context = f910Var.c;
                        ikv0.a aVar2 = new ikv0.a(context);
                        aVar2.u = str != null ? new ikv0.d(str, (String) null, (ikv0.d.a) null, 6) : new ikv0.d(context.getString(R.string.attach_multipicker_limit_error_title), context.getString(R.string.attach_multipicker_limit_error_subtitle), (ikv0.d.a) null, 4);
                        aVar2.o = Integer.valueOf(iah0.a(8));
                        aVar2.l = 80;
                        aVar2.o((ViewGroup) f910Var.f.findViewById(R.id.toast_view_group));
                    }
                } else if (v810Var instanceof v810.a) {
                    f910 f910Var2 = c810Var.k1;
                    if (f910Var2 != null && (b = f910Var2.b()) != null) {
                        la10.J0(b);
                    }
                } else {
                    if (!(v810Var instanceof v810.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j03.l(((v810.b) v810Var).a);
                }
                return s3q0.a;
            case 1:
                return MediaPickerMviState.a((MediaPickerMviState) obj, 0, null, false, null, MediaPickerMviState.Medias.Loaded.a((MediaPickerMviState.Medias.Loaded) obj3, null, null, MediaPickerMviState.Pagination.Loading, 7), 31);
            case 2:
                ((th20) obj3).b.invoke();
                return s3q0.a;
            case 3:
                return ((a.f) obj).a((List) obj3);
            case 4:
                er30 er30Var = (er30) obj3;
                MsgPartGroupCallHolderItem msgPartGroupCallHolderItem = er30Var.k;
                Msg msg = msgPartGroupCallHolderItem != null ? msgPartGroupCallHolderItem.p : null;
                Attach attach = msgPartGroupCallHolderItem != null ? msgPartGroupCallHolderItem.r : null;
                r3 = (msgPartGroupCallHolderItem != null ? msgPartGroupCallHolderItem.m : null) == MsgPartGroupCallHolderItem.AttachGroupCallInProgressType.AttachGroupCallFinished;
                if (msg != null && attach != null && r3 && (pk30Var = er30Var.j) != null) {
                    pk30Var.R(attach, msg, msgPartGroupCallHolderItem != null ? msgPartGroupCallHolderItem.q : null);
                }
                return s3q0.a;
            case 5:
                return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            case 6:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.x1(ggjVar, (yk8) obj3, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 9, 62);
                return s3q0.a;
            case 7:
                l650 l650Var = (l650) obj3;
                if (!((List) obj).isEmpty()) {
                    rbk0 rbk0Var = l650Var.i;
                    rbk0Var.b.L0(rbk0Var.b());
                }
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((yj50) obj3).d.isInstance((kj50) obj));
            case 9:
                ((o660) obj3).b.invoke(new zxd0.c(((ChatProfileBottomSheetBuilder.CallOption) obj) == ChatProfileBottomSheetBuilder.CallOption.VIDEO));
                return s3q0.a;
            case 10:
                b960 b960Var = (b960) obj3;
                if (((Boolean) obj).booleanValue()) {
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = b960Var.d;
                    (izsVar != null ? izsVar : null).invoke(b.m.b);
                }
                return s3q0.a;
            case 11:
                yp80 yp80Var = (yp80) obj3;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 12:
                ((xz70) obj3).c();
                return s3q0.a;
            case 13:
                ((p990) obj3).l.b(rls.c.a);
                return s3q0.a;
            case 14:
                vka0 vka0Var = (vka0) obj3;
                tdu tduVar = (tdu) obj;
                tduVar.Y0(lkp0.b);
                tduVar.A(vka0Var.a);
                tduVar.B(vka0Var.a);
                return s3q0.a;
            case 15:
                tma0 tma0Var = (tma0) obj3;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new p5y(tma0Var, 20), f9t.z(tma0Var.eo()), (bna0) tma0Var.l1.getValue());
                g47Var.d(new tma0.b(tma0Var.eo()));
                l370.n(g47Var, f9t.w(tma0Var.eo()), new y8m(23));
                return s3q0.a;
            case 16:
                hib0 hib0Var = (hib0) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VkButton vkButton = hib0Var.i;
                View view = hib0Var.b;
                vkButton.setEnabled(true);
                hib0Var.c(booleanValue);
                int i5 = booleanValue ? R.string.podcasts_subscribed : R.string.podcasts_unsubscribed;
                ikv0.a aVar3 = new ikv0.a(view.getContext());
                aVar3.u = new ikv0.d(view.getContext().getString(i5), (String) null, (ikv0.d.a) null, 6);
                aVar3.n();
                return s3q0.a;
            case 17:
                nxb0 nxb0Var = (nxb0) obj3;
                nxb0Var.b(nyb0.a(nxb0Var.b, null, null, true, 3));
                return s3q0.a;
            case 18:
                ((wgc0) obj3).a.e(fmc0.w.a.a);
                return s3q0.a;
            case 19:
                ((qkc0) obj3).d.getClass();
                PostEditableData postEditableData = ((PostingState.Editing) obj).i;
                if (x19.G(postEditableData.i) && postEditableData.A) {
                    r3 = true;
                }
                return Boolean.valueOf(r3);
            case 20:
                cme0 cme0Var = (cme0) obj3;
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                    com.vk.qrcode.d.a(cme0Var);
                }
                return s3q0.a;
            case 21:
                Throwable th2 = (Throwable) obj;
                aof0 aof0Var = ((com.vk.reefton.trackers.g) obj3).d;
                if (aof0Var != null) {
                    aof0Var.b();
                }
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a(th2);
                return s3q0.a;
            case 22:
                e2h0 e2h0Var = (e2h0) obj3;
                wh50 wh50Var = (wh50) obj;
                if (!(wh50Var instanceof yak0)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                yak0 yak0Var = (yak0) wh50Var;
                return androidx.compose.runtime.k.a(yak0Var.getValue() != 0 ? e2h0Var.k(yak0Var.getValue()) : null, yak0Var.d());
            case 23:
                Throwable th3 = ((thg0) obj).d;
                ((shg0) obj3).getClass();
                if (th3 == null || !h03.a(th3)) {
                    aVar = tlo0.Companion;
                    i = R.string.community_review_initial_state_loading_error_title;
                } else {
                    aVar = tlo0.Companion;
                    i = R.string.community_review_initial_state_loading_internet_error_title;
                }
                return tq.h(aVar, i);
            case 24:
                ((zak0) ((sjg0) obj3).n).setValue((String) obj);
                return s3q0.a;
            case 25:
                ((io.reactivex.rxjava3.core.y) obj3).onSuccess((SessionRoomId) obj);
                return s3q0.a;
            case 26:
                VKList vKList = (VKList) obj;
                xn50.a.c((e8j0) obj3, new x7j0.g(vKList, vKList.j()));
                return s3q0.a;
            case 27:
                cvj0 cvj0Var = (cvj0) obj3;
                ?? r12 = cvj0Var.Y;
                Photo photo3 = (Photo) obj;
                PhotoAttachment photoAttachment = (PhotoAttachment) cvj0Var.C;
                if (photoAttachment != null && (photo2 = photoAttachment.l) != null) {
                    photo2.r = photo3.r;
                }
                if (photoAttachment != null && (photo = photoAttachment.l) != null) {
                    photo.x = photo3.x;
                }
                ((p870) r12.getValue()).e(120, cvj0Var.C);
                ((p870) r12.getValue()).e(113, photo3);
                cvj0Var.z5();
                return s3q0.a;
            case 28:
                StickersView stickersView = (StickersView) obj3;
                List<StickerItem> list = (List) obj;
                ral0 ral0Var = stickersView.z;
                sal0 sal0Var = ral0Var.c;
                if (sal0Var != null) {
                    com.vk.stickers.keyboard.page.a aVar4 = sal0Var.c;
                    int i6 = aVar4.p;
                    Object[] objArr = i6 > 0;
                    ArrayList arrayList = new ArrayList(aVar4.h);
                    for (int i7 = 0; i7 < i6; i7++) {
                        arrayList.remove(0);
                    }
                    aVar4.setItems(arrayList);
                    List<StickerItem> list2 = list;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(aVar4.L0((StickerItem) it.next(), -3, null, "favourite"));
                    }
                    aVar4.J0(0, arrayList2);
                    List<StickerItem> list3 = list;
                    if (list3.isEmpty()) {
                        i2 = 0;
                    } else {
                        sfy sfyVar = new sfy(aVar4.i.getString(R.string.stickers_keyboard_favorites), -3, null, null, null, 60);
                        ArrayList arrayList3 = new ArrayList(aVar4.h);
                        arrayList3.add(0, sfyVar);
                        aVar4.setItems(arrayList3);
                        i2 = list.size() + 1;
                    }
                    aVar4.p = i2;
                    aVar4.R0();
                    if (objArr == false && !list3.isEmpty()) {
                        sal0Var.b(-3);
                    }
                }
                ral0Var.h = list;
                com.vk.stickers.keyboard.navigation.a aVar5 = stickersView.v;
                boolean isEmpty = list.isEmpty();
                boolean z = !isEmpty;
                if (aVar5.m != z) {
                    if (isEmpty) {
                        boolean isEmpty2 = aVar5.o.isEmpty();
                        ArrayList arrayList4 = new ArrayList(aVar5.h);
                        arrayList4.remove(isEmpty2 ? 1 : 0);
                        aVar5.setItems(arrayList4);
                        if (aVar5.l == -3) {
                            int i8 = -1;
                            aVar5.l = -1;
                            Iterator<T> it2 = aVar5.h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    hfz hfzVar = (hfz) obj2;
                                    if (!(hfzVar instanceof jgy) || ((jgy) hfzVar).getId() != aVar5.l) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            jgy jgyVar = (jgy) (obj2 instanceof jgy ? obj2 : null);
                            if (jgyVar != null) {
                                Iterator<? extends hfz> it3 = aVar5.h.iterator();
                                int i9 = 0;
                                while (true) {
                                    if (it3.hasNext()) {
                                        hfz next = it3.next();
                                        if ((next instanceof jgy) && next.equals(jgyVar)) {
                                            i8 = i9;
                                        } else {
                                            i9++;
                                        }
                                    }
                                }
                                if (i8 >= 0) {
                                    hfz hfzVar2 = aVar5.h.get(i8);
                                    if (hfzVar2 instanceof jgy) {
                                        ArrayList arrayList5 = new ArrayList(aVar5.h);
                                        arrayList5.set(i8, ((jgy) hfzVar2).a(true));
                                        aVar5.setItems(arrayList5);
                                    }
                                }
                                aVar5.L0(jgyVar.getId(), false);
                            }
                        }
                    } else {
                        aVar5.J0(aVar5.o.isEmpty() ? 1 : 0, Collections.singletonList(new igy(KeyboardNavigationButton.FAVORITES, false)));
                    }
                    aVar5.m = z;
                }
                return s3q0.a;
            default:
                ((evh0) obj3).invoke((MarketCatalogFilterVM) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ b810(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
