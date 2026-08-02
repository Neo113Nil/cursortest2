package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.Binding;
import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.cda0;
import defpackage.dw5;
import defpackage.h831;
import defpackage.h931;
import defpackage.i931;
import defpackage.j831;
import defpackage.jst;
import defpackage.jv5;
import defpackage.k831;
import defpackage.mr21;
import defpackage.ny61;
import defpackage.p731;
import defpackage.ql3;
import defpackage.rb8;
import defpackage.sue0;
import defpackage.to90;
import defpackage.tx90;
import defpackage.y4a0;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes13.dex */
public final class n implements h831 {
    public final i a;
    public final l b;
    public final ql3 c;
    public final sue0 d;
    public final com.yandex.go.payments.di.a e;

    public n(i iVar, l lVar, ql3 ql3Var, sue0 sue0Var, com.yandex.go.payments.di.a aVar) {
        this.a = iVar;
        this.b = lVar;
        this.c = ql3Var;
        this.d = sue0Var;
        this.e = aVar;
    }

    @Override // defpackage.h831
    public final Object a(j831 j831Var, boolean z, ContinuationImpl continuationImpl) {
        l lVar = this.b;
        return lVar.h.a(new VerificationRepository$cardStatus$2(lVar, z, null), new k(0, lVar), j831Var, new mr21(19), new mr21(20), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r2 == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.h831
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(jv5 jv5Var, dw5 dw5Var, Continuation continuation) {
        VerificationTrustInteractor$initiateBindingRequest$1 verificationTrustInteractor$initiateBindingRequest$1;
        int i;
        Binding binding;
        Verification verification;
        jv5 jv5Var2 = jv5Var;
        if (continuation instanceof VerificationTrustInteractor$initiateBindingRequest$1) {
            verificationTrustInteractor$initiateBindingRequest$1 = (VerificationTrustInteractor$initiateBindingRequest$1) continuation;
            int i2 = verificationTrustInteractor$initiateBindingRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verificationTrustInteractor$initiateBindingRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verificationTrustInteractor$initiateBindingRequest$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verificationTrustInteractor$initiateBindingRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = ((rb8) jv5Var2).a.a;
                    Integer num = ((rb8) jv5Var2).a.b;
                    verificationTrustInteractor$initiateBindingRequest$1.L$0 = jv5Var2;
                    verificationTrustInteractor$initiateBindingRequest$1.L$1 = null;
                    verificationTrustInteractor$initiateBindingRequest$1.label = 1;
                    obj = c(str, num, dw5Var, verificationTrustInteractor$initiateBindingRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    jv5Var2 = (jv5) verificationTrustInteractor$initiateBindingRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                i931 i931Var = (i931) obj;
                binding = i931Var.b;
                if (binding != null) {
                    ny61.r("Binding response should not be null");
                    return null;
                }
                String str2 = binding.a;
                if (str2 == null) {
                    ny61.r("Missing bindingId");
                    return null;
                }
                String str3 = binding.b;
                if (str3 == null) {
                    jst.e.n("No card number in bindings response");
                }
                String str4 = binding.c;
                List<Verification> list = binding.e;
                if (list != null) {
                    for (Verification verification2 : list) {
                        VerificationStatus verificationStatus = verification2.c;
                        if (verificationStatus == VerificationStatus.SUCCESS || verificationStatus == VerificationStatus.FAILURE || verificationStatus == VerificationStatus.REQUIRED_3DS || verificationStatus == VerificationStatus.AMOUNT_EXPECTED) {
                            verification = verification2;
                            break;
                        }
                    }
                }
                verification = null;
                if (verification != null) {
                    return new p731(new k831(str2, str3, str4), verification, (tx90) null, this.b.g, 12);
                }
                j831 j831Var = new j831(new k831(str2, str3, str4), null, binding.d, null, true, null, null, ((rb8) jv5Var2).a.d, ((rb8) jv5Var2).a.e, UUID.randomUUID().toString(), i931Var.a.b, null, 8680);
                verificationTrustInteractor$initiateBindingRequest$1.L$0 = null;
                verificationTrustInteractor$initiateBindingRequest$1.L$1 = null;
                verificationTrustInteractor$initiateBindingRequest$1.L$2 = null;
                verificationTrustInteractor$initiateBindingRequest$1.L$3 = null;
                verificationTrustInteractor$initiateBindingRequest$1.L$4 = null;
                verificationTrustInteractor$initiateBindingRequest$1.L$5 = null;
                verificationTrustInteractor$initiateBindingRequest$1.L$6 = null;
                verificationTrustInteractor$initiateBindingRequest$1.L$7 = null;
                verificationTrustInteractor$initiateBindingRequest$1.label = 2;
                Object a = a(j831Var, false, verificationTrustInteractor$initiateBindingRequest$1);
                return a == obj2 ? obj2 : a;
            }
        }
        verificationTrustInteractor$initiateBindingRequest$1 = new VerificationTrustInteractor$initiateBindingRequest$1(this, (ContinuationImpl) continuation);
        Object obj3 = verificationTrustInteractor$initiateBindingRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verificationTrustInteractor$initiateBindingRequest$1.label;
        if (i != 0) {
        }
        i931 i931Var2 = (i931) obj3;
        binding = i931Var2.b;
        if (binding != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Integer num, dw5 dw5Var, ContinuationImpl continuationImpl) {
        VerificationTrustInteractor$createBinding$1 verificationTrustInteractor$createBinding$1;
        int i;
        if (continuationImpl instanceof VerificationTrustInteractor$createBinding$1) {
            verificationTrustInteractor$createBinding$1 = (VerificationTrustInteractor$createBinding$1) continuationImpl;
            int i2 = verificationTrustInteractor$createBinding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verificationTrustInteractor$createBinding$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verificationTrustInteractor$createBinding$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verificationTrustInteractor$createBinding$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    verificationTrustInteractor$createBinding$1.L$0 = null;
                    verificationTrustInteractor$createBinding$1.L$1 = null;
                    verificationTrustInteractor$createBinding$1.L$2 = dw5Var;
                    verificationTrustInteractor$createBinding$1.label = 1;
                    obj = d(str, num, verificationTrustInteractor$createBinding$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    dw5Var = (dw5) verificationTrustInteractor$createBinding$1.L$2;
                    kotlin.b.b(obj);
                }
                verificationTrustInteractor$createBinding$1.L$0 = null;
                verificationTrustInteractor$createBinding$1.L$1 = null;
                verificationTrustInteractor$createBinding$1.L$2 = null;
                verificationTrustInteractor$createBinding$1.L$3 = null;
                verificationTrustInteractor$createBinding$1.label = 2;
                Object e = e((h931) obj, dw5Var, verificationTrustInteractor$createBinding$1);
                return e != obj2 ? obj2 : e;
            }
        }
        verificationTrustInteractor$createBinding$1 = new VerificationTrustInteractor$createBinding$1(this, continuationImpl);
        Object obj3 = verificationTrustInteractor$createBinding$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verificationTrustInteractor$createBinding$1.label;
        if (i != 0) {
        }
        verificationTrustInteractor$createBinding$1.L$0 = null;
        verificationTrustInteractor$createBinding$1.L$1 = null;
        verificationTrustInteractor$createBinding$1.L$2 = null;
        verificationTrustInteractor$createBinding$1.L$3 = null;
        verificationTrustInteractor$createBinding$1.label = 2;
        Object e2 = e((h931) obj3, dw5Var, verificationTrustInteractor$createBinding$1);
        if (e2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Integer num, ContinuationImpl continuationImpl) {
        VerificationTrustInteractor$getBindingParam$1 verificationTrustInteractor$getBindingParam$1;
        int i;
        String str2;
        String str3;
        int intValue;
        List list;
        if (continuationImpl instanceof VerificationTrustInteractor$getBindingParam$1) {
            verificationTrustInteractor$getBindingParam$1 = (VerificationTrustInteractor$getBindingParam$1) continuationImpl;
            int i2 = verificationTrustInteractor$getBindingParam$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verificationTrustInteractor$getBindingParam$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verificationTrustInteractor$getBindingParam$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verificationTrustInteractor$getBindingParam$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    verificationTrustInteractor$getBindingParam$1.L$0 = str;
                    verificationTrustInteractor$getBindingParam$1.L$1 = num;
                    verificationTrustInteractor$getBindingParam$1.label = 1;
                    obj = this.c.a.a(verificationTrustInteractor$getBindingParam$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) verificationTrustInteractor$getBindingParam$1.L$4;
                        str3 = (String) verificationTrustInteractor$getBindingParam$1.L$3;
                        kotlin.b.b(obj);
                        int intValue2 = ((Number) obj).intValue();
                        str2 = str3;
                        intValue = intValue2;
                        to90 to90Var = this.e.c;
                        list = (List) to90Var.e.get();
                        if (list == null) {
                            list = to90Var.a();
                        }
                        return new h931(intValue, str2, str, list);
                    }
                    num = (Integer) verificationTrustInteractor$getBindingParam$1.L$1;
                    str = (String) verificationTrustInteractor$getBindingParam$1.L$0;
                    kotlin.b.b(obj);
                }
                str2 = (String) obj;
                if (num == null) {
                    intValue = num.intValue();
                    to90 to90Var2 = this.e.c;
                    list = (List) to90Var2.e.get();
                    if (list == null) {
                    }
                    return new h931(intValue, str2, str, list);
                }
                verificationTrustInteractor$getBindingParam$1.L$0 = null;
                verificationTrustInteractor$getBindingParam$1.L$1 = null;
                verificationTrustInteractor$getBindingParam$1.L$2 = null;
                verificationTrustInteractor$getBindingParam$1.L$3 = str2;
                verificationTrustInteractor$getBindingParam$1.L$4 = str;
                verificationTrustInteractor$getBindingParam$1.label = 2;
                y4a0 y4a0Var = (y4a0) this.d.b;
                PaymentMethods.LocationInfo locationInfo = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) y4a0Var.b)).g.b.g().o;
                Integer num2 = locationInfo != null ? locationInfo.c : null;
                Object num3 = num2 != null ? new Integer(num2.intValue()) : ((com.yandex.go.zone.interactors.a) y4a0Var.c).a(verificationTrustInteractor$getBindingParam$1);
                if (num3 != coroutineSingletons) {
                    obj = num3;
                    str3 = str2;
                    int intValue22 = ((Number) obj).intValue();
                    str2 = str3;
                    intValue = intValue22;
                    to90 to90Var22 = this.e.c;
                    list = (List) to90Var22.e.get();
                    if (list == null) {
                    }
                    return new h931(intValue, str2, str, list);
                }
                return coroutineSingletons;
            }
        }
        verificationTrustInteractor$getBindingParam$1 = new VerificationTrustInteractor$getBindingParam$1(this, continuationImpl);
        Object obj2 = verificationTrustInteractor$getBindingParam$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verificationTrustInteractor$getBindingParam$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (num == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(h931 h931Var, dw5 dw5Var, ContinuationImpl continuationImpl) {
        VerificationTrustInteractor$getBindingsResult$1 verificationTrustInteractor$getBindingsResult$1;
        int i;
        dw5 dw5Var2;
        if (continuationImpl instanceof VerificationTrustInteractor$getBindingsResult$1) {
            verificationTrustInteractor$getBindingsResult$1 = (VerificationTrustInteractor$getBindingsResult$1) continuationImpl;
            int i2 = verificationTrustInteractor$getBindingsResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verificationTrustInteractor$getBindingsResult$1.label = i2 - Integer.MIN_VALUE;
                VerificationTrustInteractor$getBindingsResult$1 verificationTrustInteractor$getBindingsResult$12 = verificationTrustInteractor$getBindingsResult$1;
                Object obj = verificationTrustInteractor$getBindingsResult$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verificationTrustInteractor$getBindingsResult$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = h931Var.a;
                    String str2 = h931Var.b;
                    int i3 = h931Var.c;
                    List list = h931Var.d;
                    verificationTrustInteractor$getBindingsResult$12.L$0 = null;
                    verificationTrustInteractor$getBindingsResult$12.L$1 = dw5Var;
                    verificationTrustInteractor$getBindingsResult$12.label = 1;
                    obj = this.a.c(str, str2, dw5Var, i3, list, verificationTrustInteractor$getBindingsResult$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dw5Var2 = dw5Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dw5Var2 = (dw5) verificationTrustInteractor$getBindingsResult$12.L$1;
                    kotlin.b.b(obj);
                }
                return new i931(dw5Var2, (Binding) obj);
            }
        }
        verificationTrustInteractor$getBindingsResult$1 = new VerificationTrustInteractor$getBindingsResult$1(this, continuationImpl);
        VerificationTrustInteractor$getBindingsResult$1 verificationTrustInteractor$getBindingsResult$122 = verificationTrustInteractor$getBindingsResult$1;
        Object obj2 = verificationTrustInteractor$getBindingsResult$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verificationTrustInteractor$getBindingsResult$122.label;
        if (i != 0) {
        }
        return new i931(dw5Var2, (Binding) obj2);
    }
}
