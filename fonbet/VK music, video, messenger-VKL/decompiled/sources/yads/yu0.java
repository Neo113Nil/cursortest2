package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.rli0;

/* loaded from: classes10.dex */
public final class yu0 extends Lambda implements gzs {
    public final /* synthetic */ zu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(zu0 zu0Var) {
        super(0);
        this.b = zu0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        zu0 zu0Var = this.b;
        return rli0.r(rli0.x(zu0Var.c, zu0Var.d), "&", xu0.b, 30);
    }
}
