package defpackage;

import android.util.Pair;

/* loaded from: classes10.dex */
public final /* synthetic */ class bg10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg10 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ he10 w;

    public /* synthetic */ bg10(fg10 fg10Var, Pair pair, he10 he10Var, int i) {
        this.a = i;
        this.b = fg10Var;
        this.c = pair;
        this.w = he10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        he10 he10Var = this.w;
        Pair pair = this.c;
        fg10 fg10Var = this.b;
        switch (i) {
            case 0:
                b32 b32Var = fg10Var.b.h;
                int intValue = ((Integer) pair.first).intValue();
                sf10 sf10Var = (sf10) pair.second;
                sf10Var.getClass();
                ((j5h) b32Var).onUpstreamDiscarded(intValue, sf10Var, he10Var);
                break;
            default:
                ((j5h) fg10Var.b.h).onDownstreamFormatChanged(((Integer) pair.first).intValue(), (sf10) pair.second, he10Var);
                break;
        }
    }
}
