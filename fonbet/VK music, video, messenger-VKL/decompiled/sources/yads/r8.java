package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class r8 extends Lambda implements gzs {
    public final /* synthetic */ t8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(t8 t8Var) {
        super(0);
        this.b = t8Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new b9(new p8(), new q8(), new z8()).a(this.b.b.getApplicationContext());
    }
}
