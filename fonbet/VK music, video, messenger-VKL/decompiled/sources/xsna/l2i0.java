package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: SectionsErrorListItem.kt */
/* loaded from: classes5.dex */
public final class l2i0 extends we6 {
    public final com.vk.movika.sdk.base.ui.p g;
    public final int h = -1021;

    /* compiled from: SectionsErrorListItem.kt */
    public static final class a extends vif0<l2i0> {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(l2i0 l2i0Var) {
        }
    }

    public l2i0(com.vk.movika.sdk.base.ui.p pVar) {
        this.g = pVar;
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        VkPlaceholder vkPlaceholder = new VkPlaceholder(viewGroup.getContext(), null, 6, 0);
        vkPlaceholder.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a aVar = new a(vkPlaceholder);
        VkPlaceholder vkPlaceholder2 = (VkPlaceholder) aVar.itemView;
        vkPlaceholder2.setMiddle(new VkPlaceholder.b(null, new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.community_sections_error_description)), 1));
        vkPlaceholder2.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.community_sections_error_retry_button), (gzs) new ajd0(aVar, 3), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, 284), null, null, null, 8));
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return l2i0.class.equals(obj != null ? obj.getClass() : null) && this.h == ((l2i0) obj).h;
    }

    @Override // xsna.we6
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return this.h;
    }
}
