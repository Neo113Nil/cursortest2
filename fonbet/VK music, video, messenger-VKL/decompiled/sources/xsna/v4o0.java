package xsna;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;

/* compiled from: Task.kt */
/* loaded from: classes9.dex */
public final class v4o0 extends Lambda implements izs<f8i, s3q0> {
    final /* synthetic */ Throwable $cause;
    final /* synthetic */ d5o0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4o0(d5o0<Object> d5o0Var, Throwable th) {
        super(1);
        this.this$0 = d5o0Var;
        this.$cause = th;
    }

    @Override // xsna.izs
    public final s3q0 invoke(f8i f8iVar) {
        f8i f8iVar2 = f8iVar;
        d5o0<Object> d5o0Var = this.this$0;
        Executor executor = f8iVar2.b;
        u4o0 u4o0Var = new u4o0(f8iVar2, this.$cause);
        d5o0Var.getClass();
        d5o0.d(executor, u4o0Var);
        return s3q0.a;
    }
}
