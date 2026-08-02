package xsna;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: HttpCacheStrategy.kt */
/* loaded from: classes2.dex */
public final class tiv {
    public static final a c = new a();
    public static final String[] d;
    public static final DateFormat[] e;
    public final okhttp3.p a;
    public final okhttp3.u b;

    /* compiled from: HttpCacheStrategy.kt */
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(x2r0.f);
            return simpleDateFormat;
        }
    }

    /* compiled from: HttpCacheStrategy.kt */
    public static final class b {
        public static final Date a(String str) {
            a aVar = tiv.c;
            if (str.length() == 0) {
                return null;
            }
            ParsePosition parsePosition = new ParsePosition(0);
            DateFormat dateFormat = tiv.c.get();
            Date parse = dateFormat != null ? dateFormat.parse(str, parsePosition) : null;
            if (parsePosition.getIndex() == str.length()) {
                return parse;
            }
            String[] strArr = tiv.d;
            synchronized (strArr) {
                try {
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        DateFormat[] dateFormatArr = tiv.e;
                        DateFormat dateFormat2 = dateFormatArr[i];
                        if (dateFormat2 == null) {
                            dateFormat2 = new SimpleDateFormat(tiv.d[i], Locale.US);
                            dateFormat2.setTimeZone(x2r0.f);
                            dateFormatArr[i] = dateFormat2;
                        }
                        parsePosition.setIndex(0);
                        Date parse2 = dateFormat2.parse(str, parsePosition);
                        if (parsePosition.getIndex() != 0) {
                            return parse2;
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static boolean b(okhttp3.p pVar, okhttp3.u uVar) {
            int i = uVar.e;
            if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
                if (i != 307) {
                    if (i != 308 && i != 404 && i != 405) {
                        switch (i) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                String a = uVar.g.a("Expires");
                if (a == null) {
                    a = null;
                }
                if (a == null && uVar.n().c == -1 && !uVar.n().f && !uVar.n().e) {
                    return false;
                }
            }
            return (uVar.n().b || pVar.a().b) ? false : true;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        d = strArr;
        e = new DateFormat[strArr.length];
    }

    public tiv(okhttp3.p pVar, okhttp3.u uVar) {
        this.a = pVar;
        this.b = uVar;
    }
}
