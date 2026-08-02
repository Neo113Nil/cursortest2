package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.e64;
import xsna.lm50;
import xsna.yl50;

/* compiled from: CompositeMviReducer.kt */
/* loaded from: classes3.dex */
public final class yti<State extends lm50, Patch extends yl50> implements bm50<State, Patch> {
    public final List<e64<State, ? extends Patch>> a;
    public final wzs<em50, Patch, Object> b;
    public final yti<State, Patch>.a c = new a();

    /* compiled from: CompositeMviReducer.kt */
    public final class a implements em50 {
        public a() {
        }

        @Override // xsna.em50
        public final /* bridge */ /* synthetic */ e64.a a(e64 e64Var, yl50 yl50Var) {
            return c(e64Var);
        }

        @Override // xsna.em50
        public final e64.a b(ugf ugfVar, e64 e64Var) {
            return c(e64Var);
        }

        public final e64.a c(e64 e64Var) {
            List<e64<State, ? extends Patch>> list = yti.this.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((e64) it.next()) == e64Var) {
                        return e64Var.b;
                    }
                }
            }
            throw new IllegalArgumentException("You have forgotten to attach the reducer in the composite reducer");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yti(List<? extends e64<State, ? extends Patch>> list, wzs<? super em50, ? super Patch, Object> wzsVar) {
        this.a = list;
        this.b = wzsVar;
    }

    @Override // xsna.bm50
    public final State a(State state, Patch patch) {
        bm50<State, Patch> bm50Var = ((e64.a) this.b.invoke(this.c, patch)).a;
        if (bm50Var.b(patch)) {
            return bm50Var.a(state, patch);
        }
        return null;
    }

    @Override // xsna.bm50
    public final boolean b(Patch patch) {
        return true;
    }
}
