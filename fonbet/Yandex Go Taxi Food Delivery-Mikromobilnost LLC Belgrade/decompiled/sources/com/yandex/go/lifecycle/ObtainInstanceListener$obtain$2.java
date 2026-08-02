package com.yandex.go.lifecycle;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.j1;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.s8x;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lifecycle.ObtainInstanceListener$obtain$2", f = "ObtainInstanceListener.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 69}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
final class ObtainInstanceListener$obtain$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObtainInstanceListener$obtain$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ObtainInstanceListener$obtain$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ObtainInstanceListener$obtain$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r8.u0(r7) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            nohVar = (noh) cVar.a.updateAndGet(new b(cVar));
            s8x a = kotlinx.coroutines.a.a();
            nohVar.w(new j1(18, a));
            this.L$0 = nohVar;
            this.L$1 = null;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            nohVar = (noh) this.L$0;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object k = nohVar.k(this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
