package defpackage;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class fwf0 implements gnp0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public fwf0(HashMap hashMap) {
        this.a = 0;
        this.b = hashMap;
        this.c = new IdentityHashMap();
    }

    @Override // defpackage.gnp0
    public final hnp0 a(inp0 inp0Var) {
        hnp0 hnp0Var;
        hnp0 a;
        switch (this.a) {
            case 0:
                sls slsVar = (sls) ((Map) this.b).get(inp0Var);
                if (slsVar == null) {
                    return null;
                }
                synchronized (((IdentityHashMap) this.c)) {
                    hnp0 hnp0Var2 = (hnp0) ((IdentityHashMap) this.c).get(inp0Var);
                    if (hnp0Var2 == null) {
                        Object invoke = slsVar.invoke();
                        ((IdentityHashMap) this.c).put(inp0Var, (hnp0) invoke);
                        hnp0Var = (hnp0) invoke;
                    } else {
                        hnp0Var = hnp0Var2;
                    }
                }
                return hnp0Var;
            default:
                gnp0 gnp0Var = (gnp0) this.c;
                return (gnp0Var == null || (a = gnp0Var.a(inp0Var)) == null) ? ((gnp0) this.b).a(inp0Var) : a;
        }
    }

    public fwf0(gnp0 gnp0Var, gnp0 gnp0Var2) {
        this.a = 1;
        this.b = gnp0Var;
        this.c = gnp0Var2;
    }
}
