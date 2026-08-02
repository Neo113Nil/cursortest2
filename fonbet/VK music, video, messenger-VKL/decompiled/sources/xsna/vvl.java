package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;

/* compiled from: DeletedSuggestedPostFooterHolder.kt */
/* loaded from: classes4.dex */
public final class vvl extends rp6<wvl, Post> implements View.OnClickListener {
    public final c1c0 E;
    public final VkButton F;
    public final VkButton G;
    public final VkButton H;

    public vvl(ViewGroup viewGroup, c1c0 c1c0Var) {
        super(R.layout.deleted_suggested_post_footer_holder, viewGroup);
        this.E = c1c0Var;
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.blacklist_button);
        this.F = vkButton;
        VkButton vkButton2 = (VkButton) this.itemView.findViewById(R.id.report_button);
        this.G = vkButton2;
        VkButton vkButton3 = (VkButton) this.itemView.findViewById(R.id.restore_button);
        this.H = vkButton3;
        bwt0.h0(this, vkButton);
        bwt0.h0(this, vkButton2);
        bwt0.h0(this, vkButton3);
    }

    @Override // xsna.rp6
    public final void R6(wvl wvlVar) {
        wvl wvlVar2 = wvlVar;
        this.F.setEnabled(!wvlVar2.i);
        this.G.setEnabled(!wvlVar2.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post post = (Post) q6();
        if (post == null) {
            return;
        }
        boolean f = epx.f(view, this.F);
        c1c0 c1c0Var = this.E;
        if (f) {
            c1c0Var.S(this.itemView.getContext(), post);
        } else if (epx.f(view, this.H)) {
            c1c0Var.D(this.itemView.getContext(), post);
        } else if (epx.f(view, this.G)) {
            c1c0Var.i(this.itemView.getContext(), post);
        }
    }
}
