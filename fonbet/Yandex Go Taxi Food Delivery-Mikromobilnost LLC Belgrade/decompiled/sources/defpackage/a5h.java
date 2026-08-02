package defpackage;

import java.io.IOException;

/* loaded from: classes10.dex */
public final /* synthetic */ class a5h implements ruy, c9e {
    public final /* synthetic */ uwy a;
    public final /* synthetic */ he10 b;
    public final /* synthetic */ IOException c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;

    public /* synthetic */ a5h(Object obj, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
        this.x = obj;
        this.a = uwyVar;
        this.b = he10Var;
        this.c = iOException;
        this.w = z;
    }

    @Override // defpackage.c9e
    public void accept(Object obj) {
        xf10 xf10Var = (xf10) this.x;
        ((yf10) obj).onLoadError(xf10Var.a, xf10Var.b, this.a, this.b, this.c, this.w);
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        ((j42) obj).onLoadError((h42) this.x, this.a, this.b, this.c, this.w);
    }
}
