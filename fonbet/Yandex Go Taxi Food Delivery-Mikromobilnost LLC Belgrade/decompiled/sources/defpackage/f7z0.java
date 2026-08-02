package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class f7z0 {
    public final Calendar a;
    public final String b;
    public final ArrayList c;

    public f7z0(Calendar calendar, String str, ArrayList arrayList) {
        this.a = calendar;
        this.b = str;
        this.c = arrayList;
    }

    public final g7z0 a(Calendar calendar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Calendar calendar2 = ((g7z0) obj).a;
            wf7 wf7Var = wf7.a;
            if (calendar != null) {
                if (wf7.e(calendar, calendar2) && calendar.get(11) == calendar2.get(11)) {
                    break;
                }
            } else if (calendar == calendar2) {
                break;
            }
        }
        return (g7z0) obj;
    }
}
