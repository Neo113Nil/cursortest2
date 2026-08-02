package com.yandex.go.taxi.order.change.source.mvp;

import com.yandex.go.taxi.order.change.source.interactor.b0;
import defpackage.a3y0;
import defpackage.b1;
import defpackage.c0y0;
import defpackage.cc9;
import defpackage.d821;
import defpackage.f28;
import defpackage.j821;
import defpackage.k821;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv01;
import defpackage.qu;
import defpackage.r821;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import defpackage.zzx0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.UpdateSourcePointConfirmationPresenter$attachView$1", f = "UpdateSourcePointConfirmationPresenter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UpdateSourcePointConfirmationPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ j821 $mvpView;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k821 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSourcePointConfirmationPresenter$attachView$1(k821 k821Var, j821 j821Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = k821Var;
        this.$mvpView = j821Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateSourcePointConfirmationPresenter$attachView$1 updateSourcePointConfirmationPresenter$attachView$1 = new UpdateSourcePointConfirmationPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
        updateSourcePointConfirmationPresenter$attachView$1.L$0 = obj;
        return updateSourcePointConfirmationPresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateSourcePointConfirmationPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k821 k821Var;
        zzs zzsVar;
        zzs zzsVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Double d = null;
        if (i == 0) {
            kotlin.b.b(obj);
            k821 k821Var2 = this.this$0;
            b0 b0Var = k821Var2.x;
            String str = k821Var2.z.b.a;
            this.L$0 = tseVar;
            this.L$1 = k821Var2;
            this.label = 1;
            Object a = b0Var.a(str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            k821Var = k821Var2;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k821Var = (k821) this.L$1;
            kotlin.b.b(obj);
        }
        k821Var.D = (r821) obj;
        k821 k821Var3 = this.this$0;
        r821 r821Var = k821Var3.D;
        cc9 cc9Var = k821Var3.z;
        d821 d821Var = k821Var3.y;
        if (r821Var != null) {
            this.$mvpView.render(r821Var);
            d821Var.getClass();
            c0y0 c0y0Var = cc9Var.b;
            zzx0 zzx0Var = c0y0Var instanceof zzx0 ? (zzx0) c0y0Var : null;
            b1 b1Var = d821Var.a;
            String str2 = cc9Var.c;
            String str3 = c0y0Var.a;
            Double valueOf = (zzx0Var == null || (zzsVar2 = zzx0Var.b) == null) ? null : Double.valueOf(zzsVar2.a);
            if (zzx0Var != null && (zzsVar = zzx0Var.b) != null) {
                d = Double.valueOf(zzsVar.b);
            }
            b1Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("source", str2);
            hashMap.put("p_type", str3);
            if (valueOf != null) {
                hashMap.put("lat", valueOf);
            }
            if (d != null) {
                hashMap.put("lon", d);
            }
            b1Var.a.a("ChangeSourceConfirmationScreen.Shown", hashMap, 1, new HashMap());
        } else {
            a3y0.d((a3y0) k821Var3.B.getValue(), "attachView", null, new pv01(15, k821Var3), 2);
            ((f28) k821Var3.A.a).r(new qu(9));
            d821Var.a.l(cc9Var.c, cc9Var.b.a);
        }
        return zy11.a;
    }
}
