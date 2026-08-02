package com.yandex.go.tariffcard.interactor;

import defpackage.ct01;
import defpackage.cw70;
import defpackage.f6v;
import defpackage.g9w;
import defpackage.h6v;
import defpackage.ioj0;
import defpackage.mvg;
import defpackage.n470;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x7t0;
import defpackage.y4p;
import defpackage.z5s0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.interactor.SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3", f = "SoloRequirementsItemInteractor.kt", l = {329, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $isDebug$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ x7t0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002H\n"}, d2 = {"R", CA20Status.STATUS_REQUEST_K, "Lh6v;", "it", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.tariffcard.interactor.SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3$1", f = "SoloRequirementsItemInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.tariffcard.interactor.SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ f6v[] $args;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ x7t0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f6v[] f6vVarArr, Continuation continuation, x7t0 x7t0Var) {
            super(2, continuation);
            this.$args = f6vVarArr;
            this.this$0 = x7t0Var;
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
            h6v h6vVar = (h6v) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f6v[] f6vVarArr = this.$args;
            Object obj2 = f6vVarArr[0].b;
            Object obj3 = f6vVarArr[1].b;
            Object obj4 = f6vVarArr[2].b;
            Object obj5 = f6vVarArr[3].b;
            Object obj6 = f6vVarArr[4].b;
            Object obj7 = f6vVarArr[5].b;
            ct01 ct01Var = (ct01) f6vVarArr[6].b;
            cw70 cw70Var = (cw70) obj6;
            g9w g9wVar = (g9w) obj5;
            ioj0 ioj0Var = (ioj0) obj4;
            n470 n470Var = (n470) obj3;
            z5s0 z5s0Var = (z5s0) obj2;
            return new f6v(h6vVar, this.this$0.a.h(z5s0Var, n470Var, ioj0Var, g9wVar, cw70Var, (y4p) obj7, ct01Var));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3(Continuation continuation, boolean z, x7t0 x7t0Var) {
        super(3, continuation);
        this.$isDebug$inlined = z;
        this.this$0 = x7t0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3 soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3 = new SoloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3((Continuation) obj3, this.$isDebug$inlined, this.this$0);
        soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3.L$0 = (vpr) obj;
        soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3.L$1 = (Object[]) obj2;
        return soloRequirementsItemInteractor$itemsFlow$$inlined$combineIdentifiable$default$1$3.invokeSuspend(zy11.a);
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
