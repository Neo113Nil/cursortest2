package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class i0a1 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final yo40 a;

    public i0a1(yo40 yo40Var) {
        this.a = yo40Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        cvw.l(atomicReference);
        cvw.e(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + Extension.O_BRAKE + strArr[i] + Extension.C_BRAKE;
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

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.s() ? str : g(str, cma1.e, cma1.c, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.s()) {
            return str;
        }
        return g(str, fga1.b, fga1.a, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.s() ? str : str.startsWith("_exp_") ? oyr.p("experiment_id(", str, Extension.C_BRAKE) : g(str, bb1.e, bb1.d, d);
    }

    public final String d(zzbg zzbgVar) {
        yo40 yo40Var = this.a;
        if (!yo40Var.s()) {
            return zzbgVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbgVar.zzc);
        sb.append(",name=");
        sb.append(a(zzbgVar.zza));
        sb.append(",params=");
        zzbe zzbeVar = zzbgVar.zzb;
        sb.append(zzbeVar == null ? null : !yo40Var.s() ? zzbeVar.toString() : e(zzbeVar.zzf()));
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.s()) {
            return bundle.toString();
        }
        StringBuilder t = qv10.t("Bundle[{");
        for (String str : bundle.keySet()) {
            if (t.length() != 8) {
                t.append(Extension.FIX_SPACE);
            }
            t.append(b(str));
            t.append("=");
            Object obj = bundle.get(str);
            t.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        t.append("}]");
        return t.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder t = qv10.t("[");
        for (Object obj : objArr) {
            String e = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e != null) {
                if (t.length() != 1) {
                    t.append(Extension.FIX_SPACE);
                }
                t.append(e);
            }
        }
        t.append("]");
        return t.toString();
    }
}
