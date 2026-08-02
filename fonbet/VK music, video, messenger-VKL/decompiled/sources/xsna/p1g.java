package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;

/* compiled from: CollageGridsAdapter.kt */
/* loaded from: classes4.dex */
public final class p1g extends androidx.recyclerview.widget.x<b3g, n1g> {
    public cws c;

    public p1g() {
        super(x0g.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        n1g n1gVar = (n1g) e0Var;
        b3g item = getItem(i);
        ToolButton toolButton = n1gVar.l;
        toolButton.setTitle("");
        toolButton.setIcon(item.c);
        toolButton.setSelected(item.e);
        toolButton.setOnClick(new m1g(n1gVar, i, 0));
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(item.b.a(toolButton.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new n1g((ToolButton) tf3.b(viewGroup, R.layout.item_collage, viewGroup, false), new o1g(1, this, p1g.class, "onClick", "onClick(I)V", 0, 0));
    }
}
