package xsna;

import android.location.Location;
import com.vk.api.generated.tabbar.dto.TabbarItemNameDto;
import com.vk.dto.common.ImageSizeKey;
import com.vk.external.miniapp.net.app.AppFields;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: SuperAppRequestFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class bbn0 implements abn0 {
    public static final bbn0 a = new bbn0();
    public static final bpn0 b = new bpn0(new f84(21));
    public static final bpn0 c = new bpn0(new e20(29));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.abn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 a(Location location, List list, List list2, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList3;
        qvo0.a.getClass();
        TimeZone timeZone = TimeZone.getDefault();
        Date date = new Date();
        int rawOffset = TimeZone.getDefault().getRawOffset();
        if (timeZone.inDaylightTime(date)) {
            rawOffset += timeZone.getDSTSavings();
        }
        StringBuilder sb = new StringBuilder();
        char c2 = rawOffset >= 0 ? '+' : '-';
        int abs = (int) (Math.abs(rawOffset) / 3600000);
        int abs2 = (int) ((Math.abs(rawOffset) / 60000) % 60);
        sb.append(c2);
        if (abs < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(abs);
        sb.append(':');
        if (abs2 < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(abs2);
        String sb2 = sb.toString();
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US).format(new Date(System.currentTimeMillis()));
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            int i = 0;
            arrayList3 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            TabbarItemNameDto[] values = TabbarItemNameDto.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                TabbarItemNameDto tabbarItemNameDto = values[i];
                if (brm0.w(tabbarItemNameDto.i(), str, true)) {
                    arrayList3 = tabbarItemNameDto;
                    break;
                }
                i++;
            }
            if (arrayList3 != null) {
                arrayList4.add(arrayList3);
            }
        }
        Float valueOf = location != null ? Float.valueOf((float) location.getLatitude()) : null;
        Float valueOf2 = location != null ? Float.valueOf((float) location.getLongitude()) : null;
        String a2 = fo8.a(format, sb2);
        q73 q73Var = (q73) b.getValue();
        List list3 = (List) c.getValue();
        q73Var.getClass();
        if (list3 != null) {
            List list4 = list3;
            arrayList3 = new ArrayList(c5g.u(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(q73.a((AppFields) it2.next()).i());
            }
        }
        ufx ufxVar = new ufx("superApp.getShowcase", new com.vk.movika.sdk.base.model.n(28), new xul0(2));
        if (list != null) {
            ufxVar.h("filter", list);
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((TabbarItemNameDto) it3.next()).i());
        }
        ufxVar.h("tabbar_items", arrayList5);
        if (list2 != null) {
            ufxVar.h("active_features", list2);
        }
        if (valueOf != null) {
            ufx.j(ufxVar, "latitude", valueOf.floatValue());
        }
        if (valueOf2 != null) {
            ufx.j(ufxVar, "longitude", valueOf2.floatValue());
        }
        if (a2 != null) {
            ufx.n(ufxVar, "local_time", a2, 0, 12);
        }
        ufxVar.h(SignalingProtocol.KEY_PERMISSIONS, arrayList);
        ufxVar.i("renew_queue", z);
        ufxVar.i("location_on", z2);
        ufxVar.i("is_vpn", z3);
        if (arrayList3 != null) {
            ufxVar.h("app_fields", arrayList3);
        }
        return rsg0.T(yfb.x(ufxVar)).a0(io.reactivex.rxjava3.schedulers.a.a()).U(new bj50(new r50(rbn0.a, 6), 10)).a0(asu0.a.d());
    }
}
