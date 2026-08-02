package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public abstract class lea0 implements u0k {
    public abstract String b();

    public abstract PaymentMethod$Type c();

    public final boolean d() {
        return b() != null;
    }

    public final boolean e() {
        return !d();
    }

    public abstract String getId();
}
