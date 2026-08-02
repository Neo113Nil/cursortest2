package com.yandex.plus.pay.ui.core.debug.internal.ui.form;

import defpackage.ds31;
import defpackage.etb;
import defpackage.gci0;
import defpackage.k5c;
import defpackage.n2j0;
import defpackage.ny61;
import defpackage.o2j0;
import defpackage.p2j0;
import defpackage.rol0;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yr31;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes2.dex */
public final class a extends yr31 {
    public final com.yandex.plus.pay.ui.core.debug.internal.domain.form.a b;
    public final etb c;
    public final gci0 w;

    public a(com.yandex.plus.pay.ui.core.debug.internal.domain.form.a aVar, etb etbVar) {
        this.b = aVar;
        this.c = etbVar;
        rol0 rol0Var = new rol0(new ReportFormViewModel$screenState$1(this, null));
        k5c a = ds31.a(this);
        xsr0.a.getClass();
        this.w = e.R(rol0Var, a, wsr0.c, p2j0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(a aVar, ContinuationImpl continuationImpl) {
        ReportFormViewModel$createFormState$1 reportFormViewModel$createFormState$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ReportFormViewModel$createFormState$1) {
            reportFormViewModel$createFormState$1 = (ReportFormViewModel$createFormState$1) continuationImpl;
            int i2 = reportFormViewModel$createFormState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reportFormViewModel$createFormState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = reportFormViewModel$createFormState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reportFormViewModel$createFormState$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.plus.pay.ui.core.debug.internal.domain.form.a aVar2 = aVar.b;
                    reportFormViewModel$createFormState$1.label = 1;
                    obj = aVar2.a(reportFormViewModel$createFormState$1);
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
                return new o2j0((n2j0) obj);
            }
        }
        reportFormViewModel$createFormState$1 = new ReportFormViewModel$createFormState$1(aVar, continuationImpl);
        Object obj2 = reportFormViewModel$createFormState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reportFormViewModel$createFormState$1.label;
        if (i != 0) {
        }
        return new o2j0((n2j0) obj2);
    }
}
