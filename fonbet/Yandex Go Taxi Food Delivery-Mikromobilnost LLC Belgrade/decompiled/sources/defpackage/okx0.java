package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.preorder.summary.tariffpage.TariffPagerView;

/* loaded from: classes6.dex */
public final /* synthetic */ class okx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TariffPagerView b;

    public /* synthetic */ okx0(TariffPagerView tariffPagerView, int i) {
        this.a = i;
        this.b = tariffPagerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        gfv0 gfv0Var;
        int i = this.a;
        TariffPagerView tariffPagerView = this.b;
        switch (i) {
            case 0:
                TariffPagerView.onAttachedToWindow$lambda$0(tariffPagerView);
                break;
            default:
                recyclerView = tariffPagerView.tariffPager;
                View view = (View) wvr.a(recyclerView).c;
                if (view != null) {
                    gfv0Var = tariffPagerView.listener;
                    gfv0Var.h(view);
                    break;
                }
                break;
        }
    }
}
