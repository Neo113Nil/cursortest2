package com.vkontakte.android.ecomm.checkout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vk.ecomm.orders.impl.PaymentStatus;
import com.vkontakte.android.fragments.WebViewFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;

/* compiled from: MarketCheckoutExternalPaymentFragment.kt */
/* loaded from: classes7.dex */
public final class MarketCheckoutExternalPaymentFragment extends WebViewFragment {
    public static final /* synthetic */ int P0 = 0;

    /* compiled from: MarketCheckoutExternalPaymentFragment.kt */
    public static final class a extends WebViewFragment.c {
        public a(String str) {
            super(str, MarketCheckoutExternalPaymentFragment.class);
        }
    }

    /* compiled from: MarketCheckoutExternalPaymentFragment.kt */
    public static final class b {
        public static PaymentStatus a(Bundle bundle) {
            PaymentStatus paymentStatus;
            if (bundle == null) {
                return PaymentStatus.CANCEL;
            }
            int i = bundle.getInt("key_payment_status");
            PaymentStatus[] values = PaymentStatus.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    paymentStatus = null;
                    break;
                }
                paymentStatus = values[i2];
                if (paymentStatus.h() == i) {
                    break;
                }
                i2++;
            }
            return paymentStatus == null ? PaymentStatus.CANCEL : paymentStatus;
        }
    }

    /* compiled from: MarketCheckoutExternalPaymentFragment.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentStatus.values().length];
            try {
                iArr[PaymentStatus.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentStatus.FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vkontakte.android.fragments.WebViewFragment
    public final boolean xo(String str) {
        PaymentStatus paymentStatus = null;
        if (str != null) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("Success");
            if (epx.f(queryParameter, "True")) {
                paymentStatus = PaymentStatus.SUCCESS;
            } else if (epx.f(queryParameter, "False")) {
                paymentStatus = PaymentStatus.FAIL;
            } else if (epx.f(parse.getQueryParameter("cancel"), "1")) {
                paymentStatus = PaymentStatus.CANCEL;
            }
        }
        int i = 0;
        if (paymentStatus == null) {
            return false;
        }
        int i2 = c.$EnumSwitchMapping$0[paymentStatus.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        Intent intent = new Intent();
        intent.putExtra("key_payment_status", paymentStatus.h());
        Mf(i, intent);
        return true;
    }
}
