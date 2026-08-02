package com.yandex.go.chargers.order.domain;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.tse;
import defpackage.wls;
import defpackage.wwg;
import defpackage.yvi0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersInteractor$pollActiveOrders$2", f = "ChargersActiveOrdersInteractor.kt", l = {32, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrdersInteractor$pollActiveOrders$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrdersInteractor$pollActiveOrders$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrdersInteractor$pollActiveOrders$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrdersInteractor$pollActiveOrders$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r8) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        r5 = 2000;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ba -> B:6:0x0018). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        fmt fmtVar;
        rl9 rl9Var;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            aVar = this.this$0;
            if (kotlinx.coroutines.a.p(get_context())) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = (a) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar2;
                if (kotlinx.coroutines.a.p(get_context())) {
                    return zy11.a;
                }
                this.L$0 = aVar;
                this.L$1 = null;
                this.label = 1;
                Object c = aVar.c(this);
                if (c != coroutineSingletons) {
                    aVar2 = aVar;
                    obj = c;
                    fmtVar = (fmt) obj;
                    yvi0 yvi0Var = aVar2.g;
                    if (fmtVar != null) {
                        yvi0Var.getClass();
                        Long l = wwg.l(fmtVar).b;
                        if (l != null) {
                            j = l.longValue();
                            this.L$0 = aVar2;
                            this.L$1 = null;
                            this.label = 2;
                        }
                    }
                    rl9Var = (rl9) kotlinx.coroutines.flow.e.d(((com.yandex.go.chargers.data.e) yvi0Var.a).d).a.getValue();
                    if (rl9Var.a.isEmpty()) {
                        List list = rl9Var.a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((taa) it.next()).b().compareTo(ChargersActiveOrderStatus.LEASING) < 0) {
                                    break;
                                }
                            }
                        }
                        j = 60000;
                    } else {
                        j = MapiClientImpl.RETRIES_TIME_MILLIS;
                    }
                    this.L$0 = aVar2;
                    this.L$1 = null;
                    this.label = 2;
                }
                return coroutineSingletons;
            }
            aVar2 = (a) this.L$0;
            kotlin.b.b(obj);
            fmtVar = (fmt) obj;
            yvi0 yvi0Var2 = aVar2.g;
            if (fmtVar != null) {
            }
            rl9Var = (rl9) kotlinx.coroutines.flow.e.d(((com.yandex.go.chargers.data.e) yvi0Var2.a).d).a.getValue();
            if (rl9Var.a.isEmpty()) {
            }
            this.L$0 = aVar2;
            this.L$1 = null;
            this.label = 2;
        }
    }
}
