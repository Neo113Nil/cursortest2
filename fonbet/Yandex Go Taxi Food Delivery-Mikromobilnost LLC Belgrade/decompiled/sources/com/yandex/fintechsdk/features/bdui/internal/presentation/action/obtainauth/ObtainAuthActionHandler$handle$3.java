package com.yandex.fintechsdk.features.bdui.internal.presentation.action.obtainauth;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import defpackage.dn90;
import defpackage.hr60;
import defpackage.ig5;
import defpackage.jh5;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufi0;
import defpackage.vm50;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.obtainauth.ObtainAuthActionHandler$handle$3", f = "ObtainAuthActionHandler.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ObtainAuthActionHandler$handle$3 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ dn90 $adapter;
    final /* synthetic */ jh5 $context;
    final /* synthetic */ Long $uid;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObtainAuthActionHandler$handle$3(a aVar, ig5 ig5Var, dn90 dn90Var, Long l, jh5 jh5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = ig5Var;
        this.$adapter = dn90Var;
        this.$uid = l;
        this.$context = jh5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ObtainAuthActionHandler$handle$3(this.this$0, this.$action, this.$adapter, this.$uid, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ObtainAuthActionHandler$handle$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jh5 jh5Var;
        ig5 ig5Var;
        jh5 jh5Var2;
        ig5 ig5Var2;
        a aVar;
        vm50 vm50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar2 = this.this$0;
                ig5 ig5Var3 = this.$action;
                dn90 dn90Var = this.$adapter;
                Long l = this.$uid;
                jh5 jh5Var3 = this.$context;
                try {
                    jse jseVar = aVar2.y;
                    ObtainAuthActionHandler$handle$3$1$token$1 obtainAuthActionHandler$handle$3$1$token$1 = new ObtainAuthActionHandler$handle$3$1$token$1(dn90Var, aVar2, l, ig5Var3, null);
                    this.L$0 = aVar2;
                    this.L$1 = ig5Var3;
                    this.L$2 = jh5Var3;
                    this.L$3 = ig5Var3;
                    this.L$4 = jh5Var3;
                    this.label = 1;
                    Object k0 = tje.k0(jseVar, obtainAuthActionHandler$handle$3$1$token$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    jh5Var = jh5Var3;
                    jh5Var2 = jh5Var;
                    ig5Var = ig5Var3;
                    ig5Var2 = ig5Var;
                    obj = k0;
                    aVar = aVar2;
                } catch (Throwable unused) {
                    jh5Var = jh5Var3;
                    ig5Var = ig5Var3;
                    vm50Var = ((hr60) ig5Var).d;
                    if (vm50Var != null) {
                        jh5Var.a.dispatch(vm50Var);
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jh5Var = (jh5) this.L$4;
                ig5Var = (ig5) this.L$3;
                jh5Var2 = (jh5) this.L$2;
                ig5Var2 = (ig5) this.L$1;
                aVar = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable unused2) {
                    vm50Var = ((hr60) ig5Var).d;
                    if (vm50Var != null) {
                    }
                    return zy11.a;
                }
            }
            String str = (String) obj;
            FlexAdapter flexAdapter = aVar.x;
            if (flexAdapter != null) {
                String str2 = ((hr60) ig5Var2).c;
                if (str2 == null) {
                    str2 = "externalToken";
                }
                flexAdapter.updateVariable(str2, str);
            }
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) aVar.a).a(ufi0.c);
            vm50 vm50Var2 = ((hr60) ig5Var2).e;
            if (vm50Var2 != null) {
                jh5Var2.a.dispatch(vm50Var2);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
