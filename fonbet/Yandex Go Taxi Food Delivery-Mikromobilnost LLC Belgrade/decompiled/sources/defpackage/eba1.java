package defpackage;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;

/* loaded from: classes.dex */
public final class eba1 implements uca1 {
    public final Object a;

    public /* synthetic */ eba1(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.uca1
    public jfa1 a(Class cls) {
        for (int i = 0; i < 2; i++) {
            uca1 uca1Var = ((uca1[]) this.a)[i];
            if (uca1Var.c(cls)) {
                return uca1Var.a(cls);
            }
        }
        w511.x("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public void b() {
        m8b1 m8b1Var = (m8b1) this.a;
        m8b1Var.Gg();
        g gVar = (g) m8b1Var.b;
        o5a1 o5a1Var = gVar.x;
        g.e(o5a1Var);
        kl40 kl40Var = gVar.D;
        kl40Var.getClass();
        if (o5a1Var.Qg(System.currentTimeMillis())) {
            o5a1 o5a1Var2 = gVar.x;
            g.e(o5a1Var2);
            o5a1Var2.F.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.H.a("Detected application was in foreground");
                kl40Var.getClass();
                e(System.currentTimeMillis());
            }
        }
    }

    @Override // defpackage.uca1
    public boolean c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((uca1[]) this.a)[i].c(cls)) {
                return true;
            }
        }
        return false;
    }

    public void d(long j) {
        m8b1 m8b1Var = (m8b1) this.a;
        m8b1Var.Gg();
        m8b1Var.Kg();
        g gVar = (g) m8b1Var.b;
        o5a1 o5a1Var = gVar.x;
        g.e(o5a1Var);
        if (o5a1Var.Qg(j)) {
            g.e(o5a1Var);
            o5a1Var.F.b(true);
            gVar.l().Lg();
        }
        g.e(o5a1Var);
        o5a1Var.J.b(j);
        if (o5a1Var.F.a()) {
            e(j);
        }
    }

    public void e(long j) {
        m8b1 m8b1Var = (m8b1) this.a;
        m8b1Var.Gg();
        g gVar = (g) m8b1Var.b;
        if (gVar.a()) {
            o5a1 o5a1Var = gVar.x;
            g.e(o5a1Var);
            o5a1Var.J.b(j);
            gVar.D.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.H.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            Long valueOf = Long.valueOf(j2);
            j jVar = gVar.F;
            g.f(jVar);
            jVar.Rg("auto", j, valueOf, "_sid");
            g.e(o5a1Var);
            o5a1Var.K.b(j2);
            o5a1Var.F.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            g.f(jVar);
            jVar.Og("auto", "_s", bundle, j);
            String o = o5a1Var.P.o();
            if (TextUtils.isEmpty(o)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", o);
            g.f(jVar);
            jVar.Og("auto", "_ssr", bundle2, j);
        }
    }
}
