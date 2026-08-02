package com.yandex.go.suggest.impl.router;

import defpackage.dvw;
import defpackage.kol0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n9t0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufw0;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.router.SuperappSuggestFlexModalViewRouter$onAttach$3", f = "SuperappSuggestFlexModalViewRouter.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SuperappSuggestFlexModalViewRouter$onAttach$3 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrdb;", "<anonymous>", "(Ltse;)Lrdb;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.router.SuperappSuggestFlexModalViewRouter$onAttach$3$1", f = "SuperappSuggestFlexModalViewRouter.kt", l = {HProv.PP_INFO}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.router.SuperappSuggestFlexModalViewRouter$onAttach$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
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
            if (i != 0) {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
            d dVar = this.this$0;
            this.L$0 = dVar;
            this.label = 1;
            kol0 kol0Var = new kol0(dvw.b(this));
            dVar.A((m950) dVar.V.get(), new n9t0(false, null), new ufw0(kol0Var));
            Object a = kol0Var.a();
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestFlexModalViewRouter$onAttach$3(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappSuggestFlexModalViewRouter$onAttach$3 superappSuggestFlexModalViewRouter$onAttach$3 = new SuperappSuggestFlexModalViewRouter$onAttach$3(this.this$0, continuation);
        superappSuggestFlexModalViewRouter$onAttach$3.L$0 = obj;
        return superappSuggestFlexModalViewRouter$onAttach$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestFlexModalViewRouter$onAttach$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.quark.soul.domain.a aVar = this.this$0.U;
            this.L$0 = tseVar;
            this.label = 1;
            obj = aVar.c(this);
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
        if (((Boolean) obj).booleanValue()) {
            d dVar = this.this$0;
            if (dVar.h0 == null) {
                dVar.h0 = tje.h(tseVar, null, null, new AnonymousClass1(dVar, null), 3);
            }
        }
        return zy11.a;
    }
}
