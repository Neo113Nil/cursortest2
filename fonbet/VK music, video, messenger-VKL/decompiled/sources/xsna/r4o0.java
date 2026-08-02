package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: Task.kt */
/* loaded from: classes9.dex */
public final class r4o0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ Throwable $errorData;
    final /* synthetic */ e380 $onCompletionListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4o0(e380 e380Var, Throwable th) {
        super(0);
        this.$onCompletionListener = e380Var;
        this.$errorData = th;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.$onCompletionListener.onComplete(this.$errorData);
        return s3q0.a;
    }
}
