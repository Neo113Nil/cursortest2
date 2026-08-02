package defpackage;

import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes10.dex */
public class apl0 {
    public final v9u a = new v9u(1000);
    public final jdj b = qh91.d(10, new egz());

    public final String a(khx khxVar) {
        String str;
        synchronized (this.a) {
            str = (String) this.a.c(khxVar);
        }
        if (str == null) {
            zol0 zol0Var = (zol0) this.b.a();
            try {
                khxVar.a(zol0Var.a);
                byte[] digest = zol0Var.a.digest();
                char[] cArr = pw21.b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i];
                        int i2 = i * 2;
                        char[] cArr2 = pw21.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & PKIBody._CCP];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.a0(zol0Var);
            }
        }
        synchronized (this.a) {
            this.a.f(khxVar, str);
        }
        return str;
    }
}
