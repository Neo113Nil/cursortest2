package xsna;

import xsna.lj50;

/* compiled from: BinderScope.kt */
/* loaded from: classes3.dex */
public final class a47<Action extends lj50> implements z37<Action> {
    public final xy<Action> a;

    public a47(xy<Action> xyVar) {
        this.a = xyVar;
    }

    @Override // xsna.z37
    public final void b(Action action) {
        xy<Action> xyVar = this.a;
        if (xyVar != null) {
            xyVar.a(action);
        }
    }
}
