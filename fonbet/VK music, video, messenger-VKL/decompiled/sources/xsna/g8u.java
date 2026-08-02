package xsna;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.market.MarketItemType;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: GoodReviewsComposeHolder.kt */
/* loaded from: classes18.dex */
public final class g8u extends vif0<h8u> {
    public final VkButton A;
    public final VkText B;
    public final i780 n;
    public final a8u o;
    public final gzs<s3q0> p;
    public final Object q;
    public final z7u r;
    public final LinearLayout s;
    public final ComposeView t;
    public final ComposeView u;
    public final ComposeView v;
    public final RecyclerView w;
    public final ComposeView x;
    public final VkPlaceholder y;
    public final LinearLayout z;

    public g8u(ViewGroup viewGroup, i780 i780Var, h780 h780Var, a8u a8uVar, gzs<s3q0> gzsVar, boolean z) {
        super(viewGroup, R.layout.good_reviews_compose_view_holder, 0);
        this.n = i780Var;
        this.o = a8uVar;
        this.p = gzsVar;
        this.q = msy.a(LazyThreadSafetyMode.NONE, new gu0(20));
        this.r = new z7u(h780Var, new x4u(this, 1));
        this.s = (LinearLayout) this.itemView.findViewById(R.id.content_container);
        this.t = (ComposeView) this.itemView.findViewById(R.id.reviews_header);
        this.u = (ComposeView) this.itemView.findViewById(R.id.rating_container_view);
        this.v = (ComposeView) this.itemView.findViewById(R.id.feedback_container_view);
        this.w = (RecyclerView) this.itemView.findViewById(R.id.reviews_recycler_view);
        this.x = (ComposeView) this.itemView.findViewById(R.id.bottom_container_view);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) this.itemView.findViewById(R.id.empty_reviews_admin);
        this.y = vkPlaceholder;
        this.z = (LinearLayout) this.itemView.findViewById(R.id.product_card_reviews_empty_user);
        VkPlaceholder vkPlaceholder2 = (VkPlaceholder) this.itemView.findViewById(R.id.product_card_reviews_empty_placeholder_user);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.product_card_reviews_empty_button_user);
        this.A = vkButton;
        this.B = (VkText) this.itemView.findViewById(R.id.product_card_reviews_empty_hint_user);
        if (z) {
            u11.h(-1, -2, this.itemView);
        }
        bwt0.i0(vkButton, new uoh(this, 21));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.empty_good_review_admin_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.empty_good_review_admin_description))));
        tlo0.f fVar = new tlo0.f(R.string.empty_good_review_admin_faq_btn);
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        VkButton.Mode mode = VkButton.Mode.Link;
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) fVar, (gzs) new b1h(this, 19), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, mode, appearance, false, 284), null, null, null, 8));
        vkPlaceholder2.setWithPaddings(false);
        vkPlaceholder2.setPadding(cn70.b(32), cn70.b(24), cn70.b(32), cn70.b(24));
        vkPlaceholder2.setMiddle(new VkPlaceholder.b(null, new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.good_preview_no_reviews)), 1));
    }

    @Override // xsna.vif0
    public final void i6(h8u h8uVar) {
        h8u h8uVar2 = h8uVar;
        boolean z = h8uVar2.i;
        boolean z2 = h8uVar2.k;
        bwt0.p0(this.s, !z2);
        boolean q6 = q6(h8uVar2);
        VkButton vkButton = this.A;
        if (q6) {
            vkButton.setVisibility(8);
        } else {
            bwt0.p0(vkButton, z);
        }
        VkPlaceholder vkPlaceholder = this.y;
        LinearLayout linearLayout = this.z;
        if (z2) {
            if (h8uVar2.m || h8uVar2.r) {
                bwt0.p0(vkPlaceholder, true);
                bwt0.p0(linearLayout, false);
                return;
            } else {
                bwt0.p0(linearLayout, true);
                bwt0.p0(vkPlaceholder, false);
                bwt0.p0(this.B, z);
                return;
            }
        }
        bwt0.p0(linearLayout, false);
        bwt0.p0(vkPlaceholder, false);
        boolean q62 = q6(h8uVar2);
        List<hfz> list = h8uVar2.j;
        ComposeView composeView = this.t;
        if (q62) {
            composeView.setVisibility(8);
        } else {
            bwt0.p0(composeView, h8uVar2.e);
        }
        composeView.setContent(new jai(-1218950962, new qed(6, this, h8uVar2), true));
        this.u.setContent(new jai(946367422, new au7(2, h8uVar2, this), true));
        boolean q63 = q6(h8uVar2);
        ComposeView composeView2 = this.v;
        if (q63) {
            composeView2.setVisibility(8);
        } else {
            bwt0.p0(composeView2, z);
        }
        composeView2.setContent(new jai(1357684630, new y6c(this, 5), true));
        this.x.setContent(new jai(-554884368, new xf4(6, this, h8uVar2), true));
        boolean z3 = !list.isEmpty();
        RecyclerView recyclerView = this.w;
        bwt0.p0(recyclerView, z3);
        z7u z7uVar = this.r;
        recyclerView.setAdapter(z7uVar);
        z7uVar.setItems(list);
        View view = this.itemView;
        StringBuilder sb = new StringBuilder();
        sb.append(h8uVar2.d);
        sb.append(" ");
        Resources b6 = b6();
        int i = h8uVar2.h;
        sb.append(b6.getQuantityString(R.plurals.reviews_review_count, i, Integer.valueOf(i)));
        sb.append(" ");
        sb.append(b6().getString(R.string.rating_bar_content_accessibility, h8uVar2.f, 5));
        view.setContentDescription(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean q6(h8u h8uVar) {
        return ((Boolean) this.q.getValue()).booleanValue() ? h8uVar.p != null : h8uVar.o == MarketItemType.OZON;
    }
}
