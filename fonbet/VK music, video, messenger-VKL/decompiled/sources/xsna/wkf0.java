package xsna;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.superapp.api.dto.app.catalog.SectionButton;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import com.vk.superapp.api.dto.app.catalog.SectionTitle;
import com.vkontakte.android.R;
import xsna.x7a;

/* compiled from: RedesignHeaderViewHolder.kt */
/* loaded from: classes6.dex */
public final class wkf0 extends e9r0<x7a.b> {
    public final k8r0 m;
    public final VkGroupHeader n;

    public wkf0(ViewGroup viewGroup, u8r0 u8r0Var) {
        super(R.layout.vk_item_apps_catalog_section_header, viewGroup);
        this.m = u8r0Var;
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView;
        this.n = vkGroupHeader;
        vkGroupHeader.setSize(((float) Resources.getSystem().getDisplayMetrics().widthPixels) / Resources.getSystem().getDisplayMetrics().density >= 321.0f ? VkGroupHeader.Size.Large : VkGroupHeader.Size.Medium);
        iut0.q(this.itemView, new dgj(1));
    }

    @Override // xsna.v96
    public final void W5(Object obj) {
        x7a.b bVar = (x7a.b) obj;
        SectionHeader sectionHeader = bVar.g;
        VkGroupHeader.d dVar = new VkGroupHeader.d(sectionHeader.b.b, null, null, null, 0, null, 510);
        VkGroupHeader vkGroupHeader = this.n;
        vkGroupHeader.setTitle(dVar);
        SectionTitle sectionTitle = sectionHeader.c;
        vkGroupHeader.setSubtitle(sectionTitle != null ? new VkGroupHeader.c(sectionTitle.b, null, null, 14) : null);
        SectionButton sectionButton = sectionHeader.d;
        if (sectionButton != null) {
            vkGroupHeader.setRight(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.C0841a(new vx(this, sectionButton, bVar, 6), tq.h(tlo0.Companion, R.string.vk_show_all)), 3));
        }
        String str = bVar.f;
        if (epx.f(str, "with_updates")) {
            s7n0 b = bbq.b();
            if (b != null) {
                b.f(vkGroupHeader);
                return;
            }
            return;
        }
        if (epx.f(str, "messenger_apps_with_action")) {
            s7n0 b2 = bbq.b();
            if (b2 != null) {
                b2.a(vkGroupHeader);
            }
            this.m.b();
        }
    }
}
