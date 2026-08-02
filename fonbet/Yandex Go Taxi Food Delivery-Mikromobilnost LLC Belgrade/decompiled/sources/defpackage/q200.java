package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class q200 implements m200 {
    public final jb7 a;
    public final wms b;
    public final wms c;

    public q200(jb7 jb7Var) {
        wms wmsVar = udq0.b;
        this.a = jb7Var;
        if (((d630) jb7Var.w).a.isEmpty()) {
            this.b = wmsVar;
            this.c = wmsVar;
            return;
        }
        ny40 a = oy40.b.a();
        udq0.v(jb7Var);
        a.getClass();
        this.b = wmsVar;
        this.c = wmsVar;
    }

    @Override // defpackage.m200
    public final void a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        wms wmsVar = this.c;
        if (length <= 5) {
            wmsVar.getClass();
            kbs.v("tag too short");
            return;
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        jb7 jb7Var = this.a;
        for (p2f0 p2f0Var : jb7Var.j(copyOf)) {
            try {
                ((m200) p2f0Var.b).a(copyOfRange, p2f0Var.e.equals(OutputPrefixType.LEGACY) ? ffx.x(bArr2, r200.b) : bArr2);
                wmsVar.getClass();
                return;
            } catch (GeneralSecurityException e) {
                r200.a.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = jb7Var.j(d6z.a).iterator();
        while (it.hasNext()) {
            try {
                ((m200) ((p2f0) it.next()).b).a(bArr, bArr2);
                wmsVar.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        wmsVar.getClass();
        kbs.v("invalid MAC");
    }

    @Override // defpackage.m200
    public final byte[] b(byte[] bArr) {
        wms wmsVar = this.b;
        p2f0 p2f0Var = (p2f0) this.a.c;
        if (p2f0Var.e.equals(OutputPrefixType.LEGACY)) {
            bArr = ffx.x(bArr, r200.b);
        }
        try {
            byte[] bArr2 = p2f0Var.c;
            byte[] x = ffx.x(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((m200) p2f0Var.b).b(bArr));
            int i = p2f0Var.f;
            wmsVar.getClass();
            return x;
        } catch (GeneralSecurityException e) {
            wmsVar.getClass();
            throw e;
        }
    }
}
