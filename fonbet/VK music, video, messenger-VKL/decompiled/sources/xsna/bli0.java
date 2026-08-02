package xsna;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class bli0 implements uki0<Object> {
    public final /* synthetic */ RestrictedSuspendLambda a;

    /* JADX WARN: Multi-variable type inference failed */
    public bli0(wzs wzsVar) {
        this.a = (RestrictedSuspendLambda) wzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, xsna.wzs] */
    @Override // xsna.uki0
    public final Iterator<Object> iterator() {
        return g5z.b(this.a);
    }
}
