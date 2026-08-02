package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class b60 extends Lambda implements gzs {
    public final /* synthetic */ m70 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(Context context, m70 m70Var) {
        super(0);
        this.b = m70Var;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        hx2 hx2Var = (hx2) this.b.b.getValue();
        ww wwVar = xw.a;
        Context context = this.c;
        wwVar.getClass();
        return new ez(hx2Var, ww.a(context));
    }
}
