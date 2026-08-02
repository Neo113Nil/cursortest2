package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: ClipsEditorAspectRatioView.kt */
/* loaded from: classes16.dex */
public final class qwd extends zoj0<qu3, uu3> {
    public final /* synthetic */ rwd e;

    public qwd(rwd rwdVar) {
        this.e = rwdVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        uu3 uu3Var = (uu3) e0Var;
        qu3 qu3Var = (qu3) this.c.c(i);
        uu3Var.o = qu3Var;
        VkImageSimple vkImageSimple = uu3Var.m;
        vkImageSimple.setImageResource(qu3Var.b);
        String str = qu3Var.c;
        vkImageSimple.setContentDescription(str);
        VkText vkText = uu3Var.n;
        vkText.setText(str);
        vkImageSimple.setSelected(qu3Var.d);
        vkText.setSelected(qu3Var.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new uu3((ViewGroup) tf3.b(viewGroup, R.layout.aspect_ratio_button, viewGroup, false), new ug8(this.e, 3));
    }
}
