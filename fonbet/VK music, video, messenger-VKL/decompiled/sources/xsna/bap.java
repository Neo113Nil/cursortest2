package xsna;

import androidx.compose.runtime.a;
import java.util.Arrays;
import xsna.eyx;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class bap {
    public static final lgn a = new lgn();

    public static final void a(Object obj, Object obj2, Object obj3, izs<? super lgn, ? extends kgn> izsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:230)");
        }
        boolean J = aVar.J(obj) | aVar.J(obj2) | aVar.J(obj3);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new jgn(izsVar);
            aVar.R(x);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void b(Object obj, Object obj2, izs<? super lgn, ? extends kgn> izsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:192)");
        }
        boolean J = aVar.J(obj) | aVar.J(obj2);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new jgn(izsVar);
            aVar.R(x);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void c(Object obj, izs<? super lgn, ? extends kgn> izsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean J = aVar.J(obj);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new jgn(izsVar);
            aVar.R(x);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void d(Object[] objArr, izs izsVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1307627122, 0, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:266)");
        }
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= aVar.J(obj);
        }
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            aVar.R(new jgn(izsVar));
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:387)");
        }
        kotlin.coroutines.d Q = aVar.Q();
        boolean J = aVar.J(obj) | aVar.J(obj2) | aVar.J(obj3);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new umy(Q, wzsVar);
            aVar.R(x);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void f(Object obj, Object obj2, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:363)");
        }
        kotlin.coroutines.d Q = aVar.Q();
        boolean J = aVar.J(obj) | aVar.J(obj2);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new umy(Q, wzsVar);
            aVar.R(x);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void g(Object obj, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:344)");
        }
        kotlin.coroutines.d Q = aVar.Q();
        boolean J = aVar.J(obj);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = new umy(Q, wzsVar);
            aVar.R(x);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void h(Object[] objArr, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)");
        }
        kotlin.coroutines.d Q = aVar.Q();
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= aVar.J(obj);
        }
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            aVar.R(new umy(Q, wzsVar));
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final void i(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:53)");
        }
        aVar.c0(gzsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final yvj j(kotlin.coroutines.d dVar, androidx.compose.runtime.a aVar) {
        if (dVar.get(eyx.a.b) == null) {
            return new muf0(aVar.Q(), dVar);
        }
        gyx a2 = iyx.a();
        a2.i0(new d8i(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return zvj.a(a2);
    }
}
