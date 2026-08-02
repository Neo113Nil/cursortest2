package com.yandex.go.scooters.offers.v2.domain;

import com.yandex.go.scooters.domain.x;
import defpackage.l4o0;
import defpackage.m3o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r7p0;
import defpackage.tbn0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lp3o0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1", f = "ScootersCreateOfferInteractor.kt", l = {HProv.PP_VERSION_TIMESTAMP, HProv.PP_VERSION_TIMESTAMP, HProv.PP_SECURITY_LEVEL, HProv.PP_FAST_CODE, 139}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1 extends SuspendLambda implements wls {
    final /* synthetic */ l4o0 $presentationState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1(f fVar, l4o0 l4o0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$presentationState = l4o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1 scootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1 = new ScootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1(this.this$0, this.$presentationState, continuation);
        scootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1.L$0 = obj;
        return scootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
    
        if (r2.emit(r11, r10) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        r7p0 r7p0Var;
        Iterator it;
        Object obj2;
        tbn0 tbn0Var;
        vpr vprVar2 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        f fVar = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            fVar.f.getClass();
            m3o0 m3o0Var = new m3o0(th);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
            if (vprVar2.emit(m3o0Var, this) == coroutineSingletons) {
            }
        }
        if (fVar == 0) {
            kotlin.b.b(obj);
            x xVar = this.this$0.f;
            this.L$0 = vprVar2;
            this.L$1 = vprVar2;
            this.label = 1;
            obj = xVar.a(this);
            if (obj != coroutineSingletons) {
                vprVar = vprVar2;
            }
        }
        if (fVar == 1) {
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        } else {
            if (fVar != 2) {
                if (fVar != 3) {
                    if (fVar == 4) {
                    } else {
                        if (fVar != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                f fVar2 = (f) this.L$1;
                kotlin.b.b(obj);
                fVar = fVar2;
                Pair pair = (Pair) obj;
                FormattedText formattedText = (FormattedText) pair.getFirst();
                List list = (List) pair.getSecond();
                com.yandex.go.scooters.offers.v2.data.b bVar = this.this$0.j;
                l4o0 l4o0Var = this.$presentationState;
                bVar.getClass();
                r7p0Var = l4o0Var.d;
                if (r7p0Var == null) {
                    r7p0Var = bVar.c;
                }
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((tbn0) obj2).a.equals(r7p0Var)) {
                        break;
                    }
                }
                tbn0Var = (tbn0) obj2;
                if (tbn0Var == null) {
                    tbn0Var = (tbn0) kotlin.collections.a.P(list);
                }
                r7p0 r7p0Var2 = tbn0Var.a;
                f fVar3 = this.this$0;
                kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(com.yandex.go.coroutines.b.d(fVar3.j.b, new ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$$inlined$start$1(r7p0Var2, null)), new ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$$inlined$flatMapLatest$1(null, fVar3, formattedText, list));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                return kotlinx.coroutines.flow.e.u(X, vprVar2, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            kotlin.b.b(obj);
            f fVar4 = this.this$0;
            l4o0 l4o0Var2 = this.$presentationState;
            com.yandex.go.scooters.offers.v2.data.b bVar2 = fVar4.j;
            this.L$0 = vprVar2;
            this.L$1 = fVar4;
            this.label = 3;
            obj = bVar2.a(l4o0Var2, this);
            fVar = fVar4;
            if (obj == coroutineSingletons) {
            }
            Pair pair2 = (Pair) obj;
            FormattedText formattedText2 = (FormattedText) pair2.getFirst();
            List list2 = (List) pair2.getSecond();
            com.yandex.go.scooters.offers.v2.data.b bVar3 = this.this$0.j;
            l4o0 l4o0Var3 = this.$presentationState;
            bVar3.getClass();
            r7p0Var = l4o0Var3.d;
            if (r7p0Var == null) {
            }
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            tbn0Var = (tbn0) obj2;
            if (tbn0Var == null) {
            }
            r7p0 r7p0Var22 = tbn0Var.a;
            f fVar32 = this.this$0;
            kotlinx.coroutines.flow.internal.g X2 = kotlinx.coroutines.flow.e.X(com.yandex.go.coroutines.b.d(fVar32.j.b, new ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$$inlined$start$1(r7p0Var22, null)), new ScootersCreateOfferInteractor$listenParkingVehiclesSelectionChange$$inlined$flatMapLatest$1(null, fVar32, formattedText2, list2));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 5;
            if (kotlinx.coroutines.flow.e.u(X2, vprVar2, this) != coroutineSingletons) {
            }
        }
        this.L$0 = vprVar2;
        this.L$1 = null;
        this.label = 2;
    }
}
