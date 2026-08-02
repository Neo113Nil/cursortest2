package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: DefaultHostnameVerifier.java */
/* loaded from: classes8.dex */
public final class dgz0 implements ahz0 {
    @Override // xsna.ahz0
    public final boolean verify(final String str, X509Certificate x509Certificate) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null ? false : subjectAlternativeNames.stream().filter(new ory0(1)).map(new pfz0()).anyMatch(new Predicate() { // from class: xsna.qfz0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str2 = (String) obj;
                    dgz0.this.getClass();
                    String str3 = str;
                    if (str3 == null || str2 == null || str3.trim().equals("") || str2.trim().equals("")) {
                        throw new IllegalArgumentException("can't be null or empty");
                    }
                    if (!str2.startsWith("*.")) {
                        return str3.equals(str2);
                    }
                    int indexOf = str3.indexOf(".");
                    return (indexOf > 0 && str3.substring(indexOf + 1).equals(str2.substring(2))) || str3.equals(str2.substring(2));
                }
            })) {
                return true;
            }
            return Arrays.stream(x509Certificate.getSubjectDN().getName().split(StringUtils.COMMA)).map(new cmy0(1)).filter(new pt30(1)).map(new rfz0()).allMatch(new Predicate() { // from class: xsna.sfz0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((String) obj).equals(str);
                }
            });
        } catch (CertificateParsingException unused) {
            return false;
        }
    }
}
