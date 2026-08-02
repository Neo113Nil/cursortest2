package xsna;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class f901 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final iq6 a;

    public f901(iq6 iq6Var) {
        this.a = iq6Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        exc0.i(atomicReference);
        exc0.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            Object obj = strArr[i];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder e = fw3.e(X3.j.d);
        for (Object obj : objArr) {
            String b2 = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (b2 != null) {
                if (e.length() != 1) {
                    e.append(", ");
                }
                e.append(b2);
            }
        }
        e.append(X3.j.e);
        return e.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.d()) {
            return bundle.toString();
        }
        StringBuilder e = fw3.e("Bundle[{");
        for (String str : bundle.keySet()) {
            if (e.length() != 8) {
                e.append(", ");
            }
            e.append(e(str));
            e.append("=");
            Object obj = bundle.get(str);
            e.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        e.append("}]");
        return e.toString();
    }

    public final String c(zzaw zzawVar) {
        iq6 iq6Var = this.a;
        if (!iq6Var.d()) {
            return zzawVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzawVar.d);
        sb.append(",name=");
        sb.append(d(zzawVar.b));
        sb.append(",params=");
        zzau zzauVar = zzawVar.c;
        sb.append(zzauVar == null ? null : !iq6Var.d() ? zzauVar.b.toString() : b(zzauVar.i()));
        return sb.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.d() ? str : g(str, yiz.g, yiz.e, b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.d() ? str : g(str, atv0.g, atv0.f, c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.d()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return zr.a("experiment_id(", str, ")");
        }
        return g(str, fd01.b, fd01.a, d);
    }
}
