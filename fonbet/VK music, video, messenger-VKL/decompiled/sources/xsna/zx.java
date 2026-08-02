package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.vk.attachpicker.ImageFormatRestrictions;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.impl.ui.folders.renaming.b;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.ecomm.cart.impl.cart.a;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.chats.ChatPreview;
import com.vk.newsfeed.impl.fragments.BaseCommentsFragment;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.AdminCommunitiesDataSource;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.voip.ui.BannedBottomSheet;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.topology.StatsCallback;
import xsna.bzg;
import xsna.d4b;
import xsna.dob;
import xsna.i2c;
import xsna.ikv0;
import xsna.iy;
import xsna.m6e;
import xsna.tj50;
import xsna.zew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zx implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zx(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v108, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 12;
        int i3 = 5;
        char c = 1;
        Character ch = null;
        Object[] objArr = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ay) obj2).T(new iy.a((ActionButton) obj));
                return s3q0.a;
            case 1:
                ym0 ym0Var = (ym0) obj2;
                int i4 = ym0.k1;
                if (((View) obj).isEnabled()) {
                    a2j a2jVar = ym0Var.g1;
                    if (a2jVar != null) {
                        a2jVar.C(ym0Var.ao(ym0Var.f1.P0()));
                    }
                    ym0Var.tn();
                }
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((ArrayList) obj2).contains(((com.vk.ml.f) obj).a()));
            case 3:
                ((AdminCommunitiesDataSource) obj2).c.set(false);
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((cl1) obj).a.b == ((gg1) obj2).o);
            case 5:
                ((xi3) obj2).b.e();
                return s3q0.a;
            case 6:
                BannedBottomSheet bannedBottomSheet = (BannedBottomSheet) obj2;
                int i5 = BannedBottomSheet.R;
                bannedBottomSheet.getParentFragmentManager().k0(new Bundle(), "unlock_key");
                bannedBottomSheet.dismiss();
                return s3q0.a;
            case 7:
                gzs gzsVar = (gzs) obj2;
                int i6 = BaseCommentsFragment.l0;
                ((ikv0) obj).a();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 8:
                return ((Call) obj2).a((StatsCallback) obj);
            case 9:
                o29 o29Var = (o29) obj2;
                mhy.a(o29Var.a.getContext(), o29Var.e.getText());
                return s3q0.a;
            case 10:
                zew0.a aVar = zew0.k1;
                Context context = ((f69) obj2).a;
                zew0.a.b(aVar, context, R.drawable.vk_icon_users_3_outline_56, R.attr.vk_ui_icon_accent, context.getString(R.string.voip_group_call_promo_title), context.getString(R.string.voip_group_call_promo_subtitle), null, new zew0.b.e(R.string.voip_group_call_promo_action_button), null, false, Http.StatusCode.RANGE_NOT_SATISFIABLE).Td((FragmentManager) obj, "");
                return s3q0.a;
            case 11:
                va9 va9Var = (va9) obj2;
                io.reactivex.rxjava3.internal.operators.observable.e1 R = io.reactivex.rxjava3.core.q.R(5L, TimeUnit.SECONDS);
                asu0.a.getClass();
                int i7 = 6;
                int i8 = 9;
                int i9 = 4;
                io.reactivex.rxjava3.core.q q = io.reactivex.rxjava3.core.q.q(new io.reactivex.rxjava3.internal.operators.observable.p1(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.r2(R.r0(asu0.r()), new ju1(new com.vk.movika.sdk.base.observable.k(va9Var, 13), i7)), new gv(new com.vk.movika.sdk.base.observable.m(va9Var, 16), i7)).U(new pi0(new com.vk.movika.sdk.base.observable.p(va9Var, 14), 3)), new xq(new nt(i8), 5)), new io.reactivex.rxjava3.internal.operators.observable.p1(new io.reactivex.rxjava3.internal.operators.observable.i0(((or2) va9Var.b.invoke()).a().b0(pr2.class), new nu0(new com.vk.movika.sdk.base.observable.c(va9Var, 15), i9)).U(new oq(new g8(i9), 6)).a0(asu0.r()).U(new kb(new qu(va9Var, i2), 8)), new jh(new nt(i8), i9)));
                yi2 yi2Var = new yi2(new th5(objArr == true ? 1 : 0, c == true ? 1 : 0), i7);
                q.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.y(q, io.reactivex.rxjava3.internal.functions.a.a, yi2Var);
            case 12:
                float f = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj2).getPresenter();
                if (presenter != null) {
                    presenter.h4();
                }
                return s3q0.a;
            case 13:
                tj50.a aVar2 = (tj50.a) obj;
                com.vk.im.engine.internal.storage.delegates.messages.b bVar = new com.vk.im.engine.internal.storage.delegates.messages.b((cy9) obj2, 18);
                ao8 ao8Var = ao8.d;
                return new a.C0918a(aVar2.a(bVar, ao8Var), aVar2.a(new sm0(i3), ao8Var));
            case 14:
                return ((CatalogBasePaginatedListVh) obj2).h.c(((Integer) obj).intValue());
            case 15:
                CatalogReplacementResponse catalogReplacementResponse = (CatalogReplacementResponse) obj;
                ListIterator listIterator = ((r9a) obj2).a.listIterator(0);
                while (true) {
                    ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
                    if (!aVar3.hasNext()) {
                        return catalogReplacementResponse;
                    }
                    catalogReplacementResponse = ((ida) aVar3.next()).d(catalogReplacementResponse);
                }
            case 16:
                d4b d4bVar = (d4b) obj;
                e4b e4bVar = ((ChannelMonetizationFragment) obj2).S;
                if (e4bVar != null) {
                    if (d4bVar instanceof d4b.b) {
                        Context context2 = e4bVar.a;
                        if (e4bVar.c == null) {
                            ikv0.a aVar4 = new ikv0.a(context2);
                            aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
                            aVar4.u = new ikv0.d(new ikv0.d.c(context2.getString(R.string.vkim_channels_monetization_error_title)), (ikv0.d.b) null, new ikv0.d.a(context2.getString(R.string.vkim_channels_monetization_error_subtitle), null, new za(e4bVar, 22), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
                            aVar4.i = FloatingViewGesturesHelper.SwipeDirection.None;
                            aVar4.e = -1L;
                            aVar4.h = new tm0(e4bVar, 19);
                            e4bVar.c = aVar4.n();
                        }
                    } else {
                        if (!(d4bVar instanceof d4b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ikv0 ikv0Var = e4bVar.c;
                        if (ikv0Var != null) {
                            ikv0Var.a();
                        }
                    }
                }
                return s3q0.a;
            case 17:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, (ChannelBanInfo) obj2, null, null, null, null, null, null, false, false, -4194305, 7);
            case 18:
                return ynb.l((ynb) obj2, (dob.j) obj);
            case 19:
                bsb bsbVar = (bsb) obj2;
                bsbVar.l = u230.a(bsbVar.l, null, (ChatPreview) obj, 5);
                bsbVar.Z0();
                return s3q0.a;
            case 20:
                ((ftb) obj2).e.P((Throwable) obj);
                return s3q0.a;
            case 21:
                ((zak0) ((i2c) obj2).d).setValue((i2c.a) obj);
                return s3q0.a;
            case 22:
                mbc mbcVar = (mbc) obj2;
                ?? r1 = mbcVar.F;
                bpn0 bpn0Var = mbcVar.E;
                nbc nbcVar = (nbc) obj;
                Throwable th = nbcVar.d;
                if (nbcVar.c) {
                    ((a2e0) bpn0Var.getValue()).c(0L);
                } else {
                    ((a2e0) bpn0Var.getValue()).a();
                    if (th != null) {
                        ((wcl) r1.getValue()).a(th).P((wcl) r1.getValue(), null);
                    } else {
                        syj syjVar = mbcVar.y;
                        if (syjVar == null) {
                            syjVar = null;
                        }
                        List<Country> list = nbcVar.b;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new wyj((Country) it.next()));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            gtx gtxVar = (gtx) it2.next();
                            if (gtxVar instanceof wyj) {
                                char charAt = ((wyj) gtxVar).a.e.charAt(0);
                                if (ch == null || charAt != ch.charValue()) {
                                    ch = Character.valueOf(charAt);
                                    arrayList2.add(new j2z(charAt));
                                }
                                arrayList2.add(gtxVar);
                            }
                        }
                        syjVar.d = arrayList2;
                        syjVar.x0(syjVar.e);
                    }
                }
                return s3q0.a;
            case 23:
                int i10 = ClipsEntryPointsFragment.i0;
                ((ClipsEntryPointsFragment) obj2).finish();
                return s3q0.a;
            case 24:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                b.C0616b c0616b = ((com.vk.clips.favorites.impl.ui.folders.renaming.b) obj2).l1;
                bwt0.p0((c0616b != null ? c0616b : null).c, booleanValue);
                return s3q0.a;
            case 25:
                m6e.a aVar5 = (m6e.a) obj2;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                q8e q8eVar = aVar5.a;
                if (!q8eVar.isLaidOut() || q8eVar.isLayoutRequested()) {
                    q8eVar.addOnLayoutChangeListener(new k6e(aVar5, intValue));
                } else {
                    androidx.recyclerview.widget.o0 o0Var = aVar5.d;
                    r0f r0fVar = o0Var instanceof r0f ? (r0f) o0Var : null;
                    if (r0fVar != null) {
                        Iterator it3 = r0fVar.e.iterator();
                        while (it3.hasNext()) {
                            ((izs) it3.next()).invoke(num);
                        }
                    }
                }
                return s3q0.a;
            case 26:
                ((hjc) obj2).onClick();
                return s3q0.a;
            case 27:
                tvg tvgVar = (tvg) obj2;
                return new ich((ViewGroup) obj, tvgVar.j, tvgVar.k);
            default:
                qyg qygVar = (qyg) obj2;
                bzg bzgVar = (bzg) obj;
                int i11 = qyg.n1;
                if (bzgVar instanceof bzg.b) {
                    int i12 = ((bzg.b) bzgVar).a;
                    Integer valueOf = Integer.valueOf(i12);
                    Intent n = ((yf9) qygVar.l1.getValue()).e().n(qygVar.requireContext());
                    n.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                    n.putExtra("prevent_styling_photo", false);
                    n.putExtra("total_selection_limit", valueOf);
                    n.putExtra("attach_limit_hint", true);
                    n.putExtra("selection_limit", valueOf);
                    n.putExtra("single_mode", i12 == 1);
                    n.putExtra("image_format_restrictions", new ImageFormatRestrictions(null, Collections.singletonList(".gif"), 1, null));
                    qygVar.k1.a(n);
                } else if (bzgVar instanceof bzg.a) {
                    ((rk8) qygVar.m1.getValue()).f(qygVar.requireContext(), null, LaunchContext.A, ((bzg.a) bzgVar).a);
                }
                return s3q0.a;
        }
    }
}
