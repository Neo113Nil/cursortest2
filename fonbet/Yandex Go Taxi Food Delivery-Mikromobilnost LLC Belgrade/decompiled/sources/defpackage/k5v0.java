package defpackage;

import ru.yandex.taxi.preorder.suggested.selection.c;

/* loaded from: classes6.dex */
public final /* synthetic */ class k5v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ x9v0 c;

    public /* synthetic */ k5v0(c cVar, x9v0 x9v0Var, int i) {
        this.a = i;
        this.b = cVar;
        this.c = x9v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        x9v0 x9v0Var = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.P.Za(x9v0Var);
                break;
            default:
                cVar.P.W0(x9v0Var);
                break;
        }
    }
}
