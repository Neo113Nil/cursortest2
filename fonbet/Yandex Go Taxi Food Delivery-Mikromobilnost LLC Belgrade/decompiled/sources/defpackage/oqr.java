package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes4.dex */
public final class oqr implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;

    public oqr(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, jb20] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = this.a;
        T t = ref$ObjectRef.element;
        ?? r1 = vez0.b;
        if (t == r1) {
            ref$ObjectRef.element = obj;
            return zy11.a;
        }
        ref$ObjectRef.element = r1;
        throw new AbortFlowException(this);
    }
}
