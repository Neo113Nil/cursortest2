package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: Task.kt */
/* loaded from: classes9.dex */
public final class x4o0 extends Lambda implements izs<dhz<Object>, s3q0> {
    final /* synthetic */ Object $data;
    final /* synthetic */ d5o0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4o0(d5o0<Object> d5o0Var, Object obj) {
        super(1);
        this.this$0 = d5o0Var;
        this.$data = obj;
    }

    @Override // xsna.izs
    public final s3q0 invoke(dhz<Object> dhzVar) {
        bc80<Object> bc80Var = dhzVar.a;
        if (bc80Var != null) {
            d5o0<Object> d5o0Var = this.this$0;
            w4o0 w4o0Var = new w4o0(bc80Var, this.$data);
            d5o0Var.getClass();
            d5o0.d(null, w4o0Var);
        }
        return s3q0.a;
    }
}
