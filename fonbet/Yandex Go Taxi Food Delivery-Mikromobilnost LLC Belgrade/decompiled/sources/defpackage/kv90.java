package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes9.dex */
public final class kv90 {
    public static lv90 a(e4a0 e4a0Var, String str, Boolean bool) {
        PaymentMethod$Type a = e4a0Var.a();
        return a == null ? lv90.g : new lv90(a, str, null, bool);
    }

    public static lv90 b(String str, PaymentMethod$Type paymentMethod$Type) {
        return new lv90(paymentMethod$Type, str, null, null);
    }

    public final KSerializer serializer() {
        return jv90.a;
    }
}
