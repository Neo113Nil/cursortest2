package com.yandex.fintechsdk.features.bdui.internal.presentation.action.obtainauth;

import android.content.Context;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import defpackage.dn90;
import defpackage.hn90;
import defpackage.hr60;
import defpackage.ig5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.obtainauth.ObtainAuthActionHandler$handle$3$1$token$1", f = "ObtainAuthActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ObtainAuthActionHandler$handle$3$1$token$1 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ dn90 $adapter;
    final /* synthetic */ Long $uid;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObtainAuthActionHandler$handle$3$1$token$1(dn90 dn90Var, a aVar, Long l, ig5 ig5Var, Continuation continuation) {
        super(2, continuation);
        this.$adapter = dn90Var;
        this.this$0 = aVar;
        this.$uid = l;
        this.$action = ig5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ObtainAuthActionHandler$handle$3$1$token$1(this.$adapter, this.this$0, this.$uid, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ObtainAuthActionHandler$handle$3$1$token$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        dn90 dn90Var = this.$adapter;
        Context context = this.this$0.c;
        long longValue = this.$uid.longValue();
        hr60 hr60Var = (hr60) this.$action;
        return ((hn90) dn90Var).c(context, longValue, hr60Var.a, hr60Var.b, this.this$0.w == DefaultEnvironment.TESTING, false, null);
    }
}
