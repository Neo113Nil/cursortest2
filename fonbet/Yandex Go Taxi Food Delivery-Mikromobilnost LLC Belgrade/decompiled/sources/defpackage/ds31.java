package defpackage;

import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes10.dex */
public abstract class ds31 {
    public static final g1x0 a = new g1x0();

    public static final k5c a(yr31 yr31Var) {
        k5c k5cVar;
        synchronized (a) {
            k5cVar = (k5c) yr31Var.U("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (k5cVar == null) {
                fse fseVar = EmptyCoroutineContext.a;
                try {
                    sjh sjhVar = uyj.a;
                    fseVar = o400.a.x;
                } catch (IllegalStateException | NotImplementedError unused) {
                }
                k5c k5cVar2 = new k5c(fseVar.plus(jl40.a()));
                yr31Var.S("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", k5cVar2);
                k5cVar = k5cVar2;
            }
        }
        return k5cVar;
    }
}
