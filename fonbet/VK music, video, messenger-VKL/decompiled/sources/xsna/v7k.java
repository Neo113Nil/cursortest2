package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vkontakte.android.R;
import xsna.yt1;

/* compiled from: CreateHighlightViewHolder.kt */
/* loaded from: classes3.dex */
public final class v7k extends vif0<Boolean> implements View.OnClickListener {
    public final yt1.a n;
    public final String o;
    public final j6v p;

    public v7k(ViewGroup viewGroup, yt1.a aVar, String str, j6v j6vVar) {
        super(new VkCellButton(viewGroup.getContext(), null, 6), viewGroup);
        this.n = aVar;
        this.o = str;
        this.p = j6vVar;
        VkCellButton vkCellButton = (VkCellButton) this.itemView;
        vkCellButton.setTitle(R.string.highlight_create);
        vkCellButton.a(true, Integer.valueOf(R.drawable.vk_icon_add_outline_28));
        vkCellButton.setIconTint(R.attr.vk_ui_icon_accent);
        vkCellButton.setOnClickListener(this);
        vkCellButton.setContentDescription(g6(R.string.highlight_create));
    }

    @Override // xsna.vif0
    public final void i6(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        boolean z = !booleanValue;
        this.itemView.setEnabled(z);
        this.itemView.setClickable(z);
        this.itemView.setAlpha(booleanValue ? 0.4f : 1.0f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        this.p.d(NarrativePublishEventType.CREATE_NARRATIVE, this.o, null);
        this.n.invoke();
    }
}
