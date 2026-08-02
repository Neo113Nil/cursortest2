package com.yandex.go.chargers.debt.screen;

import defpackage.cy9;
import defpackage.jy9;
import defpackage.kj9;
import defpackage.ky9;
import defpackage.lj9;
import defpackage.ly9;
import defpackage.m6a0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oq9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.debt.screen.ChargersDebtPresenter$tryPayOff$1", f = "ChargersDebtPresenter.kt", l = {81, 82}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDebtPresenter$tryPayOff$1 extends SuspendLambda implements wls {
    final /* synthetic */ oq9 $action;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDebtPresenter$tryPayOff$1(a aVar, oq9 oq9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = oq9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDebtPresenter$tryPayOff$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersDebtPresenter$tryPayOff$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r7v11 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kj9 kj9Var;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        a aVar = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            kj9 kj9Var2 = aVar.B;
            com.yandex.go.chargers.error.data.a aVar2 = aVar.y;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = kj9Var2;
            this.label = 2;
            obj = aVar2.a(th, this);
            if (obj != obj2) {
                kj9Var = kj9Var2;
            }
            return obj2;
        }
        if (aVar == 0) {
            b.b(obj);
            a aVar3 = this.this$0;
            oq9 oq9Var = this.$action;
            com.yandex.go.chargers.debt.screen.domain.a aVar4 = aVar3.z;
            String str = oq9Var.a;
            m6a0 m6a0Var = oq9Var.b;
            this.L$0 = aVar3;
            this.label = 1;
            Object a = aVar4.a(m6a0Var, str, this);
            aVar = aVar3;
            this = a;
        } else {
            if (aVar != 1) {
                if (aVar != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kj9Var = (kj9) this.L$2;
                b.b(obj);
                lj9 lj9Var = kj9Var.a;
                m950 m950Var = (m950) lj9Var.G.get();
                ly9 ly9Var = new ly9((cy9) obj);
                ky9.D1.getClass();
                lj9Var.A(m950Var, ly9Var, jy9.b);
                return zy11.a;
            }
            a aVar5 = (a) this.L$0;
            b.b(obj);
            aVar = aVar5;
            this = this;
        }
        return zy11.a;
    }
}
