package xsna;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.feature.music.holders.curator.CuratorInfoVhOld;
import com.vk.clips.design.view.feed.item.owner.ClipSubscribeBtnView;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.ui.modal.VkModal;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.g;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.folders.impl.configure.d;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.money.createtransfer.people.VkPayInfo;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.update.core.a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.gm50;
import xsna.hgh;
import xsna.i9l;
import xsna.jmm;
import xsna.jte;
import xsna.kqe;
import xsna.m5u;
import xsna.mvg;
import xsna.nue;
import xsna.uxo;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xcd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xcd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 15;
        boolean z = false;
        r3 = 0;
        int i2 = 0;
        r3 = false;
        boolean z2 = false;
        z = false;
        z = false;
        switch (this.b) {
            case 0:
                ClipSubscribeBtnView.a aVar = (ClipSubscribeBtnView.a) this.c;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj;
                if (sdkVideoFile.h1() && !sdkVideoFile.U() && !qr.f(sdkVideoFile.I0())) {
                    z = true;
                }
                VideoFile A = k15.A(sdkVideoFile);
                aVar.c.n3(z);
                mgz mgzVar = aVar.d;
                if (mgzVar != null) {
                    mgzVar.invoke(A);
                }
                return s3q0.a;
            case 1:
                zld zldVar = (zld) this.c;
                zldVar.i = (Uri) obj;
                zldVar.j = true;
                zldVar.d();
                return s3q0.a;
            case 2:
                ((ste) this.c).C(jte.b.b);
                return s3q0.a;
            case 3:
                uue uueVar = (uue) this.c;
                kqe kqeVar = (kqe) obj;
                if (!(kqeVar instanceof kqe.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                uueVar.C(new nue.a(((kqe.a) kqeVar).a));
                return s3q0.a;
            case 4:
                ((com.vk.movika.sdk.base.observable.p) this.c).invoke((Group) obj);
                return s3q0.a;
            case 5:
                xtg xtgVar = (xtg) this.c;
                return new aug(((ViewGroup) obj).getContext(), xtgVar.i, xtgVar.j, xtgVar.k);
            case 6:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
                int i3 = CommunityCheckListFragment.Y;
                xn50.a.c(communityCheckListFragment, new mvg.e((String) obj));
                return s3q0.a;
            case 7:
                hgh.c cVar = (hgh.c) this.c;
                T t = cVar.m;
                if (((ClipsPlaylist) t) != null) {
                    cVar.o.invoke(t);
                }
                return s3q0.a;
            case 8:
                ((com.vk.profile.community.impl.ui.profile.a) this.c).C(new CommunityProfileAction.o(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 9:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                int i4 = CommunityReviewsFragment.o0;
                gm50.a.a(communityReviewsFragment, ((g.d) obj).a, new i4e(communityReviewsFragment, 14));
                communityReviewsFragment.ho(CommunityReviewsFragment.b.LOADING);
                return s3q0.a;
            case 10:
                com.vk.im.ui.components.contacts.a aVar2 = (com.vk.im.ui.components.contacts.a) this.c;
                qtd0 qtd0Var = (qtd0) obj;
                if (!aVar2.y.b.contains(qtd0Var.B7()) && aVar2.m.h(qtd0Var)) {
                    z2 = aVar2.b1().h(qtd0Var) ? true : !(aVar2.b1().r.size() >= aVar2.w);
                }
                return Boolean.valueOf(z2);
            case 11:
                CreateChatTransferFragment createChatTransferFragment = (CreateChatTransferFragment) this.c;
                ((sbv0) createChatTransferFragment.C0.getValue()).a(createChatTransferFragment.kn(), (VkPayInfo.VkPayState) obj, new sje(createChatTransferFragment, i));
                dw20 dw20Var = createChatTransferFragment.B0;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 12:
                return xck.a((xck) ((wck) this.c).b.getCurrentState(), null, null, null, 127);
            case 13:
                ((CuratorInfoVhOld) this.c).n = null;
                return s3q0.a;
            case 14:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                String str = (String) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                try {
                    debugDevSettingsFragment.o0.x(new zdb(new JSONObject(str), true));
                } catch (JSONException unused) {
                    enj.r(debugDevSettingsFragment.mo2getContext(), "Ошибка в формате JSON", 0);
                }
                return null;
            case 15:
                fgx fgxVar = (fgx) this.c;
                i9l i9lVar = (i9l) obj;
                if (!(i9lVar instanceof i9l.c)) {
                    fgxVar.n = true;
                    izs<? super i9l, s3q0> izsVar = fgxVar.i;
                    if (izsVar == null) {
                        throw new IllegalStateException("callback is null");
                    }
                    izsVar.invoke(i9lVar);
                }
                return s3q0.a;
            case 16:
                return ((shm) this.c).Y0((m420) obj);
            case 17:
                jmm jmmVar = (jmm) this.c;
                DialogItemView dialogItemView = jmmVar.m;
                awt0.p(dialogItemView);
                dialogItemView.getParent().requestDisallowInterceptTouchEvent(true);
                jmmVar.l.n(new jmm.a.C3126a(jmmVar.t, (io.reactivex.rxjava3.core.q) obj));
                return s3q0.a;
            case 18:
                qxo qxoVar = (qxo) this.c;
                ?? r1 = qxoVar.i;
                ?? r2 = qxoVar.l;
                ?? r4 = qxoVar.h;
                uxo.a.InterfaceC3850a interfaceC3850a = (uxo.a.InterfaceC3850a) obj;
                if (interfaceC3850a instanceof uxo.a.InterfaceC3850a.b.C3852a) {
                    qxoVar.g.submitList(((uxo.a.InterfaceC3850a.b.C3852a) interfaceC3850a).a, new p31(qxoVar, 11));
                    qxoVar.a(false);
                } else if (interfaceC3850a instanceof uxo.a.InterfaceC3850a.b.C3853b) {
                    boolean z3 = ((uxo.a.InterfaceC3850a.b.C3853b) interfaceC3850a).a;
                    qxoVar.b().a();
                    ((RecyclerView) r4.getValue()).setVisibility(4);
                    f4m.j((RecyclerView) r1.getValue());
                    ((LinearLayout) r2.getValue()).setVisibility(4);
                    ((ProgressBar) qxoVar.j.getValue()).setVisibility(0);
                    qxoVar.a(z3);
                } else if (interfaceC3850a instanceof uxo.a.InterfaceC3850a.C3851a) {
                    qxoVar.b().d();
                    qxoVar.b().a();
                    ((LinearLayout) r2.getValue()).setVisibility(0);
                    ((RecyclerView) r4.getValue()).setVisibility(4);
                    qxoVar.a(false);
                } else {
                    if (!(interfaceC3850a instanceof uxo.a.InterfaceC3850a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<xnn0> list = ((uxo.a.InterfaceC3850a.c) interfaceC3850a).a;
                    qxoVar.b().d();
                    qxoVar.b().a();
                    ((RecyclerView) r4.getValue()).setVisibility(0);
                    f4m.j((RecyclerView) r1.getValue());
                    ((LinearLayout) r2.getValue()).setVisibility(4);
                    qxoVar.a(false);
                    qxoVar.f.submitList(list);
                }
                return s3q0.a;
            case 19:
                com.vk.photos.ui.editalbum.domain.h hVar = (com.vk.photos.ui.editalbum.domain.h) this.c;
                VKList<Photo> vKList = (VKList) obj;
                if (vKList == null || !vKList.isEmpty()) {
                    for (Photo photo : vKList) {
                        if (photo.d == hVar.c.b && epx.f(photo.O, Boolean.TRUE) && (i2 = i2 + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                return Integer.valueOf(i2);
            case 20:
                vop vopVar = (vop) this.c;
                vgg vggVar = (vgg) obj;
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    vopVar.z0(vggVar);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 21:
                FilterType filterType = (FilterType) this.c;
                int i5 = FiltersRecyclerView.j;
                return Boolean.valueOf(((tcr) obj).a == filterType);
            case 22:
                com.vk.folders.impl.configure.d dVar = (com.vk.folders.impl.configure.d) this.c;
                ayr ayrVar = (ayr) obj;
                Map<Long, wt90> map = dVar.g().e;
                Map<Long, wt90> map2 = dVar.g().f;
                Set<Long> set = dVar.g().i;
                Set<Long> set2 = dVar.g().h;
                List<hfz> list2 = dVar.g().a;
                dVar.g();
                dVar.g();
                return ayr.a(ayrVar, d.a.a(map, map2, set, set2, list2, null, null, dVar.g().d, com.vk.folders.impl.configure.b.a(dVar.h), dVar.g().g, dVar.m, dVar.p), false, false, null, null, null, null, null, null, null, false, 16382);
            case 23:
                RecyclerView recyclerView = (RecyclerView) this.c;
                int i6 = GalleryFragmentImpl.R0;
                bwt0.p0(recyclerView, !((Boolean) obj).booleanValue());
                return s3q0.a;
            case 24:
                GoodPreviewFragment goodPreviewFragment = (GoodPreviewFragment) this.c;
                int i7 = GoodPreviewFragment.X;
                xn50.a.c(goodPreviewFragment, new m5u.j((ay00) obj));
                return s3q0.a;
            case 25:
                View view = (View) obj;
                ((jcu) this.c).A.setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, view.getWidth(), view.getHeight())));
                return s3q0.a;
            case 26:
                ((giu) this.c).e5();
                return s3q0.a;
            case 27:
                ((c5w) this.c).a();
                return s3q0.a;
            case 28:
                dfw dfwVar = (dfw) this.c;
                Editable text = dfwVar.h.getText();
                if (text != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = text.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        char charAt = text.charAt(i8);
                        if (Character.isDigit(charAt) || charAt == '+') {
                            sb.append(charAt);
                        }
                    }
                    String obj2 = sb.toString();
                    if (obj2 != null) {
                        Intent intent = new Intent("com.android.contacts.action.SHOW_OR_CREATE_CONTACT", Uri.parse("tel:".concat(obj2)));
                        intent.putExtra("com.android.contacts.action.FORCE_CREATE", true);
                        dfwVar.a.startActivity(intent);
                        VkModal vkModal = dfwVar.i;
                        (vkModal != null ? vkModal : null).a();
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            default:
                io.reactivex.rxjava3.internal.operators.observable.t tVar = ((com.vk.update.core.a) this.c).d;
                com.vk.movika.sdk.base.model.n nVar = new com.vk.movika.sdk.base.model.n(new leq(12), i);
                tVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.observable.e0(new io.reactivex.rxjava3.internal.operators.observable.i0(tVar, nVar)), new y7(new b5h((a.C1935a) obj, 23), 27));
        }
    }
}
