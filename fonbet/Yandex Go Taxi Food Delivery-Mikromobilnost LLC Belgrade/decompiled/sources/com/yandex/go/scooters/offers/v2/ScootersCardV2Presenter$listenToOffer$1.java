package com.yandex.go.scooters.offers.v2;

import com.yandex.go.scooters.payments.api.exception.ScootersPaymentUnavailableException;
import defpackage.b2k;
import defpackage.epb;
import defpackage.h7n0;
import defpackage.jst;
import defpackage.m6n0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.v1n0;
import defpackage.vng;
import defpackage.w5n0;
import defpackage.wls;
import defpackage.xby;
import defpackage.y5n0;
import defpackage.z5n0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.ScootersCardV2Presenter$listenToOffer$1", f = "ScootersCardV2Presenter.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardV2Presenter$listenToOffer$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz5n0;", ClidProvider.STATE, "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "<anonymous>", "(Lz5n0;Lru/yandex/taxi/theme/ThemeType;)Lz5n0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offers.v2.ScootersCardV2Presenter$listenToOffer$1$1", f = "ScootersCardV2Presenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offers.v2.ScootersCardV2Presenter$listenToOffer$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (z5n0) obj;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            z5n0 z5n0Var = (z5n0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return z5n0Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.offers.v2.ScootersCardV2Presenter$listenToOffer$1$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements wls {
        public final Object b(z5n0 z5n0Var) {
            f fVar = (f) this.receiver;
            if (z5n0Var instanceof y5n0) {
                fVar.Lg();
                fVar.R = tje.N(fVar.Jg(), null, null, new ScootersCardV2Presenter$loadAlternativeOffer$1(fVar, (y5n0) z5n0Var, null), 3);
            } else if (z5n0Var instanceof w5n0) {
                fVar.Lg();
                fVar.P.a = null;
                Throwable th = ((w5n0) z5n0Var).a;
                if (th instanceof ScootersPaymentUnavailableException) {
                    xby.l(jst.e, "Scooters.Payment: lpm request failed", null, (ScootersPaymentUnavailableException) th, "", 2);
                }
                g gVar = ((h7n0) fVar.A).b;
                com.yandex.go.scooters.offers.v2.details.d dVar = gVar.q0;
                if (dVar != null) {
                    gVar.q0 = null;
                    gVar.j(new epb(dVar));
                }
            } else {
                fVar.Lg();
            }
            ((m6n0) fVar.Dg()).render(z5n0Var);
            return zy11.a;
        }

        @Override // defpackage.wls
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((z5n0) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardV2Presenter$listenToOffer$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCardV2Presenter$listenToOffer$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardV2Presenter$listenToOffer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b2k l = vng.l(new mth(new m0(kotlinx.coroutines.flow.e.d(this.this$0.H.a), this.this$0.z.a(), new AnonymousClass1(3, null)), 6), new v1n0(5), vng.c);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, this.this$0, f.class, "handleScootersOffersState", "handleScootersOffersState(Lcom/yandex/go/scooters/offers/v2/domain/model/ScootersCardState;)V", 4);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(l, anonymousClass3, this) == coroutineSingletons) {
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
