package xsna;

import android.view.ViewGroup;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kbu0 implements izs {
    public final /* synthetic */ nbu0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ kbu0(nbu0 nbu0Var, int i, ViewGroup viewGroup) {
        this.b = nbu0Var;
        this.c = i;
        this.d = viewGroup;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
        final nbu0 nbu0Var = this.b;
        final int i = this.c;
        final ViewGroup viewGroup = this.d;
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.mbu0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e3m.b(nbu0.this.a).inflate(i, viewGroup, false);
            }
        }).q(asu0.a.d());
    }
}
