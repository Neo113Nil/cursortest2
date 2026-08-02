package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.uqp0;

/* compiled from: InvalidationTracker.kt */
/* loaded from: classes.dex */
public final class dr70 {
    public final utk0 a;

    public dr70(int i) {
        this.a = vtk0.a(new int[i]);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons a(uqp0.b bVar, ContinuationImpl continuationImpl) {
        cr70 cr70Var;
        int i;
        if (continuationImpl instanceof cr70) {
            cr70Var = (cr70) continuationImpl;
            int i2 = cr70Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cr70Var.label = i2 - Integer.MIN_VALUE;
                Object obj = cr70Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cr70Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    cr70Var.label = 1;
                    if (this.a.collect(bVar, cr70Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        cr70Var = new cr70(this, continuationImpl);
        Object obj2 = cr70Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cr70Var.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }
}
