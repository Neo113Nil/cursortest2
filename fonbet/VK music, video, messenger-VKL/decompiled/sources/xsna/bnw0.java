package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import xsna.zmw0;

/* compiled from: VoipCoreDependenciesFactory.kt */
/* loaded from: classes7.dex */
public final class bnw0 {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final vg20 b = new vg20();
    public static final rd9 c = new rd9();

    /* compiled from: VoipCoreDependenciesFactory.kt */
    public static final class a {
        public final hyd0 a;
        public final buc0 b;
        public final uh80 c;
        public final c d;

        public a(hyd0 hyd0Var, im80 im80Var, buc0 buc0Var, uh80 uh80Var, c cVar) {
            this.a = hyd0Var;
            this.b = buc0Var;
            this.c = uh80Var;
            this.d = cVar;
        }
    }

    /* compiled from: VoipCoreDependenciesFactory.kt */
    public static final class b {
        public final com.vk.voip.call_effects.a a;
        public final fq4 b;
        public final kqw0 c;
        public final qr2 d;
        public final i3x0 e;

        public b(d1w0 d1w0Var, lmc lmcVar, com.vk.voip.call_effects.a aVar, fq4 fq4Var, kqw0 kqw0Var, qr2 qr2Var, m570 m570Var, i3x0 i3x0Var) {
            this.a = aVar;
            this.b = fq4Var;
            this.c = kqw0Var;
            this.d = qr2Var;
            this.e = i3x0Var;
        }
    }

    /* compiled from: VoipCoreDependenciesFactory.kt */
    public static final class c {
        public final vxl0 a;
        public final ifv0 b;
        public final bzq0 c;

        public c(vxl0 vxl0Var, ifv0 ifv0Var, bzq0 bzq0Var) {
            this.a = vxl0Var;
            this.b = ifv0Var;
            this.c = bzq0Var;
        }
    }

    public static final rew0 a() {
        com.vk.voip.ui.c.b.getClass();
        return (rew0) com.vk.voip.ui.c.n0.getValue();
    }

    public static mlp b(zmw0.a aVar, List list) {
        return new mlp(aVar.b, aVar.c, aVar.d, String.valueOf(aVar.a.b), list, aVar.e, aVar.f, aVar.g);
    }
}
