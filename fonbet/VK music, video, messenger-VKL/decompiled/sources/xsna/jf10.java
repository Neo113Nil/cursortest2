package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;
import com.vkontakte.android.R;

/* compiled from: MarkupColorsAdapter.kt */
/* loaded from: classes4.dex */
public final class jf10 extends androidx.recyclerview.widget.x<jzp0, if10> {
    public izs<? super jzp0, s3q0> c;

    public jf10() {
        super(gf10.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if10 if10Var = (if10) e0Var;
        jzp0 item = getItem(i);
        if10Var.m = item;
        ColorButton colorButton = if10Var.l;
        colorButton.setCurrentColor(item.a);
        colorButton.setSelected(item.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new if10((ColorButton) tf3.b(viewGroup, R.layout.item_color, viewGroup, false), new uw4(1, this, jf10.class, "onItemClick", "onItemClick(Lcom/vk/photo/editor/markup/view/tools/list/model/UiMarkupColor;)V", 0, 11));
    }
}
