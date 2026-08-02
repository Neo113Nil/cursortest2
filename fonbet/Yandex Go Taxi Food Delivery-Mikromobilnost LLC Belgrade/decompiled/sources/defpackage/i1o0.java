package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;

/* loaded from: classes6.dex */
public final class i1o0 implements zo31 {
    public final ScootersNewControlPanelView a;
    public final RecyclerView b;
    public final RecyclerView c;

    public i1o0(ScootersNewControlPanelView scootersNewControlPanelView, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.a = scootersNewControlPanelView;
        this.b = recyclerView;
        this.c = recyclerView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
