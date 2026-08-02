package defpackage;

import com.yandex.go.slot.dto.SlotItemActionDto$ChangeRequirements;
import com.yandex.go.slot.dto.SlotItemActionDto$CloseAndDeeplink;
import com.yandex.go.slot.dto.SlotItemActionDto$ConfirmAltOption;
import com.yandex.go.slot.dto.SlotItemActionDto$CopyToClipboard;
import com.yandex.go.slot.dto.SlotItemActionDto$Deeplink;
import com.yandex.go.slot.dto.SlotItemActionDto$EditFavoriteRide;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenBottomModal;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenCenterModal;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenComment;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenDetailedPriceModal;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenSettingsModal;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenUrl;
import com.yandex.go.slot.dto.SlotItemActionDto$ShareFavoriteRide;
import com.yandex.go.slot.dto.SlotItemActionDto$StartAcceptancePayment;
import com.yandex.go.slot.dto.SlotItemActionDto$Type;
import com.yandex.go.slot.dto.a2;
import com.yandex.go.slot.dto.b2;
import com.yandex.go.slot.dto.d1;
import com.yandex.go.slot.dto.e0;
import com.yandex.go.slot.dto.f0;
import com.yandex.go.slot.dto.g0;
import com.yandex.go.slot.dto.g1;
import com.yandex.go.slot.dto.h0;
import com.yandex.go.slot.dto.h1;
import com.yandex.go.slot.dto.i0;
import com.yandex.go.slot.dto.i1;
import com.yandex.go.slot.dto.j0;
import com.yandex.go.slot.dto.k0;
import com.yandex.go.slot.dto.k1;
import com.yandex.go.slot.dto.l0;
import com.yandex.go.slot.dto.l1;
import com.yandex.go.slot.dto.m0;
import com.yandex.go.slot.dto.m1;
import com.yandex.go.slot.dto.n0;
import com.yandex.go.slot.dto.n1;
import com.yandex.go.slot.dto.p0;
import com.yandex.go.slot.dto.q0;
import com.yandex.go.slot.dto.q1;
import com.yandex.go.slot.dto.r1;
import com.yandex.go.slot.dto.t1;
import com.yandex.go.slot.dto.u0;
import com.yandex.go.slot.dto.u1;
import com.yandex.go.slot.dto.v1;
import com.yandex.go.slot.dto.w0;
import com.yandex.go.slot.dto.x1;
import com.yandex.go.slot.dto.y0;
import com.yandex.go.slot.dto.z1;
import java.util.List;

/* loaded from: classes13.dex */
public final class lbk0 implements sqs0 {
    public static ibk0 b(b2 b2Var) {
        if (b2Var instanceof SlotItemActionDto$CloseAndDeeplink) {
            return new h9k0(SlotItemActionDto$Type.CLOSE_AND_DEEPLINK.getAnalyticsName(), ((SlotItemActionDto$CloseAndDeeplink) b2Var).a);
        }
        if (b2Var instanceof q0) {
            return new sak0(SlotItemActionDto$Type.CHANGE_SOURCE.getAnalyticsName());
        }
        if (b2Var instanceof l0) {
            return new tak0(SlotItemActionDto$Type.CHANGE_ENTRANCE.getAnalyticsName());
        }
        if (b2Var instanceof k0) {
            return new l9k0(SlotItemActionDto$Type.CHANGE_DESTINATION.getAnalyticsName());
        }
        if (b2Var instanceof m1) {
            return new hak0(SlotItemActionDto$Type.OPEN_PAYMENT.getAnalyticsName());
        }
        if (b2Var instanceof j0) {
            return new c9k0(SlotItemActionDto$Type.CANCEL_ORDER.getAnalyticsName());
        }
        if (b2Var instanceof g0) {
            return new mak0(SlotItemActionDto$Type.ADD_ROUTE_POINT.getAnalyticsName());
        }
        if (b2Var instanceof p0) {
            return new nak0(SlotItemActionDto$Type.CHANGE_ROUTE_POINT.getAnalyticsName());
        }
        if (b2Var instanceof v1) {
            return new qak0(SlotItemActionDto$Type.SET_USER_COMING.getAnalyticsName());
        }
        if (b2Var instanceof l1) {
            return new dak0(SlotItemActionDto$Type.OPEN_ORDER_INFO.getAnalyticsName());
        }
        if (b2Var instanceof d1) {
            return new cak0(SlotItemActionDto$Type.OPEN_CHAT.getAnalyticsName());
        }
        if (b2Var instanceof i1) {
            return new z9k0(SlotItemActionDto$Type.OPEN_DEAF_DRIVER.getAnalyticsName());
        }
        if (b2Var instanceof h0) {
            return new b9k0(SlotItemActionDto$Type.CALL_DRIVER.getAnalyticsName());
        }
        if (b2Var instanceof n1) {
            return new eak0(SlotItemActionDto$Type.OPEN_SAFETY_CENTER.getAnalyticsName());
        }
        if (b2Var instanceof r1) {
            return new fak0(SlotItemActionDto$Type.OPEN_TIPS_MODAL.getAnalyticsName());
        }
        if (b2Var instanceof x1) {
            return new rak0(SlotItemActionDto$Type.SHARE_ROUTE.getAnalyticsName());
        }
        if (b2Var instanceof u0) {
            return new r9k0(SlotItemActionDto$Type.CREATE_ORDER.getAnalyticsName());
        }
        if (b2Var instanceof SlotItemActionDto$OpenUrl) {
            String str = ((SlotItemActionDto$OpenUrl) b2Var).a;
            return (str == null || str.length() == 0) ? s9k0.a : new gak0(SlotItemActionDto$Type.OPEN_URL.getAnalyticsName(), str);
        }
        if (b2Var instanceof SlotItemActionDto$OpenCenterModal) {
            SlotItemActionDto$OpenCenterModal slotItemActionDto$OpenCenterModal = (SlotItemActionDto$OpenCenterModal) b2Var;
            String str2 = slotItemActionDto$OpenCenterModal.a;
            String str3 = slotItemActionDto$OpenCenterModal.b;
            String str4 = slotItemActionDto$OpenCenterModal.c;
            return (str2.length() <= 0 || str3.length() <= 0 || str4.length() <= 0) ? s9k0.a : new u9k0(SlotItemActionDto$Type.OPEN_CENTER_MODAL.getAnalyticsName(), str2, str3, str4);
        }
        if (b2Var instanceof SlotItemActionDto$OpenBottomModal) {
            SlotItemActionDto$OpenBottomModal slotItemActionDto$OpenBottomModal = (SlotItemActionDto$OpenBottomModal) b2Var;
            n7v n7vVar = slotItemActionDto$OpenBottomModal.a;
            String str5 = slotItemActionDto$OpenBottomModal.b;
            String str6 = slotItemActionDto$OpenBottomModal.c;
            String str7 = slotItemActionDto$OpenBottomModal.e;
            List list = slotItemActionDto$OpenBottomModal.d;
            return (str5.length() <= 0 || str6.length() <= 0 || str7.length() <= 0 || list.isEmpty()) ? s9k0.a : new t9k0(SlotItemActionDto$Type.OPEN_BOTTOM_MODAL.getAnalyticsName(), new uc6(n7vVar, str5, str6, str7, list, slotItemActionDto$OpenBottomModal.f));
        }
        if (b2Var instanceof SlotItemActionDto$OpenDetailedPriceModal) {
            String analyticsName = SlotItemActionDto$Type.OPEN_DETAILED_PRICE_MODAL.getAnalyticsName();
            String str8 = ((SlotItemActionDto$OpenDetailedPriceModal) b2Var).a;
            return str8.length() > 0 ? new aak0(analyticsName, str8) : s9k0.a;
        }
        v9k0 v9k0Var = null;
        if (b2Var instanceof SlotItemActionDto$OpenComment) {
            SlotItemActionDto$OpenComment.Support support = ((SlotItemActionDto$OpenComment) b2Var).a;
            if (support != null) {
                String str9 = support.a;
                String str10 = support.b;
                if (!evu0.J(str9) && !evu0.J(str10)) {
                    v9k0Var = new v9k0(str9, str10);
                }
            }
            return new w9k0(SlotItemActionDto$Type.OPEN_COMMENT.getAnalyticsName(), v9k0Var);
        }
        if (b2Var instanceof k1) {
            return new bak0(SlotItemActionDto$Type.OPEN_DETAILS.getAnalyticsName());
        }
        if (b2Var instanceof g1) {
            return new x9k0(SlotItemActionDto$Type.OPEN_COMPACT_OR_DETAILS.getAnalyticsName());
        }
        if (b2Var instanceof h1) {
            return new y9k0(SlotItemActionDto$Type.OPEN_COST_CENTER.getAnalyticsName());
        }
        if (b2Var instanceof z1) {
            return new fbk0(SlotItemActionDto$Type.TOGGLE_SHARE_LOCATION.getAnalyticsName());
        }
        if (b2Var instanceof q1) {
            return new xak0(SlotItemActionDto$Type.OPEN_SUPPORT.getAnalyticsName());
        }
        if (b2Var instanceof m0) {
            return new iak0(SlotItemActionDto$Type.CHANGE_RATING.getAnalyticsName(), 0);
        }
        if (b2Var instanceof n0) {
            return new jak0(SlotItemActionDto$Type.CHANGE_RATING_AND_OPEN_DETAILS.getAnalyticsName(), 0);
        }
        if (b2Var instanceof SlotItemActionDto$Deeplink) {
            return new k9k0(((SlotItemActionDto$Deeplink) b2Var).a, SlotItemActionDto$Type.DEEPLINK.getAnalyticsName());
        }
        if (b2Var instanceof u1) {
            return new pak0(SlotItemActionDto$Type.SET_CHECK_IN_CONFIRMED.getAnalyticsName());
        }
        if (b2Var instanceof SlotItemActionDto$ChangeRequirements) {
            return new f9k0(SlotItemActionDto$Type.CHANGE_REQUIREMENTS.getAnalyticsName(), ((SlotItemActionDto$ChangeRequirements) b2Var).a);
        }
        if (b2Var instanceof SlotItemActionDto$StartAcceptancePayment) {
            SlotItemActionDto$StartAcceptancePayment slotItemActionDto$StartAcceptancePayment = (SlotItemActionDto$StartAcceptancePayment) b2Var;
            return new vak0(SlotItemActionDto$Type.START_ACCEPTANCE_PAYMENT.getAnalyticsName(), slotItemActionDto$StartAcceptancePayment.a, slotItemActionDto$StartAcceptancePayment.b);
        }
        if (!(b2Var instanceof i0) && !(b2Var instanceof SlotItemActionDto$ConfirmAltOption) && !(b2Var instanceof y0) && !(b2Var instanceof a2) && !(b2Var instanceof e0) && !(b2Var instanceof t1) && !jl40.l(b2Var, f0.INSTANCE) && !(b2Var instanceof SlotItemActionDto$CopyToClipboard) && !(b2Var instanceof SlotItemActionDto$OpenSettingsModal) && !(b2Var instanceof w0) && !(b2Var instanceof SlotItemActionDto$ShareFavoriteRide) && !(b2Var instanceof SlotItemActionDto$EditFavoriteRide)) {
            w511.b();
            return null;
        }
        return s9k0.a;
    }

    @Override // defpackage.sqs0
    public final /* bridge */ /* synthetic */ nqs0 a(b2 b2Var) {
        return b(b2Var);
    }
}
