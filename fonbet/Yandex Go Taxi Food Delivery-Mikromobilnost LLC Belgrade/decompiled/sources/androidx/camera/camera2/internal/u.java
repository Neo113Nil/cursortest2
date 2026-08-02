package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class u {
    public final androidx.camera.core.impl.utils.executor.b a;
    public final Object b = new Object();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final CameraDevice.StateCallback f = new CaptureSessionRepository$1(this);

    public u(androidx.camera.core.impl.utils.executor.b bVar) {
        this.a = bVar;
    }

    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.c);
        }
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(a());
            synchronized (this.b) {
                arrayList2 = new ArrayList(this.e);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
