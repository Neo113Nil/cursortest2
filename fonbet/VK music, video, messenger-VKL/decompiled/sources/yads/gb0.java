package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class gb0 extends Lambda implements gzs {
    public final /* synthetic */ hb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(hb0 hb0Var) {
        super(0);
        this.b = hb0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return Long.valueOf(this.b.a.toMillis(1L));
    }
}
