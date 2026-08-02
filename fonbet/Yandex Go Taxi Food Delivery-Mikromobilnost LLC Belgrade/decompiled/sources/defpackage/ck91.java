package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Log;
import android.util.Range;
import androidx.camera.core.f;
import androidx.camera.core.impl.Config$OptionPriority;
import io.flutter.plugins.camerax.CameraXError;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ck91 {
    public static final r96 a = new r96("Div.ViewPool.enabled", Boolean.TRUE);

    public static final void a(h141 h141Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1460325071);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(h141Var) : btsVar.e(h141Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 18;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(-1154939441, true, new u5(tlsVar, 12, h141Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(h141Var, tlsVar, i, i3);
        }
    }

    public static ryl b() {
        return (ryl) ryl.c.getValue();
    }

    public static void c(tt5 tt5Var, final sm7 sm7Var) {
        pbj pbjVar;
        rs10 bu7Var = (sm7Var == null || (pbjVar = sm7Var.a) == null) ? new bu7() : pbjVar.j();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.pigeon_defaultConstructor", bu7Var, obj);
        if (sm7Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: msb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i2 = i;
                    sm7 sm7Var2 = sm7Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            Long l2 = (Long) list.get(4);
                            try {
                                w4u w4uVar = (w4u) sm7Var2.a.w;
                                v7v v7vVar = new v7v();
                                yy40 yy40Var = v7vVar.a;
                                if (bsj0Var != null) {
                                    v7vVar.h(bsj0Var);
                                }
                                if (l != null) {
                                    yy40Var.w(icv.n2, Integer.valueOf(l.intValue()));
                                }
                                if (l2 != null) {
                                    yy40Var.w(b8v.x, Integer.valueOf(l2.intValue()));
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, v7vVar.f());
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
                        case 1:
                            List list2 = (List) obj2;
                            f fVar = (f) list2.get(0);
                            t7v t7vVar = (t7v) list2.get(1);
                            try {
                                pbj pbjVar2 = sm7Var2.a;
                                w4u w4uVar2 = (w4u) pbjVar2.w;
                                ((Handler) w4uVar2.d).removeCallbacks((dn7) w4uVar2.l);
                                w4uVar2.f = 1000L;
                                w4uVar2.n();
                                fVar.N(((Context) pbjVar2.A).getMainExecutor(), t7vVar);
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
                        case 2:
                            f fVar2 = (f) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                fVar2.H();
                                w4u w4uVar3 = (w4u) sm7Var2.a.w;
                                ((Handler) w4uVar3.d).removeCallbacks((dn7) w4uVar3.l);
                                w4uVar3.f = 3000L;
                                w4uVar3.n();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list3 = (List) obj2;
                            f fVar3 = (f) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                sm7Var2.getClass();
                                if (fVar3.D((int) longValue2)) {
                                    fVar3.O();
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.setAnalyzer", bu7Var, obj);
        if (sm7Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: msb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i2;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            Long l2 = (Long) list.get(4);
                            try {
                                w4u w4uVar = (w4u) sm7Var2.a.w;
                                v7v v7vVar = new v7v();
                                yy40 yy40Var = v7vVar.a;
                                if (bsj0Var != null) {
                                    v7vVar.h(bsj0Var);
                                }
                                if (l != null) {
                                    yy40Var.w(icv.n2, Integer.valueOf(l.intValue()));
                                }
                                if (l2 != null) {
                                    yy40Var.w(b8v.x, Integer.valueOf(l2.intValue()));
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, v7vVar.f());
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
                        case 1:
                            List list2 = (List) obj2;
                            f fVar = (f) list2.get(0);
                            t7v t7vVar = (t7v) list2.get(1);
                            try {
                                pbj pbjVar2 = sm7Var2.a;
                                w4u w4uVar2 = (w4u) pbjVar2.w;
                                ((Handler) w4uVar2.d).removeCallbacks((dn7) w4uVar2.l);
                                w4uVar2.f = 1000L;
                                w4uVar2.n();
                                fVar.N(((Context) pbjVar2.A).getMainExecutor(), t7vVar);
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
                        case 2:
                            f fVar2 = (f) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                fVar2.H();
                                w4u w4uVar3 = (w4u) sm7Var2.a.w;
                                ((Handler) w4uVar3.d).removeCallbacks((dn7) w4uVar3.l);
                                w4uVar3.f = 3000L;
                                w4uVar3.n();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list3 = (List) obj2;
                            f fVar3 = (f) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                sm7Var2.getClass();
                                if (fVar3.D((int) longValue2)) {
                                    fVar3.O();
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.clearAnalyzer", bu7Var, obj);
        if (sm7Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: msb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i3;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            Long l2 = (Long) list.get(4);
                            try {
                                w4u w4uVar = (w4u) sm7Var2.a.w;
                                v7v v7vVar = new v7v();
                                yy40 yy40Var = v7vVar.a;
                                if (bsj0Var != null) {
                                    v7vVar.h(bsj0Var);
                                }
                                if (l != null) {
                                    yy40Var.w(icv.n2, Integer.valueOf(l.intValue()));
                                }
                                if (l2 != null) {
                                    yy40Var.w(b8v.x, Integer.valueOf(l2.intValue()));
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, v7vVar.f());
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
                        case 1:
                            List list2 = (List) obj2;
                            f fVar = (f) list2.get(0);
                            t7v t7vVar = (t7v) list2.get(1);
                            try {
                                pbj pbjVar2 = sm7Var2.a;
                                w4u w4uVar2 = (w4u) pbjVar2.w;
                                ((Handler) w4uVar2.d).removeCallbacks((dn7) w4uVar2.l);
                                w4uVar2.f = 1000L;
                                w4uVar2.n();
                                fVar.N(((Context) pbjVar2.A).getMainExecutor(), t7vVar);
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
                        case 2:
                            f fVar2 = (f) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                fVar2.H();
                                w4u w4uVar3 = (w4u) sm7Var2.a.w;
                                ((Handler) w4uVar3.d).removeCallbacks((dn7) w4uVar3.l);
                                w4uVar3.f = 3000L;
                                w4uVar3.n();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list3 = (List) obj2;
                            f fVar3 = (f) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                sm7Var2.getClass();
                                if (fVar3.D((int) longValue2)) {
                                    fVar3.O();
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.setTargetRotation", bu7Var, obj);
        if (sm7Var == null) {
            m2vVar4.G(null);
        } else {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: msb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i4;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            Long l2 = (Long) list.get(4);
                            try {
                                w4u w4uVar = (w4u) sm7Var2.a.w;
                                v7v v7vVar = new v7v();
                                yy40 yy40Var = v7vVar.a;
                                if (bsj0Var != null) {
                                    v7vVar.h(bsj0Var);
                                }
                                if (l != null) {
                                    yy40Var.w(icv.n2, Integer.valueOf(l.intValue()));
                                }
                                if (l2 != null) {
                                    yy40Var.w(b8v.x, Integer.valueOf(l2.intValue()));
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, v7vVar.f());
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
                        case 1:
                            List list2 = (List) obj2;
                            f fVar = (f) list2.get(0);
                            t7v t7vVar = (t7v) list2.get(1);
                            try {
                                pbj pbjVar2 = sm7Var2.a;
                                w4u w4uVar2 = (w4u) pbjVar2.w;
                                ((Handler) w4uVar2.d).removeCallbacks((dn7) w4uVar2.l);
                                w4uVar2.f = 1000L;
                                w4uVar2.n();
                                fVar.N(((Context) pbjVar2.A).getMainExecutor(), t7vVar);
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
                        case 2:
                            f fVar2 = (f) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                fVar2.H();
                                w4u w4uVar3 = (w4u) sm7Var2.a.w;
                                ((Handler) w4uVar3.d).removeCallbacks((dn7) w4uVar3.l);
                                w4uVar3.f = 3000L;
                                w4uVar3.n();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list3 = (List) obj2;
                            f fVar3 = (f) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                sm7Var2.getClass();
                                if (fVar3.D((int) longValue2)) {
                                    fVar3.O();
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                    }
                }
            });
        }
    }
}
