package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import android.util.Range;
import androidx.camera.core.impl.Config$OptionPriority;
import androidx.camera.video.i;
import io.flutter.plugins.camerax.CameraXError;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class bl91 {
    public static final String[] a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] b = {44100, 48000, 32000};
    public static final int[] c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final void a(zwf0 zwf0Var, u28 u28Var, jhg0 jhg0Var) {
        zwf0Var.f("WebChatCapabilityRegistrar", b64.l("Failed to register ", z28.a(u28Var.a()), Extension.COLON_SPACE, jhg0Var.b));
    }

    public static int b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? e[i4 - 1] : f[i4 - 1] : g[i4 - 1];
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        return (((i3 == 1 ? 72 : 144) * i8) / i6) + i7;
    }

    public static long c(double d2) {
        ffx.l("not a normal value", d(d2));
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean d(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static void e(tt5 tt5Var, final n52 n52Var) {
        rs10 j = n52Var != null ? n52Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.VideoCapture.withOutput", j, obj);
        if (n52Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: btb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g2;
                    List g3;
                    List g4;
                    int i2 = i;
                    n52 n52Var2 = n52Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            lm31 lm31Var = (lm31) list.get(1);
                            Range range = (Range) list.get(2);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                yy40 yy40Var = new al31(lm31Var).a;
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, new i(new el31(ug70.a(yy40Var))));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g2 = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g2 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 1:
                            i iVar = (i) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g3 = Collections.singletonList(iVar.N());
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g3 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g3 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list2 = (List) obj2;
                            i iVar2 = (i) list2.get(0);
                            long longValue2 = ((Long) list2.get(1)).longValue();
                            try {
                                n52Var2.getClass();
                                if (iVar2.D((int) longValue2)) {
                                    iVar2.R();
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g4 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g4 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
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
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.VideoCapture.getOutput", j, obj);
        if (n52Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: btb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i2;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            lm31 lm31Var = (lm31) list.get(1);
                            Range range = (Range) list.get(2);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                yy40 yy40Var = new al31(lm31Var).a;
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, new i(new el31(ug70.a(yy40Var))));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g2 = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g2 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 1:
                            i iVar = (i) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g3 = Collections.singletonList(iVar.N());
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g3 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g3 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list2 = (List) obj2;
                            i iVar2 = (i) list2.get(0);
                            long longValue2 = ((Long) list2.get(1)).longValue();
                            try {
                                n52Var2.getClass();
                                if (iVar2.D((int) longValue2)) {
                                    iVar2.R();
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g4 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g4 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
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
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.VideoCapture.setTargetRotation", j, obj);
        if (n52Var == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: btb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i3;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            lm31 lm31Var = (lm31) list.get(1);
                            Range range = (Range) list.get(2);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                yy40 yy40Var = new al31(lm31Var).a;
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, new i(new el31(ug70.a(yy40Var))));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g2 = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g2 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 1:
                            i iVar = (i) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g3 = Collections.singletonList(iVar.N());
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g3 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g3 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        default:
                            List list2 = (List) obj2;
                            i iVar2 = (i) list2.get(0);
                            long longValue2 = ((Long) list2.get(1)).longValue();
                            try {
                                n52Var2.getClass();
                                if (iVar2.D((int) longValue2)) {
                                    iVar2.R();
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g4 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g4 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
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
