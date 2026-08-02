package com.yandex.mobile.drive.sdk.map.handlers;

import defpackage.gr00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgr00;", "it", "", "<anonymous>", "(Lgr00;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.sdk.map.handlers.MapFlutterHandler$bind$3", f = "MapFlutterHandler.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MapFlutterHandler$bind$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapFlutterHandler$bind$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapFlutterHandler$bind$3 mapFlutterHandler$bind$3 = new MapFlutterHandler$bind$3(this.this$0, continuation);
        mapFlutterHandler$bind$3.L$0 = obj;
        return mapFlutterHandler$bind$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapFlutterHandler$bind$3) create((gr00) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gr00 gr00Var = (gr00) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        this.L$0 = null;
        this.label = 1;
        Object b = a.b(aVar, gr00Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
