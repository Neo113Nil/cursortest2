package defpackage;

import com.yandex.mapkit.geometry.Point;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public abstract class fhn {
    public static final Object a(ah00 ah00Var, Point point, ContinuationImpl continuationImpl) {
        kol0 kol0Var = new kol0(dvw.b(continuationImpl));
        ((gh00) ah00Var).D(point, 17.0f, 200.0f, new ehn(kol0Var));
        Object a = kol0Var.a();
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
