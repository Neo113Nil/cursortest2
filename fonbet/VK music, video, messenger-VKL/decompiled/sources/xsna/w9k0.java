package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import java.util.ArrayList;

/* compiled from: SnapOnScrollListener.kt */
/* loaded from: classes17.dex */
public final class w9k0 extends RecyclerView.t {
    public final androidx.recyclerview.widget.w b;
    public final qus c;
    public int d = -1;

    public w9k0(androidx.recyclerview.widget.w wVar, qus qusVar) {
        this.b = wVar;
        this.c = qusVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View findSnapView;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        int i3 = -1;
        if (layoutManager != null && (findSnapView = this.b.findSnapView(layoutManager)) != null) {
            i3 = layoutManager.getPosition(findSnapView);
        }
        if (this.d != i3) {
            qus qusVar = this.c;
            if (qusVar != null) {
                RouletteView rouletteView = (RouletteView) qusVar.b;
                ArrayList arrayList = rouletteView.d;
                int x = rouletteView.h.x();
                j9x it = new k9x(x + 1, x + 6, 1).iterator();
                while (it.d) {
                    int nextInt = it.nextInt();
                    nng0 presenter = rouletteView.getPresenter();
                    StickerStockItem f2 = presenter != null ? presenter.f2(nextInt) : null;
                    if (f2 != null) {
                        int i4 = f2.b;
                        if (!arrayList.contains(Integer.valueOf(i4))) {
                            rouletteView.h(f2);
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                }
                nng0 presenter2 = rouletteView.getPresenter();
                if (presenter2 != null && System.currentTimeMillis() >= 100) {
                    if (!rouletteView.f) {
                        jng0 jng0Var = rouletteView.e;
                        float O5 = presenter2.O5();
                        if (!jng0Var.b.get()) {
                            jng0Var.f.postDelayed(new ing0(O5, jng0Var), 50L);
                        }
                    }
                    vvr0.b(50, 30L);
                }
            }
            this.d = i3;
        }
    }
}
