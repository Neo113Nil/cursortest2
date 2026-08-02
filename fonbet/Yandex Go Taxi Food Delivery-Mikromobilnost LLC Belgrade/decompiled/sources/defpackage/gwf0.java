package defpackage;

import java.util.HashMap;

/* loaded from: classes13.dex */
public final class gwf0 {
    public final HashMap a = new HashMap();

    public final void a(inp0 inp0Var, sls slsVar) {
        if (((sls) this.a.put(inp0Var, slsVar)) == null) {
            return;
        }
        ny61.g("Duplicate SDK component context dependency factory");
    }
}
