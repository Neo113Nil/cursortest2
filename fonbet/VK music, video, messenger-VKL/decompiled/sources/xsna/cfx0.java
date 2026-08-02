package xsna;

import com.vk.dto.common.PaymentType;
import com.vk.superapp.bridges.SuperappPurchasesBridge$PurchaseResult;
import com.vk.superapp.bridges.dto.MiniAppPaymentType;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.eq20;

/* compiled from: WebAppPurchasesBridge.kt */
/* loaded from: classes11.dex */
public final class cfx0 {
    public final eq20 a;

    /* compiled from: WebAppPurchasesBridge.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SuperappPurchasesBridge$PurchaseResult.values().length];
            try {
                iArr[SuperappPurchasesBridge$PurchaseResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperappPurchasesBridge$PurchaseResult.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperappPurchasesBridge$PurchaseResult.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuperappPurchasesBridge$PurchaseResult.UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MiniAppPaymentType.values().length];
            try {
                iArr2[MiniAppPaymentType.Inapp.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MiniAppPaymentType.Subs.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MiniAppPaymentType.Balance.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public cfx0(oge0 oge0Var) {
        this.a = new eq20(oge0Var);
    }

    public final List<Long> a() {
        return e43.l(Long.valueOf(InternalVkMiniApps.DATING.h().a), Long.valueOf(InternalVkMiniApps.VK_DATING_DEV.h().a), Long.valueOf(InternalVkMiniApps.VK_DATING_DEV_FRONTEND.h().a), Long.valueOf(InternalVkMiniApps.VK_WORKOUT_STAGE.h().a), Long.valueOf(InternalVkMiniApps.VK_WORKOUT_PROD.h().a), Long.valueOf(InternalVkMiniApps.VK_WORKOUT_DEV.h().a), Long.valueOf(InternalVkMiniApps.NFTS.h().a), Long.valueOf(InternalVkMiniApps.VK_NUTRITION_PROD.h().a), Long.valueOf(InternalVkMiniApps.VK_NUTRITION_STAGE.h().a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v4 */
    public final void b(ArrayList arrayList, ArrayList arrayList2, x2y x2yVar) {
        LinkedHashMap linkedHashMap;
        oge0 oge0Var = this.a.b;
        LinkedHashMap linkedHashMap2 = null;
        if (arrayList2 != null) {
            int e = on00.e(c5g.u(arrayList2, 10));
            if (e < 16) {
                e = 16;
            }
            linkedHashMap = new LinkedHashMap(e);
            for (Object obj : arrayList2) {
                linkedHashMap.put(obj, new dq20((String) obj, PaymentType.Subs, null));
            }
        } else {
            linkedHashMap = null;
        }
        ?? r11 = jgp.b;
        if (linkedHashMap == null) {
            linkedHashMap = r11;
        }
        if (arrayList != null) {
            int e2 = on00.e(c5g.u(arrayList, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
            for (Object obj2 : arrayList) {
                linkedHashMap3.put(obj2, new dq20((String) obj2, PaymentType.Inapp, null));
            }
            linkedHashMap2 = linkedHashMap3;
        }
        if (linkedHashMap2 != null) {
            r11 = linkedHashMap2;
        }
        eq20.a aVar = new eq20.a(r11.size() + linkedHashMap.size(), x2yVar);
        if (!r11.isEmpty()) {
            oge0Var.e(r11, aVar);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        oge0Var.h(linkedHashMap, aVar);
    }
}
