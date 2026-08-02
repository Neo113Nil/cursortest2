package com.yandex.go.promocodes.referral.impl.ui;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.promocodes.referral.impl.data.c;
import com.yandex.go.promocodes.referral.impl.provider.k;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wni0;
import defpackage.xni0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.referral.impl.ui.ReferralGiftPresenter$attachView$1", f = "ReferralGiftPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ReferralGiftPresenter$attachView$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xni0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.promocodes.referral.impl.ui.ReferralGiftPresenter$attachView$1$1", f = "ReferralGiftPresenter.kt", l = {69}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.promocodes.referral.impl.ui.ReferralGiftPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ xni0 this$0;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isVisible", "Lcom/yandex/go/navigation/screen/api/Screen;", MetaDataField.SCREEN_FIELD, "Lzy11;", "<anonymous>", "(ZLcom/yandex/go/navigation/screen/api/Screen;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.promocodes.referral.impl.ui.ReferralGiftPresenter$attachView$1$1$1", f = "ReferralGiftPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.promocodes.referral.impl.ui.ReferralGiftPresenter$attachView$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00631 extends SuspendLambda implements zls {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ xni0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00631(xni0 xni0Var, Continuation continuation) {
                super(3, continuation);
                this.this$0 = xni0Var;
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C00631 c00631 = new C00631(this.this$0, (Continuation) obj3);
                c00631.Z$0 = booleanValue;
                c00631.L$0 = (Screen) obj2;
                zy11 zy11Var = zy11.a;
                c00631.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                Screen screen = (Screen) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.Lg(z, screen);
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(xni0 xni0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = xni0Var;
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
            if (i == 0) {
                kotlin.b.b(obj);
                xni0 xni0Var = this.this$0;
                c cVar = xni0Var.z;
                m0 m0Var = new m0(cVar.d, cVar.b, new C00631(xni0Var, null));
                this.label = 1;
                if (e.j(m0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.promocodes.referral.impl.ui.ReferralGiftPresenter$attachView$1$2", f = "ReferralGiftPresenter.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.promocodes.referral.impl.ui.ReferralGiftPresenter$attachView$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ xni0 this$0;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lcom/yandex/go/promocodes/referral/api/net/dto/ReferralCode;", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.promocodes.referral.impl.ui.ReferralGiftPresenter$attachView$1$2$1", f = "ReferralGiftPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.promocodes.referral.impl.ui.ReferralGiftPresenter$attachView$1$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements zls {
            /* synthetic */ Object L$0;
            int label;

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
                anonymousClass1.L$0 = (Throwable) obj2;
                zy11 zy11Var = zy11.a;
                anonymousClass1.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Throwable th = (Throwable) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                jst.e.k(th, "Failed to update image tag");
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(xni0 xni0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = xni0Var;
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
                o oVar = new o(((k) this.this$0.A).a(), new AnonymousClass1(3, null));
                wni0 wni0Var = new wni0(this.this$0);
                this.label = 1;
                if (oVar.collect(wni0Var, this) == coroutineSingletons) {
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
    public ReferralGiftPresenter$attachView$1(xni0 xni0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xni0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReferralGiftPresenter$attachView$1 referralGiftPresenter$attachView$1 = new ReferralGiftPresenter$attachView$1(this.this$0, continuation);
        referralGiftPresenter$attachView$1.L$0 = obj;
        return referralGiftPresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ReferralGiftPresenter$attachView$1 referralGiftPresenter$attachView$1 = (ReferralGiftPresenter$attachView$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        referralGiftPresenter$attachView$1.invokeSuspend(zy11Var);
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
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        return zy11.a;
    }
}
