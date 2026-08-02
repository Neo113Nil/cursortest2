package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PausableComposition.kt */
/* loaded from: classes11.dex */
public final class eqi extends RuntimeException {
    private final rp70<Object> instances;
    private final int lastOperation;
    private final a9x operations;
    private final rp70<Object> reused;

    public eqi(rp70 rp70Var, fh50 fh50Var, a9x a9xVar, int i, Exception exc) {
        super(exc);
        this.instances = rp70Var;
        this.reused = fh50Var;
        this.operations = a9xVar;
        this.lastOperation = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.lastOperation);
        sb.append(":\n            |");
        vki0 b = g5z.b(new dqi(this, null));
        if (b.hasNext()) {
            Object next = b.next();
            if (b.hasNext()) {
                ArrayList b2 = y57.b(next);
                while (b.hasNext()) {
                    b2.add(b.next());
                }
                list = b2;
            } else {
                list = Collections.singletonList(next);
            }
        } else {
            list = EmptyList.b;
        }
        sb.append(j5g.g0(j5g.I0(50, list), "\n", null, null, 0, null, 62));
        sb.append("\n            ");
        return xqm0.h(sb.toString());
    }
}
