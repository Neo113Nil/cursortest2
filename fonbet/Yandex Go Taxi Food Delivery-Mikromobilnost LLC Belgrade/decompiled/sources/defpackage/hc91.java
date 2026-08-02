package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.wallet.zzd;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class hc91 implements wx60, Runnable {
    public static final zzd w = new zzd(Looper.getMainLooper());
    public static final SparseArray x = new SparseArray(2);
    public static final AtomicInteger y = new AtomicInteger();
    public int a;
    public com.google.android.gms.wallet.zzd b;
    public Task c;

    public final void a() {
        if (this.c == null || this.b == null) {
            return;
        }
        x.delete(this.a);
        w.removeCallbacks(this);
        com.google.android.gms.wallet.zzd zzdVar = this.b;
        if (zzdVar != null) {
            zzdVar.zza(this.c);
        }
    }

    @Override // defpackage.wx60
    public final void onComplete(Task task) {
        this.c = task;
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.delete(this.a);
    }
}
