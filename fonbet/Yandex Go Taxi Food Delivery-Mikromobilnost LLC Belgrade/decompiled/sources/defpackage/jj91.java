package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.util.Log;
import com.yandex.div.json.expressions.Expression;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.InfoSupportedHardwareLevel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public abstract class jj91 {
    public static final iax a = new iax();

    public static final List a(ynl ynlVar, rvo rvoVar) {
        List list = ynlVar.S;
        if (list == null) {
            return EmptyList.a;
        }
        List<iol> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (iol iolVar : list2) {
            Uri uri = (Uri) iolVar.d.a(rvoVar);
            String str = (String) iolVar.b.a(rvoVar);
            hol holVar = iolVar.c;
            Long l = null;
            fol folVar = holVar != null ? new fol((int) ((Number) holVar.b.a(rvoVar)).longValue(), (int) ((Number) holVar.a.a(rvoVar)).longValue()) : null;
            Expression expression = iolVar.a;
            if (expression != null) {
                l = (Long) expression.a(rvoVar);
            }
            arrayList.add(new jol(uri, str, folVar, l));
        }
        return arrayList;
    }

    public static final Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(tt5 tt5Var, final sm7 sm7Var) {
        rs10 j = sm7Var != null ? sm7Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.from", j, obj);
        if (sm7Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: xrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i2 = i;
                    Object obj3 = null;
                    sm7 sm7Var2 = sm7Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list.get(0)).longValue(), pm7.a((ar7) list.get(1)));
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
                            pm7 pm7Var = (pm7) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                g2 = Collections.singletonList(pm7Var.a.a);
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
                            List list2 = (List) obj2;
                            pm7 pm7Var2 = (pm7) list2.get(0);
                            CameraCharacteristics.Key key = (CameraCharacteristics.Key) list2.get(1);
                            try {
                                sm7Var2.getClass();
                                Object b = pm7Var2.b(key);
                                if (b != null) {
                                    if (CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL.equals(key)) {
                                        int intValue = ((Integer) b).intValue();
                                        if (intValue == 0) {
                                            obj3 = InfoSupportedHardwareLevel.LIMITED;
                                        } else if (intValue == 1) {
                                            obj3 = InfoSupportedHardwareLevel.FULL;
                                        } else if (intValue == 2) {
                                            obj3 = InfoSupportedHardwareLevel.LEGACY;
                                        } else if (intValue == 3) {
                                            obj3 = InfoSupportedHardwareLevel.LEVEL3;
                                        } else if (intValue == 4) {
                                            obj3 = InfoSupportedHardwareLevel.EXTERNAL;
                                        }
                                    }
                                    obj3 = b;
                                }
                                g3 = Collections.singletonList(obj3);
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
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.getCameraId", j, obj);
        if (sm7Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: xrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i2;
                    Object obj3 = null;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list.get(0)).longValue(), pm7.a((ar7) list.get(1)));
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
                            pm7 pm7Var = (pm7) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                g2 = Collections.singletonList(pm7Var.a.a);
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
                            List list2 = (List) obj2;
                            pm7 pm7Var2 = (pm7) list2.get(0);
                            CameraCharacteristics.Key key = (CameraCharacteristics.Key) list2.get(1);
                            try {
                                sm7Var2.getClass();
                                Object b = pm7Var2.b(key);
                                if (b != null) {
                                    if (CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL.equals(key)) {
                                        int intValue = ((Integer) b).intValue();
                                        if (intValue == 0) {
                                            obj3 = InfoSupportedHardwareLevel.LIMITED;
                                        } else if (intValue == 1) {
                                            obj3 = InfoSupportedHardwareLevel.FULL;
                                        } else if (intValue == 2) {
                                            obj3 = InfoSupportedHardwareLevel.LEGACY;
                                        } else if (intValue == 3) {
                                            obj3 = InfoSupportedHardwareLevel.LEVEL3;
                                        } else if (intValue == 4) {
                                            obj3 = InfoSupportedHardwareLevel.EXTERNAL;
                                        }
                                    }
                                    obj3 = b;
                                }
                                g3 = Collections.singletonList(obj3);
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
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.getCameraCharacteristic", j, obj);
        if (sm7Var == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: xrb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i3;
                    Object obj3 = null;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list.get(0)).longValue(), pm7.a((ar7) list.get(1)));
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
                            pm7 pm7Var = (pm7) ((List) obj2).get(0);
                            try {
                                sm7Var2.getClass();
                                g2 = Collections.singletonList(pm7Var.a.a);
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
                            List list2 = (List) obj2;
                            pm7 pm7Var2 = (pm7) list2.get(0);
                            CameraCharacteristics.Key key = (CameraCharacteristics.Key) list2.get(1);
                            try {
                                sm7Var2.getClass();
                                Object b = pm7Var2.b(key);
                                if (b != null) {
                                    if (CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL.equals(key)) {
                                        int intValue = ((Integer) b).intValue();
                                        if (intValue == 0) {
                                            obj3 = InfoSupportedHardwareLevel.LIMITED;
                                        } else if (intValue == 1) {
                                            obj3 = InfoSupportedHardwareLevel.FULL;
                                        } else if (intValue == 2) {
                                            obj3 = InfoSupportedHardwareLevel.LEGACY;
                                        } else if (intValue == 3) {
                                            obj3 = InfoSupportedHardwareLevel.LEVEL3;
                                        } else if (intValue == 4) {
                                            obj3 = InfoSupportedHardwareLevel.EXTERNAL;
                                        }
                                    }
                                    obj3 = b;
                                }
                                g3 = Collections.singletonList(obj3);
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
