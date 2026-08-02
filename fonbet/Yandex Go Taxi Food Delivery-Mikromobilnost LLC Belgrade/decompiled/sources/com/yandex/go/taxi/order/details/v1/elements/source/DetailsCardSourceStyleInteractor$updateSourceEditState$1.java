package com.yandex.go.taxi.order.details.v1.elements.source;

import defpackage.g050;
import defpackage.j7j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.source.DetailsCardSourceStyleInteractor$updateSourceEditState$1", f = "DetailsCardSourceStyleInteractor.kt", l = {162, HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardSourceStyleInteractor$updateSourceEditState$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $canChangePorchNumber;
    final /* synthetic */ boolean $canChangeSource;
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardSourceStyleInteractor$updateSourceEditState$1(c cVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$canChangeSource = z;
        this.$canChangePorchNumber = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardSourceStyleInteractor$updateSourceEditState$1(this.this$0, this.$canChangeSource, this.$canChangePorchNumber, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardSourceStyleInteractor$updateSourceEditState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        boolean z;
        boolean z2;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                cVar = this.this$0;
                aVar = cVar.e;
                boolean z3 = this.$canChangeSource;
                boolean z4 = this.$canChangePorchNumber;
                this.L$0 = aVar;
                this.L$1 = cVar;
                this.Z$0 = z3;
                this.Z$1 = z4;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    z = z3;
                    z2 = z4;
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
            z2 = this.Z$1;
            z = this.Z$0;
            cVar = (c) this.L$1;
            ?? r6 = (g050) this.L$0;
            kotlin.b.b(obj);
            aVar = r6;
            j7j a = z ? j7j.a(cVar.f, null, null, null, DetailsCardSourceStyleInteractor$SourceEditState.ADDRESS, 7) : z2 ? j7j.a(cVar.f, null, null, null, DetailsCardSourceStyleInteractor$SourceEditState.ENTRANCE, 7) : j7j.a(cVar.f, null, null, null, DetailsCardSourceStyleInteractor$SourceEditState.UNEDITABLE, 7);
            cVar.f = a;
            this.L$0 = aVar;
            this.L$1 = null;
            this.label = 2;
            if (c.d(cVar, a, this) != coroutineSingletons) {
                g050Var = aVar;
                g050Var.d(null);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar2 = aVar;
            th = th3;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
    }
}
