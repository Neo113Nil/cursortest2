package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import defpackage.a48;
import defpackage.dyq0;
import defpackage.jyq0;
import defpackage.q38;
import defpackage.r38;
import defpackage.txe0;
import defpackage.ug70;
import defpackage.vn7;
import defpackage.wn7;
import defpackage.x34;
import defpackage.xbj;
import defpackage.xi21;
import defpackage.yy40;
import defpackage.zxe0;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class p {
    public static final p a = new p();

    public static void a(Size size, xi21 xi21Var, dyq0 dyq0Var) {
        jyq0 jyq0Var = (jyq0) xi21Var.g(xi21.j4, null);
        ug70 ug70Var = ug70.c;
        int i = jyq0.a().g.c;
        if (jyq0Var != null) {
            i = jyq0Var.g.c;
            for (CameraDevice.StateCallback stateCallback : jyq0Var.c) {
                ArrayList arrayList = dyq0Var.c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : jyq0Var.d) {
                ArrayList arrayList2 = dyq0Var.d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            dyq0Var.b.a(jyq0Var.g.e);
            ug70Var = jyq0Var.g.b;
        }
        r38 r38Var = dyq0Var.b;
        r38Var.getClass();
        r38Var.b = yy40.p(ug70Var);
        if (xi21Var instanceof txe0) {
            Rational rational = zxe0.a;
            if (((PreviewPixelHDRnetQuirk) xbj.a.b(PreviewPixelHDRnetQuirk.class)) != null && !zxe0.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                vn7 vn7Var = new vn7();
                vn7Var.b(CaptureRequest.TONEMAP_MODE, 2);
                dyq0Var.b.c(vn7Var.a());
            }
        }
        dyq0Var.b.c = ((Integer) xi21Var.g(wn7.b, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) xi21Var.g(wn7.w, new CameraDeviceStateCallbacks$NoOpDeviceStateCallback());
        ArrayList arrayList3 = dyq0Var.c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) xi21Var.g(wn7.x, new CameraCaptureSessionStateCallbacks$NoOpSessionStateCallback());
        ArrayList arrayList4 = dyq0Var.d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        dyq0Var.a(new q38((CameraCaptureSession.CaptureCallback) xi21Var.g(wn7.y, new Camera2CaptureCallbacks$NoOpSessionCaptureCallback())));
        int l = xi21Var.l();
        if (l != 0) {
            r38 r38Var2 = dyq0Var.b;
            r38Var2.getClass();
            if (l != 0) {
                r38Var2.b.w(xi21.w4, Integer.valueOf(l));
            }
        }
        int m = xi21Var.m();
        if (m != 0) {
            r38 r38Var3 = dyq0Var.b;
            r38Var3.getClass();
            if (m != 0) {
                r38Var3.b.w(xi21.u4, Integer.valueOf(m));
            }
        }
        yy40 b = yy40.b();
        x34 x34Var = wn7.z;
        b.w(x34Var, (String) xi21Var.g(x34Var, null));
        x34 x34Var2 = wn7.c;
        Long l2 = (Long) xi21Var.g(x34Var2, -1L);
        l2.getClass();
        b.w(x34Var2, l2);
        dyq0Var.b.c(b);
        dyq0Var.b.c(a48.b(xi21Var).a());
    }
}
