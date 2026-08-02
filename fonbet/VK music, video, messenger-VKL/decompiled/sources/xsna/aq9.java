package xsna;

import java.util.UUID;
import kotlin.jvm.internal.Lambda;

/* compiled from: CancelWorkRunnable.kt */
/* loaded from: classes12.dex */
public final class aq9 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ UUID $id;
    final /* synthetic */ dwx0 $workManagerImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq9(dwx0 dwx0Var, UUID uuid) {
        super(0);
        this.$workManagerImpl = dwx0Var;
        this.$id = uuid;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        dwx0 dwx0Var = this.$workManagerImpl;
        dwx0Var.c.v(new yy4(1, dwx0Var, this.$id));
        dwx0 dwx0Var2 = this.$workManagerImpl;
        i8h0.b(dwx0Var2.b, dwx0Var2.c, dwx0Var2.e);
        return s3q0.a;
    }
}
