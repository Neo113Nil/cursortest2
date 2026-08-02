package xsna;

import io.reactivex.rxjava3.internal.operators.observable.a2;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y2a implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y2a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        switch (this.b) {
            case 0:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) this.c;
                sj4 sj4Var = new sj4(new sh3(4, (io.reactivex.rxjava3.internal.operators.observable.b0) this.d, new AtomicBoolean(false)), 2);
                qVar.getClass();
                return new a2.e(new io.reactivex.rxjava3.internal.operators.observable.c1(qVar), sj4Var);
            default:
                b0m0 b0m0Var = (b0m0) this.c;
                String str = (String) this.d;
                File file = ((l9r) b0m0Var.a.getValue()).get(str);
                return file != null ? io.reactivex.rxjava3.core.q.T(file) : new io.reactivex.rxjava3.internal.operators.observable.q(new sj7(4, str, b0m0Var)).U(new fl40(new r5i0(3, b0m0Var, str), 8));
        }
    }
}
