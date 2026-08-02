package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.d;

/* loaded from: classes9.dex */
public final class b2k implements tpr {
    public final tpr a;
    public final tls b;
    public final wls c;

    public b2k(tpr tprVar, tls tlsVar, wls wlsVar) {
        this.a = tprVar;
        this.b = tlsVar;
        this.c = wlsVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, jb20] */
    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = vez0.b;
        Object collect = this.a.collect(new d(this, ref$ObjectRef, vprVar), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }
}
