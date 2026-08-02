package xsna;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import xsna.nfs;

/* compiled from: FrameMetricsRecorder.java */
/* loaded from: classes13.dex */
public final class pfs {
    public static final ra2 e = ra2.d();
    public final Activity a;
    public final nfs b;
    public final HashMap c;
    public boolean d;

    @VisibleForTesting
    public pfs() {
        throw null;
    }

    public pfs(Activity activity) {
        nfs nfsVar = new nfs();
        HashMap hashMap = new HashMap();
        this.d = false;
        this.a = activity;
        this.b = nfsVar;
        this.c = hashMap;
    }

    public final kt80<ofs> a() {
        boolean z = this.d;
        ra2 ra2Var = e;
        if (!z) {
            ra2Var.a();
            return new kt80<>();
        }
        SparseIntArray sparseIntArray = this.b.a.b[0];
        if (sparseIntArray == null) {
            ra2Var.a();
            return new kt80<>();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int keyAt = sparseIntArray.keyAt(i4);
            int valueAt = sparseIntArray.valueAt(i4);
            i += valueAt;
            if (keyAt > 700) {
                i3 += valueAt;
            }
            if (keyAt > 16) {
                i2 += valueAt;
            }
        }
        return new kt80<>(new ofs(i, i2, i3));
    }

    public final void b() {
        boolean z = this.d;
        Activity activity = this.a;
        if (z) {
            e.b("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        nfs.a aVar = this.b.a;
        aVar.getClass();
        if (nfs.a.e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            nfs.a.e = handlerThread;
            handlerThread.start();
            nfs.a.f = new Handler(nfs.a.e.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = aVar.b;
            if (sparseIntArrayArr[i] == null) {
                if (((1 << i) & aVar.a) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(aVar.d, nfs.a.f);
        aVar.c.add(new WeakReference<>(activity));
        this.d = true;
    }
}
