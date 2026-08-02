package xsna;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class y301 extends wwz0 {
    public final /* synthetic */ a401 a;

    public y301(a401 a401Var) {
        this.a = a401Var;
    }

    @Override // xsna.axz0
    public final void F1(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        a401 a401Var = this.a;
        a401Var.j = applicationMetadata;
        a401Var.k = str;
        to01 to01Var = new to01(new Status(0), applicationMetadata, str, str2, z);
        synchronized (a401Var.h) {
            try {
                TaskCompletionSource taskCompletionSource = a401Var.e;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(to01Var);
                }
                a401Var.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.axz0
    public final void Q(long j) {
        this.a.b(0, j);
    }

    @Override // xsna.axz0
    public final void S0(int i, long j) {
        this.a.b(i, j);
    }

    @Override // xsna.axz0
    public final void a(final int i) {
        this.a.c().post(new Runnable() { // from class: xsna.x301
            @Override // java.lang.Runnable
            public final void run() {
                y301 y301Var = y301.this;
                a401 a401Var = y301Var.a;
                a401Var.n = -1;
                a401Var.o = -1;
                a401Var.j = null;
                a401Var.k = null;
                a401Var.l = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                a401Var.g();
                a401Var.m = false;
                a401Var.p = null;
                a401Var.v = 1;
                List list = a401Var.u;
                int i2 = i;
                synchronized (list) {
                    try {
                        Iterator it = a401Var.u.iterator();
                        while (it.hasNext()) {
                            ((gn01) it.next()).d(i2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                a401 a401Var2 = y301Var.a;
                a401Var2.d();
                ehz.a<?> aVar = a401Var2.registerListener(a401Var2.a, "castDeviceControllerListenerKey").b;
                exc0.j(aVar, "Key must not be null");
                a401Var2.doUnregisterEventListener(aVar, 8415);
            }
        });
    }

    @Override // xsna.axz0
    public final void e(final int i) {
        a401 a401Var = this.a;
        a401Var.a(i);
        if (a401Var.t != null) {
            a401Var.c().post(new Runnable() { // from class: xsna.l301
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    y301.this.a.t.onApplicationDisconnected(i);
                }
            });
        }
    }

    @Override // xsna.axz0
    public final void i(String str, String str2) {
        a401.w.a("Receive (type=text, ns=%s) %s", str, str2);
        this.a.c().post(new v301(this, str, str2));
    }

    @Override // xsna.axz0
    public final void o0(zzac zzacVar) {
        this.a.c().post(new w9c(2, this, zzacVar));
    }

    @Override // xsna.axz0
    public final void q() {
        a401.w.a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // xsna.axz0
    public final void w0(String str, byte[] bArr) {
        o100 o100Var = a401.w;
        a401.w.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // xsna.axz0
    public final void w1(final com.google.android.gms.cast.internal.zza zzaVar) {
        this.a.c().post(new Runnable() { // from class: xsna.s301
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                a401 a401Var = y301.this.a;
                a401Var.getClass();
                String str = zzaVar.b;
                if (o0a.c(str, a401Var.k)) {
                    z = false;
                } else {
                    a401Var.k = str;
                    z = true;
                }
                a401.w.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(a401Var.d));
                vr01 vr01Var = a401Var.t;
                if (vr01Var != null && (z || a401Var.d)) {
                    vr01Var.onApplicationStatusChanged();
                }
                a401Var.d = false;
            }
        });
    }

    @Override // xsna.axz0
    public final void zzc(int i) {
        this.a.c().post(new tl10(this, i, 1));
    }

    @Override // xsna.axz0
    public final void zzd(final int i) {
        this.a.c().post(new Runnable() { // from class: xsna.i301
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                a401 a401Var = y301.this.a;
                a401Var.v = 4;
                List list = a401Var.u;
                int i2 = i;
                synchronized (list) {
                    try {
                        Iterator it = a401Var.u.iterator();
                        while (it.hasNext()) {
                            ((gn01) it.next()).c(i2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // xsna.axz0
    public final void zzf(int i) {
        this.a.f(i);
    }

    @Override // xsna.axz0
    public final void zzg(int i) {
        this.a.a(i);
    }

    @Override // xsna.axz0
    public final void zzh(int i) {
        this.a.a(i);
    }
}
