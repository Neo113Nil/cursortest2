package xsna;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes11.dex */
public final class put0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ androidx.lifecycle.l $observer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public put0(Lifecycle lifecycle, out0 out0Var) {
        super(0);
        this.$lifecycle = lifecycle;
        this.$observer = out0Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        this.$lifecycle.removeObserver(this.$observer);
        return s3q0.a;
    }
}
