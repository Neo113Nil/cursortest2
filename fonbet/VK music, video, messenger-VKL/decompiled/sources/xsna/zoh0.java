package xsna;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;

/* compiled from: SearchCountDelegate.kt */
/* loaded from: classes7.dex */
public final class zoh0 extends p1u0<aph0> {

    /* compiled from: SearchCountDelegate.kt */
    public static final class a extends vfz<aph0> {
        public final VkPlaceholder l;

        public a(VkPlaceholder vkPlaceholder) {
            super(vkPlaceholder);
            this.l = (VkPlaceholder) vkPlaceholder.findViewById(R.id.voip_vkapp_calls_search_count);
        }

        @Override // xsna.vfz
        public final void W5(aph0 aph0Var) {
            Resources resources = this.itemView.getContext().getResources();
            aph0Var.getClass();
            this.l.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, oq.d(tlo0.Companion, resources.getQuantityString(R.plurals.voip_vkapp_services_search_count, 0, 0)))));
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends aph0> b(ViewGroup viewGroup) {
        VkPlaceholder vkPlaceholder = new VkPlaceholder(viewGroup.getContext(), null, 6, 0);
        vkPlaceholder.setId(R.id.voip_vkapp_calls_search_count);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = e3m.a(R.dimen.vk_ui_spacing_size2_xl, vkPlaceholder.getContext());
        marginLayoutParams.bottomMargin = e3m.a(R.dimen.vk_ui_spacing_size2_xl, vkPlaceholder.getContext());
        vkPlaceholder.setLayoutParams(marginLayoutParams);
        vkPlaceholder.setWithPaddings(false);
        return new a(vkPlaceholder);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof aph0;
    }
}
