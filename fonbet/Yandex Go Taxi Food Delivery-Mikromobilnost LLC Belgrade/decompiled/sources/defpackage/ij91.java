package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.expression.variables.a;
import io.flutter.plugins.camerax.AspectRatio;
import io.flutter.plugins.camerax.AspectRatioStrategyFallbackRule;
import io.flutter.plugins.camerax.CameraXError;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class ij91 {
    public static final jax a = new jax();

    public static final Point a(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return new Point(bounds.width(), bounds.height());
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    public static void b(tt5 tt5Var, final v83 v83Var) {
        pbj pbjVar;
        rs10 bu7Var = (v83Var == null || (pbjVar = v83Var.a) == null) ? new bu7() : pbjVar.j();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.pigeon_defaultConstructor", bu7Var, obj);
        if (v83Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: urb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i2 = i;
                    int i3 = -1;
                    v83 v83Var2 = v83Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            AspectRatio aspectRatio = (AspectRatio) list.get(1);
                            AspectRatioStrategyFallbackRule aspectRatioStrategyFallbackRule = (AspectRatioStrategyFallbackRule) list.get(2);
                            try {
                                w4u w4uVar = (w4u) v83Var2.a.w;
                                int i4 = u83.a[aspectRatio.ordinal()];
                                int i5 = i4 != 1 ? i4 != 2 ? i4 != 3 ? -2 : -1 : 0 : 1;
                                int i6 = u83.b[aspectRatioStrategyFallbackRule.ordinal()];
                                if (i6 == 1) {
                                    i3 = 1;
                                } else if (i6 == 2) {
                                    i3 = 0;
                                }
                                w4uVar.j(longValue, new s83(i5, i3));
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.d);
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.c);
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
                        case 3:
                            s83 s83Var = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i7 = s83Var.b;
                                g4 = Collections.singletonList(i7 != 0 ? i7 != 1 ? AspectRatioStrategyFallbackRule.UNKNOWN : AspectRatioStrategyFallbackRule.AUTO : AspectRatioStrategyFallbackRule.NONE);
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
                        default:
                            s83 s83Var2 = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i8 = s83Var2.a;
                                g5 = Collections.singletonList(i8 != -1 ? i8 != 0 ? i8 != 1 ? AspectRatio.UNKNOWN : AspectRatio.RATIO16TO9 : AspectRatio.RATIO4TO3 : AspectRatio.RATIO_DEFAULT);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.ratio_16_9FallbackAutoStrategy", bu7Var, obj);
        if (v83Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: urb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i2;
                    int i3 = -1;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            AspectRatio aspectRatio = (AspectRatio) list.get(1);
                            AspectRatioStrategyFallbackRule aspectRatioStrategyFallbackRule = (AspectRatioStrategyFallbackRule) list.get(2);
                            try {
                                w4u w4uVar = (w4u) v83Var2.a.w;
                                int i4 = u83.a[aspectRatio.ordinal()];
                                int i5 = i4 != 1 ? i4 != 2 ? i4 != 3 ? -2 : -1 : 0 : 1;
                                int i6 = u83.b[aspectRatioStrategyFallbackRule.ordinal()];
                                if (i6 == 1) {
                                    i3 = 1;
                                } else if (i6 == 2) {
                                    i3 = 0;
                                }
                                w4uVar.j(longValue, new s83(i5, i3));
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.d);
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.c);
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
                        case 3:
                            s83 s83Var = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i7 = s83Var.b;
                                g4 = Collections.singletonList(i7 != 0 ? i7 != 1 ? AspectRatioStrategyFallbackRule.UNKNOWN : AspectRatioStrategyFallbackRule.AUTO : AspectRatioStrategyFallbackRule.NONE);
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
                        default:
                            s83 s83Var2 = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i8 = s83Var2.a;
                                g5 = Collections.singletonList(i8 != -1 ? i8 != 0 ? i8 != 1 ? AspectRatio.UNKNOWN : AspectRatio.RATIO16TO9 : AspectRatio.RATIO4TO3 : AspectRatio.RATIO_DEFAULT);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.ratio_4_3FallbackAutoStrategy", bu7Var, obj);
        if (v83Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: urb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i3;
                    int i32 = -1;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            AspectRatio aspectRatio = (AspectRatio) list.get(1);
                            AspectRatioStrategyFallbackRule aspectRatioStrategyFallbackRule = (AspectRatioStrategyFallbackRule) list.get(2);
                            try {
                                w4u w4uVar = (w4u) v83Var2.a.w;
                                int i4 = u83.a[aspectRatio.ordinal()];
                                int i5 = i4 != 1 ? i4 != 2 ? i4 != 3 ? -2 : -1 : 0 : 1;
                                int i6 = u83.b[aspectRatioStrategyFallbackRule.ordinal()];
                                if (i6 == 1) {
                                    i32 = 1;
                                } else if (i6 == 2) {
                                    i32 = 0;
                                }
                                w4uVar.j(longValue, new s83(i5, i32));
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.d);
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.c);
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
                        case 3:
                            s83 s83Var = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i7 = s83Var.b;
                                g4 = Collections.singletonList(i7 != 0 ? i7 != 1 ? AspectRatioStrategyFallbackRule.UNKNOWN : AspectRatioStrategyFallbackRule.AUTO : AspectRatioStrategyFallbackRule.NONE);
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
                        default:
                            s83 s83Var2 = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i8 = s83Var2.a;
                                g5 = Collections.singletonList(i8 != -1 ? i8 != 0 ? i8 != 1 ? AspectRatio.UNKNOWN : AspectRatio.RATIO16TO9 : AspectRatio.RATIO4TO3 : AspectRatio.RATIO_DEFAULT);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.getFallbackRule", bu7Var, obj);
        if (v83Var != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: urb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i4;
                    int i32 = -1;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            AspectRatio aspectRatio = (AspectRatio) list.get(1);
                            AspectRatioStrategyFallbackRule aspectRatioStrategyFallbackRule = (AspectRatioStrategyFallbackRule) list.get(2);
                            try {
                                w4u w4uVar = (w4u) v83Var2.a.w;
                                int i42 = u83.a[aspectRatio.ordinal()];
                                int i5 = i42 != 1 ? i42 != 2 ? i42 != 3 ? -2 : -1 : 0 : 1;
                                int i6 = u83.b[aspectRatioStrategyFallbackRule.ordinal()];
                                if (i6 == 1) {
                                    i32 = 1;
                                } else if (i6 == 2) {
                                    i32 = 0;
                                }
                                w4uVar.j(longValue, new s83(i5, i32));
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.d);
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.c);
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
                        case 3:
                            s83 s83Var = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i7 = s83Var.b;
                                g4 = Collections.singletonList(i7 != 0 ? i7 != 1 ? AspectRatioStrategyFallbackRule.UNKNOWN : AspectRatioStrategyFallbackRule.AUTO : AspectRatioStrategyFallbackRule.NONE);
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
                        default:
                            s83 s83Var2 = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i8 = s83Var2.a;
                                g5 = Collections.singletonList(i8 != -1 ? i8 != 0 ? i8 != 1 ? AspectRatio.UNKNOWN : AspectRatio.RATIO16TO9 : AspectRatio.RATIO4TO3 : AspectRatio.RATIO_DEFAULT);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.getPreferredAspectRatio", bu7Var, obj);
        if (v83Var == null) {
            m2vVar5.G(null);
        } else {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: urb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i5;
                    int i32 = -1;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            AspectRatio aspectRatio = (AspectRatio) list.get(1);
                            AspectRatioStrategyFallbackRule aspectRatioStrategyFallbackRule = (AspectRatioStrategyFallbackRule) list.get(2);
                            try {
                                w4u w4uVar = (w4u) v83Var2.a.w;
                                int i42 = u83.a[aspectRatio.ordinal()];
                                int i52 = i42 != 1 ? i42 != 2 ? i42 != 3 ? -2 : -1 : 0 : 1;
                                int i6 = u83.b[aspectRatioStrategyFallbackRule.ordinal()];
                                if (i6 == 1) {
                                    i32 = 1;
                                } else if (i6 == 2) {
                                    i32 = 0;
                                }
                                w4uVar.j(longValue, new s83(i52, i32));
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.d);
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
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), s83.c);
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
                        case 3:
                            s83 s83Var = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i7 = s83Var.b;
                                g4 = Collections.singletonList(i7 != 0 ? i7 != 1 ? AspectRatioStrategyFallbackRule.UNKNOWN : AspectRatioStrategyFallbackRule.AUTO : AspectRatioStrategyFallbackRule.NONE);
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
                        default:
                            s83 s83Var2 = (s83) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i8 = s83Var2.a;
                                g5 = Collections.singletonList(i8 != -1 ? i8 != 0 ? i8 != 1 ? AspectRatio.UNKNOWN : AspectRatio.RATIO16TO9 : AspectRatio.RATIO4TO3 : AspectRatio.RATIO_DEFAULT);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                    }
                }
            });
        }
    }

    public static final void c(Div2Context div2Context, jnl jnlVar) {
        c231 z131Var;
        Object obj = jnlVar.a;
        a divVariableController = div2Context.getDivVariableController();
        String str = jnlVar.b;
        c231 g = divVariableController.g(str);
        if (jl40.l(g != null ? g.d() : null, obj)) {
            return;
        }
        if (obj instanceof Integer) {
            z131Var = new y131(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            z131Var = new y131(str, ((Number) obj).longValue());
        } else if (obj instanceof Float) {
            z131Var = new x131(str, ((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            z131Var = new x131(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            z131Var = new u131(str, ((Boolean) obj).booleanValue());
        } else {
            if (!(obj instanceof String)) {
                x4c.g("Unknown type of divkit variable", null, String.valueOf(obj), null, 10);
                return;
            }
            z131Var = new z131(str, (String) obj);
        }
        div2Context.getDivVariableController().i(z131Var);
    }
}
