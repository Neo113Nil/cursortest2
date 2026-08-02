package xsna;

import java.util.function.Consumer;
import one.video.calls.sdk_private.bE;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class iky0 implements Consumer {
    public final /* synthetic */ mky0 a;

    public /* synthetic */ iky0(mky0 mky0Var) {
        this.a = mky0Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ecy0 h;
        iky0 iky0Var;
        mky0 mky0Var = this.a;
        bE bEVar = mky0Var.b;
        if (((ecy0) ((ihy0) obj)).c) {
            h = mky0Var.i(Integer.MAX_VALUE);
            iky0Var = new iky0(mky0Var);
        } else {
            h = mky0Var.h(Integer.MAX_VALUE);
            iky0Var = new iky0(mky0Var);
        }
        bEVar.j(h, iky0Var, false);
    }
}
