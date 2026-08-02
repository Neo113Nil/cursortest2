package com.yandex.go.suggest.impl.presenter;

import com.yandex.go.suggest.impl.interactor.SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1;
import defpackage.afw0;
import defpackage.eci0;
import defpackage.gls;
import defpackage.jf5;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nm;
import defpackage.ny61;
import defpackage.q4v0;
import defpackage.tje;
import defpackage.tse;
import defpackage.w4l0;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1", f = "FullscreenSuperappSuggestPresenter.kt", l = {394}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class FullscreenSuperappSuggestPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ gls $mvpView;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$1", f = "FullscreenSuperappSuggestPresenter.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c cVar = this.this$0;
            this.label = 1;
            w4l0 w4l0Var = cVar.A;
            return (w4l0Var.h() == null ? e.k(e.T(new b(e.t(w4l0Var.f())), 2), new FullscreenSuperappSuggestPresenter$ensureResolvedPointA$3(cVar, null), this) : zy11Var) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$2", f = "FullscreenSuperappSuggestPresenter.kt", l = {119}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ gls $mvpView;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, gls glsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$mvpView = glsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$mvpView, continuation);
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
                eci0 eci0Var = this.this$0.D.m;
                jf5 jf5Var = new jf5(3, this.$mvpView);
                this.label = 1;
                if (eci0Var.a.collect(jf5Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ny61.A();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$3", f = "FullscreenSuperappSuggestPresenter.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ gls $mvpView;
        int label;
        final /* synthetic */ c this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$3$1", f = "FullscreenSuperappSuggestPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$3$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements wls {
            final /* synthetic */ gls $mvpView;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(gls glsVar, Continuation continuation) {
                super(2, continuation);
                this.$mvpView = glsVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.$mvpView, continuation);
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
                this.$mvpView.animateMessageSending();
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c cVar, gls glsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$mvpView = glsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$mvpView, continuation);
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
                n0 n0Var = (n0) this.this$0.y.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mvpView, null);
                this.label = 1;
                if (e.k(n0Var, anonymousClass1, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lq4v0;", "cartButtonConfiguration", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lq4v0;)Lq4v0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$4", f = "FullscreenSuperappSuggestPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.presenter.FullscreenSuperappSuggestPresenter$attachView$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(3, (Continuation) obj3);
            anonymousClass4.L$0 = (q4v0) obj2;
            return anonymousClass4.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q4v0 q4v0Var = (q4v0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return q4v0Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenSuperappSuggestPresenter$attachView$1(c cVar, gls glsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$mvpView = glsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FullscreenSuperappSuggestPresenter$attachView$1 fullscreenSuperappSuggestPresenter$attachView$1 = new FullscreenSuperappSuggestPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
        fullscreenSuperappSuggestPresenter$attachView$1.L$0 = obj;
        return fullscreenSuperappSuggestPresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullscreenSuperappSuggestPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$mvpView, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, this.$mvpView, null), 3);
            afw0 afw0Var = this.this$0.R;
            g X = e.X(new m0(this.this$0.M.a(), new n(e.t(e.X(new mth(new com.yandex.go.suggest.impl.interactor.b(afw0Var.a.a), 6), new SuperappSuggestCartButtonInteractor$cartButtonConfigurationFlow$$inlined$flatMapLatest$1(null, afw0Var))), new FullscreenSuperappSuggestPresenter$attachView$1$cartButtonConfigurationFlow$1(2, null)), new AnonymousClass4(3, null)), new FullscreenSuperappSuggestPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null));
            gls glsVar = this.$mvpView;
            o oVar = new o(X, new FullscreenSuperappSuggestPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            nm nmVar = new nm(22, glsVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            if (oVar.collect(nmVar, this) == coroutineSingletons) {
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
