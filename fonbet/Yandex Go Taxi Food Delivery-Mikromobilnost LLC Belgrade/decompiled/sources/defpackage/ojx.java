package defpackage;

import java.security.PrivateKey;
import ru.CryptoPro.CAdES.envelope.EnvelopedOptions;

/* loaded from: classes4.dex */
public final class ojx extends ogi0 {
    public njx e;

    @Override // defpackage.ogi0
    public final w40 b(jgi0 jgi0Var) {
        rt61 rt61Var = (rt61) jgi0Var;
        byte[] bArr = this.e.w.a;
        return new w40(new a441((PrivateKey) rt61Var.b, this.b, this.c, bArr, (nr41) rt61Var.c, (EnvelopedOptions) rt61Var.w));
    }
}
