package defpackage;

import java.io.OutputStream;
import java.util.Iterator;
import javax.crypto.SecretKey;
import ru.CryptoPro.CAdES.EncryptionKeyAlgorithm;

/* loaded from: classes4.dex */
public class n87 extends o87 {
    public final m87 b(OutputStream outputStream, no6 no6Var) {
        u2 u2Var = new u2(p87.Z0.a);
        c2 c2Var = new c2();
        fv61 fv61Var = new fv61((SecretKey) no6Var.b, (EncryptionKeyAlgorithm) no6Var.y);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            c2Var.a(((ou61) it.next()).n(fv61Var));
        }
        jd4 jd4Var = new jd4(outputStream);
        jd4Var.a(p87.b1);
        jd4 jd4Var2 = new jd4(outputStream, 0);
        (this.b != null ? new l2(s4o.m(new zvf(c2Var), new zvf())) : new l2(s4o.m(new zvf(c2Var), null))).encodeTo(outputStream);
        outputStream.write(new lqf(c2Var).getEncoded());
        jd4 jd4Var3 = new jd4(outputStream);
        u2Var.encodeTo(outputStream);
        outputStream.write(((xr1) no6Var.c).getEncoded());
        return new m87(this, no6Var, b97.b(outputStream, false), jd4Var, jd4Var2, jd4Var3);
    }
}
