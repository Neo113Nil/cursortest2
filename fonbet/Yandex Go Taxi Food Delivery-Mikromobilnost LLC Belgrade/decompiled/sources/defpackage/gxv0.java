package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.superapp.discovery.map.impl.ui.search.SuperAppDiscoveryMapSearchModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.search.f;

/* loaded from: classes14.dex */
public final class gxv0 extends RecyclerView.g {
    public final /* synthetic */ SuperAppDiscoveryMapSearchModalView a;

    public gxv0(SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView) {
        this.a = superAppDiscoveryMapSearchModalView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView = this.a;
        superAppDiscoveryMapSearchModalView.processRecyclerViewScrollState();
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            f presenter = superAppDiscoveryMapSearchModalView.getPresenter();
            int K1 = ((LinearLayoutManager) layoutManager).K1();
            uxv0 uxv0Var = presenter.C.d;
            rxv0 rxv0Var = uxv0Var instanceof rxv0 ? (rxv0) uxv0Var : null;
            if (rxv0Var != null) {
                rxv0Var.c = K1;
            }
        }
    }
}
