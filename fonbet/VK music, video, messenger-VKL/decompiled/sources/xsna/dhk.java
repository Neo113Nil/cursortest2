package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;

/* compiled from: CropFormatAdapter.kt */
/* loaded from: classes4.dex */
public final class dhk extends androidx.recyclerview.widget.x<typ0, nik> {
    public rlh c;

    public dhk() {
        super(nfk.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        nik nikVar = (nik) e0Var;
        typ0 item = getItem(i);
        nikVar.m = item;
        ghk ghkVar = item.a;
        jbo0 jbo0Var = ghkVar.a;
        ToolButton toolButton = nikVar.l;
        String a = jbo0Var.a(toolButton.getContext());
        toolButton.setTitle(a);
        toolButton.setContentDescription(a);
        toolButton.setIcon(ghkVar.b);
        toolButton.setSelected(item.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new nik((ToolButton) tf3.b(viewGroup, R.layout.item_crop, viewGroup, false), new o8(1, this, dhk.class, "onItemClick", "onItemClick(Lcom/vk/photo/editor/features/crop/models/ui/UiCropFormat;)V", 0, 5));
    }
}
