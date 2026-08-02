package ru.mail.libverify.a0;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import com.vk.dto.common.ImageSizeKey;
import java.lang.reflect.Method;
import java.util.Arrays;
import ru.mail.verify.core.utils.FileLog;
import xsna.drm0;

/* loaded from: classes9.dex */
public final class c extends a {
    private final TelephonyManager g;
    private final SubscriptionInfo h;

    public c(Context context, int i, int i2, String str, int i3, TelephonyManager telephonyManager, SubscriptionInfo subscriptionInfo) {
        super(i, i2, str, i3, telephonyManager, context);
        this.g = telephonyManager;
        this.h = subscriptionInfo;
    }

    @Override // ru.mail.libverify.a0.a
    public final String a(String str) {
        try {
            String a = a(this.g, "getSimSerialNumber", b());
            return a == null ? "" : a;
        } catch (Exception e) {
            FileLog.e("ReflectionTelephonyManager", "get fist sim card unqiue number exception: ", e);
            return "";
        }
    }

    @Override // ru.mail.libverify.a0.a
    public final String c() {
        try {
            Class<?> cls = this.g.getClass();
            Class cls2 = Integer.TYPE;
            Method a = a(cls, "getNetworkCountryIsoForSubscription", cls2);
            if (a == null) {
                a = a(cls, "getNetworkCountryIso", cls2);
            }
            return (String) (a != null ? a.invoke(this.g, Integer.valueOf(this.h.getSubscriptionId())) : null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ru.mail.libverify.a0.a
    public final String d() {
        try {
            Class<?> cls = this.g.getClass();
            Class cls2 = Integer.TYPE;
            Method a = a(cls, "getNetworkOperatorForSubscription", cls2);
            if (a == null) {
                a = a(cls, "getNetworkOperator", cls2);
            }
            return (String) (a != null ? a.invoke(this.g, Integer.valueOf(this.h.getSubscriptionId())) : null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // ru.mail.libverify.a0.a
    public final String e() {
        try {
            return (String) this.g.getClass().getMethod("getNetworkOperatorName", Integer.TYPE).invoke(this.g, Integer.valueOf(this.h.getSubscriptionId()));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ru.mail.libverify.a0.a
    public final int f() {
        try {
            String a = a(this.g, "getSimState", b());
            if (a != null) {
                return Integer.parseInt(a);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // ru.mail.libverify.a0.a
    public final String h() {
        return this.h.getCountryIso();
    }

    @Override // ru.mail.libverify.a0.a
    public final String i() {
        try {
            String a = a(this.g, "getDeviceId", b());
            return a == null ? "" : a;
        } catch (Exception e) {
            FileLog.e("ReflectionTelephonyManager", "getImsi exception: ", e);
            return "";
        }
    }

    @Override // ru.mail.libverify.a0.a
    public final String j() {
        return this.h.getMcc() + drm0.R(String.valueOf(this.h.getMnc()), 2, ImageSizeKey.SIZE_KEY_UNDEFINED);
    }

    @Override // ru.mail.libverify.a0.a
    public final String k() {
        String obj;
        CharSequence carrierName = this.h.getCarrierName();
        return (carrierName == null || (obj = carrierName.toString()) == null) ? this.g.getSimOperatorName() : obj;
    }

    @Override // ru.mail.libverify.a0.a
    public final String m() {
        return a(this.g, "getSubscriberId", b());
    }

    @Override // ru.mail.libverify.a0.a
    public final boolean o() {
        try {
            Boolean bool = (Boolean) this.g.getClass().getMethod("isNetworkRoaming", Integer.TYPE).invoke(this.g, Integer.valueOf(this.h.getSubscriptionId()));
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // ru.mail.libverify.a0.a
    public final boolean p() {
        return false;
    }

    private static String a(TelephonyManager telephonyManager, String str, int i) {
        try {
            Object invoke = telephonyManager.getClass().getMethod(str, Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i));
            if (invoke != null) {
                return invoke.toString();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static Method a(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
