package xsna;

import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: VhSyncContacts.kt */
/* loaded from: classes2.dex */
public final class ovr0 extends vfz<gon0> {
    public static final /* synthetic */ int n = 0;
    public final mkr0 l;
    public final VkPlaceholder m;

    public ovr0(View view, mkr0 mkr0Var) {
        super(view);
        this.l = mkr0Var;
        this.m = (VkPlaceholder) view.getRootView();
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(gon0 gon0Var) {
        VkPlaceholder.b bVar = new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.vkim_search_sync_contacts_title_no_in_global_search)));
        VkPlaceholder vkPlaceholder = this.m;
        vkPlaceholder.setMiddle(bVar);
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vkim_search_sync_contacts_button), (gzs) new yei0(this, 14), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, 284), null, null, null, 8));
    }
}
