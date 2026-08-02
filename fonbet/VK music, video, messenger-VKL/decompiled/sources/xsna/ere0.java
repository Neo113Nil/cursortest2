package xsna;

import java.util.HashMap;
import kotlin.Lazy;

/* compiled from: QueueEventsHandler.kt */
/* loaded from: classes5.dex */
public final class ere0 {
    public final Lazy a;
    public final HashMap<String, sq9> b = new HashMap<>();

    public ere0(Lazy<? extends vre0> lazy) {
        this.a = lazy;
    }

    public final <T> void a(dre0<T> dre0Var, String str, izs<? super T, s3q0> izsVar) {
        if (o25.a().b()) {
            HashMap<String, sq9> hashMap = this.b;
            if (hashMap.containsKey(str)) {
                return;
            }
            hashMap.put(str, vre0.e((vre0) this.a.getValue(), dre0Var, null, null, new jh9(izsVar, 3), null, null, 110));
        }
    }
}
