package com.yandex.go.scooters.offers.v2.domain;

import com.yandex.go.scooters.domain.model.ScootersComeFrom;
import com.yandex.go.scooters.domain.x;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.cpm0;
import defpackage.d4o0;
import defpackage.hbn0;
import defpackage.m3o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r7p0;
import defpackage.tbn0;
import defpackage.ubn0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lp3o0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$1$1", f = "ScootersCreateOfferInteractor.kt", l = {BlendingGradientView.BASE_ALPHA, BlendingGradientView.BASE_ALPHA, 157, 167, 169}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $parkingTitle;
    final /* synthetic */ r7p0 $selectedNumber;
    final /* synthetic */ List<tbn0> $vehicles;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$1$1(f fVar, r7p0 r7p0Var, FormattedText formattedText, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$selectedNumber = r7p0Var;
        this.$parkingTitle = formattedText;
        this.$vehicles = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$1$1 scootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$1$1 = new ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$1$1(this.this$0, this.$selectedNumber, this.$parkingTitle, this.$vehicles, continuation);
        scootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$1$1.L$0 = obj;
        return scootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x011f, code lost:
    
        if (r2.emit(r5, r18) != r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fe, code lost:
    
        if (r2.emit(r0, r18) != r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if (r8.emit(r0, r18) == r3) goto L44;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        vpr vprVar;
        ScootersComeFrom b;
        f fVar;
        Object a2;
        f fVar2;
        FormattedText formattedText;
        List<tbn0> list;
        f fVar3;
        vpr vprVar2 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                x xVar = this.this$0.f;
                this.L$0 = vprVar2;
                this.L$1 = vprVar2;
                this.label = 1;
                a = xVar.a(this);
                if (a != coroutineSingletons) {
                    vprVar = vprVar2;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                vpr vprVar3 = (vpr) this.L$1;
                kotlin.b.b(obj);
                vprVar = vprVar3;
                a = obj;
            } else {
                if (i == 2) {
                    kotlin.b.b(obj);
                    b = f.b(this.this$0);
                    f fVar4 = this.this$0;
                    r7p0 r7p0Var = this.$selectedNumber;
                    FormattedText formattedText2 = this.$parkingTitle;
                    List<tbn0> list2 = this.$vehicles;
                    try {
                        this.L$0 = vprVar2;
                        this.L$1 = b;
                        this.L$2 = fVar4;
                        this.L$3 = formattedText2;
                        this.L$4 = list2;
                        this.L$5 = fVar4;
                        this.label = 3;
                        a2 = f.a(fVar4, r7p0Var, this);
                        if (a2 != coroutineSingletons) {
                            fVar2 = fVar4;
                            formattedText = formattedText2;
                            list = list2;
                            fVar3 = fVar2;
                            hbn0 hbn0Var = (hbn0) a2;
                            d4o0 b2 = fVar3.f.b(new ubn0(hbn0Var.a, b, hbn0Var.d, hbn0Var.e, (cpm0) kotlin.collections.a.P(hbn0Var.c), formattedText, list), hbn0Var.b);
                            this.L$0 = vprVar2;
                            this.L$1 = null;
                            this.L$2 = fVar2;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 4;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fVar = fVar4;
                        fVar.f.getClass();
                        m3o0 m3o0Var = new m3o0(th);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 5;
                    }
                    return coroutineSingletons;
                }
                if (i != 3) {
                    if (i == 4) {
                        fVar = (f) this.L$2;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            fVar.f.getClass();
                            m3o0 m3o0Var2 = new m3o0(th);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 5;
                        }
                    } else {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
                fVar2 = (f) this.L$5;
                List<tbn0> list3 = (List) this.L$4;
                FormattedText formattedText3 = (FormattedText) this.L$3;
                fVar3 = (f) this.L$2;
                b = (ScootersComeFrom) this.L$1;
                try {
                    kotlin.b.b(obj);
                    list = list3;
                    formattedText = formattedText3;
                    a2 = obj;
                    hbn0 hbn0Var2 = (hbn0) a2;
                    d4o0 b22 = fVar3.f.b(new ubn0(hbn0Var2.a, b, hbn0Var2.d, hbn0Var2.e, (cpm0) kotlin.collections.a.P(hbn0Var2.c), formattedText, list), hbn0Var2.b);
                    this.L$0 = vprVar2;
                    this.L$1 = null;
                    this.L$2 = fVar2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                } catch (Throwable th3) {
                    th = th3;
                    fVar = fVar2;
                    fVar.f.getClass();
                    m3o0 m3o0Var22 = new m3o0(th);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 5;
                }
            }
            this.L$0 = vprVar2;
            this.L$1 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
