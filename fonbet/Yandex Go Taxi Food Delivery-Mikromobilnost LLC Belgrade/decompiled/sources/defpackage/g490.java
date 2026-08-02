package defpackage;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRL;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class g490 implements blq0 {
    public final CRLSelector a;
    public final boolean b;
    public final BigInteger c;
    public final byte[] w;
    public final boolean x;

    public g490(h0j h0jVar) {
        this.a = (CRLSelector) h0jVar.c;
        this.b = h0jVar.a;
        this.c = (BigInteger) h0jVar.d;
        this.w = (byte[]) h0jVar.e;
        this.x = h0jVar.b;
    }

    public final Object clone() {
        return this;
    }

    @Override // defpackage.blq0
    /* renamed from: match, reason: merged with bridge method [inline-methods] */
    public final boolean Q0(CRL crl) {
        BigInteger bigInteger;
        boolean z = crl instanceof X509CRL;
        CRLSelector cRLSelector = this.a;
        if (!z) {
            return cRLSelector.match(crl);
        }
        X509CRL x509crl = (X509CRL) crl;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(ayo.E.a);
            l2 u = extensionValue != null ? l2.u(w2.x(extensionValue).a) : null;
            if (this.b && u != null) {
                return false;
            }
            if (u != null && (bigInteger = this.c) != null && new BigInteger(1, u.a).compareTo(bigInteger) == 1) {
                return false;
            }
            if (this.x) {
                byte[] extensionValue2 = x509crl.getExtensionValue(ayo.F.a);
                byte[] bArr = this.w;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!Arrays.equals(extensionValue2, bArr)) {
                    return false;
                }
            }
            return cRLSelector.match(crl);
        } catch (Exception unused) {
            return false;
        }
    }
}
