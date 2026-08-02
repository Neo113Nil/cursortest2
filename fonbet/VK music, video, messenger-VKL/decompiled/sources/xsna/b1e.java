package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b1e implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ int b;

    public /* synthetic */ b1e(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        switch (this.b) {
            case 0:
                return io.reactivex.rxjava3.core.q.P(0L, 100L, TimeUnit.MILLISECONDS).x0();
            default:
                return s3q0.a;
        }
    }
}
