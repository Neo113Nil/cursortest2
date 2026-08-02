package com.yandex.go.scooters.preselection.loading.v2;

import com.yandex.go.eboks.objects.data.a;
import com.yandex.go.scooters.data.model.ScootersEboksObjectsSelectScooterAction;
import com.yandex.go.scooters.domain.model.ScootersPreselectionException;
import defpackage.ahn;
import defpackage.avj0;
import defpackage.cmo0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ygn;
import defpackage.ylo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.preselection.loading.v2.ScootersPreselectionLoadingPresenter$attachView$2", f = "ScootersPreselectionLoadingV2Presenter.kt", l = {43, 52, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreselectionLoadingPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ ahn $eboksObjectsClientEventRepository;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ylo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreselectionLoadingPresenter$attachView$2(ahn ahnVar, ylo0 ylo0Var, Continuation continuation) {
        super(2, continuation);
        this.$eboksObjectsClientEventRepository = ahnVar;
        this.this$0 = ylo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPreselectionLoadingPresenter$attachView$2(this.$eboksObjectsClientEventRepository, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreselectionLoadingPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r11 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        ylo0 ylo0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ahn ahnVar = this.$eboksObjectsClientEventRepository;
            ygn ygnVar = new ygn(new ScootersEboksObjectsSelectScooterAction(this.this$0.E.getNumber().a, this.this$0.E.getNumber().b.k(), this.this$0.D));
            this.label = 1;
            obj = ((a) ahnVar).b(ygnVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ylo0Var = (ylo0) this.L$2;
                    b.b(obj);
                    cmo0 cmo0Var = (cmo0) ylo0Var.Dg();
                    avj0 avj0Var = (avj0) ylo0Var.x;
                    cmo0Var.s9(new ScootersPreselectionException(avj0Var.h(kyh0.scooters_not_found_title), avj0Var.h(kyh0.scooters_not_found_subtile)));
                    return zy11.a;
                }
                b.b(obj);
                a = ((Result) obj).getValue();
                ylo0 ylo0Var2 = this.this$0;
                if (Result.a(a) != null) {
                    cmo0 cmo0Var2 = (cmo0) ylo0Var2.Dg();
                    avj0 avj0Var2 = (avj0) ylo0Var2.x;
                    cmo0Var2.s9(new ScootersPreselectionException(avj0Var2.h(kyh0.scooters_not_found_title), avj0Var2.h(kyh0.scooters_not_found_subtile)));
                }
                ylo0 ylo0Var3 = this.this$0;
                if (!(a instanceof Result.Failure)) {
                    this.L$0 = null;
                    this.L$1 = a;
                    this.L$2 = ylo0Var3;
                    this.L$3 = null;
                    this.label = 3;
                    if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                        ylo0Var = ylo0Var3;
                        cmo0 cmo0Var3 = (cmo0) ylo0Var.Dg();
                        avj0 avj0Var3 = (avj0) ylo0Var.x;
                        cmo0Var3.s9(new ScootersPreselectionException(avj0Var3.h(kyh0.scooters_not_found_title), avj0Var3.h(kyh0.scooters_not_found_subtile)));
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
            b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        a = ((com.yandex.go.eboks.objects.domain.model.a) obj).a(this);
    }
}
