package com.yandex.go.shortcuts.impl.interactors;

import defpackage.eaf0;
import defpackage.g990;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qaf0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1", f = "ProductsPointsInteractorImpl.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1 extends SuspendLambda implements wls {
    final /* synthetic */ qaf0 $type;
    int label;
    final /* synthetic */ q this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Leaf0;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1$2", f = "ProductsPointsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.shortcuts.impl.interactors.ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            com.yandex.go.coroutines.b.e();
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leaf0;", "snapshot", "Lzy11;", "<anonymous>", "(Leaf0;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1$3", f = "ProductsPointsInteractorImpl.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.shortcuts.impl.interactors.ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ qaf0 $type;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ q this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(q qVar, qaf0 qaf0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = qVar;
            this.$type = qaf0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$type, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((eaf0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            eaf0 eaf0Var = (eaf0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                m mVar = this.this$0.a;
                qaf0 qaf0Var = this.$type;
                this.L$0 = null;
                this.label = 1;
                if (mVar.b(qaf0Var, eaf0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1(q qVar, qaf0 qaf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$type = qaf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1(this.this$0, this.$type, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductsPointsInteractorImpl$subscribeProductsChangesWithMainScreenType$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q qVar = this.this$0;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.s(new p(qVar.g.h, qVar), new g990(21)), new AnonymousClass2(3, null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$type, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(oVar, anonymousClass3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
