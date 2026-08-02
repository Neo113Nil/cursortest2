package com.yandex.go.payments.cards.ui;

import com.yandex.go.payments.cards.domain.model.UserCardProfileParams;
import com.yandex.go.payments.domain.q0;
import defpackage.a5f;
import defpackage.dt5;
import defpackage.hfb1;
import defpackage.jst;
import defpackage.ka0;
import defpackage.l9z;
import defpackage.mb8;
import defpackage.ny61;
import defpackage.qa0;
import defpackage.rb8;
import defpackage.sf8;
import defpackage.snf;
import defpackage.tx90;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e {
    public final com.yandex.go.payments.cards.data.a a;
    public final l9z b;
    public final q0 c;
    public final com.yandex.go.payments.cards.data.e d = new com.yandex.go.payments.cards.data.e(2000);
    public final Map e = Collections.synchronizedMap(new LinkedHashMap());

    public e(com.yandex.go.payments.cards.data.a aVar, l9z l9zVar, q0 q0Var) {
        this.a = aVar;
        this.b = l9zVar;
        this.c = q0Var;
    }

    public final Object a(dt5 dt5Var, tx90 tx90Var, Consumer consumer, Continuation continuation) {
        return this.d.a(new CvnRequirementInteractor$makeBinInfoRequestWithRetry$2(this, tx90Var, null), new snf(this, consumer), dt5Var, new a5f(16), new a5f(17), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb A[Catch: all -> 0x0045, CancellationException -> 0x00ed, TryCatch #2 {CancellationException -> 0x00ed, all -> 0x0045, blocks: (B:12:0x0040, B:13:0x00c7, B:15:0x00cb, B:18:0x00da, B:19:0x00df, B:23:0x005f, B:24:0x00ae, B:34:0x0086, B:36:0x0092, B:37:0x0098), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[Catch: all -> 0x0045, CancellationException -> 0x00ed, TryCatch #2 {CancellationException -> 0x00ed, all -> 0x0045, blocks: (B:12:0x0040, B:13:0x00c7, B:15:0x00cb, B:18:0x00da, B:19:0x00df, B:23:0x005f, B:24:0x00ae, B:34:0x0086, B:36:0x0092, B:37:0x0098), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.go.payments.cards.ui.e] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.function.Consumer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(dt5 dt5Var, rb8 rb8Var, qa0 qa0Var, ContinuationImpl continuationImpl) {
        CvnRequirementInteractor$updateBinInfo$1 cvnRequirementInteractor$updateBinInfo$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        zy11 zy11Var;
        Object a;
        qa0 qa0Var2;
        dt5 dt5Var2;
        qa0 qa0Var3;
        sf8 sf8Var;
        try {
            if (continuationImpl instanceof CvnRequirementInteractor$updateBinInfo$1) {
                cvnRequirementInteractor$updateBinInfo$1 = (CvnRequirementInteractor$updateBinInfo$1) continuationImpl;
                int i2 = cvnRequirementInteractor$updateBinInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cvnRequirementInteractor$updateBinInfo$1.label = i2 - Integer.MIN_VALUE;
                    obj = cvnRequirementInteractor$updateBinInfo$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cvnRequirementInteractor$updateBinInfo$1.label;
                    zy11Var = zy11.a;
                    Map map = this.e;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        mb8 mb8Var = dt5Var.a.length() == 8 ? (mb8) map.get(dt5Var.a) : null;
                        if (mb8Var != null) {
                            qa0Var.accept(mb8Var);
                            return zy11Var;
                        }
                        q0 q0Var = this.c;
                        ka0 ka0Var = rb8Var.a;
                        zzs zzsVar = ka0Var.c;
                        Integer num = ka0Var.b;
                        String str = ka0Var.d;
                        if (str == null) {
                            str = this.b.a();
                        }
                        UserCardProfileParams userCardProfileParams = new UserCardProfileParams(zzsVar, num, str);
                        cvnRequirementInteractor$updateBinInfo$1.L$0 = dt5Var;
                        cvnRequirementInteractor$updateBinInfo$1.L$1 = null;
                        cvnRequirementInteractor$updateBinInfo$1.L$2 = qa0Var;
                        cvnRequirementInteractor$updateBinInfo$1.L$3 = null;
                        cvnRequirementInteractor$updateBinInfo$1.label = 1;
                        a = q0Var.a(userCardProfileParams, cvnRequirementInteractor$updateBinInfo$1);
                        qa0Var2 = qa0Var;
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ?? r13 = (Consumer) cvnRequirementInteractor$updateBinInfo$1.L$2;
                            dt5Var2 = (dt5) cvnRequirementInteractor$updateBinInfo$1.L$0;
                            kotlin.b.b(obj);
                            qa0Var3 = r13;
                            sf8Var = (sf8) obj;
                            if (sf8Var != null) {
                                throw new IllegalStateException();
                            }
                            mb8 mb8Var2 = mb8.e;
                            mb8 b = hfb1.b(dt5Var2, sf8Var);
                            map.put(dt5Var2.a, b);
                            qa0Var3.accept(b);
                            return zy11Var;
                        }
                        ?? r132 = (Consumer) cvnRequirementInteractor$updateBinInfo$1.L$2;
                        dt5Var = (dt5) cvnRequirementInteractor$updateBinInfo$1.L$0;
                        kotlin.b.b(obj);
                        a = ((Result) obj).getValue();
                        qa0Var2 = r132;
                    }
                    kotlin.b.b(a);
                    cvnRequirementInteractor$updateBinInfo$1.L$0 = dt5Var;
                    cvnRequirementInteractor$updateBinInfo$1.L$1 = null;
                    cvnRequirementInteractor$updateBinInfo$1.L$2 = qa0Var2;
                    cvnRequirementInteractor$updateBinInfo$1.L$3 = null;
                    cvnRequirementInteractor$updateBinInfo$1.L$4 = null;
                    cvnRequirementInteractor$updateBinInfo$1.label = 2;
                    obj = a(dt5Var, (tx90) a, qa0Var2, cvnRequirementInteractor$updateBinInfo$1);
                    if (obj != coroutineSingletons) {
                        dt5Var2 = dt5Var;
                        qa0Var3 = qa0Var2;
                        sf8Var = (sf8) obj;
                        if (sf8Var != null) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(a);
            cvnRequirementInteractor$updateBinInfo$1.L$0 = dt5Var;
            cvnRequirementInteractor$updateBinInfo$1.L$1 = null;
            cvnRequirementInteractor$updateBinInfo$1.L$2 = qa0Var2;
            cvnRequirementInteractor$updateBinInfo$1.L$3 = null;
            cvnRequirementInteractor$updateBinInfo$1.L$4 = null;
            cvnRequirementInteractor$updateBinInfo$1.label = 2;
            obj = a(dt5Var, (tx90) a, qa0Var2, cvnRequirementInteractor$updateBinInfo$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Failed to get bin info");
            qa0Var.accept(mb8.e);
            return zy11Var;
        }
        cvnRequirementInteractor$updateBinInfo$1 = new CvnRequirementInteractor$updateBinInfo$1(this, continuationImpl);
        obj = cvnRequirementInteractor$updateBinInfo$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cvnRequirementInteractor$updateBinInfo$1.label;
        zy11Var = zy11.a;
        Map map2 = this.e;
    }
}
