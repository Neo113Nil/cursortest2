package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success;

import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenParams;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.add0;
import defpackage.b4v0;
import defpackage.bad0;
import defpackage.c4v0;
import defpackage.d4v0;
import defpackage.ehb1;
import defpackage.fpd0;
import defpackage.ind0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tpd0;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements c4v0 {
    public final add0 a;
    public final bad0 b;
    public final n4u0 c;

    public a(add0 add0Var, bad0 bad0Var, n4u0 n4u0Var) {
        this.a = add0Var;
        this.b = bad0Var;
        this.c = n4u0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(11:25|(2:28|26)|29|30|(4:33|(3:35|36|37)(1:39)|38|31)|40|41|(4:44|(3:46|47|48)(1:50)|49|42)|51|52|(1:54))|12|13|(1:15)|16|(2:18|19)(1:21)))|64|6|7|(0)(0)|12|13|(0)|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ec, code lost:
    
        r13 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00eb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x003e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        r13 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ind0 ind0Var, ContinuationImpl continuationImpl) {
        SuccessWebConfigurationInteractorImpl$getSuccessWebConfiguration$1 successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1;
        Object obj;
        int i;
        PlusPayWebSuccessScreenConfiguration plusPayWebSuccessScreenConfiguration;
        if (continuationImpl instanceof SuccessWebConfigurationInteractorImpl$getSuccessWebConfiguration$1) {
            successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1 = (SuccessWebConfigurationInteractorImpl$getSuccessWebConfiguration$1) continuationImpl;
            int i2 = successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.label = i2 - Integer.MIN_VALUE;
                obj = successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.label;
                if (i != 0) {
                    b.b(obj);
                    List list = ind0Var.c;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusTarifficatorPurchase) it.next()).getStatus());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof PlusTarifficatorPurchase.Status.Success) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        String invoiceId = ((PlusTarifficatorPurchase.Status.Success) it3.next()).getInvoiceId();
                        if (invoiceId != null) {
                            arrayList3.add(invoiceId);
                        }
                    }
                    fpd0 e = ((com.yandex.plus.pay.internal.b) this.a).e();
                    PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams = new PlusPayWebSuccessScreenParams(b((PlusTheme) this.c.getValue()), arrayList3);
                    successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.L$0 = ind0Var;
                    successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.L$1 = null;
                    successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.L$2 = null;
                    successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.L$3 = null;
                    successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.L$4 = null;
                    successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.I$0 = 0;
                    successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.I$1 = 0;
                    successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.label = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.payment.a) e).f(plusPayWebSuccessScreenParams, successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ind0Var = (ind0) successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.L$0;
                    b.b(obj);
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                plusPayWebSuccessScreenConfiguration = (PlusPayWebSuccessScreenConfiguration) obj;
                if (plusPayWebSuccessScreenConfiguration == null) {
                    return new b4v0(ehb1.b(plusPayWebSuccessScreenConfiguration.getUrl(), ind0Var.a), plusPayWebSuccessScreenConfiguration.getLoadMessageTimeoutMillis(), plusPayWebSuccessScreenConfiguration.getStartMessageTimeoutMillis());
                }
                return null;
            }
        }
        successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1 = new SuccessWebConfigurationInteractorImpl$getSuccessWebConfiguration$1(this, continuationImpl);
        obj = successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = successWebConfigurationInteractorImpl$getSuccessWebConfiguration$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        plusPayWebSuccessScreenConfiguration = (PlusPayWebSuccessScreenConfiguration) obj;
        if (plusPayWebSuccessScreenConfiguration == null) {
        }
    }

    public final PlusPayWebSuccessScreenParams.PageTheme b(PlusTheme plusTheme) {
        int i = d4v0.a[plusTheme.ordinal()];
        if (i == 1) {
            return PlusPayWebSuccessScreenParams.PageTheme.LIGHT;
        }
        if (i == 2) {
            return PlusPayWebSuccessScreenParams.PageTheme.DARK;
        }
        if (i == 3) {
            return tpd0.a(this.b.a(), (PlusTheme) this.c.getValue()) ? PlusPayWebSuccessScreenParams.PageTheme.DARK : PlusPayWebSuccessScreenParams.PageTheme.LIGHT;
        }
        w511.b();
        return null;
    }
}
