package defpackage;

import androidx.window.core.VerificationMode;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class bbs0 {
    public static final /* synthetic */ int b = 0;
    public final VerificationMode a;

    public bbs0(int i) {
        this.a = VerificationMode.QUIET;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (jl40.l(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return jl40.l(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
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

    public final v751 c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new v751(EmptyList.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int a = abs0.a(sidecarDeviceState);
        if (a < 0 || a > 4) {
            a = 0;
        }
        abs0.c(sidecarDeviceState2, a);
        return new v751(d(abs0.b(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g7u i = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public final g7u i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        mf1 mf1Var;
        bg1 bg1Var = bg1.B;
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new s8p(sidecarDisplayFeature, this.a, dab1.c).b(new was0(), "Type must be either TYPE_FOLD or TYPE_HINGE").b(new xas0(), "Feature bounds must not be 0").b(new yas0(), "TYPE_FOLD must have 0 area").b(new zas0(), "Feature be pinned to either left or top").a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            mf1Var = mf1.E;
        } else {
            if (type != 2) {
                return null;
            }
            mf1Var = mf1.F;
        }
        int a = abs0.a(sidecarDeviceState);
        if (a < 0 || a > 4) {
            a = 0;
        }
        if (a == 0 || a == 1) {
            return null;
        }
        if (a == 2) {
            bg1Var = bg1.C;
        } else if (a != 3 && a == 4) {
            return null;
        }
        return new g7u(new hi6(sidecarDisplayFeature.getRect()), mf1Var, bg1Var);
    }

    public bbs0() {
        this(0);
    }
}
