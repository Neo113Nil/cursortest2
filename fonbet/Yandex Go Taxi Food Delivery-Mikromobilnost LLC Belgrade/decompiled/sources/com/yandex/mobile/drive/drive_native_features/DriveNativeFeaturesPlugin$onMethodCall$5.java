package com.yandex.mobile.drive.drive_native_features;

import defpackage.da20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q9e;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.drive_native_features.DriveNativeFeaturesPlugin$onMethodCall$5", f = "DriveNativeFeaturesPlugin.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DriveNativeFeaturesPlugin$onMethodCall$5 extends SuspendLambda implements wls {
    final /* synthetic */ da20 $result;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveNativeFeaturesPlugin$onMethodCall$5(b bVar, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveNativeFeaturesPlugin$onMethodCall$5(this.this$0, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveNativeFeaturesPlugin$onMethodCall$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r6 == null) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.mobile.drive.contacts.a aVar = this.this$0.w;
            if (aVar != null) {
                this.label = 1;
                obj = aVar.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            iterable = EmptyList.a;
            da20 da20Var = this.$result;
            Iterable<q9e> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(tcc.n(iterable2, 10));
            for (q9e q9eVar : iterable2) {
                arrayList.add(kotlin.collections.b.h(new Pair("name", q9eVar.a), new Pair("phone", q9eVar.b)));
            }
            da20Var.success(arrayList);
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        iterable = (List) obj;
    }
}
