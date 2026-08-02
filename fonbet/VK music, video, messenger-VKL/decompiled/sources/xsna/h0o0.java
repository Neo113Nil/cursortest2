package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vkontakte.android.R;

/* compiled from: TagCreateNewHolder.kt */
/* loaded from: classes4.dex */
public final class h0o0 extends vif0<s3q0> {
    public final gzs<s3q0> n;

    public h0o0(ViewGroup viewGroup, gzs<s3q0> gzsVar) {
        super(viewGroup, R.layout.tag_create_new_holder, 0);
        this.n = gzsVar;
        View view = this.itemView;
        VkCellButton vkCellButton = (VkCellButton) view;
        bwt0.i0(view, new xc50(this, 25));
        vkCellButton.setAppearance(Appearance.Accent);
        vkCellButton.setTitle(R.string.fave_tags_create_new_title);
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(s3q0 s3q0Var) {
    }
}
