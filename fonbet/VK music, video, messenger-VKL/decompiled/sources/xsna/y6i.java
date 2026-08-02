package xsna;

import com.vk.media.camera.CameraObject$CameraMode;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* compiled from: CompareAndSetNetworkConnectionCheckByGoogle.kt */
/* loaded from: classes5.dex */
public final class y6i implements pj9 {
    public final Object b;

    public /* synthetic */ y6i(Object obj) {
        this.b = obj;
    }

    public Mac a() {
        try {
            return Mac.getInstance((String) this.b);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("defined mac algorithm was not found", e);
        } catch (Exception e2) {
            throw new IllegalStateException("could not create mac instance in hkdf", e2);
        }
    }

    @Override // xsna.pj9
    public void b(oj9 oj9Var) {
        oj9Var.d = ((xoe0) this.b).m() ? CameraObject$CameraMode.BACK : CameraObject$CameraMode.FRONT;
    }

    public y6i(vg0 vg0Var) {
        this.b = new yqo0();
    }

    public y6i() {
        this.b = new yd10();
    }
}
