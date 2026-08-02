package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.a;

/* loaded from: classes14.dex */
public final class ic31 extends RecyclerView.g {
    public final /* synthetic */ VerticalHubV1ModalView a;

    public ic31(VerticalHubV1ModalView verticalHubV1ModalView) {
        this.a = verticalHubV1ModalView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        a aVar;
        aVar = this.a.shownItemsDelegate;
        aVar.a(recyclerView);
    }
}
