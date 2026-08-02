package defpackage;

import com.yandex.fintechsdk.data.config.impl.internal.a;
import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class eaj {
    public final a a;

    public eaj(a aVar) {
        this.a = aVar;
    }

    public final boolean a() {
        Object failure;
        Object b;
        PaymentKitConfig a = this.a.b.a();
        if (a == null) {
            failure = Boolean.FALSE;
        } else {
            String str = a.getFlags().get("enableBiometry");
            if (str == null) {
                failure = Boolean.FALSE;
            } else {
                try {
                    rbx rbxVar = sbx.d;
                    rbxVar.getClass();
                    b = rbxVar.b(z96.a, str);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (b == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                failure = (Boolean) b;
                Object obj = Boolean.FALSE;
                if (failure instanceof Result.Failure) {
                    failure = obj;
                }
            }
        }
        return ((Boolean) failure).booleanValue();
    }
}
