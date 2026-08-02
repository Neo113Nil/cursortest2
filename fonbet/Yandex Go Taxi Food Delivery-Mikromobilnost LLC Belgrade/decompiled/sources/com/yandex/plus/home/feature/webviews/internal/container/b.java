package com.yandex.plus.home.feature.webviews.internal.container;

import com.yandex.plus.log.api.LogPriority;
import defpackage.g8e;
import defpackage.ike;
import defpackage.pgz;
import defpackage.tje;
import defpackage.vzg;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public interface b {
    static void a(b bVar, ArrayList arrayList) {
        a aVar = (a) bVar;
        ike ikeVar = aVar.K;
        if (ikeVar != null) {
            tje.N(ikeVar, null, null, new WebViewsControllerImpl$routeToStoriesList$1(aVar, arrayList, null, null, null, true, null), 3);
        }
    }

    static void b(b bVar, vzg vzgVar, boolean z, String str, String str2, String str3, Map map, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        a aVar = (a) bVar;
        pgz pgzVar = aVar.w;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            StringBuilder sb = new StringBuilder("routeToDeeplink(deeplink=");
            sb.append(vzgVar);
            sb.append(", validateWhitelist=");
            sb.append(z);
            sb.append(", data=");
            g8e.D(sb, str, ", from=", str2, ", place=");
            sb.append(str3);
            sb.append(", payload=");
            sb.append(map);
            sb.append(')');
            pgzVar.a(logPriority, "WebViewsControllerImpl", sb.toString());
        }
        ike ikeVar = aVar.K;
        if (ikeVar != null) {
            tje.N(ikeVar, null, null, new WebViewsControllerImpl$routeToDeeplink$2(aVar, vzgVar, str2, str3, map, str, null), 3);
        }
    }
}
