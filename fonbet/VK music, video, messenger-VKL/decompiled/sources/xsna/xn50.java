package xsna;

import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import xsna.ao50;
import xsna.gm50;
import xsna.kj50;
import xsna.vk50;

/* compiled from: MviViewController.kt */
/* loaded from: classes.dex */
public interface xn50<F extends vk50<VS, A>, VS extends ao50, A extends kj50> extends gm50 {

    /* compiled from: MviViewController.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <F extends vk50<VS, A>, VS extends ao50, A extends kj50, T> void a(xn50<F, VS, A> xn50Var, yzt0<T> yzt0Var, izs<? super T, s3q0> izsVar) {
            gm50.a.a(xn50Var, yzt0Var, izsVar);
        }

        public static <F extends vk50<VS, A>, VS extends ao50, A extends kj50, R extends fm50<? extends km50>> void b(xn50<F, VS, A> xn50Var, n0u0<R> n0u0Var, izs<? super R, s3q0> izsVar) {
            gm50.a.b(xn50Var, n0u0Var, izsVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <F extends vk50<VS, A>, VS extends ao50, A extends kj50> void c(xn50<F, VS, A> xn50Var, A a) {
            F feature = xn50Var.getFeature();
            if (feature != 0) {
                feature.C(a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <F extends vk50<VS, A>, VS extends ao50, A extends kj50> void d(xn50<F, VS, A> xn50Var, A... aArr) {
            F feature = xn50Var.getFeature();
            if (feature != 0) {
                feature.C((kj50[]) Arrays.copyOf(aArr, aArr.length));
            }
        }
    }

    mk50 Fl();

    void Jh(VS vs, View view);

    void R4(F f);

    void e2(A a2);

    F getFeature();

    F x8(Bundle bundle, km50 km50Var);
}
