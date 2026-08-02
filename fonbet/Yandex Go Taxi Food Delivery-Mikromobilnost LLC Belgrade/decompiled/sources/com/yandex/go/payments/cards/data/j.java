package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.data.q;
import defpackage.cda0;
import defpackage.ie60;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class j {
    public final cda0 a;
    public final q b;

    public j(cda0 cda0Var, q qVar) {
        this.a = cda0Var;
        this.b = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (defpackage.tje.k0(r8, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        UnbindCardInteractor$unbindCard$1 unbindCardInteractor$unbindCard$1;
        int i;
        Object a;
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
                    String code = PaymentMethod$Type.CARD.getCode();
                    unbindCardInteractor$unbindCard$1.L$0 = str;
                    unbindCardInteractor$unbindCard$1.label = 1;
                    a = this.b.a(str, code, unbindCardInteractor$unbindCard$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return Boolean.TRUE;
                    }
                    str = (String) unbindCardInteractor$unbindCard$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                kotlin.b.b(a);
                ie60 ie60Var = ie60.a;
                UnbindCardInteractor$unbindCard$2 unbindCardInteractor$unbindCard$2 = new UnbindCardInteractor$unbindCard$2(this, str, null);
                unbindCardInteractor$unbindCard$1.L$0 = null;
                unbindCardInteractor$unbindCard$1.label = 2;
            }
        }
        unbindCardInteractor$unbindCard$1 = new UnbindCardInteractor$unbindCard$1(this, continuationImpl);
        Object obj2 = unbindCardInteractor$unbindCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unbindCardInteractor$unbindCard$1.label;
        if (i != 0) {
        }
        kotlin.b.b(a);
        ie60 ie60Var2 = ie60.a;
        UnbindCardInteractor$unbindCard$2 unbindCardInteractor$unbindCard$22 = new UnbindCardInteractor$unbindCard$2(this, str, null);
        unbindCardInteractor$unbindCard$1.L$0 = null;
        unbindCardInteractor$unbindCard$1.label = 2;
    }
}
