package defpackage;

import com.yandex.go.taxi.summary.router.b;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes14.dex */
public final /* synthetic */ class kv31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ bov0 c;

    public /* synthetic */ kv31(b bVar, bov0 bov0Var, int i) {
        this.a = i;
        this.b = bVar;
        this.c = bov0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bov0 bov0Var = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                SolidSummaryView solidSummaryView = bVar.L;
                if (solidSummaryView != null) {
                    kv31 kv31Var = bVar.M;
                    if (kv31Var != null) {
                        solidSummaryView.removeCallbacks(kv31Var);
                    }
                    kv31 kv31Var2 = new kv31(bVar, bov0Var, 1);
                    bVar.M = kv31Var2;
                    solidSummaryView.postDelayed(kv31Var2, 500L);
                    break;
                }
                break;
            default:
                bVar.I.a(bov0Var);
                break;
        }
    }
}
