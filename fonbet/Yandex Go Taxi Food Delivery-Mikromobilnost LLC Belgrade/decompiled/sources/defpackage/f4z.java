package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes8.dex */
public abstract class f4z {
    public static final oz40 a = f.j(null);

    public static final fva0 a() {
        fva0 fva0Var;
        i3y i3yVar = (i3y) a.getValue();
        if (i3yVar != null && (fva0Var = (fva0) i3yVar.getValue()) != null) {
            return fva0Var;
        }
        ny61.r("PerformanceAnalytics wasn't set up");
        return null;
    }
}
