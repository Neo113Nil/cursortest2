package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class nlx0 {
    public static mlx0 a(List list) {
        Object obj;
        String str;
        String str2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ServiceLevel.Branding) obj).c == ServiceLevel.Branding.Type.TARIFF_PROMOTION) {
                break;
            }
        }
        ServiceLevel.Branding branding = (ServiceLevel.Branding) obj;
        if (branding == null || (str = branding.e) == null || (str2 = branding.d) == null) {
            return null;
        }
        return new mlx0(str, branding.f, str2);
    }
}
