package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.animation.k;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.asr0;
import defpackage.bts;
import defpackage.ck11;
import defpackage.cx20;
import defpackage.cz20;
import defpackage.did;
import defpackage.fc01;
import defpackage.fid;
import defpackage.kyh0;
import defpackage.o430;
import defpackage.rz20;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tls;
import defpackage.ubn;
import defpackage.ur70;
import defpackage.w2o;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.zmo;
import defpackage.zpn;
import defpackage.zy11;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.CameraXFlashMode;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class dk91 {
    public static final void a(float f, int i, int i2, long j, fid fidVar, f530 f530Var) {
        f530 f530Var2;
        int i3;
        float f2;
        f530 f530Var3;
        long j2;
        float f3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2063647660);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i5 = i3 | (((i2 & 2) == 0 && btsVar.d(j)) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i & 384) == 0) {
            i5 |= btsVar.b(f) ? 256 : 128;
        }
        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530Var3 = i4 != 0 ? c530.a : f530Var2;
                j2 = (i2 & 2) != 0 ? ((el51) btsVar.m(gl51.a)).l() : j;
                f3 = i6 != 0 ? 0.5f : f;
            } else {
                btsVar.Y();
                f3 = f;
                f530Var3 = f530Var2;
                j2 = j;
            }
            btsVar.u();
            pi6.a(m4m0.b(ljs0.e(ljs0.c(f530Var3, 1.0f), f3), j2, qke.q), btsVar, 0);
            f2 = f3;
        } else {
            btsVar.Y();
            f2 = f;
            f530Var3 = f530Var2;
            j2 = j;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zql(f530Var3, j2, f2, i, i2);
        }
    }

    public static final void b(long j, float f, float f2, fid fidVar, final int i, final int i2) {
        final float f3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1764749537);
        int i3 = i | 2;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 50;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.b(f) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.b(f2) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                j = ((el51) btsVar.m(gl51.a)).l();
                if (i4 != 0) {
                    f = 0.5f;
                }
                if (i5 != 0) {
                    f3 = 0.0f;
                    btsVar.u();
                    pi6.a(m4m0.b(ljs0.q(an91.m(ljs0.b, 0.0f, f3, 1), f), j, qke.q), btsVar, 0);
                }
            } else {
                btsVar.Y();
            }
            f3 = f2;
            btsVar.u();
            pi6.a(m4m0.b(ljs0.q(an91.m(ljs0.b, 0.0f, f3, 1), f), j, qke.q), btsVar, 0);
        } else {
            btsVar.Y();
            f3 = f2;
        }
        final long j2 = j;
        final float f4 = f;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: rgy
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dk91.b(j2, f4, f3, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-53234415);
        int i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            rzo.b(null, "default", wwg.S(1537225005, true, new wls() { // from class: com.yandex.go.walking.navigation.impl.guidance.exit_options.a
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    boolean V = btsVar2.V(intValue & 1, (intValue & 3) != 2);
                    zy11 zy11Var = zy11.a;
                    if (!V) {
                        btsVar2.Y();
                        return zy11Var;
                    }
                    rz20 a = com.yandex.go.design.compose.modal.utils.a.a(false, null, btsVar2, 6, 6);
                    boolean k = btsVar2.k(a);
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    if (k || Q == o430Var) {
                        Q = new WalkNavGuidanceExitOptionsModalScreenKt$WalkNavGuidanceExitOptionsModalScreen$1$1$1(a, null);
                        btsVar2.o0(Q);
                    }
                    zpn.e(btsVar2, (wls) Q, zy11Var);
                    ck11 K = sb2.K(300, 0, ubn.a, 2);
                    Object Q2 = btsVar2.Q();
                    int i3 = 29;
                    if (Q2 == o430Var) {
                        Q2 = new ur70(i3);
                        btsVar2.o0(Q2);
                    }
                    w2o p = k.p(K, (tls) Q2);
                    Object Q3 = btsVar2.Q();
                    if (Q3 == o430Var) {
                        Q3 = new ur70(i3);
                        btsVar2.o0(Q3);
                    }
                    zmo u = k.u(K, (tls) Q3);
                    AppColor$Palette appColor$Palette = AppColor$Palette.Fog;
                    tls tlsVar2 = tls.this;
                    boolean k2 = btsVar2.k(tlsVar2);
                    Object Q4 = btsVar2.Q();
                    if (k2 || Q4 == o430Var) {
                        Q4 = new fc01(12, tlsVar2);
                        btsVar2.o0(Q4);
                    }
                    cx20.a(null, a, new cz20((wp2) appColor$Palette, (sls) Q4, true, Integer.valueOf(kyh0.common_close)), p, u, true, true, null, wwg.S(1382278751, true, new asr0(5, tlsVar2), btsVar2), btsVar2, 102432768, HProv.PP_SECURITY_LEVEL);
                    return zy11Var;
                }
            }, btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rhi0(i, 10, tlsVar);
        }
    }

    public static void d(tt5 tt5Var, final n52 n52Var) {
        rs10 j = n52Var != null ? n52Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.pigeon_defaultConstructor", j, obj);
        if (n52Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: nsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i2 = i;
                    int i3 = 2;
                    n52 n52Var2 = n52Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            CameraXFlashMode cameraXFlashMode = (CameraXFlashMode) list.get(3);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                q8v q8vVar = new q8v();
                                yy40 yy40Var = q8vVar.a;
                                if (l != null) {
                                    q8vVar.i(l.intValue());
                                }
                                if (cameraXFlashMode != null) {
                                    int i4 = z8v.a[cameraXFlashMode.ordinal()];
                                    if (i4 == 1) {
                                        yy40Var.w(x8v.c, 0);
                                    } else if (i4 == 2) {
                                        yy40Var.w(x8v.c, 2);
                                    } else if (i4 == 3) {
                                        yy40Var.w(x8v.c, 1);
                                    }
                                }
                                if (bsj0Var != null) {
                                    q8vVar.h(bsj0Var);
                                }
                                w4uVar.j(longValue, q8vVar.f());
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
                            w8v w8vVar = (w8v) list2.get(0);
                            CameraXFlashMode cameraXFlashMode2 = (CameraXFlashMode) list2.get(1);
                            try {
                                n52Var2.getClass();
                                int i5 = z8v.a[cameraXFlashMode2.ordinal()];
                                if (i5 == 1) {
                                    i3 = 0;
                                } else if (i5 != 2) {
                                    i3 = i5 != 3 ? -1 : 1;
                                }
                                w8vVar.M(i3);
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
                            List list3 = (List) obj2;
                            w8v w8vVar2 = (w8v) list3.get(0);
                            v3x0 v3x0Var = (v3x0) list3.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 7);
                            try {
                                File createTempFile = File.createTempFile("CAP", ".jpg", ((Context) n52Var2.a.A).getCacheDir());
                                w8vVar2.O(new r1s(createTempFile, (OutputStream) null, (s8v) null), Executors.newSingleThreadExecutor(), new wjm(n52Var2, createTempFile, wrb0Var, v3x0Var));
                                break;
                            } catch (IOException | SecurityException e) {
                                czj0.a(wrb0Var, e);
                                return;
                            }
                        default:
                            List list4 = (List) obj2;
                            w8v w8vVar3 = (w8v) list4.get(0);
                            long longValue2 = ((Long) list4.get(1)).longValue();
                            try {
                                n52Var2.getClass();
                                w8vVar3.N((int) longValue2);
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
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.setFlashMode", j, obj);
        if (n52Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: nsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i2;
                    int i3 = 2;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            CameraXFlashMode cameraXFlashMode = (CameraXFlashMode) list.get(3);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                q8v q8vVar = new q8v();
                                yy40 yy40Var = q8vVar.a;
                                if (l != null) {
                                    q8vVar.i(l.intValue());
                                }
                                if (cameraXFlashMode != null) {
                                    int i4 = z8v.a[cameraXFlashMode.ordinal()];
                                    if (i4 == 1) {
                                        yy40Var.w(x8v.c, 0);
                                    } else if (i4 == 2) {
                                        yy40Var.w(x8v.c, 2);
                                    } else if (i4 == 3) {
                                        yy40Var.w(x8v.c, 1);
                                    }
                                }
                                if (bsj0Var != null) {
                                    q8vVar.h(bsj0Var);
                                }
                                w4uVar.j(longValue, q8vVar.f());
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
                            w8v w8vVar = (w8v) list2.get(0);
                            CameraXFlashMode cameraXFlashMode2 = (CameraXFlashMode) list2.get(1);
                            try {
                                n52Var2.getClass();
                                int i5 = z8v.a[cameraXFlashMode2.ordinal()];
                                if (i5 == 1) {
                                    i3 = 0;
                                } else if (i5 != 2) {
                                    i3 = i5 != 3 ? -1 : 1;
                                }
                                w8vVar.M(i3);
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
                            List list3 = (List) obj2;
                            w8v w8vVar2 = (w8v) list3.get(0);
                            v3x0 v3x0Var = (v3x0) list3.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 7);
                            try {
                                File createTempFile = File.createTempFile("CAP", ".jpg", ((Context) n52Var2.a.A).getCacheDir());
                                w8vVar2.O(new r1s(createTempFile, (OutputStream) null, (s8v) null), Executors.newSingleThreadExecutor(), new wjm(n52Var2, createTempFile, wrb0Var, v3x0Var));
                                break;
                            } catch (IOException | SecurityException e) {
                                czj0.a(wrb0Var, e);
                                return;
                            }
                        default:
                            List list4 = (List) obj2;
                            w8v w8vVar3 = (w8v) list4.get(0);
                            long longValue2 = ((Long) list4.get(1)).longValue();
                            try {
                                n52Var2.getClass();
                                w8vVar3.N((int) longValue2);
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
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.takePicture", j, obj);
        if (n52Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: nsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i3;
                    int i32 = 2;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            CameraXFlashMode cameraXFlashMode = (CameraXFlashMode) list.get(3);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                q8v q8vVar = new q8v();
                                yy40 yy40Var = q8vVar.a;
                                if (l != null) {
                                    q8vVar.i(l.intValue());
                                }
                                if (cameraXFlashMode != null) {
                                    int i4 = z8v.a[cameraXFlashMode.ordinal()];
                                    if (i4 == 1) {
                                        yy40Var.w(x8v.c, 0);
                                    } else if (i4 == 2) {
                                        yy40Var.w(x8v.c, 2);
                                    } else if (i4 == 3) {
                                        yy40Var.w(x8v.c, 1);
                                    }
                                }
                                if (bsj0Var != null) {
                                    q8vVar.h(bsj0Var);
                                }
                                w4uVar.j(longValue, q8vVar.f());
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
                            w8v w8vVar = (w8v) list2.get(0);
                            CameraXFlashMode cameraXFlashMode2 = (CameraXFlashMode) list2.get(1);
                            try {
                                n52Var2.getClass();
                                int i5 = z8v.a[cameraXFlashMode2.ordinal()];
                                if (i5 == 1) {
                                    i32 = 0;
                                } else if (i5 != 2) {
                                    i32 = i5 != 3 ? -1 : 1;
                                }
                                w8vVar.M(i32);
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
                            List list3 = (List) obj2;
                            w8v w8vVar2 = (w8v) list3.get(0);
                            v3x0 v3x0Var = (v3x0) list3.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 7);
                            try {
                                File createTempFile = File.createTempFile("CAP", ".jpg", ((Context) n52Var2.a.A).getCacheDir());
                                w8vVar2.O(new r1s(createTempFile, (OutputStream) null, (s8v) null), Executors.newSingleThreadExecutor(), new wjm(n52Var2, createTempFile, wrb0Var, v3x0Var));
                                break;
                            } catch (IOException | SecurityException e) {
                                czj0.a(wrb0Var, e);
                                return;
                            }
                        default:
                            List list4 = (List) obj2;
                            w8v w8vVar3 = (w8v) list4.get(0);
                            long longValue2 = ((Long) list4.get(1)).longValue();
                            try {
                                n52Var2.getClass();
                                w8vVar3.N((int) longValue2);
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
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.setTargetRotation", j, obj);
        if (n52Var == null) {
            m2vVar4.G(null);
        } else {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: nsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i4;
                    int i32 = 2;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            bsj0 bsj0Var = (bsj0) list.get(1);
                            Long l = (Long) list.get(2);
                            CameraXFlashMode cameraXFlashMode = (CameraXFlashMode) list.get(3);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                q8v q8vVar = new q8v();
                                yy40 yy40Var = q8vVar.a;
                                if (l != null) {
                                    q8vVar.i(l.intValue());
                                }
                                if (cameraXFlashMode != null) {
                                    int i42 = z8v.a[cameraXFlashMode.ordinal()];
                                    if (i42 == 1) {
                                        yy40Var.w(x8v.c, 0);
                                    } else if (i42 == 2) {
                                        yy40Var.w(x8v.c, 2);
                                    } else if (i42 == 3) {
                                        yy40Var.w(x8v.c, 1);
                                    }
                                }
                                if (bsj0Var != null) {
                                    q8vVar.h(bsj0Var);
                                }
                                w4uVar.j(longValue, q8vVar.f());
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
                            w8v w8vVar = (w8v) list2.get(0);
                            CameraXFlashMode cameraXFlashMode2 = (CameraXFlashMode) list2.get(1);
                            try {
                                n52Var2.getClass();
                                int i5 = z8v.a[cameraXFlashMode2.ordinal()];
                                if (i5 == 1) {
                                    i32 = 0;
                                } else if (i5 != 2) {
                                    i32 = i5 != 3 ? -1 : 1;
                                }
                                w8vVar.M(i32);
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
                            List list3 = (List) obj2;
                            w8v w8vVar2 = (w8v) list3.get(0);
                            v3x0 v3x0Var = (v3x0) list3.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 7);
                            try {
                                File createTempFile = File.createTempFile("CAP", ".jpg", ((Context) n52Var2.a.A).getCacheDir());
                                w8vVar2.O(new r1s(createTempFile, (OutputStream) null, (s8v) null), Executors.newSingleThreadExecutor(), new wjm(n52Var2, createTempFile, wrb0Var, v3x0Var));
                                break;
                            } catch (IOException | SecurityException e) {
                                czj0.a(wrb0Var, e);
                                return;
                            }
                        default:
                            List list4 = (List) obj2;
                            w8v w8vVar3 = (w8v) list4.get(0);
                            long longValue2 = ((Long) list4.get(1)).longValue();
                            try {
                                n52Var2.getClass();
                                w8vVar3.N((int) longValue2);
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
