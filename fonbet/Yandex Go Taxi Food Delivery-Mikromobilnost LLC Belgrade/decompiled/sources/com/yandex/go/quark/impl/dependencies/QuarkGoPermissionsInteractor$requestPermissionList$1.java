package com.yandex.go.quark.impl.dependencies;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.impl.dependencies.QuarkGoPermissionsInteractor$requestPermissionList$1", f = "QuarkGoPermissionsInteractor.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class QuarkGoPermissionsInteractor$requestPermissionList$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $callback;
    final /* synthetic */ List<Integer> $permissions;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarkGoPermissionsInteractor$requestPermissionList$1(List list, tls tlsVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$permissions = list;
        this.$callback = tlsVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuarkGoPermissionsInteractor$requestPermissionList$1(this.$permissions, this.$callback, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QuarkGoPermissionsInteractor$requestPermissionList$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007a -> B:5:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0082 -> B:6:0x0084). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Collection arrayList;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<Integer> list = this.$permissions;
            b bVar2 = this.this$0;
            bVar = bVar2;
            arrayList = new ArrayList(tcc.n(list, 10));
            it = list.iterator();
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (Collection) this.L$7;
            it = (Iterator) this.L$4;
            Collection collection = (Collection) this.L$3;
            bVar = (b) this.L$1;
            kotlin.b.b(obj);
            boolean z = ((Boolean) obj).booleanValue();
            arrayList.add(Boolean.valueOf(z));
            arrayList = collection;
            if (!it.hasNext()) {
                this.$callback.invoke((List) arrayList);
                return zy11.a;
            }
            Integer num = (Integer) it.next();
            if (num != null) {
                v7j0 v7j0Var = bVar.b;
                int intValue = num.intValue();
                this.L$0 = null;
                this.L$1 = bVar;
                this.L$2 = null;
                this.L$3 = arrayList;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = arrayList;
                this.label = 1;
                obj = ((com.yandex.go.permission.b) v7j0Var).d(intValue, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                collection = arrayList;
                boolean z2 = ((Boolean) obj).booleanValue();
                arrayList.add(Boolean.valueOf(z2));
                arrayList = collection;
                if (!it.hasNext()) {
                }
            } else {
                z2 = false;
                collection = arrayList;
                arrayList.add(Boolean.valueOf(z2));
                arrayList = collection;
                if (!it.hasNext()) {
                }
            }
        }
    }
}
