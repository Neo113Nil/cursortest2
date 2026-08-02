package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: SingleSubscribeOn.kt */
/* loaded from: classes11.dex */
public final class gwj0<T> extends ctj0<T> {
    public final ctj0<T> a;
    public final pcn b;

    /* compiled from: SingleSubscribeOn.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ wuj0<T> $downstream;
        final /* synthetic */ gwj0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gwj0<T> gwj0Var, wuj0<T> wuj0Var) {
            super(0);
            this.this$0 = gwj0Var;
            this.$downstream = wuj0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.this$0.a.a(this.$downstream);
            return s3q0.a;
        }
    }

    public gwj0(ctj0<T> ctj0Var, pcn pcnVar) {
        this.a = ctj0Var;
        this.b = pcnVar;
    }

    @Override // xsna.ctj0
    public final void a(wuj0<T> wuj0Var) {
        this.b.b(new a(this, wuj0Var));
    }
}
