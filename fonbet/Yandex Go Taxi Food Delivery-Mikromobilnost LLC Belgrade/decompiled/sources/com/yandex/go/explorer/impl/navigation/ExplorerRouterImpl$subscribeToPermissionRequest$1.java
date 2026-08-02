package com.yandex.go.explorer.impl.navigation;

import defpackage.cb0;
import defpackage.di9;
import defpackage.gto;
import defpackage.lb60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToPermissionRequest$1", f = "ExplorerRouterImpl.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRouterImpl$subscribeToPermissionRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ gto $component;
    final /* synthetic */ lb60 $permissionRouter;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToPermissionRequest$1$1", f = "ExplorerRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToPermissionRequest$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ gto $component;
        final /* synthetic */ lb60 $permissionRouter;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, lb60 lb60Var, gto gtoVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$permissionRouter = lb60Var;
            this.$component = gtoVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$permissionRouter, this.$component, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((zy11) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
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
            c cVar = this.this$0;
            cVar.z(this.$permissionRouter, new cb0(10, cVar, this.$component));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerRouterImpl$subscribeToPermissionRequest$1(c cVar, lb60 lb60Var, gto gtoVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$permissionRouter = lb60Var;
        this.$component = gtoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRouterImpl$subscribeToPermissionRequest$1(this.this$0, this.$permissionRouter, this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRouterImpl$subscribeToPermissionRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            di9 di9Var = new di9(this.this$0.E.f);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$permissionRouter, this.$component, null);
            this.label = 1;
            if (e.k(di9Var, anonymousClass1, this) == coroutineSingletons) {
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
