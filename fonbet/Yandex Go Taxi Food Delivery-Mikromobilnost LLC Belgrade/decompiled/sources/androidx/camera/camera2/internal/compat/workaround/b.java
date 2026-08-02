package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.m;
import defpackage.d7g0;
import defpackage.euy;
import defpackage.geb1;
import defpackage.gym;
import defpackage.hiv;
import defpackage.lry;
import defpackage.ni91;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class b {
    public final boolean a;
    public final List b = Collections.synchronizedList(new ArrayList());

    public b(boolean z) {
        this.a = z;
    }

    public final CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.a) {
            return captureCallback;
        }
        final RequestMonitor$RequestCompleteListener requestMonitor$RequestCompleteListener = new RequestMonitor$RequestCompleteListener();
        final euy euyVar = requestMonitor$RequestCompleteListener.mStartRequestFuture;
        this.b.add(euyVar);
        euyVar.c(new Runnable() { // from class: androidx.camera.camera2.internal.compat.workaround.a
            @Override // java.lang.Runnable
            public final void run() {
                Objects.toString(requestMonitor$RequestCompleteListener);
                b.this.b.remove(euyVar);
            }
        }, geb1.b());
        return m.a(requestMonitor$RequestCompleteListener, captureCallback);
    }

    public final euy b() {
        List list = this.b;
        if (list.isEmpty()) {
            return hiv.c;
        }
        lry k = ni91.k(new ArrayList(list));
        d7g0 d7g0Var = new d7g0(8);
        return ni91.g(ni91.n(k, new gym(d7g0Var), geb1.b()));
    }

    public final void c() {
        LinkedList linkedList = new LinkedList(this.b);
        while (!linkedList.isEmpty()) {
            euy euyVar = (euy) linkedList.poll();
            Objects.requireNonNull(euyVar);
            euyVar.cancel(true);
        }
    }
}
