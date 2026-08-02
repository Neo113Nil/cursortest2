package xsna;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class cd01 extends u701 {
    public final qj01 a;
    public Boolean b;
    public String e;

    public cd01(qj01 qj01Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        exc0.i(qj01Var);
        this.a = qj01Var;
        this.e = null;
    }

    @Override // xsna.v701
    public final void D1(zzac zzacVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        exc0.i(zzacVar);
        exc0.i(zzacVar.d);
        H1(zzqVar);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.b = zzqVar.b;
        g(new nb01(this, zzacVar2, zzqVar));
    }

    @Override // xsna.v701
    public final void E0(com.google.android.gms.measurement.internal.zzq zzqVar) {
        H1(zzqVar);
        g(new ad01(this, zzqVar));
    }

    @Override // xsna.v701
    public final void G0(com.google.android.gms.measurement.internal.zzq zzqVar) {
        exc0.f(zzqVar.b);
        exc0.i(zzqVar.w);
        uc01 uc01Var = new uc01(0, this, zzqVar);
        qj01 qj01Var = this.a;
        if (qj01Var.d().u()) {
            uc01Var.run();
        } else {
            qj01Var.d().t(uc01Var);
        }
    }

    public final void H1(com.google.android.gms.measurement.internal.zzq zzqVar) {
        exc0.i(zzqVar);
        String str = zzqVar.b;
        exc0.f(str);
        I1(str, false);
        this.a.Q().J(zzqVar.c, zzqVar.r);
    }

    @Override // xsna.v701
    public final void I0(com.google.android.gms.measurement.internal.zzq zzqVar) {
        exc0.f(zzqVar.b);
        I1(zzqVar.b, false);
        g(new tb01(this, zzqVar));
    }

    public final void I1(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        qj01 qj01Var = this.a;
        if (isEmpty) {
            qj01Var.e().i.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.e)) {
                        if (!f2q0.a(Binder.getCallingUid(), qj01Var.m.b) && !jau.a(qj01Var.m.b).b(Binder.getCallingUid())) {
                            z2 = false;
                        }
                    }
                    this.b = Boolean.valueOf(z2);
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                qj01Var.e().i.b(k901.r(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.e == null) {
            Context context = qj01Var.m.b;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = fau.a;
            if (f2q0.b(context, callingUid, str)) {
                this.e = str;
            }
        }
        if (str.equals(this.e)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // xsna.v701
    public final void M0(com.google.android.gms.measurement.internal.zzq zzqVar) {
        H1(zzqVar);
        g(new tc01(this, zzqVar));
    }

    @Override // xsna.v701
    public final List N0(String str, String str2, String str3) {
        I1(str, true);
        qj01 qj01Var = this.a;
        try {
            return (List) qj01Var.d().q(new sb01(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            qj01Var.e().i.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // xsna.v701
    public final void a1(zzaw zzawVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        exc0.i(zzawVar);
        H1(zzqVar);
        g(new vc01(this, zzawVar, zzqVar));
    }

    @Override // xsna.v701
    public final void e1(long j, String str, String str2, String str3) {
        g(new bd01(this, str2, str3, str, j));
    }

    public final void f(zzaw zzawVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        qj01 qj01Var = this.a;
        qj01Var.a();
        qj01Var.j(zzawVar, zzqVar);
    }

    @Override // xsna.v701
    public final String f0(com.google.android.gms.measurement.internal.zzq zzqVar) {
        H1(zzqVar);
        qj01 qj01Var = this.a;
        try {
            return (String) qj01Var.d().q(new nj01(qj01Var, zzqVar)).get(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            qj01Var.e().i.c("Failed to get app instance id. appId", k901.r(zzqVar.b), e);
            return null;
        }
    }

    @Override // xsna.v701
    public final void f1(zzkw zzkwVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        exc0.i(zzkwVar);
        H1(zzqVar);
        g(new yc01(this, zzkwVar, zzqVar));
    }

    @VisibleForTesting
    public final void g(Runnable runnable) {
        qj01 qj01Var = this.a;
        if (qj01Var.d().u()) {
            runnable.run();
        } else {
            qj01Var.d().s(runnable);
        }
    }

    @Override // xsna.v701
    public final List j1(String str, String str2, boolean z, com.google.android.gms.measurement.internal.zzq zzqVar) {
        H1(zzqVar);
        String str3 = zzqVar.b;
        exc0.i(str3);
        qj01 qj01Var = this.a;
        try {
            List<uj01> list = (List) qj01Var.d().q(new pb01(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (uj01 uj01Var : list) {
                if (!z && sk01.T(uj01Var.c)) {
                }
                arrayList.add(new zzkw(uj01Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            qj01Var.e().i.c("Failed to query user properties. appId", k901.r(str3), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            qj01Var.e().i.c("Failed to query user properties. appId", k901.r(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // xsna.v701
    public final List l0(String str, String str2, com.google.android.gms.measurement.internal.zzq zzqVar) {
        H1(zzqVar);
        String str3 = zzqVar.b;
        exc0.i(str3);
        qj01 qj01Var = this.a;
        try {
            return (List) qj01Var.d().q(new rb01(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            qj01Var.e().i.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // xsna.v701
    public final List s1(String str, String str2, String str3, boolean z) {
        I1(str, true);
        qj01 qj01Var = this.a;
        try {
            List<uj01> list = (List) qj01Var.d().q(new qb01(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (uj01 uj01Var : list) {
                if (!z && sk01.T(uj01Var.c)) {
                }
                arrayList.add(new zzkw(uj01Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            qj01Var.e().i.c("Failed to get user properties as. appId", k901.r(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            qj01Var.e().i.c("Failed to get user properties as. appId", k901.r(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // xsna.v701
    public final byte[] u1(zzaw zzawVar, String str) {
        exc0.f(str);
        exc0.i(zzawVar);
        I1(str, true);
        qj01 qj01Var = this.a;
        i901 i901Var = qj01Var.e().p;
        mb01 mb01Var = qj01Var.m;
        f901 f901Var = mb01Var.n;
        String str2 = zzawVar.b;
        i901Var.b(f901Var.d(str2), "Log and bundle. event");
        ((jcl) qj01Var.f()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        kb01 d = qj01Var.d();
        xc01 xc01Var = new xc01(this, zzawVar, str);
        d.m();
        ib01 ib01Var = new ib01(d, xc01Var, true);
        if (Thread.currentThread() == d.f) {
            ib01Var.run();
        } else {
            d.v(ib01Var);
        }
        try {
            byte[] bArr = (byte[]) ib01Var.get();
            if (bArr == null) {
                qj01Var.e().i.b(k901.r(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((jcl) qj01Var.f()).getClass();
            qj01Var.e().p.d("Log and bundle processed. event, size, time_ms", mb01Var.n.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            qj01Var.e().i.d("Failed to log and bundle. appId, event, error", k901.r(str), mb01Var.n.d(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            qj01Var.e().i.d("Failed to log and bundle. appId, event, error", k901.r(str), mb01Var.n.d(str2), e);
            return null;
        }
    }

    @Override // xsna.v701
    public final void x(Bundle bundle, com.google.android.gms.measurement.internal.zzq zzqVar) {
        H1(zzqVar);
        String str = zzqVar.b;
        exc0.i(str);
        g(new gok(this, str, bundle, 1));
    }
}
