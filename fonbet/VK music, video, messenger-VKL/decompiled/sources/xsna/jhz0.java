package xsna;

import android.content.Context;
import xsna.mez0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class jhz0 implements t8z0 {
    public final /* synthetic */ khz0 b;
    public final /* synthetic */ xey0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ fiz0 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ mez0.c g;

    public /* synthetic */ jhz0(khz0 khz0Var, xey0 xey0Var, int i, fiz0 fiz0Var, Context context, mez0.c cVar) {
        this.b = khz0Var;
        this.c = xey0Var;
        this.d = i;
        this.e = fiz0Var;
        this.f = context;
        this.g = cVar;
    }

    @Override // xsna.t8z0
    public final void accept(Object obj) {
        mez0.c cVar = this.g;
        this.b.c(this.c, (String) obj, this.d, cVar, this.e, this.f);
    }
}
