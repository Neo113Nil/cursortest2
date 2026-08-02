package xsna;

import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: NoContactsRedesignVh.kt */
/* loaded from: classes2.dex */
public final class n270 extends vfz<b770> {
    public final lfp l;

    public n270(View view, lfp lfpVar) {
        super(view);
        this.l = lfpVar;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(b770 b770Var) {
        VkPlaceholder vkPlaceholder = (VkPlaceholder) this.itemView.findViewById(R.id.vkim_empty);
        vkPlaceholder.setMode(VkPlaceholder.Mode.Primary);
        vkPlaceholder.setWithPaddings(true);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.vkim_msg_search_empty_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.vkim_msg_search_empty_desc))));
        VkPlaceholder.a.C0857a.C0858a c0858a = null;
        VkPlaceholder.a.C0857a.C0858a c0858a2 = null;
        VkPlaceholder.a.C0857a c0857a = null;
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vkim_msg_search_empty_btn_text), (gzs) new m1y(this, 18), c0858a, c0858a2, VkButton.Size.Small, VkButton.Mode.Secondary, VkButton.Appearance.Accent, false, 284), c0857a, c0857a, null, 8));
    }
}
