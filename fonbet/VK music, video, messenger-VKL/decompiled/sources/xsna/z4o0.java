package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: Task.kt */
/* loaded from: classes9.dex */
public final class z4o0 extends Lambda implements izs<dhz<Object>, s3q0> {
    final /* synthetic */ Throwable $error;
    final /* synthetic */ d5o0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4o0(d5o0<Object> d5o0Var, Throwable th) {
        super(1);
        this.this$0 = d5o0Var;
        this.$error = th;
    }

    @Override // xsna.izs
    public final s3q0 invoke(dhz<Object> dhzVar) {
        b680 b680Var = dhzVar.b;
        if (b680Var != null) {
            d5o0<Object> d5o0Var = this.this$0;
            y4o0 y4o0Var = new y4o0(b680Var, this.$error);
            d5o0Var.getClass();
            d5o0.d(null, y4o0Var);
        }
        return s3q0.a;
    }
}
