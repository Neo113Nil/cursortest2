package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.yandex.taxi.persuggest.analytics.SelectedLocationChangedAnalytics$AppLaunchType;

/* loaded from: classes6.dex */
public final class co40 {
    public final pho a;

    public /* synthetic */ co40(pho phoVar) {
        this.a = phoVar;
    }

    public static void d(co40 co40Var, String str, String str2, String str3, String str4, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", str);
        if (str2 != null) {
            hashMap.put("open_reason", str2);
        }
        if (str3 != null) {
            hashMap.put("route_id", str3);
        }
        if (str4 != null) {
            hashMap.put("stop_id", str4);
        }
        co40Var.a.a("StopCard.Tapped", hashMap, 1, new HashMap());
    }

    public void a(String str, String str2, String str3, boolean z, boolean z2, String str4, dhq0 dhq0Var, SelectedLocationChangedAnalytics$AppLaunchType selectedLocationChangedAnalytics$AppLaunchType, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList) {
        HashMap u = g8e.u("action", str, "method", str2);
        u.put("position", str3);
        u.put("is_sticky", Boolean.valueOf(z));
        u.put("is_geo_tap", Boolean.valueOf(z2));
        u.put("request_id", str4);
        u.putAll(dhq0Var.b);
        if (str7 != null) {
            u.put("position_time", str7);
        }
        if (str8 != null) {
            u.put("location", str8);
        }
        if (str9 != null) {
            u.put("location_provider", str9);
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((bhq0) it.next()).h);
            }
            u.put("coord_providers", arrayList2);
        }
        u.put("app_launch_type", selectedLocationChangedAnalytics$AppLaunchType.getEventValue());
        u.put("timeSinceAppLaunch", str5);
        this.a.a("SuperappMain.SelectedLocationChanged", u, 1, tse0.r("time_since_app_launch_sec", u, str6));
    }

    public void b(Integer num, String str, String str2) {
        HashMap hashMap = new HashMap();
        if (num != null) {
            hashMap.put(AuthSdkActivity.RESPONSE_TYPE_CODE, num);
        }
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        if (str2 != null) {
            hashMap.put("stop_id", str2);
        }
        this.a.a("StopCard.Loaded", hashMap, 1, new HashMap());
    }

    public void c(String str, String str2, String str3) {
        HashMap p = x4e.p("direction_scroll", str);
        if (str2 != null) {
            p.put("open_reason", str2);
        }
        if (str3 != null) {
            p.put("stop_id", str3);
        }
        this.a.a("StopCard.Scrolled", p, 1, new HashMap());
    }

    public void e(String str, String str2, boolean z) {
        HashMap p = x4e.p("id", str);
        p.put("selected", Boolean.valueOf(z));
        p.put("group_id", str2);
        this.a.a("TaxiOrderCancel.CancelReasonsModalView.Bubble.Clicked", p, 1, new HashMap());
    }
}
