package yads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.brm0;
import xsna.c5g;
import xsna.e43;
import xsna.j5g;
import xsna.y57;

/* loaded from: classes10.dex */
public final class rc3 {
    public static final List a = e43.l("The integrated version of the Yandex Mobile Ads SDK is outdated.", "Please update com.yandex.android:mobileads to the latest version.");

    public static String a(int i, String str) {
        return y57.a("* ", str, brm0.x(i - str.length(), " "), " *");
    }

    public static void b() {
        Integer valueOf;
        ArrayList u0 = j5g.u0(a(), j5g.u0(e43.l("Learn more about the latest version of the SDK here:", "https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html"), a));
        Iterator it = u0.iterator();
        String str = null;
        if (it.hasNext()) {
            valueOf = Integer.valueOf(((String) it.next()).length());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((String) it.next()).length());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            String x = brm0.x(intValue + 4, "*");
            ArrayList arrayList = new ArrayList(c5g.u(u0, 10));
            Iterator it2 = u0.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(intValue, (String) it2.next()));
            }
            str = j5g.g0(j5g.v0(x, j5g.u0(arrayList, Collections.singletonList(x))), "\n", null, null, 0, null, 62);
        }
        Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n" + str + "\n");
    }

    public static List a() {
        if (tq.a() != null) {
            return Collections.singletonList("Changelog: " + tq.a());
        }
        return EmptyList.b;
    }
}
