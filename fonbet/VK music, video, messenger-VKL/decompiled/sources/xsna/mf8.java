package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.Editable;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
import com.vk.api.generated.groups.dto.GroupsGetRecommendedTipsListResponseDto;
import com.vk.api.generated.groups.dto.GroupsRecommendedTipsListCategoryDto;
import com.vk.api.generated.groups.dto.GroupsRecommendedTipsListImageObjectsDto;
import com.vk.api.generated.groups.dto.GroupsRecommendedTipsListItemDto;
import com.vk.api.generated.market.dto.MarketGetOrdersExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketIntegrationsGroupsDto;
import com.vk.api.generated.market.dto.MarketOrderDto;
import com.vk.api.generated.market.dto.MarketOrderInfoBannerDto;
import com.vk.api.generated.market.dto.MarketOrderItemDto;
import com.vk.api.generated.market.dto.MarketOrderSellerDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.restore.dto.RestoreGetInstantAuthByNotifyInfoResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import com.vk.ecomm.orders.impl.common.model.OrderGroupPreview;
import com.vk.ecomm.orders.impl.common.model.OrderSource;
import com.vk.ecomm.orders.impl.common.model.OrderStatus;
import com.vk.ecomm.orders.impl.orderlist.domain.OrderPreview;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.superapp.api.dto.restore.VkRestoreInstantAuth;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.ErrorState;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.bbv0;
import xsna.iv80;
import xsna.k8p.a;
import xsna.kku0;

/* compiled from: BroadcastFinishView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class mf8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014c  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v21, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        uy9 uy9Var;
        ?? r12;
        int i;
        CommunityCheckListTip.Type type;
        VkRestoreInstantAuth.Status status;
        String n;
        OrderPreview.ActionType actionType;
        OrderPreview.ActionType actionType2;
        List<MarketOrderItemDto> D;
        ?? r5;
        int i2;
        List<MarketIntegrationsGroupsDto> k;
        ?? r4;
        OrderSource ozon;
        MarketOrderInfoBannerDto marketOrderInfoBannerDto;
        long j;
        MediaPickerState mediaPickerState;
        List<LocalAlbum> list;
        LocalAlbum localAlbum;
        int i3 = 0;
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wf8 wf8Var = (wf8) this.receiver;
                boolean z = !booleanValue;
                bwt0.p0(wf8Var.k, z);
                bwt0.p0(wf8Var.j, z);
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                String str = (String) obj;
                ffc ffcVar = (ffc) this.receiver;
                EditText editView = ffcVar.b.getEditView();
                Editable text = editView.getText();
                if (!epx.f(str, text != null ? text.toString() : null)) {
                    ffcVar.m = true;
                    editView.setText(str);
                    ffcVar.m = false;
                }
                return s3q0.a;
            case 3:
                c5p c5pVar = ((n3g) this.receiver).f;
                (c5pVar == null ? null : c5pVar).b(CollageStatEvent.r.a);
                return s3q0.a;
            case 4:
                GroupsGetRecommendedTipsListResponseDto groupsGetRecommendedTipsListResponseDto = (GroupsGetRecommendedTipsListResponseDto) obj;
                ((jwg) this.receiver).getClass();
                List<GroupsRecommendedTipsListCategoryDto> d = groupsGetRecommendedTipsListResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (GroupsRecommendedTipsListCategoryDto groupsRecommendedTipsListCategoryDto : d) {
                    String d2 = groupsRecommendedTipsListCategoryDto.d();
                    String title = groupsRecommendedTipsListCategoryDto.getTitle();
                    List<GroupsRecommendedTipsListItemDto> e = groupsRecommendedTipsListCategoryDto.e();
                    if (e != null) {
                        List<GroupsRecommendedTipsListItemDto> list2 = e;
                        r12 = new ArrayList(c5g.u(list2, 10));
                        for (GroupsRecommendedTipsListItemDto groupsRecommendedTipsListItemDto : list2) {
                            String title2 = groupsRecommendedTipsListItemDto.getTitle();
                            String e2 = groupsRecommendedTipsListItemDto.e();
                            String d3 = groupsRecommendedTipsListItemDto.d();
                            switch (kwg.$EnumSwitchMapping$0[groupsRecommendedTipsListItemDto.f().ordinal()]) {
                                case 1:
                                    type = CommunityCheckListTip.Type.LOAD_AVATAR;
                                    break;
                                case 2:
                                    type = CommunityCheckListTip.Type.DESCRIPTION;
                                    break;
                                case 3:
                                    type = CommunityCheckListTip.Type.SHORT_URL;
                                    break;
                                case 4:
                                    type = CommunityCheckListTip.Type.ADDRESS;
                                    break;
                                case 5:
                                    type = CommunityCheckListTip.Type.ACTION_BUTTON;
                                    break;
                                case 6:
                                    type = CommunityCheckListTip.Type.MARKET_ITEM;
                                    break;
                                case 7:
                                    type = CommunityCheckListTip.Type.MAKE_POST;
                                    break;
                                case 8:
                                    type = CommunityCheckListTip.Type.COVER_IMAGE;
                                    break;
                                case 9:
                                    type = CommunityCheckListTip.Type.SUBSCRIBE_VK_NEWS;
                                    break;
                                case 10:
                                    type = CommunityCheckListTip.Type.INVITE_FRIENDS;
                                    break;
                                case 11:
                                    type = CommunityCheckListTip.Type.ADS;
                                    break;
                                case 12:
                                    type = CommunityCheckListTip.Type.VKCONNECT;
                                    break;
                                default:
                                    type = CommunityCheckListTip.Type.UNKNOWN;
                                    break;
                            }
                            r12.add(new CommunityCheckListTip(title2, e2, d3, type, groupsRecommendedTipsListItemDto.g()));
                        }
                    } else {
                        r12 = 0;
                    }
                    if (r12 == 0) {
                        r12 = EmptyList.b;
                    }
                    List<GroupsRecommendedTipsListItemDto> e3 = groupsRecommendedTipsListCategoryDto.e();
                    if (e3 != null) {
                        List<GroupsRecommendedTipsListItemDto> list3 = e3;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            i = 0;
                            while (it.hasNext()) {
                                if (((GroupsRecommendedTipsListItemDto) it.next()).g() && (i = i + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                            List<GroupsRecommendedTipsListItemDto> e4 = groupsRecommendedTipsListCategoryDto.e();
                            arrayList.add(new svg(d2, title, r12, i, e4 == null ? e4.size() : 0));
                        }
                    }
                    i = 0;
                    List<GroupsRecommendedTipsListItemDto> e42 = groupsRecommendedTipsListCategoryDto.e();
                    arrayList.add(new svg(d2, title, r12, i, e42 == null ? e42.size() : 0));
                }
                Iterator it2 = arrayList.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    i4 += ((svg) it2.next()).d;
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    i3 += ((svg) it3.next()).e;
                }
                if (i3 == i4) {
                    GroupsRecommendedTipsListImageObjectsDto e5 = groupsGetRecommendedTipsListResponseDto.e().e();
                    String f = e5 != null ? e5.f() : null;
                    if (f == null) {
                        f = "";
                    }
                    GroupsRecommendedTipsListImageObjectsDto d4 = groupsGetRecommendedTipsListResponseDto.e().d();
                    String f2 = d4 != null ? d4.f() : null;
                    uy9Var = new uy9(f, f2 != null ? f2 : "");
                } else if (i4 <= 0 || i3 / i4 >= 2) {
                    GroupsRecommendedTipsListImageObjectsDto e6 = groupsGetRecommendedTipsListResponseDto.e().e();
                    String d5 = e6 != null ? e6.d() : null;
                    if (d5 == null) {
                        d5 = "";
                    }
                    GroupsRecommendedTipsListImageObjectsDto d6 = groupsGetRecommendedTipsListResponseDto.e().d();
                    String d7 = d6 != null ? d6.d() : null;
                    uy9Var = new uy9(d5, d7 != null ? d7 : "");
                } else {
                    GroupsRecommendedTipsListImageObjectsDto e7 = groupsGetRecommendedTipsListResponseDto.e().e();
                    String e8 = e7 != null ? e7.e() : null;
                    if (e8 == null) {
                        e8 = "";
                    }
                    GroupsRecommendedTipsListImageObjectsDto d8 = groupsGetRecommendedTipsListResponseDto.e().d();
                    String e9 = d8 != null ? d8.e() : null;
                    uy9Var = new uy9(e8, e9 != null ? e9 : "");
                }
                return new lvg(i4, i3, arrayList, uy9Var);
            case 5:
                k8p k8pVar = (k8p) this.receiver;
                k8pVar.i = k8pVar.a((k9x) obj);
                k8pVar.g.setAdapter((SpinnerAdapter) k8pVar.new a(k8pVar.b, k8pVar.i));
                k8pVar.d();
                return s3q0.a;
            case 6:
                RestoreGetInstantAuthByNotifyInfoResponseDto restoreGetInstantAuthByNotifyInfoResponseDto = (RestoreGetInstantAuthByNotifyInfoResponseDto) obj;
                ((bcg0) this.receiver).getClass();
                String e10 = restoreGetInstantAuthByNotifyInfoResponseDto.e();
                Long valueOf = Long.valueOf(restoreGetInstantAuthByNotifyInfoResponseDto.l() != null ? r2.intValue() : 0L);
                String j2 = restoreGetInstantAuthByNotifyInfoResponseDto.j();
                VkRestoreInstantAuth.Status.a aVar = VkRestoreInstantAuth.Status.Companion;
                Integer k2 = restoreGetInstantAuthByNotifyInfoResponseDto.k();
                int intValue = k2 != null ? k2.intValue() : 0;
                aVar.getClass();
                VkRestoreInstantAuth.Status[] values = VkRestoreInstantAuth.Status.values();
                int length = values.length;
                while (true) {
                    if (i3 < length) {
                        VkRestoreInstantAuth.Status status2 = values[i3];
                        if (intValue == status2.h()) {
                            status = status2;
                        } else {
                            i3++;
                        }
                    } else {
                        status = null;
                    }
                }
                if (status == null) {
                    throw new IllegalArgumentException("Unknown value for status field");
                }
                String f3 = restoreGetInstantAuthByNotifyInfoResponseDto.f();
                String g = restoreGetInstantAuthByNotifyInfoResponseDto.g();
                String i5 = restoreGetInstantAuthByNotifyInfoResponseDto.i();
                String d9 = restoreGetInstantAuthByNotifyInfoResponseDto.d();
                return new VkRestoreInstantAuth(e10, valueOf, j2, status, f3, g, i5, d9 == null ? "" : d9);
            case 7:
                cau cauVar = (cau) obj;
                w9u w9uVar = (w9u) this.receiver;
                w9uVar.getClass();
                Intent intent = cauVar.a;
                int i6 = cauVar.b;
                if (i6 != -1) {
                    if (i6 == 1) {
                        int i7 = fj5.c;
                        Status status3 = intent == null ? null : (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
                        if (status3 != null) {
                            String str2 = status3.c;
                            if (str2 != null) {
                                bbv0.g.getClass();
                                bbv0.a.d(str2);
                            }
                        }
                        Context mo2getContext = w9uVar.i.mo2getContext();
                        if (mo2getContext != null) {
                            kku0.a.a(w9uVar.j, new com.vk.superapp.vkpay.checkout.feature.success.Status(new ErrorState(mo2getContext.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext.getString(R.string.vk_pay_checkout_system_error_occured)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext.getString(R.string.vk_pay_checkout_failed_try_again), new ml7(11))));
                        }
                    }
                } else if (intent != null) {
                    Parcelable.Creator<PaymentData> creator = PaymentData.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    PaymentData paymentData = (PaymentData) (byteArrayExtra == null ? null : pzg0.a(byteArrayExtra, creator));
                    if (paymentData != null) {
                        String string = new JSONObject(paymentData.h).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token");
                        a8c a8cVar = w9uVar.k;
                        new io.reactivex.rxjava3.internal.operators.single.h(a8c.e(a8c.d(a8cVar.a.e(string))), new wn(new r9(a8cVar, 17), 14)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k41(new b95(w9uVar, 4), 21), new f40(new x9u(1, bbv0.g, bbv0.a.class, "logError", "logError$vkpay_checkout_release(Ljava/lang/Throwable;)V", 0), 24));
                    }
                }
                return s3q0.a;
            case 8:
                ((qav) this.receiver).a((tav) obj);
                return s3q0.a;
            case 9:
                MarketGetOrdersExtendedResponseDto marketGetOrdersExtendedResponseDto = (MarketGetOrdersExtendedResponseDto) obj;
                ((iv80) this.receiver).getClass();
                int count = marketGetOrdersExtendedResponseDto.getCount();
                List<MarketOrderDto> d10 = marketGetOrdersExtendedResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d10, 10));
                for (MarketOrderDto marketOrderDto : d10) {
                    UserId userId = marketOrderDto.getUserId();
                    int id = marketOrderDto.getId();
                    String l = marketOrderDto.l();
                    String str3 = (l == null && (l = marketOrderDto.j()) == null) ? "" : l;
                    OrderStatus.a aVar2 = OrderStatus.Companion;
                    int R = marketOrderDto.R();
                    MarketIntegrationsTypeDto o = marketOrderDto.o();
                    boolean z2 = (o == null || o == MarketIntegrationsTypeDto.NONE) ? false : true;
                    aVar2.getClass();
                    OrderStatus b = OrderStatus.a.b(R, z2);
                    Integer f4 = marketOrderDto.f();
                    boolean z3 = f4 != null ? f4.intValue() != 0 : false;
                    Long valueOf2 = Long.valueOf(marketOrderDto.e());
                    if (marketOrderDto.o() != MarketIntegrationsTypeDto.NONE) {
                        String d11 = marketOrderDto.T().d();
                        byte[] bArr = x2r0.a;
                        try {
                            j = Long.parseLong(d11);
                        } catch (NumberFormatException unused) {
                            j = 0;
                        }
                        if (j <= 0) {
                            n = null;
                            MarketOrderSellerDto M = marketOrderDto.M();
                            OrderPreview.OrderSeller orderSeller = M == null ? new OrderPreview.OrderSeller(M.f(), M.e()) : null;
                            List<MarketOrderInfoBannerDto> u = marketOrderDto.u();
                            String d12 = (u != null || (marketOrderInfoBannerDto = (MarketOrderInfoBannerDto) j5g.Y(u)) == null) ? null : marketOrderInfoBannerDto.d();
                            if (marketOrderDto.C() == null) {
                                actionType2 = OrderPreview.ActionType.Payment;
                            } else {
                                Boolean d13 = marketOrderDto.d();
                                if (d13 != null ? d13.booleanValue() : false) {
                                    actionType2 = OrderPreview.ActionType.Review;
                                } else {
                                    actionType = null;
                                    D = marketOrderDto.D();
                                    if (D != null) {
                                        List<MarketOrderItemDto> list4 = D;
                                        r5 = new ArrayList(c5g.u(list4, 10));
                                        Iterator it4 = list4.iterator();
                                        while (it4.hasNext()) {
                                            MarketOrderItemDto marketOrderItemDto = (MarketOrderItemDto) it4.next();
                                            Iterator it5 = it4;
                                            long f5 = marketOrderItemDto.f();
                                            UserId q = marketOrderItemDto.q();
                                            String title3 = marketOrderItemDto.getTitle();
                                            PhotosPhotoDto g2 = marketOrderItemDto.g();
                                            r5.add(new OrderPreview.Product(f5, q, title3, g2 != null ? xfa0.a(g2).y : null));
                                            it4 = it5;
                                        }
                                    } else {
                                        r5 = EmptyList.b;
                                    }
                                    List list5 = r5;
                                    int p = marketOrderDto.p();
                                    MarketIntegrationsTypeDto o2 = marketOrderDto.o();
                                    i2 = o2 == null ? -1 : iv80.a.$EnumSwitchMapping$0[o2.ordinal()];
                                    if (i2 != 1 || i2 == 2) {
                                        k = marketOrderDto.k();
                                        if (k != null) {
                                            List<MarketIntegrationsGroupsDto> list6 = k;
                                            r4 = new ArrayList(c5g.u(list6, 10));
                                            for (MarketIntegrationsGroupsDto marketIntegrationsGroupsDto : list6) {
                                                r4.add(new OrderGroupPreview(marketIntegrationsGroupsDto.d(), marketIntegrationsGroupsDto.getTitle()));
                                            }
                                        } else {
                                            r4 = EmptyList.b;
                                        }
                                        ozon = new OrderSource.Ozon(r4, marketOrderDto.n(), marketOrderDto.l());
                                    } else {
                                        ozon = OrderSource.Market.b;
                                    }
                                    arrayList2.add(new OrderPreview(userId, id, str3, b, z3, valueOf2, n, orderSeller, d12, actionType, list5, p, ozon));
                                }
                            }
                            actionType = actionType2;
                            D = marketOrderDto.D();
                            if (D != null) {
                            }
                            List list52 = r5;
                            int p2 = marketOrderDto.p();
                            MarketIntegrationsTypeDto o22 = marketOrderDto.o();
                            if (o22 == null) {
                            }
                            if (i2 != 1) {
                            }
                            k = marketOrderDto.k();
                            if (k != null) {
                            }
                            ozon = new OrderSource.Ozon(r4, marketOrderDto.n(), marketOrderDto.l());
                            arrayList2.add(new OrderPreview(userId, id, str3, b, z3, valueOf2, n, orderSeller, d12, actionType, list52, p2, ozon));
                        }
                    }
                    n = marketOrderDto.T().n();
                    MarketOrderSellerDto M2 = marketOrderDto.M();
                    if (M2 == null) {
                    }
                    List<MarketOrderInfoBannerDto> u2 = marketOrderDto.u();
                    if (u2 != null) {
                    }
                    if (marketOrderDto.C() == null) {
                    }
                    actionType = actionType2;
                    D = marketOrderDto.D();
                    if (D != null) {
                    }
                    List list522 = r5;
                    int p22 = marketOrderDto.p();
                    MarketIntegrationsTypeDto o222 = marketOrderDto.o();
                    if (o222 == null) {
                    }
                    if (i2 != 1) {
                    }
                    k = marketOrderDto.k();
                    if (k != null) {
                    }
                    ozon = new OrderSource.Ozon(r4, marketOrderDto.n(), marketOrderDto.l());
                    arrayList2.add(new OrderPreview(userId, id, str3, b, z3, valueOf2, n, orderSeller, d12, actionType, list522, p22, ozon));
                }
                return new gy80(count, arrayList2);
            case 10:
                PostingState postingState = (PostingState) obj;
                ((vpc0) this.receiver).getClass();
                if (!(postingState instanceof PostingState.Editing) || (list = (mediaPickerState = ((PostingState.Editing) postingState).f).c) == null) {
                    return null;
                }
                Iterator it6 = list.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        ?? next = it6.next();
                        if (((LocalAlbum) next).b == mediaPickerState.d) {
                            localAlbum = next;
                        }
                    } else {
                        localAlbum = null;
                    }
                }
                return localAlbum;
            case 11:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            default:
                ((pww0) this.receiver).getClass();
                pww0.U((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf8(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, ffc.class, "setQueryText", "setQueryText(Ljava/lang/String;)V", 0);
                break;
            case 3:
                super(1, obj, n3g.class, "handleUserSlotTransformEnd", "handleUserSlotTransformEnd(Lcom/vk/photo/editor/features/collage/model/SlotId;)V", 0);
                break;
            case 4:
                super(1, obj, jwg.class, "map", "map(Lcom/vk/api/generated/groups/dto/GroupsGetRecommendedTipsListResponseDto;)Lcom/vk/ecomm/checklist/impl/domain/model/CommunityCheckList;", 0);
                break;
            case 5:
                super(1, obj, k8p.class, "setYearRange", "setYearRange(Lkotlin/ranges/IntRange;)V", 0);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                break;
            case 10:
                super(1, obj, vpc0.class, "mapSelectedLocalAlbum", "mapSelectedLocalAlbum(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Lcom/vk/newsfeed/posting/impl/domain/model/LocalAlbum;", 0);
                break;
            case 11:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
