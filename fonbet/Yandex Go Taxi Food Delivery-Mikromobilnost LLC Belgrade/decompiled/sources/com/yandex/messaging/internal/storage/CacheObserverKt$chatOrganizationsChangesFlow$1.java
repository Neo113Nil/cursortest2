package com.yandex.messaging.internal.storage;

import android.os.Looper;
import defpackage.lu5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb7;
import defpackage.ub7;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly6f0;", "", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.CacheObserverKt$chatOrganizationsChangesFlow$1", f = "CacheObserver.kt", l = {593}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CacheObserverKt$chatOrganizationsChangesFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ sb7 $this_chatOrganizationsChangesFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheObserverKt$chatOrganizationsChangesFlow$1(sb7 sb7Var, Continuation continuation) {
        super(2, continuation);
        this.$this_chatOrganizationsChangesFlow = sb7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CacheObserverKt$chatOrganizationsChangesFlow$1 cacheObserverKt$chatOrganizationsChangesFlow$1 = new CacheObserverKt$chatOrganizationsChangesFlow$1(this.$this_chatOrganizationsChangesFlow, continuation);
        cacheObserverKt$chatOrganizationsChangesFlow$1.L$0 = obj;
        return cacheObserverKt$chatOrganizationsChangesFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CacheObserverKt$chatOrganizationsChangesFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            ub7 ub7Var = new ub7(y6f0Var);
            sb7 sb7Var = this.$this_chatOrganizationsChangesFlow;
            z83.g(null, sb7Var.a, Looper.myLooper());
            sb7Var.l.b(ub7Var);
            lu5 lu5Var = new lu5(16, this.$this_chatOrganizationsChangesFlow, ub7Var);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, lu5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
