package xsna;

import android.annotation.SuppressLint;
import androidx.window.core.VerificationMode;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.buu;
import xsna.v2s;

/* compiled from: SidecarAdapter.kt */
/* loaded from: classes12.dex */
public final class nlj0 {
    public static final /* synthetic */ int b = 0;
    public final VerificationMode a = VerificationMode.QUIET;

    /* compiled from: SidecarAdapter.kt */
    public static final class a {
        @SuppressLint({"BanUncheckedReflection"})
        public static int a(SidecarDeviceState sidecarDeviceState) {
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return 0;
                }
            } catch (NoSuchFieldError unused2) {
                return ((Integer) SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null)).intValue();
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static List b(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? EmptyList.b : list;
                } catch (NoSuchFieldError unused) {
                    return (List) SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return EmptyList.b;
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void c(SidecarDeviceState sidecarDeviceState, int i) {
            try {
                try {
                    sidecarDeviceState.posture = i;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                }
            } catch (IllegalAccessException unused2) {
                s3q0 s3q0Var = s3q0.a;
            } catch (NoSuchMethodException unused3) {
                s3q0 s3q0Var2 = s3q0.a;
            } catch (InvocationTargetException unused4) {
                s3q0 s3q0Var3 = s3q0.a;
            }
        }
    }

    public nlj0(int i) {
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (epx.f(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return epx.f(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public final ArrayList c(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            buu i = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public final erx0 d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new erx0(EmptyList.b);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int a2 = a.a(sidecarDeviceState);
        if (a2 < 0 || a2 > 4) {
            a2 = 0;
        }
        a.c(sidecarDeviceState2, a2);
        return new erx0(c(a.b(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final buu i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        buu.a aVar;
        v2s.b bVar;
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new iir0(sidecarDisplayFeature, this.a, aqw.b).p("Type must be either TYPE_FOLD or TYPE_HINGE", new jlj0()).p("Feature bounds must not be 0", new klj0()).p("TYPE_FOLD must have 0 area", new llj0()).p("Feature be pinned to either left or top", new mlj0()).f();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            aVar = buu.a.b;
        } else {
            if (type != 2) {
                return null;
            }
            aVar = buu.a.c;
        }
        int a2 = a.a(sidecarDeviceState);
        if (a2 < 0 || a2 > 4) {
            a2 = 0;
        }
        if (a2 == 0 || a2 == 1) {
            return null;
        }
        if (a2 != 2) {
            bVar = v2s.b.b;
            if (a2 != 3 && a2 == 4) {
                return null;
            }
        } else {
            bVar = v2s.b.c;
        }
        return new buu(new aa8(sidecarDisplayFeature.getRect()), aVar, bVar);
    }
}
