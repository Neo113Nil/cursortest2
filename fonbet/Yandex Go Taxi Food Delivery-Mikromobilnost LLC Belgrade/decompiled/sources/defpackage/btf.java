package defpackage;

import com.yandex.payment.divkit.usecases.h;

/* loaded from: classes2.dex */
public final class btf implements hs31 {
    public final h a;
    public final rwo b;

    public btf(h hVar, rwo rwoVar) {
        this.a = hVar;
        this.b = rwoVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        if (cls.equals(edy.class)) {
            return new edy(this.a, this.b);
        }
        ny61.r("Unknown view model");
        return null;
    }
}
