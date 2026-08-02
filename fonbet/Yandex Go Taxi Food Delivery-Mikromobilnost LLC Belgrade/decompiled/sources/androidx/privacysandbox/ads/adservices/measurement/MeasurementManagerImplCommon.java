package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import defpackage.b43;
import defpackage.bvf0;
import defpackage.dvw;
import defpackage.il41;
import defpackage.j18;
import defpackage.ka10;
import defpackage.lk41;
import defpackage.lsh;
import defpackage.njt0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public abstract class MeasurementManagerImplCommon extends ka10 {
    public final MeasurementManager a;

    public MeasurementManagerImplCommon(MeasurementManager measurementManager) {
        this.a = measurementManager;
    }

    public static Object e(MeasurementManagerImplCommon measurementManagerImplCommon, lsh lshVar, Continuation<? super zy11> continuation) {
        new j18(1, dvw.b(continuation)).u();
        MeasurementManager measurementManager = measurementManagerImplCommon.a;
        throw null;
    }

    public static Object f(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super Integer> continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        measurementManagerImplCommon.a.getMeasurementApiStatus(new b43(1), androidx.core.os.a.a(j18Var));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public static Object h(MeasurementManagerImplCommon measurementManagerImplCommon, njt0 njt0Var, Continuation<? super zy11> continuation) {
        Object n = bvf0.n(new MeasurementManagerImplCommon$registerSource$4(measurementManagerImplCommon, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }

    public static Object i(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, Continuation<? super zy11> continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        measurementManagerImplCommon.a.registerSource(uri, inputEvent, new b43(1), androidx.core.os.a.a(j18Var));
        Object s = j18Var.s();
        return s == CoroutineSingletons.COROUTINE_SUSPENDED ? s : zy11.a;
    }

    public static Object j(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, Continuation<? super zy11> continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        measurementManagerImplCommon.a.registerTrigger(uri, new b43(1), androidx.core.os.a.a(j18Var));
        Object s = j18Var.s();
        return s == CoroutineSingletons.COROUTINE_SUSPENDED ? s : zy11.a;
    }

    public static Object l(MeasurementManagerImplCommon measurementManagerImplCommon, lk41 lk41Var, Continuation<? super zy11> continuation) {
        new j18(1, dvw.b(continuation)).u();
        MeasurementManager measurementManager = measurementManagerImplCommon.a;
        throw null;
    }

    public static Object n(MeasurementManagerImplCommon measurementManagerImplCommon, il41 il41Var, Continuation<? super zy11> continuation) {
        new j18(1, dvw.b(continuation)).u();
        MeasurementManager measurementManager = measurementManagerImplCommon.a;
        throw null;
    }

    @Override // defpackage.ka10
    public Object a(Continuation<? super Integer> continuation) {
        return f(this, continuation);
    }

    @Override // defpackage.ka10
    public Object b(Uri uri, InputEvent inputEvent, Continuation<? super zy11> continuation) {
        return i(this, uri, inputEvent, continuation);
    }

    @Override // defpackage.ka10
    public Object c(Uri uri, Continuation<? super zy11> continuation) {
        return j(this, uri, continuation);
    }

    public Object d(lsh lshVar, Continuation<? super zy11> continuation) {
        return e(this, lshVar, continuation);
    }

    public Object g(njt0 njt0Var, Continuation<? super zy11> continuation) {
        return h(this, njt0Var, continuation);
    }

    public Object k(lk41 lk41Var, Continuation<? super zy11> continuation) {
        return l(this, lk41Var, continuation);
    }

    public Object m(il41 il41Var, Continuation<? super zy11> continuation) {
        return n(this, il41Var, continuation);
    }
}
