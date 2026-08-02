package defpackage;

import android.util.Log;
import com.yandex.mapkit.navigation.transport.Navigation;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.VideoQuality;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class nk91 {
    public static volatile mgz a;
    public static final Object b = new Object();
    public static au2 c;

    public static final boolean a(Navigation navigation) {
        return navigation.getGuidance().getCurrentRoute() != null;
    }

    public static final void b(String str) {
        mgz l3x0Var;
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    try {
                        Log.isLoggable("", 3);
                        l3x0Var = new ta2();
                    } catch (Throwable unused) {
                        l3x0Var = new l3x0();
                    }
                    a = l3x0Var;
                }
            }
        }
        mgz mgzVar = a;
        if (mgzVar != null) {
            mgzVar.a(str);
        } else {
            ny61.g("Required value was null.");
        }
    }

    public static void c(tt5 tt5Var, final n52 n52Var) {
        rs10 j = n52Var != null ? n52Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.QualitySelector.from", j, obj);
        if (n52Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: tsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i2 = i;
                    n52 n52Var2 = n52Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                a84 a84Var = kgg0.a;
                                List asList = Arrays.asList(a84Var, kgg0.b, kgg0.c);
                                q64 q64Var = q64.c;
                                w4uVar.j(longValue, qgg0.a(asList, new q64(a84Var, 1)));
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
                            long longValue2 = ((Long) list2.get(0)).longValue();
                            try {
                                w4u w4uVar2 = (w4u) n52Var2.a.w;
                                a84 a84Var2 = kgg0.a;
                                List asList2 = Arrays.asList(a84Var2, kgg0.b, kgg0.c);
                                q64 q64Var2 = q64.c;
                                w4uVar2.j(longValue2, qgg0.a(asList2, new q64(a84Var2, 1)));
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
                            List list3 = (List) obj2;
                            ar7 ar7Var = (ar7) list3.get(0);
                            VideoQuality videoQuality = (VideoQuality) list3.get(1);
                            try {
                                n52Var2.getClass();
                                g3 = Collections.singletonList(n52.b(ar7Var, videoQuality));
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
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.QualitySelector.fromOrderedList", j, obj);
        if (n52Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: tsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i2;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                a84 a84Var = kgg0.a;
                                List asList = Arrays.asList(a84Var, kgg0.b, kgg0.c);
                                q64 q64Var = q64.c;
                                w4uVar.j(longValue, qgg0.a(asList, new q64(a84Var, 1)));
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
                            long longValue2 = ((Long) list2.get(0)).longValue();
                            try {
                                w4u w4uVar2 = (w4u) n52Var2.a.w;
                                a84 a84Var2 = kgg0.a;
                                List asList2 = Arrays.asList(a84Var2, kgg0.b, kgg0.c);
                                q64 q64Var2 = q64.c;
                                w4uVar2.j(longValue2, qgg0.a(asList2, new q64(a84Var2, 1)));
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
                            List list3 = (List) obj2;
                            ar7 ar7Var = (ar7) list3.get(0);
                            VideoQuality videoQuality = (VideoQuality) list3.get(1);
                            try {
                                n52Var2.getClass();
                                g3 = Collections.singletonList(n52.b(ar7Var, videoQuality));
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
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.QualitySelector.getResolution", j, obj);
        if (n52Var == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: tsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i3;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                a84 a84Var = kgg0.a;
                                List asList = Arrays.asList(a84Var, kgg0.b, kgg0.c);
                                q64 q64Var = q64.c;
                                w4uVar.j(longValue, qgg0.a(asList, new q64(a84Var, 1)));
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
                            long longValue2 = ((Long) list2.get(0)).longValue();
                            try {
                                w4u w4uVar2 = (w4u) n52Var2.a.w;
                                a84 a84Var2 = kgg0.a;
                                List asList2 = Arrays.asList(a84Var2, kgg0.b, kgg0.c);
                                q64 q64Var2 = q64.c;
                                w4uVar2.j(longValue2, qgg0.a(asList2, new q64(a84Var2, 1)));
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
                            List list3 = (List) obj2;
                            ar7 ar7Var = (ar7) list3.get(0);
                            VideoQuality videoQuality = (VideoQuality) list3.get(1);
                            try {
                                n52Var2.getClass();
                                g3 = Collections.singletonList(n52.b(ar7Var, videoQuality));
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
