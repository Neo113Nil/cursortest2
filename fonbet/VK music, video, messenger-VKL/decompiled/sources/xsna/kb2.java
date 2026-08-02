package xsna;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
/* loaded from: classes11.dex */
public final class kb2 implements qua0, yvj {
    public final View b;
    public final mio0 c;
    public final yvj d;
    public final AtomicReference<jui0<l2x>> e = new AtomicReference<>(null);

    public kb2(View view, mio0 mio0Var, yvj yvjVar) {
        this.b = view;
        this.c = mio0Var;
        this.d = yvjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.pua0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons a(k1z k1zVar, ContinuationImpl continuationImpl) {
        gb2 gb2Var;
        int i;
        if (continuationImpl instanceof gb2) {
            gb2Var = (gb2) continuationImpl;
            int i2 = gb2Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gb2Var.label = i2 - Integer.MIN_VALUE;
                Object obj = gb2Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gb2Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ib2 ib2Var = new ib2(k1zVar, this);
                    jb2 jb2Var = new jb2(this, null);
                    gb2Var.label = 1;
                    if (zvj.d(new kui0(ib2Var, this.e, jb2Var, null), gb2Var) == coroutineSingletons) {
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
        gb2Var = new gb2(this, continuationImpl);
        Object obj2 = gb2Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gb2Var.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }

    @Override // xsna.yvj
    public final kotlin.coroutines.d getCoroutineContext() {
        return this.d.getCoroutineContext();
    }

    @Override // xsna.pua0
    public final View getView() {
        return this.b;
    }
}
