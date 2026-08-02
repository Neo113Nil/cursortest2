package com.yandex.go.taxi.order.details.v1.elements.source;

import com.yandex.go.address.models.Address;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g050;
import defpackage.j7j;
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
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.source.DetailsCardSourceStyleInteractor$updateSourceAddress$1", f = "DetailsCardSourceStyleInteractor.kt", l = {162, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardSourceStyleInteractor$updateSourceAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ boolean $canChangeSource;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardSourceStyleInteractor$updateSourceAddress$1(c cVar, Address address, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$address = address;
        this.$canChangeSource = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardSourceStyleInteractor$updateSourceAddress$1(this.this$0, this.$address, this.$canChangeSource, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardSourceStyleInteractor$updateSourceAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v4, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        Address address;
        c cVar;
        boolean z;
        Throwable th;
        g050 g050Var;
        g050 g050Var2;
        ?? r1 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                aVar = cVar2.e;
                address = this.$address;
                boolean z2 = this.$canChangeSource;
                this.L$0 = aVar;
                this.L$1 = address;
                this.L$2 = cVar2;
                this.Z$0 = z2;
                this.label = 1;
                if (aVar.a(this) != r1) {
                    cVar = cVar2;
                    z = z2;
                }
                return r1;
            }
            if (i != 1) {
                try {
                    if (i == 2) {
                        g050Var2 = (g050) this.L$0;
                        kotlin.b.b(obj);
                        g050Var2.d(null);
                        return zy11Var;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) this.L$0;
                    kotlin.b.b(obj);
                    g050Var.d(null);
                    return zy11Var;
                } catch (Throwable th2) {
                    th = th2;
                    r1.d(null);
                    throw th;
                }
            }
            z = this.Z$0;
            cVar = (c) this.L$2;
            Address address2 = (Address) this.L$1;
            ?? r9 = (g050) this.L$0;
            kotlin.b.b(obj);
            address = address2;
            aVar = r9;
            if (address == null) {
                j7j a = j7j.a(cVar.f, null, null, null, null, 12);
                cVar.f = a;
                this.L$0 = aVar;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (c.d(cVar, a, this) != r1) {
                    g050Var2 = aVar;
                    g050Var2.d(null);
                    return zy11Var;
                }
            } else {
                String L = q5z.L(address);
                String s1 = address.s1();
                if (s1 == null) {
                    s1 = "";
                }
                String str = s1;
                j7j j7jVar = cVar.f;
                j7j a2 = j7j.a(j7jVar, L, str, null, z ? DetailsCardSourceStyleInteractor$SourceEditState.ADDRESS : j7jVar.d, 4);
                cVar.f = a2;
                this.L$0 = aVar;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (c.d(cVar, a2, this) != r1) {
                    g050Var = aVar;
                    g050Var.d(null);
                    return zy11Var;
                }
            }
            return r1;
        } catch (Throwable th3) {
            th = th3;
            r1 = aVar;
            r1.d(null);
            throw th;
        }
    }
}
