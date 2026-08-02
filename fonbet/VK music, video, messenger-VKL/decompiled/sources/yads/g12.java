package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class g12 extends Lambda implements gzs {
    public final /* synthetic */ nj2 b;
    public final /* synthetic */ x41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g12(nj2 nj2Var, x41 x41Var) {
        super(0);
        this.b = nj2Var;
        this.c = x41Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return this.b.a(this.c);
    }
}
