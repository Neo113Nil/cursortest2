package com.vkontakte.android.ecomm.checkout;

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
import xsna.asp;
import xsna.ic;
import xsna.m7c;
import xsna.myc0;
import xsna.yh;
import xsna.zrp;

/* compiled from: CheckoutPaymentHandlerImpl.kt */
/* loaded from: classes7.dex */
public final class a implements m7c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutPaymentHandlerImpl.kt */
    /* renamed from: com.vkontakte.android.ecomm.checkout.a$a, reason: collision with other inner class name */
    public static final class EnumC2102a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EnumC2102a[] $VALUES;
        public static final EnumC2102a EXTERNAL;
        public static final EnumC2102a VK_PAY;

        static {
            EnumC2102a enumC2102a = new EnumC2102a("EXTERNAL", 0);
            EXTERNAL = enumC2102a;
            EnumC2102a enumC2102a2 = new EnumC2102a("VK_PAY", 1);
            VK_PAY = enumC2102a2;
            EnumC2102a[] enumC2102aArr = {enumC2102a, enumC2102a2};
            $VALUES = enumC2102aArr;
            $ENTRIES = new asp(enumC2102aArr);
        }

        public EnumC2102a() {
            throw null;
        }

        public static EnumC2102a valueOf(String str) {
            return (EnumC2102a) Enum.valueOf(EnumC2102a.class, str);
        }

        public static EnumC2102a[] values() {
            return (EnumC2102a[]) $VALUES.clone();
        }
    }

    /* compiled from: CheckoutPaymentHandlerImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC2102a.values().length];
            try {
                iArr[EnumC2102a.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2102a.VK_PAY.ordinal()] = 2;
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

    @Override // xsna.m7c
    public final void a(OrderPaymentParameters orderPaymentParameters, CommonMarketStat$TypeMarketOrdersItem.Source source, FragmentImpl fragmentImpl) {
        String str = orderPaymentParameters.c;
        String str2 = orderPaymentParameters.b;
        EnumC2102a enumC2102a = myc0.f(str2) ? EnumC2102a.EXTERNAL : myc0.f(str) ? EnumC2102a.VK_PAY : null;
        int i = enumC2102a == null ? -1 : b.$EnumSwitchMapping$0[enumC2102a.ordinal()];
        if (i == 1) {
            MarketCheckoutExternalPaymentFragment.a aVar = new MarketCheckoutExternalPaymentFragment.a(str2);
            aVar.F(false, false);
            aVar.g(898989, fragmentImpl);
        } else {
            if (i != 2) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("app_id");
            String optString2 = jSONObject.optString("action");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            int i2 = VkPayFragment.g0;
            VkPayFragment.a a = VkPayFragment.b.a(optString, optString2, optJSONObject);
            Bundle bundle = a.j;
            bundle.putString("track_code", source.toString());
            bundle.putBoolean("KEY_FILL_MARKET_STAT", true);
            a.g(898999, fragmentImpl);
        }
    }

    @Override // xsna.m7c
    public final void b(int i, Intent intent, yh yhVar, ic icVar, com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar) {
        EnumC2102a enumC2102a;
        PaymentStatus a;
        if (i == 898989) {
            enumC2102a = EnumC2102a.EXTERNAL;
        } else if (i != 898999) {
            return;
        } else {
            enumC2102a = EnumC2102a.VK_PAY;
        }
        int i2 = b.$EnumSwitchMapping$0[enumC2102a.ordinal()];
        if (i2 == 1) {
            int i3 = MarketCheckoutExternalPaymentFragment.P0;
            a = MarketCheckoutExternalPaymentFragment.b.a(intent != null ? intent.getExtras() : null);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = VkPayFragment.g0;
            int i5 = b.$EnumSwitchMapping$1[VkPayFragment.b.c(intent).ordinal()];
            if (i5 == 1) {
                a = PaymentStatus.SUCCESS;
            } else if (i5 == 2) {
                a = PaymentStatus.FAIL;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a = PaymentStatus.CANCEL;
            }
        }
        boolean z = enumC2102a == EnumC2102a.VK_PAY && a == PaymentStatus.CANCEL;
        if (a == PaymentStatus.SUCCESS) {
            yhVar.invoke();
        } else if (z) {
            aVar.invoke();
        } else {
            icVar.invoke();
        }
    }

    @Override // xsna.m7c
    public final boolean c(int i) {
        return i == 898989 || i == 898999;
    }
}
