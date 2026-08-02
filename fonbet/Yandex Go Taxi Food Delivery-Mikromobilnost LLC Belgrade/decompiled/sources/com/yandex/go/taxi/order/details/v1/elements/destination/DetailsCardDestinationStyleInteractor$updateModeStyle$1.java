package com.yandex.go.taxi.order.details.v1.elements.destination;

import defpackage.g050;
import defpackage.i5j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.destination.DetailsCardDestinationStyleInteractor$updateModeStyle$1", f = "DetailsCardDestinationStyleInteractor.kt", l = {161, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardDestinationStyleInteractor$updateModeStyle$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $color;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardDestinationStyleInteractor$updateModeStyle$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$color = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardDestinationStyleInteractor$updateModeStyle$1(this.this$0, this.$color, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardDestinationStyleInteractor$updateModeStyle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        c cVar;
        String str;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                aVar = cVar2.d;
                String str2 = this.$color;
                this.L$0 = aVar;
                this.L$1 = cVar2;
                this.L$2 = str2;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    cVar = cVar2;
                    str = str2;
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
            String str3 = (String) this.L$2;
            cVar = (c) this.L$1;
            ?? r5 = (g050) this.L$0;
            kotlin.b.b(obj);
            str = str3;
            aVar = r5;
            i5j a = i5j.a(cVar.e, null, null, null, str, 7);
            cVar.e = a;
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (c.e(cVar, a, this) != coroutineSingletons) {
                g050Var = aVar;
                g050Var.d(null);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
    }
}
