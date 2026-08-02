package defpackage;

import android.service.notification.StatusBarNotification;
import com.google.android.gms.internal.mlkit_vision_text_common.o;
import com.yandex.go.address.models.Address;
import com.yandex.go.analytics.e;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public abstract class otb1 {
    public static j1b1 a;

    public static final lum a() {
        return new lum(new gse(4), t9f.a, new mtw(26), u9f.a);
    }

    public static uj60 b(StatusBarNotification statusBarNotification) {
        List<String> W;
        String tag = statusBarNotification.getTag();
        if (tag != null) {
            W = evu0.W(tag, new String[]{"_##_"}, (r2 & 4) != 0 ? 0 : 2);
            String str = null;
            String str2 = null;
            Long l = null;
            boolean z = false;
            boolean z2 = false;
            for (String str3 : W) {
                if (cvu0.x(str3, "profile:", false)) {
                    str = str3.substring(8);
                } else if (cvu0.x(str3, "channel:", false)) {
                    str2 = str3.substring(8);
                } else if (str3.equals("inapp")) {
                    z = true;
                } else if (str3.equals("meeting")) {
                    z2 = true;
                } else if (cvu0.x(str3, "uniqueid:", false)) {
                    l = bvu0.m(10, str3.substring(9));
                }
            }
            if (str != null && str2 != null) {
                return new uj60(str, str2, z, z2, l);
            }
        }
        return null;
    }

    public static final yz01 c(Address address) {
        e analyticsData = address.getAnalyticsData();
        LinkedHashMap b = analyticsData != null ? analyticsData.b() : null;
        zzs originPoint = address.getOriginPoint();
        return new yz01(new wz01(address.B().a, address.B().b), address.getPickMethod(), originPoint != null ? new xz01(originPoint.a, originPoint.b) : null, address.getScreen(), String.valueOf(b != null ? b.get("transport_final_suggest_trace_id") : null), String.valueOf(b != null ? b.get("point_id") : null), String.valueOf(b != null ? b.get("choice_id") : null), String.valueOf(b != null ? b.get("ShortcutID") : null), String.valueOf(b != null ? b.get("GridID") : null), String.valueOf(b != null ? b.get("Type") : null), String.valueOf(address.getRequestTime()));
    }

    public static final a011 d(Address address, Double d) {
        zz01 zz01Var = new zz01(address.B().a, address.B().b);
        String screen = address.getScreen();
        if (screen == null) {
            screen = "";
        }
        String valueOf = String.valueOf(address.getRequestTime());
        Double valueOf2 = address.getRequestTime() != null ? Double.valueOf(r4.longValue()) : null;
        double d2 = 0.0d;
        if (valueOf2 != null) {
            if (valueOf2.doubleValue() * d.doubleValue() != 0.0d && valueOf2.doubleValue() >= d.doubleValue()) {
                o430 o430Var = e3n.b;
                d2 = e3n.o(kp50.T(valueOf2.doubleValue() - d.doubleValue(), DurationUnit.MILLISECONDS), DurationUnit.SECONDS);
            }
        }
        return new a011(zz01Var, screen, valueOf, d2, address.getPickAction(), address.getPickMethod());
    }

    public static synchronized o e(String str) {
        o oVar;
        synchronized (otb1.class) {
            vrb1 vrb1Var = new vrb1();
            vrb1Var.a = str;
            vrb1Var.b = true;
            byte b = (byte) (vrb1Var.d | 1);
            vrb1Var.c = 1;
            vrb1Var.d = (byte) (b | 2);
            yrb1 a2 = vrb1Var.a();
            synchronized (otb1.class) {
                try {
                    if (a == null) {
                        a = new j1b1(4);
                    }
                    oVar = (o) a.b(a2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return oVar;
        }
        return oVar;
    }
}
