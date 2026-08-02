package com.yandex.go.cartech.dynamic.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.tankerapp.go.sdk.location.CartechLocationServiceStatus;
import ru.yandex.taxi.systemrequeirements.location.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/tankerapp/go/sdk/location/CartechLocationServiceStatus;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.cartech.dynamic.domain.TankerLocationAdapterImpl$serviceStatusFlow$1", f = "TankerLocationAdapterImpl.kt", l = {37, 38, 39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TankerLocationAdapterImpl$serviceStatusFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TankerLocationAdapterImpl$serviceStatusFlow$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TankerLocationAdapterImpl$serviceStatusFlow$1 tankerLocationAdapterImpl$serviceStatusFlow$1 = new TankerLocationAdapterImpl$serviceStatusFlow$1(this.this$0, continuation);
        tankerLocationAdapterImpl$serviceStatusFlow$1.L$0 = obj;
        return tankerLocationAdapterImpl$serviceStatusFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TankerLocationAdapterImpl$serviceStatusFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r8.a(r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CartechLocationServiceStatus cartechLocationServiceStatus = CartechLocationServiceStatus.Disabled;
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            CartechLocationServiceStatus cartechLocationServiceStatus2 = CartechLocationServiceStatus.Enabled;
            this.L$0 = null;
            this.label = 3;
        }
        n nVar = this.this$0.a;
        this.L$0 = vprVar;
        this.label = 2;
    }
}
