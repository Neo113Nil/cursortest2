package defpackage;

import android.util.Pair;

/* loaded from: classes10.dex */
public final /* synthetic */ class eg10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg10 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ eg10(fg10 fg10Var, Pair pair, int i) {
        this.a = i;
        this.b = fg10Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Pair pair = this.c;
        fg10 fg10Var = this.b;
        switch (i) {
            case 0:
                ((j5h) fg10Var.b.h).onDrmKeysRemoved(((Integer) pair.first).intValue(), (sf10) pair.second);
                break;
            case 1:
                ((j5h) fg10Var.b.h).onDrmKeysRestored(((Integer) pair.first).intValue(), (sf10) pair.second);
                break;
            case 2:
                ((j5h) fg10Var.b.h).onDrmSessionReleased(((Integer) pair.first).intValue(), (sf10) pair.second);
                break;
            default:
                ((j5h) fg10Var.b.h).onDrmKeysLoaded(((Integer) pair.first).intValue(), (sf10) pair.second);
                break;
        }
    }
}
