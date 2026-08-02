package com.yandex.mobile.drive.map.geocoder;

import defpackage.da20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x920;
import defpackage.zy11;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.map.geocoder.MapGeocoderGoPlugin$onMethodCall$1", f = "MapGeocoderGoPlugin.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MapGeocoderGoPlugin$onMethodCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ x920 $call;
    final /* synthetic */ da20 $result;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapGeocoderGoPlugin$onMethodCall$1(da20 da20Var, a aVar, x920 x920Var, Continuation continuation) {
        super(2, continuation);
        this.$result = da20Var;
        this.this$0 = aVar;
        this.$call = x920Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapGeocoderGoPlugin$onMethodCall$1(this.$result, this.this$0, this.$call, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapGeocoderGoPlugin$onMethodCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        da20 da20Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                da20 da20Var2 = this.$result;
                a aVar = this.this$0;
                x920 x920Var = this.$call;
                this.L$0 = da20Var2;
                this.label = 1;
                Serializable a = a.a(aVar, x920Var, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                da20Var = da20Var2;
                obj = a;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                da20Var = (da20) this.L$0;
                b.b(obj);
            }
            da20Var.success(obj);
        } catch (CancellationException e) {
            this.$result.error("cancel", null, null);
            throw e;
        } catch (Exception e2) {
            this.$result.error("error", e2.getMessage(), null);
        }
        return zy11.a;
    }
}
