package xsna;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class h901 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ k901 g;

    public h901(k901 k901Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.g = k901Var;
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x901 x901Var = ((mb01) this.g.b).i;
        mb01.i(x901Var);
        if (!x901Var.e) {
            Log.println(6, this.g.u(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        k901 k901Var = this.g;
        if (k901Var.f == 0) {
            kwz0 kwz0Var = ((mb01) k901Var.b).h;
            if (kwz0Var.g == null) {
                synchronized (kwz0Var) {
                    try {
                        if (kwz0Var.g == null) {
                            ApplicationInfo applicationInfo = ((mb01) kwz0Var.b).b.getApplicationInfo();
                            String a = ahd0.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                kwz0Var.g = Boolean.valueOf(str != null && str.equals(a));
                            }
                            if (kwz0Var.g == null) {
                                kwz0Var.g = Boolean.TRUE;
                                k901 k901Var2 = ((mb01) kwz0Var.b).j;
                                mb01.k(k901Var2);
                                k901Var2.i.a("My process not in the list of running processes");
                            }
                        }
                    } finally {
                    }
                }
            }
            if (kwz0Var.g.booleanValue()) {
                k901 k901Var3 = this.g;
                ((mb01) k901Var3.b).getClass();
                k901Var3.f = 'C';
            } else {
                k901 k901Var4 = this.g;
                ((mb01) k901Var4.b).getClass();
                k901Var4.f = 'c';
            }
        }
        k901 k901Var5 = this.g;
        if (k901Var5.g < 0) {
            ((mb01) k901Var5.b).h.p();
            k901Var5.g = 74029L;
        }
        char charAt = "01VDIWEA?".charAt(this.b);
        k901 k901Var6 = this.g;
        char c = k901Var6.f;
        long j = k901Var6.g;
        String s = k901.s(true, this.c, this.d, this.e, this.f);
        StringBuilder sb = new StringBuilder("2");
        sb.append(charAt);
        sb.append(c);
        sb.append(j);
        String a2 = i5s.a(sb, StringUtils.PROCESS_POSTFIX_DELIMITER, s);
        if (a2.length() > 1024) {
            a2 = this.c.substring(0, 1024);
        }
        v901 v901Var = x901Var.g;
        if (v901Var != null) {
            String str2 = v901Var.c;
            String str3 = v901Var.b;
            x901 x901Var2 = v901Var.e;
            x901Var2.k();
            if (v901Var.e.o().getLong(v901Var.a, 0L) == 0) {
                v901Var.a();
            }
            if (a2 == null) {
                a2 = "";
            }
            long j2 = x901Var2.o().getLong(str3, 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor edit = x901Var2.o().edit();
                edit.putString(str2, a2);
                edit.putLong(str3, 1L);
                edit.apply();
                return;
            }
            sk01 sk01Var = ((mb01) x901Var2.b).m;
            mb01.i(sk01Var);
            long nextLong = sk01Var.s().nextLong();
            long j3 = j2 + 1;
            long j4 = Long.MAX_VALUE / j3;
            SharedPreferences.Editor edit2 = x901Var2.o().edit();
            if ((Long.MAX_VALUE & nextLong) < j4) {
                edit2.putString(str2, a2);
            }
            edit2.putLong(str3, j3);
            edit2.apply();
        }
    }
}
