package com.yandex.go.rida.bids.data;

import com.yandex.go.rida.bids.data.model.IncreasePassengerPriceParam;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.z1b1;
import defpackage.zy11;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.rida.bids.data.BidsNetworkRepository$increasePassengerPrice$2", f = "BidsNetworkRepository.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsNetworkRepository$increasePassengerPrice$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $iteration;
    final /* synthetic */ String $passengerPriceIncrement;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.rida.bids.data.BidsNetworkRepository$increasePassengerPrice$2$1", f = "BidsNetworkRepository.kt", l = {56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.rida.bids.data.BidsNetworkRepository$increasePassengerPrice$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ cmt<zy11> $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cmt cmtVar, Continuation continuation) {
            super(2, continuation);
            this.$request = cmtVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$request, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    b.b(obj);
                    cmt<zy11> cmtVar = this.$request;
                    this.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(cmtVar, null, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(z1b1.b(((fmt) obj).b));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                jst.e.r("Failed to call increase passenger price request", th);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsNetworkRepository$increasePassengerPrice$2(a aVar, int i, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$iteration = i;
        this.$passengerPriceIncrement = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BidsNetworkRepository$increasePassengerPrice$2(this.this$0, this.$iteration, this.$passengerPriceIncrement, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((BidsNetworkRepository$increasePassengerPrice$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
            b.b(obj);
            return obj;
        }
        b.b(obj);
        String uuid = UUID.randomUUID().toString();
        a aVar = this.this$0;
        cmt<zy11> c = aVar.a.c(uuid, new IncreasePassengerPriceParam(this.$iteration, aVar.c.b().a, this.$passengerPriceIncrement));
        this.this$0.b.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(c, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object k0 = tje.k0(mdhVar, anonymousClass1, this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
