package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.cd;
import com.yandex.passport.data.network.gd;
import com.yandex.passport.data.network.hd;
import com.yandex.passport.internal.report.sb;
import com.yandex.passport.internal.report.tb;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class n1 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.common.ui.lang.b b;
    public final hd c;
    public final com.yandex.passport.internal.report.reporters.a1 d;
    public final com.yandex.passport.internal.network.mappers.b e;

    public n1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.ui.lang.b bVar, hd hdVar, com.yandex.passport.internal.report.reporters.a1 a1Var, com.yandex.passport.internal.network.mappers.b bVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = bVar;
        this.c = hdVar;
        this.d = a1Var;
        this.e = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable c(n1 n1Var, m1 m1Var, ContinuationImpl continuationImpl) {
        SuggestedLanguageUseCase$run$1 suggestedLanguageUseCase$run$1;
        int i;
        Object value;
        Throwable a;
        if (continuationImpl instanceof SuggestedLanguageUseCase$run$1) {
            suggestedLanguageUseCase$run$1 = (SuggestedLanguageUseCase$run$1) continuationImpl;
            int i2 = suggestedLanguageUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestedLanguageUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestedLanguageUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestedLanguageUseCase$run$1.label;
                boolean z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.report.reporters.a1 a1Var = n1Var.d;
                    String b = m1Var.b();
                    a1Var.getClass();
                    a1Var.f(sb.w, new yd(b, 12));
                    hd hdVar = n1Var.c;
                    com.yandex.passport.internal.network.mappers.b bVar = n1Var.e;
                    Environment a2 = m1Var.a();
                    bVar.getClass();
                    cd cdVar = new cd(com.yandex.passport.internal.network.mappers.b.a(a2), m1Var.b(), com.yandex.passport.common.ui.lang.a.b(((com.yandex.passport.internal.ui.lang.a) n1Var.b).b()));
                    suggestedLanguageUseCase$run$1.L$0 = n1Var;
                    suggestedLanguageUseCase$run$1.L$1 = m1Var;
                    suggestedLanguageUseCase$run$1.label = 1;
                    obj = hdVar.a(cdVar, suggestedLanguageUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m1Var = (m1) suggestedLanguageUseCase$run$1.L$1;
                    n1Var = (n1) suggestedLanguageUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    try {
                        gd gdVar = (gd) value;
                        com.yandex.passport.internal.report.reporters.a1 a1Var2 = n1Var.d;
                        String str = gdVar.b;
                        if (str == null) {
                            str = "not received";
                        }
                        String b2 = m1Var.b();
                        a1Var2.getClass();
                        a1Var2.f(tb.w, new yd(b2, 12), new com.yandex.passport.internal.report.i(str, 22, z));
                        value = gdVar.b;
                        if (value == null) {
                            value = com.yandex.passport.common.ui.lang.a.b(((com.yandex.passport.internal.ui.lang.a) n1Var.b).b());
                        }
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                a = Result.a(value);
                if (a != null) {
                    com.yandex.passport.internal.report.reporters.a1 a1Var3 = n1Var.d;
                    String b3 = m1Var.b();
                    String valueOf = String.valueOf(a.getMessage());
                    a1Var3.getClass();
                    a1Var3.f(tb.w, new yd(b3, 12), new com.yandex.passport.internal.report.a(valueOf, 26, z));
                }
                return new Result(value);
            }
        }
        suggestedLanguageUseCase$run$1 = new SuggestedLanguageUseCase$run$1(n1Var, continuationImpl);
        Object obj2 = suggestedLanguageUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestedLanguageUseCase$run$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return new Result(value);
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return c(this, (m1) obj, (ContinuationImpl) continuation);
    }
}
