package com.yandex.passport.internal.sso;

import android.content.pm.Signature;
import android.util.Base64;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.entities.o;
import defpackage.j73;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uw51;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.reprov.x509.X500Principal;

/* loaded from: classes4.dex */
public final class c {
    public final String a;
    public final o b;
    public final o c;
    public final Map d;
    public final int e;
    public final X509Certificate f;

    public c(String str, o oVar, o oVar2, Map map, int i, X509Certificate x509Certificate) {
        this.a = str;
        this.b = oVar;
        this.c = oVar2;
        this.d = map;
        this.e = i;
        this.f = x509Certificate;
    }

    public final String a() {
        return this.a;
    }

    public final o b() {
        return this.c;
    }

    public final X509Certificate c() {
        return this.f;
    }

    public final boolean d(X509Certificate x509Certificate, tls tlsVar) {
        boolean equals;
        CertPathValidatorResult certPathValidatorResult;
        byte[] bArr;
        boolean equals2;
        o oVar = this.c;
        boolean c = oVar.c();
        o oVar2 = this.b;
        if ((c && !oVar2.b()) || (oVar.b() && oVar2.b())) {
            return true;
        }
        Map map = this.d;
        String str = this.a;
        String str2 = (String) map.get(str);
        if (str2 == null) {
            equals = false;
        } else {
            equals = Arrays.equals(oVar.a(), Base64.decode(str2, 0));
        }
        if (!equals) {
            if (map.isEmpty()) {
                String str3 = (String) o.h.get(str);
                if (str3 == null) {
                    equals2 = false;
                } else {
                    equals2 = Arrays.equals(oVar.a(), Base64.decode(str3, 0));
                }
                if (equals2) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isTrusted: true, reason: isSsoEnabledByFingerPrint()", 8);
                        return true;
                    }
                }
            }
            X509Certificate x509Certificate2 = this.f;
            if (x509Certificate2 == null) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isTrusted: false, reason: ssoCertificate=null", 8);
                    return false;
                }
            } else {
                String name = x509Certificate2.getSubjectX500Principal().getName(X500Principal.RFC2253);
                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    uw51.w("checkCN: ", name, LogLevel.DEBUG, null, 8);
                }
                if (("CN=" + str).equals(name)) {
                    try {
                        CertPath generateCertPath = CertificateFactory.getInstance("X509").generateCertPath(Collections.singletonList(x509Certificate2));
                        PKIXParameters pKIXParameters = new PKIXParameters((Set<TrustAnchor>) Collections.singleton(new TrustAnchor(x509Certificate, null)));
                        pKIXParameters.setRevocationEnabled(false);
                        certPathValidatorResult = CertPathValidator.getInstance("PKIX").validate(generateCertPath, pKIXParameters);
                    } catch (GeneralSecurityException e) {
                        tlsVar.invoke(e);
                        certPathValidatorResult = null;
                    }
                    if (certPathValidatorResult == null) {
                        com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isTrusted=false, reason=verifyCertificate", 8);
                        }
                    } else {
                        PublicKey publicKey = x509Certificate2.getPublicKey();
                        MessageDigest messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA256);
                        byte[] digest = messageDigest.digest(publicKey.getEncoded());
                        List A = j73.A(oVar.b);
                        ArrayList arrayList = new ArrayList(tcc.n(A, 10));
                        Iterator it = A.iterator();
                        while (it.hasNext()) {
                            arrayList.add((X509Certificate) CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(((Signature) it.next()).toByteArray())));
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                bArr = null;
                                break;
                            }
                            bArr = messageDigest.digest(((X509Certificate) it2.next()).getPublicKey().getEncoded());
                            if (Arrays.equals(bArr, digest)) {
                                break;
                            }
                        }
                        if (bArr == null) {
                            com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isTrusted=false, reason=checkPublicKey", 8);
                            }
                        }
                    }
                } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isTrusted=false, reason=checkPackageName", 8);
                    return false;
                }
            }
            return false;
        }
        com.yandex.passport.common.logger.c cVar6 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isTrusted: true, reason: isEnabledByConfig()", 8);
            return true;
        }
        return true;
    }
}
