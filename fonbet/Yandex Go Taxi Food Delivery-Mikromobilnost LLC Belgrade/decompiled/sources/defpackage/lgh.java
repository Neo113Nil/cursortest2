package defpackage;

import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class lgh {
    public final hit a;
    public final cne0 b;
    public final r0 c;
    public final r0 d;

    public lgh(dne0 dne0Var, hit hitVar) {
        DefaultOutgoingCallType defaultOutgoingCallType;
        this.a = hitVar;
        cne0 a = dne0Var.a("DEFAULT_CALL_TYPE_PREFS");
        this.b = a;
        Object obj = null;
        String l = a.l("DEFAULT_CALL_TYPE", null);
        if (l == null) {
            defaultOutgoingCallType = DefaultOutgoingCallType.ALWAYS_ASK;
        } else {
            DefaultOutgoingCallType.Companion.getClass();
            Iterator<E> it = DefaultOutgoingCallType.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (cvu0.t(((DefaultOutgoingCallType) next).getWireName(), l, true)) {
                    obj = next;
                    break;
                }
            }
            defaultOutgoingCallType = (DefaultOutgoingCallType) obj;
            if (defaultOutgoingCallType == null) {
                defaultOutgoingCallType = DefaultOutgoingCallType.ALWAYS_ASK;
            }
        }
        r0 c = bvf0.c(defaultOutgoingCallType);
        this.c = c;
        this.d = c;
    }
}
