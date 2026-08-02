package xsna;

import com.vk.core.preference.Preference;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class im implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ im(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                om.a.getClass();
                long m = Preference.m(-1L, "AccessibilitySettingsPreferences", "__lastSendTime__");
                long a = qni0.a();
                if (m == -1 || a - m >= TimeUnit.DAYS.toMillis(1L)) {
                    Preference.F(a, "AccessibilitySettingsPreferences", "__lastSendTime__");
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Throwable th = (Throwable) obj;
                L.j(th, "Offline:ActionSynchronizerInteractorImpl", "Error deleting all actions.");
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 2:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((eed) ((Pair) it.next()).j());
                }
                return arrayList;
            default:
                return s3q0.a;
        }
    }
}
