package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class ed extends ic2 {
    public final gd l;

    public ed(Context context) {
        this(context, new kj1());
    }

    @Override // yads.ic2, yads.o11
    public final void a(Context context, String str) {
        this.l.a(str);
    }

    public final void setAdtuneWebViewListener(hd hdVar) {
        this.l.c = hdVar;
    }

    public /* synthetic */ ed(Context context, kj1 kj1Var) {
        this(context, kj1Var, new gd(new qb2(context)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ed(Context context, kj1 kj1Var, gd gdVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.l = gdVar;
        if (kj1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(gdVar);
    }

    @Override // yads.ic2
    public final void e() {
    }
}
