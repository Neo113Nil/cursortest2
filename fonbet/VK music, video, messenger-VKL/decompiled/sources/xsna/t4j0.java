package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Effects.kt */
/* loaded from: classes3.dex */
public final class t4j0 implements kgn {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ wh50 b;

    public t4j0(Ref$ObjectRef ref$ObjectRef, wh50 wh50Var) {
        this.a = ref$ObjectRef;
        this.b = wh50Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        eyx eyxVar = (eyx) this.a.element;
        if (eyxVar != null) {
            eyxVar.b(null);
        }
        this.b.setValue(null);
    }
}
