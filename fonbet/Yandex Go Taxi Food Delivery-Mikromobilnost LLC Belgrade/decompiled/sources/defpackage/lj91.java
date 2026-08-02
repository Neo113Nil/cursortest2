package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Size;
import android.view.View;
import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;
import io.flutter.plugins.camerax.CameraXError;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes4.dex */
public abstract class lj91 {
    public static final Size a(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new Size(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static final ppl b(TransactionsLoadType transactionsLoadType, ppl pplVar, ppl pplVar2) {
        String str = pplVar2.b;
        int i = qpl.a[transactionsLoadType.ordinal()];
        List list = pplVar2;
        if (i != 1) {
            list = pplVar2;
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                list = a.m0(pplVar2, pplVar);
            }
        }
        return new ppl(list, str);
    }

    public static final f530 c(f530 f530Var, tls tlsVar) {
        return f530Var.k(new kix(tlsVar, null));
    }

    public static final f530 d(f530 f530Var, tls tlsVar) {
        return f530Var.k(new kix(null, tlsVar));
    }

    public static void e(tt5 tt5Var, final n52 n52Var) {
        rs10 j = n52Var != null ? n52Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.infoSupportedHardwareLevel", j, obj);
        if (n52Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: yrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i2 = i;
                    n52 n52Var2 = n52Var;
                    switch (i2) {
                        case 0:
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
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
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CameraCharacteristics.SENSOR_ORIENTATION);
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
                        default:
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
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
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.sensorOrientation", j, obj);
        if (n52Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: yrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i2;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
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
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CameraCharacteristics.SENSOR_ORIENTATION);
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
                        default:
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
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
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.controlAvailableVideoStabilizationModes", j, obj);
        if (n52Var == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: yrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i3;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
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
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CameraCharacteristics.SENSOR_ORIENTATION);
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
                        default:
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
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
                    }
                }
            });
        }
    }
}
