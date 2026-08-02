package com.yandex.go.payments.cards.domain.model;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.k4o;
import defpackage.l8a0;
import defpackage.ny61;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class PaymentMethodVerificationSession {
    public final kotlinx.coroutines.sync.a a = gtq0.a();
    public Backend b;
    public l8a0 c;
    public String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/cards/domain/model/PaymentMethodVerificationSession$Backend;", "", "PROFILE", "DOMAIN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Backend {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Backend[] $VALUES;
        public static final Backend DOMAIN;
        public static final Backend PROFILE;

        static {
            Backend backend = new Backend("PROFILE", 0);
            PROFILE = backend;
            Backend backend2 = new Backend("DOMAIN", 1);
            DOMAIN = backend2;
            Backend[] backendArr = {backend, backend2};
            $VALUES = backendArr;
            $ENTRIES = kotlin.enums.a.a(backendArr);
        }

        public static Backend valueOf(String str) {
            return (Backend) Enum.valueOf(Backend.class, str);
        }

        public static Backend[] values() {
            return (Backend[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.yandex.go.payments.cards.domain.model.PaymentMethodVerificationSession] */
    /* JADX WARN: Type inference failed for: r6v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tls tlsVar, ContinuationImpl continuationImpl) {
        PaymentMethodVerificationSession$runExclusive$1 paymentMethodVerificationSession$runExclusive$1;
        int i;
        Object obj;
        try {
            if (continuationImpl instanceof PaymentMethodVerificationSession$runExclusive$1) {
                paymentMethodVerificationSession$runExclusive$1 = (PaymentMethodVerificationSession$runExclusive$1) continuationImpl;
                int i2 = paymentMethodVerificationSession$runExclusive$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentMethodVerificationSession$runExclusive$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = paymentMethodVerificationSession$runExclusive$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentMethodVerificationSession$runExclusive$1.label;
                    if (i != 0) {
                        b.b(obj2);
                        paymentMethodVerificationSession$runExclusive$1.L$0 = tlsVar;
                        kotlinx.coroutines.sync.a aVar = this.a;
                        paymentMethodVerificationSession$runExclusive$1.L$1 = aVar;
                        paymentMethodVerificationSession$runExclusive$1.label = 1;
                        Object a = aVar.a(paymentMethodVerificationSession$runExclusive$1);
                        obj = aVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050 g050Var = (g050) paymentMethodVerificationSession$runExclusive$1.L$1;
                            b.b(obj2);
                            this = g050Var;
                            return obj2;
                        }
                        Object obj3 = (g050) paymentMethodVerificationSession$runExclusive$1.L$1;
                        tlsVar = (tls) paymentMethodVerificationSession$runExclusive$1.L$0;
                        b.b(obj2);
                        obj = obj3;
                    }
                    paymentMethodVerificationSession$runExclusive$1.L$0 = null;
                    paymentMethodVerificationSession$runExclusive$1.L$1 = obj;
                    paymentMethodVerificationSession$runExclusive$1.label = 2;
                    obj2 = tlsVar.invoke(paymentMethodVerificationSession$runExclusive$1);
                    this = obj;
                }
            }
            if (i != 0) {
            }
            paymentMethodVerificationSession$runExclusive$1.L$0 = null;
            paymentMethodVerificationSession$runExclusive$1.L$1 = obj;
            paymentMethodVerificationSession$runExclusive$1.label = 2;
            obj2 = tlsVar.invoke(paymentMethodVerificationSession$runExclusive$1);
            this = obj;
        } finally {
            this.d(null);
        }
        paymentMethodVerificationSession$runExclusive$1 = new PaymentMethodVerificationSession$runExclusive$1(this, continuationImpl);
        Object obj22 = paymentMethodVerificationSession$runExclusive$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodVerificationSession$runExclusive$1.label;
    }
}
