package ru.mail.libverify.a0;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import xsna.d02;
import xsna.lhg;

/* loaded from: classes9.dex */
public abstract class a {
    private final int a;
    private final int b;
    private final String c;
    private final int d;
    private final TelephonyManager e;
    private final Context f;

    /* renamed from: ru.mail.libverify.a0.a$a, reason: collision with other inner class name */
    public static final class C2189a {
        public static a a(Context context, Integer num) {
            SubscriptionInfo activeSubscriptionInfoForSimSlotIndex;
            int subscriptionId;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw new Exception("Failed to get TELEPHONY_SERVICE");
            }
            SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
            if (subscriptionManager == null) {
                throw new Exception("Failed to get TELEPHONY_SUBSCRIPTION_SERVICE");
            }
            int activeSubscriptionInfoCount = subscriptionManager.getActiveSubscriptionInfoCount();
            int activeSubscriptionInfoCountMax = subscriptionManager.getActiveSubscriptionInfoCountMax();
            if (num == null) {
                subscriptionId = SubscriptionManager.getDefaultSubscriptionId();
                activeSubscriptionInfoForSimSlotIndex = subscriptionManager.getActiveSubscriptionInfo(subscriptionId);
            } else {
                activeSubscriptionInfoForSimSlotIndex = subscriptionManager.getActiveSubscriptionInfoForSimSlotIndex(num.intValue());
                if (activeSubscriptionInfoForSimSlotIndex == null) {
                    throw new IllegalArgumentException(("Failed to create subscriptionInfo for slot[" + num + ']').toString());
                }
                subscriptionId = activeSubscriptionInfoForSimSlotIndex.getSubscriptionId();
            }
            if (activeSubscriptionInfoForSimSlotIndex == null) {
                return new b(activeSubscriptionInfoCount, activeSubscriptionInfoCountMax, "", -1, telephonyManager, context);
            }
            TelephonyManager createForSubscriptionId = telephonyManager.createForSubscriptionId(subscriptionId);
            if (createForSubscriptionId == null) {
                throw new IllegalArgumentException(lhg.a(subscriptionId, "Can not create telephonyManager for subId:"));
            }
            String number = activeSubscriptionInfoForSimSlotIndex.getNumber();
            if (number == null) {
                number = "";
            }
            return new b(activeSubscriptionInfoCount, activeSubscriptionInfoCountMax, number, activeSubscriptionInfoForSimSlotIndex.getSimSlotIndex(), createForSubscriptionId, context);
        }
    }

    public a(int i, int i2, String str, int i3, TelephonyManager telephonyManager, Context context) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = telephonyManager;
        this.f = context;
    }

    public final String a() {
        return this.c;
    }

    public abstract String a(String str);

    public final int b() {
        return this.d;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract int f();

    public final int g() {
        return this.a;
    }

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public final int l() {
        return this.b;
    }

    public abstract String m();

    public final boolean n() {
        return (((d02.n(this.f, "android.permission.READ_PHONE_STATE") == 0) || (d02.n(this.f, "android.permission.ACCESS_NETWORK_STATE") == 0)) ? this.e.isDataEnabled() : false) || (this.e.getDataState() == 2);
    }

    public abstract boolean o();

    public abstract boolean p();
}
