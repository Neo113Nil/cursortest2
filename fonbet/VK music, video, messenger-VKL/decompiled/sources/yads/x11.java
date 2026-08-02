package yads;

import com.ironsource.B5;
import com.ironsource.C4217a2;
import com.mbridge.msdk.foundation.download.Command;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes10.dex */
public abstract class x11 {
    public static lr a(g92 g92Var) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = g92Var.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long a = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(StringUtils.COMMA, 0);
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
        long a2 = str3 != null ? a(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? a(str4) : j;
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (i != 0) {
            j5 = (j2 * 1000) + currentTimeMillis;
            j4 = z ? j5 : (j3 * 1000) + j5;
        } else {
            j4 = (a <= j || a2 < a) ? j : (a2 - a) + currentTimeMillis;
            j5 = j4;
        }
        lr lrVar = new lr();
        lrVar.a = g92Var.b;
        lrVar.b = str5;
        lrVar.f = j5;
        lrVar.e = j4;
        lrVar.c = a;
        lrVar.d = a3;
        lrVar.g = map;
        lrVar.h = g92Var.d;
        return lrVar;
    }

    public static String a(Map map) {
        String str;
        if (map == null || (str = (String) map.get("Content-Type")) == null) {
            return "ISO-8859-1";
        }
        String[] split = str.split(";", 0);
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=", 0);
            if (split2.length == 2 && split2[0].equals(B5.N)) {
                return split2[1];
            }
        }
        return "ISO-8859-1";
    }

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!"0".equals(str) && !C4217a2.f.equals(str)) {
                boolean z = pn3.a;
                return 0L;
            }
            boolean z2 = pn3.a;
            return 0L;
        }
    }
}
