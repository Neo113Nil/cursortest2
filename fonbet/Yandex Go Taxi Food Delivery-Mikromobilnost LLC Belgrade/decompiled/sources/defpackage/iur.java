package defpackage;

import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class iur implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mur b;
    public final /* synthetic */ b c;

    public /* synthetic */ iur(mur murVar, b bVar, int i) {
        this.a = i;
        this.b = murVar;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.c;
        mur murVar = this.b;
        switch (i) {
            case 0:
                murVar.f(bVar);
                break;
            default:
                murVar.b(bVar);
                break;
        }
    }
}
