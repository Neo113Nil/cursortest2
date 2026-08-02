package defpackage;

import org.bouncycastle.cert.X509CRLHolder;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.CAdES.exception.CAdESException;

/* loaded from: classes4.dex */
public class jw61 {
    public static final u2 a = ro60.a;

    public static a2 a(Object obj) {
        if (obj instanceof m79) {
            return (a2) obj;
        }
        if (obj instanceof X509CRLHolder) {
            return ((X509CRLHolder) obj).a;
        }
        boolean z = obj instanceof s3;
        u2 u2Var = a;
        if (!z) {
            return new oqf(2, 128, 1, new mr80(u2Var, (a2) obj), 0);
        }
        s3 A = s3.A(obj);
        if (A.c != 1) {
            throw new CAdESException("Unknown OtherRevocationInfoFormat tag.", IAdESException.ecRevocationCRLNotSuitable);
        }
        mr80 m = mr80.m((i3) i3.b.Hg(A, false));
        u2 u2Var2 = m.a;
        if (u2Var2 == null || u2Var2.q(u2Var)) {
            if (m.b instanceof he5) {
                return (a2) obj;
            }
            throw new CAdESException("Invalid OtherRevocationInfoFormat data, only  basic OCSP response is allowed.", IAdESException.ecRevocationCRLNotSuitable);
        }
        throw new CAdESException("Invalid OtherRevocationInfoFormat type, only " + u2Var + " is allowed.", IAdESException.ecRevocationCRLNotSuitable);
    }
}
