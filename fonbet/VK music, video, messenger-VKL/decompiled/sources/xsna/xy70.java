package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.aq90;

/* compiled from: OkioStorage.kt */
/* loaded from: classes.dex */
public final class xy70 extends Lambda implements gzs<aq90> {
    final /* synthetic */ yy70<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy70(yy70<Object> yy70Var) {
        super(0);
        this.this$0 = yy70Var;
    }

    @Override // xsna.gzs
    public final aq90 invoke() {
        aq90 aq90Var = (aq90) this.this$0.d.invoke();
        boolean z = d.a(aq90Var) != -1;
        yy70<Object> yy70Var = this.this$0;
        if (z) {
            return aq90.a.a(aq90Var.b.A(), true);
        }
        throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + yy70Var.d + ", instead got " + aq90Var).toString());
    }
}
