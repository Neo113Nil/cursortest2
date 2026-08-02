package androidx.compose.runtime;

import defpackage.mp60;
import defpackage.rrq0;
import defpackage.u5w;
import defpackage.vrq0;
import defpackage.vuu0;
import defpackage.xy40;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lmp60;", "", "instances", "Lmp60;", "reused", "Lu5w;", "operations", "Lu5w;", "", "lastOperation", CA20Status.STATUS_USER_I, "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ComposePausableCompositionException extends RuntimeException {
    private final mp60 instances;
    private final int lastOperation;
    private final u5w operations;
    private final mp60 reused;

    public ComposePausableCompositionException(mp60 mp60Var, xy40 xy40Var, u5w u5wVar, int i, Exception exc) {
        super(exc);
        this.instances = mp60Var;
        this.reused = xy40Var;
        this.operations = u5wVar;
        this.lastOperation = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.lastOperation);
        sb.append(":\n            |");
        rrq0 a = vrq0.a(new ComposePausableCompositionException$operationsSequence$1(this, null));
        if (a.hasNext()) {
            Object next = a.next();
            if (a.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (a.hasNext()) {
                    arrayList.add(a.next());
                }
                list = arrayList;
            } else {
                list = Collections.singletonList(next);
            }
        } else {
            list = EmptyList.a;
        }
        sb.append(kotlin.collections.a.X(kotlin.collections.a.B0(50, list), "\n", null, null, null, 62));
        sb.append("\n            ");
        return vuu0.d(sb.toString());
    }
}
