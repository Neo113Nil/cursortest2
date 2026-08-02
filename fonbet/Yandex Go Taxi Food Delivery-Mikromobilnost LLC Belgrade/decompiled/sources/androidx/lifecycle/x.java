package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wls;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes10.dex */
public abstract class x {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, wls wlsVar, SuspendLambda suspendLambda) {
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a.x, new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, wlsVar, null), suspendLambda);
    }
}
