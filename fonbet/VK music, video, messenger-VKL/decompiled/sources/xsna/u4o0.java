package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: Task.kt */
/* loaded from: classes9.dex */
public final class u4o0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ Throwable $cause;
    final /* synthetic */ f8i $completionListenerHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4o0(f8i f8iVar, Throwable th) {
        super(0);
        this.$completionListenerHandler = f8iVar;
        this.$cause = th;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.$completionListenerHandler.a.onComplete(this.$cause);
        return s3q0.a;
    }
}
