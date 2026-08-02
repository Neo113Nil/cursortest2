package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;

/* compiled from: HashtagHintsAdapter.kt */
/* loaded from: classes6.dex */
public final class gvu extends zoj0<String, RecyclerView.e0> {
    public wzs<? super String, ? super Integer, s3q0> e;

    /* compiled from: HashtagHintsAdapter.kt */
    public final class a extends vif0<String> {
        public final VkButton n;

        public a(gvu gvuVar, ViewGroup viewGroup) {
            super(viewGroup, R.layout.hashtag_hints_item_vh, 0);
            VkButton vkButton = (VkButton) this.itemView;
            this.n = vkButton;
            wh4 wh4Var = new wh4(4, gvuVar, this);
            bpn0 bpn0Var = jjc.a;
            q01 q01Var = new q01(wh4Var, 2);
            vkButton.setTextTint(R.attr.vk_ui_text_contrast);
            vkButton.setBackgroundTint(R.attr.vk_ui_background_contrast_inverse);
            vkButton.setIconTint(R.attr.vk_ui_text_contrast);
            vkButton.setOnClickListener(q01Var);
        }

        @Override // xsna.vif0
        public final void i6(String str) {
            String str2 = str;
            if (str2 != null) {
                ucp ucpVar = ucp.a;
                this.n.setText(ucp.i(str2));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof a) {
            ((a) e0Var).V5(this.c.c(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this, viewGroup);
    }
}
