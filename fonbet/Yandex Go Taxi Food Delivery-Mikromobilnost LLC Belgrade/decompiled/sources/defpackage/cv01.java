package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cv01 {
    public final AppAnalyticsReporter a;
    public final sb6 b;
    public final ro01 c;
    public final Context d;
    public boolean e;

    public cv01(AppAnalyticsReporter appAnalyticsReporter, sb6 sb6Var, ro01 ro01Var, Context context) {
        this.a = appAnalyticsReporter;
        this.b = sb6Var;
        this.c = ro01Var;
        this.d = context;
    }

    public static String a(Integer num) {
        return (num != null && num.intValue() == 4) ? "collapsed" : (num != null && num.intValue() == 3) ? "expanded" : "half";
    }

    public final void b(boolean z) {
        if (this.e) {
            return;
        }
        this.e = true;
        mo01 b = ((qu01) this.c).b();
        if (b != null) {
            ArrayList arrayList = b.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((lo01) it.next()).d;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
            if (arrayList3 != null) {
                rt1 rt1Var = this.a.r0;
                String X = a.X(arrayList3, Extension.FIX_SPACE, null, null, null, 62);
                Boolean valueOf = z ? null : Boolean.valueOf(z);
                LinkedHashMap w = g8e.w(2, "guideline_type", X);
                if (valueOf != null) {
                    w.put("fits_on_screen", valueOf);
                }
                rt1Var.a.a("transfers_dashboard.qr_scanner_guideline.shown", w);
            }
        }
    }
}
