package xsna;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class dzz0 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzau f;

    public dzz0(mb01 mb01Var, String str, String str2, String str3, long j, Bundle bundle) {
        zzau zzauVar;
        exc0.f(str2);
        exc0.f(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = 0L;
        if (bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.i.a("Param name can't be null");
                    it.remove();
                } else {
                    sk01 sk01Var = mb01Var.m;
                    mb01.i(sk01Var);
                    Object o = sk01Var.o(bundle2.get(next), next);
                    if (o == null) {
                        k901 k901Var2 = mb01Var.j;
                        mb01.k(k901Var2);
                        k901Var2.l.b(mb01Var.n.e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        sk01 sk01Var2 = mb01Var.m;
                        mb01.i(sk01Var2);
                        sk01Var2.A(next, bundle2, o);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        }
        this.f = zzauVar;
    }

    public final dzz0 a(mb01 mb01Var, long j) {
        return new dzz0(mb01Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        return i5s.a(xe9.a("Event{appId='", this.a, "', name='", this.b, "', params="), this.f.toString(), "}");
    }

    public dzz0(mb01 mb01Var, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        exc0.f(str2);
        exc0.f(str3);
        exc0.i(zzauVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.l.c("Event created with reverse previous/current timestamps. appId, name", k901.r(str2), k901.r(str3));
        }
        this.f = zzauVar;
    }
}
