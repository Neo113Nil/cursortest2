package xsna;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class k901 extends dd01 {
    public char f;
    public long g;
    public String h;
    public final i901 i;
    public final i901 j;
    public final i901 k;
    public final i901 l;
    public final i901 m;
    public final i901 n;
    public final i901 o;
    public final i901 p;
    public final i901 q;

    public k901(mb01 mb01Var) {
        super(mb01Var);
        this.f = (char) 0;
        this.g = -1L;
        this.i = new i901(this, 6, false, false);
        this.j = new i901(this, 6, true, false);
        this.k = new i901(this, 6, false, true);
        this.l = new i901(this, 5, false, false);
        this.m = new i901(this, 5, true, false);
        this.n = new i901(this, 5, false, true);
        this.o = new i901(this, 4, false, false);
        this.p = new i901(this, 3, false, false);
        this.q = new i901(this, 2, false, false);
    }

    public static j901 r(String str) {
        if (str == null) {
            return null;
        }
        return new j901(str);
    }

    public static String s(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String t = t(obj, z);
        String t2 = t(obj2, z);
        String t3 = t(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(t)) {
            sb.append(str2);
            sb.append(t);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(t2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(t2);
        }
        if (!TextUtils.isEmpty(t3)) {
            sb.append(str3);
            sb.append(t3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    public static String t(Object obj, boolean z) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            String str = obj.toString().charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof j901 ? ((j901) obj).a : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = mb01.class.getCanonicalName();
        if (TextUtils.isEmpty(canonicalName)) {
            canonicalName = "";
        } else {
            int lastIndexOf = canonicalName.lastIndexOf(46);
            if (lastIndexOf != -1) {
                canonicalName = canonicalName.substring(0, lastIndexOf);
            }
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (TextUtils.isEmpty(className)) {
                    className = "";
                } else {
                    int lastIndexOf2 = className.lastIndexOf(46);
                    if (lastIndexOf2 != -1) {
                        className = className.substring(0, lastIndexOf2);
                    }
                }
                if (className.equals(canonicalName)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // xsna.dd01
    public final boolean l() {
        return false;
    }

    public final i901 o() {
        return this.i;
    }

    public final i901 p() {
        return this.q;
    }

    public final i901 q() {
        return this.l;
    }

    @VisibleForTesting
    public final String u() {
        String str;
        synchronized (this) {
            try {
                if (this.h == null) {
                    mb01 mb01Var = (mb01) this.b;
                    String str2 = mb01Var.e;
                    if (str2 != null) {
                        this.h = str2;
                    } else {
                        ((mb01) mb01Var.h.b).getClass();
                        this.h = "FA";
                    }
                }
                exc0.i(this.h);
                str = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void v(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(u(), i)) {
            Log.println(i, u(), s(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        exc0.i(str);
        kb01 kb01Var = ((mb01) this.b).k;
        if (kb01Var == null) {
            Log.println(6, u(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!kb01Var.e) {
                Log.println(6, u(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            kb01Var.s(new h901(this, i, str, obj, obj2, obj3));
        }
    }
}
