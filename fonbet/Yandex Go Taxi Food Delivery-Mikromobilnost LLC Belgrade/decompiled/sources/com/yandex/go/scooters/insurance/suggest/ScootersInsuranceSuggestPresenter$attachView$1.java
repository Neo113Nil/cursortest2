package com.yandex.go.scooters.insurance.suggest;

import defpackage.aun0;
import defpackage.mvg;
import defpackage.n3o0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ytn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.insurance.suggest.ScootersInsuranceSuggestPresenter$attachView$1", f = "ScootersInsuranceSuggestPresenter.kt", l = {31, 32, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceSuggestPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ ytn0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ aun0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceSuggestPresenter$attachView$1(aun0 aun0Var, ytn0 ytn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aun0Var;
        this.$mvpView = ytn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersInsuranceSuggestPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersInsuranceSuggestPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        aun0 aun0Var;
        ytn0 ytn0Var;
        com.yandex.go.scooters.insurance.data.b bVar;
        String str;
        ytn0 ytn0Var2;
        Object b;
        String str2;
        ytn0 ytn0Var3;
        aun0 aun0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            aun0Var = this.this$0;
            com.yandex.go.scooters.insurance.data.b bVar2 = aun0Var.y;
            ytn0Var = this.$mvpView;
            this.L$0 = aun0Var;
            this.L$1 = bVar2;
            this.L$2 = ytn0Var;
            this.label = 1;
            Object f = bVar2.f(this);
            if (f != coroutineSingletons) {
                bVar = bVar2;
                obj = f;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) this.L$4;
                str = (String) this.L$3;
                ytn0Var3 = (ytn0) this.L$2;
                aun0Var2 = (aun0) this.L$0;
                kotlin.b.b(obj);
                String str3 = (String) obj;
                n3o0 n3o0Var = aun0Var2.A;
                ytn0Var3.nc(str, str2, str3, (n3o0Var != null ? n3o0Var.f : null) != null);
                return zy11.a;
            }
            str = (String) this.L$3;
            ytn0Var2 = (ytn0) this.L$2;
            bVar = (com.yandex.go.scooters.insurance.data.b) this.L$1;
            aun0Var = (aun0) this.L$0;
            kotlin.b.b(obj);
            String str4 = (String) obj;
            this.L$0 = aun0Var;
            this.L$1 = null;
            this.L$2 = ytn0Var2;
            this.L$3 = str;
            this.L$4 = str4;
            this.label = 3;
            b = bVar.b(this);
            if (b != coroutineSingletons) {
                str2 = str4;
                ytn0Var3 = ytn0Var2;
                obj = b;
                aun0Var2 = aun0Var;
                String str32 = (String) obj;
                n3o0 n3o0Var2 = aun0Var2.A;
                ytn0Var3.nc(str, str2, str32, (n3o0Var2 != null ? n3o0Var2.f : null) != null);
                return zy11.a;
            }
            return coroutineSingletons;
        }
        ytn0Var = (ytn0) this.L$2;
        bVar = (com.yandex.go.scooters.insurance.data.b) this.L$1;
        aun0Var = (aun0) this.L$0;
        kotlin.b.b(obj);
        String str5 = (String) obj;
        this.L$0 = aun0Var;
        this.L$1 = bVar;
        this.L$2 = ytn0Var;
        this.L$3 = str5;
        this.label = 2;
        Object d = bVar.d(this);
        if (d != coroutineSingletons) {
            ytn0 ytn0Var4 = ytn0Var;
            str = str5;
            obj = d;
            ytn0Var2 = ytn0Var4;
            String str42 = (String) obj;
            this.L$0 = aun0Var;
            this.L$1 = null;
            this.L$2 = ytn0Var2;
            this.L$3 = str;
            this.L$4 = str42;
            this.label = 3;
            b = bVar.b(this);
            if (b != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
