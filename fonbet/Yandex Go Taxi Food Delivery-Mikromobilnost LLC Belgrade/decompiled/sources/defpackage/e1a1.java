package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.measurement.internal.g;
import java.io.IOException;
import java.util.Map;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class e1a1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final String c;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public /* synthetic */ e1a1(String str, l2a1 l2a1Var, int i, IOException iOException, byte[] bArr, Map map) {
        cvw.l(l2a1Var);
        this.w = l2a1Var;
        this.b = i;
        this.x = iOException;
        this.y = bArr;
        this.c = str;
        this.z = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y1a1 y1a1Var = (y1a1) this.z;
                o5a1 o5a1Var = ((g) y1a1Var.b).x;
                g.e(o5a1Var);
                if (!o5a1Var.c) {
                    Log.println(6, y1a1Var.Qg(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (y1a1Var.w == 0) {
                    j691 j691Var = ((g) y1a1Var.b).w;
                    if (j691Var.y == null) {
                        synchronized (j691Var) {
                            try {
                                if (j691Var.y == null) {
                                    g gVar = (g) j691Var.b;
                                    ApplicationInfo applicationInfo = gVar.a.getApplicationInfo();
                                    if (gtq0.o == null) {
                                        gtq0.o = Application.getProcessName();
                                    }
                                    String str = gtq0.o;
                                    if (applicationInfo != null) {
                                        String str2 = applicationInfo.processName;
                                        j691Var.y = Boolean.valueOf(str2 != null && str2.equals(str));
                                    }
                                    if (j691Var.y == null) {
                                        j691Var.y = Boolean.TRUE;
                                        y1a1 y1a1Var2 = gVar.y;
                                        g.g(y1a1Var2);
                                        y1a1Var2.z.a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (j691Var.y.booleanValue()) {
                        y1a1Var.w = 'C';
                    } else {
                        y1a1Var.w = 'c';
                    }
                }
                if (y1a1Var.x < 0) {
                    ((g) y1a1Var.b).w.Lg();
                    y1a1Var.x = 133005L;
                }
                int i = this.b;
                char c = y1a1Var.w;
                long j = y1a1Var.x;
                String str3 = this.c;
                Object obj = this.w;
                Object obj2 = this.x;
                Object obj3 = this.y;
                char charAt = "01VDIWEA?".charAt(i);
                String Rg = y1a1.Rg(true, str3, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(x4e.D(String.valueOf(charAt).length() + 1, String.valueOf(c).length(), String.valueOf(j).length(), 1) + Rg.length());
                sb.append("2");
                sb.append(charAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(Rg);
                String sb2 = sb.toString();
                if (sb2.length() > 1024) {
                    sb2 = str3.substring(0, 1024);
                }
                jcp jcpVar = o5a1Var.y;
                if (jcpVar != null) {
                    String str4 = (String) jcpVar.w;
                    o5a1 o5a1Var2 = (o5a1) jcpVar.x;
                    o5a1Var2.Gg();
                    if (((o5a1) jcpVar.x).Kg().getLong((String) jcpVar.b, 0L) == 0) {
                        jcpVar.e();
                    }
                    SharedPreferences Kg = o5a1Var2.Kg();
                    String str5 = (String) jcpVar.c;
                    long j2 = Kg.getLong(str5, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor edit = o5a1Var2.Kg().edit();
                        edit.putString(str4, sb2);
                        edit.putLong(str5, 1L);
                        edit.apply();
                        return;
                    }
                    ieb1 ieb1Var = ((g) o5a1Var2.b).B;
                    g.e(ieb1Var);
                    long nextLong = ieb1Var.Ch().nextLong() & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                    long j3 = j2 + 1;
                    long j4 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED / j3;
                    SharedPreferences.Editor edit2 = o5a1Var2.Kg().edit();
                    if (nextLong < j4) {
                        edit2.putString(str4, sb2);
                    }
                    edit2.putLong(str5, j3);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((l2a1) this.w).o(this.c, this.b, (Throwable) this.x, (byte[]) this.y, (Map) this.z);
                return;
        }
    }

    public e1a1(y1a1 y1a1Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = str;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.z = y1a1Var;
    }
}
