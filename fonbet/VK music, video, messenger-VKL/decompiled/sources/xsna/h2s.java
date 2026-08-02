package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatEditText;
import com.vk.api.generated.leadForms.dto.LeadFormsGetUserFormDataResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d;
import com.vk.ecomm.reviews.api.model.CreateMarketItemReviewArguments;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.pushes.dto.BusinessNotifyNotificationInfo;
import com.vk.pushes.dto.PushBusinessNotify;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.BusinessNotifyNotification;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.translate.impl.views.MessageTranslationUnitViewGroup;
import com.vk.voip.api.join.JoinData;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.b610;
import xsna.bbt;
import xsna.bex0;
import xsna.dfq0;
import xsna.ii00;
import xsna.jw00;
import xsna.k840;
import xsna.no90;
import xsna.qo90;
import xsna.r070;
import xsna.r7x;
import xsna.tj50;
import xsna.x89;
import xsna.y2y;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class h2s implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h2s(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:52|53|54|55|(1:96)(1:59)|(1:61)|62|(3:82|(3:85|(9:90|91|67|68|69|70|(1:74)|(1:76)|77)(1:93)|83)|95)|66|67|68|69|70|(2:72|74)|(0)|77) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0228, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023e  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ptk ptkVar;
        boolean z;
        Peer b;
        ri6 qtbVar;
        Object obj2;
        boolean z2;
        BusinessNotifyNotificationInfo businessNotifyNotificationInfo;
        List<PushBusinessNotify> list;
        List<PushBusinessNotify> list2;
        int i = 7;
        ExtendedUserProfile extendedUserProfile = null;
        String str = null;
        r8 = null;
        List list3 = null;
        extendedUserProfile = null;
        switch (this.b) {
            case 0:
                a580 a580Var = (a580) this.c;
                t2s t2sVar = (t2s) obj;
                Set R0 = j5g.R0(t2sVar.g);
                R0.add(Integer.valueOf(a580Var.b));
                return i2s.u(t2s.a(t2sVar, null, false, null, null, false, null, R0, false, 0, 447));
            case 1:
                v1z v1zVar = (v1z) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) v1zVar.a).setValue(bool);
                return s3q0.a;
            case 2:
                ((ets) this.c).h.invoke((UserProfile) obj, Boolean.TRUE);
                return s3q0.a;
            case 3:
                yat yatVar = (yat) this.c;
                tj50.a aVar = (tj50.a) obj;
                zat zatVar = new zat(1, yatVar, yat.class, "provideLoadingStatus", "provideLoadingStatus(Lcom/vk/games/presentation/detail/mvi/GamesCatalogDetailState;)Lcom/vk/games/presentation/detail/mvi/GamesCatalogDetailRender$LoadingStatusState;", 0);
                ao8 ao8Var = ao8.d;
                return new bbt.a(aVar.a(zatVar, ao8Var), aVar.a(new abt(1, yatVar, yat.class, "provideContentStatus", "provideContentStatus(Lcom/vk/games/presentation/detail/mvi/GamesCatalogDetailState;)Lcom/vk/games/presentation/detail/mvi/GamesCatalogDetailRender$ContentState;", 0), ao8Var), aVar.a(new j5n(i), ao8Var), aVar.a(new ot(25), ao8Var));
            case 4:
                uhu uhuVar = (uhu) this.c;
                Pair pair = (Pair) obj;
                s89 s89Var = (s89) pair.d();
                List list4 = (List) pair.g();
                cn o = uhuVar.n.o();
                String str2 = s89Var.c;
                JoinData joinData = s89Var.e;
                return new x89.a(s89Var, new x89.c.C3983c(new JoinData(str2, joinData.c, joinData.d), o, new og0(extendedUserProfile, ((jsa) uhuVar.u.getValue()).a())), o, list4);
            case 5:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, ((pju) this.c).j);
                qgi0.r(tgi0Var, "storefront_group_description");
                return s3q0.a;
            case 6:
                return Boolean.valueOf(epx.f(((r7x.a) obj).b(), (w6x) this.c));
            case 7:
                x6y x6yVar = ((y2y) this.c).a;
                mhn0 mhn0Var = (mhn0) obj;
                int i2 = y2y.a.$EnumSwitchMapping$0[mhn0Var.a.ordinal()];
                if (i2 == 1) {
                    JsApiMethodType jsApiMethodType = JsApiMethodType.IN_APP_PURCHASE;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", true);
                    Long l = mhn0Var.b;
                    if (l != null) {
                        jSONObject.put("order_id", l.longValue());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    bex0.a.b(x6yVar, jsApiMethodType, jSONObject, null, 12);
                } else if (i2 == 2) {
                    bex0.a.a(x6yVar, JsApiMethodType.IN_APP_PURCHASE, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                } else if (i2 == 3) {
                    bex0.a.a(x6yVar, JsApiMethodType.IN_APP_PURCHASE, VkAppsErrors.Client.INVALID_PARAMS, null, new Pair("item_unavailable", Boolean.TRUE), null, 52);
                } else if (i2 != 4) {
                    bex0.a.a(x6yVar, JsApiMethodType.IN_APP_PURCHASE, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                } else {
                    bex0.a.a(x6yVar, JsApiMethodType.IN_APP_PURCHASE, VkAppsErrors.Client.CONNECTION_LOST, null, null, null, 60);
                }
                return s3q0.a;
            case 8:
                com.vk.newsfeed.common.recycler.holders.b bVar = (com.vk.newsfeed.common.recycler.holders.b) this.c;
                Pair pair2 = (Pair) obj;
                it80 it80Var = (it80) pair2.i();
                it80 it80Var2 = (it80) pair2.j();
                bVar.O = true;
                bVar.z = false;
                LeadFormsGetUserFormDataResponseDto leadFormsGetUserFormDataResponseDto = (LeadFormsGetUserFormDataResponseDto) it80Var.a;
                tyy tyyVar = bVar.p;
                if (leadFormsGetUserFormDataResponseDto != null) {
                    if (myc0.f(leadFormsGetUserFormDataResponseDto.g())) {
                        bVar.B = true;
                        AppCompatEditText appCompatEditText = bVar.F;
                        if (appCompatEditText != null) {
                            appCompatEditText.setText(leadFormsGetUserFormDataResponseDto.g());
                        }
                    }
                    if (myc0.f(leadFormsGetUserFormDataResponseDto.e())) {
                        bVar.C = true;
                        AppCompatEditText appCompatEditText2 = bVar.G;
                        if (appCompatEditText2 != null) {
                            appCompatEditText2.setText(leadFormsGetUserFormDataResponseDto.e());
                        }
                    }
                    tyyVar.e(leadFormsGetUserFormDataResponseDto.d());
                    tyyVar.k(leadFormsGetUserFormDataResponseDto.e());
                    tyyVar.d(leadFormsGetUserFormDataResponseDto.f());
                    tyyVar.l(leadFormsGetUserFormDataResponseDto.g());
                }
                if (it80Var2 != null && (ptkVar = (ptk) it80Var2.a) != null) {
                    extendedUserProfile = (ExtendedUserProfile) ptkVar.a;
                }
                if (extendedUserProfile != null) {
                    UserProfile h = bVar.n.h();
                    AppCompatEditText appCompatEditText3 = bVar.I;
                    if (appCompatEditText3 != null) {
                        appCompatEditText3.setText(h.d);
                    }
                    String str3 = extendedUserProfile.B0 ? "vk.com/" + extendedUserProfile.A0 : "vk.com/id" + h.c;
                    AppCompatEditText appCompatEditText4 = bVar.J;
                    if (appCompatEditText4 != null) {
                        appCompatEditText4.setText(str3);
                    }
                    AppCompatEditText appCompatEditText5 = bVar.H;
                    if (appCompatEditText5 != null) {
                        appCompatEditText5.setText(extendedUserProfile.s0);
                    }
                    AppCompatEditText appCompatEditText6 = bVar.K;
                    if (appCompatEditText6 != null) {
                        appCompatEditText6.setText(h.p);
                    }
                }
                return s3q0.a;
            case 9:
                LocalMediaPickerFragmentOld localMediaPickerFragmentOld = (LocalMediaPickerFragmentOld) this.c;
                PostingAction postingAction = (PostingAction) obj;
                int i3 = LocalMediaPickerFragmentOld.c0;
                efc0 fo = localMediaPickerFragmentOld.fo();
                if (fo != null) {
                    fo.C(postingAction);
                }
                return s3q0.a;
            case 10:
                ModernSearchView modernSearchView = (ModernSearchView) obj;
                d98 d98Var = ((zyz) this.c).f.l;
                if (d98Var != null) {
                    d98Var.c(true);
                }
                if (modernSearchView != null) {
                    modernSearchView.f();
                }
                if (modernSearchView != null) {
                    h94 h94Var = ModernSearchView.y;
                    modernSearchView.c(0L);
                }
                return s3q0.a;
            case 11:
                ti00 ti00Var = (ti00) this.c;
                ii00 ii00Var = (ii00) obj;
                if (epx.f(ii00Var, ii00.a.a) || epx.f(ii00Var, ii00.e.a)) {
                    ti00Var.d();
                } else if ((ii00Var instanceof ii00.c) || (ii00Var instanceof ii00.d)) {
                    ti00Var.a();
                }
                return s3q0.a;
            case 12:
                jw00.d[] dVarArr = (jw00.d[]) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (rl3.G(dVarArr, (jw00.d) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            case 13:
                f510 f510Var = (f510) this.c;
                b610 b610Var = (b610) obj;
                if (b610Var instanceof b610.b) {
                    LayoutInflater.Factory kn = f510Var.kn();
                    if (kn instanceof ey50) {
                        ((ey50) kn).Y().S(new g510());
                    }
                    b610.b bVar2 = (b610.b) b610Var;
                    new CreateMarketItemReviewFragment.a(new CreateMarketItemReviewArguments(bVar2.a, bVar2.b, bVar2.c, bVar2.d, bVar2.e, bVar2.f, bVar2.g, null, 128, null)).i(new bc6(f510Var.requireContext(), new com.vk.movika.tools.controls.seekbar.h(f510Var, i)), 111722);
                } else {
                    if (!(b610Var instanceof b610.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f510Var.dismiss();
                }
                return s3q0.a;
            case 14:
                MessageTranslationUnitViewGroup.a aVar2 = ((MessageTranslationUnitViewGroup) this.c).b;
                if (aVar2 != null) {
                    aVar2.b();
                }
                return s3q0.a;
            case 15:
                ((cq20) this.c).b.invoke();
                return s3q0.a;
            case 16:
                ((ArrayList) this.c).add((lr20) obj);
                return s3q0.a;
            case 17:
                ((g530) this.c).H2();
                return s3q0.a;
            case 18:
                Playlist playlist = (Playlist) this.c;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new gcb0(playlist));
                return s3q0.a;
            case 19:
                ah30 ah30Var = (ah30) this.c;
                uk70 uk70Var = (uk70) obj;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"MsgAddHandler", p2i0.c.a("[Push]: showNotificationFromCache(" + uk70Var + ')')});
                }
                if (uk70Var.m) {
                    try {
                        obj2 = vo8.b(uk70Var.b).a();
                    } catch (Throwable unused) {
                        obj2 = null;
                    }
                    BusinessNotifyNotificationInfo businessNotifyNotificationInfo2 = (BusinessNotifyNotificationInfo) obj2;
                    List D0 = (businessNotifyNotificationInfo2 == null || (list2 = businessNotifyNotificationInfo2.d) == null) ? null : j5g.D0(new uo8(0), list2);
                    if (D0 == null) {
                        D0 = EmptyList.b;
                    }
                    List list5 = D0;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it = list5.iterator();
                        while (it.hasNext()) {
                            Integer num = ((PushBusinessNotify) it.next()).b;
                            int i4 = uk70Var.c;
                            if (num != null && num.intValue() == i4) {
                                z2 = false;
                                vo8.a(ah30Var.a(uk70Var, true), uk70Var.i.a);
                                Context context = ah30Var.a;
                                Object obj3 = vo8.b(uk70Var.b).a();
                                businessNotifyNotificationInfo = (BusinessNotifyNotificationInfo) obj3;
                                if (businessNotifyNotificationInfo != null && (list = businessNotifyNotificationInfo.d) != null) {
                                    list3 = j5g.D0(new uo8(0), list);
                                }
                                if (list3 == null) {
                                    list3 = EmptyList.b;
                                }
                                new BusinessNotifyNotification(context, ah30Var.a(uk70Var, z2), uk70Var.i.b, list3).g((NotificationManager) context.getSystemService("notification"));
                            }
                        }
                    }
                    z2 = true;
                    vo8.a(ah30Var.a(uk70Var, true), uk70Var.i.a);
                    Context context2 = ah30Var.a;
                    Object obj32 = vo8.b(uk70Var.b).a();
                    businessNotifyNotificationInfo = (BusinessNotifyNotificationInfo) obj32;
                    if (businessNotifyNotificationInfo != null) {
                        list3 = j5g.D0(new uo8(0), list);
                    }
                    if (list3 == null) {
                    }
                    new BusinessNotifyNotification(context2, ah30Var.a(uk70Var, z2), uk70Var.i.b, list3).g((NotificationManager) context2.getSystemService("notification"));
                } else {
                    List e = qa20.b.a.e(Long.valueOf(uk70Var.b), Long.valueOf(uk70Var.a));
                    if (!(e instanceof Collection) || !e.isEmpty()) {
                        Iterator it2 = e.iterator();
                        while (it2.hasNext()) {
                            if (((PushMessage) it2.next()).b == uk70Var.c) {
                                z = false;
                                MessageNotificationContainer b2 = ah30Var.b(uk70Var, true);
                                qa20 qa20Var = qa20.b;
                                qa20Var.a.a(b2, uk70Var.i.a, uk70Var.j, uk70Var.q.a);
                                List e2 = qa20Var.a.e(Long.valueOf(uk70Var.b), Long.valueOf(uk70Var.a));
                                MessageNotificationContainer b3 = ah30Var.b(uk70Var, z);
                                Serializer.c<Peer> cVar = Peer.CREATOR;
                                b = Peer.a.b(uk70Var.a);
                                b.getClass();
                                if (b.Ab(Peer.Type.GROUP)) {
                                    qtbVar = new oah(ah30Var.a, new dfq0.a("msg_notification_" + Long.valueOf(uk70Var.b) + '_' + Long.valueOf(uk70Var.a), uk70Var.d, uk70Var.g, uk70Var.e, Uri.parse(String.format("vk://%s/mail?community=%s&peer=%s", Arrays.copyOf(new Object[]{a0a.d, Long.valueOf(-uk70Var.a), Long.valueOf(uk70Var.b)}, 3))).toString(), uk70Var.a, !baw.a(uk70Var.b) && z, false, 128, null));
                                } else {
                                    qtbVar = uk70Var.k ? new qtb(ah30Var.a, b3, uk70Var.q.b, uk70Var.i.b, e2, (sfg) null, (xsw) null, 224) : new pa20(ah30Var.a, b3, uk70Var.i.b, e2, (Intent) null, (gzs) null, (gzs) null, 232);
                                }
                                L l3 = L.a;
                                l3.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l3, L.LogType.d, new Object[]{"[Push]: createAndShowMsgNotification " + qtbVar});
                                }
                                qtbVar.g((NotificationManager) ah30Var.a.getSystemService("notification"));
                            }
                        }
                    }
                    if (uk70Var.o) {
                        z = true;
                        MessageNotificationContainer b22 = ah30Var.b(uk70Var, true);
                        qa20 qa20Var2 = qa20.b;
                        qa20Var2.a.a(b22, uk70Var.i.a, uk70Var.j, uk70Var.q.a);
                        List e22 = qa20Var2.a.e(Long.valueOf(uk70Var.b), Long.valueOf(uk70Var.a));
                        MessageNotificationContainer b32 = ah30Var.b(uk70Var, z);
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        b = Peer.a.b(uk70Var.a);
                        b.getClass();
                        if (b.Ab(Peer.Type.GROUP)) {
                        }
                        L l32 = L.a;
                        l32.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                        }
                        qtbVar.g((NotificationManager) ah30Var.a.getSystemService("notification"));
                    }
                    z = false;
                    MessageNotificationContainer b222 = ah30Var.b(uk70Var, true);
                    qa20 qa20Var22 = qa20.b;
                    qa20Var22.a.a(b222, uk70Var.i.a, uk70Var.j, uk70Var.q.a);
                    List e222 = qa20Var22.a.e(Long.valueOf(uk70Var.b), Long.valueOf(uk70Var.a));
                    MessageNotificationContainer b322 = ah30Var.b(uk70Var, z);
                    Serializer.c<Peer> cVar22 = Peer.CREATOR;
                    b = Peer.a.b(uk70Var.a);
                    b.getClass();
                    if (b.Ab(Peer.Type.GROUP)) {
                    }
                    L l322 = L.a;
                    l322.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                    }
                    qtbVar.g((NotificationManager) ah30Var.a.getSystemService("notification"));
                }
                return s3q0.a;
            case 20:
                ((kz30) this.c).R();
                return s3q0.a;
            case 21:
                p840 p840Var = (p840) this.c;
                ec40 ec40Var = (ec40) p840Var.l;
                if (ec40Var != null && ec40Var.j) {
                    p840Var.n.b(ec40Var);
                }
                return s3q0.a;
            case 22:
                Object[] objArr = (Object[]) obj;
                return ((zsh) this.c).invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            case 23:
                return ((ho60) this.c).y0(((Integer) obj).intValue());
            case 24:
                ((dv60) this.c).a(r070.f.g.b);
                return s3q0.a;
            case 25:
                com.vk.ecomm.orders.impl.orderlist.presentation.mvi.a aVar3 = (com.vk.ecomm.orders.impl.orderlist.presentation.mvi.a) this.c;
                jw00 jw00Var = (jw00) ((Map) obj).get(jw00.a.c);
                if (jw00Var != null) {
                    aVar3.e(new d.a(jw00Var.a()));
                }
                return s3q0.a;
            case 26:
                return (rw80) this.c;
            case 27:
                ohk0 ohk0Var = (ohk0) this.c;
                NetworkState networkState = (NetworkState) obj;
                lk3 b4 = new lk3().d("network.has_network", networkState.d).b("network.type", networkState.b()).b("network.subtype", networkState.a()).b("network.stat_name", networkState.c());
                NetworkState.a aVar4 = networkState.e;
                lk3 d = b4.d("network.is_roaming", aVar4.a).d("network.is_metered", aVar4.b);
                int i5 = aVar4.c;
                if (i5 == 1) {
                    str = "off";
                } else if (i5 == 2) {
                    str = "whitelisted";
                } else if (i5 == 3) {
                    str = "on";
                }
                if (str != null) {
                    d.b("network.background_data_saver", str);
                }
                String str4 = aVar4.d;
                if (str4 != null) {
                    d.b("network.sim_operator", str4);
                }
                s3q0 s3q0Var2 = s3q0.a;
                ohk0Var.j("network.changed", d.e());
                return s3q0.a;
            case 28:
                VKList vKList = (VKList) obj;
                qo90.a aVar5 = (qo90.a) ((qo90) this.c);
                return new no90.b.C3407b(vKList.size() + aVar5.b.a.size(), vKList, vKList.i() > vKList.size() + aVar5.b.a.size());
            default:
                qx90 qx90Var = (qx90) this.c;
                dx90 dx90Var = qx90Var.a;
                int andSet = qx90Var.b.getAndSet(0);
                int andSet2 = qx90Var.c.getAndSet(0);
                dx90Var.E.addAndGet(andSet);
                dx90Var.F.addAndGet(andSet2);
                dx90Var.x();
                dx90 dx90Var2 = qx90Var.a;
                dx90Var2.w.addAndGet(qx90Var.d.getAndSet(0L));
                dx90Var2.x();
                return s3q0.a;
        }
    }

    public /* synthetic */ h2s(a580 a580Var, i2s i2sVar) {
        this.b = 0;
        this.c = a580Var;
    }
}
