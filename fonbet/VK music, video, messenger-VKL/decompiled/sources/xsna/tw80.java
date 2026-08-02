package xsna;

import android.content.Intent;
import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.ecomm.orders.impl.PaymentStatus;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.ecomm.checkout.MarketCheckoutExternalPaymentFragment;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: OrderPaymentHandlerImpl.kt */
/* loaded from: classes7.dex */
public final class tw80 implements sw80 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrderPaymentHandlerImpl.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a EXTERNAL;
        public static final a VK_PAY;

        static {
            a aVar = new a("EXTERNAL", 0);
            EXTERNAL = aVar;
            a aVar2 = new a("VK_PAY", 1);
            VK_PAY = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: OrderPaymentHandlerImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.VK_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkPayFragment.PaymentResult.values().length];
            try {
                iArr2[VkPayFragment.PaymentResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VkPayFragment.PaymentResult.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkPayFragment.PaymentResult.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.sw80
    public final void a(OrderPaymentParameters orderPaymentParameters, CommonMarketStat$TypeMarketOrdersItem.Source source, FragmentImpl fragmentImpl) {
        String str = orderPaymentParameters.c;
        String str2 = orderPaymentParameters.b;
        a aVar = myc0.f(str2) ? a.EXTERNAL : myc0.f(str) ? a.VK_PAY : null;
        int i = aVar == null ? -1 : b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i == 1) {
            MarketCheckoutExternalPaymentFragment.a aVar2 = new MarketCheckoutExternalPaymentFragment.a(str2);
            aVar2.F(false, false);
            aVar2.g(898989, fragmentImpl);
        } else {
            if (i != 2) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("app_id");
            String optString2 = jSONObject.optString("action");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            int i2 = VkPayFragment.g0;
            VkPayFragment.a a2 = VkPayFragment.b.a(optString, optString2, optJSONObject);
            Bundle bundle = a2.j;
            bundle.putString("track_code", source.toString());
            bundle.putBoolean("KEY_FILL_MARKET_STAT", true);
            a2.g(898999, fragmentImpl);
        }
    }

    @Override // xsna.sw80
    public final void b(int i, Intent intent, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3) {
        a aVar;
        PaymentStatus a2;
        if (i == 898989) {
            aVar = a.EXTERNAL;
        } else if (i != 898999) {
            return;
        } else {
            aVar = a.VK_PAY;
        }
        int i2 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i2 == 1) {
            int i3 = MarketCheckoutExternalPaymentFragment.P0;
            a2 = MarketCheckoutExternalPaymentFragment.b.a(intent != null ? intent.getExtras() : null);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = VkPayFragment.g0;
            int i5 = b.$EnumSwitchMapping$1[VkPayFragment.b.c(intent).ordinal()];
            if (i5 == 1) {
                a2 = PaymentStatus.SUCCESS;
            } else if (i5 == 2) {
                a2 = PaymentStatus.FAIL;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = PaymentStatus.CANCEL;
            }
        }
        boolean z = aVar == a.VK_PAY && a2 == PaymentStatus.CANCEL;
        if (a2 == PaymentStatus.SUCCESS) {
            gzsVar.invoke();
        } else if (z) {
            gzsVar3.invoke();
        } else {
            gzsVar2.invoke();
        }
    }
}
