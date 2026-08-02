package defpackage;

import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mobile.drive.sdk.map.MapMobileSdkPlugin;
import com.yandex.mobile.drive.sdk.map.handlers.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class em00 {
    public static void a() {
        List list;
        List list2;
        list = MapMobileSdkPlugin.pendingRequests;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((v8y) it.next()).b.error("map_lease_lost", null, null);
        }
        list2 = MapMobileSdkPlugin.pendingRequests;
        list2.clear();
    }

    public static void b(String str) {
        List list;
        List list2;
        list = MapMobileSdkPlugin.pendingRequests;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((v8y) it.next()).b.success(str);
        }
        list2 = MapMobileSdkPlugin.pendingRequests;
        list2.clear();
    }

    public static String c(tl00 tl00Var, u8y u8yVar, yr00 yr00Var, boolean z) {
        String str;
        String str2 = u8yVar.e;
        if (str2 != null && !z) {
            return str2;
        }
        MapWindow mapWindow = u8yVar.a;
        zvi zviVar = u8yVar.b;
        zvi zviVar2 = u8yVar.d;
        bxl bxlVar = u8yVar.c;
        tl00Var.getClass();
        int i = iib1.a;
        iib1.a = i + 1;
        String i2 = oyr.i(i, "leased_map_view_");
        q4g q4gVar = tl00Var.d;
        if (q4gVar != null) {
            str = (String) q4gVar.b;
            l0b1.h(new AssertionError(oyr.p("map ", str, " already leased"), null));
        } else {
            Map map = mapWindow.getMap();
            map.getMapObjects().setVisible(false);
            tl00Var.c = map.getCameraPosition();
            tl00Var.b = Boolean.valueOf(map.isRotateGesturesEnabled());
            map.setRotateGesturesEnabled(true);
            int i3 = yr00Var.a;
            int i4 = yr00Var.b;
            kzo kzoVar = new kzo(tl00Var.a, i2);
            i4n i4nVar = new i4n(mapWindow, w8y.a, bxlVar, i3, i4);
            List singletonList = Collections.singletonList(new a(i4nVar, zviVar, kzoVar, null, null));
            ArrayList arrayList = new ArrayList(tcc.n(singletonList, 10));
            Iterator it = singletonList.iterator();
            while (it.hasNext()) {
                arrayList.add(((lbp0) it.next()).a());
            }
            tl00Var.d = new q4g(i2, i4nVar, zviVar2, new kht(3, arrayList), kzoVar, 24);
            str = i2;
        }
        u8yVar.e = str;
        return str;
    }
}
