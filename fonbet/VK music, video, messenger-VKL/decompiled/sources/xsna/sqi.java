package xsna;

import android.util.Log;
import androidx.compose.runtime.a;
import java.util.ArrayList;

/* compiled from: ComposeStackTraceBuilder.kt */
/* loaded from: classes11.dex */
public abstract class sqi {
    public final ArrayList a = new ArrayList();

    public final boolean a(int i, jmu jmuVar, Object obj) {
        ArrayList<Object> a = jmuVar.a();
        boolean z = false;
        if (a != null) {
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = a.get(i2);
                if (obj2 instanceof yy1) {
                    if (epx.f(obj2, obj)) {
                        b(jmuVar.getKey(), jmuVar, obj2);
                        return true;
                    }
                } else {
                    if (!(obj2 instanceof jmu)) {
                        throw new IllegalStateException(rqi.c(obj2, "Unexpected child source info "));
                    }
                    if (a(i, (jmu) obj2, obj)) {
                        b(jmuVar.getKey(), jmuVar, obj2);
                        return true;
                    }
                }
            }
        } else {
            if (!jmuVar.d()) {
                b(i, jmuVar, null);
                return true;
            }
            int e = jmuVar.e();
            int c = jmuVar.c();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int intValue = number.intValue();
                if ((e <= intValue && intValue < c) || (e == c && obj != null && e == number.intValue())) {
                    z = true;
                }
                if (z) {
                    b(jmuVar.getKey(), jmuVar, null);
                }
                return z;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, jmu jmuVar, Object obj) {
        pgk0 pgk0Var;
        vqi vqiVar;
        String b;
        String b2;
        String b3;
        if (jmuVar != null && (b3 = jmuVar.b()) != null && b3.length() != 0) {
            try {
                pgk0Var = ao8.m(b3);
            } catch (zi90 e) {
                Log.e("ComposeInternal", e.getMessage(), e);
            }
            if (pgk0Var != null) {
                vqiVar = new vqi(i, null, null);
            } else if (obj == null) {
                vqiVar = new vqi(i, pgk0Var, null);
            } else {
                ArrayList<Object> a = jmuVar.a();
                int i2 = 0;
                if (a != null) {
                    int size = a.size();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        Object obj2 = a.get(i4);
                        if (epx.f(obj2, obj)) {
                            break;
                        }
                        jmu e2 = e(obj2);
                        if (e2 != null && ((e2.getKey() == -127 || (e2.getKey() == 0 && (obj2 instanceof yy1) && c((yy1) obj2) == -127)) && e2.b() == null)) {
                            ArrayList<Object> a2 = e2.a();
                            if (a2 != null) {
                                int size2 = a2.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    jmu e3 = e(a2.get(i5));
                                    if (e3 != null && (b2 = e3.b()) != null && brm0.B(b2, "C", false)) {
                                        i3++;
                                    }
                                }
                            }
                        } else if (e2 != null && (b = e2.b()) != null && brm0.B(b, "C", false)) {
                            i3++;
                        }
                    }
                    i2 = i3;
                }
                vqiVar = new vqi(i, pgk0Var, Integer.valueOf(i2));
            }
            this.a.add(vqiVar);
        }
        pgk0Var = null;
        if (pgk0Var != null) {
        }
        this.a.add(vqiVar);
    }

    public abstract int c(yy1 yy1Var);

    public final void d(int i, Object obj, jmu jmuVar, Object obj2) {
        if (jmuVar != null || epx.f(obj, a.C0011a.a)) {
            if (obj2 == null || jmuVar == null) {
                b(i, jmuVar, null);
            } else {
                if (a(i, jmuVar, obj2) || jmuVar.d()) {
                    return;
                }
                b(i, jmuVar, obj2);
            }
        }
    }

    public final jmu e(Object obj) {
        if (obj instanceof yy1) {
            return f((yy1) obj);
        }
        if (obj instanceof jmu) {
            return (jmu) obj;
        }
        throw new IllegalStateException(rqi.c(obj, "Unexpected child source info "));
    }

    public abstract jmu f(yy1 yy1Var);
}
