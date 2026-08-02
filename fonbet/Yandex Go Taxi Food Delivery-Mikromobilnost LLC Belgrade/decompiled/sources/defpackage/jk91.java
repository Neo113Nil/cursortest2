package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.g;
import androidx.camera.core.impl.Config$OptionPriority;
import androidx.compose.runtime.f;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.c3;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.view.TextureRegistry$SurfaceLifecycle;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class jk91 {
    public static final bgc a = new bgc(12);

    public static final void a(b441 b441Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-212973045);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(b441Var) : btsVar2.e(b441Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = n.f(b441Var.b, btsVar2);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = n.f(b441Var.c, btsVar2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = f.j(String.valueOf((int) b441Var.a));
                btsVar2.o0(Q3);
            }
            oz40 oz40Var3 = (oz40) Q3;
            Object Q4 = btsVar2.Q();
            if (Q4 == o430Var) {
                Q4 = f.j(Boolean.FALSE);
                btsVar2.o0(Q4);
            }
            btsVar = btsVar2;
            qy20.a(null, null, null, false, wwg.S(-1631669207, true, new ags0(oz40Var, oz40Var2, oz40Var3, (oz40) Q4, tlsVar, b441Var, 1), btsVar2), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(b441Var, tlsVar, i, 20);
        }
    }

    public static Expression b(c3 c3Var) {
        if (c3Var instanceof fnl) {
            return ((fnl) c3Var).c.b;
        }
        if (c3Var instanceof bnl) {
            return ((bnl) c3Var).c.b;
        }
        if (c3Var instanceof anl) {
            return ((anl) c3Var).c.b;
        }
        if (c3Var instanceof xml) {
            return ((xml) c3Var).c.b;
        }
        if (c3Var instanceof yml) {
            return ((yml) c3Var).c.b;
        }
        if (c3Var instanceof inl) {
            return ((inl) c3Var).c.b;
        }
        if (c3Var instanceof zml) {
            return ((zml) c3Var).c.b;
        }
        if (c3Var instanceof wml) {
            return ((wml) c3Var).c.b;
        }
        if (c3Var instanceof dnl) {
            return null;
        }
        w511.b();
        return null;
    }

    public static void c(tt5 tt5Var, final oy80 oy80Var) {
        rs10 j = oy80Var != null ? ((pbj) oy80Var.b).j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Preview.pigeon_defaultConstructor", j, obj);
        if (oy80Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: rsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List g4;
                    List g5;
                    List g6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    int i2 = i;
                    zrj0 zrj0Var = null;
                    oy80 oy80Var2 = oy80Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                w4u w4uVar = (w4u) ((pbj) oy80Var2.b).w;
                                pxe0 pxe0Var = new pxe0();
                                yy40 yy40Var = pxe0Var.a;
                                if (l != null) {
                                    pxe0Var.h(l.intValue());
                                }
                                if (bsj0Var != null) {
                                    yy40Var.w(icv.w2, bsj0Var);
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, pxe0Var.f());
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
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            g gVar = (g) list2.get(0);
                            v3x0 v3x0Var = (v3x0) list2.get(1);
                            try {
                                xuy0 xuy0Var = (xuy0) ((pbj) oy80Var2.b).z;
                                xuy0Var.getClass();
                                TextureRegistry$SurfaceProducer b = ((io.flutter.embedding.engine.renderer.f) xuy0Var).b(TextureRegistry$SurfaceLifecycle.manual);
                                gVar.J(new t26(18, oy80Var2, b, v3x0Var));
                                ((HashMap) oy80Var2.c).put(gVar, b);
                                g2 = Collections.singletonList(Long.valueOf(b.id()));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).remove((g) ((List) obj2).get(0));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            g3 = Collections.singletonList(null);
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                oy80Var2.getClass();
                                br7 e = gVar2.e();
                                Size d = gVar2.d();
                                if (e != null && d != null) {
                                    Rect rect = gVar2.k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, d.getWidth(), d.getHeight());
                                    }
                                    zrj0Var = new zrj0(gVar2.j(e, false), rect, d);
                                }
                                g4 = Collections.singletonList(zrj0Var);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list3 = (List) obj2;
                            g gVar3 = (g) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                oy80Var2.getClass();
                                if (gVar3.D((int) longValue2)) {
                                    gVar3.I();
                                }
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).get((g) ((List) obj2).get(0));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            g6 = Collections.singletonList(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Preview.setSurfaceProvider", j, obj);
        if (oy80Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: rsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List g4;
                    List g5;
                    List g6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    int i22 = i2;
                    zrj0 zrj0Var = null;
                    oy80 oy80Var2 = oy80Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                w4u w4uVar = (w4u) ((pbj) oy80Var2.b).w;
                                pxe0 pxe0Var = new pxe0();
                                yy40 yy40Var = pxe0Var.a;
                                if (l != null) {
                                    pxe0Var.h(l.intValue());
                                }
                                if (bsj0Var != null) {
                                    yy40Var.w(icv.w2, bsj0Var);
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, pxe0Var.f());
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
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            g gVar = (g) list2.get(0);
                            v3x0 v3x0Var = (v3x0) list2.get(1);
                            try {
                                xuy0 xuy0Var = (xuy0) ((pbj) oy80Var2.b).z;
                                xuy0Var.getClass();
                                TextureRegistry$SurfaceProducer b = ((io.flutter.embedding.engine.renderer.f) xuy0Var).b(TextureRegistry$SurfaceLifecycle.manual);
                                gVar.J(new t26(18, oy80Var2, b, v3x0Var));
                                ((HashMap) oy80Var2.c).put(gVar, b);
                                g2 = Collections.singletonList(Long.valueOf(b.id()));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).remove((g) ((List) obj2).get(0));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            g3 = Collections.singletonList(null);
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                oy80Var2.getClass();
                                br7 e = gVar2.e();
                                Size d = gVar2.d();
                                if (e != null && d != null) {
                                    Rect rect = gVar2.k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, d.getWidth(), d.getHeight());
                                    }
                                    zrj0Var = new zrj0(gVar2.j(e, false), rect, d);
                                }
                                g4 = Collections.singletonList(zrj0Var);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list3 = (List) obj2;
                            g gVar3 = (g) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                oy80Var2.getClass();
                                if (gVar3.D((int) longValue2)) {
                                    gVar3.I();
                                }
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).get((g) ((List) obj2).get(0));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            g6 = Collections.singletonList(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Preview.releaseSurfaceProvider", j, obj);
        if (oy80Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: rsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List g4;
                    List g5;
                    List g6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    int i22 = i3;
                    zrj0 zrj0Var = null;
                    oy80 oy80Var2 = oy80Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                w4u w4uVar = (w4u) ((pbj) oy80Var2.b).w;
                                pxe0 pxe0Var = new pxe0();
                                yy40 yy40Var = pxe0Var.a;
                                if (l != null) {
                                    pxe0Var.h(l.intValue());
                                }
                                if (bsj0Var != null) {
                                    yy40Var.w(icv.w2, bsj0Var);
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, pxe0Var.f());
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
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            g gVar = (g) list2.get(0);
                            v3x0 v3x0Var = (v3x0) list2.get(1);
                            try {
                                xuy0 xuy0Var = (xuy0) ((pbj) oy80Var2.b).z;
                                xuy0Var.getClass();
                                TextureRegistry$SurfaceProducer b = ((io.flutter.embedding.engine.renderer.f) xuy0Var).b(TextureRegistry$SurfaceLifecycle.manual);
                                gVar.J(new t26(18, oy80Var2, b, v3x0Var));
                                ((HashMap) oy80Var2.c).put(gVar, b);
                                g2 = Collections.singletonList(Long.valueOf(b.id()));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).remove((g) ((List) obj2).get(0));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            g3 = Collections.singletonList(null);
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                oy80Var2.getClass();
                                br7 e = gVar2.e();
                                Size d = gVar2.d();
                                if (e != null && d != null) {
                                    Rect rect = gVar2.k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, d.getWidth(), d.getHeight());
                                    }
                                    zrj0Var = new zrj0(gVar2.j(e, false), rect, d);
                                }
                                g4 = Collections.singletonList(zrj0Var);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list3 = (List) obj2;
                            g gVar3 = (g) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                oy80Var2.getClass();
                                if (gVar3.D((int) longValue2)) {
                                    gVar3.I();
                                }
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).get((g) ((List) obj2).get(0));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            g6 = Collections.singletonList(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Preview.getResolutionInfo", j, obj);
        if (oy80Var != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: rsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List g4;
                    List g5;
                    List g6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    int i22 = i4;
                    zrj0 zrj0Var = null;
                    oy80 oy80Var2 = oy80Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                w4u w4uVar = (w4u) ((pbj) oy80Var2.b).w;
                                pxe0 pxe0Var = new pxe0();
                                yy40 yy40Var = pxe0Var.a;
                                if (l != null) {
                                    pxe0Var.h(l.intValue());
                                }
                                if (bsj0Var != null) {
                                    yy40Var.w(icv.w2, bsj0Var);
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, pxe0Var.f());
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
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            g gVar = (g) list2.get(0);
                            v3x0 v3x0Var = (v3x0) list2.get(1);
                            try {
                                xuy0 xuy0Var = (xuy0) ((pbj) oy80Var2.b).z;
                                xuy0Var.getClass();
                                TextureRegistry$SurfaceProducer b = ((io.flutter.embedding.engine.renderer.f) xuy0Var).b(TextureRegistry$SurfaceLifecycle.manual);
                                gVar.J(new t26(18, oy80Var2, b, v3x0Var));
                                ((HashMap) oy80Var2.c).put(gVar, b);
                                g2 = Collections.singletonList(Long.valueOf(b.id()));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).remove((g) ((List) obj2).get(0));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            g3 = Collections.singletonList(null);
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                oy80Var2.getClass();
                                br7 e = gVar2.e();
                                Size d = gVar2.d();
                                if (e != null && d != null) {
                                    Rect rect = gVar2.k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, d.getWidth(), d.getHeight());
                                    }
                                    zrj0Var = new zrj0(gVar2.j(e, false), rect, d);
                                }
                                g4 = Collections.singletonList(zrj0Var);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list3 = (List) obj2;
                            g gVar3 = (g) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                oy80Var2.getClass();
                                if (gVar3.D((int) longValue2)) {
                                    gVar3.I();
                                }
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).get((g) ((List) obj2).get(0));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            g6 = Collections.singletonList(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Preview.setTargetRotation", j, obj);
        if (oy80Var != null) {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: rsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List g4;
                    List g5;
                    List g6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    int i22 = i5;
                    zrj0 zrj0Var = null;
                    oy80 oy80Var2 = oy80Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                w4u w4uVar = (w4u) ((pbj) oy80Var2.b).w;
                                pxe0 pxe0Var = new pxe0();
                                yy40 yy40Var = pxe0Var.a;
                                if (l != null) {
                                    pxe0Var.h(l.intValue());
                                }
                                if (bsj0Var != null) {
                                    yy40Var.w(icv.w2, bsj0Var);
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, pxe0Var.f());
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
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            g gVar = (g) list2.get(0);
                            v3x0 v3x0Var = (v3x0) list2.get(1);
                            try {
                                xuy0 xuy0Var = (xuy0) ((pbj) oy80Var2.b).z;
                                xuy0Var.getClass();
                                TextureRegistry$SurfaceProducer b = ((io.flutter.embedding.engine.renderer.f) xuy0Var).b(TextureRegistry$SurfaceLifecycle.manual);
                                gVar.J(new t26(18, oy80Var2, b, v3x0Var));
                                ((HashMap) oy80Var2.c).put(gVar, b);
                                g2 = Collections.singletonList(Long.valueOf(b.id()));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).remove((g) ((List) obj2).get(0));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            g3 = Collections.singletonList(null);
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                oy80Var2.getClass();
                                br7 e = gVar2.e();
                                Size d = gVar2.d();
                                if (e != null && d != null) {
                                    Rect rect = gVar2.k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, d.getWidth(), d.getHeight());
                                    }
                                    zrj0Var = new zrj0(gVar2.j(e, false), rect, d);
                                }
                                g4 = Collections.singletonList(zrj0Var);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list3 = (List) obj2;
                            g gVar3 = (g) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                oy80Var2.getClass();
                                if (gVar3.D((int) longValue2)) {
                                    gVar3.I();
                                }
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).get((g) ((List) obj2).get(0));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            g6 = Collections.singletonList(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Preview.surfaceProducerHandlesCropAndRotation", j, obj);
        if (oy80Var == null) {
            m2vVar6.G(null);
        } else {
            final int i6 = 5;
            m2vVar6.G(new ee5() { // from class: rsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer;
                    List g4;
                    List g5;
                    List g6;
                    TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer2;
                    int i22 = i6;
                    zrj0 zrj0Var = null;
                    oy80 oy80Var2 = oy80Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            Range range = (Range) list.get(3);
                            try {
                                w4u w4uVar = (w4u) ((pbj) oy80Var2.b).w;
                                pxe0 pxe0Var = new pxe0();
                                yy40 yy40Var = pxe0Var.a;
                                if (l != null) {
                                    pxe0Var.h(l.intValue());
                                }
                                if (bsj0Var != null) {
                                    yy40Var.w(icv.w2, bsj0Var);
                                }
                                if (range != null) {
                                    yy40Var.t(wn7.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), Config$OptionPriority.ALWAYS_OVERRIDE, range);
                                }
                                w4uVar.j(longValue, pxe0Var.f());
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
                            return;
                        case 1:
                            List list2 = (List) obj2;
                            g gVar = (g) list2.get(0);
                            v3x0 v3x0Var = (v3x0) list2.get(1);
                            try {
                                xuy0 xuy0Var = (xuy0) ((pbj) oy80Var2.b).z;
                                xuy0Var.getClass();
                                TextureRegistry$SurfaceProducer b = ((io.flutter.embedding.engine.renderer.f) xuy0Var).b(TextureRegistry$SurfaceLifecycle.manual);
                                gVar.J(new t26(18, oy80Var2, b, v3x0Var));
                                ((HashMap) oy80Var2.c).put(gVar, b);
                                g2 = Collections.singletonList(Long.valueOf(b.id()));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            return;
                        case 2:
                            try {
                                textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).remove((g) ((List) obj2).get(0));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer == null) {
                                throw new IllegalStateException("releaseFlutterSurfaceTexture() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            textureRegistry$SurfaceProducer.release();
                            g3 = Collections.singletonList(null);
                            ce5Var.a(g3);
                            return;
                        case 3:
                            g gVar2 = (g) ((List) obj2).get(0);
                            try {
                                oy80Var2.getClass();
                                br7 e = gVar2.e();
                                Size d = gVar2.d();
                                if (e != null && d != null) {
                                    Rect rect = gVar2.k;
                                    if (rect == null) {
                                        rect = new Rect(0, 0, d.getWidth(), d.getHeight());
                                    }
                                    zrj0Var = new zrj0(gVar2.j(e, false), rect, d);
                                }
                                g4 = Collections.singletonList(zrj0Var);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        case 4:
                            List list3 = (List) obj2;
                            g gVar3 = (g) list3.get(0);
                            long longValue2 = ((Long) list3.get(1)).longValue();
                            try {
                                oy80Var2.getClass();
                                if (gVar3.D((int) longValue2)) {
                                    gVar3.I();
                                }
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                        default:
                            try {
                                textureRegistry$SurfaceProducer2 = (TextureRegistry$SurfaceProducer) ((HashMap) oy80Var2.c).get((g) ((List) obj2).get(0));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            if (textureRegistry$SurfaceProducer2 == null) {
                                throw new IllegalStateException("surfaceProducerHandlesCropAndRotation() cannot be called if the flutterSurfaceProducer for the camera preview has not yet been initialized.");
                            }
                            g6 = Collections.singletonList(Boolean.valueOf(textureRegistry$SurfaceProducer2.handlesCropAndRotation()));
                            ce5Var.a(g6);
                            return;
                    }
                }
            });
        }
    }

    public static String d(c3 c3Var) {
        if (c3Var instanceof fnl) {
            return ((fnl) c3Var).c.a;
        }
        if (c3Var instanceof bnl) {
            return ((bnl) c3Var).c.a;
        }
        if (c3Var instanceof anl) {
            return ((anl) c3Var).c.a;
        }
        if (c3Var instanceof xml) {
            return ((xml) c3Var).c.a;
        }
        if (c3Var instanceof yml) {
            return ((yml) c3Var).c.a;
        }
        if (c3Var instanceof inl) {
            return ((inl) c3Var).c.a;
        }
        if (c3Var instanceof zml) {
            return ((zml) c3Var).c.a;
        }
        if (c3Var instanceof wml) {
            return ((wml) c3Var).c.a;
        }
        if (c3Var instanceof dnl) {
            return ((dnl) c3Var).c.b;
        }
        w511.b();
        return null;
    }
}
