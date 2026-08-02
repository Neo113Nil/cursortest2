package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.api.generated.market.dto.MarketCreateCheckoutOrderPaymentOptionDto;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.screendata.MultiAccountData;
import com.vk.auth.validation.VkBanRouterInfo;
import com.vk.auth.validation.VkPassportRouterInfo;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.ui.UIBlockApp;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.feature.music.ui.holder.MusicActionSortingVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.games.CatalogMiniAppItem;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.cart.impl.checkout.feature.state.CheckoutPaymentType;
import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.feature.state.InputField;
import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentInfoField;
import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentOptionsField;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.messages.Msg;
import com.vk.profile.core.scheduled_clips.d;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.a7f0;
import xsna.aw9;
import xsna.c2j;
import xsna.c8c;
import xsna.g6c;
import xsna.gv30;
import xsna.oap;
import xsna.r2c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class x4c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x4c(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0649  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        com.vk.ecomm.cart.impl.checkout.feature.state.h hVar;
        com.vk.ecomm.cart.impl.checkout.feature.state.h hVar2;
        boolean z;
        Object obj2;
        PaymentInfoField paymentInfoField;
        PaymentOptionsField paymentOptionsField;
        CheckoutPaymentType checkoutPaymentType;
        final boolean z2;
        Object obj3;
        b7r b7rVar;
        Object obj4;
        b7r b7rVar2;
        b7r b7rVar3;
        com.vk.im.engine.models.dialogs.d b;
        Object obj5;
        Object obj6;
        int i = this.b;
        int i2 = 7;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                com.vk.ecomm.cart.impl.checkout.feature.state.h hVar3 = null;
                MarketCreateCheckoutOrderPaymentOptionDto marketCreateCheckoutOrderPaymentOptionDto = null;
                hVar3 = null;
                final z4c z4cVar = (z4c) obj9;
                final w8c w8cVar = (w8c) obj8;
                r2c.n nVar = (r2c.n) obj7;
                com.vk.ecomm.cart.impl.checkout.feature.state.f fVar = (com.vk.ecomm.cart.impl.checkout.feature.state.f) obj;
                com.vk.ecomm.cart.impl.checkout.feature.state.f fVar2 = w8cVar.g;
                FieldKey fieldKey = new FieldKey("payment", "promo_code", null, null, 12, null);
                String str = fieldKey.b;
                LinkedHashMap<String, b7r> b2 = fVar2.b(str);
                String str2 = fieldKey.d;
                String str3 = fieldKey.c;
                if (b2 == null || (b7rVar3 = b2.get(str3)) == null) {
                    hVar = null;
                } else if (b7rVar3 instanceof ppg0) {
                    b7r b7rVar4 = ((ppg0) b7rVar3).c.get(str2);
                    if (!(b7rVar4 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h)) {
                        b7rVar4 = null;
                    }
                    hVar = (com.vk.ecomm.cart.impl.checkout.feature.state.h) b7rVar4;
                } else {
                    if (!(b7rVar3 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h)) {
                        b7rVar3 = null;
                    }
                    hVar = (com.vk.ecomm.cart.impl.checkout.feature.state.h) b7rVar3;
                }
                InputField inputField = hVar != null ? hVar.e : null;
                LinkedHashMap<String, b7r> b3 = fVar.b(str);
                if (b3 == null || (b7rVar2 = b3.get(str3)) == null) {
                    hVar2 = null;
                } else if (b7rVar2 instanceof ppg0) {
                    b7r b7rVar5 = ((ppg0) b7rVar2).c.get(str2);
                    if (!(b7rVar5 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h)) {
                        b7rVar5 = null;
                    }
                    hVar2 = (com.vk.ecomm.cart.impl.checkout.feature.state.h) b7rVar5;
                } else {
                    if (!(b7rVar2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h)) {
                        b7rVar2 = null;
                    }
                    hVar2 = (com.vk.ecomm.cart.impl.checkout.feature.state.h) b7rVar2;
                }
                InputField inputField2 = hVar2 != null ? hVar2.e : null;
                if (epx.f(inputField != null ? inputField.i : null, inputField2 != null ? inputField2.i : null)) {
                    if (epx.f(inputField != null ? inputField.j : null, inputField2 != null ? inputField2.j : null)) {
                        FieldKey fieldKey2 = new FieldKey("payment", "payment_info", null, null, 12, null);
                        LinkedHashMap<String, b7r> b4 = fVar2.b(fieldKey2.b);
                        if (b4 == null || (obj4 = (b7r) b4.get(fieldKey2.c)) == null) {
                            paymentInfoField = null;
                        } else if (obj4 instanceof ppg0) {
                            b7r b7rVar6 = ((ppg0) obj4).c.get(fieldKey2.d);
                            if (!(b7rVar6 instanceof PaymentInfoField)) {
                                b7rVar6 = null;
                            }
                            paymentInfoField = (PaymentInfoField) b7rVar6;
                        } else {
                            boolean z3 = obj4 instanceof PaymentInfoField;
                            Object obj10 = obj4;
                            if (!z3) {
                                obj10 = null;
                            }
                            paymentInfoField = (PaymentInfoField) obj10;
                        }
                        FieldKey fieldKey3 = new FieldKey("payment", "payment_options", null, null, 12, null);
                        LinkedHashMap<String, b7r> b5 = fVar2.b(fieldKey3.b);
                        if (b5 == null || (b7rVar = b5.get(fieldKey3.c)) == null) {
                            paymentOptionsField = null;
                        } else if (b7rVar instanceof ppg0) {
                            b7r b7rVar7 = ((ppg0) b7rVar).c.get(fieldKey3.d);
                            if (!(b7rVar7 instanceof PaymentOptionsField)) {
                                b7rVar7 = null;
                            }
                            paymentOptionsField = (PaymentOptionsField) b7rVar7;
                        } else {
                            if (!(b7rVar instanceof PaymentOptionsField)) {
                                b7rVar = null;
                            }
                            paymentOptionsField = (PaymentOptionsField) b7rVar;
                        }
                        String i3 = paymentInfoField != null ? paymentInfoField.c.i() : paymentOptionsField != null ? paymentOptionsField.d.i() : null;
                        if (i3 != null) {
                            CheckoutPaymentType.Companion.getClass();
                            Iterator<E> it = CheckoutPaymentType.h().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj3 = it.next();
                                    if (epx.f(((CheckoutPaymentType) obj3).i(), i3)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            checkoutPaymentType = (CheckoutPaymentType) obj3;
                        } else {
                            checkoutPaymentType = null;
                        }
                        z2 = checkoutPaymentType == CheckoutPaymentType.NOW;
                        c8c c8cVar = z4cVar.i;
                        UserId userId = w8cVar.b;
                        UiTracker uiTracker = UiTracker.a;
                        UiTracker.c().name();
                        Long l = w8cVar.c;
                        if (checkoutPaymentType != null) {
                            c8cVar.getClass();
                            int i4 = c8c.a.$EnumSwitchMapping$0[checkoutPaymentType.ordinal()];
                            if (i4 == 1) {
                                marketCreateCheckoutOrderPaymentOptionDto = MarketCreateCheckoutOrderPaymentOptionDto.NOW;
                            } else {
                                if (i4 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                marketCreateCheckoutOrderPaymentOptionDto = MarketCreateCheckoutOrderPaymentOptionDto.IN_CHAT;
                            }
                        }
                        c8cVar.a.getClass();
                        tfx tfxVar = new tfx("market.createCheckoutOrder", new sn(26), new nr(18));
                        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                        if (l != null) {
                            tfx.m(tfxVar, "item_id", l.longValue(), 0L, 8);
                        }
                        if (marketCreateCheckoutOrderPaymentOptionDto != null) {
                            tfx.o(tfxVar, "payment_option", marketCreateCheckoutOrderPaymentOptionDto.i(), 0, 0, 12);
                        }
                        a7f0.a.f(z4cVar, rsg0.w0(yfb.x(tfxVar)).l(new lp0(new td5(1, (d8c) c8cVar.e.getValue(), d8c.class, "toCheckoutOrderPaymentInfoV2", "toCheckoutOrderPaymentInfoV2(Lcom/vk/api/generated/market/dto/MarketCreateCheckoutOrderResponseDto;)Lcom/vk/ecomm/cart/impl/checkout/feature/data/model/CheckoutOrderPaymentInfo;", 0, 4), 13)), new izs() { // from class: xsna.y4c
                            @Override // xsna.izs
                            public final Object invoke(Object obj11) {
                                OrderPaymentParameters orderPaymentParameters;
                                a7c a7cVar = (a7c) obj11;
                                z4c z4cVar2 = z4c.this;
                                f4z f4zVar = z4cVar2.g;
                                w8c w8cVar2 = w8cVar;
                                f4zVar.b(new g6c.b(w8cVar2.b, w8cVar2.c));
                                z4cVar2.T(new aw9.f(new gbk(a7cVar.c, Integer.valueOf(a7cVar.a), a7cVar.d)));
                                z4cVar2.T(aw9.a.C2577a.b);
                                if (!z2 || (orderPaymentParameters = a7cVar.b) == null) {
                                    z4cVar2.T(new aw9.g(false));
                                } else {
                                    f4zVar.b(new g6c.j(orderPaymentParameters, w8cVar2.b));
                                }
                                return s3q0.a;
                            }
                        }, new o43(i2, z4cVar, nVar), 1);
                        return s3q0.a;
                    }
                }
                z4cVar.T(new aw9.b(fVar, false));
                FieldKey fieldKey4 = new FieldKey("payment", "promo_code", null, null, 12, null);
                LinkedHashMap<String, b7r> b6 = fVar.b(fieldKey4.b);
                if (b6 != null && (obj2 = (b7r) b6.get(fieldKey4.c)) != null) {
                    if (obj2 instanceof ppg0) {
                        Object obj11 = ((ppg0) obj2).c.get(fieldKey4.d);
                        hVar3 = (com.vk.ecomm.cart.impl.checkout.feature.state.h) (obj11 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h ? obj11 : null);
                    } else {
                        hVar3 = (com.vk.ecomm.cart.impl.checkout.feature.state.h) (obj2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h ? obj2 : null);
                    }
                }
                if (hVar3 != null) {
                    String str4 = hVar3.e.j;
                    if (!(str4 == null || str4.length() == 0)) {
                        z = true;
                        z4cVar.h.b(new h8c(new FieldKey("payment", !z ? "price_row_total" : "promo_code", null, null, 12, null), false));
                        return s3q0.a;
                    }
                }
                z = false;
                z4cVar.h.b(new h8c(new FieldKey("payment", !z ? "price_row_total" : "promo_code", null, null, 12, null), false));
                return s3q0.a;
            case 1:
                jxf jxfVar = (jxf) obj9;
                com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) obj8;
                Msg msg = (Msg) obj7;
                Peer peer = jxfVar.d;
                long j = peer.b;
                int i5 = jxfVar.e;
                gv30.a aVar2 = new gv30.a();
                aVar2.a = j;
                aVar2.a();
                aVar2.b();
                aVar2.c();
                aVar2.c = Integer.valueOf(i5);
                gv30 gv30Var = new gv30(aVar2);
                w2w w2wVar = jxfVar.c;
                new zd20(gv30Var, new utb(w2wVar.I0(), w2wVar.getExperiments()), false, false).a(w2wVar);
                if (aVar.b == 1 && (b = w2wVar.I0().b().a().b(DialogsCounters.Type.BUSINESS_NOTIFY_TOTAL)) != null) {
                    w2wVar.I0().b().a().g(com.vk.im.engine.models.dialogs.d.a(b, b.b - 1));
                }
                if (msg == null) {
                    long j2 = peer.b;
                    gv30.a aVar3 = new gv30.a();
                    aVar3.a = j2;
                    aVar3.a();
                    aVar3.b();
                    aVar3.e = 1;
                    aVar3.d(Integer.MAX_VALUE);
                    new zd20(new gv30(aVar3), new utb(w2wVar.I0(), w2wVar.getExperiments()), false, false).a(w2wVar);
                } else {
                    new com.vk.im.engine.internal.merge.messages.b(jxfVar.d, msg, false, true, 48).o(w2wVar);
                }
                return (List) new wfm(aVar, Integer.valueOf(i5)).o(w2wVar);
            case 2:
                VKList<Photo> vKList = (VKList) obj9;
                neh nehVar = (neh) obj8;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj7;
                VKList vKList2 = (VKList) obj;
                Iterator<T> it2 = vKList2.iterator();
                while (it2.hasNext()) {
                    ((Photo) it2.next()).B = extendedUserProfile != null ? bwd0.l(extendedUserProfile) : null;
                }
                vKList.addAll(vKList2);
                nehVar.d = vKList;
                return vKList;
            case 3:
                Date date = (Date) obj9;
                com.vk.profile.core.scheduled_clips.e eVar = (com.vk.profile.core.scheduled_clips.e) obj8;
                com.vk.profile.core.scheduled_clips.d dVar = (com.vk.profile.core.scheduled_clips.d) obj7;
                Date date2 = (Date) obj;
                if (date2 != null) {
                    date = date2;
                }
                e1i e1iVar = eVar.d;
                ClipVideoFile clipVideoFile = ((d.e) dVar).b;
                int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(date.getTime());
                ey0 ey0Var = new ey0(eVar, 22);
                eb ebVar = new eb(eVar, 25);
                e1iVar.getClass();
                e1i.a(clipVideoFile, seconds, ey0Var, ebVar);
                return s3q0.a;
            case 4:
                x140 x140Var = (x140) obj9;
                com.vk.superapp.multiaccount.api.f fVar3 = (com.vk.superapp.multiaccount.api.f) obj8;
                com.vk.superapp.multiaccount.api.f fVar4 = (com.vk.superapp.multiaccount.api.f) obj7;
                Throwable th = (Throwable) obj;
                if (th instanceof AuthException.DeactivatedUserException) {
                    AuthException.DeactivatedUserException deactivatedUserException = (AuthException.DeactivatedUserException) th;
                    String d = deactivatedUserException.d();
                    VkAuthCredentials g = deactivatedUserException.g();
                    VkAuthMetaInfo vkAuthMetaInfo = VkAuthMetaInfo.h;
                    VkPassportRouterInfo vkPassportRouterInfo = new VkPassportRouterInfo(d, g, VkAuthMetaInfo.a.a(), deactivatedUserException.h(), null, 16, null);
                    DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                    Context context = x140Var.a;
                    r55 r55Var = r55.a;
                    r55.b();
                    Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
                    intent.putExtra("passportData", vkPassportRouterInfo);
                    intent.putExtra("multiAccountData", MultiAccountData.a(MultiAccountData.f, sv1.x(MultiAccountEntryPoint.Restore.d, c8u0.b(fVar3), c8u0.b(fVar4))));
                    DefaultAuthActivity.b.a(intent);
                    x140Var.a.startActivity(intent);
                } else if (th instanceof AuthException.BannedUserException) {
                    BanInfo d2 = ((AuthException.BannedUserException) th).d();
                    VkAuthMetaInfo vkAuthMetaInfo2 = VkAuthMetaInfo.h;
                    VkBanRouterInfo vkBanRouterInfo = new VkBanRouterInfo(d2, VkAuthMetaInfo.a.a());
                    DefaultAuthActivity defaultAuthActivity2 = DefaultAuthActivity.U;
                    Context context2 = x140Var.a;
                    r55 r55Var2 = r55.a;
                    r55.b();
                    Intent intent2 = new Intent(context2, (Class<?>) AuthActivity.class);
                    intent2.putExtra("banData", vkBanRouterInfo);
                    intent2.putExtra("multiAccountData", MultiAccountData.a(MultiAccountData.f, sv1.x(MultiAccountEntryPoint.Restore.d, c8u0.b(fVar3), c8u0.b(fVar4))));
                    DefaultAuthActivity.b.a(intent2);
                    x140Var.a.startActivity(intent2);
                }
                return s3q0.a;
            case 5:
                MusicActionSortingVh musicActionSortingVh = (MusicActionSortingVh) obj9;
                String str5 = (String) obj;
                k5a.d(str5, musicActionSortingVh.j);
                musicActionSortingVh.b((UIBlockActionShowFilters) obj8);
                musicActionSortingVh.h = eda.c(musicActionSortingVh.f, str5, new oap.a((Context) obj7), null, 12);
                return s3q0.a;
            case 6:
                w060 w060Var = (w060) obj8;
                bi20 bi20Var = (bi20) obj7;
                ApiApplication apiApplication = (ApiApplication) obj;
                Object zb = ((CatalogBlock) obj9).m.zb(apiApplication.b);
                CatalogMiniAppItem catalogMiniAppItem = zb instanceof CatalogMiniAppItem ? (CatalogMiniAppItem) zb : null;
                if (catalogMiniAppItem == null) {
                    return null;
                }
                w060Var.getClass();
                return new UIBlockApp(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, apiApplication, catalogMiniAppItem);
            default:
                a.C2077a c2077a = (a.C2077a) obj9;
                izs<Boolean, Boolean> izsVar = c2077a.d;
                boolean z4 = c2077a.f;
                izs<Boolean, Boolean> izsVar2 = c2077a.c;
                com.vk.voip.ui.sessionrooms.dialog.model.a aVar4 = (com.vk.voip.ui.sessionrooms.dialog.model.a) obj8;
                com.vk.voip.ui.sessionrooms.c cVar = (com.vk.voip.ui.sessionrooms.c) obj7;
                a.c cVar2 = (a.c) obj;
                SessionRoomId.Room room = cVar2.b;
                Collection<f.a.b> collection = cVar2.c;
                int i6 = 4;
                int i7 = 9;
                int i8 = 8;
                if (room == null) {
                    Iterator<T> it3 = collection.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj5 = it3.next();
                            if (((f.a.b) obj5).c) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    z2 = obj5 != null;
                    if (izsVar2.invoke(Boolean.valueOf(z2)).booleanValue()) {
                        io.reactivex.rxjava3.core.x<Map<SessionRoomId.Room, Collection<SessionRoomParticipants.Participant>>> c = cVar.c();
                        x310 x310Var = new x310(new tvi0(z4, aVar4), i8);
                        c.getClass();
                        return io.reactivex.rxjava3.core.x.B(new io.reactivex.rxjava3.internal.operators.single.r(c, x310Var), aVar4.a(izsVar.invoke(Boolean.valueOf(z2)).booleanValue(), cVar.i()), new gs00(new wvi0(aVar4, z2, cVar2), i7));
                    }
                    io.reactivex.rxjava3.core.x<Map<SessionRoomId.Room, Collection<SessionRoomParticipants.Participant>>> c2 = cVar.c();
                    x310 x310Var2 = new x310(new tvi0(z4, aVar4), i8);
                    c2.getClass();
                    return new io.reactivex.rxjava3.internal.operators.single.r(c2, x310Var2).l(new hi70(new uw9(aVar4, z2, cVar2, 3), i6));
                }
                Iterator<T> it4 = collection.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next = it4.next();
                        if (epx.f(((f.a.b) next).a, cVar2.b)) {
                            obj6 = next;
                        }
                    } else {
                        obj6 = null;
                    }
                }
                f.a.b bVar = (f.a.b) obj6;
                izs<f.a.b, s3q0> izsVar3 = c2077a.e;
                if (izsVar3 != null) {
                    izsVar3.invoke(bVar);
                }
                if (bVar != null) {
                    boolean z5 = bVar.c;
                    SessionRoomId.Room room2 = bVar.a;
                    return izsVar2.invoke(Boolean.valueOf(z5)).booleanValue() ? io.reactivex.rxjava3.core.x.B(aVar4.a(z4, cVar.d(room2)), aVar4.a(izsVar.invoke(Boolean.valueOf(z5)).booleanValue(), cVar.i()), new oe40(new fn7(aVar4, bVar, cVar2, i8), i7)) : aVar4.a(z4, cVar.d(room2)).l(new i4f0(new q45(aVar4, bVar, cVar2, i2), i6));
                }
                f.a aVar5 = cVar2.a;
                EmptyList emptyList = EmptyList.b;
                c2j.a a = ((c2j) aVar4.b.getValue()).a();
                return io.reactivex.rxjava3.core.x.k(new a.b(aVar5, false, emptyList, emptyList, new svi0(a.e, a.d, a.f)));
        }
    }
}
