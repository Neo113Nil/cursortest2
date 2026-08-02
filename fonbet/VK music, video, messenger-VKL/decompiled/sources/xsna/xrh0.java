package xsna;

import java.util.concurrent.ExecutorService;

/* compiled from: SearchFeatureQueryViewDelegateBinding.kt */
/* loaded from: classes5.dex */
public final class xrh0 implements gzs<s3q0> {
    public final /* synthetic */ zrh0 b;
    public final /* synthetic */ fi50 c;

    public xrh0(zrh0 zrh0Var, fi50 fi50Var) {
        this.b = zrh0Var;
        this.c = fi50Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        com.vk.mvi.core.internal.executors.a.a(new mfn(1, this.b, this.c));
        return s3q0.a;
    }
}
