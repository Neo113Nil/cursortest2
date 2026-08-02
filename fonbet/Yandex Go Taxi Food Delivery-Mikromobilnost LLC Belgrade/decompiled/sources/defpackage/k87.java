package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.CAdES.EncryptionKeyAlgorithm;

/* loaded from: classes4.dex */
public class k87 extends o87 {
    public pm5 b(md6 md6Var, no6 no6Var) {
        c2 c2Var = new c2();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ex61 ex61Var = new ex61(no6Var, byteArrayOutputStream, (Cipher) no6Var.w);
            ex61Var.write((byte[]) md6Var.c);
            ex61Var.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            xr1 xr1Var = (xr1) no6Var.c;
            hd4 hd4Var = new hd4(byteArray, null);
            fv61 fv61Var = new fv61((SecretKey) no6Var.b, (EncryptionKeyAlgorithm) no6Var.y);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                c2Var.a(((ou61) it.next()).n(fv61Var));
            }
            szn sznVar = new szn((u2) md6Var.b, xr1Var, hd4Var);
            i87 i87Var = this.b;
            return new pm5(new ige(p87.b1, new s4o(new lqf(c2Var), sznVar, i87Var != null ? new rd4(i87Var.b(Collections.EMPTY_MAP).g(), false) : null)));
        } catch (IOException unused) {
            throw new CMSException("");
        }
    }
}
