package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.markup.view.tools.button.PipetteButton;
import com.vkontakte.android.R;

/* compiled from: MarkupPipetteAdapter.kt */
/* loaded from: classes4.dex */
public final class of10 extends androidx.recyclerview.widget.x<xzp0, rf10> {
    public izs<? super xzp0, s3q0> c;

    public of10() {
        super(pf10.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        rf10 rf10Var = (rf10) e0Var;
        xzp0 item = getItem(i);
        rf10Var.m = item;
        rf10Var.l.setState(item.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new rf10((PipetteButton) tf3.b(viewGroup, R.layout.item_pipette, viewGroup, false), new o99(1, this, of10.class, "onItemClick", "onItemClick(Lcom/vk/photo/editor/markup/view/tools/list/model/UiPipetteState;)V", 0, 6));
    }
}
