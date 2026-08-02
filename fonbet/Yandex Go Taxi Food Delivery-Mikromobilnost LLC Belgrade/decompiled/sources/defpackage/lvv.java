package defpackage;

import com.yandex.fintechsdk.data.payment.method.api.model.CardBindingCurrency;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes12.dex */
public final class lvv {
    public static final kvv Companion = new kvv();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new smv(23))};
    public final CardBindingCurrency a;

    public /* synthetic */ lvv(int i, CardBindingCurrency cardBindingCurrency) {
        if (1 == (i & 1)) {
            this.a = cardBindingCurrency;
        } else {
            qje.Z(i, 1, jvv.a.getDescriptor());
            throw null;
        }
    }

    public lvv(CardBindingCurrency cardBindingCurrency) {
        this.a = cardBindingCurrency;
    }
}
