package defpackage;

import android.content.Context;
import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import com.yandex.quark.js.event.i;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Result;

/* loaded from: classes11.dex */
public abstract class hba1 {
    public static final Object a = new Object();
    public static volatile dy61 b;

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if ("0".equals(str) || "-1".equals(str)) {
                boolean z = ew71.a;
                return 0L;
            }
            boolean z2 = ew71.a;
            return 0L;
        }
    }

    public static final dy61 b(Context context) {
        dy61 dy61Var;
        dy61 dy61Var2 = b;
        if (dy61Var2 != null) {
            return dy61Var2;
        }
        synchronized (a) {
            dy61Var = b;
            if (dy61Var == null) {
                dy61Var = a8a1.j(hka1.a(context), context);
                b = dy61Var;
                dy61Var.a();
            }
        }
        return dy61Var;
    }

    public static String c(Map map) {
        String str;
        if (map == null || (str = (String) map.get("Content-Type")) == null) {
            return "ISO-8859-1";
        }
        String[] split = str.split(";", 0);
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=", 0);
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return "ISO-8859-1";
    }

    public static et81 d(gb81 gb81Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = gb81Var.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long a2 = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long a3 = str3 != null ? a(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        long a4 = str4 != null ? a(str4) : j;
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            j5 = (j2 * 1000) + currentTimeMillis;
            j4 = z ? j5 : (j3 * 1000) + j5;
        } else {
            j4 = (a2 <= j || a3 < a2) ? j : (a3 - a2) + currentTimeMillis;
            j5 = j4;
        }
        et81 et81Var = new et81();
        et81Var.a = gb81Var.b;
        et81Var.b = str5;
        et81Var.f = j5;
        et81Var.e = j4;
        et81Var.c = a2;
        et81Var.d = a4;
        et81Var.g = map;
        et81Var.h = gb81Var.d;
        return et81Var;
    }

    public static syj0 e(String str, String str2, zcx zcxVar) {
        Object failure;
        ndo ndoVar = (ndo) ((Map) i.c.getValue()).get(str);
        efo efoVar = efo.b;
        if (ndoVar != null && str.equals(ndoVar.a)) {
            try {
                failure = ndoVar.b.invoke(zcxVar, str2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            syj0 b2 = q5z.i0(failure).b(ndoVar.c);
            if (b2 instanceof lyj0) {
                return b2;
            }
            if (!(b2 instanceof jyj0)) {
                w511.b();
                return null;
            }
            String message = ((Throwable) ((jyj0) b2).a).getMessage();
            if (message == null) {
                message = "";
            }
            return new jyj0(new dfo(message));
        }
        return new jyj0(efoVar);
    }

    public static b1g0 f(w1g0 w1g0Var) {
        return new b1g0(w1g0Var);
    }

    public static w1g0 g(Context context) {
        w1g0 w1g0Var = new w1g0(context);
        if (w1g0Var.c()) {
            return w1g0Var;
        }
        synchronized (w1g0Var) {
            byte[] a2 = i6i0.a(16);
            EllipticCurves$CurveType ellipticCurves$CurveType = EllipticCurves$CurveType.NIST_P256;
            ECParameterSpec c = c5a1.c(ellipticCurves$CurveType);
            KeyPairGenerator keyPairGenerator = (KeyPairGenerator) s1o.e.a.n("EC");
            keyPairGenerator.initialize(c);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            w1g0Var.a.edit().putString("push_public_key", ew4.c(11, c5a1.e(ellipticCurves$CurveType, EllipticCurves$PointFormatType.UNCOMPRESSED, ((ECPublicKey) generateKeyPair.getPublic()).getW()))).putString("push_private_key", ew4.c(11, ((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray())).putString("push_auth_secret", ew4.c(11, a2)).apply();
        }
        return w1g0Var;
    }
}
