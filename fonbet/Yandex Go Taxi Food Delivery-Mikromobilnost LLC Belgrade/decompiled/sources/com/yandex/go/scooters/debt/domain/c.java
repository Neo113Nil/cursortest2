package com.yandex.go.scooters.debt.domain;

import defpackage.hdn0;
import defpackage.hfa0;
import defpackage.jve;
import defpackage.lea0;
import defpackage.m6a0;
import defpackage.mdh;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o6p0;
import defpackage.p6p0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.um50;
import defpackage.uyj;
import defpackage.zgz;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.model.DebtStatus;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes13.dex */
public final class c {
    public final tt2 a;
    public final r b;
    public final com.yandex.go.scooters.payments.domain.b c;
    public final com.yandex.go.scooters.debt.data.a d;
    public final h e;
    public final hdn0 f;
    public final mth g;

    public c(tt2 tt2Var, r rVar, com.yandex.go.scooters.payments.domain.b bVar, com.yandex.go.scooters.debt.data.a aVar, h hVar, hdn0 hdn0Var) {
        this.a = tt2Var;
        this.b = rVar;
        this.c = bVar;
        this.d = aVar;
        this.e = hVar;
        this.f = hdn0Var;
        this.g = new mth(hdn0Var.a, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005d -> B:13:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, long j, ContinuationImpl continuationImpl) {
        ScootersDebtInteractor$makeRequestUntilSuccess$1 scootersDebtInteractor$makeRequestUntilSuccess$1;
        int i;
        p6p0 p6p0Var;
        o6p0 o6p0Var;
        r rVar = cVar.b;
        if (continuationImpl instanceof ScootersDebtInteractor$makeRequestUntilSuccess$1) {
            scootersDebtInteractor$makeRequestUntilSuccess$1 = (ScootersDebtInteractor$makeRequestUntilSuccess$1) continuationImpl;
            int i2 = scootersDebtInteractor$makeRequestUntilSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtInteractor$makeRequestUntilSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDebtInteractor$makeRequestUntilSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtInteractor$makeRequestUntilSuccess$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!kotlinx.coroutines.a.p(scootersDebtInteractor$makeRequestUntilSuccess$1.get_context())) {
                    }
                } else if (i == 1) {
                    j = scootersDebtInteractor$makeRequestUntilSuccess$1.J$0;
                    kotlin.b.b(obj);
                    scootersDebtInteractor$makeRequestUntilSuccess$1.J$0 = j;
                    scootersDebtInteractor$makeRequestUntilSuccess$1.label = 2;
                    obj = rVar.b(scootersDebtInteractor$makeRequestUntilSuccess$1);
                    if (obj == coroutineSingletons) {
                    }
                    p6p0Var = (p6p0) obj;
                    if (((p6p0Var != null || (o6p0Var = p6p0Var.c) == null) ? null : o6p0Var.a) != DebtStatus.IN_PROGRESS) {
                    }
                    if (!kotlinx.coroutines.a.p(scootersDebtInteractor$makeRequestUntilSuccess$1.get_context())) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = scootersDebtInteractor$makeRequestUntilSuccess$1.J$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th) {
                        zgz.a("Error occurred while scooters user state polling for debt", th);
                        p6p0Var = null;
                    }
                    p6p0Var = (p6p0) obj;
                    if (((p6p0Var != null || (o6p0Var = p6p0Var.c) == null) ? null : o6p0Var.a) != DebtStatus.IN_PROGRESS) {
                        if (p6p0Var == null) {
                            p6p0Var = rVar.b.a();
                        }
                        return p6p0Var;
                    }
                    if (!kotlinx.coroutines.a.p(scootersDebtInteractor$makeRequestUntilSuccess$1.get_context())) {
                        scootersDebtInteractor$makeRequestUntilSuccess$1.J$0 = j;
                        scootersDebtInteractor$makeRequestUntilSuccess$1.label = 1;
                        if (kotlinx.coroutines.a.i(j, scootersDebtInteractor$makeRequestUntilSuccess$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        scootersDebtInteractor$makeRequestUntilSuccess$1.J$0 = j;
                        scootersDebtInteractor$makeRequestUntilSuccess$1.label = 2;
                        obj = rVar.b(scootersDebtInteractor$makeRequestUntilSuccess$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        p6p0Var = (p6p0) obj;
                        if (((p6p0Var != null || (o6p0Var = p6p0Var.c) == null) ? null : o6p0Var.a) != DebtStatus.IN_PROGRESS) {
                        }
                        if (!kotlinx.coroutines.a.p(scootersDebtInteractor$makeRequestUntilSuccess$1.get_context())) {
                            return rVar.b.a();
                        }
                    }
                }
            }
        }
        scootersDebtInteractor$makeRequestUntilSuccess$1 = new ScootersDebtInteractor$makeRequestUntilSuccess$1(cVar, continuationImpl);
        Object obj2 = scootersDebtInteractor$makeRequestUntilSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtInteractor$makeRequestUntilSuccess$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0085, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersDebtInteractor$makePayment$1 scootersDebtInteractor$makePayment$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        m6a0 d;
        String str;
        hfa0 hfa0Var;
        lea0 b;
        if (continuationImpl instanceof ScootersDebtInteractor$makePayment$1) {
            scootersDebtInteractor$makePayment$1 = (ScootersDebtInteractor$makePayment$1) continuationImpl;
            int i2 = scootersDebtInteractor$makePayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDebtInteractor$makePayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDebtInteractor$makePayment$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDebtInteractor$makePayment$1.label;
                hdn0 hdn0Var = this.f;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hfa0 hfa0Var2 = (hfa0) hdn0Var.a.getValue();
                    if (hfa0Var2 != null && (d = hfa0Var2.d()) != null) {
                        scootersDebtInteractor$makePayment$1.L$0 = null;
                        scootersDebtInteractor$makePayment$1.label = 1;
                        obj = this.c.a(d, scootersDebtInteractor$makePayment$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i != 3 && i != 4 && i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                str = (String) obj;
                hfa0Var = (hfa0) hdn0Var.a.getValue();
                if (hfa0Var != null && (b = hfa0Var.b()) != null) {
                    com.yandex.go.scooters.debt.data.a aVar = this.d;
                    if (str == null) {
                        scootersDebtInteractor$makePayment$1.L$0 = null;
                        scootersDebtInteractor$makePayment$1.L$1 = null;
                        scootersDebtInteractor$makePayment$1.L$2 = null;
                        scootersDebtInteractor$makePayment$1.label = 2;
                        Object b2 = aVar.b(str, scootersDebtInteractor$makePayment$1);
                        if (b2 != coroutineSingletons) {
                            return b2;
                        }
                    } else if (b instanceof jve) {
                        String str2 = ((jve) b).a;
                        scootersDebtInteractor$makePayment$1.L$0 = null;
                        scootersDebtInteractor$makePayment$1.L$1 = null;
                        scootersDebtInteractor$makePayment$1.L$2 = null;
                        scootersDebtInteractor$makePayment$1.L$3 = null;
                        scootersDebtInteractor$makePayment$1.label = 3;
                        if (aVar.a(str2, scootersDebtInteractor$makePayment$1) == coroutineSingletons) {
                        }
                    } else if (b instanceof um50) {
                        String str3 = ((um50) b).a;
                        scootersDebtInteractor$makePayment$1.L$0 = null;
                        scootersDebtInteractor$makePayment$1.L$1 = null;
                        scootersDebtInteractor$makePayment$1.L$2 = null;
                        scootersDebtInteractor$makePayment$1.L$3 = null;
                        scootersDebtInteractor$makePayment$1.label = 4;
                        if (aVar.c(str3, scootersDebtInteractor$makePayment$1) == coroutineSingletons) {
                        }
                    } else {
                        String id = b.getId();
                        if (id != null) {
                            scootersDebtInteractor$makePayment$1.L$0 = null;
                            scootersDebtInteractor$makePayment$1.L$1 = null;
                            scootersDebtInteractor$makePayment$1.L$2 = null;
                            scootersDebtInteractor$makePayment$1.L$3 = null;
                            scootersDebtInteractor$makePayment$1.label = 5;
                            if (aVar.d(id, scootersDebtInteractor$makePayment$1) == coroutineSingletons) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        scootersDebtInteractor$makePayment$1 = new ScootersDebtInteractor$makePayment$1(this, continuationImpl);
        Object obj2 = scootersDebtInteractor$makePayment$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDebtInteractor$makePayment$1.label;
        hdn0 hdn0Var2 = this.f;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        str = (String) obj2;
        hfa0Var = (hfa0) hdn0Var2.a.getValue();
        if (hfa0Var != null) {
            com.yandex.go.scooters.debt.data.a aVar2 = this.d;
            if (str == null) {
            }
            return coroutineSingletons;
        }
        return zy11Var2;
    }

    public final tpr c() {
        b bVar = new b(new n(this.e.b(true), new ScootersDebtInteractor$pollWhileDebt$1(this, null)), this);
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return e.F(bVar, mdh.b);
    }
}
