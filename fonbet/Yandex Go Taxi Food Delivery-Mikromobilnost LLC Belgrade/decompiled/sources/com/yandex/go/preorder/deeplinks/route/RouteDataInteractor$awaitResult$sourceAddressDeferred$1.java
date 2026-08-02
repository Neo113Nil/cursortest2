package com.yandex.go.preorder.deeplinks.route;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.deeplinks.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ldd61;", "<anonymous>", "(Ltse;)Ldd61;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.route.RouteDataInteractor$awaitResult$sourceAddressDeferred$1", f = "RouteDataInteractor.kt", l = {104, 105}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteDataInteractor$awaitResult$sourceAddressDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ IntentData $intentData;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDataInteractor$awaitResult$sourceAddressDeferred$1(c cVar, IntentData intentData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$intentData = intentData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDataInteractor$awaitResult$sourceAddressDeferred$1(this.this$0, this.$intentData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDataInteractor$awaitResult$sourceAddressDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r11 != r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            IntentData intentData = this.$intentData;
            this.label = 1;
            cVar.getClass();
            zzs zzsVar = intentData.a;
            if (zzsVar == null) {
                Address e = cVar.f.e();
                zzsVar = e != null ? e.B() : null;
                if (zzsVar == null) {
                    obj = cVar.e(this);
                }
            }
            obj = zzsVar;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
        }
        zzs zzsVar2 = (zzs) obj;
        e eVar = this.this$0.b;
        IntentData intentData2 = this.$intentData;
        String str = intentData2.i;
        boolean z = intentData2.q;
        this.L$0 = null;
        this.label = 2;
        Object e2 = eVar.e(zzsVar2, str, z, true, this);
        return e2 == coroutineSingletons ? coroutineSingletons : e2;
    }
}
