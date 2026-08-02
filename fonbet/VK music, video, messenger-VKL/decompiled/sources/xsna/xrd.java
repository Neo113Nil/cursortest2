package xsna;

import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftComponentBase.kt */
@b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$getActiveDraft$2", f = "ClipsDraftComponentBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class xrd extends SuspendLambda implements wzs<lud, spj<? super otd>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public xrd() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xrd xrdVar = new xrd(2, spjVar);
        xrdVar.L$0 = obj;
        return xrdVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lud ludVar, spj<? super otd> spjVar) {
        return ((xrd) create(ludVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer m;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        lud ludVar = (lud) this.L$0;
        otd otdVar = ludVar.d;
        if (otdVar != null) {
            return otdVar;
        }
        String[] m2 = ludVar.a.m();
        Pair pair = (m2 == null || (str = m2[0]) == null || (m = arm0.m(10, str)) == null || (str2 = m2[1]) == null) ? null : new Pair(m, str2);
        if (pair != null) {
            ClipsDraft a = ludVar.a((String) pair.j());
            otd D = a != null ? vua0.D(a) : null;
            if (D != null) {
                ludVar.d = D;
                return D;
            }
        }
        return null;
    }
}
