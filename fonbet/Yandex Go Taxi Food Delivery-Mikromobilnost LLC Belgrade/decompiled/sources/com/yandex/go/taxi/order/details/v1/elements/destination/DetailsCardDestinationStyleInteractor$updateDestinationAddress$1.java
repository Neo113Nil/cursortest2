package com.yandex.go.taxi.order.details.v1.elements.destination;

import com.yandex.go.address.models.Address;
import defpackage.g050;
import defpackage.i5j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.destination.DetailsCardDestinationStyleInteractor$updateDestinationAddress$1", f = "DetailsCardDestinationStyleInteractor.kt", l = {161, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardDestinationStyleInteractor$updateDestinationAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ boolean $canChangeDestination;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardDestinationStyleInteractor$updateDestinationAddress$1(c cVar, Address address, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$address = address;
        this.$canChangeDestination = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardDestinationStyleInteractor$updateDestinationAddress$1(this.this$0, this.$address, this.$canChangeDestination, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardDestinationStyleInteractor$updateDestinationAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        Address address;
        boolean z;
        c cVar;
        String L;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar2 = this.this$0;
            aVar = cVar2.d;
            address = this.$address;
            z = this.$canChangeDestination;
            this.L$0 = aVar;
            this.L$1 = address;
            this.L$2 = cVar2;
            this.Z$0 = z;
            this.label = 1;
            if (aVar.a(this) != coroutineSingletons) {
                cVar = cVar2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g050Var = (g050) this.L$0;
            try {
                kotlin.b.b(obj);
                g050Var.d(null);
                return zy11.a;
            } catch (Throwable th2) {
                th = th2;
                g050Var.d(null);
                throw th;
            }
        }
        boolean z2 = this.Z$0;
        cVar = (c) this.L$2;
        address = (Address) this.L$1;
        ?? r6 = (g050) this.L$0;
        kotlin.b.b(obj);
        z = z2;
        aVar = r6;
        if (address != null) {
            try {
                L = q5z.L(address);
            } catch (Throwable th3) {
                th = th3;
                g050Var = aVar;
                g050Var.d(null);
                throw th;
            }
        } else {
            L = null;
        }
        String s1 = address != null ? address.s1() : null;
        if (s1 == null) {
            s1 = "";
        }
        i5j a = i5j.a(cVar.e, L, s1, z ? address != null ? DetailsCardDestinationStyleInteractor$DestinationState.EDIT : DetailsCardDestinationStyleInteractor$DestinationState.ADD : address != null ? DetailsCardDestinationStyleInteractor$DestinationState.STATIC : DetailsCardDestinationStyleInteractor$DestinationState.GONE, null, 8);
        cVar.e = a;
        this.L$0 = aVar;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        if (c.e(cVar, a, this) != coroutineSingletons) {
            g050Var = aVar;
            g050Var.d(null);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
