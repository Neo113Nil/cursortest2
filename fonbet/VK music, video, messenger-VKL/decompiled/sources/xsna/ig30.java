package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.i9q0;

/* compiled from: MrcNewsfeedWatcher.kt */
/* loaded from: classes14.dex */
public final class ig30 extends io.reactivex.rxjava3.observers.a<i9q0> {
    public final /* synthetic */ jg30 c;

    public ig30(jg30 jg30Var) {
        this.c = jg30Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        if (th != null) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        i9q0 i9q0Var = (i9q0) obj;
        boolean z = i9q0Var instanceof i9q0.a;
        jg30 jg30Var = this.c;
        if (z) {
            jg30Var.e(((i9q0.a) i9q0Var).a);
        } else if (epx.f(i9q0Var, i9q0.b.a)) {
            jg30Var.d();
        } else if (i9q0Var != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
    }
}
