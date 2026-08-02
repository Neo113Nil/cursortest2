package com.yandex.go.platform.payments.domain;

import android.content.Context;
import com.yandex.payment.sdk.core.data.CardId;
import defpackage.dvw;
import defpackage.kol0;
import defpackage.nu5;
import defpackage.ny61;
import defpackage.vv90;
import defpackage.yv90;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final Context a;
    public final com.yandex.go.platform.payments.internal.a b;

    public c(Context context, com.yandex.go.platform.payments.internal.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:(3:10|11|12)(2:14|15))(1:16))(1:25)|17|18|19|20))|27|6|(0)(0)|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r5.resumeWith(new kotlin.Result.Failure(com.yandex.go.platform.payments.models.PaymentException.UnbindUserNotFound.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        UnbindCardInteractor$unbindCard$1 unbindCardInteractor$unbindCard$1;
        int i;
        if (continuationImpl instanceof UnbindCardInteractor$unbindCard$1) {
            unbindCardInteractor$unbindCard$1 = (UnbindCardInteractor$unbindCard$1) continuationImpl;
            int i2 = unbindCardInteractor$unbindCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unbindCardInteractor$unbindCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = unbindCardInteractor$unbindCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unbindCardInteractor$unbindCard$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Context applicationContext = this.a.getApplicationContext();
                    unbindCardInteractor$unbindCard$1.L$0 = str;
                    unbindCardInteractor$unbindCard$1.label = 1;
                    obj = this.b.a(applicationContext, str2, str3, unbindCardInteractor$unbindCard$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    str = (String) unbindCardInteractor$unbindCard$1.L$0;
                    kotlin.b.b(obj);
                }
                vv90 vv90Var = (vv90) obj;
                unbindCardInteractor$unbindCard$1.L$0 = str;
                unbindCardInteractor$unbindCard$1.L$1 = vv90Var;
                unbindCardInteractor$unbindCard$1.label = 2;
                kol0 kol0Var = new kol0(dvw.b(unbindCardInteractor$unbindCard$1));
                b bVar = new b(new UnbindCardInteractor$unbindCard$2$paymentCompletion$1(kol0Var));
                nu5 nu5Var = ((yv90) vv90Var).j;
                CardId.Companion.getClass();
                nu5Var.e(new CardId(str), bVar);
                obj = kol0Var.a();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
        unbindCardInteractor$unbindCard$1 = new UnbindCardInteractor$unbindCard$1(this, continuationImpl);
        Object obj2 = unbindCardInteractor$unbindCard$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unbindCardInteractor$unbindCard$1.label;
        if (i != 0) {
        }
        vv90 vv90Var2 = (vv90) obj2;
        unbindCardInteractor$unbindCard$1.L$0 = str;
        unbindCardInteractor$unbindCard$1.L$1 = vv90Var2;
        unbindCardInteractor$unbindCard$1.label = 2;
        kol0 kol0Var2 = new kol0(dvw.b(unbindCardInteractor$unbindCard$1));
        b bVar2 = new b(new UnbindCardInteractor$unbindCard$2$paymentCompletion$1(kol0Var2));
        nu5 nu5Var2 = ((yv90) vv90Var2).j;
        CardId.Companion.getClass();
        nu5Var2.e(new CardId(str), bVar2);
        obj2 = kol0Var2.a();
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
