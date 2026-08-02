package com.yandex.go.explorer.impl.navigation;

import defpackage.c0g;
import defpackage.fto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.wuo;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToUnviewedCells$1", f = "ExplorerRouterImpl.kt", l = {222}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRouterImpl$subscribeToUnviewedCells$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasUnviewed", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToUnviewedCells$1$2", f = "ExplorerRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToUnviewedCells$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(bool, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            fto ftoVar = (fto) this.this$0.E.b.getValue();
            if (ftoVar != null) {
                wuo wuoVar = this.this$0.E;
                fto a = fto.a(ftoVar, false, z, 31);
                r0 r0Var = wuoVar.b;
                r0Var.getClass();
                r0Var.m(null, a);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerRouterImpl$subscribeToUnviewedCells$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRouterImpl$subscribeToUnviewedCells$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRouterImpl$subscribeToUnviewedCells$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(new b(((com.yandex.go.explorer.impl.data.repositories.a) ((c0g) this.this$0.D).z.qg.get()).e()));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (e.k(t, anonymousClass2, this) == coroutineSingletons) {
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
