package defpackage;

import com.yandex.fintechsdk.core.architecture.api.mvi.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class ai5 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7w b;

    public /* synthetic */ ai5(v7w v7wVar, int i) {
        this.a = i;
        this.b = v7wVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object c;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        v7w v7wVar = this.b;
        switch (i) {
            case 0:
                Object d = b.d(v7wVar, new ph5((String) obj), continuation);
                return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11Var;
            default:
                kp41 kp41Var = (kp41) obj;
                if (kp41Var instanceof hp41) {
                    c = b.c(v7wVar, new r941(29), continuation);
                    if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return zy11Var;
                    }
                } else if (kp41Var instanceof jp41) {
                    c = b.c(v7wVar, new js41(0), continuation);
                    if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return zy11Var;
                    }
                } else if (!(kp41Var instanceof ip41) || (c = b.c(v7wVar, new js41(1), continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return zy11Var;
                }
                return c;
        }
    }
}
