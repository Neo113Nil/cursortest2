package com.yandex.go.permission;

import defpackage.k40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.z9s0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.RequestPermissionInteractorImpl$requestPermissionsIfNeeded$4", f = "RequestPermissionInteractorImpl.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RequestPermissionInteractorImpl$requestPermissionsIfNeeded$4 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $permissions;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPermissionInteractorImpl$requestPermissionsIfNeeded$4(b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$permissions = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RequestPermissionInteractorImpl$requestPermissionsIfNeeded$4 requestPermissionInteractorImpl$requestPermissionsIfNeeded$4 = new RequestPermissionInteractorImpl$requestPermissionsIfNeeded$4(this.this$0, this.$permissions, continuation);
        requestPermissionInteractorImpl$requestPermissionsIfNeeded$4.L$0 = obj;
        return requestPermissionInteractorImpl$requestPermissionsIfNeeded$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestPermissionInteractorImpl$requestPermissionsIfNeeded$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        qoh h = tje.h(tseVar, null, CoroutineStart.UNDISPATCHED, new RequestPermissionInteractorImpl$requestPermissionsIfNeeded$4$permissionResult$1(this.this$0, null), 1);
        k40 k40Var = this.this$0.b;
        List<String> list = this.$permissions;
        k40Var.getClass();
        z9s0 z9s0Var = k40Var.c;
        for (String str : list) {
            z9s0Var.a.u("was_" + str + "_dialog_shown", true);
        }
        androidx.core.app.b.J(k40Var.b, (String[]) list.toArray(new String[0]), 999);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object s = h.s(this);
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
