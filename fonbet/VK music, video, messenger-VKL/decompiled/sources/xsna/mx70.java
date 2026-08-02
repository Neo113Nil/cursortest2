package xsna;

import com.vk.dto.common.ImageSizeKey;
import io.jsonwebtoken.JwtParser;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;

/* compiled from: OkHostnameVerifier.kt */
/* loaded from: classes11.dex */
public final class mx70 implements HostnameVerifier {
    public static final mx70 b = new mx70();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && epx.f(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.b;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (str.length() == ((int) s1v.s(str))) {
            try {
                return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:1: B:26:0x006b->B:56:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean verify(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        if (x2r0.g.f(str)) {
            String d = m9u0.d(str);
            List a = a(x509Certificate, 7);
            if (!(a instanceof Collection) || !a.isEmpty()) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    if (epx.f(d, m9u0.d((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (str.length() == ((int) s1v.s(str))) {
            str = str.toLowerCase(Locale.US);
        }
        List<String> a2 = a(x509Certificate, 2);
        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
            for (String str2 : a2) {
                if (str.length() != 0 && !brm0.B(str, ".", false) && !brm0.v(str, "..", false) && str2 != null && str2.length() != 0 && !brm0.B(str2, ".", false) && !brm0.v(str2, "..", false)) {
                    String concat = !brm0.v(str, ".", false) ? str.concat(".") : str;
                    if (!brm0.v(str2, ".", false)) {
                        str2 = str2.concat(".");
                    }
                    if (str2.length() == ((int) s1v.s(str2))) {
                        str2 = str2.toLowerCase(Locale.US);
                    }
                    if (!drm0.D(str2, "*", false)) {
                        z = epx.f(concat, str2);
                    } else if (brm0.B(str2, "*.", false) && drm0.L(str2, ImageSizeKey.SIZE_KEY_BASE, 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        if (brm0.v(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || drm0.P(concat, JwtParser.SEPARATOR_CHAR, length - 1, 4) == -1)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        return false;
    }
}
