package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.app.catalog.SectionTitle;
import com.vk.superapp.api.dto.app.catalog.section.AppCard;
import com.vkontakte.android.R;
import java.util.List;
import xsna.e3m;
import xsna.x7a;

/* compiled from: AppCardViewHolder.kt */
/* loaded from: classes6.dex */
public final class w13 extends e9r0<x7a.d.a> {
    public static final int x = iah0.a(16);
    public final View m;
    public final View n;
    public final View o;
    public final VkImage p;
    public final TextView q;
    public final TextView r;
    public final View s;
    public final VkImage t;
    public final TextView u;
    public final TextView v;
    public final ImageView w;

    public w13(ViewGroup viewGroup, u8r0 u8r0Var) {
        super(R.layout.vk_item_apps_catalog_card, viewGroup);
        this.m = this.itemView.findViewById(R.id.content_frame);
        View findViewById = this.itemView.findViewById(R.id.app_card_click_bounds);
        this.n = findViewById;
        this.o = this.itemView.findViewById(R.id.app_card_background);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.app_card_background);
        this.p = vkImage;
        this.q = (TextView) this.itemView.findViewById(R.id.app_card_title);
        this.r = (TextView) this.itemView.findViewById(R.id.app_card_subtitle);
        this.s = this.itemView.findViewById(R.id.app_card_panel_background);
        VkImage vkImage2 = (VkImage) this.itemView.findViewById(R.id.app_card_app_icon);
        this.t = vkImage2;
        this.u = (TextView) this.itemView.findViewById(R.id.app_card_app_title);
        this.v = (TextView) this.itemView.findViewById(R.id.app_card_app_subtitle);
        this.w = (ImageView) this.itemView.findViewById(R.id.app_card_chevron);
        awt0.o(findViewById, new com.vk.movika.sdk.base.data.a(this, 5));
        jjc.g(findViewById, new bv1(1, u8r0Var, this));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        vkImage.setScaleType(scaleType);
        vkImage.setCornerRadius(12.0f);
        vkImage2.setScaleType(scaleType);
        vkImage2.setCornerRadius(iah0.b(8.0f));
        vkImage2.setPlaceholderImage(R.drawable.vk_default_placeholder_8);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public static GradientDrawable a6(int i, List list) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (!list.isEmpty()) {
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.getClass();
            ?? M = dhr0.M();
            i = ((Number) ((M < 0 || M >= list.size()) ? Integer.valueOf(i) : list.get(M == true ? 1 : 0))).intValue();
        }
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(iah0.a(11));
        return gradientDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v21, types: [boolean] */
    @Override // xsna.v96
    public final void W5(Object obj) {
        int i;
        awt0.x(this.itemView, 0, 0, 0, ((x7a.d.a) obj).b ? 0 : x, 7);
        AppCard.Panel panel = ((x7a.d.a) getItem()).e.g;
        String str = panel != null ? panel.b.b : null;
        if (str == null) {
            str = "";
        }
        AppCard.Panel panel2 = ((x7a.d.a) getItem()).e.g;
        String str2 = panel2 != null ? panel2.c.b : null;
        f4m.i(this.n, str, str2 != null ? str2 : "");
        GradientDrawable a6 = a6(krv0.m(R.attr.vk_ui_icon_medium, this.itemView.getContext()), ((x7a.d.a) getItem()).e.d);
        VkImage vkImage = this.p;
        vkImage.setPlaceholderImage(a6);
        WebImageSize e = ((x7a.d.a) getItem()).e.c.e(vkImage.getWidth());
        vkImage.o0(e != null ? e.b : null, null);
        SectionTitle sectionTitle = ((x7a.d.a) getItem()).e.e;
        String str3 = sectionTitle != null ? sectionTitle.b : null;
        TextView textView = this.q;
        textView.setText(str3);
        SectionTitle sectionTitle2 = ((x7a.d.a) getItem()).e.e;
        textView.setTextColor(b6(sectionTitle2 != null ? sectionTitle2.c : null));
        awt0.v(textView, ((x7a.d.a) getItem()).e.e != null);
        SectionTitle sectionTitle3 = ((x7a.d.a) getItem()).e.f;
        String str4 = sectionTitle3 != null ? sectionTitle3.b : null;
        TextView textView2 = this.r;
        textView2.setText(str4);
        SectionTitle sectionTitle4 = ((x7a.d.a) getItem()).e.f;
        textView2.setTextColor(b6(sectionTitle4 != null ? sectionTitle4.c : null));
        awt0.v(textView2, ((x7a.d.a) getItem()).e.f != null);
        AppCard.Panel panel3 = ((x7a.d.a) getItem()).e.g;
        View view = this.s;
        if (panel3 != null) {
            SectionTitle sectionTitle5 = panel3.c;
            SectionTitle sectionTitle6 = panel3.b;
            List<Integer> list = panel3.d;
            Context context = this.itemView.getContext();
            e3m.a aVar = e3m.a;
            view.setBackground(a6(context.getColor(R.color.vk_black_alpha20), list));
            this.t.o0(((x7a.d.a) getItem()).e.b.b.d.a(278).b, null);
            String str5 = sectionTitle6.b;
            TextView textView3 = this.u;
            textView3.setText(str5);
            textView3.setTextColor(b6(sectionTitle6.c));
            String str6 = sectionTitle5.b;
            TextView textView4 = this.v;
            textView4.setText(str6);
            textView4.setTextColor(b6(sectionTitle5.c));
            List<Integer> list2 = panel3.e;
            int color = this.itemView.getContext().getColor(R.color.vk_black_alpha35);
            if (!list2.isEmpty()) {
                gfx0 gfx0Var = e370.b;
                if (gfx0Var == null) {
                    gfx0Var = null;
                }
                gfx0Var.getClass();
                ?? M = dhr0.M();
                color = ((M < 0 || M >= list2.size()) ? Integer.valueOf(color) : list2.get(M == true ? 1 : 0)).intValue();
            }
            this.w.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
        if (fnj.b(this.itemView.getContext())) {
            boolean z = ((x7a.d.a) getItem()).b;
            awt0.x(this.itemView, 0, iah0.a(z ? 12 : 16), 0, z ? 0 : iah0.a(16), 5);
            int b = m3r0.b(e3m.f(R.attr.vk_ui_background_content, this.itemView.getContext()), ((x7a.d.a) getItem()).e.d);
            float b2 = iah0.b(10.0f);
            View view2 = this.itemView;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = z ? 0.0f : b2;
            float f3 = z ? 0.0f : b2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{b2, b2, b2, b2, f2, f2, f3, f3}, null, null));
            shapeDrawable.getPaint().setColor(b);
            shapeDrawable.setIntrinsicWidth(-1);
            shapeDrawable.setIntrinsicHeight(-1);
            view2.setBackground(shapeDrawable);
            f4m.p(f5j.a, this.m);
            View view3 = this.o;
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            if (bVar != null && bVar.Q != (i = f5j.b)) {
                bVar.Q = i;
                view3.requestLayout();
            }
            AppCard.Panel panel4 = ((x7a.d.a) getItem()).e.g;
            if (panel4 != null) {
                int b3 = m3r0.b(this.itemView.getContext().getColor(R.color.vk_black_alpha20), panel4.d);
                float b4 = iah0.b(11.0f);
                float f4 = z ? 0.0f : b4;
                if (!z) {
                    f = b4;
                }
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{b4, b4, b4, b4, f4, f4, f, f}, null, null));
                shapeDrawable2.getPaint().setColor(b3);
                shapeDrawable2.setIntrinsicWidth(-1);
                shapeDrawable2.setIntrinsicHeight(-1);
                view.setBackground(shapeDrawable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public final int b6(List<Integer> list) {
        int m = krv0.m(R.attr.vk_ui_text_primary, this.itemView.getContext());
        List<Integer> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return m;
        }
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        ?? M = dhr0.M();
        return ((M < 0 || M >= list.size()) ? Integer.valueOf(m) : list.get(M == true ? 1 : 0)).intValue();
    }
}
