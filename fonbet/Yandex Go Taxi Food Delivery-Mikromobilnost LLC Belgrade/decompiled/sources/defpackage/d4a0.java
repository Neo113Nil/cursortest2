package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;

@gsq0
/* loaded from: classes5.dex */
public final class d4a0 {
    public static final x3a0 Companion = new x3a0();
    public static final i3y[] f = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(26)), null, null, null};
    public final String a;
    public final PaymentMethodType b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ d4a0(int i, String str, PaymentMethodType paymentMethodType, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, u3a0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = paymentMethodType;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public d4a0(String str, PaymentMethodType paymentMethodType, String str2, String str3, String str4) {
        this.a = str;
        this.b = paymentMethodType;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
