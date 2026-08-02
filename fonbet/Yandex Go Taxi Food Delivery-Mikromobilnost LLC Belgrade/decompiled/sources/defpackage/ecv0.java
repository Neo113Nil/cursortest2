package defpackage;

import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;

/* loaded from: classes6.dex */
public final /* synthetic */ class ecv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fcv0 b;

    public /* synthetic */ ecv0(fcv0 fcv0Var, int i) {
        this.a = i;
        this.b = fcv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        fcv0 fcv0Var = this.b;
        switch (i) {
            case 0:
                SuggestsView.setPerformanceCallback$lambda$0(fcv0Var);
                break;
            default:
                SuggestsView.changeDataSet$lambda$0(fcv0Var);
                break;
        }
    }
}
