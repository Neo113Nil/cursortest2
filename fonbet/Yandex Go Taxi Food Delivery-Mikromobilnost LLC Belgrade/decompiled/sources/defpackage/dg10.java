package defpackage;

import android.util.Pair;

/* loaded from: classes10.dex */
public final /* synthetic */ class dg10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg10 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ uwy w;
    public final /* synthetic */ he10 x;

    public /* synthetic */ dg10(fg10 fg10Var, Pair pair, uwy uwyVar, he10 he10Var, int i) {
        this.a = i;
        this.b = fg10Var;
        this.c = pair;
        this.w = uwyVar;
        this.x = he10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        he10 he10Var = this.x;
        uwy uwyVar = this.w;
        Pair pair = this.c;
        fg10 fg10Var = this.b;
        switch (i) {
            case 0:
                ((j5h) fg10Var.b.h).onLoadCanceled(((Integer) pair.first).intValue(), (sf10) pair.second, uwyVar, he10Var);
                break;
            default:
                ((j5h) fg10Var.b.h).onLoadCompleted(((Integer) pair.first).intValue(), (sf10) pair.second, uwyVar, he10Var);
                break;
        }
    }
}
