package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes10.dex */
public abstract class pmy0 {
    public static final String a = cvu0.u(10, CA20Status.STATUS_CERTIFICATE_H);

    public static final long a(ety0 ety0Var, fwi fwiVar, dyr dyrVar, String str, int i) {
        gb2 c = t691.c(str, ety0Var, p8e.b(0, 0, 0, 0, 15), fwiVar, dyrVar, i, 64);
        return (jlb1.a(c.a.b()) << 32) | (jlb1.a(c.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }
}
