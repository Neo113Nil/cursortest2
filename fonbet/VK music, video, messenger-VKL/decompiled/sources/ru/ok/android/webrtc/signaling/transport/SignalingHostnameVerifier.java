package ru.ok.android.webrtc.signaling.transport;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.brm0;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.gzs;
import xsna.j5g;
import xsna.n6j;

/* loaded from: classes9.dex */
public final class SignalingHostnameVerifier implements SignalingTransport.HostnameVerifier {

    @Deprecated
    public static final int SA_NAME_TYPE_DNS_NAME = 2;
    public final gzs a;
    public final gzs b;

    public SignalingHostnameVerifier(gzs<String> gzsVar, gzs<? extends List<String>> gzsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
    }

    public static boolean a(String str, Principal principal) {
        Collection collection;
        if (principal != null) {
            List a = n6j.a(0, StringUtils.COMMA, principal.getName());
            if (!a.isEmpty()) {
                ListIterator listIterator = a.listIterator(a.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = j5g.H0(a, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.b;
            Object[] array = collection.toArray(new String[0]);
            ArrayList arrayList = new ArrayList(array.length);
            for (Object obj : array) {
                arrayList.add(drm0.p0((String) obj).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (brm0.B((String) obj2, "CN=", false)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                arrayList3.add(brm0.y((String) obj3, "CN=", ""));
            }
            if (!arrayList3.isEmpty()) {
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj4 = arrayList3.get(i3);
                    i3++;
                    if (a(str, (String) obj4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        if (str == null) {
            return false;
        }
        String str2 = (String) this.a.invoke();
        List list = (List) this.b.invoke();
        return (str2 == null || (!str.equals(str2) && (list == null || !list.contains(str)))) ? HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession) : HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, sSLSession);
    }

    @Override // ru.ok.android.webrtc.signaling.transport.SignalingTransport.HostnameVerifier
    public boolean verify(String str, X509Certificate x509Certificate) {
        if (str != null && x509Certificate != null) {
            String str2 = (String) this.a.invoke();
            List list = (List) this.b.invoke();
            if (str2 != null && (str.equals(str2) || (list != null && list.contains(str)))) {
                try {
                    if (!a(str2, x509Certificate.getSubjectAlternativeNames())) {
                        if (!a(str2, x509Certificate.getSubjectDN())) {
                            return false;
                        }
                    }
                    return true;
                } catch (CertificateParsingException unused) {
                    return false;
                }
            }
            try {
                if (!a(str, x509Certificate.getSubjectAlternativeNames())) {
                    if (!a(str, x509Certificate.getSubjectDN())) {
                        return false;
                    }
                }
                return true;
            } catch (CertificateParsingException unused2) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        int i;
        if (str.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (brm0.B(str2, "*.", false) && str2.length() > 2) {
            int K = drm0.K(0, 6, str, ".", false);
            if (K <= 0 || (i = K + 1) >= str.length() || !str.substring(i).equals(str2.substring(2))) {
                return str.equals(str2.substring(2));
            }
            return true;
        }
        return str.equals(str2);
    }

    public static boolean a(String str, Collection collection) {
        if (collection == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            List list = (List) obj;
            if (list != null && list.size() == 2 && epx.f(list.get(0), 2)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            List list2 = (List) obj2;
            Object obj3 = list2 != null ? list2.get(1) : null;
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj4 = arrayList2.get(i2);
            i2++;
            if (a(str, (String) obj4)) {
                return true;
            }
        }
        return false;
    }
}
