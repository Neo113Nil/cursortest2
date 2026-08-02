package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.markup.view.tools.button.FontButton;
import com.vkontakte.android.R;

/* compiled from: MarkupFontAdapter.kt */
/* loaded from: classes4.dex */
public final class kf10 extends androidx.recyclerview.widget.x<kzp0, mf10> {
    public qzl0 c;

    public kf10() {
        super(lf10.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        mf10 mf10Var = (mf10) e0Var;
        kzp0 item = getItem(i);
        mf10Var.m = item;
        FontButton fontButton = mf10Var.l;
        fontButton.setFontInfo(item.a);
        fontButton.setSelected(item.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new mf10((FontButton) tf3.b(viewGroup, R.layout.item_font, viewGroup, false), new vw4(1, this, kf10.class, "onItemClick", "onItemClick(Lcom/vk/photo/editor/markup/view/tools/list/model/UiMarkupFont;)V", 0, 8));
    }
}
