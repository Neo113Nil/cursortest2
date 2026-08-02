package xsna;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.app.catalog.SectionTitle;
import com.vk.superapp.api.dto.app.catalog.section.AppCard;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.x7a;

/* compiled from: HorizontalAppCardsHolder.kt */
/* loaded from: classes6.dex */
public final class lcv extends e9r0<x7a.d.c.a> {
    public static final int n = iah0.a(12);
    public static final int o = iah0.a(16);
    public static final int p = iah0.a(28);
    public final b m;

    /* compiled from: HorizontalAppCardsHolder.kt */
    public static final class a extends RecyclerView.e0 {
        public final View l;
        public final VkImage m;
        public final VkImage n;
        public final VkText o;
        public final VkText p;
        public AppCard q;

        public a(View view, c23 c23Var) {
            super(view);
            View findViewById = this.itemView.findViewById(R.id.app_card_click_bounds);
            this.l = findViewById;
            this.m = (VkImage) this.itemView.findViewById(R.id.card_background);
            VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.card_app_icon);
            this.n = vkImage;
            this.o = (VkText) this.itemView.findViewById(R.id.card_app_title);
            this.p = (VkText) this.itemView.findViewById(R.id.card_app_subtitle);
            awt0.o(view, new kcv(view, 0));
            vkImage.setRound(true);
            jjc.g(findViewById, new com.vk.movika.sdk.base.logic.processor.d(18, c23Var, this));
        }
    }

    /* compiled from: HorizontalAppCardsHolder.kt */
    public static final class b extends RecyclerView.Adapter<a> {
        public final c23 c;
        public List<AppCard> d = EmptyList.b;

        public b(c23 c23Var) {
            this.c = c23Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.d.size();
        }

        /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            Integer num;
            Integer num2;
            a aVar2 = aVar;
            AppCard appCard = this.d.get(i);
            VkText vkText = aVar2.o;
            VkImage vkImage = aVar2.n;
            VkImage vkImage2 = aVar2.m;
            VkText vkText2 = aVar2.p;
            SectionTitle sectionTitle = appCard.f;
            aVar2.q = appCard;
            View view = aVar2.itemView;
            SectionTitle sectionTitle2 = appCard.e;
            String str = sectionTitle2 != null ? sectionTitle2.b : null;
            if (str == null) {
                str = "";
            }
            String str2 = sectionTitle != null ? sectionTitle.b : null;
            f4m.i(view, str, str2 != null ? str2 : "");
            WebImageSize e = appCard.c.e(vkImage2.getWidth());
            vkImage2.o0(e != null ? e.b : null, null);
            GradientDrawable gradientDrawable = new GradientDrawable();
            List<Integer> list = appCard.d;
            int m = krv0.m(R.attr.vk_ui_icon_medium, aVar2.itemView.getContext());
            if (!list.isEmpty()) {
                gfx0 gfx0Var = e370.b;
                if (gfx0Var == null) {
                    gfx0Var = null;
                }
                gfx0Var.getClass();
                ?? M = dhr0.M();
                m = ((M < 0 || M >= list.size()) ? Integer.valueOf(m) : list.get(M == true ? 1 : 0)).intValue();
            }
            gradientDrawable.setColor(m);
            vkImage2.setPlaceholderImage(gradientDrawable);
            WebImageSize f = appCard.b.b.d.b.f(lcv.p);
            vkImage.o0(f != null ? f.b : null, null);
            vkImage.setPlaceholderImage(new enk0(krv0.m(R.attr.vk_ui_icon_medium, aVar2.itemView.getContext())));
            vkText.setText(sectionTitle2 != null ? sectionTitle2.b : null);
            List<Integer> list2 = sectionTitle2 != null ? sectionTitle2.c : null;
            vkText.setTextColor((list2 == null || (num2 = (Integer) j5g.a0(list2)) == null) ? krv0.m(R.attr.vk_ui_text_primary, aVar2.itemView.getContext()) : num2.intValue());
            vkText2.setText(sectionTitle != null ? sectionTitle.b : null);
            List<Integer> list3 = sectionTitle != null ? sectionTitle.c : null;
            vkText2.setTextColor((list3 == null || (num = (Integer) j5g.a0(list3)) == null) ? krv0.m(R.attr.vk_ui_text_primary, aVar2.itemView.getContext()) : num.intValue());
            awt0.v(vkText2, sectionTitle != null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(tf3.b(viewGroup, R.layout.vk_item_apps_catalog_horizontal_app_cards_item, viewGroup, false), this.c);
        }
    }

    public lcv(ViewGroup viewGroup, u8r0 u8r0Var) {
        super(R.layout.vk_item_apps_catalog_recycler, viewGroup);
        b bVar = new b(u8r0Var);
        this.m = bVar;
        RecyclerView recyclerView = (RecyclerView) this.itemView;
        int a2 = e3m.a(R.dimen.vk_app_catalog_content_horizontal_padding, recyclerView.getContext());
        awt0.x(recyclerView, a2, 0, a2, 0, 10);
        recyclerView.setClipToPadding(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        dhk0 dhk0Var = new dhk0(0, 0, n, 0);
        dhk0Var.h = true;
        dhk0Var.i = false;
        recyclerView.addItemDecoration(dhk0Var);
        recyclerView.setAdapter(bVar);
    }

    @Override // xsna.v96
    public final void W5(Object obj) {
        x7a.d.c.a aVar = (x7a.d.c.a) obj;
        List<AppCard> list = aVar.f;
        awt0.x(this.itemView, 0, 0, 0, aVar.b ? 0 : o, 7);
        b bVar = this.m;
        if (epx.f(bVar.d, list)) {
            return;
        }
        bVar.d = list;
        bVar.notifyDataSetChanged();
    }
}
