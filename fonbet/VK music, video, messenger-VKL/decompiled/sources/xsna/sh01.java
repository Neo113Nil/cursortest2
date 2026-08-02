package xsna;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class sh01 implements Runnable {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ yh01 g;

    public sh01(yh01 yh01Var, AtomicReference atomicReference, String str, String str2, com.google.android.gms.measurement.internal.zzq zzqVar, boolean z) {
        this.g = yh01Var;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        this.e = zzqVar;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        yh01 yh01Var;
        v701 v701Var;
        synchronized (this.b) {
            try {
                try {
                    yh01Var = this.g;
                    v701Var = yh01Var.g;
                } catch (RemoteException e) {
                    k901 k901Var = ((mb01) this.g.b).j;
                    mb01.k(k901Var);
                    k901Var.i.d("(legacy) Failed to get user properties; remote exception", null, this.c, e);
                    this.b.set(Collections.EMPTY_LIST);
                    atomicReference = this.b;
                }
                if (v701Var == null) {
                    k901 k901Var2 = ((mb01) yh01Var.b).j;
                    mb01.k(k901Var2);
                    k901Var2.i.d("(legacy) Failed to get user properties; not connected to service", null, this.c, this.d);
                    this.b.set(Collections.EMPTY_LIST);
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    this.b.set(v701Var.j1(this.c, this.d, this.f, this.e));
                } else {
                    this.b.set(v701Var.s1(null, this.c, this.d, this.f));
                }
                this.g.v();
                atomicReference = this.b;
                atomicReference.notify();
            } finally {
                this.b.notify();
            }
        }
    }
}
