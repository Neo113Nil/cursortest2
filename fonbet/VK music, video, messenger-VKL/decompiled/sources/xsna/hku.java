package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;

/* compiled from: GroupHeaderDelegate.kt */
/* loaded from: classes7.dex */
public final class hku extends p1u0<jku> {

    /* compiled from: GroupHeaderDelegate.kt */
    public static final class a extends vfz<jku> {
        public final VkGroupHeader l;

        public a(VkGroupHeader vkGroupHeader) {
            super(vkGroupHeader);
            this.l = (VkGroupHeader) vkGroupHeader.findViewById(R.id.voip_vkapp_calls_header);
        }

        @Override // xsna.vfz
        public final void W5(jku jkuVar) {
            jku jkuVar2 = jkuVar;
            VkGroupHeader.d dVar = new VkGroupHeader.d(jkuVar2.b, null, null, null, 0, 510);
            VkGroupHeader vkGroupHeader = this.l;
            vkGroupHeader.setTitle(dVar);
            vkGroupHeader.setSubtitle(null);
            vkGroupHeader.setSize(jkuVar2.c);
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends jku> b(ViewGroup viewGroup) {
        VkGroupHeader vkGroupHeader = new VkGroupHeader(viewGroup.getContext(), null, 6);
        vkGroupHeader.setId(R.id.voip_vkapp_calls_header);
        vkGroupHeader.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, vkGroupHeader.getContext()));
        return new a(vkGroupHeader);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof jku;
    }
}
