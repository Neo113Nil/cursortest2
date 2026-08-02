package xsna;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;

/* compiled from: GoodCommentsHolder.kt */
/* loaded from: classes18.dex */
public final class z010 extends vif0<i010> {
    public final e4u n;
    public final a4u o;
    public final ConstraintLayout p;
    public final LinearLayout q;
    public final VkButton r;
    public final VkGroupHeader s;
    public final VkButton t;

    public z010(ViewGroup viewGroup, e4u e4uVar, boolean z, a4u a4uVar) {
        super(viewGroup, R.layout.good_comments_view_holder, 0);
        this.n = e4uVar;
        this.o = a4uVar;
        this.p = (ConstraintLayout) this.itemView.findViewById(R.id.comments_content);
        this.q = (LinearLayout) this.itemView.findViewById(R.id.product_card_comments_empty_container);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.product_card_comments_empty_write_button);
        this.r = vkButton;
        VkPlaceholder vkPlaceholder = (VkPlaceholder) this.itemView.findViewById(R.id.product_card_comments_empty_placeholder);
        this.s = (VkGroupHeader) this.itemView.findViewById(R.id.product_card_comments_header);
        VkButton vkButton2 = (VkButton) this.itemView.findViewById(R.id.write_comment_btn);
        this.t = vkButton2;
        VkButton vkButton3 = (VkButton) this.itemView.findViewById(R.id.product_card_comments_show_all_reviews_button);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.comments_rv);
        if (z) {
            u11.h(-1, -2, this.itemView);
        }
        bwt0.i0(vkButton2, new g1j(this, 23));
        bwt0.i0(vkButton, new arf(this, 27));
        bwt0.i0(vkButton3, new iie(this, 25));
        recyclerView.setAdapter(a4uVar);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.good_comments_empty_block_description))));
    }

    @Override // xsna.vif0
    public final void i6(i010 i010Var) {
        i010 i010Var2 = i010Var;
        boolean z = i010Var2.f;
        bwt0.p0(this.p, !z);
        bwt0.p0(this.q, z);
        boolean z2 = i010Var2.c;
        bwt0.p0(this.r, z2);
        boolean z3 = i010Var2.b;
        VkGroupHeader vkGroupHeader = this.s;
        bwt0.p0(vkGroupHeader, z3);
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.good_comments_block_title), new com.vk.core.view.components.group.header.c(i010Var2.d, VkCounter.CounterAppearance.Appearance.Neutral, VkCounter.Mode.Tertiary, 8), null, null, 0, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
        if (z) {
            return;
        }
        bwt0.p0(this.t, z2);
        this.o.setItems(i010Var2.e);
    }
}
