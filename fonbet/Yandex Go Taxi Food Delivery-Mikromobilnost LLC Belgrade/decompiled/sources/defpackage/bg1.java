package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.gson.JsonIOException;
import io.appmetrica.analytics.AppMetrica;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.KeyUsage;
import ru.CryptoPro.reprov.x509.NetscapeCertTypeExtension;
import ru.CryptoPro.sspiSSL.pc_3.cl_7;
import ru.yandex.logistics.care.ui.l;

/* loaded from: classes4.dex */
public final class bg1 implements dwa0, av41, fp60, b8x, b52, mvo {
    public static final bg1 A;
    public static final bg1 B;
    public static final bg1 C;
    public static final bg1 D;
    public static final bg1 E;
    public static final bg1 F;
    public static final bg1 G;
    public static final bg1 c;
    public static final bg1 w;
    public static final bg1 x;
    public static final bg1 y;
    public static final bg1 z;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i = 0;
        c = new bg1("TINK", i);
        w = new bg1("CRUNCHY", i);
        x = new bg1("NO_PREFIX", i);
        int i2 = 1;
        y = new bg1("TINK", i2);
        z = new bg1("CRUNCHY", i2);
        A = new bg1("NO_PREFIX", i2);
        int i3 = 2;
        B = new bg1("FLAT", i3);
        C = new bg1("HALF_OPENED", i3);
        int i4 = 3;
        D = new bg1("TINK", i4);
        E = new bg1("CRUNCHY", i4);
        F = new bg1("LEGACY", i4);
        G = new bg1("NO_PREFIX", i4);
    }

    public bg1(String str, String str2, String str3, String str4) {
        int length;
        int i;
        this.a = 17;
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        sb.append('.');
        sb.append(str3);
        g8e.D(sb, " go-platform/0.7.0 Android/", str4, Extension.O_BRAKE_SPACE, str5);
        String r = g8e.r(sb, Extension.SEMICOLON_SPACE, str6, Extension.C_BRAKE_SPACE, "");
        try {
            length = r.length();
            i = 0;
        } catch (Exception e) {
            Log.e("UserAgent", "Exception while ascii-sing User-Agent", e);
        }
        while (i < length) {
            int codePointAt = r.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                yp6 yp6Var = new yp6();
                try {
                    yp6Var.w0(0, i, r);
                    yp6Var.z0(63);
                    int charCount = Character.charCount(codePointAt);
                    while (true) {
                        i += charCount;
                        if (i >= length) {
                            break;
                        }
                        int codePointAt2 = r.codePointAt(i);
                        yp6Var.z0((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                        charCount = Character.charCount(codePointAt2);
                    }
                    r = yp6Var.I0();
                    this.b = r;
                } finally {
                }
            } else {
                i += Character.charCount(codePointAt);
            }
        }
        this.b = r;
    }

    public static void j(Set set) {
        set.remove("2.5.29.19");
        set.remove("2.5.29.17");
        if (set.isEmpty()) {
            return;
        }
        throw new CertificateException("Certificate contains unsupported critical extensions: " + set);
    }

    public static boolean k(String str, X509Certificate x509Certificate) {
        List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        return extendedKeyUsage == null || extendedKeyUsage.contains(str) || extendedKeyUsage.contains("2.5.29.37.0");
    }

    @Override // defpackage.b52
    public String a() {
        return this.b;
    }

    @Override // defpackage.b8x
    public AlgorithmParameters b(String str) {
        return AlgorithmParameters.getInstance(str, this.b);
    }

    @Override // defpackage.b8x
    public MessageDigest c(String str) {
        return MessageDigest.getInstance(str, this.b);
    }

    @Override // defpackage.mvo
    public b231 d(Map map) {
        return new ouu0(this.b);
    }

    @Override // defpackage.b8x
    public KeyFactory e() {
        return KeyFactory.getInstance("DSA", this.b);
    }

    @Override // defpackage.dwa0
    public String f() {
        return this.b;
    }

    @Override // defpackage.b8x
    public Signature g(String str) {
        return Signature.getInstance(str, this.b);
    }

    @Override // defpackage.av41
    public String getUserAgent() {
        return this.b;
    }

    public void h(X509Certificate x509Certificate, Set set) {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null && (keyUsage.length <= 0 || !keyUsage[0])) {
            throw new cl_7("KeyUsage does not allow digital signatures", "End entity certificate extension check failed", x509Certificate);
        }
        if (!k(KeyUsage.STR_OID_PKIX_CODE_SIGNING, x509Certificate)) {
            throw new cl_7("Extended key usage does not permit use for code signing", "End entity certificate extension check failed", x509Certificate);
        }
        if (!this.b.equals("jce signing")) {
            if (!xv61.e(NetscapeCertTypeExtension.OBJECT_SIGNING, x509Certificate)) {
                throw new cl_7("Netscape cert type does not permit use for code signing", "End entity certificate extension check failed", x509Certificate);
            }
            set.remove("2.16.840.1.113730.1.1");
        }
        set.remove(AdESUtility.KEY_USAGE);
        set.remove(AdESUtility.EXTENDED_KEY_USAGE);
        j(set);
    }

    @Override // defpackage.fp60
    public Object i() {
        throw new JsonIOException(this.b);
    }

    public mf1 l() {
        if (this.b != null) {
            return new mf1(this);
        }
        ny61.g("Product type must be set");
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bg1(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public bg1(String str) {
        this.a = 13;
        List g = scc.g("city", str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            String str2 = (String) obj;
            if (str2 != null && !evu0.J(str2)) {
                arrayList.add(obj);
            }
        }
        this.b = a.X(arrayList, ":", null, null, null, 62);
    }

    public bg1(Context context) {
        this.a = 11;
        this.b = AppMetrica.getDeviceId(context);
    }

    public bg1(gff gffVar) {
        this.a = 14;
        this.b = gffVar.f;
    }

    public bg1(l lVar) {
        this.a = 5;
        this.b = lVar.c.a.f;
    }
}
