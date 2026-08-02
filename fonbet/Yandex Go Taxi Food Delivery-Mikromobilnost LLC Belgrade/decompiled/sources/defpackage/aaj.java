package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class aaj implements w9j {
    public final jb7 a;
    public final wms b;
    public final wms c;

    public aaj(jb7 jb7Var) {
        wms wmsVar = udq0.b;
        this.a = jb7Var;
        if (((d630) jb7Var.w).a.isEmpty()) {
            this.b = wmsVar;
            this.c = wmsVar;
            return;
        }
        ny40 a = oy40.b().a();
        udq0.v(jb7Var);
        a.getClass();
        this.b = wmsVar;
        this.c = wmsVar;
    }

    @Override // defpackage.w9j
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        jb7 jb7Var = this.a;
        wms wmsVar = this.c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = jb7Var.j(copyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] a = ((w9j) ((p2f0) it.next()).b).a(copyOfRange, bArr2);
                    wmsVar.getClass();
                    return a;
                } catch (GeneralSecurityException e) {
                    baj.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = jb7Var.j(d6z.a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] a2 = ((w9j) ((p2f0) it2.next()).b).a(bArr, bArr2);
                wmsVar.getClass();
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        wmsVar.getClass();
        kbs.v("decryption failed");
        return null;
    }

    @Override // defpackage.w9j
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        wms wmsVar = this.b;
        p2f0 p2f0Var = (p2f0) this.a.c;
        try {
            byte[] bArr3 = p2f0Var.c;
            byte[] x = ffx.x(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((w9j) p2f0Var.b).b(bArr, bArr2));
            int i = p2f0Var.f;
            wmsVar.getClass();
            return x;
        } catch (GeneralSecurityException e) {
            wmsVar.getClass();
            throw e;
        }
    }
}
