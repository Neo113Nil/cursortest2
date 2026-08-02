package defpackage;

import org.w3c.dom.Element;
import ru.CryptoPro.XAdES.cl_29;

/* loaded from: classes4.dex */
public final class hu61 extends xw61 {
    public du61 x;
    public rs61 y;

    public final du61 h() {
        Element f;
        if (this.x == null && (f = f("OCSPIdentifier")) != null) {
            du61 du61Var = new du61(f, this.b, this.c, this.w);
            du61Var.B = cl_29.a;
            this.x = du61Var;
        }
        return this.x;
    }
}
