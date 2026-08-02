package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.Binding;
import com.yandex.go.payments.cards.data.model.BindingRequest;
import com.yandex.go.payments.cards.data.model.BindingResponse;
import com.yandex.go.payments.cards.data.model.GuessAmount;
import com.yandex.go.payments.cards.data.model.PaymentVerificationsResponse;
import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.cards.domain.exception.InvalidResponseException;
import com.yandex.go.payments.data.model.BindCardError;
import com.yandex.go.payments.domain.exception.CardExpiredException;
import com.yandex.go.payments.domain.exception.MissingCvnException;
import defpackage.cmt;
import defpackage.dw5;
import defpackage.h2t;
import defpackage.j831;
import defpackage.jl40;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.p731;
import defpackage.tx90;
import defpackage.u32;
import defpackage.wnt;
import defpackage.xnt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

/* loaded from: classes13.dex */
public final class i {
    public final g a;
    public final wnt b;
    public final h2t c;

    public i(g gVar, wnt wntVar, u32 u32Var) {
        this.a = gVar;
        this.b = wntVar;
        this.c = new h2t(new n2v0(29, u32Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[Catch: all -> 0x004a, CancellationException -> 0x00d1, TryCatch #2 {CancellationException -> 0x00d1, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x00a9, B:14:0x00af, B:17:0x00c9, B:18:0x00d0, B:23:0x005a, B:27:0x0076, B:29:0x008e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[Catch: all -> 0x004a, CancellationException -> 0x00d1, TryCatch #2 {CancellationException -> 0x00d1, all -> 0x004a, blocks: (B:11:0x0046, B:12:0x00a9, B:14:0x00af, B:17:0x00c9, B:18:0x00d0, B:23:0x005a, B:27:0x0076, B:29:0x008e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, tx90 tx90Var, GuessAmount guessAmount, j831 j831Var, List list, ContinuationImpl continuationImpl) {
        TrustV2Repository$guessAmount$1 trustV2Repository$guessAmount$1;
        int i;
        Verification verification;
        j831 j831Var2 = j831Var;
        try {
            if (continuationImpl instanceof TrustV2Repository$guessAmount$1) {
                trustV2Repository$guessAmount$1 = (TrustV2Repository$guessAmount$1) continuationImpl;
                int i2 = trustV2Repository$guessAmount$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    trustV2Repository$guessAmount$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = trustV2Repository$guessAmount$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trustV2Repository$guessAmount$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        String str3 = j831Var2.b;
                        if (str3 == null) {
                            ny61.g("Verification required for guess amount");
                            return null;
                        }
                        TrustApi a = this.a.a(tx90Var);
                        String str4 = j831Var2.a.a;
                        List list2 = !list.isEmpty() ? list : null;
                        cmt<PaymentVerificationsResponse> d = a.d(str4, str3, str, str2, list2 != null ? kotlin.collections.a.X(list2, ",", null, null, null, 62) : null, guessAmount);
                        trustV2Repository$guessAmount$1.L$0 = null;
                        trustV2Repository$guessAmount$1.L$1 = null;
                        trustV2Repository$guessAmount$1.L$2 = null;
                        trustV2Repository$guessAmount$1.L$3 = null;
                        trustV2Repository$guessAmount$1.L$4 = j831Var2;
                        trustV2Repository$guessAmount$1.L$5 = null;
                        trustV2Repository$guessAmount$1.L$6 = null;
                        trustV2Repository$guessAmount$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(d, trustV2Repository$guessAmount$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j831Var2 = (j831) trustV2Repository$guessAmount$1.L$4;
                        kotlin.b.b(obj);
                    }
                    verification = ((PaymentVerificationsResponse) obj).b;
                    if (verification == null) {
                        return new p731(j831Var2.a, verification, j831Var2.m, (j831) null, 4);
                    }
                    throw new InvalidResponseException("Guess amount response does not contain a verification");
                }
            }
            if (i != 0) {
            }
            verification = ((PaymentVerificationsResponse) obj).b;
            if (verification == null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            b(th);
            throw null;
        }
        trustV2Repository$guessAmount$1 = new TrustV2Repository$guessAmount$1(this, continuationImpl);
        Object obj2 = trustV2Repository$guessAmount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trustV2Repository$guessAmount$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Throwable th) {
        BindCardError bindCardError;
        Throwable cardExpiredException;
        if (!(th instanceof GoApiHttpException)) {
            throw th;
        }
        GoApiHttpException goApiHttpException = (GoApiHttpException) th;
        if (goApiHttpException.getCode() < 500) {
            try {
                BufferedInputStream body = goApiHttpException.getBody();
                if (body != null) {
                    try {
                        bindCardError = (BindCardError) ((xnt) this.b).b(body, BindCardError.Companion.serializer());
                        body.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ooc.g(body, th2);
                            throw th3;
                        }
                    }
                } else {
                    bindCardError = null;
                }
            } catch (IOException | SerializationException unused) {
            }
            if (bindCardError != null) {
                if (jl40.l(bindCardError.b, "cvn_is_mandatory")) {
                    cardExpiredException = new MissingCvnException();
                } else if (jl40.l(bindCardError.a, "card_expired")) {
                    cardExpiredException = new CardExpiredException();
                }
                if (cardExpiredException == null) {
                    throw cardExpiredException;
                }
                this.c.g(goApiHttpException, null);
                throw th;
            }
        }
        cardExpiredException = null;
        if (cardExpiredException == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2 A[Catch: all -> 0x0042, CancellationException -> 0x00ae, TryCatch #2 {CancellationException -> 0x00ae, all -> 0x0042, blocks: (B:11:0x003e, B:12:0x009b, B:16:0x00a2, B:17:0x00a9, B:22:0x0057, B:26:0x006f, B:28:0x0082), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, dw5 dw5Var, int i, List list, ContinuationImpl continuationImpl) {
        TrustV2Repository$initiateBinding$1 trustV2Repository$initiateBinding$1;
        int i2;
        Binding binding;
        try {
            if (continuationImpl instanceof TrustV2Repository$initiateBinding$1) {
                trustV2Repository$initiateBinding$1 = (TrustV2Repository$initiateBinding$1) continuationImpl;
                int i3 = trustV2Repository$initiateBinding$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    trustV2Repository$initiateBinding$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = trustV2Repository$initiateBinding$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = trustV2Repository$initiateBinding$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        BindingRequest bindingRequest = new BindingRequest(dw5Var.a.b, i);
                        TrustApi a = this.a.a(dw5Var.b);
                        List list2 = !list.isEmpty() ? list : null;
                        cmt<BindingResponse> b = a.b(str, str2, list2 != null ? kotlin.collections.a.X(list2, ",", null, null, null, 62) : null, bindingRequest);
                        trustV2Repository$initiateBinding$1.L$0 = null;
                        trustV2Repository$initiateBinding$1.L$1 = null;
                        trustV2Repository$initiateBinding$1.L$2 = null;
                        trustV2Repository$initiateBinding$1.L$3 = null;
                        trustV2Repository$initiateBinding$1.L$4 = null;
                        trustV2Repository$initiateBinding$1.I$0 = i;
                        trustV2Repository$initiateBinding$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(b, trustV2Repository$initiateBinding$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    binding = ((BindingResponse) obj).a;
                    if (binding == null) {
                        return binding;
                    }
                    throw new IllegalStateException("Binding response did not return a binding");
                }
            }
            if (i2 != 0) {
            }
            binding = ((BindingResponse) obj).a;
            if (binding == null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            b(th);
            throw null;
        }
        trustV2Repository$initiateBinding$1 = new TrustV2Repository$initiateBinding$1(this, continuationImpl);
        Object obj2 = trustV2Repository$initiateBinding$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = trustV2Repository$initiateBinding$1.label;
    }
}
