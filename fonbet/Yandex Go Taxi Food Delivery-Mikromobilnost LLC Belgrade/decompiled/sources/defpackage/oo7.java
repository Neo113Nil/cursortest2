package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Log;
import androidx.camera.camera2.internal.b;
import io.flutter.plugins.camerax.CameraXError;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class oo7 implements tsr, r30 {
    public ssr a;
    public pbj b;

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        pbj pbjVar = this.b;
        if (pbjVar != null) {
            pbjVar.A = (Activity) ((wrr) l40Var).b;
            pbjVar.a = new m6(27, l40Var);
        }
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.a = ssrVar;
        tt5 tt5Var = ssrVar.c;
        pbj pbjVar = new pbj(ssrVar.a, tt5Var, ssrVar.d);
        this.b = pbjVar;
        i3y i3yVar = eu7.b;
        heb1.f(tt5Var, (w4u) pbjVar.w);
        String str = "dev.flutter.pigeon.camera_android_camerax.CameraSize.pigeon_defaultConstructor";
        Object obj = null;
        new m2v(tt5Var, str, pbjVar.j(), obj).G(new lz70(13, new v83(pbjVar)));
        String str2 = "dev.flutter.pigeon.camera_android_camerax.CameraIntegerRange.pigeon_defaultConstructor";
        new m2v(tt5Var, str2, pbjVar.j(), obj).G(new lz70(12, new v83(pbjVar)));
        String str3 = "dev.flutter.pigeon.camera_android_camerax.MeteringPoint.getSize";
        new m2v(tt5Var, str3, pbjVar.j(), obj).G(new h490(13, new hay(3)));
        String str4 = "dev.flutter.pigeon.camera_android_camerax.Observer.pigeon_defaultConstructor";
        new m2v(tt5Var, str4, pbjVar.j(), obj).G(new lz70(18, new sm7(pbjVar)));
        wly0 wly0Var = new wly0();
        rs10 j = pbjVar.j();
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.getCameraState", j, obj).G(new h490(4, wly0Var));
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.getZoomState", j, obj).G(new h490(5, wly0Var));
        oj91.m(tt5Var, new n52(pbjVar));
        lk91.i(tt5Var, new n52(pbjVar));
        String str5 = "dev.flutter.pigeon.camera_android_camerax.Camera.getCameraInfo";
        new m2v(tt5Var, str5, pbjVar.j(), obj).G(new h490(3, new omy0()));
        zk91.k(tt5Var, new v83(pbjVar));
        uj91.f(tt5Var, new v83(pbjVar));
        if (((oy80) pbjVar.B) == null) {
            pbjVar.B = new oy80(pbjVar);
        }
        jk91.c(tt5Var, (oy80) pbjVar.B);
        bl91.e(tt5Var, new n52(pbjVar));
        pk91.g(tt5Var, new v83(pbjVar));
        String str6 = "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventListener.pigeon_defaultConstructor";
        new m2v(tt5Var, str6, pbjVar.j(), obj).G(new lz70(22, new sm7(pbjVar)));
        ik91.g(tt5Var, new sm7(pbjVar));
        rk91.g(tt5Var, new sm7(pbjVar));
        dk91.d(tt5Var, new n52(pbjVar));
        sk91.c(tt5Var, new v83(pbjVar));
        n52 n52Var = new n52(pbjVar);
        rs10 j2 = pbjVar.j();
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.pigeon_defaultConstructor", j2, obj).G(new lz70(20, n52Var));
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.getAspectRatioStrategy", j2, obj).G(new h490(18, n52Var));
        ij91.b(tt5Var, new v83(pbjVar));
        ck91.c(tt5Var, new sm7(pbjVar));
        String str7 = "dev.flutter.pigeon.camera_android_camerax.Analyzer.pigeon_defaultConstructor";
        new m2v(tt5Var, str7, pbjVar.j(), obj).G(new lz70(11, new n52(pbjVar)));
        hk91.d(tt5Var, new n52(pbjVar));
        v83 v83Var = new v83(pbjVar);
        rs10 j3 = pbjVar.j();
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.getPlanes", j3, obj).G(new h490(10, v83Var));
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.close", j3, obj).G(new h490(11, v83Var));
        String str8 = "dev.flutter.pigeon.camera_android_camerax.ImageProxyUtils.getNv21Buffer";
        new m2v(tt5Var, str8, pbjVar.j(), obj).G(new h490(12, new sm7(pbjVar)));
        nk91.c(tt5Var, new n52(pbjVar));
        vj91.b(tt5Var, new n52(pbjVar));
        mj91.d(tt5Var, new n52(pbjVar));
        xj91.e(tt5Var, new sm7(pbjVar));
        final sm7 sm7Var = new sm7(pbjVar);
        rs10 j4 = pbjVar.j();
        final int i = 0;
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.controlAELock", j4, obj).G(new ee5() { // from class: dsb0
            @Override // defpackage.ee5
            public final void m(Object obj2, ce5 ce5Var) {
                List g;
                List g2;
                int i2 = i;
                sm7 sm7Var2 = sm7Var;
                switch (i2) {
                    case 0:
                        try {
                            ((w4u) sm7Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CaptureRequest.CONTROL_AE_LOCK);
                            g = Collections.singletonList(null);
                        } catch (Throwable th) {
                            if (th instanceof CameraXError) {
                                CameraXError cameraXError = th;
                                g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                            } else {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                        }
                        ce5Var.a(g);
                        break;
                    default:
                        try {
                            ((w4u) sm7Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
                            g2 = Collections.singletonList(null);
                        } catch (Throwable th2) {
                            if (th2 instanceof CameraXError) {
                                CameraXError cameraXError2 = th2;
                                g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                            } else {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                        }
                        ce5Var.a(g2);
                        break;
                }
            }
        });
        final int i2 = 1;
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.controlVideoStabilizationMode", j4, obj).G(new ee5() { // from class: dsb0
            @Override // defpackage.ee5
            public final void m(Object obj2, ce5 ce5Var) {
                List g;
                List g2;
                int i22 = i2;
                sm7 sm7Var2 = sm7Var;
                switch (i22) {
                    case 0:
                        try {
                            ((w4u) sm7Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CaptureRequest.CONTROL_AE_LOCK);
                            g = Collections.singletonList(null);
                        } catch (Throwable th) {
                            if (th instanceof CameraXError) {
                                CameraXError cameraXError = th;
                                g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                            } else {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                        }
                        ce5Var.a(g);
                        break;
                    default:
                        try {
                            ((w4u) sm7Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
                            g2 = Collections.singletonList(null);
                        } catch (Throwable th2) {
                            if (th2 instanceof CameraXError) {
                                CameraXError cameraXError2 = th2;
                                g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                            } else {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                        }
                        ce5Var.a(g2);
                        break;
                }
            }
        });
        v83 v83Var2 = new v83(pbjVar);
        rs10 j5 = pbjVar.j();
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.pigeon_defaultConstructor", j5, obj).G(new lz70(14, v83Var2));
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.getCaptureRequestOption", j5, obj).G(new h490(6, v83Var2));
        final n52 n52Var2 = new n52(pbjVar);
        rs10 j6 = pbjVar.j();
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.from", j6, obj).G(new ee5() { // from class: vrb0
            @Override // defpackage.ee5
            public final void m(Object obj2, ce5 ce5Var) {
                List g;
                int i3 = i;
                n52 n52Var3 = n52Var2;
                switch (i3) {
                    case 0:
                        List list = (List) obj2;
                        long longValue = ((Long) list.get(0)).longValue();
                        qp7 qp7Var = (qp7) list.get(1);
                        try {
                            w4u w4uVar = (w4u) n52Var3.a.w;
                            qp7 implementation = qp7Var.getImplementation();
                            d6z.m("CameraControl doesn't contain Camera2 implementation.", implementation instanceof b);
                            w4uVar.j(longValue, ((b) implementation).n);
                            g = Collections.singletonList(null);
                        } catch (Throwable th) {
                            if (th instanceof CameraXError) {
                                CameraXError cameraXError = th;
                                g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                            } else {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                        }
                        ce5Var.a(g);
                        break;
                    default:
                        List list2 = (List) obj2;
                        dm7 dm7Var = (dm7) list2.get(0);
                        b48 b48Var = (b48) list2.get(1);
                        wrb0 wrb0Var = new wrb0(ce5Var, 0);
                        euy a = dm7Var.a(b48Var);
                        sr4 sr4Var = new sr4(15, wrb0Var);
                        a.c(new tqs(0, a, sr4Var), ((Context) n52Var3.a.A).getMainExecutor());
                        break;
                }
            }
        });
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.addCaptureRequestOptions", j6, obj).G(new ee5() { // from class: vrb0
            @Override // defpackage.ee5
            public final void m(Object obj2, ce5 ce5Var) {
                List g;
                int i3 = i2;
                n52 n52Var3 = n52Var2;
                switch (i3) {
                    case 0:
                        List list = (List) obj2;
                        long longValue = ((Long) list.get(0)).longValue();
                        qp7 qp7Var = (qp7) list.get(1);
                        try {
                            w4u w4uVar = (w4u) n52Var3.a.w;
                            qp7 implementation = qp7Var.getImplementation();
                            d6z.m("CameraControl doesn't contain Camera2 implementation.", implementation instanceof b);
                            w4uVar.j(longValue, ((b) implementation).n);
                            g = Collections.singletonList(null);
                        } catch (Throwable th) {
                            if (th instanceof CameraXError) {
                                CameraXError cameraXError = th;
                                g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                            } else {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                        }
                        ce5Var.a(g);
                        break;
                    default:
                        List list2 = (List) obj2;
                        dm7 dm7Var = (dm7) list2.get(0);
                        b48 b48Var = (b48) list2.get(1);
                        wrb0 wrb0Var = new wrb0(ce5Var, 0);
                        euy a = dm7Var.a(b48Var);
                        sr4 sr4Var = new sr4(15, wrb0Var);
                        a.c(new tqs(0, a, sr4Var), ((Context) n52Var3.a.A).getMainExecutor());
                        break;
                }
            }
        });
        String str9 = "dev.flutter.pigeon.camera_android_camerax.ResolutionFilter.createWithOnePreferredSize";
        new m2v(tt5Var, str9, pbjVar.j(), obj).G(new lz70(19, new sm7(pbjVar)));
        lj91.e(tt5Var, new n52(pbjVar));
        jj91.c(tt5Var, new sm7(pbjVar));
        v83 v83Var3 = new v83(pbjVar);
        rs10 j7 = pbjVar.j();
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.createPoint", j7, obj).G(new h490(14, v83Var3));
        new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.createPointWithSize", j7, obj).G(new h490(15, v83Var3));
        String str10 = "dev.flutter.pigeon.camera_android_camerax.DisplayOrientedMeteringPointFactory.pigeon_defaultConstructor";
        new m2v(tt5Var, str10, pbjVar.j(), obj).G(new lz70(15, new v83(pbjVar)));
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        pbj pbjVar = this.b;
        if (pbjVar != null) {
            pbjVar.A = this.a.a;
            pbjVar.a = null;
        }
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        pbj pbjVar = this.b;
        if (pbjVar != null) {
            pbjVar.A = this.a.a;
            pbjVar.a = null;
        }
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        pbj pbjVar = this.b;
        if (pbjVar != null) {
            pbjVar.b = true;
            i3y i3yVar = eu7.b;
            tt5 tt5Var = (tt5) pbjVar.c;
            Object obj = null;
            heb1.f(tt5Var, null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraSize.pigeon_defaultConstructor", new bu7(), obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraIntegerRange.pigeon_defaultConstructor", new bu7(), obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.MeteringPoint.getSize", new bu7(), obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Observer.pigeon_defaultConstructor", new bu7(), obj).G(null);
            bu7 bu7Var = new bu7();
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.getCameraState", bu7Var, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraInfo.getZoomState", bu7Var, obj).G(null);
            oj91.m(tt5Var, null);
            lk91.i(tt5Var, null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Camera.getCameraInfo", new bu7(), obj).G(null);
            zk91.k(tt5Var, null);
            uj91.f(tt5Var, null);
            jk91.c(tt5Var, null);
            bl91.e(tt5Var, null);
            pk91.g(tt5Var, null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.VideoRecordEventListener.pigeon_defaultConstructor", new bu7(), obj).G(null);
            ik91.g(tt5Var, null);
            rk91.g(tt5Var, null);
            dk91.d(tt5Var, null);
            sk91.c(tt5Var, null);
            bu7 bu7Var2 = new bu7();
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.pigeon_defaultConstructor", bu7Var2, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ResolutionSelector.getAspectRatioStrategy", bu7Var2, obj).G(null);
            ij91.b(tt5Var, null);
            ck91.c(tt5Var, null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Analyzer.pigeon_defaultConstructor", new bu7(), obj).G(null);
            hk91.d(tt5Var, null);
            bu7 bu7Var3 = new bu7();
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.getPlanes", bu7Var3, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageProxy.close", bu7Var3, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageProxyUtils.getNv21Buffer", new bu7(), obj).G(null);
            nk91.c(tt5Var, null);
            vj91.b(tt5Var, null);
            mj91.d(tt5Var, null);
            xj91.e(tt5Var, null);
            bu7 bu7Var4 = new bu7();
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.controlAELock", bu7Var4, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CaptureRequest.controlVideoStabilizationMode", bu7Var4, obj).G(null);
            bu7 bu7Var5 = new bu7();
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.pigeon_defaultConstructor", bu7Var5, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.getCaptureRequestOption", bu7Var5, obj).G(null);
            bu7 bu7Var6 = new bu7();
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.from", bu7Var6, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.addCaptureRequestOptions", bu7Var6, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ResolutionFilter.createWithOnePreferredSize", new bu7(), obj).G(null);
            lj91.e(tt5Var, null);
            jj91.c(tt5Var, null);
            bu7 bu7Var7 = new bu7();
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.createPoint", bu7Var7, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.MeteringPointFactory.createPointWithSize", bu7Var7, obj).G(null);
            new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.DisplayOrientedMeteringPointFactory.pigeon_defaultConstructor", new bu7(), obj).G(null);
            w4u w4uVar = (w4u) this.b.w;
            ((Handler) w4uVar.d).removeCallbacks((dn7) w4uVar.l);
            w4uVar.e = true;
            this.b = null;
        }
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        pbj pbjVar = this.b;
        if (pbjVar != null) {
            pbjVar.A = (Activity) ((wrr) l40Var).b;
            pbjVar.a = new m6(27, l40Var);
        }
    }
}
