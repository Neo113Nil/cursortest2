package defpackage;

import com.yandex.messaging.internal.gaps.UserGapWorkflow;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class an21 {
    public static UserGapWorkflow a(String str) {
        Object obj;
        Iterator<E> it = UserGapWorkflow.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((UserGapWorkflow) obj).getId(), str)) {
                break;
            }
        }
        UserGapWorkflow userGapWorkflow = (UserGapWorkflow) obj;
        return userGapWorkflow == null ? UserGapWorkflow.Absence : userGapWorkflow;
    }
}
