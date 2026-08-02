package androidx.datastore.core;

import defpackage.f3u0;
import defpackage.f8w;
import defpackage.mvg;
import defpackage.nbi0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Pair;", "Lf3u0;", "", "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {316, 318}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class DataStoreImpl$readDataAndUpdateCache$3 extends SuspendLambda implements tls {
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$3(f fVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$readDataAndUpdateCache$3(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$readDataAndUpdateCache$3) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        f3u0 f3u0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th2) {
            f8w h = this.this$0.h();
            this.L$0 = th2;
            this.label = 2;
            Object b = h.b(this);
            if (b != coroutineSingletons) {
                obj = b;
                th = th2;
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            this.label = 1;
            obj = f.g(fVar, true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.L$0;
                kotlin.b.b(obj);
                f3u0Var = new nbi0(((Number) obj).intValue(), th);
                return new Pair(f3u0Var, Boolean.TRUE);
            }
            kotlin.b.b(obj);
        }
        f3u0Var = (f3u0) obj;
        return new Pair(f3u0Var, Boolean.TRUE);
    }
}
