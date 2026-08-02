package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AntispamViewState.kt */
/* loaded from: classes14.dex */
public final class iw2 implements ao50 {
    public final fi50 a;

    /* compiled from: AntispamViewState.kt */
    public interface a extends fm50<fw2> {

        /* compiled from: AntispamViewState.kt */
        /* renamed from: xsna.iw2$a$a, reason: collision with other inner class name */
        public static final class C3085a implements a {
            public final yzt0<yr5> a;
            public final yzt0<List<mhk0>> b;
            public final yzt0<Boolean> c;

            public C3085a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
            }
        }

        /* compiled from: AntispamViewState.kt */
        public static final class b implements a {
            public final yr5 a;
            public final ArrayList b;

            public b(yr5 yr5Var, ArrayList arrayList) {
                this.a = yr5Var;
                this.b = arrayList;
            }
        }
    }

    public iw2(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
