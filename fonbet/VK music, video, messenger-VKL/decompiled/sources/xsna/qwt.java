package xsna;

import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsDifferencesWithCacheUseCase.kt */
/* loaded from: classes11.dex */
public final class qwt {
    public final xmv0 a;

    public qwt(xmv0 xmv0Var) {
        this.a = xmv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(List list, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        pwt pwtVar;
        int i;
        List list2;
        o0l0 o0l0Var;
        if (continuationImpl instanceof pwt) {
            pwtVar = (pwt) continuationImpl;
            int i2 = pwtVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pwtVar.label = i2 - Integer.MIN_VALUE;
                Object obj = pwtVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pwtVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    o0l0 o0l0Var2 = o0l0.a;
                    pwtVar.L$0 = list;
                    pwtVar.L$1 = o0l0Var2;
                    pwtVar.Z$0 = z;
                    pwtVar.Z$1 = z2;
                    pwtVar.label = 1;
                    Object b = this.a.b(pwtVar);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = list;
                    o0l0Var = o0l0Var2;
                    obj = b;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = pwtVar.Z$1;
                    z = pwtVar.Z$0;
                    o0l0Var = (o0l0) pwtVar.L$1;
                    list2 = (List) pwtVar.L$0;
                    kotlin.a.a(obj);
                }
                o0l0Var.getClass();
                return o0l0.b((List) obj, list2, z, z2);
            }
        }
        pwtVar = new pwt(this, continuationImpl);
        Object obj2 = pwtVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pwtVar.label;
        if (i != 0) {
        }
        o0l0Var.getClass();
        return o0l0.b((List) obj2, list2, z, z2);
    }
}
