package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import defpackage.ny61;
import defpackage.r38;
import defpackage.vn7;
import defpackage.x34;
import defpackage.x8v;
import defpackage.xbj;
import defpackage.xi21;
import defpackage.y8v;

/* loaded from: classes10.dex */
public final class v extends n {
    public static final v b;

    static {
        new y8v();
        b = new v();
    }

    @Override // androidx.camera.camera2.internal.n
    public final void a(xi21 xi21Var, r38 r38Var) {
        super.a(xi21Var, r38Var);
        if (!(xi21Var instanceof x8v)) {
            ny61.g("config is not ImageCaptureConfig");
            return;
        }
        x8v x8vVar = (x8v) xi21Var;
        vn7 vn7Var = new vn7();
        x34 x34Var = x8v.b;
        if (x8vVar.d(x34Var)) {
            int intValue = ((Integer) x8vVar.f(x34Var)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) xbj.a.b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (intValue == 0) {
                    vn7Var.b(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
                } else if (intValue == 1) {
                    vn7Var.b(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
                }
            }
        }
        r38Var.c(vn7Var.a());
    }
}
