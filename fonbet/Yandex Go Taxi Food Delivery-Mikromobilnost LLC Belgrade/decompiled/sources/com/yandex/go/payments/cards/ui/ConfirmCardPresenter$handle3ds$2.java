package com.yandex.go.payments.cards.ui;

import defpackage.j831;
import defpackage.jv5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tu5;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.ui.ConfirmCardPresenter$handle3ds$2", f = "ConfirmCardPresenter.kt", l = {246, 251, 256, MSException.ERROR_NO_MORE_ITEMS}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ConfirmCardPresenter$handle3ds$2 extends SuspendLambda implements wls {
    final /* synthetic */ tu5 $result;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmCardPresenter$handle3ds$2(tu5 tu5Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$result = tu5Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmCardPresenter$handle3ds$2(this.$result, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmCardPresenter$handle3ds$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (kotlinx.coroutines.a.i(3000, r9) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (com.yandex.go.payments.cards.ui.c.Mg(r1, r10, true, r9) != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.payments.cards.ui.c, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
        }
        if (r1 == 0) {
            kotlin.b.b(obj);
            this.label = 1;
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                    cVar = (c) this.L$1;
                    cVar2 = (c) this.L$0;
                    kotlin.b.b(obj);
                    this.L$0 = cVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (c.Ng(cVar2, (tu5) obj, false, true, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return zy11.a;
                }
                if (r1 == 3) {
                    kotlin.b.b(obj);
                } else {
                    if (r1 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        tu5 tu5Var = this.$result;
        cVar = this.this$0;
        j831 j831Var = tu5Var.b.e;
        if (j831Var == null) {
            throw new IllegalStateException("Verification params for 3ds polling is null");
        }
        com.yandex.go.payments.cards.data.c cVar3 = cVar.B;
        jv5 jv5Var = tu5Var.a.b;
        this.L$0 = cVar;
        this.L$1 = cVar;
        this.L$2 = null;
        this.label = 2;
        obj = cVar3.g(jv5Var, j831Var, true, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        cVar2 = cVar;
        this.L$0 = cVar;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
        if (c.Ng(cVar2, (tu5) obj, false, true, this) == coroutineSingletons) {
        }
        return zy11.a;
    }
}
