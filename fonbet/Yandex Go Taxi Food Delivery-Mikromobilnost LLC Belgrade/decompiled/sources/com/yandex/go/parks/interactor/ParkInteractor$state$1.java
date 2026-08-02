package com.yandex.go.parks.interactor;

import android.net.Uri;
import defpackage.avj0;
import defpackage.ee90;
import defpackage.evu0;
import defpackage.jwu;
import defpackage.kyh0;
import defpackage.me90;
import defpackage.mvg;
import defpackage.ne90;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Loe90;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.parks.interactor.ParkInteractor$state$1", f = "ParkInteractor.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ParkInteractor$state$1 extends SuspendLambda implements wls {
    final /* synthetic */ ee90 $data;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkInteractor$state$1(a aVar, ee90 ee90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = ee90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ParkInteractor$state$1 parkInteractor$state$1 = new ParkInteractor$state$1(this.this$0, this.$data, continuation);
        parkInteractor$state$1.L$0 = obj;
        return parkInteractor$state$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ParkInteractor$state$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object me90Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            ee90 ee90Var = this.$data;
            String a = aVar.a.a(ee90Var.c, ee90Var.b);
            if (a != null && !evu0.J(a)) {
                a = Uri.parse(a).buildUpon().appendQueryParameter("city", ee90Var.a).build().toString();
            }
            if (a == null || evu0.J(a)) {
                me90Var = new me90(((avj0) this.this$0.b).h(kyh0.error_occurred));
            } else {
                a aVar2 = this.this$0;
                aVar2.getClass();
                jwu jwuVar = new jwu();
                jwuVar.i(null, a);
                jwu g = jwuVar.e().g();
                g.d("classes", kotlin.collections.a.X(aVar2.d.a(), ";", null, null, null, 62));
                me90Var = new ne90(String.format(Locale.US, "%s#%s", Arrays.copyOf(new Object[]{g.e().i, ""}, 2)));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (vprVar.emit(me90Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
