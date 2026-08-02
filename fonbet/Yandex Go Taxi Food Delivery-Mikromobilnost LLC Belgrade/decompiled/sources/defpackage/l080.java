package defpackage;

import com.yandex.go.taxi.order.map.overlay.c0;

/* loaded from: classes14.dex */
public final /* synthetic */ class l080 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ l080(c0 c0Var, int i) {
        this.a = i;
        this.b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c0 c0Var = this.b;
        switch (i) {
            case 0:
                c0Var.Sg();
                break;
            case 1:
                c0Var.fh();
                break;
            case 2:
                c0Var.fh();
                break;
            default:
                c0Var.fh();
                break;
        }
    }
}
