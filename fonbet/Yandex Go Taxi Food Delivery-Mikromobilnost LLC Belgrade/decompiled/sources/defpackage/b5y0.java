package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b5y0 implements d5y0 {
    public final String a;
    public final Preorder b;

    public b5y0(String str, Preorder preorder) {
        this.a = str;
        this.b = preorder;
    }

    @Override // defpackage.d5y0
    public final String a() {
        return this.a;
    }

    public final Preorder b() {
        return this.b;
    }

    public final String toString() {
        return oyr.p("CreateOrder(reason=", this.a, Extension.C_BRAKE);
    }
}
