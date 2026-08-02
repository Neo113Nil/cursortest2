package com.yandex.go.shortcuts.impl.interactors;

import defpackage.ezs;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Ld4s0;", "Lru/yandex/taxi/theme/ThemeType;", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lru/yandex/taxi/theme/ThemeType;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.GetModelsInteractorImpl$getModelsFlow$1", f = "GetModelsInteractorImpl.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class GetModelsInteractorImpl$getModelsFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ yaf0 $screenType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Ld4s0;", "Lezs;", "response", "Lzy11;", "<anonymous>", "(Lvpr;Lezs;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.shortcuts.impl.interactors.GetModelsInteractorImpl$getModelsFlow$1$1", f = "GetModelsInteractorImpl.kt", l = {44, 44}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.shortcuts.impl.interactors.GetModelsInteractorImpl$getModelsFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ yaf0 $screenType;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, yaf0 yaf0Var, Continuation continuation) {
            super(3, continuation);
            this.this$0 = dVar;
            this.$screenType = yaf0Var;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$screenType, (Continuation) obj3);
            anonymousClass1.L$0 = (vpr) obj;
            anonymousClass1.L$1 = (ezs) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r8, r0, r7) == r2) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r8 == r2) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vpr vprVar = (vpr) this.L$0;
            ezs ezsVar = (ezs) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar = this.this$0;
                yaf0 yaf0Var = this.$screenType;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.label = 1;
                obj = d.a(dVar, ezsVar, yaf0Var, this);
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
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetModelsInteractorImpl$getModelsFlow$1(d dVar, yaf0 yaf0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
        this.$screenType = yaf0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetModelsInteractorImpl$getModelsFlow$1 getModelsInteractorImpl$getModelsFlow$1 = new GetModelsInteractorImpl$getModelsFlow$1(this.this$0, this.$screenType, (Continuation) obj3);
        getModelsInteractorImpl$getModelsFlow$1.L$0 = (vpr) obj;
        return getModelsInteractorImpl$getModelsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(this.this$0.a.i.a, new ProductsInteractorImpl$productsFlow$$inlined$flatMapLatest$1()));
            this.this$0.c.getClass();
            sjh sjhVar = uyj.a;
            kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.F(t, mdh.b), new AnonymousClass1(this.this$0, this.$screenType, null));
            this.L$0 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(X, vprVar, this) == coroutineSingletons) {
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
