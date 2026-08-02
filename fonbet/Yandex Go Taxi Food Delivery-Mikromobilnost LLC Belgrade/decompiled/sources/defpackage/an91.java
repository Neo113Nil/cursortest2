package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public abstract class an91 {
    public static final l690 a(float f, float f2) {
        return new l690(f, f2, f, f2);
    }

    public static l690 b(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new l690(f, f2, f, f2);
    }

    public static final l690 c(float f, float f2, float f3, float f4) {
        return new l690(f, f2, f3, f4);
    }

    public static l690 d(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new l690(f, f2, f3, f4);
    }

    public static final float e(j690 j690Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? j690Var.c(layoutDirection) : j690Var.b(layoutDirection);
    }

    public static final float f(j690 j690Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? j690Var.b(layoutDirection) : j690Var.c(layoutDirection);
    }

    public static final boolean g(DriveState driveState) {
        return driveState.compareTo(DriveState.COMPLETE) >= 0;
    }

    public static final boolean h(DriveState driveState) {
        return driveState == DriveState.SCHEDULING || driveState == DriveState.SCHEDULED;
    }

    public static final boolean i(DriveState driveState) {
        return driveState == null || driveState == DriveState.PREORDER || driveState == DriveState.SEARCH;
    }

    public static final f530 j(f530 f530Var, j690 j690Var) {
        return f530Var.k(new k690(j690Var, new u290(1, j690Var)));
    }

    public static final f530 k(f530 f530Var, float f) {
        return f530Var.k(new r590(f, f, f, f, new ur70(26)));
    }

    public static final f530 l(f530 f530Var, float f, float f2) {
        return f530Var.k(new r590(f, f2, f, f2, new gv60(f, f2, 1)));
    }

    public static f530 m(f530 f530Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return l(f530Var, f, f2);
    }

    public static final f530 n(f530 f530Var, final float f, final float f2, final float f3, final float f4) {
        return f530Var.k(new r590(f, f2, f3, f4, new tls() { // from class: v590
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                g131Var.b("start", new y7m(f));
                g131Var.b("top", new y7m(f2));
                g131Var.b("end", new y7m(f3));
                g131Var.b("bottom", new y7m(f4));
                return zy11.a;
            }
        }));
    }

    public static f530 o(f530 f530Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return n(f530Var, f, f2, f3, f4);
    }

    public static final s2w p(u1w u1wVar) {
        return new s2w(u1wVar.a, u1wVar.b, u1wVar.c, u1wVar.d);
    }
}
