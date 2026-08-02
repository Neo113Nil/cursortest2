package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.op90;

/* compiled from: VoipPastCallPlaceholderViewHolder.kt */
/* loaded from: classes7.dex */
public final class iuw0 extends vfz<op90.c> {
    public final VkPlaceholder l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iuw0(ViewGroup viewGroup) {
        super(r0);
        VkPlaceholder vkPlaceholder = new VkPlaceholder(viewGroup.getContext(), null, 6, 0);
        vkPlaceholder.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.l = (VkPlaceholder) this.itemView;
    }

    @Override // xsna.vfz
    public final void W5(op90.c cVar) {
        this.l.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.voip_past_calls_placeholder_description))));
    }
}
