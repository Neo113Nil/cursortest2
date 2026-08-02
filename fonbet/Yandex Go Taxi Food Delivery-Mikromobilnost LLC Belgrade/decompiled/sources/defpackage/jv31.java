package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.taxi.summary.router.b;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes14.dex */
public final /* synthetic */ class jv31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SolidSummaryView b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ b w;

    public /* synthetic */ jv31(SolidSummaryView solidSummaryView, Runnable runnable, b bVar, int i) {
        this.a = i;
        this.b = solidSummaryView;
        this.c = runnable;
        this.w = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.w;
        Runnable runnable = this.c;
        SolidSummaryView solidSummaryView = this.b;
        switch (i) {
            case 0:
                solidSummaryView.post(new jv31(solidSummaryView, runnable, bVar, 1));
                break;
            default:
                ViewParent parent = solidSummaryView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(solidSummaryView);
                }
                if (runnable != null) {
                    solidSummaryView.removeCallbacks(runnable);
                }
                if (bVar.M == runnable) {
                    bVar.M = null;
                }
                if (bVar.L == solidSummaryView) {
                    bVar.L = null;
                    break;
                }
                break;
        }
    }
}
