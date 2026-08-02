package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class iiz0 extends oi6 {
    public HashMap a;

    public final synchronized Map g(final Context context) {
        if (o8z0.b()) {
            gu8.c(null, "HuaweiOAIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.a != null) {
            return new HashMap(this.a);
        }
        this.a = new HashMap();
        b7z0 b = b7z0.b(context);
        try {
            Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            String e = b.e("hoaid");
            String e2 = b.e("hlimit");
            if (TextUtils.isEmpty(e)) {
                h(context);
            } else {
                this.a.put(CommonUrlParts.HUAWEI_OAID, e);
                this.a.put("oaid_tracking_enabled", e2);
                o8z0.c(new Runnable() { // from class: xsna.hiz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        iiz0.this.h(context);
                    }
                });
            }
            return new HashMap(this.a);
        } catch (Throwable unused) {
            b.d("hoaid", null);
            b.d("hlimit", null);
            return new HashMap();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Context context) {
        String str;
        Method method;
        Object invoke;
        String str2;
        String str3 = null;
        try {
            Class<?> cls = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            gu8.c(null, "HuaweiOAIdDataProvider: Send huawei AId");
            method = cls.getMethod("getAdvertisingIdInfo", Context.class);
        } catch (Throwable unused) {
        }
        if (method != null && (invoke = method.invoke(null, context)) != null) {
            Method method2 = invoke.getClass().getMethod("getId", null);
            if (method2 != null) {
                str2 = (String) method2.invoke(invoke, null);
                try {
                    gu8.c(null, "HuaweiOAIdDataProvider: Huawei AId - " + str2);
                } catch (Throwable unused2) {
                }
            } else {
                str2 = null;
            }
            Method method3 = invoke.getClass().getMethod(X3.j.M, null);
            if (method3 != null) {
                str = (!((Boolean) method3.invoke(invoke, null)).booleanValue() ? 1 : 0) + "";
                try {
                    StringBuilder sb = new StringBuilder("HuaweiOAIdDataProvider: Huawei ad tracking enabled - ");
                    sb.append(!r1.booleanValue());
                    gu8.c(null, sb.toString());
                } catch (Throwable unused3) {
                }
                str3 = str2;
                synchronized (this) {
                    try {
                        if (str3 == null) {
                            this.a.remove(CommonUrlParts.HUAWEI_OAID);
                        } else {
                            this.a.put(CommonUrlParts.HUAWEI_OAID, str3);
                        }
                        if (str == null) {
                            this.a.remove("oaid_tracking_enabled");
                        } else {
                            this.a.put("oaid_tracking_enabled", str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                b7z0.b(context).d("hoaid", str3);
                b7z0.b(context).d("hlimit", str);
                return;
            }
            str = null;
            str3 = str2;
            synchronized (this) {
            }
        }
        str = null;
        synchronized (this) {
        }
    }
}
