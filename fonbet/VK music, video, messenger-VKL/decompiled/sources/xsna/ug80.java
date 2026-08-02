package xsna;

import android.app.Activity;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.log.L;
import com.vk.onboardingpromo.api.OnboardingPromoArguments;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoArgumentsImpl;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.azs;
import xsna.c63;

/* compiled from: OnboardingPromoPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class ug80 extends azs {
    public final com.vk.onboardingpromo.api.a b;
    public final zys c;
    public final hpj d = zvj.a(hqu0.b());

    /* compiled from: OnboardingPromoPresenterImpl.kt */
    public static final class a implements azs.a {
        public final com.vk.onboardingpromo.api.a a;

        public a(com.vk.onboardingpromo.api.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.azs.a
        public final azs a(zys zysVar) {
            return new ug80(this.a, zysVar);
        }
    }

    /* compiled from: FullscreenPromoPresenter.kt */
    public static final class b extends c63.b {
        public final /* synthetic */ PromoSessionInfo c;

        public b(PromoSessionInfo promoSessionInfo) {
            this.c = promoSessionInfo;
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            c63 c63Var = c63.a;
            c63.c(this);
            ug80 ug80Var = ug80.this;
            com.vk.onboardingpromo.api.a aVar = ug80Var.b;
            boolean c = aVar.c();
            PromoSessionInfo promoSessionInfo = this.c;
            if (!c) {
                ug80Var.c.a(promoSessionInfo);
                return;
            }
            OnboardingPromoArguments e = aVar.e();
            if (e != null) {
                OnboardingPromoArgumentsImpl onboardingPromoArgumentsImpl = e instanceof OnboardingPromoArgumentsImpl ? (OnboardingPromoArgumentsImpl) e : null;
                if (onboardingPromoArgumentsImpl == null) {
                    return;
                }
                OnboardingPromoDo onboardingPromoDo = onboardingPromoArgumentsImpl.b;
                if (aVar.d()) {
                    L.e("OnboardingPromo", "The promo " + onboardingPromoDo.g() + " has been seen before, starting to clear the cache");
                    myc0.h(ug80Var.d, null, null, ug80Var.new c(onboardingPromoArgumentsImpl, null), 3).E(ug80Var.new d());
                    return;
                }
                L.e("OnboardingPromo", "Ready to show promo " + onboardingPromoDo.g());
                OnboardingPromoFragment.a aVar2 = new OnboardingPromoFragment.a();
                aVar2.j.putParcelable("arguments", e);
                aVar2.m(xa4.L(activity));
                itg0.i(3, io.reactivex.rxjava3.core.q.T(s3q0.a), ug80Var.new e(promoSessionInfo), null, null);
            }
        }
    }

    /* compiled from: OnboardingPromoPresenterImpl.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.di.vkapp.OnboardingPromoPresenterImpl$show$1$1$1", f = "OnboardingPromoPresenterImpl.kt", l = {38}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ OnboardingPromoArgumentsImpl $argsImpl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(OnboardingPromoArgumentsImpl onboardingPromoArgumentsImpl, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$argsImpl = onboardingPromoArgumentsImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ug80.this.new c(this.$argsImpl, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                com.vk.onboardingpromo.api.a aVar = ug80.this.b;
                long g = this.$argsImpl.b.g();
                this.label = 1;
                if (aVar.a(g, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoPresenterImpl.kt */
    public static final class d implements izs<Throwable, s3q0> {
        public d() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            zvj.c(ug80.this.d, null);
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoPresenterImpl.kt */
    public static final class e implements gzs<s3q0> {
        public final /* synthetic */ PromoSessionInfo c;

        public e(PromoSessionInfo promoSessionInfo) {
            this.c = promoSessionInfo;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            ug80.this.c.a(this.c);
            return s3q0.a;
        }
    }

    public ug80(com.vk.onboardingpromo.api.a aVar, zys zysVar) {
        this.b = aVar;
        this.c = zysVar;
    }

    @Override // xsna.azs
    public final void a(PromoSessionInfo promoSessionInfo) {
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        if (b2 == null) {
            c63.a(new b(promoSessionInfo));
            return;
        }
        com.vk.onboardingpromo.api.a aVar = this.b;
        if (!aVar.c()) {
            this.c.a(promoSessionInfo);
            return;
        }
        OnboardingPromoArguments e2 = aVar.e();
        if (e2 != null) {
            OnboardingPromoArgumentsImpl onboardingPromoArgumentsImpl = e2 instanceof OnboardingPromoArgumentsImpl ? (OnboardingPromoArgumentsImpl) e2 : null;
            if (onboardingPromoArgumentsImpl == null) {
                return;
            }
            OnboardingPromoDo onboardingPromoDo = onboardingPromoArgumentsImpl.b;
            if (aVar.d()) {
                L.e("OnboardingPromo", "The promo " + onboardingPromoDo.g() + " has been seen before, starting to clear the cache");
                myc0.h(this.d, null, null, new c(onboardingPromoArgumentsImpl, null), 3).E(new d());
                return;
            }
            L.e("OnboardingPromo", "Ready to show promo " + onboardingPromoDo.g());
            OnboardingPromoFragment.a aVar2 = new OnboardingPromoFragment.a();
            aVar2.j.putParcelable("arguments", e2);
            aVar2.m(xa4.L(b2));
            itg0.i(3, io.reactivex.rxjava3.core.q.T(s3q0.a), new e(promoSessionInfo), null, null);
        }
    }
}
