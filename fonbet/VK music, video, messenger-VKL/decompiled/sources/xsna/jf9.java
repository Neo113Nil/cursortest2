package xsna;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.f;
import androidx.camera.core.impl.r;
import java.util.ArrayList;
import xsna.fs9;

/* compiled from: Camera2SessionOptionUnpacker.java */
/* loaded from: classes11.dex */
public final class jf9 implements r.d {
    public static final jf9 a = new jf9();

    @Override // androidx.camera.core.impl.r.d
    public final void a(@NonNull androidx.camera.core.impl.u<?> uVar, @NonNull r.b bVar) {
        ArrayList arrayList = bVar.d;
        ArrayList arrayList2 = bVar.c;
        f.a aVar = bVar.b;
        androidx.camera.core.impl.r q = uVar.q();
        androidx.camera.core.impl.o oVar = androidx.camera.core.impl.o.u;
        int i = androidx.camera.core.impl.r.a().f.c;
        if (q != null) {
            androidx.camera.core.impl.f fVar = q.f;
            i = fVar.c;
            for (CameraDevice.StateCallback stateCallback : q.b) {
                if (arrayList2.contains(stateCallback)) {
                    throw new IllegalArgumentException("Duplicate device state callback.");
                }
                arrayList2.add(stateCallback);
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : q.c) {
                if (arrayList.contains(stateCallback2)) {
                    throw new IllegalArgumentException("Duplicate session state callback.");
                }
                arrayList.add(stateCallback2);
            }
            aVar.a(fVar.d);
            oVar = fVar.b;
        }
        aVar.getClass();
        aVar.b = androidx.camera.core.impl.n.A(oVar);
        aVar.c = ((Integer) uVar.g(if9.t, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) uVar.g(if9.u, new sh9());
        if (arrayList2.contains(stateCallback3)) {
            throw new IllegalArgumentException("Duplicate device state callback.");
        }
        arrayList2.add(stateCallback3);
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) uVar.g(if9.v, new ng9());
        if (arrayList.contains(stateCallback4)) {
            throw new IllegalArgumentException("Duplicate session state callback.");
        }
        arrayList.add(stateCallback4);
        cs9 cs9Var = new cs9((CameraCaptureSession.CaptureCallback) uVar.g(if9.w, new bf9()));
        aVar.b(cs9Var);
        bVar.f.add(cs9Var);
        androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
        androidx.camera.core.impl.a aVar2 = if9.x;
        z.C(aVar2, (ki9) uVar.g(aVar2, ki9.b()));
        aVar.c(z);
        fs9.a aVar3 = new fs9.a();
        uVar.b(new rr2(aVar3, uVar));
        aVar.c(new fs9(androidx.camera.core.impl.o.y(aVar3.a)));
    }
}
