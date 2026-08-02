package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.CAdES.EncryptionKeyAlgorithm;

/* loaded from: classes4.dex */
public final class lq6 extends k87 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    @Override // defpackage.o87
    public final void a(ou61 ou61Var) {
        this.d.add(ou61Var);
    }

    @Override // defpackage.k87
    public final pm5 b(md6 md6Var, no6 no6Var) {
        rd4 rd4Var = null;
        if (!this.c.isEmpty()) {
            ny61.r("can only use addRecipientGenerator() with this method.");
            return null;
        }
        c2 c2Var = new c2();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ex61 ex61Var = new ex61(no6Var, byteArrayOutputStream, (Cipher) no6Var.w);
            ex61Var.write((byte[]) md6Var.c);
            ex61Var.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            xr1 xr1Var = (xr1) no6Var.c;
            dqf dqfVar = new dqf(byteArray);
            fv61 fv61Var = new fv61((SecretKey) no6Var.b, (EncryptionKeyAlgorithm) no6Var.y);
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    c2Var.a(((ou61) it.next()).n(fv61Var));
                }
                u2 u2Var = (u2) md6Var.b;
                mq6 mq6Var = new mq6(u2Var, xr1Var, dqfVar);
                mq6Var.w = u2Var;
                mq6Var.x = xr1Var;
                mq6Var.y = dqfVar;
                i87 i87Var = this.b;
                if ((i87Var instanceof et61) && ((et61) i87Var).b) {
                    rd4Var = new rd4(((et61) i87Var).b(new HashMap()).g(), false);
                }
                pm5 pm5Var = new pm5(new ige(p87.b1, new s4o(new lqf(c2Var), mq6Var, rd4Var)));
                try {
                    fv61Var.destroy();
                } catch (DestroyFailedException unused) {
                }
                return pm5Var;
            } catch (Throwable th) {
                try {
                    fv61Var.destroy();
                } catch (DestroyFailedException unused2) {
                }
                throw th;
            }
        } catch (IOException unused3) {
            throw new CMSException("");
        }
    }
}
