package com.yandex.go.taxi.summary.rida_summary.interactor;

import com.yandex.go.taxi.summary.rida_summary.repository.MarginSource;
import defpackage.c7k0;
import defpackage.cfj0;
import defpackage.g92;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q6c0;
import defpackage.sep0;
import defpackage.tep0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wep0;
import defpackage.wls;
import defpackage.z6k0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2", f = "ScreenStartInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ScreenStartInteractor$handleAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ c7k0 $navigator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wep0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$2", f = "ScreenStartInteractor.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ wep0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(wep0 wep0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = wep0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr f = this.this$0.d.f();
                wep0 wep0Var = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(f, new ScreenStartInteractor$handleAction$2$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                sep0 sep0Var = new sep0(wep0Var, 0);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(sep0Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$3", f = "ScreenStartInteractor.kt", l = {60}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ wep0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(wep0 wep0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = wep0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.preorder.summary.solid.interactors.g gVar = this.this$0.h;
                this.label = 1;
                if (gVar.b(this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$4", f = "ScreenStartInteractor.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ wep0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(wep0 wep0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = wep0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(this.this$0.j.d(), new ScreenStartInteractor$handleAction$2$4$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                tep0 tep0Var = new tep0();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(tep0Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$5", f = "ScreenStartInteractor.kt", l = {69}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ wep0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(wep0 wep0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = wep0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.taxi.summary.rida_summary.repository.i iVar = this.this$0.f;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.summary.rida_summary.repository.b(new com.yandex.go.taxi.summary.rida_summary.repository.d(((com.yandex.go.taxi.tariffs.internal.repository.k) iVar.a).j.b()))).collect(new cfj0(5, iVar), this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$6", f = "ScreenStartInteractor.kt", l = {74}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$6, reason: invalid class name */
    final class AnonymousClass6 extends SuspendLambda implements wls {
        final /* synthetic */ c7k0 $navigator;
        int label;
        final /* synthetic */ wep0 this$0;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "shouldClose"}, k = 3, mv = {2, 4, 0}, xi = 48)
        @mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$6$1", f = "ScreenStartInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$6$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements wls {
            /* synthetic */ boolean Z$0;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    kotlin.b.b(obj);
                    return Boolean.valueOf(z);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(wep0 wep0Var, c7k0 c7k0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = wep0Var;
            this.$navigator = c7k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass6(this.this$0, this.$navigator, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                this.this$0.g.a.getClass();
                g92 g92Var = new g92(2, Boolean.FALSE);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.x(g92Var, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.$navigator.B();
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$7", f = "ScreenStartInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.rida_summary.interactor.ScreenStartInteractor$handleAction$2$7, reason: invalid class name */
    final class AnonymousClass7 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ wep0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(wep0 wep0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = wep0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass7(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass7 anonymousClass7 = (AnonymousClass7) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass7.invokeSuspend(zy11Var);
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
            q6c0 q6c0Var = this.this$0.e;
            z6k0.a((z6k0) q6c0Var.c, MarginSource.Pin, Integer.valueOf(((Number) ((i3y) q6c0Var.w).getValue()).intValue()), null, 4);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStartInteractor$handleAction$2(wep0 wep0Var, c7k0 c7k0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wep0Var;
        this.$navigator = c7k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScreenStartInteractor$handleAction$2 screenStartInteractor$handleAction$2 = new ScreenStartInteractor$handleAction$2(this.this$0, this.$navigator, continuation);
        screenStartInteractor$handleAction$2.L$0 = obj;
        return screenStartInteractor$handleAction$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScreenStartInteractor$handleAction$2 screenStartInteractor$handleAction$2 = (ScreenStartInteractor$handleAction$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        screenStartInteractor$handleAction$2.invokeSuspend(zy11Var);
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
        this.this$0.a.a("RidaSummary.Opened");
        wep0 wep0Var = this.this$0;
        tje.N(tseVar, null, null, new ScreenStartInteractor$handleAction$2$invokeSuspend$$inlined$safeCollectIn$1(wep0Var.i.b, null, wep0Var), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass4(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass5(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass6(this.this$0, this.$navigator, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass7(this.this$0, null), 3);
        return zy11.a;
    }
}
