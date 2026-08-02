package xsna;

import java.util.Map;
import xsna.nb30;

/* compiled from: MotionStateLayoutBuilder.kt */
/* loaded from: classes7.dex */
public final class b8o0 extends ob30<vny> {
    public final Map<uoy, upy> c;
    public final a d;

    /* compiled from: MotionStateLayoutBuilder.kt */
    public static final class a extends nc {
        @Override // xsna.nc
        public final wny S() {
            return vny.a;
        }
    }

    public b8o0(Map<uoy, upy> map) {
        super(nb30.a.a);
        this.c = map;
        this.d = new a(1);
    }

    @Override // xsna.pny
    public final Map a(wny wnyVar) {
        return this.c;
    }

    @Override // xsna.pny
    public final nc b() {
        return this.d;
    }
}
