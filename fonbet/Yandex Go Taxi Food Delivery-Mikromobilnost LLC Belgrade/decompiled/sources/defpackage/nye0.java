package defpackage;

import java.security.MessageDigest;

/* loaded from: classes11.dex */
public final class nye0 implements m200 {
    public final jye0 a;
    public final int b;

    public nye0(jye0 jye0Var, int i) {
        this.a = jye0Var;
        this.b = i;
        if (i >= 10) {
            jye0Var.a(i, new byte[0]);
        } else {
            kbs.t("tag size too small, need at least 10 bytes");
            throw null;
        }
    }

    @Override // defpackage.m200
    public final void a(byte[] bArr, byte[] bArr2) {
        if (MessageDigest.isEqual(b(bArr2), bArr)) {
            return;
        }
        kbs.v("invalid MAC");
    }

    @Override // defpackage.m200
    public final byte[] b(byte[] bArr) {
        return this.a.a(this.b, bArr);
    }
}
