package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.GuessAmount;
import com.yandex.go.payments.cards.domain.exception.InvalidResponseException;
import defpackage.evu0;
import defpackage.j831;
import defpackage.jv5;
import defpackage.ny61;
import defpackage.p731;
import defpackage.ql3;
import defpackage.rb8;
import defpackage.to90;
import defpackage.tt2;
import defpackage.tx90;
import defpackage.yfa;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final tt2 a;
    public final yfa b;
    public final i c;
    public final ql3 d;
    public final com.yandex.go.payments.di.a e;

    public d(tt2 tt2Var, yfa yfaVar, i iVar, ql3 ql3Var, com.yandex.go.payments.di.a aVar) {
        this.a = tt2Var;
        this.b = yfaVar;
        this.c = iVar;
        this.d = ql3Var;
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, jv5 jv5Var, tx90 tx90Var, j831 j831Var, GuessAmount guessAmount, boolean z, ContinuationImpl continuationImpl) {
        GuessAmountInteractor$guessAmountWithVerificationRequest$1 guessAmountInteractor$guessAmountWithVerificationRequest$1;
        int i;
        boolean z2;
        j831 j831Var2;
        p731 p731Var;
        dVar.getClass();
        if (continuationImpl instanceof GuessAmountInteractor$guessAmountWithVerificationRequest$1) {
            guessAmountInteractor$guessAmountWithVerificationRequest$1 = (GuessAmountInteractor$guessAmountWithVerificationRequest$1) continuationImpl;
            int i2 = guessAmountInteractor$guessAmountWithVerificationRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                guessAmountInteractor$guessAmountWithVerificationRequest$1.label = i2 - Integer.MIN_VALUE;
                GuessAmountInteractor$guessAmountWithVerificationRequest$1 guessAmountInteractor$guessAmountWithVerificationRequest$12 = guessAmountInteractor$guessAmountWithVerificationRequest$1;
                Object obj = guessAmountInteractor$guessAmountWithVerificationRequest$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = guessAmountInteractor$guessAmountWithVerificationRequest$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    guessAmountInteractor$guessAmountWithVerificationRequest$12.L$0 = null;
                    guessAmountInteractor$guessAmountWithVerificationRequest$12.L$1 = null;
                    guessAmountInteractor$guessAmountWithVerificationRequest$12.L$2 = j831Var;
                    guessAmountInteractor$guessAmountWithVerificationRequest$12.L$3 = null;
                    z2 = z;
                    guessAmountInteractor$guessAmountWithVerificationRequest$12.Z$0 = z2;
                    guessAmountInteractor$guessAmountWithVerificationRequest$12.label = 1;
                    obj = dVar.b(jv5Var, tx90Var, j831Var, guessAmount, guessAmountInteractor$guessAmountWithVerificationRequest$12);
                    if (obj != obj2) {
                        j831Var2 = j831Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                boolean z3 = guessAmountInteractor$guessAmountWithVerificationRequest$12.Z$0;
                j831Var2 = (j831) guessAmountInteractor$guessAmountWithVerificationRequest$12.L$2;
                kotlin.b.b(obj);
                z2 = z3;
                p731Var = (p731) obj;
                guessAmountInteractor$guessAmountWithVerificationRequest$12.L$0 = null;
                guessAmountInteractor$guessAmountWithVerificationRequest$12.L$1 = null;
                guessAmountInteractor$guessAmountWithVerificationRequest$12.L$2 = null;
                guessAmountInteractor$guessAmountWithVerificationRequest$12.L$3 = null;
                guessAmountInteractor$guessAmountWithVerificationRequest$12.L$4 = null;
                guessAmountInteractor$guessAmountWithVerificationRequest$12.Z$0 = z2;
                guessAmountInteractor$guessAmountWithVerificationRequest$12.label = 2;
                if (p731Var != null) {
                    throw new InvalidResponseException("Missing verification data response");
                }
                String str = p731Var.b.a;
                if (str == null || evu0.J(str)) {
                    throw new InvalidResponseException("Guess amount response does not contain a verificationId");
                }
                Object a = ((c) dVar.b.a).f.a(new j831(j831Var2.a, str, "random_amt", null, true, null, null, null, null, null, j831Var2.m, null, 12264), z2, guessAmountInteractor$guessAmountWithVerificationRequest$12);
                return a == obj2 ? obj2 : a;
            }
        }
        guessAmountInteractor$guessAmountWithVerificationRequest$1 = new GuessAmountInteractor$guessAmountWithVerificationRequest$1(dVar, continuationImpl);
        GuessAmountInteractor$guessAmountWithVerificationRequest$1 guessAmountInteractor$guessAmountWithVerificationRequest$122 = guessAmountInteractor$guessAmountWithVerificationRequest$1;
        Object obj3 = guessAmountInteractor$guessAmountWithVerificationRequest$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = guessAmountInteractor$guessAmountWithVerificationRequest$122.label;
        if (i != 0) {
        }
        p731Var = (p731) obj3;
        guessAmountInteractor$guessAmountWithVerificationRequest$122.L$0 = null;
        guessAmountInteractor$guessAmountWithVerificationRequest$122.L$1 = null;
        guessAmountInteractor$guessAmountWithVerificationRequest$122.L$2 = null;
        guessAmountInteractor$guessAmountWithVerificationRequest$122.L$3 = null;
        guessAmountInteractor$guessAmountWithVerificationRequest$122.L$4 = null;
        guessAmountInteractor$guessAmountWithVerificationRequest$122.Z$0 = z2;
        guessAmountInteractor$guessAmountWithVerificationRequest$122.label = 2;
        if (p731Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r14 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(jv5 jv5Var, tx90 tx90Var, j831 j831Var, GuessAmount guessAmount, ContinuationImpl continuationImpl) {
        GuessAmountInteractor$guessAmountRequest$1 guessAmountInteractor$guessAmountRequest$1;
        int i;
        List list;
        if (continuationImpl instanceof GuessAmountInteractor$guessAmountRequest$1) {
            guessAmountInteractor$guessAmountRequest$1 = (GuessAmountInteractor$guessAmountRequest$1) continuationImpl;
            int i2 = guessAmountInteractor$guessAmountRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                guessAmountInteractor$guessAmountRequest$1.label = i2 - Integer.MIN_VALUE;
                GuessAmountInteractor$guessAmountRequest$1 guessAmountInteractor$guessAmountRequest$12 = guessAmountInteractor$guessAmountRequest$1;
                Object obj = guessAmountInteractor$guessAmountRequest$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = guessAmountInteractor$guessAmountRequest$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    guessAmountInteractor$guessAmountRequest$12.L$0 = jv5Var;
                    guessAmountInteractor$guessAmountRequest$12.L$1 = tx90Var;
                    guessAmountInteractor$guessAmountRequest$12.L$2 = j831Var;
                    guessAmountInteractor$guessAmountRequest$12.L$3 = guessAmount;
                    guessAmountInteractor$guessAmountRequest$12.label = 1;
                    obj = this.d.a.a(guessAmountInteractor$guessAmountRequest$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    guessAmount = (GuessAmount) guessAmountInteractor$guessAmountRequest$12.L$3;
                    j831Var = (j831) guessAmountInteractor$guessAmountRequest$12.L$2;
                    tx90Var = (tx90) guessAmountInteractor$guessAmountRequest$12.L$1;
                    jv5Var = (jv5) guessAmountInteractor$guessAmountRequest$12.L$0;
                    kotlin.b.b(obj);
                }
                j831 j831Var2 = j831Var;
                GuessAmount guessAmount2 = guessAmount;
                String str = (String) obj;
                String str2 = ((rb8) jv5Var).a.a;
                to90 to90Var = this.e.c;
                list = (List) to90Var.e.get();
                if (list == null) {
                    list = to90Var.a();
                }
                guessAmountInteractor$guessAmountRequest$12.L$0 = null;
                guessAmountInteractor$guessAmountRequest$12.L$1 = null;
                guessAmountInteractor$guessAmountRequest$12.L$2 = null;
                guessAmountInteractor$guessAmountRequest$12.L$3 = null;
                guessAmountInteractor$guessAmountRequest$12.L$4 = null;
                guessAmountInteractor$guessAmountRequest$12.label = 2;
                Object a = this.c.a(str, str2, tx90Var, guessAmount2, j831Var2, list, guessAmountInteractor$guessAmountRequest$12);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        guessAmountInteractor$guessAmountRequest$1 = new GuessAmountInteractor$guessAmountRequest$1(this, continuationImpl);
        GuessAmountInteractor$guessAmountRequest$1 guessAmountInteractor$guessAmountRequest$122 = guessAmountInteractor$guessAmountRequest$1;
        Object obj2 = guessAmountInteractor$guessAmountRequest$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = guessAmountInteractor$guessAmountRequest$122.label;
        if (i != 0) {
        }
        j831 j831Var22 = j831Var;
        GuessAmount guessAmount22 = guessAmount;
        String str3 = (String) obj2;
        String str22 = ((rb8) jv5Var).a.a;
        to90 to90Var2 = this.e.c;
        list = (List) to90Var2.e.get();
        if (list == null) {
        }
        guessAmountInteractor$guessAmountRequest$122.L$0 = null;
        guessAmountInteractor$guessAmountRequest$122.L$1 = null;
        guessAmountInteractor$guessAmountRequest$122.L$2 = null;
        guessAmountInteractor$guessAmountRequest$122.L$3 = null;
        guessAmountInteractor$guessAmountRequest$122.L$4 = null;
        guessAmountInteractor$guessAmountRequest$122.label = 2;
        Object a2 = this.c.a(str3, str22, tx90Var, guessAmount22, j831Var22, list, guessAmountInteractor$guessAmountRequest$122);
        if (a2 != coroutineSingletons2) {
        }
    }
}
