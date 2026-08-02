package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.tariffcard.ui.model.CarouselWithPosition$Position;
import defpackage.f6v;
import defpackage.fnx0;
import defpackage.fy8;
import defpackage.h6v;
import defpackage.hmx0;
import defpackage.jz8;
import defpackage.kgb1;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz8;
import defpackage.pex0;
import defpackage.ufx0;
import defpackage.uhj0;
import defpackage.ux8;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3", f = "CarouselUiStateInteractor.kt", l = {329, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $isDebug$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ jz8 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002H\n"}, d2 = {"R", CA20Status.STATUS_REQUEST_K, "Lh6v;", "it", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3$1", f = "CarouselUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ f6v[] $args;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ jz8 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f6v[] f6vVarArr, Continuation continuation, jz8 jz8Var) {
            super(2, continuation);
            this.$args = f6vVarArr;
            this.this$0 = jz8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$args, continuation, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((h6v) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ufx0 ufx0Var;
            h6v h6vVar;
            h6v h6vVar2 = (h6v) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f6v[] f6vVarArr = this.$args;
            boolean z = false;
            Object obj2 = f6vVarArr[0].b;
            Object obj3 = f6vVarArr[1].b;
            List list = (List) f6vVarArr[2].b;
            fy8 fy8Var = (fy8) obj3;
            fnx0 fnx0Var = (fnx0) obj2;
            vfx0 vfx0Var = this.this$0.b;
            mi31 mi31Var = fnx0Var.a;
            pex0 pex0Var = fnx0Var.c;
            vfx0Var.getClass();
            ufx0 a = vfx0.a(mi31Var);
            if (h6vVar2 != null) {
                jz8 jz8Var = this.this$0;
                if (h6vVar2.b) {
                    h6vVar = new h6v(null, true);
                } else {
                    Object obj4 = h6vVar2.a;
                    if (obj4 == null) {
                        h6vVar = new h6v(null, false);
                    } else {
                        jz8Var.b.getClass();
                        h6vVar = new h6v(vfx0.c((hmx0) obj4), false);
                    }
                }
                ufx0Var = (ufx0) h6vVar.a;
            } else {
                ufx0Var = null;
            }
            if (!a.equals(ufx0Var)) {
                return new f6v(null, null);
            }
            if (fy8Var == null) {
                return new f6v(h6vVar2, null);
            }
            List g = this.this$0.f.g(fy8Var.b, list);
            uhj0 uhj0Var = new uhj0(pex0Var.b, fy8Var.a, g);
            boolean z2 = pex0Var.K0;
            if (!g.isEmpty()) {
                Iterator it = g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (kgb1.b((ux8) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
            return new f6v(h6vVar2, new oz8(uhj0Var, (z2 && z) ? CarouselWithPosition$Position.ABOVE_MULTI_TARIFFS : CarouselWithPosition$Position.ABOVE_REQUIREMENTS));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3(Continuation continuation, boolean z, jz8 jz8Var) {
        super(3, continuation);
        this.$isDebug$inlined = z;
        this.this$0 = jz8Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3 carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3 = new CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3((Continuation) obj3, this.$isDebug$inlined, this.this$0);
        carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3.L$0 = (vpr) obj;
        carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3.L$1 = (Object[]) obj2;
        return carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (r0.emit(r9, r8) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r9 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f6v[] f6vVarArr = (f6v[]) objArr;
            boolean z = this.$isDebug$inlined;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(f6vVarArr, null, this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            obj = ru.yandex.taxi.requirements.utils.c.a(f6vVarArr, z, anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
