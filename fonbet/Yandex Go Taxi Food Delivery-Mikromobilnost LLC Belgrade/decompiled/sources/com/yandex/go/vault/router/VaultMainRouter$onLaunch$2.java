package com.yandex.go.vault.router;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.adjust.sdk.Constants;
import com.yandex.go.vault.ui.FlexFullscreenPopupModalView;
import defpackage.b331;
import defpackage.fpb;
import defpackage.hn11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o950;
import defpackage.pys;
import defpackage.tse;
import defpackage.vzv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.vault.router.VaultMainRouter$onLaunch$2", f = "VaultMainRouter.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VaultMainRouter$onLaunch$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.vault.router.VaultMainRouter$onLaunch$2$1", f = "VaultMainRouter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.vault.router.VaultMainRouter$onLaunch$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb331;", Constants.DEEPLINK, "Lzy11;", "<anonymous>", "(Lb331;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.vault.router.VaultMainRouter$onLaunch$2$1$1", f = "VaultMainRouter.kt", l = {110}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.vault.router.VaultMainRouter$onLaunch$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C00791 extends SuspendLambda implements wls {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00791(c cVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00791 c00791 = new C00791(this.this$0, continuation);
                c00791.L$0 = obj;
                return c00791;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00791) create((b331) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b331 b331Var = (b331) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    c cVar = this.this$0;
                    cVar.j(new fpb((pys) cVar.Q.getValue()));
                    cVar.D.m(FlexFullscreenPopupModalView.class);
                    String str = b331Var.b;
                    if (str != null) {
                        com.yandex.go.vault.domain.a aVar = this.this$0.O;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        if (aVar.a(str, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.H.i("vault", false);
            c cVar = this.this$0;
            ru.yandex.taxi.deeplinks.a.d(tseVar, cVar.M, new hn11(vzv0.q, false, new C00791(cVar, null)));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultMainRouter$onLaunch$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VaultMainRouter$onLaunch$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VaultMainRouter$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o950 lifecycle = this.this$0.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
