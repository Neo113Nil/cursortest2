package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import defpackage.da0;
import defpackage.drj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sno0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vno0;
import defpackage.wls;
import defpackage.zvi;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsPresenter$handleUrlAction$1", f = "DiscountsPromoCodeDetailsPresenter.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class DiscountsPromoCodeDetailsPresenter$handleUrlAction$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ drj this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsPresenter$handleUrlAction$1$1", f = "DiscountsPromoCodeDetailsPresenter.kt", l = {141}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsPresenter$handleUrlAction$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vno0 $result;
        int label;
        final /* synthetic */ drj this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(drj drjVar, vno0 vno0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = drjVar;
            this.$result = vno0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$result, continuation);
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
                ((da0) this.this$0.L.a).r(new zvi(11, this.$result));
                drj drjVar = this.this$0;
                com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d dVar = drjVar.C;
                List list = drjVar.J;
                this.label = 1;
                if (dVar.c(list, this) == coroutineSingletons) {
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
    public DiscountsPromoCodeDetailsPresenter$handleUrlAction$1(drj drjVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = drjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscountsPromoCodeDetailsPresenter$handleUrlAction$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscountsPromoCodeDetailsPresenter$handleUrlAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            drj drjVar = this.this$0;
            sno0 sno0Var = drjVar.F;
            String str = drjVar.I.f;
            this.label = 1;
            obj = sno0Var.a.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        drj drjVar2 = this.this$0;
        tje.N(drjVar2.y, null, null, new AnonymousClass1(drjVar2, (vno0) obj, null), 3);
        return zy11.a;
    }
}
