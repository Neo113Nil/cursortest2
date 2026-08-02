package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final class nqr implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ nqr(int i, Ref$ObjectRef ref$ObjectRef) {
        this.a = i;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        switch (i) {
            case 0:
                if (ref$ObjectRef.element == vez0.b) {
                    ref$ObjectRef.element = obj;
                    return zy11Var;
                }
                ny61.g("Flow has more than one element");
                return null;
            default:
                ((Collection) ref$ObjectRef.element).add(obj);
                return zy11Var;
        }
    }
}
