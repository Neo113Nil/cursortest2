package coil.util;

import androidx.lifecycle.Lifecycle;
import defpackage.dvw;
import defpackage.f;
import defpackage.j18;
import defpackage.ny61;
import defpackage.oey;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, f, oey] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Lifecycle lifecycle, ContinuationImpl continuationImpl) {
        Lifecycles$awaitStarted$1 lifecycles$awaitStarted$1;
        int i;
        Lifecycle lifecycle2;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        oey oeyVar;
        oey oeyVar2;
        if (continuationImpl instanceof Lifecycles$awaitStarted$1) {
            lifecycles$awaitStarted$1 = (Lifecycles$awaitStarted$1) continuationImpl;
            int i2 = lifecycles$awaitStarted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lifecycles$awaitStarted$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lifecycles$awaitStarted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lifecycles$awaitStarted$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!lifecycle.b().a(Lifecycle.State.STARTED)) {
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        try {
                            lifecycles$awaitStarted$1.L$0 = lifecycle;
                            lifecycles$awaitStarted$1.L$1 = ref$ObjectRef2;
                            lifecycles$awaitStarted$1.label = 1;
                            j18 j18Var = new j18(1, dvw.b(lifecycles$awaitStarted$1));
                            j18Var.u();
                            ?? fVar = new f(j18Var, 0);
                            ref$ObjectRef2.element = fVar;
                            lifecycle.a(fVar);
                            if (j18Var.s() == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            lifecycle2 = lifecycle;
                            ref$ObjectRef = ref$ObjectRef2;
                        } catch (Throwable th2) {
                            lifecycle2 = lifecycle;
                            ref$ObjectRef = ref$ObjectRef2;
                            th = th2;
                            oeyVar = (oey) ref$ObjectRef.element;
                            if (oeyVar != null) {
                            }
                            throw th;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) lifecycles$awaitStarted$1.L$1;
                lifecycle2 = (Lifecycle) lifecycles$awaitStarted$1.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    oeyVar = (oey) ref$ObjectRef.element;
                    if (oeyVar != null) {
                        lifecycle2.d(oeyVar);
                    }
                    throw th;
                }
                oeyVar2 = (oey) ref$ObjectRef.element;
                if (oeyVar2 != null) {
                    lifecycle2.d(oeyVar2);
                }
                return zy11Var;
            }
        }
        lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuationImpl);
        Object obj2 = lifecycles$awaitStarted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lifecycles$awaitStarted$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        oeyVar2 = (oey) ref$ObjectRef.element;
        if (oeyVar2 != null) {
        }
        return zy11Var2;
    }
}
