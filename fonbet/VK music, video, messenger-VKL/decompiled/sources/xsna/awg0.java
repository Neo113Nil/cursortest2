package xsna;

/* compiled from: RxTaskExecutionScope.kt */
/* loaded from: classes3.dex */
public interface awg0 extends kn50 {

    /* compiled from: RxTaskExecutionScope.kt */
    public static final class a {
        public static /* synthetic */ yvg0 a(awg0 awg0Var, io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.a aVar2, int i) {
            if ((i & 1) != 0) {
                fVar = io.reactivex.rxjava3.internal.functions.a.f;
            }
            if ((i & 2) != 0) {
                aVar2 = io.reactivex.rxjava3.internal.functions.a.c;
            }
            return awg0Var.h(aVar, fVar, aVar2);
        }

        public static /* synthetic */ yvg0 b(awg0 awg0Var, io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.f fVar2, int i) {
            if ((i & 1) != 0) {
                fVar = io.reactivex.rxjava3.internal.functions.a.f;
            }
            if ((i & 2) != 0) {
                aVar = io.reactivex.rxjava3.internal.functions.a.c;
            }
            if ((i & 4) != 0) {
                fVar2 = io.reactivex.rxjava3.internal.functions.a.d;
            }
            return awg0Var.q(qVar, fVar, aVar, fVar2);
        }
    }

    zvg0 g(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2);

    zvg0 h(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.a aVar2);

    zvg0 q(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.f fVar2);

    jm50 r();
}
