package com.yandex.go.superapp.unified_polling;

import defpackage.h1p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r3p;
import defpackage.ren;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.eats_commons.EatsService;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.EatsKitPollingRepositoryImpl$onOrderCreated$1", f = "EatsKitPollingRepositoryImpl.kt", l = {102, 106}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EatsKitPollingRepositoryImpl$onOrderCreated$1 extends SuspendLambda implements wls {
    final /* synthetic */ h1p $externalService;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsKitPollingRepositoryImpl$onOrderCreated$1(h1p h1pVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$externalService = h1pVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsKitPollingRepositoryImpl$onOrderCreated$1(this.$externalService, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EatsKitPollingRepositoryImpl$onOrderCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if (r6 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlinx.coroutines.a.i(5000, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0026, code lost:
    
        if (kotlinx.coroutines.a.i(5000, r10) == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003a -> B:6:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                List a = ((r3p) this.this$0.d.get()).a();
                boolean z = a instanceof Collection;
                boolean z2 = false;
                if (!z || !a.isEmpty()) {
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        if (((ren) it.next()).b == EatsService.GROCERY) {
                            break;
                        }
                    }
                }
                boolean z3 = false;
                if (!z || !a.isEmpty()) {
                    Iterator it2 = a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((ren) it2.next()).b != EatsService.GROCERY) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z3) {
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        if (this.$externalService != EatsService.GROCERY) {
            this.this$0.j();
            return zy11.a;
        }
        this.this$0.j();
        this.label = 2;
    }
}
