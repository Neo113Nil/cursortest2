package xsna;

import com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PhoneValidationOfferHelper.kt */
/* loaded from: classes15.dex */
public final class w3a0 {
    public static final ArrayList a = new ArrayList();

    public static void a(z3a0 z3a0Var) {
        a.add(z3a0Var);
    }

    public static void b(z3a0 z3a0Var) {
        a.remove(z3a0Var);
    }

    public static void c(PhoneValidationPendingEvent phoneValidationPendingEvent) {
        ArrayList arrayList = a;
        if (arrayList.isEmpty()) {
            phoneValidationPendingEvent.n4();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((z3a0) it.next()).a(phoneValidationPendingEvent);
        }
    }
}
