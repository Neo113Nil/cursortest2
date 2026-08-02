package defpackage;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.yandex.div2.DivSizeUnit;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.LensFacing;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class oj91 {
    public static final zoy0 a = new zoy0();

    public static final ViewPropertyAnimator a(View view, long j) {
        view.animate().cancel();
        return view.animate().alpha(1.0f).setDuration(j).withStartAction(new mw31(view, 1));
    }

    public static ViewPropertyAnimator b(View view) {
        view.animate().cancel();
        return view.animate().alpha(0.0f).setDuration(200L).withEndAction(new mw31(view, 0));
    }

    public static void m(tt5 tt5Var, final n52 n52Var) {
        rs10 j = n52Var != null ? n52Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.pigeon_defaultConstructor", j, obj);
        if (n52Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: asb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i2 = i;
                    int i3 = 1;
                    n52 n52Var2 = n52Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            LensFacing lensFacing = (LensFacing) list.get(1);
                            ar7 ar7Var = (ar7) list.get(2);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                ws7 ws7Var = new ws7();
                                if (lensFacing != null) {
                                    int i4 = ys7.a[lensFacing.ordinal()];
                                    if (i4 == 1) {
                                        ws7Var.b(0);
                                    } else if (i4 == 2) {
                                        ws7Var.b(1);
                                    } else if (i4 == 3) {
                                        ws7Var.b(2);
                                    } else if (i4 == 4) {
                                        ws7Var.b(-1);
                                    }
                                }
                                if (ar7Var != null) {
                                    ws7Var.a.add(new zq7(ar7Var, i3));
                                }
                                w4uVar.j(longValue, ws7Var.a());
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
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), xs7.c);
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
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), xs7.b);
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
                            List list2 = (List) obj2;
                            xs7 xs7Var = (xs7) list2.get(0);
                            List list3 = (List) list2.get(1);
                            try {
                                n52Var2.getClass();
                                g4 = Collections.singletonList(xs7Var.a(list3));
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
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.defaultBackCamera", j, obj);
        if (n52Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: asb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i2;
                    int i3 = 1;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            LensFacing lensFacing = (LensFacing) list.get(1);
                            ar7 ar7Var = (ar7) list.get(2);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                ws7 ws7Var = new ws7();
                                if (lensFacing != null) {
                                    int i4 = ys7.a[lensFacing.ordinal()];
                                    if (i4 == 1) {
                                        ws7Var.b(0);
                                    } else if (i4 == 2) {
                                        ws7Var.b(1);
                                    } else if (i4 == 3) {
                                        ws7Var.b(2);
                                    } else if (i4 == 4) {
                                        ws7Var.b(-1);
                                    }
                                }
                                if (ar7Var != null) {
                                    ws7Var.a.add(new zq7(ar7Var, i3));
                                }
                                w4uVar.j(longValue, ws7Var.a());
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
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), xs7.c);
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
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), xs7.b);
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
                            List list2 = (List) obj2;
                            xs7 xs7Var = (xs7) list2.get(0);
                            List list3 = (List) list2.get(1);
                            try {
                                n52Var2.getClass();
                                g4 = Collections.singletonList(xs7Var.a(list3));
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
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.defaultFrontCamera", j, obj);
        if (n52Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: asb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i3;
                    int i32 = 1;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            LensFacing lensFacing = (LensFacing) list.get(1);
                            ar7 ar7Var = (ar7) list.get(2);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                ws7 ws7Var = new ws7();
                                if (lensFacing != null) {
                                    int i4 = ys7.a[lensFacing.ordinal()];
                                    if (i4 == 1) {
                                        ws7Var.b(0);
                                    } else if (i4 == 2) {
                                        ws7Var.b(1);
                                    } else if (i4 == 3) {
                                        ws7Var.b(2);
                                    } else if (i4 == 4) {
                                        ws7Var.b(-1);
                                    }
                                }
                                if (ar7Var != null) {
                                    ws7Var.a.add(new zq7(ar7Var, i32));
                                }
                                w4uVar.j(longValue, ws7Var.a());
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
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), xs7.c);
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
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), xs7.b);
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
                            List list2 = (List) obj2;
                            xs7 xs7Var = (xs7) list2.get(0);
                            List list3 = (List) list2.get(1);
                            try {
                                n52Var2.getClass();
                                g4 = Collections.singletonList(xs7Var.a(list3));
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
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.filter", j, obj);
        if (n52Var == null) {
            m2vVar4.G(null);
        } else {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: asb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i4;
                    int i32 = 1;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            LensFacing lensFacing = (LensFacing) list.get(1);
                            ar7 ar7Var = (ar7) list.get(2);
                            try {
                                w4u w4uVar = (w4u) n52Var2.a.w;
                                ws7 ws7Var = new ws7();
                                if (lensFacing != null) {
                                    int i42 = ys7.a[lensFacing.ordinal()];
                                    if (i42 == 1) {
                                        ws7Var.b(0);
                                    } else if (i42 == 2) {
                                        ws7Var.b(1);
                                    } else if (i42 == 3) {
                                        ws7Var.b(2);
                                    } else if (i42 == 4) {
                                        ws7Var.b(-1);
                                    }
                                }
                                if (ar7Var != null) {
                                    ws7Var.a.add(new zq7(ar7Var, i32));
                                }
                                w4uVar.j(longValue, ws7Var.a());
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
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), xs7.c);
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
                            try {
                                ((w4u) n52Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), xs7.b);
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
                            List list2 = (List) obj2;
                            xs7 xs7Var = (xs7) list2.get(0);
                            List list3 = (List) list2.get(1);
                            try {
                                n52Var2.getClass();
                                g4 = Collections.singletonList(xs7Var.a(list3));
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

    public abstract int c();

    public abstract List d(String str);

    public abstract int e();

    public abstract DisplayMetrics f();

    public int g() {
        return 0;
    }

    public int h() {
        return 0;
    }

    public void i(int i, DivSizeUnit divSizeUnit, boolean z) {
    }

    public abstract void j(boolean z);

    public abstract void k(int i);

    public abstract void l(int i);
}
