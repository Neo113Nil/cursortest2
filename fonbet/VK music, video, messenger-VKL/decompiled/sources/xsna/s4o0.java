package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: Task.kt */
/* loaded from: classes9.dex */
public final class s4o0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ bc80<Object> $onSuccess;
    final /* synthetic */ Object $resultData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4o0(bc80<Object> bc80Var, Object obj) {
        super(0);
        this.$onSuccess = bc80Var;
        this.$resultData = obj;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.$onSuccess.onSuccess(this.$resultData);
        return s3q0.a;
    }
}
