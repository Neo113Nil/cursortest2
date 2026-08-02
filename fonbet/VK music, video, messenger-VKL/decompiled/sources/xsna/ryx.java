package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: JobSupport.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class ryx extends FunctionReferenceImpl implements yzs<pyx, Object, Object, Object> {
    public static final ryx b = new ryx(3, pyx.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // xsna.yzs
    public final Object invoke(pyx pyxVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pyx.b;
        pyxVar.getClass();
        if (obj2 instanceof d8i) {
            throw ((d8i) obj2).a;
        }
        return obj2;
    }
}
