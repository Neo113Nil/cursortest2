package xsna;

import android.widget.LinearLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vkontakte.android.R;

/* compiled from: LiveDescriptionViewHolder.kt */
/* loaded from: classes3.dex */
public final class ejz extends vfz<djz> {
    public final VkText l;
    public final VkText m;
    public final VkLinkedText n;

    public ejz(LinearLayout linearLayout) {
        super(linearLayout);
        this.l = (VkText) linearLayout.findViewById(R.id.title_text);
        this.m = (VkText) linearLayout.findViewById(R.id.counter);
        this.n = (VkLinkedText) linearLayout.findViewById(R.id.description);
    }

    @Override // xsna.vfz
    public final void W5(djz djzVar) {
        djz djzVar2 = djzVar;
        int i = djzVar2.e;
        this.l.setText(djzVar2.b);
        CharSequence charSequence = djzVar2.c;
        VkLinkedText vkLinkedText = this.n;
        vkLinkedText.setText(charSequence);
        bwt0.p0(vkLinkedText, myc0.f(charSequence));
        StringBuilder sb = new StringBuilder();
        int i2 = djzVar2.d;
        if (i2 > 0) {
            if (uqm0.g(i2)) {
                sb.append(this.itemView.getContext().getString(R.string.video_views_count_formatted, uqm0.f(i2)));
            } else {
                sb.append(enj.f(R.plurals.video_views, i2, this.itemView.getContext()));
            }
            sb.append(this.itemView.getContext().getString(R.string.live_counters_separator));
        }
        sb.append(this.itemView.getContext().getString(i == 1 ? R.string.live_now_watching_one : R.string.live_now_watching, uqm0.g(i) ? uqm0.f(i) : Integer.valueOf(i)));
        this.m.setText(sb);
    }
}
