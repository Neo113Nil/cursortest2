package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class h70 extends Lambda implements gzs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ m70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(Context context, m70 m70Var) {
        super(0);
        this.b = context;
        this.c = m70Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new gw2(this.b, (bv1) this.c.k.getValue());
    }
}
