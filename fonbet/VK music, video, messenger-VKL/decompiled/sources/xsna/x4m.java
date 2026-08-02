package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.cell.rich.VkRichCell;

/* compiled from: DetailsTextInfoItem.kt */
/* loaded from: classes5.dex */
public final class x4m extends we6 {
    public final int g;
    public final CharSequence h;
    public final int i = -1006;

    public x4m(int i, CharSequence charSequence) {
        this.g = i;
        this.h = charSequence;
    }

    @Override // xsna.we6
    public final vif0<x4m> a(ViewGroup viewGroup) {
        viewGroup.getContext();
        return new w4m(new VkRichCell(viewGroup.getContext(), null, 6, 0), viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
