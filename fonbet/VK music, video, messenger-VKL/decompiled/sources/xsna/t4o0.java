package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: Task.kt */
/* loaded from: classes9.dex */
public final class t4o0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ b680 $onFailure;
    final /* synthetic */ Throwable $resultError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4o0(b680 b680Var, Throwable th) {
        super(0);
        this.$onFailure = b680Var;
        this.$resultError = th;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.$onFailure.onFailure(this.$resultError);
        return s3q0.a;
    }
}
