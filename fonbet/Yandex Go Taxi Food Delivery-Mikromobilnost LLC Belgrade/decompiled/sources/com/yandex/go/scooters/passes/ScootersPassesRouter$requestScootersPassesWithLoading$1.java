package com.yandex.go.scooters.passes;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sco0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.utn0;
import defpackage.wls;
import defpackage.zjn0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.yandex.taxi.scooters.data.model.ScootersPassesListServiceDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.ScootersPassesRouter$requestScootersPassesWithLoading$1", f = "ScootersPassesRouter.kt", l = {152, BlendingGradientView.BASE_ALPHA, 157}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesRouter$requestScootersPassesWithLoading$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersPassesFromScreen $fromScreen;
    final /* synthetic */ tls $onSuccess;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesRouter$requestScootersPassesWithLoading$1(h hVar, ScootersPassesFromScreen scootersPassesFromScreen, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$fromScreen = scootersPassesFromScreen;
        this.$onSuccess = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPassesRouter$requestScootersPassesWithLoading$1 scootersPassesRouter$requestScootersPassesWithLoading$1 = new ScootersPassesRouter$requestScootersPassesWithLoading$1(this.this$0, this.$fromScreen, this.$onSuccess, continuation);
        scootersPassesRouter$requestScootersPassesWithLoading$1.L$0 = obj;
        return scootersPassesRouter$requestScootersPassesWithLoading$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassesRouter$requestScootersPassesWithLoading$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0148  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        tls tlsVar;
        ScootersPassesFromScreen scootersPassesFromScreen;
        tls tlsVar2;
        h hVar2;
        tls tlsVar3;
        ScootersPassesFromScreen scootersPassesFromScreen2;
        h hVar3;
        tls tlsVar4;
        sco0 sco0Var;
        h hVar4;
        tls tlsVar5;
        ScootersPassesFromScreen scootersPassesFromScreen3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                Ref$LongRef ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = -1L;
                ru.yandex.taxi.scooters.presentation.loading.b bVar = (ru.yandex.taxi.scooters.presentation.loading.b) this.this$0.F.get();
                ScootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1 scootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1 = new ScootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1(tje.N(tseVar, null, null, new ScootersPassesRouter$requestScootersPassesWithLoading$1$loadingJob$1(ref$LongRef, this.this$0, bVar, null), 3), ref$LongRef, this.this$0, bVar, null);
                hVar = this.this$0;
                ScootersPassesFromScreen scootersPassesFromScreen4 = this.$fromScreen;
                tls tlsVar6 = this.$onSuccess;
                try {
                    com.yandex.go.scooters.data.g gVar = (com.yandex.go.scooters.data.g) hVar.J.get();
                    ScootersPassesListServiceDto scootersPassesListServiceDto = scootersPassesFromScreen4 == ScootersPassesFromScreen.CHARGERS ? ScootersPassesListServiceDto.CHARGERS : null;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = scootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1;
                    this.L$5 = tlsVar6;
                    this.L$6 = hVar;
                    this.L$7 = scootersPassesFromScreen4;
                    this.L$8 = tlsVar6;
                    this.label = 1;
                    Object a = gVar.a(scootersPassesListServiceDto, this);
                    if (a != coroutineSingletons) {
                        tlsVar = scootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1;
                        scootersPassesFromScreen = scootersPassesFromScreen4;
                        tlsVar2 = tlsVar6;
                        hVar2 = hVar;
                        obj = a;
                        tlsVar3 = tlsVar2;
                    }
                } catch (Throwable th) {
                    th = th;
                    tlsVar = scootersPassesRouter$requestScootersPassesWithLoading$1$cancelLoading$1;
                    scootersPassesFromScreen = scootersPassesFromScreen4;
                    tlsVar2 = tlsVar6;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = hVar;
                    this.L$6 = scootersPassesFromScreen;
                    this.L$7 = tlsVar2;
                    this.L$8 = th;
                    this.L$9 = null;
                    this.label = 3;
                    if (tlsVar.invoke(this) != coroutineSingletons) {
                        hVar4 = hVar;
                        tlsVar5 = tlsVar2;
                        scootersPassesFromScreen3 = scootersPassesFromScreen;
                        hVar4.A((m950) hVar4.H.get(), new zjn0(th, (List) null, 6), new utn0(i2, new g(hVar4, scootersPassesFromScreen3, tlsVar5), hVar4));
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) this.L$8;
                    tlsVar5 = (tls) this.L$7;
                    scootersPassesFromScreen3 = (ScootersPassesFromScreen) this.L$6;
                    hVar4 = (h) this.L$5;
                    kotlin.b.b(obj);
                    hVar4.A((m950) hVar4.H.get(), new zjn0(th, (List) null, 6), new utn0(i2, new g(hVar4, scootersPassesFromScreen3, tlsVar5), hVar4));
                    return zy11.a;
                }
                sco0Var = (sco0) this.L$9;
                tlsVar2 = (tls) this.L$8;
                scootersPassesFromScreen2 = (ScootersPassesFromScreen) this.L$7;
                hVar3 = (h) this.L$6;
                tlsVar4 = (tls) this.L$5;
                tlsVar = (tls) this.L$4;
                try {
                    kotlin.b.b(obj);
                    tlsVar4.invoke(sco0Var);
                } catch (Throwable th2) {
                    th = th2;
                    hVar = hVar3;
                    scootersPassesFromScreen = scootersPassesFromScreen2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = hVar;
                    this.L$6 = scootersPassesFromScreen;
                    this.L$7 = tlsVar2;
                    this.L$8 = th;
                    this.L$9 = null;
                    this.label = 3;
                    if (tlsVar.invoke(this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
            tlsVar2 = (tls) this.L$8;
            scootersPassesFromScreen = (ScootersPassesFromScreen) this.L$7;
            hVar2 = (h) this.L$6;
            tlsVar3 = (tls) this.L$5;
            tlsVar = (tls) this.L$4;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                hVar = hVar2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = hVar;
                this.L$6 = scootersPassesFromScreen;
                this.L$7 = tlsVar2;
                this.L$8 = th;
                this.L$9 = null;
                this.label = 3;
                if (tlsVar.invoke(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            sco0 sco0Var2 = (sco0) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = tlsVar;
            this.L$5 = tlsVar3;
            this.L$6 = hVar2;
            this.L$7 = scootersPassesFromScreen;
            this.L$8 = tlsVar2;
            this.L$9 = sco0Var2;
            this.label = 2;
            if (tlsVar.invoke(this) != coroutineSingletons) {
                scootersPassesFromScreen2 = scootersPassesFromScreen;
                hVar3 = hVar2;
                tlsVar4 = tlsVar3;
                sco0Var = sco0Var2;
                tlsVar4.invoke(sco0Var);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
