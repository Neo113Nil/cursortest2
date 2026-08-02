package xsna;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.f;

/* compiled from: ImageCaptureOptionUnpacker.java */
/* loaded from: classes11.dex */
public final class zgw extends cf9 {
    public static final zgw b = new zgw();

    @Override // xsna.cf9, androidx.camera.core.impl.f.b
    public final void a(@NonNull androidx.camera.core.impl.u<?> uVar, @NonNull f.a aVar) {
        super.a(uVar, aVar);
        if (!(uVar instanceof androidx.camera.core.impl.j)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        androidx.camera.core.impl.j jVar = (androidx.camera.core.impl.j) uVar;
        androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
        androidx.camera.core.impl.a aVar2 = androidx.camera.core.impl.j.t;
        if (jVar.c(aVar2)) {
            int intValue = ((Integer) jVar.f(aVar2)).intValue();
            if (((bhw) n6m.a.a(bhw.class)) != null) {
                if (intValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    Boolean bool = Boolean.TRUE;
                    androidx.camera.core.impl.a aVar3 = if9.t;
                    z.C(new androidx.camera.core.impl.a("camera2.captureRequest.option." + key.getName(), Object.class, key), bool);
                } else if (intValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    Boolean bool2 = Boolean.FALSE;
                    androidx.camera.core.impl.a aVar4 = if9.t;
                    z.C(new androidx.camera.core.impl.a("camera2.captureRequest.option." + key2.getName(), Object.class, key2), bool2);
                }
            }
        }
        aVar.c(new if9(androidx.camera.core.impl.o.y(z)));
    }
}
