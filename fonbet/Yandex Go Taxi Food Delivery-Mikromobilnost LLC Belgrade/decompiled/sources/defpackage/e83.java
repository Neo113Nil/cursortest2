package defpackage;

import com.yandex.go.summary.navigation.e;
import com.yandex.go.taxi.summary.verticalsummary.router.d;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes14.dex */
public final /* synthetic */ class e83 implements gzi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e83(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gzi
    public final void execute() {
        rft0 rft0Var;
        int i = this.a;
        ghv0 ghv0Var = ghv0.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gzi gziVar = (gzi) ((AtomicReference) obj).getAndSet(null);
                if (gziVar != null) {
                    gziVar.execute();
                    break;
                }
                break;
            case 1:
                ((qht0) ((rft0) ((e) obj).M.get())).b(ghv0Var);
                break;
            case 2:
                rft0Var = ((SolidSummaryView) obj).sourcePointFragmentNavigator;
                ((qht0) rft0Var).b(ghv0Var);
                break;
            case 3:
                ((rwo0) obj).r(new qu(9));
                break;
            case 4:
                ((yn5) obj).r(new qu(9));
                break;
            case 5:
                ((qht0) ((mkx0) obj).R).b(ghv0Var);
                break;
            default:
                ((qht0) ((d) obj).f0).b(ghv0Var);
                break;
        }
    }
}
