package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.superapp.api.dto.app.catalog.SectionButton;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import com.vk.superapp.api.dto.app.catalog.SectionTitle;
import com.vkontakte.android.R;
import xsna.x7a;

/* compiled from: HeaderViewHolder.kt */
/* loaded from: classes6.dex */
public abstract class kyu extends e9r0<x7a.b> {
    public final TextView m;
    public final TextView n;

    /* compiled from: HeaderViewHolder.kt */
    public static final class a extends hk {
        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            amVar.u(true);
        }
    }

    /* compiled from: HeaderViewHolder.kt */
    public static final class b extends kyu {
        public final k8r0 o;
        public final VkSimpleButton p;

        public b(ViewGroup viewGroup, u8r0 u8r0Var) {
            super(R.layout.vk_item_apps_catalog_section_header_paginated, viewGroup);
            this.o = u8r0Var;
            VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.apps_section_header_button);
            this.p = vkSimpleButton;
            jjc.g(vkSimpleButton, new bjk(this, 13));
        }

        @Override // xsna.v96
        public final void W5(Object obj) {
            x7a.b bVar = (x7a.b) obj;
            super.b6(bVar);
            SectionHeader sectionHeader = bVar.g;
            SectionButton sectionButton = sectionHeader.d;
            String str = sectionButton != null ? sectionButton.b : null;
            VkSimpleButton vkSimpleButton = this.p;
            vkSimpleButton.setText(str);
            awt0.v(vkSimpleButton, sectionHeader.d != null);
            a6(bVar, this.o);
        }
    }

    /* compiled from: HeaderViewHolder.kt */
    public static final class c extends kyu {
        public final k8r0 o;
        public final VkSimpleButton p;

        public c(ViewGroup viewGroup, u8r0 u8r0Var) {
            super(R.layout.vk_item_apps_catalog_section_header_regular, viewGroup);
            this.o = u8r0Var;
            VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.apps_section_header_button);
            this.p = vkSimpleButton;
            jjc.g(vkSimpleButton, new vfk(this, 14));
        }

        @Override // xsna.v96
        public final void W5(Object obj) {
            x7a.b bVar = (x7a.b) obj;
            super.b6(bVar);
            SectionHeader sectionHeader = bVar.g;
            SectionButton sectionButton = sectionHeader.d;
            String str = sectionButton != null ? sectionButton.b : null;
            VkSimpleButton vkSimpleButton = this.p;
            vkSimpleButton.setText(str);
            awt0.v(vkSimpleButton, sectionHeader.d != null);
            a6(bVar, this.o);
        }
    }

    public kyu(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.m = (TextView) this.itemView.findViewById(R.id.apps_section_header_title);
        this.n = (TextView) this.itemView.findViewById(R.id.apps_section_header_subtitle);
        iut0.q(this.itemView, new a());
    }

    public final void a6(x7a.b bVar, k8r0 k8r0Var) {
        String str = bVar.f;
        boolean f = epx.f(str, "with_updates");
        TextView textView = this.m;
        if (f) {
            s7n0 b2 = bbq.b();
            if (b2 != null) {
                b2.f(textView);
                return;
            }
            return;
        }
        if (epx.f(str, "messenger_apps_with_action")) {
            s7n0 b3 = bbq.b();
            if (b3 != null) {
                b3.a(textView);
            }
            k8r0Var.b();
        }
    }

    public void b6(x7a.b bVar) {
        SectionHeader sectionHeader = bVar.g;
        this.m.setText(sectionHeader.b.b);
        SectionTitle sectionTitle = sectionHeader.c;
        String str = sectionTitle != null ? sectionTitle.b : null;
        TextView textView = this.n;
        textView.setText(str);
        awt0.v(textView, sectionHeader.c != null);
    }
}
