package xsna;

import xsna.lm50;
import xsna.yl50;

/* compiled from: AttachedMviReducer.kt */
/* loaded from: classes3.dex */
public final class e64<State extends lm50, Patch extends yl50> {
    public final bm50<State, Patch> a;
    public final a<State, Patch> b;

    /* compiled from: AttachedMviReducer.kt */
    public static final class a<State extends lm50, Patch extends yl50> {
        public final bm50<State, Patch> a;

        public a(bm50<State, Patch> bm50Var) {
            this.a = bm50Var;
        }
    }

    public e64(bm50<State, Patch> bm50Var) {
        this.a = bm50Var;
        this.b = new a<>(bm50Var);
    }
}
