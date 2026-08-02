package xsna;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.fa30;
import xsna.g830;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class orx0 implements prx0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, xsna.ha30] */
    @Override // xsna.prx0
    public final Recomposer a(View view) {
        kotlin.coroutines.d dVar;
        gr90 gr90Var;
        ph50<Context, ttk0<Float>> ph50Var = xrx0.a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.b;
        emptyCoroutineContext.getClass();
        bpn0 bpn0Var = od2.m;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            dVar = (kotlin.coroutines.d) od2.m.getValue();
        } else {
            dVar = od2.n.get();
            if (dVar == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        kotlin.coroutines.d plus = dVar.plus(emptyCoroutineContext);
        g830 g830Var = (g830) plus.get(g830.a.b);
        if (g830Var != null) {
            gr90 gr90Var2 = new gr90(g830Var);
            imy imyVar = gr90Var2.c;
            synchronized (imyVar.b) {
                imyVar.a = false;
                s3q0 s3q0Var = s3q0.a;
                gr90Var = gr90Var2;
            }
        } else {
            gr90Var = 0;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        fa30 fa30Var = (fa30) plus.get(fa30.a.b);
        fa30 fa30Var2 = fa30Var;
        if (fa30Var == null) {
            ?? ha30Var = new ha30(view.getContext().getApplicationContext());
            ref$ObjectRef.element = ha30Var;
            fa30Var2 = ha30Var;
        }
        if (gr90Var != 0) {
            emptyCoroutineContext = gr90Var;
        }
        kotlin.coroutines.d plus2 = plus.plus(emptyCoroutineContext).plus(fa30Var2);
        Recomposer recomposer = new Recomposer(plus2);
        synchronized (recomposer.c) {
            recomposer.t = true;
            s3q0 s3q0Var2 = s3q0.a;
        }
        hpj a = zvj.a(plus2);
        f5z e = gqo.e(view);
        Lifecycle lifecycle = e != null ? e.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new trx0(view, recomposer));
            lifecycle.addObserver(new urx0(a, gr90Var, recomposer, ref$ObjectRef));
            return recomposer;
        }
        uzw.c("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }
}
