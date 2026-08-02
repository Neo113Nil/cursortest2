package xsna;

import java.util.ArrayList;
import xsna.lm50;
import xsna.yl50;

/* compiled from: CompositeReducerBuilder.kt */
/* loaded from: classes3.dex */
public final class iui<State extends lm50, Patch extends yl50> {
    public wzs<? super em50, ? super Patch, Object> a;
    public final ArrayList b = new ArrayList();

    public final <SubPatch extends Patch> e64<State, SubPatch> a(bm50<State, SubPatch> bm50Var) {
        e64<State, SubPatch> e64Var = new e64<>(bm50Var);
        this.b.add(e64Var);
        return e64Var;
    }
}
