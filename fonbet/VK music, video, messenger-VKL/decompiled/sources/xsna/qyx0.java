package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: WorkerUpdater.kt */
/* loaded from: classes12.dex */
public final class qyx0 extends Lambda implements izs<fxx0, String> {
    public static final qyx0 i = new qyx0(1);

    @Override // xsna.izs
    public final String invoke(fxx0 fxx0Var) {
        return fxx0Var.d() ? "Periodic" : "OneTime";
    }
}
