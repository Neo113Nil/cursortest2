package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: CaptionHolder.kt */
/* loaded from: classes16.dex */
public final class rr9 extends j2j0<xr9> {
    public final VkText o;

    public rr9(ViewGroup viewGroup) {
        super(viewGroup, R.layout.holder_caption, 0);
        this.o = (VkText) this.itemView.findViewById(R.id.text);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        this.o.setText(g6(((xr9) obj).c));
    }
}
