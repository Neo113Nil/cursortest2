package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.div.state.db.StateEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes4.dex */
public abstract class orb1 {
    public static int a(int i, String str, boolean z, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String b(int i, Context context) {
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static final boolean c(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f3 - f) > f5 || Math.abs(f4 - f2) > f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0195, code lost:
    
        if (defpackage.wf61.a.h(r0) == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List d(kwu kwuVar, meu meuVar) {
        ane aneVar;
        kwu kwuVar2;
        long j;
        List g = meuVar.g("Set-Cookie");
        int size = g.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            String str = (String) g.get(i);
            long currentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int f = yf61.f(str, ';', 0, 0, 6);
            char c2 = '=';
            int f2 = yf61.f(str, '=', 0, f, 2);
            if (f2 != f) {
                String q = yf61.q(0, f2, str);
                if (q.length() != 0 && yf61.h(q) == -1) {
                    String q2 = yf61.q(f2 + 1, f, str);
                    if (yf61.h(q2) == -1) {
                        int i2 = f + 1;
                        int length = str.length();
                        boolean z = false;
                        boolean z2 = false;
                        long j2 = -1;
                        long j3 = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        String str4 = null;
                        boolean z3 = true;
                        boolean z4 = false;
                        while (true) {
                            long j4 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                            if (i2 < length) {
                                int e = yf61.e(str, c, i2, length);
                                int e2 = yf61.e(str, c2, i2, e);
                                String q3 = yf61.q(i2, e2, str);
                                String q4 = e2 < e ? yf61.q(e2 + 1, e, str) : "";
                                if (q3.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = e(q4.length(), q4);
                                        z2 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i2 = e + 1;
                                    c = ';';
                                    c2 = '=';
                                } else if (q3.equalsIgnoreCase("max-age")) {
                                    try {
                                        j2 = Long.parseLong(q4);
                                        if (j2 <= 0) {
                                            j2 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e3) {
                                        if (!new Regex("-?\\d+").h(q4)) {
                                            throw e3;
                                        }
                                        if (cvu0.x(q4, "-", false)) {
                                            j4 = Long.MIN_VALUE;
                                        }
                                        j2 = j4;
                                    }
                                    z2 = true;
                                    i2 = e + 1;
                                    c = ';';
                                    c2 = '=';
                                } else {
                                    if (q3.equalsIgnoreCase("domain")) {
                                        if (cvu0.s(q4, Extension.DOT_CHAR, false)) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String b = wf61.b(evu0.Q(Extension.DOT_CHAR, q4));
                                        if (b == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = b;
                                        z3 = false;
                                    } else if (q3.equalsIgnoreCase(StateEntry.COLUMN_PATH)) {
                                        str2 = q4;
                                    } else if (q3.equalsIgnoreCase("secure")) {
                                        z4 = true;
                                    } else if (q3.equalsIgnoreCase("httponly")) {
                                        z = true;
                                    } else if (q3.equalsIgnoreCase("samesite")) {
                                        str4 = q4;
                                    }
                                    i2 = e + 1;
                                    c = ';';
                                    c2 = '=';
                                }
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    kwuVar2 = kwuVar;
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    if (j2 <= 9223372036854775L) {
                                        j4 = j2 * 1000;
                                    }
                                    j = currentTimeMillis + j4;
                                    if (j < currentTimeMillis || j > 253402300799999L) {
                                        kwuVar2 = kwuVar;
                                        j = 253402300799999L;
                                    } else {
                                        kwuVar2 = kwuVar;
                                    }
                                } else {
                                    kwuVar2 = kwuVar;
                                    j = j3;
                                }
                                String str5 = kwuVar2.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!jl40.l(str5, str3)) {
                                    if (cvu0.s(str5, str3, false)) {
                                        if (str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        }
                                    }
                                    aneVar = null;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.d.a(str3) != null) {
                                    if (str2 == null || !cvu0.x(str2, "/", false)) {
                                        String b2 = kwuVar2.b();
                                        int K = evu0.K(b2, '/', 0, 6);
                                        str2 = K != 0 ? b2.substring(0, K) : "/";
                                    }
                                    aneVar = new ane(z4, q, q2, str3, str2, str4, j, z, z2, z3);
                                }
                                aneVar = null;
                            }
                        }
                        if (aneVar != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(aneVar);
                        }
                    }
                }
            }
            aneVar = null;
            if (aneVar != null) {
            }
        }
        List unmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
        return unmodifiableList == null ? EmptyList.a : unmodifiableList;
    }

    public static long e(int i, String str) {
        int a = a(0, str, false, i);
        Matcher matcher = ane.n.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (a < i) {
            int a2 = a(a + 1, str, true, i);
            matcher.region(a, a2);
            if (i3 == -1 && matcher.usePattern(ane.n).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(ane.m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else {
                if (i5 == -1) {
                    Pattern pattern = ane.l;
                    if (matcher.usePattern(pattern).matches()) {
                        i5 = evu0.H(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(ane.k).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            }
            a = a(a2 + 1, str, false, i);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            ny61.g("Failed requirement.");
            return 0L;
        }
        if (i5 == -1) {
            ny61.g("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            ny61.g("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            ny61.g("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            ny61.g("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            ny61.g("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(bg61.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
