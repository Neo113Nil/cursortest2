package com.yandex.go.permission;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.RequestPermissionInteractorImpl$requestPermissionsIfNeeded$1", f = "RequestPermissionInteractorImpl.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RequestPermissionInteractorImpl$requestPermissionsIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ Consumer<List<Boolean>> $onResult;
    final /* synthetic */ List<String> $permissions;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPermissionInteractorImpl$requestPermissionsIfNeeded$1(Consumer consumer, b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.$onResult = consumer;
        this.this$0 = bVar;
        this.$permissions = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequestPermissionInteractorImpl$requestPermissionsIfNeeded$1(this.$onResult, this.this$0, this.$permissions, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestPermissionInteractorImpl$requestPermissionsIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Consumer consumer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Consumer<List<Boolean>> consumer2 = this.$onResult;
            b bVar = this.this$0;
            List<String> list = this.$permissions;
            this.L$0 = consumer2;
            this.label = 1;
            bVar.getClass();
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(bVar.b((String) it.next())));
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((Boolean) it2.next()).booleanValue()) {
                        arrayList = bvf0.n(new RequestPermissionInteractorImpl$requestPermissionsIfNeeded$4(bVar, list, null), this);
                        break;
                    }
                }
            }
            if (arrayList == coroutineSingletons) {
                return coroutineSingletons;
            }
            consumer = consumer2;
            obj = arrayList;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            consumer = (Consumer) this.L$0;
            kotlin.b.b(obj);
        }
        consumer.accept(obj);
        return zy11.a;
    }
}
