package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: Task.kt */
/* loaded from: classes9.dex */
public final class y4o0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ Throwable $error;
    final /* synthetic */ b680 $onFailure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4o0(b680 b680Var, Throwable th) {
        super(0);
        this.$onFailure = b680Var;
        this.$error = th;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.$onFailure.onFailure(this.$error);
        return s3q0.a;
    }
}
