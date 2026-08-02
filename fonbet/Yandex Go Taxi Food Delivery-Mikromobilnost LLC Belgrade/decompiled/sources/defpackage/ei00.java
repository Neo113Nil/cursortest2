package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ei00 extends s8 {
    public static final /* synthetic */ int b = 0;

    static {
        n3w.a(Collections.EMPTY_MAP);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        Map map = this.a;
        LinkedHashMap A = gtq0.A(map.size());
        for (Map.Entry entry : map.entrySet()) {
            A.put(entry.getKey(), ((xvf0) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(A);
    }
}
