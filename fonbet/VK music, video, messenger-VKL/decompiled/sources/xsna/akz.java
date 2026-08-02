package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class akz implements hq9 {
    public final /* synthetic */ Ref$ObjectRef a;

    @Override // xsna.hq9
    public final void cancel() {
        hq9 hq9Var = (hq9) this.a.element;
        if (hq9Var != null) {
            hq9Var.cancel();
        }
    }
}
