package xsna;

import com.vkontakte.android.data.b;
import java.util.List;

/* compiled from: CatalogAnalyticsTrackerImpl.kt */
/* loaded from: classes14.dex */
public final class w0a {
    public final void a(String str, List<String> list) {
        b.d dVar = new b.d(str);
        dVar.b = true;
        dVar.c = true;
        if (list.size() >= 2) {
            i9x p = swe0.p(2, swe0.q(1, list.size()));
            int i = p.b;
            int i2 = p.c;
            int i3 = p.d;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (true) {
                    dVar.b(list.get(i), list.get(i - 1));
                    if (i == i2) {
                        break;
                    } else {
                        i += i3;
                    }
                }
            }
        }
        dVar.e();
    }
}
